package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.GroupCreateUserCell;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;

public class CreateGroupCallBottomSheet extends BottomSheetWithRecyclerListView {
    private static final int CONTAINER_HEIGHT_DP = 120;
    private static final int CONTENT_VIEWS_COUNT = 3;
    private static final int HOLDER_TYPE_HEADER = 0;
    private static final int HOLDER_TYPE_SHADOW_TEXT = 1;
    private static final int HOLDER_TYPE_SUBTITLE = 2;
    private static final int HOLDER_TYPE_USER = 3;
    private final boolean canRtmpStream;
    private final List<TLRPC.Peer> chats;
    private final long dialogId;
    private final BaseFragment fragment;
    private final boolean isChannelOrGiga;
    private boolean isScheduleSelected;
    private final JoinCallAlert.JoinCallAlertDelegate joinCallDelegate;
    private final boolean needSelector;
    private TLRPC.InputPeer selectAfterDismiss;
    private TLRPC.Peer selectedPeer;

    public class AnonymousClass2 extends RecyclerListView.SelectionAdapter {
        public AnonymousClass2() {
        }

        public void lambda$onBindViewHolder$0() {
            CreateRtmpStreamBottomSheet.show(CreateGroupCallBottomSheet.this.selectedPeer, CreateGroupCallBottomSheet.this.fragment, CreateGroupCallBottomSheet.this.dialogId, CreateGroupCallBottomSheet.this.chats.size() > 1, CreateGroupCallBottomSheet.this.joinCallDelegate);
        }

        @Override
        public int getItemCount() {
            if (CreateGroupCallBottomSheet.this.needSelector) {
                return CreateGroupCallBottomSheet.this.chats.size() + 3;
            }
            return CreateGroupCallBottomSheet.this.canRtmpStream ? 2 : 1;
        }

        @Override
        public int getItemViewType(int i) {
            if (i == 0) {
                return 0;
            }
            int i2 = 1;
            if (i != 1) {
                i2 = 2;
                if (i != 2) {
                    return 3;
                }
            }
            return i2;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return viewHolder.getItemViewType() == 3;
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            Object chat;
            String string;
            if (viewHolder.getItemViewType() != 3) {
                if (viewHolder.getItemViewType() != 2) {
                    if (viewHolder.getItemViewType() == 1) {
                        ((TextInfoPrivacyCell) viewHolder.itemView).setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.VoipChatStreamWithAnotherApp), Theme.key_windowBackgroundWhiteBlueHeader, 0, new Bulletin$2$$ExternalSyntheticLambda1(this, 9)), true, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f)));
                        return;
                    }
                    return;
                } else {
                    HeaderCell headerCell = (HeaderCell) viewHolder.itemView;
                    headerCell.setTextSize(15.0f);
                    headerCell.setPadding(0, 0, 0, AndroidUtilities.dp(2.0f));
                    headerCell.setText(LocaleController.getString(R.string.VoipChatDisplayedAs).replace(":", ""));
                    return;
                }
            }
            TLRPC.Peer peer = (TLRPC.Peer) CreateGroupCallBottomSheet.this.chats.get(i - 3);
            long peerId = MessageObject.getPeerId(peer);
            if (peerId > 0) {
                chat = MessagesController.getInstance(((BottomSheet) CreateGroupCallBottomSheet.this).currentAccount).getUser(Long.valueOf(peerId));
                string = LocaleController.getString(R.string.VoipGroupPersonalAccount);
            } else {
                chat = MessagesController.getInstance(((BottomSheet) CreateGroupCallBottomSheet.this).currentAccount).getChat(Long.valueOf(-peerId));
                string = null;
            }
            GroupCreateUserCell groupCreateUserCell = (GroupCreateUserCell) viewHolder.itemView;
            boolean z = i != getItemCount() - 1;
            groupCreateUserCell.setObject(chat, null, string);
            groupCreateUserCell.drawDivider = z;
            groupCreateUserCell.setChecked(peer == CreateGroupCallBottomSheet.this.selectedPeer, false);
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View headerCell;
            Context context = viewGroup.getContext();
            if (i == 1) {
                TextInfoPrivacyCell textInfoPrivacyCell = new TextInfoPrivacyCell(context, 24, null);
                textInfoPrivacyCell.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundGray, ((BottomSheet) CreateGroupCallBottomSheet.this).resourcesProvider));
                textInfoPrivacyCell.setTopPadding(17);
                textInfoPrivacyCell.setBottomPadding(17);
                headerCell = textInfoPrivacyCell;
            } else if (i != 2) {
                headerCell = i != 3 ? new TopCell(context, CreateGroupCallBottomSheet.this.isChannelOrGiga) : new GroupCreateUserCell(1, 0, context, null, false, false);
            } else {
                headerCell = new HeaderCell(context, 22);
            }
            headerCell.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            return new RecyclerListView.Holder(headerCell);
        }
    }

    public static class TopCell extends LinearLayout {
        public TopCell(Context context, boolean z) {
            super(context);
            setOrientation(1);
            RLottieImageView rLottieImageView = new RLottieImageView(context);
            rLottieImageView.setAutoRepeat(true);
            rLottieImageView.setAnimation(R.raw.utyan_schedule, 112, 112);
            rLottieImageView.playAnimation();
            addView(rLottieImageView, LayoutHelper.createLinear(112, 112, 49, 0, 24, 0, 0));
            TextView textView = new TextView(context);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setText(z ? LocaleController.formatString(R.string.StartVoipChannelTitle, new Object[0]) : LocaleController.formatString(R.string.StartVoipChatTitle, new Object[0]));
            textView.setTextSize(1, 20.0f);
            textView.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false));
            addView(textView, LayoutHelper.createLinear(-2, -2, 1, 0, 14, 0, 7));
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 14.0f);
            textView2.setGravity(1);
            textView2.setTextColor(Theme.getColor(null, Theme.key_dialogTextBlack, false));
            textView2.setText(z ? LocaleController.formatString(R.string.VoipChannelStart2, new Object[0]) : LocaleController.formatString(R.string.VoipGroupStart2, new Object[0]));
            textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
            addView(textView2, LayoutHelper.createLinear(-2, -2, 1, 28, 0, 28, 17));
        }
    }

    public CreateGroupCallBottomSheet(BaseFragment baseFragment, ArrayList<TLRPC.Peer> arrayList, long j, JoinCallAlert.JoinCallAlertDelegate joinCallAlertDelegate) {
        super(baseFragment, false, false);
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j));
        this.fragment = baseFragment;
        this.dialogId = j;
        this.topPadding = 0.26f;
        ArrayList arrayList2 = new ArrayList(arrayList);
        this.chats = arrayList2;
        this.joinCallDelegate = joinCallAlertDelegate;
        boolean zIsChannelOrGiga = ChatObject.isChannelOrGiga(chat);
        this.isChannelOrGiga = zIsChannelOrGiga;
        this.selectedPeer = (TLRPC.Peer) arrayList2.get(0);
        this.needSelector = arrayList2.size() > 1;
        this.canRtmpStream = ChatObject.canManageCalls(chat);
        Context context = this.containerView.getContext();
        this.containerView.addView(new View(context) {
            @Override
            public void onDraw(Canvas canvas) {
                if (CreateGroupCallBottomSheet.this.needSelector) {
                    canvas.drawRect(((BottomSheet) CreateGroupCallBottomSheet.this).backgroundPaddingLeft, 0.0f, getMeasuredWidth() - ((BottomSheet) CreateGroupCallBottomSheet.this).backgroundPaddingLeft, 1.0f, Theme.dividerPaint);
                }
            }
        }, LayoutHelper.createFrame(-1, 120.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        textView.setGravity(17);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setSingleLine(true);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(zIsChannelOrGiga ? LocaleController.formatString(R.string.VoipChannelStartVoiceChat, new Object[0]) : LocaleController.formatString(R.string.VoipGroupStartVoiceChat, new Object[0]));
        textView.setTextColor(Theme.getColor(null, Theme.key_featuredStickers_buttonText, false));
        int iDp = AndroidUtilities.dp(8.0f);
        int i = Theme.key_featuredStickers_addButton;
        int color = Theme.getColor(null, i, false);
        int alphaComponent = ColorUtils.setAlphaComponent(Theme.getColor(null, Theme.key_windowBackgroundWhite, false), 120);
        textView.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp, iDp, iDp, iDp, color, alphaComponent, alphaComponent));
        this.containerView.addView(textView, LayoutHelper.createFrame(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 60.0f));
        TextView textView2 = new TextView(context);
        textView2.setGravity(17);
        textView2.setEllipsize(truncateAt);
        textView2.setSingleLine(true);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setText(zIsChannelOrGiga ? LocaleController.formatString(R.string.VoipChannelScheduleVoiceChat, new Object[0]) : LocaleController.formatString(R.string.VoipGroupScheduleVoiceChat, new Object[0]));
        textView2.setLetterSpacing(0.025f);
        textView2.setTextColor(Theme.getColor(null, i, false));
        int iDp2 = AndroidUtilities.dp(8.0f);
        int alphaComponent2 = ColorUtils.setAlphaComponent(Theme.getColor(null, i, false), 120);
        textView2.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp2, iDp2, iDp2, iDp2, 0, alphaComponent2, alphaComponent2));
        this.containerView.addView(textView2, LayoutHelper.createFrame(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 6.0f));
        final int i2 = 0;
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final CreateGroupCallBottomSheet f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        this.f$0.lambda$new$0(view);
                        break;
                    default:
                        this.f$0.lambda$new$1(view);
                        break;
                }
            }
        });
        final int i3 = 1;
        textView2.setOnClickListener(new View.OnClickListener(this) {
            public final CreateGroupCallBottomSheet f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i3) {
                    case 0:
                        this.f$0.lambda$new$0(view);
                        break;
                    default:
                        this.f$0.lambda$new$1(view);
                        break;
                }
            }
        });
        RecyclerListView recyclerListView = this.recyclerListView;
        int i4 = this.backgroundPaddingLeft;
        recyclerListView.setPadding(i4, 0, i4, AndroidUtilities.dp(120.0f));
        this.recyclerListView.setOnItemClickListener(new StarAppsSheet$$ExternalSyntheticLambda0(this, 7));
        fixNavigationBar();
        updateTitle();
    }

    public void lambda$new$0(View view) {
        this.selectAfterDismiss = MessagesController.getInstance(this.currentAccount).getInputPeer(MessageObject.getPeerId(this.selectedPeer));
        lambda$showGiftOfferSheet$15();
    }

    public void lambda$new$1(View view) {
        this.selectAfterDismiss = MessagesController.getInstance(this.currentAccount).getInputPeer(MessageObject.getPeerId(this.selectedPeer));
        this.isScheduleSelected = true;
        lambda$showGiftOfferSheet$15();
    }

    public void lambda$new$2(View view, int i) {
        if (i <= 3) {
            return;
        }
        this.selectedPeer = this.chats.get(i - 4);
        if (view instanceof GroupCreateUserCell) {
            ((GroupCreateUserCell) view).setChecked(true, true);
        }
        for (int i2 = 0; i2 < this.recyclerListView.getChildCount(); i2++) {
            View childAt = this.recyclerListView.getChildAt(i2);
            if (childAt != view && (childAt instanceof GroupCreateUserCell)) {
                ((GroupCreateUserCell) childAt).setChecked(false, true);
            }
        }
    }

    public static void show(ArrayList<TLRPC.Peer> arrayList, BaseFragment baseFragment, long j, JoinCallAlert.JoinCallAlertDelegate joinCallAlertDelegate) {
        if (arrayList.isEmpty()) {
            return;
        }
        CreateGroupCallBottomSheet createGroupCallBottomSheet = new CreateGroupCallBottomSheet(baseFragment, arrayList, j, joinCallAlertDelegate);
        if (baseFragment == null || baseFragment.getParentActivity() == null) {
            createGroupCallBottomSheet.show();
        } else {
            baseFragment.showDialog(createGroupCallBottomSheet);
        }
    }

    @Override
    public RecyclerListView.SelectionAdapter createAdapter(RecyclerListView recyclerListView) {
        return new AnonymousClass2();
    }

    @Override
    public void dismissInternal() {
        super.dismissInternal();
        TLRPC.InputPeer inputPeer = this.selectAfterDismiss;
        if (inputPeer != null) {
            this.joinCallDelegate.didSelectChat(inputPeer, this.chats.size() > 1, this.isScheduleSelected, false);
        }
    }

    @Override
    public CharSequence getTitle() {
        return this.isChannelOrGiga ? LocaleController.getString(R.string.StartVoipChannelTitle) : LocaleController.getString(R.string.StartVoipChatTitle);
    }

    @Override
    public void setLastVisible(boolean z) {
    }
}
