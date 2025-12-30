package org.telegram.ui.Components.conference.message;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;
import org.telegram.ui.Components.conference.message.GroupCallMessageCell;

public class GroupCallMessagesListView extends RecyclerView {
    private final GroupCallMessagesAdapter adapter;
    private View blurRoot;
    private GroupCallMessageCell.Delegate cellDelegate;
    private int clipBottom;
    private int clipTop;
    private Delegate delegate;
    private final Paint maskPaint;
    private RenderNode renderNode;
    private float renderNodeScale;
    private int visibleHeight;

    public interface Delegate {
        void showReaction(GroupCallMessageCell groupCallMessageCell, ReactionsLayoutInBubble.VisibleReaction visibleReaction);
    }

    public GroupCallMessagesListView(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.maskPaint = paint;
        this.clipTop = Integer.MIN_VALUE;
        this.clipBottom = Integer.MIN_VALUE;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(16.0f), 0, -16777216, Shader.TileMode.CLAMP));
        setLayoutManager(new LinearLayoutManager(context, 1, 1 == true ? 1 : 0) {
            @Override
            public boolean canScrollVertically() {
                return false;
            }
        });
        addItemDecoration(new RecyclerView.ItemDecoration() {
            @Override
            public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
                rect.top = AndroidUtilities.dp(6.0f);
            }
        });
        GroupCallMessagesAdapter groupCallMessagesAdapter = new GroupCallMessagesAdapter() {
            @Override
            public GroupCallMessageCell.VH onCreateViewHolder(ViewGroup viewGroup, int i) {
                GroupCallMessageCell.VH vhOnCreateViewHolder = super.onCreateViewHolder(viewGroup, i);
                vhOnCreateViewHolder.cell.setRenderNode(GroupCallMessagesListView.this.blurRoot, GroupCallMessagesListView.this.renderNode, GroupCallMessagesListView.this.renderNodeScale);
                vhOnCreateViewHolder.cell.setDelegate(GroupCallMessagesListView.this.cellDelegate);
                return vhOnCreateViewHolder;
            }
        };
        this.adapter = groupCallMessagesAdapter;
        setAdapter(groupCallMessagesAdapter);
        setItemAnimator(createItemAnimator());
    }

    private DefaultItemAnimator createItemAnimator() {
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator() {
            @Override
            protected float animateByScale(View view) {
                return 0.6f;
            }

            @Override
            public void onAddFinished(RecyclerView.ViewHolder viewHolder) {
                super.onAddFinished(viewHolder);
                GroupCallMessage message = GroupCallMessagesListView.this.adapter.getMessage(viewHolder.getAdapterPosition());
                if (message == null || message.visibleReaction == null || !(viewHolder.itemView instanceof GroupCallMessageCell) || GroupCallMessagesListView.this.delegate == null) {
                    return;
                }
                GroupCallMessagesListView.this.delegate.showReaction((GroupCallMessageCell) viewHolder.itemView, message.visibleReaction);
            }
        };
        defaultItemAnimator.setSupportsChangeAnimations(false);
        defaultItemAnimator.setDelayAnimations(false);
        defaultItemAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        defaultItemAnimator.setDurations(320L);
        return defaultItemAnimator;
    }

    public void setVisibleHeight(int i) {
        if (this.visibleHeight != i) {
            this.visibleHeight = i;
            invalidate();
        }
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
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
    public boolean drawChild(Canvas canvas, View view, long j) {
        if (this.clipTop != Integer.MIN_VALUE && view.getY() + view.getHeight() < this.clipTop) {
            return true;
        }
        if (this.clipBottom == Integer.MIN_VALUE || view.getY() <= this.clipBottom) {
            return super.drawChild(canvas, view, j);
        }
        return true;
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

    public void setRenderNode(RenderNode renderNode, float f) {
        this.renderNode = renderNode;
        this.renderNodeScale = f;
    }

    public void setBlurRoot(View view) {
        this.blurRoot = view;
    }

    public void setDelegate(Delegate delegate) {
        this.delegate = delegate;
    }

    public void setClickCellDelegate(GroupCallMessageCell.Delegate delegate) {
        this.cellDelegate = delegate;
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

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (y < getMeasuredHeight() - this.visibleHeight) {
                return false;
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                if (childAt instanceof GroupCallMessageCell) {
                    GroupCallMessageCell groupCallMessageCell = (GroupCallMessageCell) childAt;
                    if (groupCallMessageCell.getVisibility() != 0 || !groupCallMessageCell.isInsideBubble(x - childAt.getX(), y - childAt.getY())) {
                    }
                }
            }
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void setGroupCall(int i, TLRPC.InputGroupCall inputGroupCall) {
        this.adapter.setGroupCall(i, inputGroupCall);
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.adapter.attach();
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.adapter.detach();
    }
}
