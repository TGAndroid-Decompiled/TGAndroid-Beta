package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
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
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$InputPeer;
import org.telegram.tgnet.TLRPC$Peer;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.GroupCreateUserCell;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.ShadowSectionCell;
import org.telegram.ui.Components.JoinCallAlert;
import org.telegram.ui.Components.RecyclerListView;

public class CreateGroupCallBottomSheet extends BottomSheetWithRecyclerListView {
    private final List chats;
    private final boolean isChannelOrGiga;
    private boolean isScheduleSelected;
    private final JoinCallAlert.JoinCallAlertDelegate joinCallDelegate;
    private final boolean needSelector;
    private TLRPC$InputPeer selectAfterDismiss;
    private TLRPC$Peer selectedPeer;

    private static class TopCell extends LinearLayout {
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
            textView.setText(z ? LocaleController.formatString("StartVoipChannelTitle", R.string.StartVoipChannelTitle, new Object[0]) : LocaleController.formatString("StartVoipChatTitle", R.string.StartVoipChatTitle, new Object[0]));
            textView.setTextSize(1, 20.0f);
            textView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText));
            addView(textView, LayoutHelper.createLinear(-2, -2, 1, 0, 14, 0, 7));
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 14.0f);
            textView2.setGravity(1);
            textView2.setTextColor(Theme.getColor(Theme.key_dialogTextBlack));
            textView2.setText(z ? LocaleController.formatString("VoipChannelStart2", R.string.VoipChannelStart2, new Object[0]) : LocaleController.formatString("VoipGroupStart2", R.string.VoipGroupStart2, new Object[0]));
            textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
            addView(textView2, LayoutHelper.createLinear(-2, -2, 1, 28, 0, 28, 17));
        }
    }

    public CreateGroupCallBottomSheet(BaseFragment baseFragment, ArrayList arrayList, long j, JoinCallAlert.JoinCallAlertDelegate joinCallAlertDelegate) {
        super(baseFragment, false, false);
        TLRPC$Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j));
        this.topPadding = 0.26f;
        ArrayList arrayList2 = new ArrayList(arrayList);
        this.chats = arrayList2;
        this.joinCallDelegate = joinCallAlertDelegate;
        boolean isChannelOrGiga = ChatObject.isChannelOrGiga(chat);
        this.isChannelOrGiga = isChannelOrGiga;
        this.selectedPeer = (TLRPC$Peer) arrayList2.get(0);
        this.needSelector = arrayList2.size() > 1;
        Context context = this.containerView.getContext();
        this.containerView.addView(new View(context) {
            @Override
            protected void onDraw(Canvas canvas) {
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
        textView.setText(isChannelOrGiga ? LocaleController.formatString("VoipChannelStartVoiceChat", R.string.VoipChannelStartVoiceChat, new Object[0]) : LocaleController.formatString("VoipGroupStartVoiceChat", R.string.VoipGroupStartVoiceChat, new Object[0]));
        textView.setTextColor(Theme.getColor(Theme.key_featuredStickers_buttonText));
        int dp = AndroidUtilities.dp(8.0f);
        int i = Theme.key_featuredStickers_addButton;
        textView.setBackground(Theme.createSimpleSelectorRoundRectDrawable(dp, Theme.getColor(i), ColorUtils.setAlphaComponent(Theme.getColor(Theme.key_windowBackgroundWhite), 120)));
        this.containerView.addView(textView, LayoutHelper.createFrame(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 60.0f));
        TextView textView2 = new TextView(context);
        textView2.setGravity(17);
        textView2.setEllipsize(truncateAt);
        textView2.setSingleLine(true);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setText(isChannelOrGiga ? LocaleController.formatString("VoipChannelScheduleVoiceChat", R.string.VoipChannelScheduleVoiceChat, new Object[0]) : LocaleController.formatString("VoipGroupScheduleVoiceChat", R.string.VoipGroupScheduleVoiceChat, new Object[0]));
        if (Build.VERSION.SDK_INT >= 21) {
            textView2.setLetterSpacing(0.025f);
        }
        textView2.setTextColor(Theme.getColor(i));
        textView2.setBackground(Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.dp(8.0f), 0, ColorUtils.setAlphaComponent(Theme.getColor(i), 120)));
        this.containerView.addView(textView2, LayoutHelper.createFrame(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 6.0f));
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                CreateGroupCallBottomSheet.this.lambda$new$0(view);
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                CreateGroupCallBottomSheet.this.lambda$new$1(view);
            }
        });
        RecyclerListView recyclerListView = this.recyclerListView;
        int i2 = this.backgroundPaddingLeft;
        recyclerListView.setPadding(i2, 0, i2, AndroidUtilities.dp(120.0f));
        this.recyclerListView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view, int i3) {
                CreateGroupCallBottomSheet.this.lambda$new$2(view, i3);
            }
        });
        fixNavigationBar();
        updateTitle();
    }

    public void lambda$new$0(View view) {
        this.selectAfterDismiss = MessagesController.getInstance(this.currentAccount).getInputPeer(MessageObject.getPeerId(this.selectedPeer));
        dismiss();
    }

    public void lambda$new$1(View view) {
        this.selectAfterDismiss = MessagesController.getInstance(this.currentAccount).getInputPeer(MessageObject.getPeerId(this.selectedPeer));
        this.isScheduleSelected = true;
        dismiss();
    }

    public void lambda$new$2(View view, int i) {
        if (i <= 3) {
            return;
        }
        this.selectedPeer = (TLRPC$Peer) this.chats.get(i - 4);
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

    public static void show(ArrayList arrayList, BaseFragment baseFragment, long j, JoinCallAlert.JoinCallAlertDelegate joinCallAlertDelegate) {
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
        return new RecyclerListView.SelectionAdapter() {
            @Override
            public int getItemCount() {
                if (CreateGroupCallBottomSheet.this.needSelector) {
                    return CreateGroupCallBottomSheet.this.chats.size() + 3;
                }
                return 1;
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
                TLObject chat;
                String str;
                if (viewHolder.getItemViewType() != 3) {
                    if (viewHolder.getItemViewType() == 2) {
                        HeaderCell headerCell = (HeaderCell) viewHolder.itemView;
                        headerCell.setTextSize(15.0f);
                        headerCell.setPadding(0, 0, 0, AndroidUtilities.dp(2.0f));
                        headerCell.setText(LocaleController.getString(R.string.VoipChatDisplayedAs).replace(":", ""));
                        return;
                    }
                    return;
                }
                TLRPC$Peer tLRPC$Peer = (TLRPC$Peer) CreateGroupCallBottomSheet.this.chats.get(i - 3);
                long peerId = MessageObject.getPeerId(tLRPC$Peer);
                CreateGroupCallBottomSheet createGroupCallBottomSheet = CreateGroupCallBottomSheet.this;
                if (peerId > 0) {
                    chat = MessagesController.getInstance(((BottomSheet) createGroupCallBottomSheet).currentAccount).getUser(Long.valueOf(peerId));
                    str = LocaleController.getString(R.string.VoipGroupPersonalAccount);
                } else {
                    chat = MessagesController.getInstance(((BottomSheet) createGroupCallBottomSheet).currentAccount).getChat(Long.valueOf(-peerId));
                    str = null;
                }
                GroupCreateUserCell groupCreateUserCell = (GroupCreateUserCell) viewHolder.itemView;
                groupCreateUserCell.setObject(chat, null, str, i != getItemCount() - 1);
                groupCreateUserCell.setChecked(tLRPC$Peer == CreateGroupCallBottomSheet.this.selectedPeer, false);
            }

            @Override
            public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                Context context = viewGroup.getContext();
                View topCell = i != 1 ? i != 2 ? i != 3 ? new TopCell(context, CreateGroupCallBottomSheet.this.isChannelOrGiga) : new GroupCreateUserCell(context, 1, 0, false) : new HeaderCell(context, 22) : new ShadowSectionCell(context, 12, Theme.getColor(Theme.key_windowBackgroundGray));
                topCell.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
                return new RecyclerListView.Holder(topCell);
            }
        };
    }

    @Override
    public void dismissInternal() {
        super.dismissInternal();
        TLRPC$InputPeer tLRPC$InputPeer = this.selectAfterDismiss;
        if (tLRPC$InputPeer != null) {
            this.joinCallDelegate.didSelectChat(tLRPC$InputPeer, this.chats.size() > 1, this.isScheduleSelected);
        }
    }

    @Override
    protected CharSequence getTitle() {
        return LocaleController.getString(this.isChannelOrGiga ? R.string.StartVoipChannelTitle : R.string.StartVoipChatTitle);
    }
}
