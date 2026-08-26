package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.os.Message;
import android.util.SparseArray;
import android.view.View;
import androidx.activity.ComponentDialog$$ExternalSyntheticLambda1;
import androidx.concurrent.futures.CallbackToFutureAdapter$SafeFuture;
import androidx.core.util.Pair;
import androidx.mediarouter.media.GlobalMediaRouter;
import androidx.mediarouter.media.MediaRouteProvider$RouteController;
import androidx.mediarouter.media.MediaRouter;
import androidx.recyclerview.widget.AdapterHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.mlkit_vision_label.zzdd;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.Cells.IMessageCell;
import org.telegram.ui.ChatActivity;

public class RecyclerAnimationScrollHelper {
    public final int $r8$classId;
    public Object animationCallback;
    public Object animator;
    public boolean forceUseStableId;
    public boolean isDialogs;
    public final Object layoutManager;
    public Object oldStableIds;
    public final Object positionToOldView;
    public final Object recyclerView;
    public int scrollDirection;
    public Object scrollListener;

    public final class AnonymousClass1 implements View.OnLayoutChangeListener {
        public final RecyclerView.Adapter val$adapter;
        public final AnimatableAdapter val$finalAnimatableAdapter;
        public final ArrayList val$oldViews;
        public final boolean val$scrollDown;

        public AnonymousClass1(RecyclerView.Adapter adapter, ArrayList arrayList, boolean z, AnimatableAdapter animatableAdapter) {
            this.val$adapter = adapter;
            this.val$oldViews = arrayList;
            this.val$scrollDown = z;
            this.val$finalAnimatableAdapter = animatableAdapter;
        }

        @Override
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            final ArrayList arrayList;
            HashMap map;
            int height;
            long jMin;
            View view2;
            boolean z = true;
            RecyclerAnimationScrollHelper recyclerAnimationScrollHelper = RecyclerAnimationScrollHelper.this;
            RecyclerListView recyclerListView = (RecyclerListView) recyclerAnimationScrollHelper.recyclerView;
            recyclerListView.removeOnLayoutChangeListener(this);
            final ArrayList arrayList2 = new ArrayList();
            recyclerListView.stopScroll();
            int childCount = recyclerListView.getChildCount();
            int i9 = 0;
            int top = 0;
            int bottom = 0;
            int i10 = 0;
            boolean z2 = false;
            while (true) {
                arrayList = this.val$oldViews;
                map = (HashMap) recyclerAnimationScrollHelper.oldStableIds;
                if (i9 >= childCount) {
                    break;
                }
                View childAt = recyclerListView.getChildAt(i9);
                arrayList2.add(childAt);
                if (childAt.getTop() < top) {
                    top = childAt.getTop();
                }
                if (childAt.getBottom() > bottom) {
                    bottom = childAt.getBottom();
                }
                if (childAt instanceof IMessageCell) {
                    ((IMessageCell) childAt).setAnimationRunning(z, false);
                }
                RecyclerView.Adapter adapter = this.val$adapter;
                if (adapter != null && (adapter.mHasStableIds || recyclerAnimationScrollHelper.forceUseStableId)) {
                    recyclerListView.getClass();
                    long itemId = adapter.getItemId(RecyclerView.getChildAdapterPosition(childAt));
                    if (map.containsKey(Long.valueOf(itemId)) && (view2 = (View) map.get(Long.valueOf(itemId))) != 0) {
                        if (view2 instanceof IMessageCell) {
                            ((IMessageCell) view2).setAnimationRunning(false, false);
                        }
                        arrayList.remove(view2);
                        zzdd zzddVar = (zzdd) recyclerAnimationScrollHelper.animationCallback;
                        if (zzddVar != null) {
                            zzddVar.recycleView(view2);
                        }
                        int top2 = childAt.getTop() - view2.getTop();
                        if (top2 != 0) {
                            i10 = top2;
                        }
                        z2 = true;
                    }
                }
                i9++;
                z = true;
            }
            map.clear();
            int size = arrayList.size();
            int i11 = 0;
            int i12 = Integer.MAX_VALUE;
            int height2 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                View view3 = (View) obj;
                int bottom2 = view3.getBottom();
                int top3 = view3.getTop();
                if (bottom2 > height2) {
                    height2 = bottom2;
                }
                if (top3 < i12) {
                    i12 = top3;
                }
                if (view3.getParent() == null) {
                    recyclerListView.addView(view3);
                    ((LinearLayoutManager) recyclerAnimationScrollHelper.layoutManager).ignoreView(view3);
                    zzdd zzddVar2 = (zzdd) recyclerAnimationScrollHelper.animationCallback;
                    if (zzddVar2 != null) {
                        zzddVar2.ignoreView(view3);
                    }
                }
                if (view3 instanceof IMessageCell) {
                    ((IMessageCell) view3).setAnimationRunning(true, true);
                }
            }
            if (i12 == Integer.MAX_VALUE) {
                i12 = 0;
            }
            zzdd zzddVar3 = (zzdd) recyclerAnimationScrollHelper.animationCallback;
            if (zzddVar3 != null) {
                zzddVar3.onPreAnimation();
            }
            if (arrayList.isEmpty()) {
                height = Math.abs(i10);
            } else {
                boolean z3 = this.val$scrollDown;
                if (!z3) {
                    height2 = recyclerListView.getHeight() - i12;
                }
                height = (z3 ? -top : bottom - recyclerListView.getHeight()) + height2;
            }
            final int paddingBottom = recyclerListView.getPaddingBottom();
            ValueAnimator valueAnimator = (ValueAnimator) recyclerAnimationScrollHelper.animator;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                ((ValueAnimator) recyclerAnimationScrollHelper.animator).cancel();
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            recyclerAnimationScrollHelper.animator = valueAnimatorOfFloat;
            final boolean z4 = this.val$scrollDown;
            final int i13 = height;
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    RecyclerAnimationScrollHelper recyclerAnimationScrollHelper2;
                    boolean z5;
                    int i14;
                    RecyclerListView recyclerListView2;
                    RecyclerAnimationScrollHelper.AnonymousClass1 anonymousClass1 = this.f$0;
                    float fFloatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    ArrayList arrayList3 = arrayList;
                    int size2 = arrayList3.size();
                    int i15 = 0;
                    while (true) {
                        recyclerAnimationScrollHelper2 = RecyclerAnimationScrollHelper.this;
                        z5 = z4;
                        i14 = i13;
                        recyclerListView2 = (RecyclerListView) recyclerAnimationScrollHelper2.recyclerView;
                        if (i15 >= size2) {
                            break;
                        }
                        View view4 = (View) arrayList3.get(i15);
                        float y = view4.getY();
                        if (view4.getY() + view4.getMeasuredHeight() >= 0.0f && y <= recyclerListView2.getMeasuredHeight()) {
                            if (z5) {
                                view4.setTranslationY((-i14) * fFloatValue);
                            } else {
                                view4.setTranslationY(i14 * fFloatValue);
                            }
                        }
                        i15++;
                    }
                    int paddingBottom2 = paddingBottom - recyclerListView2.getPaddingBottom();
                    ArrayList arrayList4 = arrayList2;
                    int size3 = arrayList4.size();
                    for (int i16 = 0; i16 < size3; i16++) {
                        View view5 = (View) arrayList4.get(i16);
                        if (z5) {
                            view5.setTranslationY(((1.0f - fFloatValue) * i14) + paddingBottom2);
                        } else {
                            view5.setTranslationY((1.0f - fFloatValue) * (-i14));
                        }
                    }
                    recyclerListView2.invalidate();
                    RecyclerAnimationScrollHelper.ScrollListener scrollListener = (RecyclerAnimationScrollHelper.ScrollListener) recyclerAnimationScrollHelper2.scrollListener;
                    if (scrollListener != null) {
                        scrollListener.onScroll();
                    }
                }
            });
            ((ValueAnimator) recyclerAnimationScrollHelper.animator).addListener(new ChatActivity.AnonymousClass74(this, arrayList2, false, 26));
            if (!recyclerAnimationScrollHelper.isDialogs) {
                if (z2) {
                    jMin = 600;
                } else {
                    long measuredHeight = (long) (((i13 / recyclerListView.getMeasuredHeight()) + 1.0f) * 200.0f);
                    jMin = Math.min(measuredHeight >= 300 ? measuredHeight : 300L, 1300L);
                }
                ((ValueAnimator) recyclerAnimationScrollHelper.animator).setDuration(jMin);
                ((ValueAnimator) recyclerAnimationScrollHelper.animator).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            } else if (z2) {
                ((ValueAnimator) recyclerAnimationScrollHelper.animator).setDuration(150L);
                ((ValueAnimator) recyclerAnimationScrollHelper.animator).setInterpolator(CubicBezierInterpolator.EASE_OUT);
            } else {
                long measuredHeight2 = (long) (((i13 / recyclerListView.getMeasuredHeight()) + 1.0f) * 200.0f);
                ((ValueAnimator) recyclerAnimationScrollHelper.animator).setDuration(Math.min(measuredHeight2 >= 300 ? measuredHeight2 : 300L, 1300L));
                ((ValueAnimator) recyclerAnimationScrollHelper.animator).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            }
            ((ValueAnimator) recyclerAnimationScrollHelper.animator).start();
        }
    }

    public abstract class AnimatableAdapter extends RecyclerListView.SelectionAdapter {
        public boolean animationRunning;
        public final ArrayList rangeInserted = new ArrayList();
        public final ArrayList rangeRemoved = new ArrayList();
        public boolean shouldNotifyDataSetChanged;

        @Override
        public void notifyItemChanged(int i) {
            if (this.animationRunning) {
                return;
            }
            super.notifyItemChanged(i);
        }
    }

    public interface ScrollListener {
        void onScroll();
    }

    public RecyclerAnimationScrollHelper(RecyclerListView recyclerListView, LinearLayoutManager linearLayoutManager) {
        this.$r8$classId = 0;
        this.positionToOldView = new SparseArray();
        this.oldStableIds = new HashMap();
        this.recyclerView = recyclerListView;
        this.layoutManager = linearLayoutManager;
    }

    public final void cancel() {
        switch (this.$r8$classId) {
            case 0:
                ValueAnimator valueAnimator = (ValueAnimator) this.animator;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                RecyclerListView recyclerListView = (RecyclerListView) this.recyclerView;
                recyclerListView.setVerticalScrollBarEnabled(true);
                recyclerListView.fastScrollAnimationRunning = false;
                RecyclerView.Adapter adapter = recyclerListView.getAdapter();
                if (adapter instanceof AnimatableAdapter) {
                    AnimatableAdapter animatableAdapter = (AnimatableAdapter) adapter;
                    animatableAdapter.animationRunning = false;
                    if (animatableAdapter.shouldNotifyDataSetChanged || !animatableAdapter.rangeInserted.isEmpty() || !animatableAdapter.rangeRemoved.isEmpty()) {
                        ((ChatActivity.ChatActivityAdapter) animatableAdapter).notifyDataSetChanged(false);
                    }
                }
                this.animator = null;
                int childCount = recyclerListView.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = recyclerListView.getChildAt(i);
                    childAt.setTranslationY(0.0f);
                    if (childAt instanceof IMessageCell) {
                        ((IMessageCell) childAt).setAnimationRunning(false, false);
                    }
                }
                break;
            default:
                if (!this.forceUseStableId && !this.isDialogs) {
                    this.isDialogs = true;
                    MediaRouteProvider$RouteController mediaRouteProvider$RouteController = (MediaRouteProvider$RouteController) this.recyclerView;
                    if (mediaRouteProvider$RouteController != null) {
                        mediaRouteProvider$RouteController.onUnselect(0);
                        mediaRouteProvider$RouteController.onRelease();
                    }
                    break;
                }
                break;
        }
    }

    public void finishTransfer() {
        CallbackToFutureAdapter$SafeFuture callbackToFutureAdapter$SafeFuture;
        MediaRouter.checkCallingThread();
        if (this.forceUseStableId || this.isDialogs) {
            return;
        }
        WeakReference weakReference = (WeakReference) this.positionToOldView;
        GlobalMediaRouter globalMediaRouter = (GlobalMediaRouter) weakReference.get();
        if (globalMediaRouter == null || globalMediaRouter.mTransferNotifier != this || ((callbackToFutureAdapter$SafeFuture = (CallbackToFutureAdapter$SafeFuture) this.oldStableIds) != null && callbackToFutureAdapter$SafeFuture.isCancelled())) {
            cancel();
            return;
        }
        this.forceUseStableId = true;
        globalMediaRouter.mTransferNotifier = null;
        GlobalMediaRouter globalMediaRouter2 = (GlobalMediaRouter) weakReference.get();
        int i = this.scrollDirection;
        MediaRouter.RouteInfo routeInfo = (MediaRouter.RouteInfo) this.layoutManager;
        if (globalMediaRouter2 != null && globalMediaRouter2.mSelectedRoute == routeInfo) {
            Message messageObtainMessage = globalMediaRouter2.mCallbackHandler.obtainMessage(263, routeInfo);
            messageObtainMessage.arg1 = i;
            messageObtainMessage.sendToTarget();
            MediaRouteProvider$RouteController mediaRouteProvider$RouteController = globalMediaRouter2.mSelectedRouteController;
            if (mediaRouteProvider$RouteController != null) {
                mediaRouteProvider$RouteController.onUnselect(i);
                globalMediaRouter2.mSelectedRouteController.onRelease();
            }
            HashMap map = globalMediaRouter2.mRouteControllerMap;
            if (!map.isEmpty()) {
                for (MediaRouteProvider$RouteController mediaRouteProvider$RouteController2 : map.values()) {
                    mediaRouteProvider$RouteController2.onUnselect(i);
                    mediaRouteProvider$RouteController2.onRelease();
                }
                map.clear();
            }
            globalMediaRouter2.mSelectedRouteController = null;
        }
        GlobalMediaRouter globalMediaRouter3 = (GlobalMediaRouter) weakReference.get();
        if (globalMediaRouter3 == null) {
            return;
        }
        MediaRouter.RouteInfo routeInfo2 = (MediaRouter.RouteInfo) this.animator;
        globalMediaRouter3.mSelectedRoute = routeInfo2;
        globalMediaRouter3.mSelectedRouteController = (MediaRouteProvider$RouteController) this.recyclerView;
        GlobalMediaRouter.CallbackHandler callbackHandler = globalMediaRouter3.mCallbackHandler;
        MediaRouter.RouteInfo routeInfo3 = (MediaRouter.RouteInfo) this.scrollListener;
        if (routeInfo3 == null) {
            Message messageObtainMessage2 = callbackHandler.obtainMessage(262, new Pair(routeInfo, routeInfo2));
            messageObtainMessage2.arg1 = i;
            messageObtainMessage2.sendToTarget();
        } else {
            Message messageObtainMessage3 = callbackHandler.obtainMessage(264, new Pair(routeInfo3, routeInfo2));
            messageObtainMessage3.arg1 = i;
            messageObtainMessage3.sendToTarget();
        }
        globalMediaRouter3.mRouteControllerMap.clear();
        globalMediaRouter3.maybeUpdateMemberRouteControllers();
        globalMediaRouter3.updatePlaybackInfoFromSelectedRoute();
        ArrayList arrayList = (ArrayList) this.animationCallback;
        if (arrayList != null) {
            globalMediaRouter3.mSelectedRoute.updateDynamicDescriptors(arrayList);
        }
    }

    public void scrollToPosition(int i, int i2, boolean z, boolean z2) {
        long itemId;
        RecyclerListView recyclerListView = (RecyclerListView) this.recyclerView;
        if (recyclerListView.fastScrollAnimationRunning) {
            return;
        }
        if (recyclerListView.getItemAnimator() != null) {
            if (z2) {
                RecyclerView.ItemAnimator itemAnimator = recyclerListView.getItemAnimator();
                RecyclerAnimationScrollHelper$$ExternalSyntheticLambda0 recyclerAnimationScrollHelper$$ExternalSyntheticLambda0 = new RecyclerAnimationScrollHelper$$ExternalSyntheticLambda0(this, i, i2, z);
                boolean zIsRunning = itemAnimator.isRunning();
                if (zIsRunning) {
                    itemAnimator.mFinishedListeners.add(recyclerAnimationScrollHelper$$ExternalSyntheticLambda0);
                } else {
                    scrollToPosition(i, i2, z, false);
                }
                if (zIsRunning) {
                    return;
                }
            } else if (recyclerListView.getItemAnimator().isRunning()) {
                return;
            }
        }
        int i3 = this.scrollDirection;
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.layoutManager;
        if (i3 == -1) {
            linearLayoutManager.scrollToPositionWithOffset(i, i2, z);
            return;
        }
        int childCount = recyclerListView.getChildCount();
        if (childCount == 0 || !MessagesController.getGlobalMainSettings().getBoolean("view_animations", true)) {
            linearLayoutManager.scrollToPositionWithOffset(i, i2, z);
            return;
        }
        boolean z3 = this.scrollDirection == 0;
        recyclerListView.setScrollEnabled(false);
        ArrayList arrayList = new ArrayList();
        SparseArray sparseArray = (SparseArray) this.positionToOldView;
        sparseArray.clear();
        RecyclerView.Adapter adapter = recyclerListView.getAdapter();
        HashMap map = (HashMap) this.oldStableIds;
        map.clear();
        int i4 = 0;
        while (i4 < childCount) {
            View childAt = recyclerListView.getChildAt(i4);
            arrayList.add(childAt);
            linearLayoutManager.getClass();
            sparseArray.put(((RecyclerView.LayoutParams) childAt.getLayoutParams()).getViewLayoutPosition(), childAt);
            if (adapter == null || !(adapter.mHasStableIds || this.forceUseStableId)) {
                sparseArray = sparseArray;
            } else {
                if (this.forceUseStableId) {
                    int adapterPosition = ((RecyclerView.LayoutParams) childAt.getLayoutParams()).mViewHolder.getAdapterPosition();
                    if (adapterPosition < 0) {
                        sparseArray = sparseArray;
                    } else {
                        itemId = adapter.getItemId(adapterPosition);
                    }
                    i4++;
                    sparseArray = sparseArray;
                } else {
                    itemId = ((RecyclerView.LayoutParams) childAt.getLayoutParams()).mViewHolder.mItemId;
                }
                map.put(Long.valueOf(itemId), childAt);
            }
            if (childAt instanceof IMessageCell) {
                ((IMessageCell) childAt).setAnimationRunning(true, true);
            }
            i4++;
            sparseArray = sparseArray;
        }
        recyclerListView.stopScroll();
        recyclerListView.removeAndRecycleViews();
        AdapterHelper adapterHelper = recyclerListView.mAdapterHelper;
        adapterHelper.recycleUpdateOpsAndClearList((ArrayList) adapterHelper.mPendingUpdates);
        adapterHelper.recycleUpdateOpsAndClearList((ArrayList) adapterHelper.mPostponedList);
        adapterHelper.mExistingUpdateTypes = 0;
        RecyclerView.Adapter adapter2 = recyclerListView.mAdapter;
        RecyclerView.Recycler recycler = recyclerListView.mRecycler;
        recycler.onAdapterChanged(adapter2, adapter2);
        recyclerListView.mState.mStructureChanged = true;
        recyclerListView.mChildHelper.removeAllViewsUnfiltered();
        recycler.updateViewCacheSize();
        AnimatableAdapter animatableAdapter = adapter instanceof AnimatableAdapter ? (AnimatableAdapter) adapter : null;
        linearLayoutManager.scrollToPositionWithOffset(i, i2, z);
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
        recyclerListView.stopScroll();
        recyclerListView.setVerticalScrollBarEnabled(false);
        zzdd zzddVar = (zzdd) this.animationCallback;
        if (zzddVar != null) {
            zzddVar.onStartAnimation();
        }
        recyclerListView.fastScrollAnimationRunning = true;
        if (animatableAdapter != null) {
            animatableAdapter.animationRunning = true;
            animatableAdapter.shouldNotifyDataSetChanged = false;
            animatableAdapter.rangeInserted.clear();
            animatableAdapter.rangeRemoved.clear();
        }
        recyclerListView.addOnLayoutChangeListener(new AnonymousClass1(adapter, arrayList, z3, animatableAdapter));
    }

    public void setAnimationCallback(zzdd zzddVar) {
        this.animationCallback = zzddVar;
    }

    public RecyclerAnimationScrollHelper(GlobalMediaRouter globalMediaRouter, MediaRouter.RouteInfo routeInfo, MediaRouteProvider$RouteController mediaRouteProvider$RouteController, int i, MediaRouter.RouteInfo routeInfo2, ArrayList arrayList) {
        this.$r8$classId = 1;
        this.oldStableIds = null;
        this.forceUseStableId = false;
        this.isDialogs = false;
        this.positionToOldView = new WeakReference(globalMediaRouter);
        this.animator = routeInfo;
        this.recyclerView = mediaRouteProvider$RouteController;
        this.scrollDirection = i;
        this.layoutManager = globalMediaRouter.mSelectedRoute;
        this.scrollListener = routeInfo2;
        this.animationCallback = arrayList != null ? new ArrayList(arrayList) : null;
        globalMediaRouter.mCallbackHandler.postDelayed(new ComponentDialog$$ExternalSyntheticLambda1(this, 11), 15000L);
    }
}
