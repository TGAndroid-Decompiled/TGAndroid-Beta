package org.telegram.ui.Adapters;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.AdapterHelper;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.BuildVars;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.QrActivity;

public final class PaddedListAdapter extends RecyclerListView.SelectionAdapter {
    public int lastPadding;
    public QrActivity.AnonymousClass2 paddingView;
    public final MentionsAdapter wrappedAdapter;
    public Integer padding = null;
    public boolean paddingViewAttached = false;

    public PaddedListAdapter(MentionsAdapter mentionsAdapter) {
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(this, 0);
        this.wrappedAdapter = mentionsAdapter;
        mentionsAdapter.mObservable.registerObserver(anonymousClass2);
    }

    @Override
    public final int getItemCount() {
        MentionsAdapter mentionsAdapter = this.wrappedAdapter;
        int itemCountInternal = mentionsAdapter.getItemCountInternal();
        mentionsAdapter.lastItemCount = itemCountInternal;
        return itemCountInternal + 1;
    }

    @Override
    public final int getItemViewType(int i) {
        if (i == 0) {
            return -983904;
        }
        return this.wrappedAdapter.getItemViewType(i - 1);
    }

    @Override
    public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
        if (viewHolder.getAdapterPosition() == 0) {
            return false;
        }
        return this.wrappedAdapter.isEnabled(viewHolder);
    }

    @Override
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (i > 0) {
            this.wrappedAdapter.onBindViewHolder(viewHolder, i - 1);
        }
    }

    @Override
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i != -983904) {
            return this.wrappedAdapter.onCreateViewHolder(viewGroup, i);
        }
        QrActivity.AnonymousClass2 anonymousClass2 = new QrActivity.AnonymousClass2(this, viewGroup.getContext(), 2);
        this.paddingView = anonymousClass2;
        return new RecyclerListView.Holder(anonymousClass2);
    }

    public final class AnonymousClass2 extends RecyclerView.AdapterDataObserver {
        public final int $r8$classId;
        public final Object this$0;

        public AnonymousClass2(Object obj, int i) {
            this.$r8$classId = i;
            this.this$0 = obj;
        }

        @Override
        public final void onChanged() {
            switch (this.$r8$classId) {
                case 0:
                    ((PaddedListAdapter) this.this$0).notifyDataSetChanged();
                    break;
                case 1:
                    RecyclerView recyclerView = (RecyclerView) this.this$0;
                    recyclerView.assertNotInLayoutOrScroll(null);
                    recyclerView.mState.mStructureChanged = true;
                    if (BuildVars.DEBUG_VERSION) {
                        recyclerView.mAdapterHelper.logNotify("notifyDataSetChanged()");
                    }
                    recyclerView.processDataSetCompletelyChanged(true);
                    if (((ArrayList) recyclerView.mAdapterHelper.mPendingUpdates).size() <= 0) {
                        recyclerView.requestLayout();
                        break;
                    }
                    break;
                default:
                    RecyclerListView recyclerListView = (RecyclerListView) this.this$0;
                    recyclerListView.checkIfEmpty(true);
                    if (recyclerListView.resetSelectorOnChanged) {
                        recyclerListView.currentFirst = -1;
                        if (recyclerListView.removeHighlighSelectionRunnable == null) {
                            recyclerListView.selectorRect.setEmpty();
                        }
                    }
                    recyclerListView.invalidate();
                    break;
            }
        }

        @Override
        public void onItemRangeChanged(int i, int i2, Object obj) {
            switch (this.$r8$classId) {
                case 1:
                    RecyclerView recyclerView = (RecyclerView) this.this$0;
                    recyclerView.assertNotInLayoutOrScroll(null);
                    AdapterHelper adapterHelper = recyclerView.mAdapterHelper;
                    adapterHelper.getClass();
                    if (i2 >= 1) {
                        if (BuildVars.DEBUG_VERSION) {
                            StringBuilder sbM = DiffUtil.m("onItemRangeChanged(", i, ", ", i2, ", ");
                            sbM.append(obj);
                            sbM.append(")");
                            adapterHelper.logNotify(sbM.toString());
                        }
                        ArrayList arrayList = (ArrayList) adapterHelper.mPendingUpdates;
                        arrayList.add(adapterHelper.obtainUpdateOp(4, i, obj, i2));
                        adapterHelper.mExistingUpdateTypes |= 4;
                        if (arrayList.size() == 1) {
                            triggerUpdateProcessor();
                        }
                        break;
                    }
                    break;
                default:
                    super.onItemRangeChanged(i, i2, obj);
                    break;
            }
        }

        @Override
        public final void onItemRangeInserted(int i, int i2) {
            switch (this.$r8$classId) {
                case 0:
                    ((PaddedListAdapter) this.this$0).mObservable.notifyItemRangeInserted(i + 1, i2);
                    break;
                case 1:
                    RecyclerView recyclerView = (RecyclerView) this.this$0;
                    recyclerView.assertNotInLayoutOrScroll(null);
                    AdapterHelper adapterHelper = recyclerView.mAdapterHelper;
                    adapterHelper.getClass();
                    if (i2 >= 1) {
                        if (BuildVars.DEBUG_VERSION) {
                            adapterHelper.logNotify("onItemRangeInserted(" + i + ", " + i2 + ")");
                        }
                        ArrayList arrayList = (ArrayList) adapterHelper.mPendingUpdates;
                        arrayList.add(adapterHelper.obtainUpdateOp(1, i, null, i2));
                        adapterHelper.mExistingUpdateTypes |= 1;
                        if (arrayList.size() == 1) {
                            triggerUpdateProcessor();
                        }
                        break;
                    }
                    break;
                default:
                    RecyclerListView recyclerListView = (RecyclerListView) this.this$0;
                    recyclerListView.checkIfEmpty(true);
                    View view = recyclerListView.pinnedHeader;
                    if (view != null && view.getAlpha() == 0.0f) {
                        recyclerListView.currentFirst = -1;
                        recyclerListView.invalidateViews();
                        break;
                    }
                    break;
            }
        }

        @Override
        public void onItemRangeMoved(int i, int i2) {
            switch (this.$r8$classId) {
                case 0:
                    ((PaddedListAdapter) this.this$0).mObservable.notifyItemRangeChanged(i + 1, i2 + 2, null);
                    break;
                case 1:
                    RecyclerView recyclerView = (RecyclerView) this.this$0;
                    recyclerView.assertNotInLayoutOrScroll(null);
                    AdapterHelper adapterHelper = recyclerView.mAdapterHelper;
                    adapterHelper.getClass();
                    if (i != i2) {
                        if (BuildVars.DEBUG_VERSION) {
                            adapterHelper.logNotify("onItemRangeMoved(" + i + ", " + i2 + ", 1)");
                        }
                        ArrayList arrayList = (ArrayList) adapterHelper.mPendingUpdates;
                        arrayList.add(adapterHelper.obtainUpdateOp(8, i, null, i2));
                        adapterHelper.mExistingUpdateTypes |= 8;
                        if (arrayList.size() == 1) {
                            triggerUpdateProcessor();
                        }
                        break;
                    }
                    break;
            }
        }

        @Override
        public final void onItemRangeRemoved(int i, int i2) {
            switch (this.$r8$classId) {
                case 0:
                    ((PaddedListAdapter) this.this$0).mObservable.notifyItemRangeRemoved(i + 1, i2);
                    break;
                case 1:
                    RecyclerView recyclerView = (RecyclerView) this.this$0;
                    recyclerView.assertNotInLayoutOrScroll(null);
                    AdapterHelper adapterHelper = recyclerView.mAdapterHelper;
                    adapterHelper.getClass();
                    if (i2 >= 1) {
                        if (BuildVars.DEBUG_VERSION) {
                            adapterHelper.logNotify("onItemRangeRemoved(" + i + ", " + i2 + ")");
                        }
                        ArrayList arrayList = (ArrayList) adapterHelper.mPendingUpdates;
                        arrayList.add(adapterHelper.obtainUpdateOp(2, i, null, i2));
                        adapterHelper.mExistingUpdateTypes |= 2;
                        if (arrayList.size() == 1) {
                            triggerUpdateProcessor();
                        }
                        break;
                    }
                    break;
                default:
                    ((RecyclerListView) this.this$0).checkIfEmpty(true);
                    break;
            }
        }

        public void triggerUpdateProcessor() {
            boolean z = RecyclerView.POST_UPDATES_ON_ANIMATION;
            RecyclerView recyclerView = (RecyclerView) this.this$0;
            if (!z || !recyclerView.mHasFixedSize || !recyclerView.mIsAttached) {
                recyclerView.requestLayout();
            } else {
                WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
                recyclerView.postOnAnimation(recyclerView.mUpdateChildViewsRunnable);
            }
        }

        @Override
        public void onItemRangeChanged(int i, int i2) {
            switch (this.$r8$classId) {
                case 0:
                    ((PaddedListAdapter) this.this$0).mObservable.notifyItemRangeChanged(i + 1, i2, null);
                    break;
            }
        }
    }
}
