package org.telegram.ui.Components.conference.message;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.components.Component;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.messenger.voip.GroupCallMessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Adapters.DialogsSearchAdapter;
import org.telegram.ui.Adapters.FiltersView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;

public final class GroupCallMessagesListView extends RecyclerView {
    public final AnonymousClass3 adapter;
    public View blurRoot;
    public GroupCallMessageCell.Delegate cellDelegate;
    public int clipBottom;
    public int clipTop;
    public Delegate delegate;
    public final Paint maskPaint;
    public RenderNode renderNode;
    public float renderNodeScale;
    public int visibleHeight;

    public interface Delegate {
        void showReaction(GroupCallMessageCell groupCallMessageCell, ReactionsLayoutInBubble.VisibleReaction visibleReaction);
    }

    public GroupCallMessagesListView(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.maskPaint = paint;
        this.clipTop = Integer.MIN_VALUE;
        this.clipBottom = Integer.MIN_VALUE;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(16.0f), 0, -16777216, Shader.TileMode.CLAMP));
        setLayoutManager(new DialogsSearchAdapter.AnonymousClass5(1, 2, true));
        addItemDecoration(new FiltersView.AnonymousClass2(1));
        ?? r12 = new GroupCallMessagesAdapter() {
            {
                this.currentAccount = -1;
            }

            @Override
            public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                GroupCallMessageCell groupCallMessageCell = new GroupCallMessageCell(viewGroup.getContext());
                groupCallMessageCell.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                GroupCallMessageCell.VH vh = new GroupCallMessageCell.VH(groupCallMessageCell);
                GroupCallMessagesListView groupCallMessagesListView = GroupCallMessagesListView.this;
                View view = groupCallMessagesListView.blurRoot;
                RenderNode renderNode = groupCallMessagesListView.renderNode;
                float f = groupCallMessagesListView.renderNodeScale;
                GroupCallMessageCell groupCallMessageCell2 = vh.cell;
                groupCallMessageCell2.blurRoot = view;
                groupCallMessageCell2.renderNode = renderNode;
                groupCallMessageCell2.renderNodeScale = f;
                groupCallMessageCell2.setDelegate(groupCallMessagesListView.cellDelegate);
                return vh;
            }
        };
        this.adapter = r12;
        setAdapter(r12);
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator() {
            @Override
            public final float animateByScale(View view) {
                return 0.6f;
            }

            @Override
            public final void onAddFinished(RecyclerView.ViewHolder viewHolder) {
                ReactionsLayoutInBubble.VisibleReaction visibleReaction;
                Delegate delegate;
                super.onAddFinished(viewHolder);
                GroupCallMessagesListView groupCallMessagesListView = GroupCallMessagesListView.this;
                AnonymousClass3 anonymousClass3 = groupCallMessagesListView.adapter;
                int adapterPosition = viewHolder.getAdapterPosition();
                List list = anonymousClass3.messages;
                GroupCallMessage groupCallMessage = (list != null && adapterPosition >= 0 && adapterPosition < list.size()) ? (GroupCallMessage) anonymousClass3.messages.get(adapterPosition) : null;
                if (groupCallMessage == null || (visibleReaction = groupCallMessage.visibleReaction) == null) {
                    return;
                }
                View view = viewHolder.itemView;
                if (!(view instanceof GroupCallMessageCell) || (delegate = groupCallMessagesListView.delegate) == null) {
                    return;
                }
                delegate.showReaction((GroupCallMessageCell) view, visibleReaction);
            }
        };
        defaultItemAnimator.setSupportsChangeAnimations(false);
        defaultItemAnimator.setDelayAnimations(false);
        defaultItemAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        defaultItemAnimator.setDurations(320L);
        lambda$onCellEnter$52(defaultItemAnimator);
    }

    private float getMinChildY() {
        int childCount = getChildCount();
        float fMin = 2.1474836E9f;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0) {
                fMin = Math.min(fMin, childAt.getY());
            }
        }
        return fMin;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int measuredHeight = getMeasuredHeight() - this.visibleHeight;
        int iDp = AndroidUtilities.dp(16.0f);
        int i = measuredHeight + iDp;
        int measuredHeight2 = getMeasuredHeight();
        int measuredWidth = getMeasuredWidth();
        float f = i;
        if (f < getMinChildY()) {
            super.dispatchDraw(canvas);
            return;
        }
        float f2 = measuredHeight;
        float f3 = measuredWidth;
        int iSaveLayer = canvas.saveLayer(0.0f, f2, f3, f, null);
        canvas.clipRect(0, measuredHeight, measuredWidth, i);
        this.clipTop = measuredHeight;
        this.clipBottom = i;
        super.dispatchDraw(canvas);
        canvas.translate(0.0f, f2);
        canvas.drawRect(0.0f, 0.0f, f3, iDp, this.maskPaint);
        canvas.restoreToCount(iSaveLayer);
        canvas.save();
        canvas.clipRect(0, i, measuredWidth, measuredHeight2);
        this.clipTop = i;
        this.clipBottom = getMeasuredHeight();
        super.dispatchDraw(canvas);
        canvas.restore();
        this.clipTop = Integer.MIN_VALUE;
        this.clipBottom = Integer.MIN_VALUE;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (motionEvent.getAction() == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (y < getMeasuredHeight() - this.visibleHeight) {
                return false;
            }
            int childCount = getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    z = false;
                    break;
                }
                View childAt = getChildAt(i);
                if (childAt instanceof GroupCallMessageCell) {
                    GroupCallMessageCell groupCallMessageCell = (GroupCallMessageCell) childAt;
                    if (groupCallMessageCell.getVisibility() == 0) {
                        float x2 = x - childAt.getX();
                        float y2 = y - childAt.getY();
                        Component.Builder builder = groupCallMessageCell.layout;
                        if (builder == null ? false : ((RectF) builder.name).contains(x2, y2)) {
                            z = true;
                            break;
                        }
                    } else {
                        continue;
                    }
                }
                i++;
            }
            if (!z) {
                return false;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (this.clipTop != Integer.MIN_VALUE && view.getY() + view.getHeight() < this.clipTop) {
            return true;
        }
        if (this.clipBottom == Integer.MIN_VALUE || view.getY() <= this.clipBottom) {
            return super.drawChild(canvas, view, j);
        }
        return true;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AnonymousClass3 anonymousClass3 = this.adapter;
        anonymousClass3.isAttachedToRecyclerView = true;
        int i = anonymousClass3.currentAccount;
        if (i == -1 || anonymousClass3.inputGroupCall == null) {
            return;
        }
        anonymousClass3.messages = GroupCallMessagesController.getInstance(i).getCallMessages(anonymousClass3.inputGroupCall.id);
        anonymousClass3.notifyDataSetChanged();
        GroupCallMessagesController.getInstance(anonymousClass3.currentAccount).subscribeToCallMessages(anonymousClass3.inputGroupCall.id, anonymousClass3);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnonymousClass3 anonymousClass3 = this.adapter;
        anonymousClass3.isAttachedToRecyclerView = false;
        int i = anonymousClass3.currentAccount;
        if (i == -1 || anonymousClass3.inputGroupCall == null) {
            return;
        }
        GroupCallMessagesController.getInstance(i).unsubscribeFromCallMessages(anonymousClass3.inputGroupCall.id, anonymousClass3);
    }

    public void setBlurRoot(View view) {
        this.blurRoot = view;
    }

    public void setClickCellDelegate(GroupCallMessageCell.Delegate delegate) {
        this.cellDelegate = delegate;
    }

    public void setDelegate(Delegate delegate) {
        this.delegate = delegate;
    }

    public final void setGroupCall(int i, TLRPC.InputGroupCall inputGroupCall) {
        int i2;
        AnonymousClass3 anonymousClass3 = this.adapter;
        if (anonymousClass3.isAttachedToRecyclerView && (i2 = anonymousClass3.currentAccount) != -1 && anonymousClass3.inputGroupCall != null) {
            GroupCallMessagesController.getInstance(i2).unsubscribeFromCallMessages(anonymousClass3.inputGroupCall.id, anonymousClass3);
        }
        anonymousClass3.currentAccount = i;
        anonymousClass3.inputGroupCall = inputGroupCall;
        if (anonymousClass3.isAttachedToRecyclerView) {
            anonymousClass3.messages = GroupCallMessagesController.getInstance(i).getCallMessages(anonymousClass3.inputGroupCall.id);
            anonymousClass3.notifyDataSetChanged();
            GroupCallMessagesController.getInstance(i).subscribeToCallMessages(anonymousClass3.inputGroupCall.id, anonymousClass3);
        }
    }

    @Override
    public void setTranslationY(float f) {
        if (getTranslationY() != f) {
            super.setTranslationY(f);
            invalidate();
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                getChildAt(i).invalidate();
            }
        }
    }

    public void setVisibleHeight(int i) {
        if (this.visibleHeight != i) {
            this.visibleHeight = i;
            invalidate();
        }
    }
}
