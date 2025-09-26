package org.telegram.ui.Components.conference.message;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RenderNode;
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
    private Delegate delegate;
    private RenderNode renderNode;
    private float renderNodeScale;

    public interface Delegate {
        void showReaction(GroupCallMessageCell groupCallMessageCell, ReactionsLayoutInBubble.VisibleReaction visibleReaction);
    }

    public GroupCallMessagesListView(Context context) {
        super(context);
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
                GroupCallMessageCell.VH onCreateViewHolder = super.onCreateViewHolder(viewGroup, i);
                onCreateViewHolder.cell.setRenderNode(GroupCallMessagesListView.this.blurRoot, GroupCallMessagesListView.this.renderNode, GroupCallMessagesListView.this.renderNodeScale);
                onCreateViewHolder.cell.setDelegate(GroupCallMessagesListView.this.cellDelegate);
                return onCreateViewHolder;
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
        super.setTranslationY(f);
        invalidate();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).invalidate();
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                if (childAt instanceof GroupCallMessageCell) {
                    GroupCallMessageCell groupCallMessageCell = (GroupCallMessageCell) childAt;
                    if (groupCallMessageCell.getVisibility() == 0 && groupCallMessageCell.isInsideBubble(x - childAt.getX(), y - childAt.getY())) {
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
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.adapter.attach();
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.adapter.detach();
    }
}
