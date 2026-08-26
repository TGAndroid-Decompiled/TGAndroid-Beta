package org.telegram.ui.Components.poll;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.math.MathUtils;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AiTonesController$$ExternalSyntheticLambda0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AvatarsListDrawable;
import org.telegram.ui.Components.FlickerLoadingView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.Tooltip$$ExternalSyntheticLambda0;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.MessageSeenView;

public final class RecentVotersCell extends FrameLayout {
    public final AvatarsListDrawable avatarsListDrawable;
    public AnonymousClass1 listView;
    public final TextView textView;

    public final class Factory extends UItem.UItemFactory {
        public static final int $r8$clinit = 0;

        static {
            UItem.UItemFactory.setup(new Factory());
        }

        @Override
        public final void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
            MessageSeenView.UserCell userCell = (MessageSeenView.UserCell) view;
            userCell.setUser((TLObject) uItem.object, true, uItem.intValue);
            userCell.setOnClickListener(uItem.clickCallback);
        }

        @Override
        public final boolean contentsEquals(UItem uItem, UItem uItem2) {
            return uItem.longValue == uItem2.longValue;
        }

        @Override
        public final View createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
            MessageSeenView.UserCell userCell = new MessageSeenView.UserCell(context);
            userCell.setBackground(Theme.getSelectorDrawable(false));
            return userCell;
        }

        @Override
        public final boolean equals(UItem uItem, UItem uItem2) {
            return uItem.longValue == uItem2.longValue;
        }
    }

    public final class FlickerFactory extends UItem.UItemFactory {
        public static final int $r8$clinit = 0;

        static {
            UItem.UItemFactory.setup(new FlickerFactory());
        }

        @Override
        public final View createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
            FlickerLoadingView flickerLoadingView = new FlickerLoadingView(context, null);
            flickerLoadingView.setViewType(16);
            flickerLoadingView.setMinimumHeight(AndroidUtilities.dp(48.0f));
            return flickerLoadingView;
        }
    }

    public final class FlickerFactory2 extends UItem.UItemFactory {
        public static final int $r8$clinit = 0;

        static {
            UItem.UItemFactory.setup(new FlickerFactory2());
        }

        @Override
        public final View createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
            FlickerLoadingView flickerLoadingView = new FlickerLoadingView(context, null);
            flickerLoadingView.setViewType(16);
            flickerLoadingView.setMinimumHeight(AndroidUtilities.dp(48.0f));
            return flickerLoadingView;
        }
    }

    public final class VotesList {
        public boolean completed;
        public final int currentAccount;
        public boolean loading;
        public final int msgId;
        public String nextOffset;
        public final Utilities.Callback onClick;
        public final Tooltip$$ExternalSyntheticLambda0 onUpdate;
        public final byte[] option;
        public final TLRPC.InputPeer peer;
        public final ArrayList votes = new ArrayList();

        public VotesList(int i, TLRPC.InputPeer inputPeer, int i2, byte[] bArr, Tooltip$$ExternalSyntheticLambda0 tooltip$$ExternalSyntheticLambda0, Utilities.Callback callback) {
            this.currentAccount = i;
            this.peer = inputPeer;
            this.msgId = i2;
            this.option = bArr;
            this.onUpdate = tooltip$$ExternalSyntheticLambda0;
            this.onClick = callback;
        }

        public final void load() {
            if (this.completed || this.loading) {
                return;
            }
            this.loading = true;
            TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
            String str = this.nextOffset;
            tL_messages_getPollVotes.limit = str != null ? 10 : 15;
            tL_messages_getPollVotes.peer = this.peer;
            tL_messages_getPollVotes.id = this.msgId;
            tL_messages_getPollVotes.option = this.option;
            tL_messages_getPollVotes.offset = str;
            ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(tL_messages_getPollVotes, new AiTonesController$$ExternalSyntheticLambda0(), new RecentVotersCell$$ExternalSyntheticLambda2(this, 1));
        }
    }

    public RecentVotersCell(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.avatarsListDrawable = new AvatarsListDrawable(i, this, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dpf2(1.0f));
        TextView textView = new TextView(context);
        this.textView = textView;
        textView.setTextColor(Theme.getColor(Theme.key_actionBarDefaultSubmenuItem, resourcesProvider));
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setGravity(19);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextSize(1, 16.0f);
        setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(68.0f), 0);
        addView(textView, LayoutHelper.createFrame(-1.0f, -1));
    }

    public final AnonymousClass1 createListView(BaseFragment baseFragment, long j, int i, byte[] bArr, int i2, Utilities.Callback callback) {
        AnonymousClass1 anonymousClass1 = this.listView;
        if (anonymousClass1 != null) {
            return anonymousClass1;
        }
        final VotesList votesList = new VotesList(baseFragment.getCurrentAccount(), baseFragment.getMessagesController().getInputPeer(j), i, bArr, new Tooltip$$ExternalSyntheticLambda0(this, 22), callback);
        AndroidUtilities.runOnUIThread(new Tooltip$$ExternalSyntheticLambda0(votesList, 23), 1000L);
        ?? r10 = new UniversalRecyclerView(baseFragment, new RecentVotersCell$$ExternalSyntheticLambda2(votesList, 0), i2) {
            public final int val$estimated;

            {
                super(baseFragment.getContext(), baseFragment.getCurrentAccount(), baseFragment.getClassGuid(), recentVotersCell$$ExternalSyntheticLambda2, null, null, baseFragment.getResourceProvider());
                this.val$estimated = i2;
            }

            @Override
            public final void onMeasure(int i3, int i4) {
                int iMin = Math.min(AndroidUtilities.dp(220.0f), View.MeasureSpec.getSize(i3));
                View.MeasureSpec.getSize(i4);
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(MathUtils.clamp(this.val$estimated, 1, 5) * 48), 1073741824));
            }
        };
        this.listView = r10;
        r10.adapter.applyBackground = false;
        r10.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public final void onScrolled(RecyclerView recyclerView, int i3, int i4) {
                VotesList votesList2 = votesList;
                if (votesList2.completed || votesList2.loading) {
                    return;
                }
                RecentVotersCell recentVotersCell = RecentVotersCell.this;
                if ((recentVotersCell.listView.adapter.items.size() - 1) - recentVotersCell.listView.layoutManager.findLastCompletelyVisibleItemPosition() < 5) {
                    votesList2.load();
                }
            }
        });
        return this.listView;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int width = getWidth() - AndroidUtilities.dp(11.0f);
        AvatarsListDrawable avatarsListDrawable = this.avatarsListDrawable;
        avatarsListDrawable.setBounds(width - ((int) avatarsListDrawable.animator.metadata.totalWidth.now), AndroidUtilities.dp(12.0f), getWidth() - AndroidUtilities.dp(11.0f), AndroidUtilities.dp(24.0f) + AndroidUtilities.dp(12.0f));
        avatarsListDrawable.draw$1(canvas);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.avatarsListDrawable.attach();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.avatarsListDrawable.detach();
    }

    public void setText(String str) {
        this.textView.setText(str);
    }
}
