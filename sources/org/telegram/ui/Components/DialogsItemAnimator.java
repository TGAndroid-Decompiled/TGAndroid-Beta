package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import com.google.zxing.qrcode.decoder.Version;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.Adapters.DialogsAdapter;
import org.telegram.ui.Cells.DialogCell;
import org.telegram.ui.Cells.DialogsEmptyCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.ProfileActivity;

public abstract class DialogsItemAnimator extends SimpleItemAnimator {
    public static final DecelerateInterpolator sDefaultInterpolator = new DecelerateInterpolator();
    public int bottomClip;
    public final DialogsActivity.DialogsRecyclerView listView;
    public DialogCell removingDialog;
    public int topClip;
    public final ArrayList mPendingRemovals = new ArrayList();
    public final ArrayList mPendingAdditions = new ArrayList();
    public final ArrayList mPendingMoves = new ArrayList();
    public final ArrayList mPendingChanges = new ArrayList();
    public final ArrayList mAdditionsList = new ArrayList();
    public final ArrayList mMovesList = new ArrayList();
    public final ArrayList mChangesList = new ArrayList();
    public final ArrayList mAddAnimations = new ArrayList();
    public final ArrayList mMoveAnimations = new ArrayList();
    public final ArrayList mRemoveAnimations = new ArrayList();
    public final ArrayList mChangeAnimations = new ArrayList();

    public final class AnonymousClass5 extends AnimatorListenerAdapter {
        public final int $r8$classId;
        public final SimpleItemAnimator this$0;
        public final ViewPropertyAnimator val$animation;
        public final int val$deltaX;
        public final int val$deltaY;
        public final RecyclerView.ViewHolder val$holder;
        public final View val$view;

        public AnonymousClass5(SimpleItemAnimator simpleItemAnimator, RecyclerView.ViewHolder viewHolder, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator, int i3) {
            this.$r8$classId = i3;
            this.this$0 = simpleItemAnimator;
            this.val$holder = viewHolder;
            this.val$deltaX = i;
            this.val$view = view;
            this.val$deltaY = i2;
            this.val$animation = viewPropertyAnimator;
        }

        @Override
        public final void onAnimationCancel(Animator animator) {
            switch (this.$r8$classId) {
                case 0:
                    int i = this.val$deltaX;
                    View view = this.val$view;
                    if (i != 0) {
                        view.setTranslationX(0.0f);
                    }
                    if (this.val$deltaY != 0) {
                        view.setTranslationY(0.0f);
                    }
                    View view2 = this.val$holder.itemView;
                    if (view2 instanceof DialogCell) {
                        ((DialogCell) view2).setMoving(false);
                    } else if (view2 instanceof DialogsAdapter.LastEmptyView) {
                        ((DialogsAdapter.LastEmptyView) view2).moving = false;
                    }
                    break;
                default:
                    int i2 = this.val$deltaX;
                    View view3 = this.val$view;
                    if (i2 != 0) {
                        view3.setTranslationX(0.0f);
                    }
                    if (this.val$deltaY != 0) {
                        view3.setTranslationY(0.0f);
                    }
                    break;
            }
        }

        @Override
        public final void onAnimationEnd(Animator animator) {
            switch (this.$r8$classId) {
                case 0:
                    this.val$animation.setListener(null);
                    DialogsItemAnimator dialogsItemAnimator = (DialogsItemAnimator) this.this$0;
                    dialogsItemAnimator.getClass();
                    RecyclerView.ViewHolder viewHolder = this.val$holder;
                    dialogsItemAnimator.dispatchAnimationFinished(viewHolder);
                    dialogsItemAnimator.mMoveAnimations.remove(viewHolder);
                    if (!dialogsItemAnimator.isRunning()) {
                        dialogsItemAnimator.dispatchAnimationsFinished();
                    }
                    View view = viewHolder.itemView;
                    if (view instanceof DialogCell) {
                        ((DialogCell) view).setMoving(false);
                    } else if (view instanceof DialogsAdapter.LastEmptyView) {
                        ((DialogsAdapter.LastEmptyView) view).moving = false;
                    }
                    View view2 = this.val$view;
                    view2.setTranslationX(0.0f);
                    view2.setTranslationY(0.0f);
                    break;
                default:
                    this.val$animation.setListener(null);
                    DefaultItemAnimator defaultItemAnimator = (DefaultItemAnimator) this.this$0;
                    RecyclerView.ViewHolder viewHolder2 = this.val$holder;
                    defaultItemAnimator.onMoveAnimationUpdate(viewHolder2);
                    defaultItemAnimator.onMoveFinished(viewHolder2);
                    defaultItemAnimator.dispatchAnimationFinished(viewHolder2);
                    defaultItemAnimator.mMoveAnimations.remove(viewHolder2);
                    defaultItemAnimator.dispatchFinishedWhenDone();
                    defaultItemAnimator.afterAnimateMoveImpl(viewHolder2);
                    break;
            }
        }

        @Override
        public final void onAnimationStart(Animator animator) {
            switch (this.$r8$classId) {
                case 0:
                    ((DialogsItemAnimator) this.this$0).getClass();
                    break;
                default:
                    ((DefaultItemAnimator) this.this$0).getClass();
                    break;
            }
        }
    }

    public final class ChangeInfo {
        public final int fromX;
        public final int fromY;
        public RecyclerView.ViewHolder newHolder;
        public RecyclerView.ViewHolder oldHolder;
        public final int toX;
        public final int toY;

        public ChangeInfo(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2, int i, int i2, int i3, int i4) {
            this.oldHolder = viewHolder;
            this.newHolder = viewHolder2;
            this.fromX = i;
            this.fromY = i2;
            this.toX = i3;
            this.toY = i4;
        }

        public final String toString() {
            return "ChangeInfo{oldHolder=" + this.oldHolder + ", newHolder=" + this.newHolder + ", fromX=" + this.fromX + ", fromY=" + this.fromY + ", toX=" + this.toX + ", toY=" + this.toY + '}';
        }
    }

    public final class MoveInfo {
        public final int fromX;
        public final int fromY;
        public final RecyclerView.ViewHolder holder;
        public final int toX;
        public final int toY;

        public MoveInfo(RecyclerView.ViewHolder viewHolder, int i, int i2, int i3, int i4) {
            this.holder = viewHolder;
            this.fromX = i;
            this.fromY = i2;
            this.toX = i3;
            this.toY = i4;
        }
    }

    public DialogsItemAnimator(DialogsActivity.DialogsRecyclerView dialogsRecyclerView) {
        this.mSupportsChangeAnimations = false;
        this.listView = dialogsRecyclerView;
    }

    @Override
    public final void animateAdd(RecyclerView.ViewHolder viewHolder) {
        View view = viewHolder.itemView;
        view.animate().setInterpolator(sDefaultInterpolator);
        endAnimation(viewHolder);
        if (!(view instanceof DialogCell)) {
            view.setAlpha(0.0f);
        }
        ArrayList arrayList = this.mPendingAdditions;
        arrayList.add(viewHolder);
        if (arrayList.size() > 2) {
            for (int i = 0; i < arrayList.size(); i++) {
                ((RecyclerView.ViewHolder) arrayList.get(i)).itemView.setAlpha(0.0f);
                if (((RecyclerView.ViewHolder) arrayList.get(i)).itemView instanceof DialogCell) {
                    ((DialogCell) ((RecyclerView.ViewHolder) arrayList.get(i)).itemView).setMoving(true);
                }
            }
        }
    }

    @Override
    public final boolean animateChange(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2, Version.ECB ecb, int i, int i2, int i3, int i4) {
        View view = viewHolder.itemView;
        if (!(view instanceof DialogCell)) {
            return false;
        }
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        DecelerateInterpolator decelerateInterpolator = sDefaultInterpolator;
        viewPropertyAnimatorAnimate.setInterpolator(decelerateInterpolator);
        endAnimation(viewHolder);
        View view2 = viewHolder2.itemView;
        view2.animate().setInterpolator(decelerateInterpolator);
        endAnimation(viewHolder2);
        view.setAlpha(1.0f);
        view2.setAlpha(0.0f);
        view2.setTranslationX(0.0f);
        this.mPendingChanges.add(new ChangeInfo(viewHolder, viewHolder2, i, i2, i3, i4));
        return true;
    }

    @Override
    public final boolean animateMove(RecyclerView.ViewHolder viewHolder, Version.ECB ecb, int i, int i2, int i3, int i4) {
        View view = viewHolder.itemView;
        int translationX = i + ((int) view.getTranslationX());
        View view2 = viewHolder.itemView;
        int translationY = i2 + ((int) view2.getTranslationY());
        view2.animate().setInterpolator(sDefaultInterpolator);
        endAnimation(viewHolder);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            dispatchAnimationFinished(viewHolder);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        if (view2 instanceof DialogCell) {
            ((DialogCell) view2).setMoving(true);
        } else if (view2 instanceof DialogsAdapter.LastEmptyView) {
            ((DialogsAdapter.LastEmptyView) view2).moving = true;
        }
        this.mPendingMoves.add(new MoveInfo(viewHolder, translationX, translationY, i3, i4));
        return true;
    }

    @Override
    public final void animateRemove(RecyclerView.ViewHolder viewHolder, Version.ECB ecb) {
        viewHolder.itemView.animate().setInterpolator(sDefaultInterpolator);
        endAnimation(viewHolder);
        this.mPendingRemovals.add(viewHolder);
        DialogCell dialogCell = null;
        int i = 0;
        while (true) {
            DialogsActivity.DialogsRecyclerView dialogsRecyclerView = this.listView;
            if (i >= dialogsRecyclerView.getChildCount()) {
                break;
            }
            View childAt = dialogsRecyclerView.getChildAt(i);
            if (childAt.getTop() > Integer.MIN_VALUE && (childAt instanceof DialogCell)) {
                dialogCell = (DialogCell) childAt;
            }
            i++;
        }
        if (viewHolder.itemView == dialogCell) {
            this.removingDialog = dialogCell;
        }
    }

    @Override
    public final boolean canReuseUpdatedViewHolder(RecyclerView.ViewHolder viewHolder, List list) {
        return viewHolder.itemView instanceof DialogsEmptyCell;
    }

    public final void cancelAll(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((RecyclerView.ViewHolder) arrayList.get(size)).itemView.animate().cancel();
        }
    }

    @Override
    public final void endAnimation(RecyclerView.ViewHolder viewHolder) {
        View view = viewHolder.itemView;
        view.animate().cancel();
        ArrayList arrayList = this.mPendingMoves;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((MoveInfo) arrayList.get(size)).holder == viewHolder) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                dispatchAnimationFinished(viewHolder);
                arrayList.remove(size);
            }
        }
        ArrayList arrayList2 = this.mPendingChanges;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ChangeInfo changeInfo = (ChangeInfo) arrayList2.get(size2);
            if (endChangeAnimationIfNecessary(changeInfo, viewHolder) && changeInfo.oldHolder == null && changeInfo.newHolder == null) {
                arrayList2.remove(changeInfo);
            }
        }
        if (this.mPendingRemovals.remove(viewHolder)) {
            if (view instanceof DialogCell) {
                ((DialogCell) view).setClipProgress(0.0f);
            } else {
                view.setAlpha(1.0f);
            }
            dispatchAnimationFinished(viewHolder);
        }
        if (this.mPendingAdditions.remove(viewHolder)) {
            if (view instanceof DialogCell) {
                ((DialogCell) view).setClipProgress(0.0f);
            } else {
                view.setAlpha(1.0f);
            }
            dispatchAnimationFinished(viewHolder);
        }
        ArrayList arrayList3 = this.mChangesList;
        for (int size3 = arrayList3.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList4 = (ArrayList) arrayList3.get(size3);
            for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
                ChangeInfo changeInfo2 = (ChangeInfo) arrayList4.get(size4);
                if (endChangeAnimationIfNecessary(changeInfo2, viewHolder) && changeInfo2.oldHolder == null && changeInfo2.newHolder == null) {
                    arrayList4.remove(changeInfo2);
                }
            }
            if (arrayList4.isEmpty()) {
                arrayList3.remove(size3);
            }
        }
        ArrayList arrayList5 = this.mMovesList;
        for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
            for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                if (((MoveInfo) arrayList6.get(size6)).holder == viewHolder) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    dispatchAnimationFinished(viewHolder);
                    arrayList6.remove(size6);
                    if (!arrayList6.isEmpty()) {
                        break;
                    }
                    arrayList5.remove(size5);
                    break;
                }
            }
        }
        ArrayList arrayList7 = this.mAdditionsList;
        for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
            ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
            if (arrayList8.remove(viewHolder)) {
                if (view instanceof DialogCell) {
                    ((DialogCell) view).setClipProgress(1.0f);
                } else {
                    view.setAlpha(1.0f);
                }
                dispatchAnimationFinished(viewHolder);
                if (arrayList8.isEmpty()) {
                    arrayList7.remove(size7);
                }
            }
        }
        this.mRemoveAnimations.remove(viewHolder);
        this.mAddAnimations.remove(viewHolder);
        this.mChangeAnimations.remove(viewHolder);
        this.mMoveAnimations.remove(viewHolder);
        if (isRunning()) {
            return;
        }
        dispatchAnimationsFinished();
    }

    @Override
    public final void endAnimations() {
        ArrayList arrayList = this.mPendingMoves;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            MoveInfo moveInfo = (MoveInfo) arrayList.get(size);
            View view = moveInfo.holder.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            dispatchAnimationFinished(moveInfo.holder);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.mPendingRemovals;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) arrayList2.get(size2);
            View view2 = viewHolder.itemView;
            view2.setTranslationY(0.0f);
            view2.setTranslationX(0.0f);
            dispatchAnimationFinished(viewHolder);
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.mPendingAdditions;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.ViewHolder viewHolder2 = (RecyclerView.ViewHolder) arrayList3.get(size3);
            View view3 = viewHolder2.itemView;
            if (view3 instanceof DialogCell) {
                ((DialogCell) view3).setClipProgress(0.0f);
            } else {
                view3.setAlpha(1.0f);
            }
            dispatchAnimationFinished(viewHolder2);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.mPendingChanges;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            ChangeInfo changeInfo = (ChangeInfo) arrayList4.get(size4);
            RecyclerView.ViewHolder viewHolder3 = changeInfo.oldHolder;
            if (viewHolder3 != null) {
                endChangeAnimationIfNecessary(changeInfo, viewHolder3);
            }
            RecyclerView.ViewHolder viewHolder4 = changeInfo.newHolder;
            if (viewHolder4 != null) {
                endChangeAnimationIfNecessary(changeInfo, viewHolder4);
            }
        }
        arrayList4.clear();
        if (isRunning()) {
            ArrayList arrayList5 = this.mMovesList;
            for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
                for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                    MoveInfo moveInfo2 = (MoveInfo) arrayList6.get(size6);
                    View view4 = moveInfo2.holder.itemView;
                    view4.setTranslationY(0.0f);
                    view4.setTranslationX(0.0f);
                    dispatchAnimationFinished(moveInfo2.holder);
                    arrayList6.remove(size6);
                    if (arrayList6.isEmpty()) {
                        arrayList5.remove(arrayList6);
                    }
                }
            }
            ArrayList arrayList7 = this.mAdditionsList;
            for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
                for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.ViewHolder viewHolder5 = (RecyclerView.ViewHolder) arrayList8.get(size8);
                    View view5 = viewHolder5.itemView;
                    if (view5 instanceof DialogCell) {
                        ((DialogCell) view5).setClipProgress(0.0f);
                    } else {
                        view5.setAlpha(1.0f);
                    }
                    dispatchAnimationFinished(viewHolder5);
                    arrayList8.remove(size8);
                    if (arrayList8.isEmpty()) {
                        arrayList7.remove(arrayList8);
                    }
                }
            }
            ArrayList arrayList9 = this.mChangesList;
            for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    ChangeInfo changeInfo2 = (ChangeInfo) arrayList10.get(size10);
                    RecyclerView.ViewHolder viewHolder6 = changeInfo2.oldHolder;
                    if (viewHolder6 != null) {
                        endChangeAnimationIfNecessary(changeInfo2, viewHolder6);
                    }
                    RecyclerView.ViewHolder viewHolder7 = changeInfo2.newHolder;
                    if (viewHolder7 != null) {
                        endChangeAnimationIfNecessary(changeInfo2, viewHolder7);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList9.remove(arrayList10);
                    }
                }
            }
            cancelAll(this.mRemoveAnimations);
            cancelAll(this.mMoveAnimations);
            cancelAll(this.mAddAnimations);
            cancelAll(this.mChangeAnimations);
            dispatchAnimationsFinished();
        }
    }

    public final boolean endChangeAnimationIfNecessary(ChangeInfo changeInfo, RecyclerView.ViewHolder viewHolder) {
        if (changeInfo.newHolder == viewHolder) {
            changeInfo.newHolder = null;
        } else {
            if (changeInfo.oldHolder != viewHolder) {
                return false;
            }
            changeInfo.oldHolder = null;
        }
        viewHolder.itemView.setAlpha(1.0f);
        View view = viewHolder.itemView;
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        dispatchAnimationFinished(viewHolder);
        return true;
    }

    @Override
    public final boolean isRunning() {
        if (!this.mPendingAdditions.isEmpty()) {
            return true;
        }
        ArrayList arrayList = this.mPendingChanges;
        return (arrayList.isEmpty() && this.mPendingMoves.isEmpty() && arrayList.isEmpty() && this.mMoveAnimations.isEmpty() && this.mRemoveAnimations.isEmpty() && this.mAddAnimations.isEmpty() && this.mChangeAnimations.isEmpty() && this.mMovesList.isEmpty() && this.mAdditionsList.isEmpty() && this.mChangesList.isEmpty()) ? false : true;
    }

    public final void prepareForRemove() {
        this.topClip = Integer.MAX_VALUE;
        this.bottomClip = Integer.MAX_VALUE;
        this.removingDialog = null;
    }

    @Override
    public final void runPendingAnimations() {
        final int i;
        final DialogsItemAnimator dialogsItemAnimator = this;
        int i2 = 1;
        ArrayList arrayList = dialogsItemAnimator.mPendingRemovals;
        boolean zIsEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = dialogsItemAnimator.mPendingMoves;
        boolean zIsEmpty2 = arrayList2.isEmpty();
        ArrayList arrayList3 = dialogsItemAnimator.mPendingChanges;
        boolean zIsEmpty3 = arrayList3.isEmpty();
        ArrayList arrayList4 = dialogsItemAnimator.mPendingAdditions;
        boolean zIsEmpty4 = arrayList4.isEmpty();
        if (zIsEmpty && zIsEmpty2 && zIsEmpty4 && zIsEmpty3) {
            return;
        }
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            int i4 = i3 + 1;
            final RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) arrayList.get(i3);
            final View view = viewHolder.itemView;
            dialogsItemAnimator.mRemoveAnimations.add(viewHolder);
            if (view instanceof DialogCell) {
                final DialogCell dialogCell = (DialogCell) view;
                DialogCell dialogCell2 = dialogsItemAnimator.removingDialog;
                DecelerateInterpolator decelerateInterpolator = sDefaultInterpolator;
                if (view == dialogCell2) {
                    if (dialogsItemAnimator.topClip != Integer.MAX_VALUE) {
                        int measuredHeight = dialogCell2.getMeasuredHeight();
                        int i5 = dialogsItemAnimator.topClip;
                        dialogsItemAnimator.bottomClip = measuredHeight - i5;
                        dialogsItemAnimator.removingDialog.setTopClip(i5);
                        dialogsItemAnimator.removingDialog.setBottomClip(dialogsItemAnimator.bottomClip);
                    } else if (dialogsItemAnimator.bottomClip != Integer.MAX_VALUE) {
                        int measuredHeight2 = dialogCell2.getMeasuredHeight() - dialogsItemAnimator.bottomClip;
                        dialogsItemAnimator.topClip = measuredHeight2;
                        dialogsItemAnimator.removingDialog.setTopClip(measuredHeight2);
                        dialogsItemAnimator.removingDialog.setBottomClip(dialogsItemAnimator.bottomClip);
                    }
                    dialogCell.setElevation(-1.0f);
                    dialogCell.setOutlineProvider(null);
                    ChatActivity.AnonymousClass5 anonymousClass5 = AnimationProperties.CLIP_DIALOG_CELL_PROGRESS;
                    float[] fArr = new float[i2];
                    fArr[0] = 1.0f;
                    ObjectAnimator duration = ObjectAnimator.ofFloat(dialogCell, anonymousClass5, fArr).setDuration(180L);
                    duration.setInterpolator(decelerateInterpolator);
                    final int i6 = 0;
                    duration.addListener(new AnimatorListenerAdapter(dialogsItemAnimator) {
                        public final DialogsItemAnimator this$0;

                        {
                            this.this$0 = dialogsItemAnimator;
                        }

                        @Override
                        public final void onAnimationEnd(Animator animator) {
                            switch (i6) {
                                case 0:
                                    animator.removeAllListeners();
                                    DialogCell dialogCell3 = dialogCell;
                                    dialogCell3.setClipProgress(0.0f);
                                    dialogCell3.setElevation(0.0f);
                                    DialogsItemAnimator dialogsItemAnimator2 = this.this$0;
                                    RecyclerView.ViewHolder viewHolder2 = viewHolder;
                                    dialogsItemAnimator2.dispatchAnimationFinished(viewHolder2);
                                    dialogsItemAnimator2.mRemoveAnimations.remove(viewHolder2);
                                    if (!dialogsItemAnimator2.isRunning()) {
                                        dialogsItemAnimator2.dispatchAnimationsFinished();
                                    }
                                    break;
                                default:
                                    animator.removeAllListeners();
                                    DialogCell dialogCell4 = dialogCell;
                                    dialogCell4.setClipProgress(0.0f);
                                    dialogCell4.setElevation(0.0f);
                                    DialogsItemAnimator dialogsItemAnimator3 = this.this$0;
                                    RecyclerView.ViewHolder viewHolder3 = viewHolder;
                                    dialogsItemAnimator3.dispatchAnimationFinished(viewHolder3);
                                    dialogsItemAnimator3.mRemoveAnimations.remove(viewHolder3);
                                    if (!dialogsItemAnimator3.isRunning()) {
                                        dialogsItemAnimator3.dispatchAnimationsFinished();
                                    }
                                    break;
                            }
                        }

                        @Override
                        public final void onAnimationStart(Animator animator) {
                            switch (i6) {
                                case 0:
                                    this.this$0.onRemoveStarting();
                                    break;
                                default:
                                    this.this$0.onRemoveStarting();
                                    break;
                            }
                        }
                    });
                    duration.start();
                } else {
                    final int i7 = 1;
                    ObjectAnimator duration2 = ObjectAnimator.ofFloat(dialogCell, (Property<DialogCell, Float>) View.ALPHA, 1.0f).setDuration(180L);
                    duration2.setInterpolator(decelerateInterpolator);
                    duration2.addListener(new AnimatorListenerAdapter(dialogsItemAnimator) {
                        public final DialogsItemAnimator this$0;

                        {
                            this.this$0 = dialogsItemAnimator;
                        }

                        @Override
                        public final void onAnimationEnd(Animator animator) {
                            switch (i7) {
                                case 0:
                                    animator.removeAllListeners();
                                    DialogCell dialogCell3 = dialogCell;
                                    dialogCell3.setClipProgress(0.0f);
                                    dialogCell3.setElevation(0.0f);
                                    DialogsItemAnimator dialogsItemAnimator2 = this.this$0;
                                    RecyclerView.ViewHolder viewHolder2 = viewHolder;
                                    dialogsItemAnimator2.dispatchAnimationFinished(viewHolder2);
                                    dialogsItemAnimator2.mRemoveAnimations.remove(viewHolder2);
                                    if (!dialogsItemAnimator2.isRunning()) {
                                        dialogsItemAnimator2.dispatchAnimationsFinished();
                                    }
                                    break;
                                default:
                                    animator.removeAllListeners();
                                    DialogCell dialogCell4 = dialogCell;
                                    dialogCell4.setClipProgress(0.0f);
                                    dialogCell4.setElevation(0.0f);
                                    DialogsItemAnimator dialogsItemAnimator3 = this.this$0;
                                    RecyclerView.ViewHolder viewHolder3 = viewHolder;
                                    dialogsItemAnimator3.dispatchAnimationFinished(viewHolder3);
                                    dialogsItemAnimator3.mRemoveAnimations.remove(viewHolder3);
                                    if (!dialogsItemAnimator3.isRunning()) {
                                        dialogsItemAnimator3.dispatchAnimationsFinished();
                                    }
                                    break;
                            }
                        }

                        @Override
                        public final void onAnimationStart(Animator animator) {
                            switch (i7) {
                                case 0:
                                    this.this$0.onRemoveStarting();
                                    break;
                                default:
                                    this.this$0.onRemoveStarting();
                                    break;
                            }
                        }
                    });
                    duration2.start();
                }
            } else {
                final ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                final int i8 = 0;
                viewPropertyAnimatorAnimate.setDuration(180L).alpha(0.0f).setListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationCancel(Animator animator) {
                        switch (i8) {
                            case 1:
                                view.setAlpha(1.0f);
                                break;
                            default:
                                super.onAnimationCancel(animator);
                                break;
                        }
                    }

                    @Override
                    public final void onAnimationEnd(Animator animator) {
                        switch (i8) {
                            case 0:
                                viewPropertyAnimatorAnimate.setListener(null);
                                view.setAlpha(1.0f);
                                DialogsItemAnimator dialogsItemAnimator2 = dialogsItemAnimator;
                                RecyclerView.ViewHolder viewHolder2 = viewHolder;
                                dialogsItemAnimator2.dispatchAnimationFinished(viewHolder2);
                                dialogsItemAnimator2.mRemoveAnimations.remove(viewHolder2);
                                if (!dialogsItemAnimator2.isRunning()) {
                                    dialogsItemAnimator2.dispatchAnimationsFinished();
                                }
                                break;
                            default:
                                viewPropertyAnimatorAnimate.setListener(null);
                                DialogsItemAnimator dialogsItemAnimator3 = dialogsItemAnimator;
                                dialogsItemAnimator3.getClass();
                                RecyclerView.ViewHolder viewHolder3 = viewHolder;
                                dialogsItemAnimator3.dispatchAnimationFinished(viewHolder3);
                                dialogsItemAnimator3.mAddAnimations.remove(viewHolder3);
                                if (!dialogsItemAnimator3.isRunning()) {
                                    dialogsItemAnimator3.dispatchAnimationsFinished();
                                }
                                View view2 = viewHolder3.itemView;
                                if (view2 instanceof DialogCell) {
                                    ((DialogCell) view2).setMoving(false);
                                }
                                break;
                        }
                    }

                    @Override
                    public final void onAnimationStart(Animator animator) {
                        switch (i8) {
                            case 0:
                                dialogsItemAnimator.onRemoveStarting();
                                break;
                            default:
                                dialogsItemAnimator.getClass();
                                break;
                        }
                    }
                }).start();
            }
            i3 = i4;
            arrayList = arrayList;
            i2 = 1;
        }
        arrayList.clear();
        if (zIsEmpty2) {
            i = 0;
        } else {
            final ArrayList arrayList5 = new ArrayList(arrayList2);
            dialogsItemAnimator.mMovesList.add(arrayList5);
            arrayList2.clear();
            i = 0;
            new Runnable(dialogsItemAnimator) {
                public final DialogsItemAnimator f$0;

                {
                    this.f$0 = dialogsItemAnimator;
                }

                @Override
                public final void run() {
                    float f = 0.0f;
                    ArrayList arrayList6 = arrayList5;
                    char c = 0;
                    switch (i) {
                        case 0:
                            DialogsItemAnimator dialogsItemAnimator2 = this.f$0;
                            dialogsItemAnimator2.getClass();
                            int size2 = arrayList6.size();
                            int i9 = 0;
                            while (i9 < size2) {
                                int i10 = i9 + 1;
                                DialogsItemAnimator.MoveInfo moveInfo = (DialogsItemAnimator.MoveInfo) arrayList6.get(i9);
                                RecyclerView.ViewHolder viewHolder2 = moveInfo.holder;
                                View view2 = viewHolder2.itemView;
                                int i11 = moveInfo.toX - moveInfo.fromX;
                                int i12 = moveInfo.toY;
                                int i13 = moveInfo.fromY;
                                int i14 = i12 - i13;
                                if (i11 != 0) {
                                    view2.animate().translationX(f);
                                }
                                if (i14 != 0) {
                                    view2.animate().translationY(f);
                                }
                                if (i13 > i12) {
                                    dialogsItemAnimator2.bottomClip = i13 - i12;
                                } else {
                                    dialogsItemAnimator2.topClip = i14;
                                }
                                DialogCell dialogCell3 = dialogsItemAnimator2.removingDialog;
                                if (dialogCell3 != null) {
                                    if (dialogsItemAnimator2.topClip != Integer.MAX_VALUE) {
                                        int measuredHeight3 = dialogCell3.getMeasuredHeight();
                                        int i15 = dialogsItemAnimator2.topClip;
                                        dialogsItemAnimator2.bottomClip = measuredHeight3 - i15;
                                        dialogsItemAnimator2.removingDialog.setTopClip(i15);
                                        dialogsItemAnimator2.removingDialog.setBottomClip(dialogsItemAnimator2.bottomClip);
                                    } else if (dialogsItemAnimator2.bottomClip != Integer.MAX_VALUE) {
                                        int measuredHeight4 = dialogCell3.getMeasuredHeight() - dialogsItemAnimator2.bottomClip;
                                        dialogsItemAnimator2.topClip = measuredHeight4;
                                        dialogsItemAnimator2.removingDialog.setTopClip(measuredHeight4);
                                        dialogsItemAnimator2.removingDialog.setBottomClip(dialogsItemAnimator2.bottomClip);
                                    }
                                }
                                ViewPropertyAnimator viewPropertyAnimatorAnimate2 = view2.animate();
                                dialogsItemAnimator2.mMoveAnimations.add(viewHolder2);
                                viewPropertyAnimatorAnimate2.setDuration(180L).setListener(new DialogsItemAnimator.AnonymousClass5(dialogsItemAnimator2, viewHolder2, i11, view2, i14, viewPropertyAnimatorAnimate2, 0)).start();
                                i9 = i10;
                                f = 0.0f;
                            }
                            arrayList6.clear();
                            dialogsItemAnimator2.mMovesList.remove(arrayList6);
                            break;
                        default:
                            DialogsItemAnimator dialogsItemAnimator3 = this.f$0;
                            dialogsItemAnimator3.getClass();
                            int size3 = arrayList6.size();
                            int i16 = 0;
                            while (i16 < size3) {
                                int i17 = i16 + 1;
                                DialogsItemAnimator.ChangeInfo changeInfo = (DialogsItemAnimator.ChangeInfo) arrayList6.get(i16);
                                RecyclerView.ViewHolder viewHolder3 = changeInfo.oldHolder;
                                RecyclerView.ViewHolder viewHolder4 = changeInfo.newHolder;
                                if (viewHolder3 != null && viewHolder4 != null) {
                                    AnimatorSet animatorSet = new AnimatorSet();
                                    animatorSet.setDuration(180L);
                                    Property property = View.ALPHA;
                                    float[] fArr2 = new float[1];
                                    fArr2[c] = 0.0f;
                                    animatorSet.playTogether(ObjectAnimator.ofFloat(viewHolder3.itemView, (Property<View, Float>) property, fArr2), ObjectAnimator.ofFloat(viewHolder4.itemView, (Property<View, Float>) property, 1.0f));
                                    ArrayList arrayList7 = dialogsItemAnimator3.mChangeAnimations;
                                    arrayList7.add(changeInfo.oldHolder);
                                    arrayList7.add(changeInfo.newHolder);
                                    animatorSet.addListener(new ProfileActivity.AnonymousClass47(dialogsItemAnimator3, changeInfo, viewHolder3, animatorSet, 2));
                                    animatorSet.start();
                                }
                                i16 = i17;
                                c = 0;
                            }
                            arrayList6.clear();
                            dialogsItemAnimator3.mChangesList.remove(arrayList6);
                            break;
                    }
                }
            }.run();
        }
        if (!zIsEmpty3) {
            final ArrayList arrayList6 = new ArrayList(arrayList3);
            dialogsItemAnimator.mChangesList.add(arrayList6);
            arrayList3.clear();
            final int i9 = 1;
            new Runnable(dialogsItemAnimator) {
                public final DialogsItemAnimator f$0;

                {
                    this.f$0 = dialogsItemAnimator;
                }

                @Override
                public final void run() {
                    float f = 0.0f;
                    ArrayList arrayList7 = arrayList6;
                    char c = 0;
                    switch (i9) {
                        case 0:
                            DialogsItemAnimator dialogsItemAnimator2 = this.f$0;
                            dialogsItemAnimator2.getClass();
                            int size2 = arrayList7.size();
                            int i10 = 0;
                            while (i10 < size2) {
                                int i11 = i10 + 1;
                                DialogsItemAnimator.MoveInfo moveInfo = (DialogsItemAnimator.MoveInfo) arrayList7.get(i10);
                                RecyclerView.ViewHolder viewHolder2 = moveInfo.holder;
                                View view2 = viewHolder2.itemView;
                                int i12 = moveInfo.toX - moveInfo.fromX;
                                int i13 = moveInfo.toY;
                                int i14 = moveInfo.fromY;
                                int i15 = i13 - i14;
                                if (i12 != 0) {
                                    view2.animate().translationX(f);
                                }
                                if (i15 != 0) {
                                    view2.animate().translationY(f);
                                }
                                if (i14 > i13) {
                                    dialogsItemAnimator2.bottomClip = i14 - i13;
                                } else {
                                    dialogsItemAnimator2.topClip = i15;
                                }
                                DialogCell dialogCell3 = dialogsItemAnimator2.removingDialog;
                                if (dialogCell3 != null) {
                                    if (dialogsItemAnimator2.topClip != Integer.MAX_VALUE) {
                                        int measuredHeight3 = dialogCell3.getMeasuredHeight();
                                        int i16 = dialogsItemAnimator2.topClip;
                                        dialogsItemAnimator2.bottomClip = measuredHeight3 - i16;
                                        dialogsItemAnimator2.removingDialog.setTopClip(i16);
                                        dialogsItemAnimator2.removingDialog.setBottomClip(dialogsItemAnimator2.bottomClip);
                                    } else if (dialogsItemAnimator2.bottomClip != Integer.MAX_VALUE) {
                                        int measuredHeight4 = dialogCell3.getMeasuredHeight() - dialogsItemAnimator2.bottomClip;
                                        dialogsItemAnimator2.topClip = measuredHeight4;
                                        dialogsItemAnimator2.removingDialog.setTopClip(measuredHeight4);
                                        dialogsItemAnimator2.removingDialog.setBottomClip(dialogsItemAnimator2.bottomClip);
                                    }
                                }
                                ViewPropertyAnimator viewPropertyAnimatorAnimate2 = view2.animate();
                                dialogsItemAnimator2.mMoveAnimations.add(viewHolder2);
                                viewPropertyAnimatorAnimate2.setDuration(180L).setListener(new DialogsItemAnimator.AnonymousClass5(dialogsItemAnimator2, viewHolder2, i12, view2, i15, viewPropertyAnimatorAnimate2, 0)).start();
                                i10 = i11;
                                f = 0.0f;
                            }
                            arrayList7.clear();
                            dialogsItemAnimator2.mMovesList.remove(arrayList7);
                            break;
                        default:
                            DialogsItemAnimator dialogsItemAnimator3 = this.f$0;
                            dialogsItemAnimator3.getClass();
                            int size3 = arrayList7.size();
                            int i17 = 0;
                            while (i17 < size3) {
                                int i18 = i17 + 1;
                                DialogsItemAnimator.ChangeInfo changeInfo = (DialogsItemAnimator.ChangeInfo) arrayList7.get(i17);
                                RecyclerView.ViewHolder viewHolder3 = changeInfo.oldHolder;
                                RecyclerView.ViewHolder viewHolder4 = changeInfo.newHolder;
                                if (viewHolder3 != null && viewHolder4 != null) {
                                    AnimatorSet animatorSet = new AnimatorSet();
                                    animatorSet.setDuration(180L);
                                    Property property = View.ALPHA;
                                    float[] fArr2 = new float[1];
                                    fArr2[c] = 0.0f;
                                    animatorSet.playTogether(ObjectAnimator.ofFloat(viewHolder3.itemView, (Property<View, Float>) property, fArr2), ObjectAnimator.ofFloat(viewHolder4.itemView, (Property<View, Float>) property, 1.0f));
                                    ArrayList arrayList8 = dialogsItemAnimator3.mChangeAnimations;
                                    arrayList8.add(changeInfo.oldHolder);
                                    arrayList8.add(changeInfo.newHolder);
                                    animatorSet.addListener(new ProfileActivity.AnonymousClass47(dialogsItemAnimator3, changeInfo, viewHolder3, animatorSet, 2));
                                    animatorSet.start();
                                }
                                i17 = i18;
                                c = 0;
                            }
                            arrayList7.clear();
                            dialogsItemAnimator3.mChangesList.remove(arrayList7);
                            break;
                    }
                }
            }.run();
        }
        if (zIsEmpty4) {
            return;
        }
        ArrayList arrayList7 = new ArrayList(arrayList4);
        ArrayList arrayList8 = dialogsItemAnimator.mAdditionsList;
        arrayList8.add(arrayList7);
        arrayList4.clear();
        int size2 = arrayList7.size();
        while (i < size2) {
            int i10 = i + 1;
            final RecyclerView.ViewHolder viewHolder2 = (RecyclerView.ViewHolder) arrayList7.get(i);
            final View view2 = viewHolder2.itemView;
            dialogsItemAnimator.mAddAnimations.add(viewHolder2);
            final ViewPropertyAnimator viewPropertyAnimatorAnimate2 = view2.animate();
            final int i11 = 1;
            viewPropertyAnimatorAnimate2.alpha(1.0f).setDuration(180L).setListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationCancel(Animator animator) {
                    switch (i11) {
                        case 1:
                            view2.setAlpha(1.0f);
                            break;
                        default:
                            super.onAnimationCancel(animator);
                            break;
                    }
                }

                @Override
                public final void onAnimationEnd(Animator animator) {
                    switch (i11) {
                        case 0:
                            viewPropertyAnimatorAnimate2.setListener(null);
                            view2.setAlpha(1.0f);
                            DialogsItemAnimator dialogsItemAnimator2 = dialogsItemAnimator;
                            RecyclerView.ViewHolder viewHolder3 = viewHolder2;
                            dialogsItemAnimator2.dispatchAnimationFinished(viewHolder3);
                            dialogsItemAnimator2.mRemoveAnimations.remove(viewHolder3);
                            if (!dialogsItemAnimator2.isRunning()) {
                                dialogsItemAnimator2.dispatchAnimationsFinished();
                            }
                            break;
                        default:
                            viewPropertyAnimatorAnimate2.setListener(null);
                            DialogsItemAnimator dialogsItemAnimator3 = dialogsItemAnimator;
                            dialogsItemAnimator3.getClass();
                            RecyclerView.ViewHolder viewHolder4 = viewHolder2;
                            dialogsItemAnimator3.dispatchAnimationFinished(viewHolder4);
                            dialogsItemAnimator3.mAddAnimations.remove(viewHolder4);
                            if (!dialogsItemAnimator3.isRunning()) {
                                dialogsItemAnimator3.dispatchAnimationsFinished();
                            }
                            View view3 = viewHolder4.itemView;
                            if (view3 instanceof DialogCell) {
                                ((DialogCell) view3).setMoving(false);
                            }
                            break;
                    }
                }

                @Override
                public final void onAnimationStart(Animator animator) {
                    switch (i11) {
                        case 0:
                            dialogsItemAnimator.onRemoveStarting();
                            break;
                        default:
                            dialogsItemAnimator.getClass();
                            break;
                    }
                }
            }).start();
            dialogsItemAnimator = this;
            i = i10;
        }
        arrayList7.clear();
        arrayList8.remove(arrayList7);
    }
}
