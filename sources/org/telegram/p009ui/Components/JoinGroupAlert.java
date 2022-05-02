package org.telegram.p009ui.Components;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.C0890R;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.p009ui.ActionBar.BaseFragment;
import org.telegram.p009ui.ActionBar.BottomSheet;
import org.telegram.p009ui.ActionBar.Theme;
import org.telegram.p009ui.Cells.JoinSheetUserCell;
import org.telegram.p009ui.ChatActivity;
import org.telegram.p009ui.Components.Bulletin;
import org.telegram.p009ui.Components.RecyclerListView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$ChatInvite;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_messages_importChatInvite;
import org.telegram.tgnet.TLRPC$Updates;

public class JoinGroupAlert extends BottomSheet {
    private TLRPC$ChatInvite chatInvite;
    private BaseFragment fragment;
    private String hash;
    private RadialProgressView requestProgressView;
    private TextView requestTextView;

    public JoinGroupAlert(final Context context, TLRPC$ChatInvite tLRPC$ChatInvite, String str, BaseFragment baseFragment) {
        super(context, false);
        int i;
        String str2;
        String str3;
        int i2;
        String str4;
        int i3;
        setApplyBottomPadding(false);
        setApplyTopPadding(false);
        this.fragment = baseFragment;
        this.chatInvite = tLRPC$ChatInvite;
        this.hash = str;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClickable(true);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(linearLayout);
        NestedScrollView nestedScrollView = new NestedScrollView(context);
        nestedScrollView.addView(frameLayout);
        setCustomView(nestedScrollView);
        ImageView imageView = new ImageView(context);
        imageView.setBackground(Theme.createSelectorDrawable(getThemedColor("listSelectorSDK21")));
        imageView.setColorFilter(Theme.getColor("key_sheet_other"));
        imageView.setImageResource(C0890R.C0891drawable.ic_layer_close);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                JoinGroupAlert.this.lambda$new$0(view);
            }
        });
        int dp = AndroidUtilities.m34dp(8.0f);
        imageView.setPadding(dp, dp, dp, dp);
        frameLayout.addView(imageView, LayoutHelper.createFrame(36, 36.0f, 8388661, 6.0f, 8.0f, 6.0f, 0.0f));
        BackupImageView backupImageView = new BackupImageView(context);
        backupImageView.setRoundRadius(AndroidUtilities.m34dp(35.0f));
        linearLayout.addView(backupImageView, LayoutHelper.createLinear(70, 70, 49, 0, 29, 0, 0));
        if (tLRPC$ChatInvite.chat != null) {
            AvatarDrawable avatarDrawable = new AvatarDrawable(tLRPC$ChatInvite.chat);
            TLRPC$Chat tLRPC$Chat = tLRPC$ChatInvite.chat;
            str2 = tLRPC$Chat.title;
            i = tLRPC$Chat.participants_count;
            backupImageView.setForUserOrChat(tLRPC$Chat, avatarDrawable, tLRPC$ChatInvite);
        } else {
            AvatarDrawable avatarDrawable2 = new AvatarDrawable();
            avatarDrawable2.setInfo(0L, tLRPC$ChatInvite.title, null);
            str2 = tLRPC$ChatInvite.title;
            i = tLRPC$ChatInvite.participants_count;
            backupImageView.setImage(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(tLRPC$ChatInvite.photo.sizes, 50), tLRPC$ChatInvite.photo), "50_50", avatarDrawable2, tLRPC$ChatInvite);
        }
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
        textView.setTextSize(1, 17.0f);
        textView.setTextColor(Theme.getColor("dialogTextBlack"));
        textView.setText(str2);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout.addView(textView, LayoutHelper.createLinear(-2, -2, 49, 10, 9, 10, i > 0 ? 0 : 20));
        final boolean z = (tLRPC$ChatInvite.channel && !tLRPC$ChatInvite.megagroup) || ChatObject.isChannelAndNotMegaGroup(tLRPC$ChatInvite.chat);
        boolean z2 = !TextUtils.isEmpty(tLRPC$ChatInvite.about);
        if (i > 0) {
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 14.0f);
            textView2.setTextColor(Theme.getColor("dialogTextGray3"));
            textView2.setSingleLine(true);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            if (z) {
                textView2.setText(LocaleController.formatPluralString("Subscribers", i));
            } else {
                textView2.setText(LocaleController.formatPluralString("Members", i));
            }
            linearLayout.addView(textView2, LayoutHelper.createLinear(-2, -2, 49, 10, 3, 10, z2 ? 0 : 20));
        }
        if (z2) {
            TextView textView3 = new TextView(context);
            textView3.setGravity(17);
            textView3.setText(tLRPC$ChatInvite.about);
            textView3.setTextColor(Theme.getColor("dialogTextBlack"));
            textView3.setTextSize(1, 15.0f);
            linearLayout.addView(textView3, LayoutHelper.createLinear(-1, -2, 48, 24, 10, 24, 20));
        }
        if (tLRPC$ChatInvite.request_needed) {
            FrameLayout frameLayout2 = new FrameLayout(getContext());
            linearLayout.addView(frameLayout2, LayoutHelper.createLinear(-1, -2));
            RadialProgressView radialProgressView = new RadialProgressView(getContext(), this.resourcesProvider);
            this.requestProgressView = radialProgressView;
            radialProgressView.setProgressColor(getThemedColor("featuredStickers_addButton"));
            this.requestProgressView.setSize(AndroidUtilities.m34dp(32.0f));
            this.requestProgressView.setVisibility(4);
            frameLayout2.addView(this.requestProgressView, LayoutHelper.createFrame(48, 48, 17));
            TextView textView4 = new TextView(getContext());
            this.requestTextView = textView4;
            textView4.setBackground(Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.m34dp(6.0f), getThemedColor("featuredStickers_addButton"), getThemedColor("featuredStickers_addButtonPressed")));
            this.requestTextView.setEllipsize(TextUtils.TruncateAt.END);
            this.requestTextView.setGravity(17);
            this.requestTextView.setSingleLine(true);
            TextView textView5 = this.requestTextView;
            if (z) {
                i2 = C0890R.string.RequestToJoinChannel;
                str3 = "RequestToJoinChannel";
            } else {
                i2 = C0890R.string.RequestToJoinGroup;
                str3 = "RequestToJoinGroup";
            }
            textView5.setText(LocaleController.getString(str3, i2));
            this.requestTextView.setTextColor(getThemedColor("featuredStickers_buttonText"));
            this.requestTextView.setTextSize(1, 15.0f);
            this.requestTextView.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
            this.requestTextView.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    JoinGroupAlert.this.lambda$new$5(context, z, view);
                }
            });
            frameLayout2.addView(this.requestTextView, LayoutHelper.createLinear(-1, 48, 8388611, 16, 0, 16, 0));
            TextView textView6 = new TextView(getContext());
            textView6.setGravity(17);
            textView6.setTextSize(1, 14.0f);
            if (z) {
                i3 = C0890R.string.RequestToJoinChannelDescription;
                str4 = "RequestToJoinChannelDescription";
            } else {
                i3 = C0890R.string.RequestToJoinGroupDescription;
                str4 = "RequestToJoinGroupDescription";
            }
            textView6.setText(LocaleController.getString(str4, i3));
            textView6.setTextColor(Theme.getColor("dialogTextGray3"));
            linearLayout.addView(textView6, LayoutHelper.createLinear(-1, -2, 48, 24, 17, 24, 15));
            return;
        }
        if (!tLRPC$ChatInvite.participants.isEmpty()) {
            RecyclerListView recyclerListView = new RecyclerListView(context);
            recyclerListView.setPadding(0, 0, 0, AndroidUtilities.m34dp(8.0f));
            recyclerListView.setNestedScrollingEnabled(false);
            recyclerListView.setClipToPadding(false);
            recyclerListView.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
            recyclerListView.setHorizontalScrollBarEnabled(false);
            recyclerListView.setVerticalScrollBarEnabled(false);
            recyclerListView.setAdapter(new UsersAdapter(context));
            recyclerListView.setGlowColor(Theme.getColor("dialogScrollGlow"));
            linearLayout.addView(recyclerListView, LayoutHelper.createLinear(-2, 90, 49, 0, 0, 0, 7));
        }
        View view = new View(context);
        view.setBackgroundColor(Theme.getColor("dialogShadowLine"));
        linearLayout.addView(view, new LinearLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight()));
        PickerBottomLayout pickerBottomLayout = new PickerBottomLayout(context, false);
        linearLayout.addView(pickerBottomLayout, LayoutHelper.createFrame(-1, 48, 83));
        pickerBottomLayout.cancelButton.setPadding(AndroidUtilities.m34dp(18.0f), 0, AndroidUtilities.m34dp(18.0f), 0);
        pickerBottomLayout.cancelButton.setTextColor(Theme.getColor("dialogTextBlue2"));
        pickerBottomLayout.cancelButton.setText(LocaleController.getString("Cancel", C0890R.string.Cancel).toUpperCase());
        pickerBottomLayout.cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                JoinGroupAlert.this.lambda$new$6(view2);
            }
        });
        pickerBottomLayout.doneButton.setPadding(AndroidUtilities.m34dp(18.0f), 0, AndroidUtilities.m34dp(18.0f), 0);
        pickerBottomLayout.doneButton.setVisibility(0);
        pickerBottomLayout.doneButtonBadgeTextView.setVisibility(8);
        pickerBottomLayout.doneButtonTextView.setTextColor(Theme.getColor("dialogTextBlue2"));
        if ((!tLRPC$ChatInvite.channel || tLRPC$ChatInvite.megagroup) && (!ChatObject.isChannel(tLRPC$ChatInvite.chat) || tLRPC$ChatInvite.chat.megagroup)) {
            pickerBottomLayout.doneButtonTextView.setText(LocaleController.getString("JoinGroup", C0890R.string.JoinGroup));
        } else {
            pickerBottomLayout.doneButtonTextView.setText(LocaleController.getString("ProfileJoinChannel", C0890R.string.ProfileJoinChannel).toUpperCase());
        }
        pickerBottomLayout.doneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                JoinGroupAlert.this.lambda$new$9(view2);
            }
        });
    }

    public void lambda$new$0(View view) {
        dismiss();
    }

    public void lambda$new$5(final Context context, final boolean z, View view) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                JoinGroupAlert.this.lambda$new$1();
            }
        }, 400L);
        final TLRPC$TL_messages_importChatInvite tLRPC$TL_messages_importChatInvite = new TLRPC$TL_messages_importChatInvite();
        tLRPC$TL_messages_importChatInvite.hash = this.hash;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_messages_importChatInvite, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                JoinGroupAlert.this.lambda$new$4(context, z, tLRPC$TL_messages_importChatInvite, tLObject, tLRPC$TL_error);
            }
        }, 2);
    }

    public void lambda$new$1() {
        if (!isDismissed()) {
            this.requestTextView.setVisibility(4);
            this.requestProgressView.setVisibility(0);
        }
    }

    public void lambda$new$4(final Context context, final boolean z, final TLRPC$TL_messages_importChatInvite tLRPC$TL_messages_importChatInvite, TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                JoinGroupAlert.this.lambda$new$3(tLRPC$TL_error, context, z, tLRPC$TL_messages_importChatInvite);
            }
        });
    }

    public void lambda$new$3(TLRPC$TL_error tLRPC$TL_error, final Context context, final boolean z, TLRPC$TL_messages_importChatInvite tLRPC$TL_messages_importChatInvite) {
        BaseFragment baseFragment = this.fragment;
        if (baseFragment != null && baseFragment.getParentActivity() != null) {
            if (tLRPC$TL_error != null) {
                if ("INVITE_REQUEST_SENT".equals(tLRPC$TL_error.text)) {
                    setOnDismissListener(new DialogInterface.OnDismissListener() {
                        @Override
                        public final void onDismiss(DialogInterface dialogInterface) {
                            JoinGroupAlert.this.lambda$new$2(context, z, dialogInterface);
                        }
                    });
                } else {
                    AlertsCreator.processError(this.currentAccount, tLRPC$TL_error, this.fragment, tLRPC$TL_messages_importChatInvite, new Object[0]);
                }
            }
            dismiss();
        }
    }

    public void lambda$new$2(Context context, boolean z, DialogInterface dialogInterface) {
        String str;
        Bulletin.TwoLineLottieLayout twoLineLottieLayout = new Bulletin.TwoLineLottieLayout(context, this.fragment.getResourceProvider());
        twoLineLottieLayout.imageView.setAnimation(C0890R.raw.timer_3, 28, 28);
        twoLineLottieLayout.titleTextView.setText(LocaleController.getString("RequestToJoinSent", C0890R.string.RequestToJoinSent));
        if (z) {
            str = LocaleController.getString("RequestToJoinChannelSentDescription", C0890R.string.RequestToJoinChannelSentDescription);
        } else {
            str = LocaleController.getString("RequestToJoinGroupSentDescription", C0890R.string.RequestToJoinGroupSentDescription);
        }
        twoLineLottieLayout.subtitleTextView.setText(str);
        Bulletin.make(this.fragment, twoLineLottieLayout, 2750).show();
    }

    public void lambda$new$6(View view) {
        dismiss();
    }

    public void lambda$new$9(View view) {
        dismiss();
        final TLRPC$TL_messages_importChatInvite tLRPC$TL_messages_importChatInvite = new TLRPC$TL_messages_importChatInvite();
        tLRPC$TL_messages_importChatInvite.hash = this.hash;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_messages_importChatInvite, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                JoinGroupAlert.this.lambda$new$8(tLRPC$TL_messages_importChatInvite, tLObject, tLRPC$TL_error);
            }
        }, 2);
    }

    public void lambda$new$8(final TLRPC$TL_messages_importChatInvite tLRPC$TL_messages_importChatInvite, final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error == null) {
            MessagesController.getInstance(this.currentAccount).processUpdates((TLRPC$Updates) tLObject, false);
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                JoinGroupAlert.this.lambda$new$7(tLRPC$TL_error, tLObject, tLRPC$TL_messages_importChatInvite);
            }
        });
    }

    public void lambda$new$7(TLRPC$TL_error tLRPC$TL_error, TLObject tLObject, TLRPC$TL_messages_importChatInvite tLRPC$TL_messages_importChatInvite) {
        BaseFragment baseFragment = this.fragment;
        if (baseFragment != null && baseFragment.getParentActivity() != null) {
            if (tLRPC$TL_error == null) {
                TLRPC$Updates tLRPC$Updates = (TLRPC$Updates) tLObject;
                if (!tLRPC$Updates.chats.isEmpty()) {
                    TLRPC$Chat tLRPC$Chat = tLRPC$Updates.chats.get(0);
                    tLRPC$Chat.left = false;
                    tLRPC$Chat.kicked = false;
                    MessagesController.getInstance(this.currentAccount).putUsers(tLRPC$Updates.users, false);
                    MessagesController.getInstance(this.currentAccount).putChats(tLRPC$Updates.chats, false);
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", tLRPC$Chat.f843id);
                    if (MessagesController.getInstance(this.currentAccount).checkCanOpenChat(bundle, this.fragment)) {
                        ChatActivity chatActivity = new ChatActivity(bundle);
                        BaseFragment baseFragment2 = this.fragment;
                        baseFragment2.presentFragment(chatActivity, baseFragment2 instanceof ChatActivity);
                        return;
                    }
                    return;
                }
                return;
            }
            AlertsCreator.processError(this.currentAccount, tLRPC$TL_error, this.fragment, tLRPC$TL_messages_importChatInvite, new Object[0]);
        }
    }

    private class UsersAdapter extends RecyclerListView.SelectionAdapter {
        private Context context;

        @Override
        public long getItemId(int i) {
            return i;
        }

        @Override
        public int getItemViewType(int i) {
            return 0;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return false;
        }

        public UsersAdapter(Context context) {
            this.context = context;
        }

        @Override
        public int getItemCount() {
            int size = JoinGroupAlert.this.chatInvite.participants.size();
            return size != (JoinGroupAlert.this.chatInvite.chat != null ? JoinGroupAlert.this.chatInvite.chat.participants_count : JoinGroupAlert.this.chatInvite.participants_count) ? size + 1 : size;
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            JoinSheetUserCell joinSheetUserCell = new JoinSheetUserCell(this.context);
            joinSheetUserCell.setLayoutParams(new RecyclerView.LayoutParams(AndroidUtilities.m34dp(100.0f), AndroidUtilities.m34dp(90.0f)));
            return new RecyclerListView.Holder(joinSheetUserCell);
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            JoinSheetUserCell joinSheetUserCell = (JoinSheetUserCell) viewHolder.itemView;
            if (i < JoinGroupAlert.this.chatInvite.participants.size()) {
                joinSheetUserCell.setUser(JoinGroupAlert.this.chatInvite.participants.get(i));
            } else {
                joinSheetUserCell.setCount((JoinGroupAlert.this.chatInvite.chat != null ? JoinGroupAlert.this.chatInvite.chat.participants_count : JoinGroupAlert.this.chatInvite.participants_count) - JoinGroupAlert.this.chatInvite.participants.size());
            }
        }
    }
}
