package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.mlkit_vision_common.zzkf;
import com.google.android.gms.internal.mlkit_vision_common.zzkk;
import com.google.android.gms.internal.mlkit_vision_common.zzkl;
import com.google.android.gms.internal.mlkit_vision_common.zzkr;
import com.google.android.gms.internal.mlkit_vision_common.zzlj;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline2;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService$$ExternalSyntheticOutline0;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.AccountFrozenAlert$$ExternalSyntheticLambda3;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.AlertDialog$$ExternalSyntheticLambda1;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer;
import org.telegram.ui.AvatarSpan;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.CallLogActivity$$ExternalSyntheticLambda1;
import org.telegram.ui.Cells.GraySectionCell;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.ShadowSectionCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Cells.UserCell;
import org.telegram.ui.ChannelAdminLogActivity;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.LinkEditActivity;
import org.telegram.ui.ManageLinksActivity;
import org.telegram.ui.OAuthSheet$$ExternalSyntheticLambda0;
import org.telegram.ui.PaymentFormActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ProfileActivity$ListAdapter$$ExternalSyntheticLambda4;
import org.telegram.ui.ReportBottomSheet$$ExternalSyntheticLambda15;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.Stories.recorder.HintView2;

public final class InviteLinkBottomSheet extends BottomSheet {
    public final Adapter adapter;
    public boolean canEdit;
    public final long chatId;
    public int creatorHeaderRow;
    public int creatorRow;
    public int divider2Row;
    public int divider3Row;
    public int dividerRow;
    public int emptyHintRow;
    public int emptyView2;
    public int emptyView3;
    public int expiredEndRow;
    public int expiredHeaderRow;
    public int expiredStartRow;
    public final ArrayList expiredUsers;
    public final BaseFragment fragment;
    public boolean hasMore;
    public boolean ignoreLayout;
    public final TLRPC.ChatFull info;
    public final TLRPC.TL_chatInviteExported invite;
    public ChannelAdminLogActivity.AnonymousClass20 inviteDelegate;
    public final boolean isChannel;
    public boolean isNeedReopen;
    public int joinedEndRow;
    public int joinedHeaderRow;
    public int joinedStartRow;
    public final ArrayList joinedUsers;
    public int linkActionRow;
    public int linkInfoRow;
    public final AnonymousClass2 listView;
    public int loadingRow;
    public final boolean permanent;
    public int requestedEndRow;
    public int requestedHeaderRow;
    public int requestedStartRow;
    public final ArrayList requestedUsers;
    public int revenueHeaderRow;
    public int revenueRow;
    public int rowCount;
    public int scrollOffsetY;
    public final View shadow;
    public AnimatorSet shadowAnimation;
    public final long timeDif;
    public final TextView titleTextView;
    public final boolean titleVisible;
    public final HashMap users;
    public boolean usersLoading;

    public final class Adapter extends RecyclerListView.SelectionAdapter {

        public final class AnonymousClass2 implements LinkActionView.Delegate {
            public AnonymousClass2() {
            }

            @Override
            public final void editLink() {
                InviteLinkBottomSheet inviteLinkBottomSheet = InviteLinkBottomSheet.this;
                BaseFragment baseFragment = inviteLinkBottomSheet.fragment;
                if (baseFragment instanceof ManageLinksActivity) {
                    ManageLinksActivity manageLinksActivity = (ManageLinksActivity) baseFragment;
                    LinkEditActivity linkEditActivity = new LinkEditActivity(1, manageLinksActivity.currentChatId);
                    linkEditActivity.callback = manageLinksActivity.linkEditActivityCallback;
                    linkEditActivity.setInviteToEdit(inviteLinkBottomSheet.invite);
                    manageLinksActivity.presentFragment(linkEditActivity);
                } else {
                    LinkEditActivity linkEditActivity2 = new LinkEditActivity(1, inviteLinkBottomSheet.chatId);
                    linkEditActivity2.setInviteToEdit(inviteLinkBottomSheet.invite);
                    linkEditActivity2.callback = new LinkEditActivity.Callback() {
                        @Override
                        public final void onLinkCreated(TLObject tLObject) {
                        }

                        @Override
                        public final void onLinkEdited(TLRPC.TL_chatInviteExported tL_chatInviteExported, TLObject tLObject) {
                            ChannelAdminLogActivity.AnonymousClass20 anonymousClass20 = InviteLinkBottomSheet.this.inviteDelegate;
                            if (anonymousClass20 != null) {
                                TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = new TLRPC.TL_channelAdminLogEvent();
                                TLRPC.TL_channelAdminLogEventActionExportedInviteEdit tL_channelAdminLogEventActionExportedInviteEdit = new TLRPC.TL_channelAdminLogEventActionExportedInviteEdit();
                                tL_channelAdminLogEventActionExportedInviteEdit.new_invite = tL_chatInviteExported;
                                tL_channelAdminLogEventActionExportedInviteEdit.prev_invite = tL_chatInviteExported;
                                tL_channelAdminLogEvent.action = tL_channelAdminLogEventActionExportedInviteEdit;
                                tL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
                                ChannelAdminLogActivity channelAdminLogActivity = ChannelAdminLogActivity.this;
                                tL_channelAdminLogEvent.user_id = channelAdminLogActivity.getAccountInstance().getUserConfig().clientUserId;
                                if (new MessageObject(((BaseFragment) channelAdminLogActivity).currentAccount, tL_channelAdminLogEvent, (ArrayList<MessageObject>) channelAdminLogActivity.messages, (HashMap<String, ArrayList<MessageObject>>) channelAdminLogActivity.messagesByDays, channelAdminLogActivity.currentChat, channelAdminLogActivity.mid, true).contentType < 0) {
                                    return;
                                }
                                channelAdminLogActivity.filterDeletedMessages();
                                channelAdminLogActivity.chatAdapter.notifyDataSetChanged();
                                ChannelAdminLogActivity.access$8500(channelAdminLogActivity);
                            }
                        }

                        @Override
                        public final void revokeLink(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
                        }
                    };
                    inviteLinkBottomSheet.fragment.presentFragment(linkEditActivity2);
                }
                inviteLinkBottomSheet.lambda$showGiftOfferSheet$15();
            }

            @Override
            public final void removeLink() {
                InviteLinkBottomSheet inviteLinkBottomSheet = InviteLinkBottomSheet.this;
                BaseFragment baseFragment = inviteLinkBottomSheet.fragment;
                if (baseFragment instanceof ManageLinksActivity) {
                    ((ManageLinksActivity) baseFragment).deleteLink(inviteLinkBottomSheet.invite);
                } else {
                    TLRPC.TL_messages_deleteExportedChatInvite tL_messages_deleteExportedChatInvite = new TLRPC.TL_messages_deleteExportedChatInvite();
                    tL_messages_deleteExportedChatInvite.link = inviteLinkBottomSheet.invite.link;
                    tL_messages_deleteExportedChatInvite.peer = MessagesController.getInstance(((BottomSheet) inviteLinkBottomSheet).currentAccount).getInputPeer(-inviteLinkBottomSheet.chatId);
                    ConnectionsManager.getInstance(((BottomSheet) inviteLinkBottomSheet).currentAccount).sendRequest(tL_messages_deleteExportedChatInvite, new InviteLinkBottomSheet$Adapter$2$$ExternalSyntheticLambda0(this, 1));
                }
                inviteLinkBottomSheet.lambda$showGiftOfferSheet$15();
            }

            @Override
            public final void revokeLink() {
                InviteLinkBottomSheet inviteLinkBottomSheet = InviteLinkBottomSheet.this;
                BaseFragment baseFragment = inviteLinkBottomSheet.fragment;
                if (baseFragment instanceof ManageLinksActivity) {
                    ((ManageLinksActivity) baseFragment).revokeLink(inviteLinkBottomSheet.invite);
                } else {
                    TLRPC.TL_messages_editExportedChatInvite tL_messages_editExportedChatInvite = new TLRPC.TL_messages_editExportedChatInvite();
                    tL_messages_editExportedChatInvite.link = inviteLinkBottomSheet.invite.link;
                    tL_messages_editExportedChatInvite.revoked = true;
                    tL_messages_editExportedChatInvite.peer = MessagesController.getInstance(((BottomSheet) inviteLinkBottomSheet).currentAccount).getInputPeer(-inviteLinkBottomSheet.chatId);
                    ConnectionsManager.getInstance(((BottomSheet) inviteLinkBottomSheet).currentAccount).sendRequest(tL_messages_editExportedChatInvite, new InviteLinkBottomSheet$Adapter$2$$ExternalSyntheticLambda0(this, 0));
                }
                inviteLinkBottomSheet.lambda$showGiftOfferSheet$15();
            }

            @Override
            public final void showUsersForPermanentLink() {
            }
        }

        public Adapter() {
        }

        @Override
        public final int getItemCount() {
            return InviteLinkBottomSheet.this.rowCount;
        }

        @Override
        public final int getItemViewType(int i) {
            InviteLinkBottomSheet inviteLinkBottomSheet = InviteLinkBottomSheet.this;
            if (i == inviteLinkBottomSheet.creatorHeaderRow || i == inviteLinkBottomSheet.requestedHeaderRow || i == inviteLinkBottomSheet.joinedHeaderRow || i == inviteLinkBottomSheet.revenueHeaderRow) {
                return 0;
            }
            if (i == inviteLinkBottomSheet.creatorRow) {
                return 1;
            }
            if (i >= inviteLinkBottomSheet.requestedStartRow && i < inviteLinkBottomSheet.requestedEndRow) {
                return 1;
            }
            if (i >= inviteLinkBottomSheet.joinedStartRow && i < inviteLinkBottomSheet.joinedEndRow) {
                return 1;
            }
            if (i == inviteLinkBottomSheet.dividerRow || i == inviteLinkBottomSheet.divider2Row) {
                return 2;
            }
            if (i == inviteLinkBottomSheet.linkActionRow) {
                return 3;
            }
            if (i == inviteLinkBottomSheet.linkInfoRow) {
                return 4;
            }
            if (i == inviteLinkBottomSheet.loadingRow) {
                return 5;
            }
            if (i == 0 || i == inviteLinkBottomSheet.emptyView2 || i == inviteLinkBottomSheet.emptyView3) {
                return 6;
            }
            if (i == inviteLinkBottomSheet.divider3Row) {
                return 7;
            }
            if (i == inviteLinkBottomSheet.emptyHintRow) {
                return 8;
            }
            return i == inviteLinkBottomSheet.revenueRow ? 9 : 0;
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            int adapterPosition = viewHolder.getAdapterPosition();
            InviteLinkBottomSheet inviteLinkBottomSheet = InviteLinkBottomSheet.this;
            if (adapterPosition == inviteLinkBottomSheet.creatorRow) {
                return inviteLinkBottomSheet.invite.admin_id != UserConfig.getInstance(((BottomSheet) inviteLinkBottomSheet).currentAccount).clientUserId;
            }
            if (adapterPosition < inviteLinkBottomSheet.joinedStartRow || adapterPosition >= inviteLinkBottomSheet.joinedEndRow) {
                return adapterPosition >= inviteLinkBottomSheet.requestedStartRow && adapterPosition < inviteLinkBottomSheet.requestedEndRow;
            }
            return true;
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            int i2;
            int i3;
            TLRPC.TL_chatInviteImporter tL_chatInviteImporter;
            long j;
            long j2;
            TLRPC.ChatParticipant chatParticipant;
            String dateAudio;
            String string;
            String str;
            boolean z;
            boolean z2;
            boolean z3;
            String str2;
            TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing;
            String string2;
            int i4 = viewHolder.mItemViewType;
            InviteLinkBottomSheet inviteLinkBottomSheet = InviteLinkBottomSheet.this;
            View view = viewHolder.itemView;
            if (i4 == 0) {
                GraySectionCell graySectionCell = (GraySectionCell) view;
                if (i == inviteLinkBottomSheet.creatorHeaderRow) {
                    graySectionCell.setText(LocaleController.getString(R.string.LinkCreatedeBy));
                    graySectionCell.setRightText(null);
                    return;
                }
                if (i == inviteLinkBottomSheet.revenueHeaderRow) {
                    graySectionCell.setText(LocaleController.getString(R.string.LinkRevenue));
                    graySectionCell.setRightText(null);
                    return;
                }
                int i5 = inviteLinkBottomSheet.joinedHeaderRow;
                TLRPC.TL_chatInviteExported tL_chatInviteExported = inviteLinkBottomSheet.invite;
                if (i != i5) {
                    if (i == inviteLinkBottomSheet.expiredHeaderRow) {
                        graySectionCell.setText(LocaleController.formatPluralString("PeopleSubscriptionExpired", tL_chatInviteExported.subscription_expired, new Object[0]));
                        graySectionCell.setRightText(null);
                        return;
                    } else {
                        if (i == inviteLinkBottomSheet.requestedHeaderRow) {
                            graySectionCell.setText(LocaleController.formatPluralString("JoinRequests", tL_chatInviteExported.requested, new Object[0]));
                            graySectionCell.setRightText(null);
                            return;
                        }
                        return;
                    }
                }
                int i6 = tL_chatInviteExported.usage;
                if (i6 > 0) {
                    graySectionCell.setText(LocaleController.formatPluralString("PeopleJoined", i6, new Object[0]));
                } else {
                    graySectionCell.setText(LocaleController.getString(tL_chatInviteExported.subscription_pricing != null ? R.string.NoOneSubscribed : R.string.NoOneJoined));
                }
                if (tL_chatInviteExported.expired || tL_chatInviteExported.revoked || (i2 = tL_chatInviteExported.usage_limit) <= 0 || (i3 = tL_chatInviteExported.usage) <= 0) {
                    graySectionCell.setRightText(null);
                    return;
                } else {
                    graySectionCell.setRightText(LocaleController.formatPluralString("PeopleJoinedRemaining", i2 - i3, new Object[0]));
                    return;
                }
            }
            if (i4 != 1) {
                if (i4 == 3) {
                    LinkActionView linkActionView = (LinkActionView) view;
                    linkActionView.setUsers(0, null, false);
                    linkActionView.setLink(inviteLinkBottomSheet.invite.link);
                    TLRPC.TL_chatInviteExported tL_chatInviteExported2 = inviteLinkBottomSheet.invite;
                    linkActionView.setRevoke(tL_chatInviteExported2.revoked);
                    linkActionView.setPermanent(tL_chatInviteExported2.permanent);
                    linkActionView.setCanEdit(inviteLinkBottomSheet.canEdit);
                    linkActionView.hideRevokeOption(!inviteLinkBottomSheet.canEdit);
                    return;
                }
                if (i4 != 4) {
                    if (i4 == 8) {
                        EmptyHintRow emptyHintRow = (EmptyHintRow) view;
                        int i7 = inviteLinkBottomSheet.invite.usage_limit;
                        if (i7 <= 0) {
                            emptyHintRow.textView.setVisibility(8);
                            return;
                        } else {
                            emptyHintRow.textView.setText(LocaleController.formatPluralString("PeopleCanJoinViaLinkCount", i7, new Object[0]));
                            emptyHintRow.textView.setVisibility(0);
                            return;
                        }
                    }
                    if (i4 != 9) {
                        return;
                    }
                    RevenueCell revenueCell = (RevenueCell) view;
                    TLRPC.TL_chatInviteExported tL_chatInviteExported3 = inviteLinkBottomSheet.invite;
                    TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing2 = tL_chatInviteExported3.subscription_pricing;
                    int i8 = tL_chatInviteExported3.usage;
                    revenueCell.getClass();
                    if (tL_starsSubscriptionPricing2 == null) {
                        return;
                    }
                    int i9 = tL_starsSubscriptionPricing2.period;
                    TextView textView = revenueCell.subtitleView;
                    TextView textView2 = revenueCell.titleView;
                    InviteLinkBottomSheet inviteLinkBottomSheet2 = InviteLinkBottomSheet.this;
                    if (i9 == 2592000) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(LocaleController.formatString(R.string.LinkRevenuePrice, Long.valueOf(tL_starsSubscriptionPricing2.amount)));
                        sb.append(i8 > 0 ? DiffUtil.m(i8, " x ") : "");
                        textView2.setText(StarsIntroActivity.replaceStarsWithPlain(false, sb.toString(), 0.8f, null));
                        textView.setText(i8 == 0 ? LocaleController.getString(R.string.NoOneSubscribed) : LocaleController.formatString(R.string.LinkRevenuePriceInfo, BillingController.getInstance().formatCurrency((long) ((tL_starsSubscriptionPricing2.amount / 1000.0d) * ((double) MessagesController.getInstance(((BottomSheet) inviteLinkBottomSheet2).currentAccount).starsUsdWithdrawRate1000) * ((double) i8)), "USD")));
                        return;
                    }
                    String str3 = i9 == 300 ? "5min" : "min";
                    StringBuilder sb2 = new StringBuilder();
                    Locale locale = Locale.US;
                    sb2.append(String.format(locale, "⭐%1$d/%2$s", Long.valueOf(tL_starsSubscriptionPricing2.amount), str3));
                    sb2.append(i8 > 0 ? DiffUtil.m(i8, " x ") : "");
                    textView2.setText(StarsIntroActivity.replaceStarsWithPlain(false, sb2.toString(), 0.8f, null));
                    textView.setText(i8 == 0 ? LocaleController.getString(R.string.NoOneSubscribed) : String.format(locale, "you get approximately %1$s %2$s", BillingController.getInstance().formatCurrency((long) ((tL_starsSubscriptionPricing2.amount / 1000.0d) * ((double) MessagesController.getInstance(((BottomSheet) inviteLinkBottomSheet2).currentAccount).starsUsdWithdrawRate1000) * ((double) i8)), "USD"), "for ".concat(str3)));
                    return;
                }
                TimerPrivacyCell timerPrivacyCell = (TimerPrivacyCell) view;
                AndroidUtilities.cancelRunOnUIThread(timerPrivacyCell.timerRunnable);
                timerPrivacyCell.timer = false;
                timerPrivacyCell.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText4, false));
                timerPrivacyCell.setFixedSize(0);
                TLRPC.TL_chatInviteExported tL_chatInviteExported4 = inviteLinkBottomSheet.invite;
                if (tL_chatInviteExported4.revoked) {
                    timerPrivacyCell.setText(LocaleController.getString(R.string.LinkIsNoActive));
                    return;
                }
                if (tL_chatInviteExported4.expired) {
                    int i10 = tL_chatInviteExported4.usage_limit;
                    if (i10 > 0 && i10 == tL_chatInviteExported4.usage) {
                        timerPrivacyCell.setText(LocaleController.getString(R.string.LinkIsExpiredLimitReached));
                        return;
                    } else {
                        timerPrivacyCell.setText(LocaleController.getString(R.string.LinkIsExpired));
                        timerPrivacyCell.setTextColor(Theme.getColor(null, Theme.key_text_RedRegular, false));
                        return;
                    }
                }
                if (tL_chatInviteExported4.expire_date <= 0) {
                    timerPrivacyCell.setFixedSize(-1);
                    timerPrivacyCell.setText(null);
                    return;
                }
                long jCurrentTimeMillis = (inviteLinkBottomSheet.timeDif * 1000) + System.currentTimeMillis();
                long j3 = inviteLinkBottomSheet.invite.expire_date;
                long j4 = (j3 * 1000) - jCurrentTimeMillis;
                if (j4 < 0) {
                    j4 = 0;
                }
                if (j4 > 86400000) {
                    timerPrivacyCell.setText(LocaleController.formatString("LinkExpiresIn", R.string.LinkExpiresIn, LocaleController.formatDateAudio(j3, false)));
                    return;
                }
                long j5 = j4 / 1000;
                int i11 = (int) (j5 % 60);
                long j6 = j5 / 60;
                StringBuilder sb3 = new StringBuilder();
                Locale locale2 = Locale.ENGLISH;
                sb3.append(String.format(locale2, "%02d", Integer.valueOf((int) (j6 / 60))));
                sb3.append(String.format(locale2, ":%02d", Integer.valueOf((int) (j6 % 60))));
                sb3.append(String.format(locale2, ":%02d", Integer.valueOf(i11)));
                String string3 = sb3.toString();
                timerPrivacyCell.timer = true;
                BubbleActivity.AnonymousClass1 anonymousClass1 = timerPrivacyCell.timerRunnable;
                AndroidUtilities.cancelRunOnUIThread(anonymousClass1);
                if (timerPrivacyCell.timer) {
                    AndroidUtilities.runOnUIThread(anonymousClass1, 500L);
                }
                timerPrivacyCell.setText(LocaleController.formatString("LinkExpiresInTime", R.string.LinkExpiresInTime, string3));
                return;
            }
            RevenueUserCell revenueUserCell = (RevenueUserCell) view;
            int i12 = inviteLinkBottomSheet.creatorRow;
            TLRPC.TL_chatInviteExported tL_chatInviteExported5 = inviteLinkBottomSheet.invite;
            if (i == i12) {
                j = tL_chatInviteExported5.admin_id;
                tL_chatInviteImporter = null;
            } else {
                int i13 = inviteLinkBottomSheet.joinedStartRow;
                ArrayList arrayList = inviteLinkBottomSheet.joinedUsers;
                int i14 = inviteLinkBottomSheet.expiredStartRow;
                if (i14 != -1 && i >= i14) {
                    arrayList = inviteLinkBottomSheet.expiredUsers;
                    i13 = i14;
                }
                int i15 = inviteLinkBottomSheet.requestedStartRow;
                if (i15 != -1 && i >= i15) {
                    arrayList = inviteLinkBottomSheet.requestedUsers;
                    i13 = i15;
                }
                tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) arrayList.get(i - i13);
                j = tL_chatInviteImporter.user_id;
            }
            HashMap map = inviteLinkBottomSheet.users;
            TLRPC.User user = (TLRPC.User) map.get(Long.valueOf(j));
            TLRPC.ChatFull chatFull = inviteLinkBottomSheet.info;
            if (chatFull != null && chatFull.participants != null) {
                int i16 = 0;
                while (true) {
                    if (i16 >= chatFull.participants.participants.size()) {
                        j2 = j;
                        chatParticipant = null;
                        break;
                    }
                    j2 = j;
                    if (chatFull.participants.participants.get(i16).user_id == j2) {
                        chatParticipant = chatFull.participants.participants.get(i16);
                        break;
                    } else {
                        i16++;
                        j = j2;
                    }
                }
            } else {
                j2 = j;
                chatParticipant = null;
                break;
            }
            if (i != inviteLinkBottomSheet.creatorRow) {
                dateAudio = null;
            } else {
                TLRPC.User user2 = (TLRPC.User) map.get(Long.valueOf(j2));
                if (user2 == null) {
                    user2 = MessagesController.getInstance(((BottomSheet) inviteLinkBottomSheet).currentAccount).getUser(Long.valueOf(tL_chatInviteExported5.admin_id));
                }
                user = user2;
                if (user != null) {
                    dateAudio = LocaleController.formatDateAudio(tL_chatInviteExported5.date, false);
                } else {
                    dateAudio = null;
                }
            }
            TLRPC.User user3 = user;
            if (i == inviteLinkBottomSheet.creatorRow && chatParticipant != null) {
                if (chatParticipant instanceof TLRPC.TL_chatChannelParticipant) {
                    TLRPC.ChannelParticipant channelParticipant = ((TLRPC.TL_chatChannelParticipant) chatParticipant).channelParticipant;
                    string = channelParticipant.rank;
                    if (channelParticipant instanceof TLRPC.TL_channelParticipantCreator) {
                        if (TextUtils.isEmpty(string)) {
                            string = LocaleController.getString("ChannelCreator", R.string.ChannelCreator);
                        }
                        str = string;
                        z = true;
                        z2 = true;
                        z3 = false;
                    } else if (channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) {
                        if (TextUtils.isEmpty(string)) {
                            string = LocaleController.getString("ChannelAdmin", R.string.ChannelAdmin);
                        }
                        z3 = channelParticipant.promoted_by == UserConfig.getInstance(((BottomSheet) inviteLinkBottomSheet).currentAccount).getClientUserId();
                        str = string;
                        z = false;
                        z2 = true;
                    }
                } else {
                    string = chatParticipant.rank;
                    if (chatParticipant instanceof TLRPC.TL_chatParticipantCreator) {
                        if (TextUtils.isEmpty(string)) {
                            string = LocaleController.getString("ChannelCreator", R.string.ChannelCreator);
                        }
                        str = string;
                        z = true;
                        z2 = true;
                        z3 = false;
                    } else if (chatParticipant instanceof TLRPC.TL_chatParticipantAdmin) {
                        if (TextUtils.isEmpty(string)) {
                            string = LocaleController.getString("ChannelAdmin", R.string.ChannelAdmin);
                        }
                        if (chatParticipant.inviter_id == UserConfig.getInstance(((BottomSheet) inviteLinkBottomSheet).currentAccount).getClientUserId()) {
                            str = string;
                            z = false;
                            z2 = true;
                            z3 = true;
                        } else {
                            str = string;
                            z = false;
                            z2 = true;
                            z3 = false;
                        }
                    }
                }
                if (UserObject.isUserSelf(user3)) {
                    str2 = str;
                    boolean z4 = ChatObject.canManageMyTag(MessagesController.getInstance(((BottomSheet) inviteLinkBottomSheet).currentAccount).getChat(Long.valueOf(inviteLinkBottomSheet.chatId)));
                    boolean z5 = z;
                    String str4 = str2;
                    revenueUserCell.setAdminRole(str4, z2, z5, z4, new ProfileActivity$ListAdapter$$ExternalSyntheticLambda4(this, user3, str4, z2, z5, z3, 1));
                    revenueUserCell.setData(user3, null, dateAudio, false);
                    if (i != inviteLinkBottomSheet.creatorRow || (tL_starsSubscriptionPricing = tL_chatInviteExported5.subscription_pricing) == null || tL_chatInviteImporter == null) {
                        return;
                    }
                    int i17 = tL_chatInviteImporter.date;
                    SpannableStringBuilder spannableStringBuilderReplaceStarsWithPlain = StarsIntroActivity.replaceStarsWithPlain(false, "⭐️" + tL_starsSubscriptionPricing.amount, 0.7f, null);
                    int i18 = tL_starsSubscriptionPricing.period;
                    if (i18 == 2592000) {
                        string2 = LocaleController.getString(R.string.StarsParticipantSubscriptionPerMonth);
                    } else {
                        string2 = i18 == 300 ? "per 5 minutes" : "per each minute";
                    }
                    TextView textView3 = revenueUserCell.priceView;
                    textView3.setText(spannableStringBuilderReplaceStarsWithPlain);
                    TextView textView4 = revenueUserCell.periodView;
                    textView4.setText(string2);
                    revenueUserCell.setRightPadding((int) Math.max(HintView2.measureCorrectly(spannableStringBuilderReplaceStarsWithPlain, textView3.getPaint()), HintView2.measureCorrectly(string2, textView4.getPaint())), true);
                    revenueUserCell.statusTextView.setText(LocaleController.formatJoined(i17), false);
                    return;
                }
                str2 = str;
                boolean z6 = z;
                String str5 = str2;
                revenueUserCell.setAdminRole(str5, z2, z6, z4, new ProfileActivity$ListAdapter$$ExternalSyntheticLambda4(this, user3, str5, z2, z6, z3, 1));
                revenueUserCell.setData(user3, null, dateAudio, false);
                if (i != inviteLinkBottomSheet.creatorRow) {
                }
            }
            string = null;
            str = string;
            z = false;
            z2 = false;
            z3 = false;
            if (UserObject.isUserSelf(user3)) {
                str2 = str;
                if (ChatObject.canManageMyTag(MessagesController.getInstance(((BottomSheet) inviteLinkBottomSheet).currentAccount).getChat(Long.valueOf(inviteLinkBottomSheet.chatId)))) {
                }
                boolean z7 = z;
                String str6 = str2;
                revenueUserCell.setAdminRole(str6, z2, z7, z4, new ProfileActivity$ListAdapter$$ExternalSyntheticLambda4(this, user3, str6, z2, z7, z3, 1));
                revenueUserCell.setData(user3, null, dateAudio, false);
                if (i != inviteLinkBottomSheet.creatorRow) {
                }
            }
            str2 = str;
            boolean z8 = z;
            String str7 = str2;
            revenueUserCell.setAdminRole(str7, z2, z8, z4, new ProfileActivity$ListAdapter$$ExternalSyntheticLambda4(this, user3, str7, z2, z8, z3, 1));
            revenueUserCell.setData(user3, null, dateAudio, false);
            if (i != inviteLinkBottomSheet.creatorRow) {
            }
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View revenueUserCell;
            View shadowSectionCell;
            View timerPrivacyCell;
            Context context = viewGroup.getContext();
            InviteLinkBottomSheet inviteLinkBottomSheet = InviteLinkBottomSheet.this;
            switch (i) {
                case 1:
                    revenueUserCell = new RevenueUserCell(context);
                    break;
                case 2:
                    shadowSectionCell = new ShadowSectionCell(context, Theme.getColor(null, Theme.key_windowBackgroundGray, false), 0);
                    revenueUserCell = shadowSectionCell;
                    break;
                case 3:
                    LinkActionView linkActionView = new LinkActionView(context, inviteLinkBottomSheet.fragment, inviteLinkBottomSheet, inviteLinkBottomSheet.isChannel) {
                        @Override
                        public final void showBulletin(int i2, SpannableStringBuilder spannableStringBuilder) {
                            InviteLinkBottomSheet inviteLinkBottomSheet2 = InviteLinkBottomSheet.this;
                            Bulletin bulletinCreateSimpleBulletinWithIconSize = new BulletinFactory(inviteLinkBottomSheet2.container, ((BottomSheet) inviteLinkBottomSheet2).resourcesProvider).createSimpleBulletinWithIconSize(i2, 36, spannableStringBuilder);
                            bulletinCreateSimpleBulletinWithIconSize.hideAfterBottomSheet = false;
                            bulletinCreateSimpleBulletinWithIconSize.show(true);
                        }
                    };
                    linkActionView.setDelegate(new AnonymousClass2());
                    linkActionView.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
                    revenueUserCell = linkActionView;
                    break;
                case 4:
                    timerPrivacyCell = inviteLinkBottomSheet.new TimerPrivacyCell(context);
                    revenueUserCell = timerPrivacyCell;
                    break;
                case 5:
                    FlickerLoadingView flickerLoadingView = new FlickerLoadingView(context, null);
                    flickerLoadingView.setIsSingleCell(true);
                    flickerLoadingView.setViewType(10);
                    flickerLoadingView.showDate = false;
                    flickerLoadingView.setPaddingLeft(AndroidUtilities.dp(10.0f));
                    shadowSectionCell = flickerLoadingView;
                    revenueUserCell = shadowSectionCell;
                    break;
                case 6:
                    timerPrivacyCell = new PaymentFormActivity.AnonymousClass2(context, 10);
                    revenueUserCell = timerPrivacyCell;
                    break;
                case 7:
                    timerPrivacyCell = new ShadowSectionCell(context, (Object) null);
                    revenueUserCell = timerPrivacyCell;
                    break;
                case 8:
                    timerPrivacyCell = new EmptyHintRow(context);
                    revenueUserCell = timerPrivacyCell;
                    break;
                case 9:
                    timerPrivacyCell = inviteLinkBottomSheet.new RevenueCell(context);
                    revenueUserCell = timerPrivacyCell;
                    break;
                default:
                    timerPrivacyCell = new GraySectionCell(context, 16, ((BottomSheet) inviteLinkBottomSheet).resourcesProvider);
                    revenueUserCell = timerPrivacyCell;
                    break;
            }
            return zzkl.m(revenueUserCell, revenueUserCell);
        }
    }

    public final class EmptyHintRow extends FrameLayout {
        public final TextView textView;

        public EmptyHintRow(Context context) {
            super(context);
            TextView textView = new TextView(context);
            this.textView = textView;
            textView.setTextSize(1, 14.0f);
            zzkr.m(Theme.key_windowBackgroundWhiteGrayText, textView, 1);
            addView(textView, LayoutHelper.createFrame(-1, -2.0f, 16, 60.0f, 0.0f, 60.0f, 0.0f));
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(84.0f), 1073741824));
        }
    }

    public final class RevenueCell extends FrameLayout {
        public final TextView subtitleView;
        public final TextView titleView;

        public RevenueCell(Context context) {
            super(context);
            ImageView imageView = new ImageView(context);
            int color = Theme.getColor(null, Theme.key_avatar_backgroundGreen, false);
            int color2 = Theme.getColor(null, Theme.key_avatar_background2Green, false);
            OvalShape ovalShape = new OvalShape();
            float f = 46;
            ovalShape.resize(f, f);
            ShapeDrawable shapeDrawable = new ShapeDrawable(ovalShape);
            shapeDrawable.setIntrinsicWidth(46);
            shapeDrawable.setIntrinsicHeight(46);
            shapeDrawable.getPaint().setShader(new LinearGradient(0.0f, 0.0f, 0.0f, f, color, color2, Shader.TileMode.CLAMP));
            imageView.setBackground(shapeDrawable);
            imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            imageView.setImageResource(R.drawable.large_income);
            imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            addView(imageView, LayoutHelper.createFrame(46, 46.0f, 19, 13.0f, 0.0f, 0.0f, 0.0f));
            TextView textView = new TextView(context);
            this.titleView = textView;
            zzkk.m(16.0f, 1, textView);
            textView.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false));
            addView(textView, LayoutHelper.createFrame(-1, -2.0f, 51, 72.0f, 9.0f, 0.0f, 0.0f));
            TextView textView2 = new TextView(context);
            this.subtitleView = textView2;
            textView2.setTextSize(1, 14.0f);
            textView2.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText, false));
            addView(textView2, LayoutHelper.createFrame(-1, -2.0f, 51, 72.0f, 32.0f, 0.0f, 0.0f));
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(58.0f), 1073741824));
        }
    }

    public final class RevenueUserCell extends UserCell {
        public final TextView periodView;
        public final TextView priceView;

        public RevenueUserCell(Context context) {
            super(6, 0, context, null, true, false);
            LinearLayout linearLayoutM = zzkf.m(context, 1);
            TextView textView = new TextView(context);
            this.priceView = textView;
            FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline2.m(16.0f, Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false), 1, textView);
            linearLayoutM.addView(textView, LayoutHelper.createLinear(-2, -2, 5));
            TextView textView2 = new TextView(context);
            this.periodView = textView2;
            textView2.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText2, false));
            textView2.setTextSize(1, 13.0f);
            linearLayoutM.addView(textView2, LayoutHelper.createLinear(-2, -2, 5, 0, 1, 0, 0));
            addView(linearLayoutM, LayoutHelper.createFrame(-2, -2.0f, (LocaleController.isRTL ? 3 : 5) | 16, 18.0f, 0.0f, 18.0f, 0.0f));
        }
    }

    public final class TimerPrivacyCell extends TextInfoPrivacyCell {
        public boolean timer;
        public final BubbleActivity.AnonymousClass1 timerRunnable;

        public TimerPrivacyCell(Context context) {
            super(context, 24, null);
            this.timerRunnable = new BubbleActivity.AnonymousClass1(this, 21);
        }

        @Override
        public final void onAttachedToWindow() {
            super.onAttachedToWindow();
            BubbleActivity.AnonymousClass1 anonymousClass1 = this.timerRunnable;
            AndroidUtilities.cancelRunOnUIThread(anonymousClass1);
            if (this.timer) {
                AndroidUtilities.runOnUIThread(anonymousClass1, 500L);
            }
        }

        @Override
        public final void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            AndroidUtilities.cancelRunOnUIThread(this.timerRunnable);
        }
    }

    public InviteLinkBottomSheet(final Context context, final TLRPC.TL_chatInviteExported tL_chatInviteExported, final TLRPC.ChatFull chatFull, final HashMap map, final BaseFragment baseFragment, final long j, boolean z, boolean z2) {
        super(context, null, false, false);
        this.joinedUsers = new ArrayList();
        this.expiredUsers = new ArrayList();
        this.requestedUsers = new ArrayList();
        this.canEdit = true;
        this.isNeedReopen = false;
        this.invite = tL_chatInviteExported;
        this.users = map;
        this.fragment = baseFragment;
        this.info = chatFull;
        this.chatId = j;
        this.permanent = z;
        this.isChannel = z2;
        int i = Theme.key_windowBackgroundGray;
        setBackgroundColor(getThemedColor(i));
        fixNavigationBar(getThemedColor(i));
        this.behindKeyboardColorKey = -1;
        if (map == null) {
            this.users = new HashMap();
        }
        this.timeDif = ((long) ConnectionsManager.getInstance(this.currentAccount).getCurrentTime()) - (System.currentTimeMillis() / 1000);
        FrameLayout frameLayout = new FrameLayout(context) {
            public boolean fullHeight;
            public final RectF rect = new RectF();
            public Boolean statusBarOpen;

            @Override
            public final void onDraw(Canvas canvas) {
                float fMin;
                int iMin;
                boolean z3;
                Boolean bool;
                boolean z4;
                boolean z5;
                InviteLinkBottomSheet inviteLinkBottomSheet = InviteLinkBottomSheet.this;
                int iDp = (inviteLinkBottomSheet.scrollOffsetY - ((BottomSheet) inviteLinkBottomSheet).backgroundPaddingTop) - AndroidUtilities.dp(8.0f);
                int iDp2 = ((BottomSheet) inviteLinkBottomSheet).backgroundPaddingTop + AndroidUtilities.dp(36.0f) + getMeasuredHeight();
                int i2 = AndroidUtilities.statusBarHeight;
                int i3 = iDp + i2;
                int i4 = iDp2 - i2;
                if (this.fullHeight) {
                    int i5 = ((BottomSheet) inviteLinkBottomSheet).backgroundPaddingTop + i3;
                    int i6 = AndroidUtilities.statusBarHeight;
                    int i7 = i6 * 2;
                    if (i5 < i7) {
                        int iMin2 = Math.min(i6, (i7 - i3) - ((BottomSheet) inviteLinkBottomSheet).backgroundPaddingTop);
                        i3 -= iMin2;
                        i4 += iMin2;
                        fMin = 1.0f - Math.min(1.0f, (iMin2 * 2) / AndroidUtilities.statusBarHeight);
                    } else {
                        fMin = 1.0f;
                    }
                    int i8 = ((BottomSheet) inviteLinkBottomSheet).backgroundPaddingTop + i3;
                    int i9 = AndroidUtilities.statusBarHeight;
                    iMin = i8 < i9 ? Math.min(i9, (i9 - i3) - ((BottomSheet) inviteLinkBottomSheet).backgroundPaddingTop) : 0;
                    ((BottomSheet) inviteLinkBottomSheet).shadowDrawable.setBounds(0, i3, getMeasuredWidth(), AndroidUtilities.dp(10.0f) + i4 + AndroidUtilities.navigationBarHeight);
                    ((BottomSheet) inviteLinkBottomSheet).shadowDrawable.draw(canvas);
                    if (fMin != 1.0f) {
                        Theme.dialogs_onlineCirclePaint.setColor(Theme.getColor(null, Theme.key_dialogBackground, false));
                        RectF rectF = this.rect;
                        rectF.set(((BottomSheet) inviteLinkBottomSheet).backgroundPaddingLeft, ((BottomSheet) inviteLinkBottomSheet).backgroundPaddingTop + i3, getMeasuredWidth() - ((BottomSheet) inviteLinkBottomSheet).backgroundPaddingLeft, AndroidUtilities.dp(24.0f) + ((BottomSheet) inviteLinkBottomSheet).backgroundPaddingTop + i3);
                        canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f) * fMin, AndroidUtilities.dp(12.0f) * fMin, Theme.dialogs_onlineCirclePaint);
                    }
                    if (iMin > 0) {
                        Theme.dialogs_onlineCirclePaint.setColor(Theme.getColor(null, Theme.key_dialogBackground, false));
                        canvas.drawRect(((BottomSheet) inviteLinkBottomSheet).backgroundPaddingLeft, AndroidUtilities.statusBarHeight - iMin, getMeasuredWidth() - ((BottomSheet) inviteLinkBottomSheet).backgroundPaddingLeft, AndroidUtilities.statusBarHeight, Theme.dialogs_onlineCirclePaint);
                    }
                    if (iMin > AndroidUtilities.statusBarHeight / 2) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    bool = this.statusBarOpen;
                    if (bool == null && bool.booleanValue() == z3) {
                        return;
                    }
                    if (AndroidUtilities.computePerceivedBrightness(inviteLinkBottomSheet.getThemedColor(Theme.key_dialogBackground)) > 0.721f) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    z5 = AndroidUtilities.computePerceivedBrightness(Theme.blendOver(inviteLinkBottomSheet.getThemedColor(Theme.key_actionBarDefault), 855638016)) > 0.721f;
                    this.statusBarOpen = Boolean.valueOf(z3);
                    if (!z3) {
                        z4 = z5;
                    }
                    AndroidUtilities.setLightStatusBar(inviteLinkBottomSheet.getWindow(), z4);
                }
                fMin = 1.0f;
                ((BottomSheet) inviteLinkBottomSheet).shadowDrawable.setBounds(0, i3, getMeasuredWidth(), AndroidUtilities.dp(10.0f) + i4 + AndroidUtilities.navigationBarHeight);
                ((BottomSheet) inviteLinkBottomSheet).shadowDrawable.draw(canvas);
                if (fMin != 1.0f) {
                    Theme.dialogs_onlineCirclePaint.setColor(Theme.getColor(null, Theme.key_dialogBackground, false));
                    RectF rectF2 = this.rect;
                    rectF2.set(((BottomSheet) inviteLinkBottomSheet).backgroundPaddingLeft, ((BottomSheet) inviteLinkBottomSheet).backgroundPaddingTop + i3, getMeasuredWidth() - ((BottomSheet) inviteLinkBottomSheet).backgroundPaddingLeft, AndroidUtilities.dp(24.0f) + ((BottomSheet) inviteLinkBottomSheet).backgroundPaddingTop + i3);
                    canvas.drawRoundRect(rectF2, AndroidUtilities.dp(12.0f) * fMin, AndroidUtilities.dp(12.0f) * fMin, Theme.dialogs_onlineCirclePaint);
                }
                if (iMin > 0) {
                    Theme.dialogs_onlineCirclePaint.setColor(Theme.getColor(null, Theme.key_dialogBackground, false));
                    canvas.drawRect(((BottomSheet) inviteLinkBottomSheet).backgroundPaddingLeft, AndroidUtilities.statusBarHeight - iMin, getMeasuredWidth() - ((BottomSheet) inviteLinkBottomSheet).backgroundPaddingLeft, AndroidUtilities.statusBarHeight, Theme.dialogs_onlineCirclePaint);
                }
                if (iMin > AndroidUtilities.statusBarHeight / 2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                bool = this.statusBarOpen;
                if (bool == null) {
                }
                if (AndroidUtilities.computePerceivedBrightness(inviteLinkBottomSheet.getThemedColor(Theme.key_dialogBackground)) > 0.721f) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (AndroidUtilities.computePerceivedBrightness(Theme.blendOver(inviteLinkBottomSheet.getThemedColor(Theme.key_actionBarDefault), 855638016)) > 0.721f) {
                }
                this.statusBarOpen = Boolean.valueOf(z3);
                if (!z3) {
                    z4 = z5;
                }
                AndroidUtilities.setLightStatusBar(inviteLinkBottomSheet.getWindow(), z4);
            }

            @Override
            public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                if (motionEvent.getAction() == 0) {
                    InviteLinkBottomSheet inviteLinkBottomSheet = InviteLinkBottomSheet.this;
                    if (inviteLinkBottomSheet.scrollOffsetY != 0 && motionEvent.getY() < inviteLinkBottomSheet.scrollOffsetY) {
                        inviteLinkBottomSheet.lambda$showGiftOfferSheet$15();
                        return true;
                    }
                }
                return super.onInterceptTouchEvent(motionEvent);
            }

            @Override
            public final void onLayout(boolean z3, int i2, int i3, int i4, int i5) {
                super.onLayout(z3, i2, i3, i4, i5);
                InviteLinkBottomSheet.access$400(InviteLinkBottomSheet.this);
            }

            @Override
            public final void onMeasure(int i2, int i3) {
                int size = View.MeasureSpec.getSize(i3);
                InviteLinkBottomSheet inviteLinkBottomSheet = InviteLinkBottomSheet.this;
                inviteLinkBottomSheet.ignoreLayout = true;
                setPadding(((BottomSheet) inviteLinkBottomSheet).backgroundPaddingLeft, AndroidUtilities.statusBarHeight, ((BottomSheet) inviteLinkBottomSheet).backgroundPaddingLeft, 0);
                inviteLinkBottomSheet.ignoreLayout = false;
                super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
                this.fullHeight = true;
            }

            @Override
            public final boolean onTouchEvent(MotionEvent motionEvent) {
                return !InviteLinkBottomSheet.this.isDismissed() && super.onTouchEvent(motionEvent);
            }

            @Override
            public final void requestLayout() {
                if (InviteLinkBottomSheet.this.ignoreLayout) {
                    return;
                }
                super.requestLayout();
            }
        };
        this.containerView = frameLayout;
        frameLayout.setWillNotDraw(false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 51);
        layoutParams.topMargin = AndroidUtilities.dp(48.0f);
        View view = new View(context);
        this.shadow = view;
        view.setAlpha(0.0f);
        view.setVisibility(4);
        view.setTag(1);
        this.containerView.addView(view, layoutParams);
        ?? r12 = new RecyclerListView(context) {
            public int lastH;

            @Override
            public final void onMeasure(int i2, int i3) {
                if (this.lastH != View.MeasureSpec.getSize(i3)) {
                    this.lastH = View.MeasureSpec.getSize(i3);
                    InviteLinkBottomSheet inviteLinkBottomSheet = InviteLinkBottomSheet.this;
                    inviteLinkBottomSheet.ignoreLayout = true;
                    inviteLinkBottomSheet.listView.setPadding(0, 0, 0, 0);
                    inviteLinkBottomSheet.ignoreLayout = false;
                    measure(i2, View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE));
                    int measuredHeight = getMeasuredHeight();
                    int i4 = this.lastH;
                    int i5 = (int) ((i4 / 5.0f) * 2.0f);
                    if (i5 < AndroidUtilities.dp(60.0f) + (i4 - measuredHeight)) {
                        i5 = this.lastH - measuredHeight;
                    }
                    inviteLinkBottomSheet.ignoreLayout = true;
                    inviteLinkBottomSheet.listView.setPadding(0, i5, 0, 0);
                    inviteLinkBottomSheet.ignoreLayout = false;
                    measure(i2, View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE));
                }
                super.onMeasure(i2, i3);
            }

            @Override
            public final void requestLayout() {
                if (InviteLinkBottomSheet.this.ignoreLayout) {
                    return;
                }
                super.requestLayout();
            }
        };
        this.listView = r12;
        r12.setSections();
        r12.setTag(14);
        getContext();
        final LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1, false);
        r12.setLayoutManager(linearLayoutManager);
        Adapter adapter = new Adapter();
        this.adapter = adapter;
        r12.setAdapter(adapter);
        r12.setVerticalScrollBarEnabled(false);
        r12.setClipToPadding(false);
        r12.setNestedScrollingEnabled(true);
        r12.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public final void onScrolled(RecyclerView recyclerView, int i2, int i3) {
                InviteLinkBottomSheet inviteLinkBottomSheet = InviteLinkBottomSheet.this;
                InviteLinkBottomSheet.access$400(inviteLinkBottomSheet);
                if (!inviteLinkBottomSheet.hasMore || inviteLinkBottomSheet.usersLoading) {
                    return;
                }
                if (inviteLinkBottomSheet.rowCount - linearLayoutManager.findLastVisibleItemPosition() < 10) {
                    inviteLinkBottomSheet.loadUsers();
                }
            }
        });
        r12.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(int i2, View view2) {
                BaseFragment baseFragment2 = baseFragment;
                this.f$0.lambda$new$3(tL_chatInviteExported, map, chatFull, context, j, baseFragment2, i2);
            }
        });
        TextView textView = new TextView(context);
        this.titleTextView = textView;
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setTextSize(1, 20.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setPadding(AndroidUtilities.dp(23.0f), 0, AndroidUtilities.dp(23.0f), 0);
        textView.setGravity(16);
        textView.setTypeface(AndroidUtilities.bold());
        if (z) {
            textView.setText(LocaleController.getString(R.string.InviteLink));
            this.titleVisible = false;
            textView.setVisibility(4);
            textView.setAlpha(0.0f);
        } else {
            if (tL_chatInviteExported.expired) {
                textView.setText(LocaleController.getString(R.string.ExpiredLink));
            } else if (tL_chatInviteExported.revoked) {
                textView.setText(LocaleController.getString(R.string.RevokedLink));
            } else {
                textView.setText(LocaleController.getString(R.string.InviteLink));
            }
            this.titleVisible = true;
        }
        if (!TextUtils.isEmpty(tL_chatInviteExported.title)) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_chatInviteExported.title);
            Emoji.replaceEmoji(spannableStringBuilder, textView.getPaint().getFontMetricsInt(), false);
            textView.setText(spannableStringBuilder);
        }
        this.containerView.addView((View) r12, LayoutHelper.createFrame(-1, -1.0f, 51, 0.0f, !this.titleVisible ? 0.0f : 44.0f, 0.0f, 0.0f));
        this.containerView.addView(textView, LayoutHelper.createFrame(-1, !this.titleVisible ? 44.0f : 50.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        updateRows$21();
        loadUsers();
        if (map == null || map.get(Long.valueOf(tL_chatInviteExported.admin_id)) == null) {
            TLRPC.TL_users_getUsers tL_users_getUsers = new TLRPC.TL_users_getUsers();
            tL_users_getUsers.id.add(MessagesController.getInstance(UserConfig.selectedAccount).getInputUser(tL_chatInviteExported.admin_id));
            ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_users_getUsers, new CallLogActivity$$ExternalSyntheticLambda1(this, 22));
        }
        updateColors$1();
    }

    public static void access$400(InviteLinkBottomSheet inviteLinkBottomSheet) {
        int childCount = inviteLinkBottomSheet.listView.getChildCount();
        View view = inviteLinkBottomSheet.shadow;
        TextView textView = inviteLinkBottomSheet.titleTextView;
        AnonymousClass2 anonymousClass2 = inviteLinkBottomSheet.listView;
        if (childCount <= 0) {
            int paddingTop = anonymousClass2.getPaddingTop();
            inviteLinkBottomSheet.scrollOffsetY = paddingTop;
            anonymousClass2.setTopGlowOffset(paddingTop);
            textView.setTranslationY(inviteLinkBottomSheet.scrollOffsetY);
            view.setTranslationY(inviteLinkBottomSheet.scrollOffsetY);
            inviteLinkBottomSheet.containerView.invalidate();
            return;
        }
        int i = 0;
        View childAt = anonymousClass2.getChildAt(0);
        RecyclerListView.Holder holder = (RecyclerListView.Holder) anonymousClass2.findContainingViewHolder(childAt);
        int top = childAt.getTop();
        if (top < 0 || holder == null || holder.getAdapterPosition() != 0) {
            inviteLinkBottomSheet.runShadowAnimation$1(true);
        } else {
            inviteLinkBottomSheet.runShadowAnimation$1(false);
            i = top;
        }
        if (inviteLinkBottomSheet.scrollOffsetY != i) {
            inviteLinkBottomSheet.scrollOffsetY = i;
            anonymousClass2.setTopGlowOffset(i);
            if (textView != null) {
                textView.setTranslationY(inviteLinkBottomSheet.scrollOffsetY);
            }
            view.setTranslationY(inviteLinkBottomSheet.scrollOffsetY);
            inviteLinkBottomSheet.containerView.invalidate();
        }
    }

    public static void showSubscriptionSheet(Context context, int i, long j, TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing, final TLRPC.TL_chatInviteImporter tL_chatInviteImporter, TLRPC.ChannelParticipant channelParticipant, Theme.ResourcesProvider resourcesProvider) {
        char c;
        BottomSheet bottomSheetM = VoIPService$$ExternalSyntheticOutline0.m(context, resourcesProvider, false, false);
        final BottomSheet[] bottomSheetArr = new BottomSheet[1];
        LinearLayout linearLayoutM = zzkf.m(context, 1);
        linearLayoutM.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(4.0f));
        linearLayoutM.setClipChildren(false);
        linearLayoutM.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        linearLayoutM.addView(frameLayout, LayoutHelper.createLinear(-1, -2, 7, 0, 0, 0, 10));
        BackupImageView backupImageView = new BackupImageView(context);
        backupImageView.setRoundRadius(AndroidUtilities.dp(50.0f));
        AvatarDrawable avatarDrawable = new AvatarDrawable((Theme.ResourcesProvider) null);
        if (j >= 0) {
            c = 0;
            TLRPC.User user = MessagesController.getInstance(i).getUser(Long.valueOf(j));
            avatarDrawable.setInfo(UserConfig.selectedAccount, user);
            backupImageView.imageReceiver.setForUserOrChat(user, avatarDrawable);
            backupImageView.onNewImageSet();
        } else {
            c = 0;
            TLRPC.Chat chat = MessagesController.getInstance(i).getChat(Long.valueOf(-j));
            avatarDrawable.setInfo(UserConfig.selectedAccount, chat);
            backupImageView.imageReceiver.setForUserOrChat(chat, avatarDrawable);
            backupImageView.onNewImageSet();
        }
        frameLayout.addView(backupImageView, LayoutHelper.createFrame(100, 100, 17));
        Drawable drawable = context.getResources().getDrawable(R.drawable.star_small_outline);
        drawable.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_dialogBackground, resourcesProvider), PorterDuff.Mode.SRC_IN));
        Drawable drawable2 = context.getResources().getDrawable(R.drawable.star_small_inner);
        ImageView imageView = new ImageView(context);
        imageView.setImageDrawable(drawable);
        frameLayout.addView(imageView, LayoutHelper.createFrame(28, 28, 17));
        imageView.setTranslationX(AndroidUtilities.dp(34.0f));
        imageView.setTranslationY(AndroidUtilities.dp(35.0f));
        imageView.setScaleX(1.1f);
        imageView.setScaleY(1.1f);
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageDrawable(drawable2);
        frameLayout.addView(imageView2, LayoutHelper.createFrame(28, 28, 17));
        imageView2.setTranslationX(AndroidUtilities.dp(34.0f));
        imageView2.setTranslationY(AndroidUtilities.dp(35.0f));
        TextView textView = new TextView(context);
        zzlj.m(Theme.key_dialogTextBlack, resourcesProvider, textView, 20.0f);
        textView.setGravity(17);
        textView.setText(LocaleController.getString(R.string.StarsSubscriptionTitle));
        TextView textViewM = ArticleViewer.IBlock.CC.m(linearLayoutM, textView, LayoutHelper.createLinear(-1, -2, 17, 20, 0, 20, 4), context);
        textViewM.setTextSize(1, 14.0f);
        textViewM.setGravity(17);
        int i2 = Theme.key_windowBackgroundWhiteGrayText4;
        textViewM.setTextColor(Theme.getColor(i2, resourcesProvider));
        int i3 = tL_starsSubscriptionPricing.period;
        if (i3 == 2592000) {
            int i4 = R.string.StarsSubscriptionPrice;
            Object[] objArr = new Object[1];
            objArr[c] = Long.valueOf(tL_starsSubscriptionPricing.amount);
            textViewM.setText(StarsIntroActivity.replaceStarsWithPlain(false, LocaleController.formatString(i4, objArr), 0.8f, null));
        } else {
            textViewM.setText(StarsIntroActivity.replaceStarsWithPlain(false, String.format(Locale.US, "⭐%1$d/%2$s", Long.valueOf(tL_starsSubscriptionPricing.amount), i3 == 300 ? "5min" : "min"), 0.8f, null));
        }
        TextView textViewM2 = ArticleViewer.IBlock.CC.m(linearLayoutM, textViewM, LayoutHelper.createLinear(-1, -2, 17, 20, 0, 20, 4), context);
        textViewM2.setTextSize(1, 14.0f);
        textViewM2.setGravity(17);
        textViewM2.setTextColor(Theme.getColor(i2, resourcesProvider));
        int i5 = tL_starsSubscriptionPricing.period;
        if (i5 == 2592000) {
            textViewM2.setText(LocaleController.formatString(R.string.StarsParticipantSubscriptionApproxMonth, BillingController.getInstance().formatCurrency((int) ((tL_starsSubscriptionPricing.amount / 1000.0d) * ((double) MessagesController.getInstance(i).starsUsdWithdrawRate1000)), "USD")));
        } else {
            textViewM2.setText(String.format(Locale.US, "appx. %1$s per %2$s", BillingController.getInstance().formatCurrency((int) (((double) MessagesController.getInstance(i).starsUsdWithdrawRate1000) * (tL_starsSubscriptionPricing.amount / 1000.0d)), "USD"), i5 == 300 ? "5min" : "min"));
        }
        linearLayoutM.addView(textViewM2, LayoutHelper.createLinear(-1, -2, 17, 20, 0, 20, 4));
        TableView tableView = new TableView(context, resourcesProvider);
        LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context, resourcesProvider);
        linksTextView.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        linksTextView.setEllipsize(TextUtils.TruncateAt.END);
        int i6 = Theme.key_chat_messageLinkIn;
        linksTextView.setTextColor(Theme.getColor(i6, resourcesProvider));
        linksTextView.setLinkTextColor(Theme.getColor(i6, resourcesProvider));
        linksTextView.setTextSize(1, 14.0f);
        linksTextView.setSingleLine(true);
        linksTextView.setDisablePaddingsOffsetY(true);
        AvatarSpan avatarSpan = new AvatarSpan(linksTextView, 24.0f, i);
        TLRPC.User user2 = MessagesController.getInstance(i).getUser(Long.valueOf(tL_chatInviteImporter.user_id));
        boolean z = user2 == null;
        String userName = UserObject.getUserName(user2);
        avatarSpan.setUser(user2);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  " + ((Object) userName));
        spannableStringBuilder.setSpan(avatarSpan, 0, 1, 33);
        spannableStringBuilder.setSpan(new ClickableSpan() {
            @Override
            public final void onClick(View view) {
                bottomSheetArr[0].lambda$showGiftOfferSheet$15();
                BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                if (safeLastFragment != null) {
                    safeLastFragment.presentFragment(ProfileActivity.of(tL_chatInviteImporter.user_id));
                }
            }

            @Override
            public final void updateDrawState(TextPaint textPaint) {
                textPaint.setUnderlineText(false);
            }
        }, 3, spannableStringBuilder.length(), 33);
        linksTextView.setText(spannableStringBuilder);
        if (!z) {
            tableView.addRowUnpadded(linksTextView, LocaleController.getString(R.string.StarsParticipantSubscription));
        }
        String string = LocaleController.getString(R.string.StarsParticipantSubscriptionStart);
        int i7 = R.string.formatDateAtTime;
        tableView.addRow(string, LocaleController.formatString(i7, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(((long) tL_chatInviteImporter.date) * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(((long) tL_chatInviteImporter.date) * 1000))), null, null);
        int currentTime = ConnectionsManager.getInstance(i).getCurrentTime();
        if (channelParticipant != null) {
            tableView.addRow(LocaleController.getString(channelParticipant.subscription_until_date > currentTime ? R.string.StarsParticipantSubscriptionRenews : R.string.StarsParticipantSubscriptionExpired), LocaleController.formatString(i7, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(((long) channelParticipant.subscription_until_date) * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(((long) channelParticipant.subscription_until_date) * 1000))), null, null);
        }
        linearLayoutM.addView(tableView, LayoutHelper.createLinear(0.0f, 17.0f, 0.0f, 0.0f, -1, -2));
        LinkSpanDrawable.LinksTextView linksTextView2 = new LinkSpanDrawable.LinksTextView(context, resourcesProvider);
        linksTextView2.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, resourcesProvider));
        linksTextView2.setLinkTextColor(Theme.getColor(i6, resourcesProvider));
        linksTextView2.setTextSize(1, 14.0f);
        linksTextView2.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTransactionTOS), new OAuthSheet$$ExternalSyntheticLambda0(context, 4)));
        linksTextView2.setGravity(17);
        linearLayoutM.addView(linksTextView2, LayoutHelper.createLinear(14.0f, 15.0f, 14.0f, 15.0f, -1, -2));
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, resourcesProvider, true);
        buttonWithCounterView.setText(LocaleController.getString(R.string.OK), false, true);
        linearLayoutM.addView(buttonWithCounterView, LayoutHelper.createLinear(-1, 48));
        buttonWithCounterView.setOnClickListener(new AccountFrozenAlert$$ExternalSyntheticLambda3(bottomSheetArr, 3));
        bottomSheetM.customView = linearLayoutM;
        bottomSheetArr[0] = bottomSheetM;
        bottomSheetM.useBackgroundTopPadding = false;
        bottomSheetM.fixNavigationBar();
        bottomSheetArr[0].show();
    }

    public static void updateColorForView(View view) {
        if (view instanceof HeaderCell) {
            ((HeaderCell) view).getTextView().setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlueHeader, false));
            return;
        }
        if (view instanceof LinkActionView) {
            ((LinkActionView) view).updateColors();
        } else if (view instanceof TextInfoPrivacyCell) {
            ((TextInfoPrivacyCell) view).setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText4, false));
        } else if (view instanceof UserCell) {
            ((UserCell) view).update(0);
        }
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    public final void lambda$new$0(AlertDialog alertDialog, Context context, long j, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, TLRPC.ChannelParticipant channelParticipant) {
        alertDialog.dismissUnless(400L);
        showSubscriptionSheet(context, this.currentAccount, -j, tL_chatInviteExported.subscription_pricing, tL_chatInviteImporter, channelParticipant, this.resourcesProvider);
    }

    public final void lambda$new$3(final TLRPC.TL_chatInviteExported tL_chatInviteExported, HashMap map, TLRPC.ChatFull chatFull, final Context context, final long j, BaseFragment baseFragment, int i) {
        TLRPC.TL_chatInviteImporter tL_chatInviteImporter;
        TLRPC.TL_chatInviteImporter tL_chatInviteImporter2;
        TLRPC.User user;
        TLRPC.ChannelParticipant channelParticipant;
        if (i == this.creatorRow && tL_chatInviteExported.admin_id == UserConfig.getInstance(this.currentAccount).clientUserId) {
            return;
        }
        int i2 = this.joinedStartRow;
        int i3 = 0;
        boolean z = i >= i2 && i < this.joinedEndRow;
        int i4 = this.expiredStartRow;
        boolean z2 = i >= i4 && i < this.expiredEndRow;
        int i5 = this.requestedStartRow;
        boolean z3 = i >= i5 && i < this.requestedEndRow;
        if ((i == this.creatorRow || z || z3) && map != null) {
            long j2 = tL_chatInviteExported.admin_id;
            if (z) {
                tL_chatInviteImporter2 = (TLRPC.TL_chatInviteImporter) this.joinedUsers.get(i - i2);
                j2 = tL_chatInviteImporter2.user_id;
            } else {
                if (!z2) {
                    if (z3) {
                        tL_chatInviteImporter2 = (TLRPC.TL_chatInviteImporter) this.requestedUsers.get(i - i5);
                        j2 = tL_chatInviteImporter2.user_id;
                    } else {
                        tL_chatInviteImporter = null;
                    }
                    user = (TLRPC.User) map.get(Long.valueOf(j2));
                    if (user != null) {
                        MessagesController.getInstance(UserConfig.selectedAccount).putUser(user, false);
                        if (z || tL_chatInviteExported.subscription_pricing == null) {
                            AndroidUtilities.runOnUIThread(new FilterGLThread$$ExternalSyntheticLambda1(this, user, baseFragment, 11), 100L);
                            lambda$showGiftOfferSheet$15();
                        }
                        if (chatFull != null && chatFull.participants != null) {
                            while (true) {
                                if (i3 >= chatFull.participants.participants.size()) {
                                    channelParticipant = null;
                                    break;
                                } else {
                                    if (chatFull.participants.participants.get(i3).user_id == j2 && (chatFull.participants.participants.get(i3) instanceof TLRPC.TL_chatChannelParticipant)) {
                                        channelParticipant = ((TLRPC.TL_chatChannelParticipant) chatFull.participants.participants.get(i3)).channelParticipant;
                                        break;
                                    }
                                    i3++;
                                }
                            }
                        } else {
                            channelParticipant = null;
                            break;
                        }
                        if (channelParticipant != null) {
                            showSubscriptionSheet(context, this.currentAccount, -j, tL_chatInviteExported.subscription_pricing, tL_chatInviteImporter, channelParticipant, this.resourcesProvider);
                            return;
                        }
                        final AlertDialog alertDialog = new AlertDialog(context, 3, null);
                        AlertDialog$$ExternalSyntheticLambda1 alertDialog$$ExternalSyntheticLambda1 = alertDialog.showRunnable;
                        AndroidUtilities.cancelRunOnUIThread(alertDialog$$ExternalSyntheticLambda1);
                        AndroidUtilities.runOnUIThread(alertDialog$$ExternalSyntheticLambda1, 120L);
                        final TLRPC.TL_chatInviteImporter tL_chatInviteImporter3 = tL_chatInviteImporter;
                        MessagesController.getInstance(this.currentAccount).getChannelParticipant(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j)), user, new Utilities.Callback() {
                            @Override
                            public final void run(Object obj) {
                                InviteLinkBottomSheet inviteLinkBottomSheet = this.f$0;
                                inviteLinkBottomSheet.getClass();
                                AlertDialog alertDialog2 = alertDialog;
                                TLRPC.TL_chatInviteExported tL_chatInviteExported2 = tL_chatInviteExported;
                                TLRPC.TL_chatInviteImporter tL_chatInviteImporter4 = tL_chatInviteImporter3;
                                AndroidUtilities.runOnUIThread(new ReportBottomSheet$$ExternalSyntheticLambda15(inviteLinkBottomSheet, alertDialog2, context, j, tL_chatInviteExported2, tL_chatInviteImporter4, (TLRPC.ChannelParticipant) obj, 3));
                            }
                        });
                        return;
                    }
                }
                tL_chatInviteImporter2 = (TLRPC.TL_chatInviteImporter) this.expiredUsers.get(i - i4);
                j2 = tL_chatInviteImporter2.user_id;
            }
            tL_chatInviteImporter = tL_chatInviteImporter2;
            user = (TLRPC.User) map.get(Long.valueOf(j2));
            if (user != null) {
                MessagesController.getInstance(UserConfig.selectedAccount).putUser(user, false);
                if (z) {
                }
                AndroidUtilities.runOnUIThread(new FilterGLThread$$ExternalSyntheticLambda1(this, user, baseFragment, 11), 100L);
                lambda$showGiftOfferSheet$15();
            }
        }
    }

    public final void loadUsers() {
        final boolean z;
        final boolean z2;
        final ArrayList arrayList;
        TLRPC.TL_messages_getChatInviteImporters tL_messages_getChatInviteImporters;
        if (this.usersLoading) {
            return;
        }
        TLRPC.TL_chatInviteExported tL_chatInviteExported = this.invite;
        int i = tL_chatInviteExported.usage;
        ArrayList arrayList2 = this.joinedUsers;
        boolean z3 = i > arrayList2.size();
        int i2 = tL_chatInviteExported.subscription_expired;
        ArrayList arrayList3 = this.expiredUsers;
        final boolean z4 = i2 > arrayList3.size();
        boolean z5 = tL_chatInviteExported.request_needed;
        ArrayList arrayList4 = this.requestedUsers;
        final boolean z6 = z5 && tL_chatInviteExported.requested > arrayList4.size();
        if (!z3) {
            if (z4) {
                z = false;
                z2 = true;
            } else if (!z6) {
                return;
            } else {
                z = true;
            }
            if (z) {
                arrayList = arrayList4;
            } else if (z2) {
                arrayList = arrayList3;
            } else {
                arrayList = arrayList2;
            }
            tL_messages_getChatInviteImporters = new TLRPC.TL_messages_getChatInviteImporters();
            tL_messages_getChatInviteImporters.flags |= 2;
            tL_messages_getChatInviteImporters.link = tL_chatInviteExported.link;
            tL_messages_getChatInviteImporters.peer = MessagesController.getInstance(UserConfig.selectedAccount).getInputPeer(-this.chatId);
            tL_messages_getChatInviteImporters.requested = z;
            tL_messages_getChatInviteImporters.subscription_expired = z2;
            if (arrayList.isEmpty()) {
                tL_messages_getChatInviteImporters.offset_user = new TLRPC.TL_inputUserEmpty();
            } else {
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) arrayList.get(arrayList.size() - 1);
                tL_messages_getChatInviteImporters.offset_user = MessagesController.getInstance(this.currentAccount).getInputUser((TLRPC.User) this.users.get(Long.valueOf(tL_chatInviteImporter.user_id)));
                tL_messages_getChatInviteImporters.offset_date = tL_chatInviteImporter.date;
            }
            this.usersLoading = true;
            ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_messages_getChatInviteImporters, new RequestDelegate() {
                @Override
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    final InviteLinkBottomSheet inviteLinkBottomSheet = this.f$0;
                    inviteLinkBottomSheet.getClass();
                    final ArrayList arrayList5 = arrayList;
                    final boolean z7 = z6;
                    final boolean z8 = z4;
                    final boolean z9 = z;
                    final boolean z10 = z2;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            boolean z11;
                            InviteLinkBottomSheet inviteLinkBottomSheet2 = inviteLinkBottomSheet;
                            if (tL_error == null) {
                                inviteLinkBottomSheet2.getClass();
                                TLRPC.TL_messages_chatInviteImporters tL_messages_chatInviteImporters = (TLRPC.TL_messages_chatInviteImporters) tLObject;
                                ArrayList<TLRPC.TL_chatInviteImporter> arrayList6 = tL_messages_chatInviteImporters.importers;
                                ArrayList arrayList7 = arrayList5;
                                arrayList7.addAll(arrayList6);
                                for (int i3 = 0; i3 < tL_messages_chatInviteImporters.users.size(); i3++) {
                                    TLRPC.User user = tL_messages_chatInviteImporters.users.get(i3);
                                    inviteLinkBottomSheet2.users.put(Long.valueOf(user.id), user);
                                }
                                if (!z9) {
                                    boolean z12 = z10;
                                    boolean z13 = z7;
                                    if (!z12 ? arrayList7.size() < tL_messages_chatInviteImporters.count || z13 || z8 : arrayList7.size() < tL_messages_chatInviteImporters.count || z13) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                } else if (arrayList7.size() < tL_messages_chatInviteImporters.count) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                inviteLinkBottomSheet2.hasMore = z11;
                                inviteLinkBottomSheet2.updateRows$21();
                            }
                            inviteLinkBottomSheet2.usersLoading = false;
                        }
                    });
                }
            });
        }
        z = false;
        z2 = false;
        if (z) {
            arrayList = arrayList4;
        } else if (z2) {
            arrayList = arrayList3;
        } else {
            arrayList = arrayList2;
        }
        tL_messages_getChatInviteImporters = new TLRPC.TL_messages_getChatInviteImporters();
        tL_messages_getChatInviteImporters.flags |= 2;
        tL_messages_getChatInviteImporters.link = tL_chatInviteExported.link;
        tL_messages_getChatInviteImporters.peer = MessagesController.getInstance(UserConfig.selectedAccount).getInputPeer(-this.chatId);
        tL_messages_getChatInviteImporters.requested = z;
        tL_messages_getChatInviteImporters.subscription_expired = z2;
        if (arrayList.isEmpty()) {
            tL_messages_getChatInviteImporters.offset_user = new TLRPC.TL_inputUserEmpty();
        } else {
            TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = (TLRPC.TL_chatInviteImporter) arrayList.get(arrayList.size() - 1);
            tL_messages_getChatInviteImporters.offset_user = MessagesController.getInstance(this.currentAccount).getInputUser((TLRPC.User) this.users.get(Long.valueOf(tL_chatInviteImporter2.user_id)));
            tL_messages_getChatInviteImporters.offset_date = tL_chatInviteImporter2.date;
        }
        this.usersLoading = true;
        ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_messages_getChatInviteImporters, new RequestDelegate() {
            @Override
            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                final InviteLinkBottomSheet inviteLinkBottomSheet = this.f$0;
                inviteLinkBottomSheet.getClass();
                final ArrayList arrayList5 = arrayList;
                final boolean z7 = z6;
                final boolean z8 = z4;
                final boolean z9 = z;
                final boolean z10 = z2;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z11;
                        InviteLinkBottomSheet inviteLinkBottomSheet2 = inviteLinkBottomSheet;
                        if (tL_error == null) {
                            inviteLinkBottomSheet2.getClass();
                            TLRPC.TL_messages_chatInviteImporters tL_messages_chatInviteImporters = (TLRPC.TL_messages_chatInviteImporters) tLObject;
                            ArrayList<TLRPC.TL_chatInviteImporter> arrayList6 = tL_messages_chatInviteImporters.importers;
                            ArrayList arrayList7 = arrayList5;
                            arrayList7.addAll(arrayList6);
                            for (int i3 = 0; i3 < tL_messages_chatInviteImporters.users.size(); i3++) {
                                TLRPC.User user = tL_messages_chatInviteImporters.users.get(i3);
                                inviteLinkBottomSheet2.users.put(Long.valueOf(user.id), user);
                            }
                            if (!z9) {
                                boolean z12 = z10;
                                boolean z13 = z7;
                                if (!z12 ? arrayList7.size() < tL_messages_chatInviteImporters.count || z13 || z8 : arrayList7.size() < tL_messages_chatInviteImporters.count || z13) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                            } else if (arrayList7.size() < tL_messages_chatInviteImporters.count) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            inviteLinkBottomSheet2.hasMore = z11;
                            inviteLinkBottomSheet2.updateRows$21();
                        }
                        inviteLinkBottomSheet2.usersLoading = false;
                    }
                });
            }
        });
    }

    public final void runShadowAnimation$1(boolean z) {
        View view = this.shadow;
        if ((!z || view.getTag() == null) && (z || view.getTag() != null)) {
            return;
        }
        view.setTag(z ? null : 1);
        TextView textView = this.titleTextView;
        if (z) {
            view.setVisibility(0);
            textView.setVisibility(0);
        }
        AnimatorSet animatorSet = this.shadowAnimation;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.shadowAnimation = animatorSet2;
        Property property = View.ALPHA;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) property, z ? 1.0f : 0.0f));
        if (!this.titleVisible) {
            this.shadowAnimation.playTogether(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, z ? 1.0f : 0.0f));
        }
        this.shadowAnimation.setDuration(150L);
        this.shadowAnimation.addListener(new ChatActivity.AnonymousClass77(26, this, z));
        this.shadowAnimation.start();
    }

    @Override
    public final void show() {
        super.show();
        this.isNeedReopen = false;
    }

    public final void updateColors$1() {
        TextView textView = this.titleTextView;
        if (textView != null) {
            textView.setTextColor(Theme.getColor(null, Theme.key_dialogTextBlack, false));
            textView.setLinkTextColor(Theme.getColor(null, Theme.key_dialogTextLink, false));
            textView.setHighlightColor(Theme.getColor(null, Theme.key_dialogLinkSelection, false));
            if (!this.titleVisible) {
                textView.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
            }
        }
        int color = Theme.getColor(null, Theme.key_dialogScrollGlow, false);
        AnonymousClass2 anonymousClass2 = this.listView;
        anonymousClass2.setGlowColor(color);
        this.shadow.setBackgroundColor(Theme.getColor(null, Theme.key_dialogShadowLine, false));
        setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundGray, false));
        int hiddenChildCount = anonymousClass2.getHiddenChildCount();
        for (int i = 0; i < anonymousClass2.getChildCount(); i++) {
            updateColorForView(anonymousClass2.getChildAt(i));
        }
        for (int i2 = 0; i2 < hiddenChildCount; i2++) {
            updateColorForView(anonymousClass2.getHiddenChildAt(i2));
        }
        int cachedChildCount = anonymousClass2.getCachedChildCount();
        for (int i3 = 0; i3 < cachedChildCount; i3++) {
            updateColorForView(anonymousClass2.getCachedChildAt(i3));
        }
        int attachedScrapChildCount = anonymousClass2.getAttachedScrapChildCount();
        for (int i4 = 0; i4 < attachedScrapChildCount; i4++) {
            updateColorForView(anonymousClass2.getAttachedScrapChildAt(i4));
        }
        this.containerView.invalidate();
    }

    public final void updateRows$21() {
        boolean z = false;
        this.rowCount = 0;
        this.dividerRow = -1;
        this.divider2Row = -1;
        this.divider3Row = -1;
        this.joinedHeaderRow = -1;
        this.joinedStartRow = -1;
        this.joinedEndRow = -1;
        this.emptyView2 = -1;
        this.emptyView3 = -1;
        this.linkActionRow = -1;
        this.linkInfoRow = -1;
        this.emptyHintRow = -1;
        this.requestedHeaderRow = -1;
        this.requestedStartRow = -1;
        this.requestedEndRow = -1;
        this.loadingRow = -1;
        this.revenueHeaderRow = -1;
        this.revenueRow = -1;
        this.expiredHeaderRow = -1;
        this.expiredStartRow = -1;
        this.expiredEndRow = -1;
        boolean z2 = true;
        if (!this.permanent) {
            this.linkActionRow = 0;
            this.rowCount = 2;
            this.linkInfoRow = 1;
        }
        TLRPC.TL_chatInviteExported tL_chatInviteExported = this.invite;
        if (tL_chatInviteExported.subscription_pricing != null) {
            int i = this.rowCount;
            this.revenueHeaderRow = i;
            this.rowCount = i + 2;
            this.revenueRow = i + 1;
        }
        int i2 = this.rowCount;
        this.creatorHeaderRow = i2;
        this.rowCount = i2 + 2;
        this.creatorRow = i2 + 1;
        int i3 = tL_chatInviteExported.usage;
        boolean z3 = i3 > 0 || tL_chatInviteExported.usage_limit > 0 || tL_chatInviteExported.requested > 0 || tL_chatInviteExported.subscription_expired > 0;
        ArrayList arrayList = this.joinedUsers;
        int size = arrayList.size();
        ArrayList arrayList2 = this.requestedUsers;
        ArrayList arrayList3 = this.expiredUsers;
        boolean z4 = i3 > size || tL_chatInviteExported.subscription_expired > arrayList3.size() || (tL_chatInviteExported.request_needed && tL_chatInviteExported.requested > arrayList2.size());
        if (!arrayList.isEmpty()) {
            int i4 = this.rowCount;
            int i5 = i4 + 1;
            this.rowCount = i5;
            this.joinedHeaderRow = i4;
            this.joinedStartRow = i5;
            int size2 = arrayList.size() + i5;
            this.rowCount = size2;
            this.joinedEndRow = size2;
            z = true;
        }
        if (!arrayList3.isEmpty()) {
            int i6 = this.rowCount;
            int i7 = i6 + 1;
            this.rowCount = i7;
            this.expiredHeaderRow = i6;
            this.expiredStartRow = i7;
            int size3 = arrayList3.size() + i7;
            this.rowCount = size3;
            this.expiredEndRow = size3;
            z = true;
        }
        if (arrayList2.isEmpty()) {
            z2 = z;
        } else {
            int i8 = this.rowCount;
            int i9 = i8 + 1;
            this.rowCount = i9;
            this.requestedHeaderRow = i8;
            this.requestedStartRow = i9;
            int size4 = arrayList2.size() + i9;
            this.rowCount = size4;
            this.requestedEndRow = size4;
        }
        if ((z3 || z4) && !z2) {
            int i10 = this.rowCount;
            this.dividerRow = i10;
            this.loadingRow = i10 + 1;
            this.rowCount = i10 + 3;
            this.emptyView2 = i10 + 2;
        }
        this.adapter.mObservable.notifyChanged();
    }
}
