package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.util.Log;
import com.google.android.gms.internal.mlkit_language_id_common.zzhr;
import com.google.android.gms.internal.mlkit_vision_common.zzkl;
import com.google.android.gms.internal.mlkit_vision_common.zzkr;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.BillingController$$ExternalSyntheticOutline0;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Cells.CreationTextCell;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.ManageChatTextCell;
import org.telegram.ui.Cells.ManageChatUserCell;
import org.telegram.ui.Cells.ShadowSectionCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Cells.TextSettingsCell;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.DotDividerSpan;
import org.telegram.ui.Components.FlickerLoadingView;
import org.telegram.ui.Components.InviteLinkBottomSheet;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkActionView;
import org.telegram.ui.Components.RecyclerItemsEnterAnimator;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.TimerParticles;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.Stories.recorder.HintView2;

public final class ManageLinksActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    public final long adminId;
    public final ArrayList admins;
    public int adminsDividerRow;
    public int adminsEndRow;
    public int adminsHeaderRow;
    public boolean adminsLoaded;
    public int adminsStartRow;
    public final boolean canEdit;
    public int createLinkHelpRow;
    public int createNewLinkRow;
    public int creatorDividerRow;
    public int creatorRow;
    public TLRPC.Chat currentChat;
    public final long currentChatId;
    public boolean deletingRevokedLinks;
    public int dividerRow;
    public boolean hasMore;
    public int helpRow;
    public TLRPC.ChatFull info;
    public TLRPC.TL_chatInviteExported invite;
    public InviteLinkBottomSheet inviteLinkBottomSheet;
    public final ArrayList invites;
    public final int invitesCount;
    public final boolean isChannel;
    public boolean isOpened;
    public boolean isPublic;
    public int lastDivider;
    public final AnonymousClass6 linkEditActivityCallback;
    public Drawable linkIcon;
    public Drawable linkIconRevenue;
    public Drawable linkIconRevoked;
    public int linksEndRow;
    public int linksHeaderRow;
    public int linksInfoRow;
    public boolean linksLoading;
    public int linksLoadingRow;
    public int linksStartRow;
    public RecyclerListView listView;
    public ListAdapter listViewAdapter;
    public boolean loadAdmins;
    public boolean loadRevoked;
    public final AnimationNotificationsLocker notificationsLocker;
    public int permanentLinkHeaderRow;
    public int permanentLinkRow;
    public RecyclerItemsEnterAnimator recyclerItemsEnterAnimator;
    public int revokeAllDivider;
    public int revokeAllRow;
    public int revokedDivider;
    public int revokedHeader;
    public final ArrayList revokedInvites;
    public int revokedLinksEndRow;
    public int revokedLinksStartRow;
    public int rowCount;
    public long timeDif;
    public final AnonymousClass1 updateTimerRunnable;
    public final HashMap users;

    public final class AnonymousClass6 implements LinkEditActivity.Callback {
        public AnonymousClass6() {
        }

        @Override
        public final void onLinkCreated(TLObject tLObject) {
            if (tLObject instanceof TLRPC.TL_chatInviteExported) {
                AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda2(19, this, tLObject), 200L);
            }
        }

        @Override
        public final void onLinkEdited(TLRPC.TL_chatInviteExported tL_chatInviteExported, TLObject tLObject) {
            if (tLObject instanceof TLRPC.TL_messages_exportedChatInvite) {
                TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject).invite;
                ManageLinksActivity manageLinksActivity = ManageLinksActivity.this;
                manageLinksActivity.fixDate(tL_chatInviteExported2);
                for (int i = 0; i < manageLinksActivity.invites.size(); i++) {
                    if (((TLRPC.TL_chatInviteExported) manageLinksActivity.invites.get(i)).link.equals(tL_chatInviteExported.link)) {
                        if (!tL_chatInviteExported2.revoked) {
                            manageLinksActivity.invites.set(i, tL_chatInviteExported2);
                            manageLinksActivity.updateRows$5(true);
                            return;
                        } else {
                            DiffCallback diffCallbackSaveListState = manageLinksActivity.saveListState();
                            manageLinksActivity.invites.remove(i);
                            manageLinksActivity.revokedInvites.add(0, tL_chatInviteExported2);
                            manageLinksActivity.updateRecyclerViewAnimated(diffCallbackSaveListState);
                            return;
                        }
                    }
                }
            }
        }

        @Override
        public final void revokeLink(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
            ManageLinksActivity.this.revokeLink(tL_chatInviteExported);
        }
    }

    public final class DiffCallback extends DiffUtil {
        public int oldAdminsEndRow;
        public int oldAdminsStartRow;
        public int oldLinksEndRow;
        public int oldLinksStartRow;
        public int oldRevokedLinksEndRow;
        public int oldRevokedLinksStartRow;
        public int oldRowCount;
        public final SparseIntArray oldPositionToItem = new SparseIntArray();
        public final SparseIntArray newPositionToItem = new SparseIntArray();
        public final ArrayList oldLinks = new ArrayList();
        public final ArrayList oldRevokedLinks = new ArrayList();

        public DiffCallback() {
        }

        @Override
        public final boolean areContentsTheSame(int i, int i2) {
            return areItemsTheSame(i, i2);
        }

        @Override
        public final boolean areItemsTheSame(int i, int i2) {
            int i3;
            int i4;
            int i5 = this.oldLinksStartRow;
            ManageLinksActivity manageLinksActivity = ManageLinksActivity.this;
            if (((i >= i5 && i < this.oldLinksEndRow) || (i >= this.oldRevokedLinksStartRow && i < this.oldRevokedLinksEndRow)) && ((i2 >= (i4 = manageLinksActivity.linksStartRow) && i2 < manageLinksActivity.linksEndRow) || (i2 >= manageLinksActivity.revokedLinksStartRow && i2 < manageLinksActivity.revokedLinksEndRow))) {
                TLRPC.TL_chatInviteExported tL_chatInviteExported = (i2 < i4 || i2 >= manageLinksActivity.linksEndRow) ? (TLRPC.TL_chatInviteExported) manageLinksActivity.revokedInvites.get(i2 - manageLinksActivity.revokedLinksStartRow) : (TLRPC.TL_chatInviteExported) manageLinksActivity.invites.get(i2 - i4);
                int i6 = this.oldLinksStartRow;
                return ((i < i6 || i >= this.oldLinksEndRow) ? (TLRPC.TL_chatInviteExported) this.oldRevokedLinks.get(i - this.oldRevokedLinksStartRow) : (TLRPC.TL_chatInviteExported) this.oldLinks.get(i - i6)).link.equals(tL_chatInviteExported.link);
            }
            int i7 = this.oldAdminsStartRow;
            if (i >= i7 && i < this.oldAdminsEndRow && i2 >= (i3 = manageLinksActivity.adminsStartRow) && i2 < manageLinksActivity.adminsEndRow) {
                return i - i7 == i2 - i3;
            }
            int i8 = this.oldPositionToItem.get(i, -1);
            return i8 >= 0 && i8 == this.newPositionToItem.get(i2, -1);
        }

        public final void fillPositions(SparseIntArray sparseIntArray) {
            sparseIntArray.clear();
            ManageLinksActivity manageLinksActivity = ManageLinksActivity.this;
            int i = manageLinksActivity.helpRow;
            if (i >= 0) {
                sparseIntArray.put(i, 1);
            }
            int i2 = manageLinksActivity.permanentLinkHeaderRow;
            if (i2 >= 0) {
                sparseIntArray.put(i2, 2);
            }
            int i3 = manageLinksActivity.permanentLinkRow;
            if (i3 >= 0) {
                sparseIntArray.put(i3, 3);
            }
            int i4 = manageLinksActivity.dividerRow;
            if (i4 >= 0) {
                sparseIntArray.put(i4, 4);
            }
            int i5 = manageLinksActivity.createNewLinkRow;
            if (i5 >= 0) {
                sparseIntArray.put(i5, 5);
            }
            int i6 = manageLinksActivity.revokedHeader;
            if (i6 >= 0) {
                sparseIntArray.put(i6, 6);
            }
            int i7 = manageLinksActivity.revokeAllRow;
            if (i7 >= 0) {
                sparseIntArray.put(i7, 7);
            }
            int i8 = manageLinksActivity.createLinkHelpRow;
            if (i8 >= 0) {
                sparseIntArray.put(i8, 8);
            }
            int i9 = manageLinksActivity.creatorRow;
            if (i9 >= 0) {
                sparseIntArray.put(i9, 9);
            }
            int i10 = manageLinksActivity.creatorDividerRow;
            if (i10 >= 0) {
                sparseIntArray.put(i10, 10);
            }
            int i11 = manageLinksActivity.adminsHeaderRow;
            if (i11 >= 0) {
                sparseIntArray.put(i11, 11);
            }
            int i12 = manageLinksActivity.linksHeaderRow;
            if (i12 >= 0) {
                sparseIntArray.put(i12, 12);
            }
            int i13 = manageLinksActivity.linksLoadingRow;
            if (i13 >= 0) {
                sparseIntArray.put(i13, 13);
            }
        }

        @Override
        public final int getNewListSize() {
            return ManageLinksActivity.this.rowCount;
        }

        @Override
        public final int getOldListSize() {
            return this.oldRowCount;
        }
    }

    public final class EmptyView extends LinearLayout implements NotificationCenter.NotificationCenterDelegate {
        public final int currentAccount;
        public final BackupImageView stickerView;

        public EmptyView(Context context) {
            super(context);
            this.currentAccount = UserConfig.selectedAccount;
            setPadding(0, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f));
            setOrientation(1);
            BackupImageView backupImageView = new BackupImageView(context);
            this.stickerView = backupImageView;
            addView(backupImageView, LayoutHelper.createLinear(104, 104, 49, 0, 2, 0, 0));
        }

        @Override
        public final void didReceivedNotification(int i, int i2, Object... objArr) {
            if (i == NotificationCenter.diceStickersDidLoad && "tg_placeholders_android".equals((String) objArr[0])) {
                setSticker$3();
            }
        }

        @Override
        public final void onAttachedToWindow() {
            super.onAttachedToWindow();
            setSticker$3();
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.diceStickersDidLoad);
        }

        @Override
        public final void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.diceStickersDidLoad);
        }

        public final void setSticker$3() {
            int i = this.currentAccount;
            TLRPC.TL_messages_stickerSet stickerSetByName = MediaDataController.getInstance(i).getStickerSetByName("tg_placeholders_android");
            if (stickerSetByName == null) {
                stickerSetByName = MediaDataController.getInstance(i).getStickerSetByEmojiOrName("tg_placeholders_android");
            }
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = stickerSetByName;
            if (tL_messages_stickerSet == null || tL_messages_stickerSet.documents.size() < 4) {
                MediaDataController.getInstance(i).loadStickersByEmojiOrName("tg_placeholders_android", false, tL_messages_stickerSet == null);
            } else {
                TLRPC.Document document = tL_messages_stickerSet.documents.get(3);
                this.stickerView.setImage(ImageLocation.getForDocument(document), "104_104", null, null, DocumentObject.getSvgThumb(document, Theme.key_windowBackgroundGray, 1.0f), "tgs", 0, tL_messages_stickerSet);
            }
        }
    }

    public final class HintInnerCell extends FrameLayout {
        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
        }
    }

    public final class LinkCell extends FrameLayout {
        public int animateFromState;
        public boolean animateHideExpiring;
        public float animateToStateProgress;
        public boolean drawDivider;
        public TLRPC.TL_chatInviteExported invite;
        public float lastDrawExpringProgress;
        public int lastDrawingState;
        public final ImageView optionsView;
        public final Paint paint;
        public final Paint paint2;
        public int position;
        public final LinearLayout priceLayout;
        public final TextView priceSubitleView;
        public final TextView priceTitleView;
        public final RectF rectF;
        public final TextView subtitleView;
        public final LinearLayout textLayout;
        public final TimerParticles timerParticles;
        public boolean timerRunning;
        public final TextView titleView;

        public LinkCell(Context context) {
            super(context);
            this.paint = new Paint(1);
            Paint paint = new Paint(1);
            this.paint2 = paint;
            this.rectF = new RectF();
            this.animateToStateProgress = 1.0f;
            this.timerParticles = new TimerParticles(40);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(Paint.Cap.ROUND);
            LinearLayout linearLayout = new LinearLayout(context);
            this.textLayout = linearLayout;
            linearLayout.setOrientation(1);
            addView(linearLayout, LayoutHelper.createFrame(-1, -2.0f, 16, 64.0f, 0.0f, 30.0f, 0.0f));
            TextView textView = new TextView(context);
            this.titleView = textView;
            textView.setTextSize(1, 16.0f);
            int i = Theme.key_windowBackgroundWhiteBlackText;
            textView.setTextColor(Theme.getColor(null, i, false));
            textView.setLines(1);
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            textView.setEllipsize(truncateAt);
            linearLayout.addView(textView, LayoutHelper.createLinear(-1, -2));
            TextView textView2 = new TextView(context);
            this.subtitleView = textView2;
            textView2.setTextSize(1, 13.0f);
            int i2 = Theme.key_windowBackgroundWhiteGrayText;
            textView2.setTextColor(Theme.getColor(null, i2, false));
            linearLayout.addView(textView2, LayoutHelper.createLinear(0.0f, 4.33f, 0.0f, 0.0f, -1, -2));
            ImageView imageView = new ImageView(context);
            this.optionsView = imageView;
            imageView.setImageDrawable(context.getDrawable(R.drawable.ic_ab_other));
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setColorFilter(Theme.getColor(null, Theme.key_stickers_menu, false));
            imageView.setOnClickListener(new OAuthSheet$$ExternalSyntheticLambda4(this, 9));
            imageView.setBackground(Theme.createSelectorDrawable(Theme.getColor(null, Theme.key_listSelector, false), 1, -1));
            addView(imageView, LayoutHelper.createFrame(48, 48.0f, 21, 0.0f, 0.0f, 8.0f, 0.0f));
            setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
            setWillNotDraw(false);
            LinearLayout linearLayout2 = new LinearLayout(context);
            this.priceLayout = linearLayout2;
            linearLayout2.setOrientation(1);
            TextView textView3 = new TextView(context);
            this.priceTitleView = textView3;
            textView3.setTextSize(1, 16.0f);
            textView3.setTextColor(Theme.getColor(null, i, false));
            textView3.setLines(1);
            textView3.setEllipsize(truncateAt);
            textView3.setTypeface(AndroidUtilities.bold());
            textView3.setGravity(5);
            linearLayout2.addView(textView3, LayoutHelper.createLinear(-1, -2, 5));
            TextView textView4 = new TextView(context);
            this.priceSubitleView = textView4;
            textView4.setTextSize(1, 13.0f);
            zzkr.m(i2, textView4, 5);
            linearLayout2.addView(textView4, LayoutHelper.createLinear(-1, -2, 5, 0, 1, 0, 0));
            addView(linearLayout2, LayoutHelper.createFrame(-2, -2.0f, 21, 0.0f, 0.0f, 18.0f, 0.0f));
            linearLayout2.setVisibility(8);
        }

        public final int getColor(float f, int i) {
            TLRPC.TL_chatInviteExported tL_chatInviteExported = this.invite;
            if (tL_chatInviteExported != null && tL_chatInviteExported.subscription_pricing != null) {
                return Theme.getColor(null, Theme.key_color_green, false);
            }
            if (i == 3) {
                return Theme.getColor(null, Theme.key_chat_attachAudioBackground, false);
            }
            if (i == 1) {
                if (f > 0.5f) {
                    return ColorUtils.blendARGB(1.0f - ((f - 0.5f) / 0.5f), Theme.getColor(null, Theme.key_chat_attachLocationBackground, false), Theme.getColor(null, Theme.key_chat_attachPollBackground, false));
                }
                return ColorUtils.blendARGB(1.0f - (f / 0.5f), Theme.getColor(null, Theme.key_chat_attachPollBackground, false), Theme.getColor(null, Theme.key_chat_attachAudioBackground, false));
            }
            if (i == 2) {
                return Theme.getColor(null, Theme.key_chat_attachPollBackground, false);
            }
            return i == 4 ? Theme.getColor(null, Theme.key_chats_unreadCounterMuted, false) : Theme.getColor(null, Theme.key_featuredStickers_addButton, false);
        }

        @Override
        public final void onDraw(Canvas canvas) {
            float f;
            float f2;
            float fMin;
            int i;
            float f3;
            Paint paint;
            RectF rectF;
            int i2;
            Canvas canvas2 = canvas;
            if (this.invite == null) {
                return;
            }
            int iDp = AndroidUtilities.dp(32.0f);
            int measuredHeight = getMeasuredHeight() / 2;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = this.invite;
            boolean z = tL_chatInviteExported.expired;
            ManageLinksActivity manageLinksActivity = ManageLinksActivity.this;
            if (z || tL_chatInviteExported.revoked) {
                f = 32.0f;
                if (tL_chatInviteExported.revoked) {
                    i = 4;
                    f2 = 1.0f;
                    fMin = 0.0f;
                } else {
                    f2 = 1.0f;
                    fMin = 0.0f;
                    i = 3;
                }
            } else {
                int i3 = tL_chatInviteExported.expire_date;
                if (i3 > 0 || tL_chatInviteExported.usage_limit > 0) {
                    if (i3 > 0) {
                        long jCurrentTimeMillis = (manageLinksActivity.timeDif * 1000) + System.currentTimeMillis();
                        TLRPC.TL_chatInviteExported tL_chatInviteExported2 = this.invite;
                        f = 32.0f;
                        long j = ((long) tL_chatInviteExported2.expire_date) * 1000;
                        int i4 = tL_chatInviteExported2.start_date;
                        if (i4 <= 0) {
                            i4 = tL_chatInviteExported2.date;
                        }
                        long j2 = ((long) i4) * 1000;
                        f2 = 1.0f - ((jCurrentTimeMillis - j2) / (j - j2));
                    } else {
                        f = 32.0f;
                        f2 = 1.0f;
                    }
                    TLRPC.TL_chatInviteExported tL_chatInviteExported3 = this.invite;
                    int i5 = tL_chatInviteExported3.usage_limit;
                    fMin = Math.min(f2, i5 > 0 ? (i5 - tL_chatInviteExported3.usage) / i5 : 1.0f);
                    if (fMin <= 0.0f) {
                        this.invite.expired = true;
                        AndroidUtilities.updateVisibleRows(manageLinksActivity.listView);
                        i = 3;
                    } else {
                        i = 1;
                    }
                } else {
                    f2 = 1.0f;
                    fMin = 0.0f;
                    i = 0;
                    f = 32.0f;
                }
            }
            int i6 = this.lastDrawingState;
            if (i != i6 && i6 >= 0) {
                this.animateFromState = i6;
                this.animateToStateProgress = 0.0f;
                if ((i6 != 2 && i6 != 1) || i == 2 || i == 1) {
                    this.animateHideExpiring = false;
                } else {
                    this.animateHideExpiring = true;
                }
            }
            this.lastDrawingState = i;
            float f4 = this.animateToStateProgress;
            if (f4 != 1.0f) {
                float f5 = f4 + 0.064f;
                this.animateToStateProgress = f5;
                if (f5 >= 1.0f) {
                    this.animateToStateProgress = 1.0f;
                    this.animateHideExpiring = false;
                } else {
                    invalidate();
                }
            }
            int iBlendARGB = this.animateToStateProgress != 1.0f ? ColorUtils.blendARGB(this.animateToStateProgress, getColor(fMin, this.animateFromState), getColor(fMin, i)) : getColor(fMin, i);
            Paint paint2 = this.paint;
            paint2.setColor(iBlendARGB);
            canvas2.drawCircle(iDp, measuredHeight, AndroidUtilities.dp(f) / 2.0f, paint2);
            boolean z2 = this.animateHideExpiring;
            if (z2) {
                if (z2) {
                    f2 = this.lastDrawExpringProgress;
                }
                f3 = f2;
                paint = this.paint2;
                paint.setColor(iBlendARGB);
                rectF = this.rectF;
                rectF.set(iDp - AndroidUtilities.dp(20.0f), measuredHeight - AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f) + iDp, AndroidUtilities.dp(20.0f) + measuredHeight);
                if (this.animateToStateProgress != 1.0f) {
                    float f6 = (-f3) * 360.0f;
                    canvas.drawArc(rectF, -90.0f, f6, false, paint);
                    this.timerParticles.draw(f6, 1.0f, canvas, paint, rectF);
                    canvas2 = canvas;
                } else {
                    float f7 = (-f3) * 360.0f;
                    canvas.drawArc(rectF, -90.0f, f7, false, paint);
                    this.timerParticles.draw(f7, 1.0f, canvas, paint, rectF);
                    canvas2 = canvas;
                }
                if (!((BaseFragment) manageLinksActivity).isPaused) {
                    invalidate();
                }
                this.lastDrawExpringProgress = f3;
            } else {
                TLRPC.TL_chatInviteExported tL_chatInviteExported4 = this.invite;
                if (!tL_chatInviteExported4.expired && tL_chatInviteExported4.expire_date > 0 && !tL_chatInviteExported4.revoked) {
                    if (z2) {
                        f2 = this.lastDrawExpringProgress;
                    }
                    f3 = f2;
                    paint = this.paint2;
                    paint.setColor(iBlendARGB);
                    rectF = this.rectF;
                    rectF.set(iDp - AndroidUtilities.dp(20.0f), measuredHeight - AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f) + iDp, AndroidUtilities.dp(20.0f) + measuredHeight);
                    if (this.animateToStateProgress != 1.0f || (((i2 = this.animateFromState) == 2 || i2 == 1) && !this.animateHideExpiring)) {
                        float f8 = (-f3) * 360.0f;
                        canvas.drawArc(rectF, -90.0f, f8, false, paint);
                        this.timerParticles.draw(f8, 1.0f, canvas, paint, rectF);
                        canvas2 = canvas;
                    } else {
                        canvas2.save();
                        float f9 = this.animateHideExpiring ? 1.0f - this.animateToStateProgress : this.animateToStateProgress;
                        float f10 = (float) (((double) (0.3f * f9)) + 0.7d);
                        canvas2.scale(f10, f10, rectF.centerX(), rectF.centerY());
                        float f11 = (-f3) * 360.0f;
                        canvas2.drawArc(rectF, -90.0f, f11, false, paint);
                        this.timerParticles.draw(f11, f9, canvas, paint, rectF);
                        canvas.restore();
                        canvas2 = canvas;
                    }
                    if (!((BaseFragment) manageLinksActivity).isPaused) {
                        invalidate();
                    }
                    this.lastDrawExpringProgress = f3;
                }
            }
            TLRPC.TL_chatInviteExported tL_chatInviteExported5 = this.invite;
            if (tL_chatInviteExported5.subscription_pricing != null) {
                manageLinksActivity.linkIconRevenue.setBounds(iDp - AndroidUtilities.dp(12.0f), measuredHeight - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + iDp, AndroidUtilities.dp(12.0f) + measuredHeight);
                manageLinksActivity.linkIconRevenue.draw(canvas2);
            } else if (tL_chatInviteExported5.revoked) {
                manageLinksActivity.linkIconRevoked.setBounds(iDp - AndroidUtilities.dp(12.0f), measuredHeight - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + iDp, AndroidUtilities.dp(12.0f) + measuredHeight);
                manageLinksActivity.linkIconRevoked.draw(canvas2);
            } else {
                manageLinksActivity.linkIcon.setBounds(iDp - AndroidUtilities.dp(12.0f), measuredHeight - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + iDp, AndroidUtilities.dp(12.0f) + measuredHeight);
                manageLinksActivity.linkIcon.draw(canvas2);
            }
            if (this.drawDivider) {
                canvas2.drawLine(AndroidUtilities.dp(70.0f), getMeasuredHeight() - 1, AndroidUtilities.dp(23.0f) + getMeasuredWidth(), getMeasuredHeight(), Theme.dividerPaint);
            }
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(60.0f), 1073741824));
            this.paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
        }

        public final void setLink(TLRPC.TL_chatInviteExported tL_chatInviteExported, int i) {
            String pluralString;
            int i2;
            this.timerRunning = false;
            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = this.invite;
            if (tL_chatInviteExported2 == null || tL_chatInviteExported == null || !tL_chatInviteExported2.link.equals(tL_chatInviteExported.link)) {
                this.lastDrawingState = -1;
                this.animateToStateProgress = 1.0f;
            }
            this.invite = tL_chatInviteExported;
            this.position = i;
            if (tL_chatInviteExported == null) {
                return;
            }
            int iDp = AndroidUtilities.dp(30.0f);
            TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = tL_chatInviteExported.subscription_pricing;
            ImageView imageView = this.optionsView;
            LinearLayout linearLayout = this.priceLayout;
            if (tL_starsSubscriptionPricing != null) {
                linearLayout.setVisibility(0);
                imageView.setVisibility(8);
                TextView textView = this.priceTitleView;
                textView.setText(StarsIntroActivity.replaceStarsWithPlain(false, BillingController$$ExternalSyntheticOutline0.m(tL_chatInviteExported.subscription_pricing.amount, ',', new StringBuilder("⭐️ ")), 0.75f, null));
                int i3 = tL_chatInviteExported.subscription_pricing.period;
                TextView textView2 = this.priceSubitleView;
                if (i3 == 2592000) {
                    textView2.setText(LocaleController.getString(R.string.StarsParticipantSubscriptionPerMonth));
                } else if (i3 == 300) {
                    textView2.setText("per 5 minutes");
                } else if (i3 == 60) {
                    textView2.setText("each minute");
                }
                iDp = ((int) Math.max(HintView2.measureCorrectly(textView.getText(), textView.getPaint()), HintView2.measureCorrectly(textView2.getText(), textView2.getPaint()))) + AndroidUtilities.dp(28.0f);
            } else {
                linearLayout.setVisibility(8);
                imageView.setVisibility(8);
            }
            ((ViewGroup.MarginLayoutParams) this.textLayout.getLayoutParams()).rightMargin = iDp;
            boolean zIsEmpty = TextUtils.isEmpty(tL_chatInviteExported.title);
            ManageLinksActivity manageLinksActivity = ManageLinksActivity.this;
            TextView textView3 = this.titleView;
            if (!zIsEmpty) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_chatInviteExported.title);
                Emoji.replaceEmoji(spannableStringBuilder, textView3.getPaint().getFontMetricsInt(), false);
                textView3.setText(spannableStringBuilder);
            } else if (tL_chatInviteExported.link.startsWith("https://t.me/+")) {
                textView3.setText(MessagesController.getInstance(((BaseFragment) manageLinksActivity).currentAccount).linkPrefix + "/" + tL_chatInviteExported.link.substring(14));
            } else if (tL_chatInviteExported.link.startsWith("https://t.me/joinchat/")) {
                textView3.setText(tL_chatInviteExported.link.substring(22));
            } else if (tL_chatInviteExported.link.startsWith("https://")) {
                textView3.setText(tL_chatInviteExported.link.substring(8));
            } else {
                textView3.setText(tL_chatInviteExported.link);
            }
            int i4 = tL_chatInviteExported.usage;
            if (i4 == 0 && tL_chatInviteExported.usage_limit == 0 && tL_chatInviteExported.requested == 0) {
                pluralString = LocaleController.getString(tL_chatInviteExported.subscription_pricing != null ? R.string.NoOneSubscribed : R.string.NoOneJoined);
            } else {
                int i5 = tL_chatInviteExported.usage_limit;
                if (i5 > 0 && i4 == 0 && !tL_chatInviteExported.expired && !tL_chatInviteExported.revoked) {
                    pluralString = LocaleController.formatPluralString("CanJoin", i5, new Object[0]);
                } else if (i5 > 0 && tL_chatInviteExported.expired && tL_chatInviteExported.revoked) {
                    pluralString = LocaleController.formatPluralString("PeopleJoined", tL_chatInviteExported.usage, new Object[0]) + ", " + LocaleController.formatPluralString("PeopleJoinedRemaining", tL_chatInviteExported.usage_limit - tL_chatInviteExported.usage, new Object[0]);
                } else {
                    pluralString = i4 > 0 ? LocaleController.formatPluralString("PeopleJoined", i4, new Object[0]) : "";
                    if (tL_chatInviteExported.requested > 0) {
                        if (tL_chatInviteExported.usage > 0) {
                            pluralString = zzhr.m(pluralString, ", ");
                        }
                        StringBuilder sbM = Log.m(pluralString);
                        sbM.append(LocaleController.formatPluralString("JoinRequests", tL_chatInviteExported.requested, new Object[0]));
                        pluralString = sbM.toString();
                    }
                }
            }
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(pluralString);
            if (tL_chatInviteExported.permanent && !tL_chatInviteExported.revoked) {
                DotDividerSpan dotDividerSpan = new DotDividerSpan();
                dotDividerSpan.topPadding = AndroidUtilities.dp(1.5f);
                spannableStringBuilder2.append((CharSequence) "  .  ").setSpan(dotDividerSpan, spannableStringBuilder2.length() - 3, spannableStringBuilder2.length() - 2, 0);
                spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.Permanent));
            } else if (tL_chatInviteExported.expired || tL_chatInviteExported.revoked) {
                if (tL_chatInviteExported.revoked && tL_chatInviteExported.usage == 0) {
                    String string = LocaleController.getString(tL_chatInviteExported.subscription_pricing != null ? R.string.NoOneSubscribed : R.string.NoOneJoined);
                    spannableStringBuilder2.clear();
                    spannableStringBuilder2.append((CharSequence) string);
                }
                DotDividerSpan dotDividerSpan2 = new DotDividerSpan();
                dotDividerSpan2.topPadding = AndroidUtilities.dp(1.5f);
                spannableStringBuilder2.append((CharSequence) "  .  ").setSpan(dotDividerSpan2, spannableStringBuilder2.length() - 3, spannableStringBuilder2.length() - 2, 0);
                boolean z = tL_chatInviteExported.revoked;
                if (z || (i2 = tL_chatInviteExported.usage_limit) <= 0 || tL_chatInviteExported.usage < i2) {
                    spannableStringBuilder2.append((CharSequence) LocaleController.getString(z ? R.string.Revoked : R.string.Expired));
                } else {
                    spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.LinkLimitReached));
                }
            } else if (tL_chatInviteExported.expire_date > 0) {
                DotDividerSpan dotDividerSpan3 = new DotDividerSpan();
                dotDividerSpan3.topPadding = AndroidUtilities.dp(1.5f);
                spannableStringBuilder2.append((CharSequence) "  .  ").setSpan(dotDividerSpan3, spannableStringBuilder2.length() - 3, spannableStringBuilder2.length() - 2, 0);
                long jCurrentTimeMillis = (((long) tL_chatInviteExported.expire_date) * 1000) - ((manageLinksActivity.timeDif * 1000) + System.currentTimeMillis());
                if (jCurrentTimeMillis < 0) {
                    jCurrentTimeMillis = 0;
                }
                if (jCurrentTimeMillis > 86400000) {
                    spannableStringBuilder2.append((CharSequence) LocaleController.formatPluralString("DaysLeft", (int) (jCurrentTimeMillis / 86400000), new Object[0]));
                } else {
                    long j = jCurrentTimeMillis / 1000;
                    int i6 = (int) (j % 60);
                    long j2 = j / 60;
                    int i7 = (int) (j2 % 60);
                    int i8 = (int) (j2 / 60);
                    Locale locale = Locale.ENGLISH;
                    spannableStringBuilder2.append((CharSequence) String.format(locale, "%02d", Integer.valueOf(i8))).append((CharSequence) String.format(locale, ":%02d", Integer.valueOf(i7))).append((CharSequence) String.format(locale, ":%02d", Integer.valueOf(i6)));
                    this.timerRunning = true;
                }
            }
            if (tL_chatInviteExported.request_needed) {
                DotDividerSpan dotDividerSpan4 = new DotDividerSpan();
                dotDividerSpan4.topPadding = AndroidUtilities.dp(1.5f);
                spannableStringBuilder2.append((CharSequence) "  .  ").setSpan(dotDividerSpan4, spannableStringBuilder2.length() - 3, spannableStringBuilder2.length() - 2, 0);
                spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.ApprovalRequired));
            }
            this.subtitleView.setText(spannableStringBuilder2);
        }
    }

    public final class ListAdapter extends RecyclerListView.SelectionAdapter {
        public final Context mContext;

        public ListAdapter(Context context) {
            this.mContext = context;
        }

        @Override
        public final int getItemCount() {
            return ManageLinksActivity.this.rowCount;
        }

        @Override
        public final int getItemViewType(int i) {
            ManageLinksActivity manageLinksActivity = ManageLinksActivity.this;
            if (i == manageLinksActivity.helpRow) {
                return 0;
            }
            if (i == manageLinksActivity.permanentLinkHeaderRow || i == manageLinksActivity.revokedHeader || i == manageLinksActivity.adminsHeaderRow || i == manageLinksActivity.linksHeaderRow) {
                return 1;
            }
            if (i == manageLinksActivity.permanentLinkRow) {
                return 2;
            }
            if (i == manageLinksActivity.createNewLinkRow) {
                return 3;
            }
            if (i == manageLinksActivity.dividerRow || i == manageLinksActivity.revokedDivider || i == manageLinksActivity.revokeAllDivider || i == manageLinksActivity.creatorDividerRow || i == manageLinksActivity.adminsDividerRow) {
                return 4;
            }
            if (i >= manageLinksActivity.linksStartRow && i < manageLinksActivity.linksEndRow) {
                return 5;
            }
            if (i >= manageLinksActivity.revokedLinksStartRow && i < manageLinksActivity.revokedLinksEndRow) {
                return 5;
            }
            if (i == manageLinksActivity.linksLoadingRow) {
                return 6;
            }
            if (i == manageLinksActivity.lastDivider) {
                return 7;
            }
            if (i == manageLinksActivity.revokeAllRow) {
                return 8;
            }
            if (i == manageLinksActivity.createLinkHelpRow) {
                return 9;
            }
            if (i == manageLinksActivity.creatorRow) {
                return 10;
            }
            if (i < manageLinksActivity.adminsStartRow || i >= manageLinksActivity.adminsEndRow) {
                return i == manageLinksActivity.linksInfoRow ? 11 : 1;
            }
            return 10;
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            int adapterPosition = viewHolder.getAdapterPosition();
            ManageLinksActivity manageLinksActivity = ManageLinksActivity.this;
            if (manageLinksActivity.creatorRow == adapterPosition || manageLinksActivity.createNewLinkRow == adapterPosition) {
                return true;
            }
            if (adapterPosition >= manageLinksActivity.linksStartRow && adapterPosition < manageLinksActivity.linksEndRow) {
                return true;
            }
            if ((adapterPosition < manageLinksActivity.revokedLinksStartRow || adapterPosition >= manageLinksActivity.revokedLinksEndRow) && adapterPosition != manageLinksActivity.revokeAllRow) {
                return adapterPosition >= manageLinksActivity.adminsStartRow && adapterPosition < manageLinksActivity.adminsEndRow;
            }
            return true;
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            TLRPC.TL_chatInviteExported tL_chatInviteExported;
            int i2;
            TLRPC.User user;
            int i3 = viewHolder.mItemViewType;
            ManageLinksActivity manageLinksActivity = ManageLinksActivity.this;
            boolean z = true;
            long j = manageLinksActivity.adminId;
            View view = viewHolder.itemView;
            if (i3 == 1) {
                HeaderCell headerCell = (HeaderCell) view;
                if (i == manageLinksActivity.permanentLinkHeaderRow) {
                    if (manageLinksActivity.isPublic && j == manageLinksActivity.getAccountInstance().getUserConfig().clientUserId) {
                        headerCell.setText(LocaleController.getString(R.string.PublicLink));
                        return;
                    } else if (j == manageLinksActivity.getAccountInstance().getUserConfig().clientUserId) {
                        headerCell.setText(LocaleController.getString(R.string.ChannelInviteLinkTitle));
                        return;
                    } else {
                        headerCell.setText(LocaleController.getString(R.string.PermanentLinkForThisAdmin));
                        return;
                    }
                }
                if (i == manageLinksActivity.revokedHeader) {
                    headerCell.setText(LocaleController.getString(R.string.RevokedLinks));
                    return;
                } else if (i == manageLinksActivity.linksHeaderRow) {
                    headerCell.setText(LocaleController.getString(R.string.LinksCreatedByThisAdmin));
                    return;
                } else {
                    if (i == manageLinksActivity.adminsHeaderRow) {
                        headerCell.setText(LocaleController.getString(R.string.LinksCreatedByOtherAdmins));
                        return;
                    }
                    return;
                }
            }
            long j2 = manageLinksActivity.currentChatId;
            if (i3 == 2) {
                LinkActionView linkActionView = (LinkActionView) view;
                linkActionView.setCanEdit(j == manageLinksActivity.getAccountInstance().getUserConfig().clientUserId);
                if (manageLinksActivity.isPublic && j == manageLinksActivity.getAccountInstance().getUserConfig().clientUserId) {
                    if (manageLinksActivity.info != null) {
                        linkActionView.setLink("https://t.me/" + ChatObject.getPublicUsername(manageLinksActivity.currentChat));
                        linkActionView.setUsers(0, null, false);
                        linkActionView.hideRevokeOption(true);
                        return;
                    }
                    return;
                }
                linkActionView.hideRevokeOption(!manageLinksActivity.canEdit);
                TLRPC.TL_chatInviteExported tL_chatInviteExported2 = manageLinksActivity.invite;
                if (tL_chatInviteExported2 != null) {
                    linkActionView.setLink(tL_chatInviteExported2.link);
                    linkActionView.loadUsers(tL_chatInviteExported2, j2);
                    return;
                } else {
                    linkActionView.setLink(null);
                    linkActionView.setUsers(0, null, false);
                    return;
                }
            }
            ArrayList arrayList = manageLinksActivity.invites;
            if (i3 == 3) {
                CreationTextCell creationTextCell = (CreationTextCell) view;
                Context context = this.mContext;
                Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
                Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
                int color = Theme.getColor(null, Theme.key_switchTrackChecked, false);
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                drawable.setColorFilter(new PorterDuffColorFilter(color, mode));
                drawable2.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_checkboxCheck, false), mode));
                CombinedDrawable combinedDrawable = new CombinedDrawable(drawable, drawable2);
                String string = LocaleController.getString(R.string.CreateNewLink);
                boolean z2 = !arrayList.isEmpty();
                creationTextCell.textView.setText(string, false);
                creationTextCell.imageView.setImageDrawable(combinedDrawable);
                creationTextCell.divider = z2;
                return;
            }
            if (i3 == 5) {
                int i4 = manageLinksActivity.linksStartRow;
                if (i < i4 || i >= manageLinksActivity.linksEndRow) {
                    tL_chatInviteExported = (TLRPC.TL_chatInviteExported) manageLinksActivity.revokedInvites.get(i - manageLinksActivity.revokedLinksStartRow);
                    if (i == manageLinksActivity.revokedLinksEndRow - 1) {
                        z = false;
                    }
                } else {
                    tL_chatInviteExported = (TLRPC.TL_chatInviteExported) arrayList.get(i - i4);
                    if (i == manageLinksActivity.linksEndRow - 1) {
                        z = false;
                    }
                }
                LinkCell linkCell = (LinkCell) view;
                linkCell.setLink(tL_chatInviteExported, i - manageLinksActivity.linksStartRow);
                linkCell.drawDivider = z;
                return;
            }
            switch (i3) {
                case 9:
                    TextInfoPrivacyCell textInfoPrivacyCell = (TextInfoPrivacyCell) view;
                    TLRPC.ChatFull chatFull = manageLinksActivity.getMessagesController().getChatFull(j2);
                    TLRPC.Chat chat = manageLinksActivity.getMessagesController().getChat(Long.valueOf(j2));
                    if (chatFull != null && chatFull.paid_media_allowed && ChatObject.isChannelAndNotMegaGroup(chat)) {
                        textInfoPrivacyCell.setText(LocaleController.getString(R.string.ChannelLinksInfoPaid));
                    } else {
                        textInfoPrivacyCell.setText(LocaleController.getString(R.string.ChannelLinksInfo));
                    }
                    break;
                case 10:
                    ManageChatUserCell manageChatUserCell = (ManageChatUserCell) view;
                    if (i != manageLinksActivity.creatorRow) {
                        TLRPC.TL_chatAdminWithInvites tL_chatAdminWithInvites = (TLRPC.TL_chatAdminWithInvites) manageLinksActivity.admins.get(i - manageLinksActivity.adminsStartRow);
                        TLRPC.User user2 = (TLRPC.User) manageLinksActivity.users.get(Long.valueOf(tL_chatAdminWithInvites.admin_id));
                        i2 = tL_chatAdminWithInvites.invites_count;
                        if (i == manageLinksActivity.adminsEndRow - 1) {
                            user = user2;
                        } else {
                            user = user2;
                        }
                        if (user != null) {
                            manageChatUserCell.setData(user, ContactsController.formatName(user.first_name, user.last_name), LocaleController.formatPluralString("InviteLinkCount", i2, new Object[0]), z);
                        }
                    } else {
                        user = manageLinksActivity.getMessagesController().getUser(Long.valueOf(j));
                        i2 = manageLinksActivity.invitesCount;
                    }
                    z = false;
                    if (user != null) {
                        manageChatUserCell.setData(user, ContactsController.formatName(user.first_name, user.last_name), LocaleController.formatPluralString("InviteLinkCount", i2, new Object[0]), z);
                    }
                    break;
                case 11:
                    TextInfoPrivacyCell textInfoPrivacyCell2 = (TextInfoPrivacyCell) view;
                    if (i == manageLinksActivity.linksInfoRow) {
                        TLRPC.ChatFull chatFull2 = manageLinksActivity.getMessagesController().getChatFull(j2);
                        TLRPC.Chat chat2 = manageLinksActivity.getMessagesController().getChat(Long.valueOf(j2));
                        if (chatFull2 != null && chatFull2.paid_media_allowed && ChatObject.isChannelAndNotMegaGroup(chat2)) {
                            textInfoPrivacyCell2.setText(LocaleController.getString(R.string.ChannelLinksInfoPaid));
                        } else {
                            textInfoPrivacyCell2.setText(LocaleController.getString(R.string.ChannelLinksInfo));
                        }
                    }
                    break;
            }
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View manageChatUserCell;
            View textInfoPrivacyCell;
            ManageLinksActivity manageLinksActivity = ManageLinksActivity.this;
            Context context = this.mContext;
            switch (i) {
                case 1:
                    manageChatUserCell = new HeaderCell(context, 23);
                    break;
                case 2:
                    final LinkActionView linkActionView = new LinkActionView(this.mContext, manageLinksActivity, null, true, manageLinksActivity.isChannel);
                    linkActionView.setPermanent(true);
                    linkActionView.setDelegate(new LinkActionView.Delegate() {
                        @Override
                        public final void editLink() {
                        }

                        @Override
                        public final void removeLink() {
                        }

                        @Override
                        public final void revokeLink() {
                            ManageLinksActivity.this.revokePermanent();
                        }

                        @Override
                        public final void showUsersForPermanentLink() {
                            ListAdapter listAdapter = ListAdapter.this;
                            ManageLinksActivity manageLinksActivity2 = ManageLinksActivity.this;
                            Context context2 = linkActionView.getContext();
                            ManageLinksActivity manageLinksActivity3 = ManageLinksActivity.this;
                            manageLinksActivity2.inviteLinkBottomSheet = new InviteLinkBottomSheet(context2, manageLinksActivity3.invite, manageLinksActivity3.info, manageLinksActivity3.users, manageLinksActivity3, manageLinksActivity3.currentChatId, true, manageLinksActivity3.isChannel);
                            ManageLinksActivity.this.inviteLinkBottomSheet.show();
                        }
                    });
                    textInfoPrivacyCell = linkActionView;
                    manageChatUserCell = textInfoPrivacyCell;
                    break;
                case 3:
                    manageChatUserCell = new CreationTextCell(context, 64, ((BaseFragment) manageLinksActivity).resourceProvider);
                    break;
                case 4:
                    manageChatUserCell = new ShadowSectionCell(context, (Object) null);
                    break;
                case 5:
                    manageChatUserCell = manageLinksActivity.new LinkCell(context);
                    break;
                case 6:
                    FlickerLoadingView flickerLoadingView = new FlickerLoadingView(context, null);
                    flickerLoadingView.setIsSingleCell(true);
                    flickerLoadingView.setViewType(9);
                    flickerLoadingView.showDate = false;
                    manageChatUserCell = flickerLoadingView;
                    break;
                case 7:
                    manageChatUserCell = new ShadowSectionCell(context, (Object) null);
                    break;
                case 8:
                    TextSettingsCell textSettingsCell = new TextSettingsCell(context, 0, null);
                    textSettingsCell.setText(LocaleController.getString(R.string.DeleteAllRevokedLinks), false);
                    textSettingsCell.setTextColor(Theme.getColor(null, Theme.key_text_RedRegular, false));
                    manageChatUserCell = textSettingsCell;
                    break;
                case 9:
                    textInfoPrivacyCell = new TextInfoPrivacyCell(context, 24, null);
                    manageChatUserCell = textInfoPrivacyCell;
                    break;
                case 10:
                    manageChatUserCell = new ManageChatUserCell(this.mContext, 8, 6, false, null);
                    break;
                case 11:
                    textInfoPrivacyCell = new TextInfoPrivacyCell(context, 24, ((BaseFragment) manageLinksActivity).resourceProvider);
                    manageChatUserCell = textInfoPrivacyCell;
                    break;
                default:
                    HintInnerCell hintInnerCell = new HintInnerCell(context);
                    hintInnerCell.addView(new EmptyView(context), LayoutHelper.createFrame(-2, -2.0f, 49, 0.0f, 10.0f, 0.0f, 0.0f));
                    TextView textView = new TextView(context);
                    textView.setTextColor(Theme.getColor(null, Theme.key_chats_message, false));
                    textView.setTextSize(1, 14.0f);
                    textView.setGravity(17);
                    textView.setText(LocaleController.getString(manageLinksActivity.isChannel ? R.string.PrimaryLinkHelpChannel : R.string.PrimaryLinkHelp));
                    hintInnerCell.addView(textView, LayoutHelper.createFrame(-1, -2.0f, 51, 52.0f, 143.0f, 52.0f, 18.0f));
                    hintInnerCell.setTag(-33024);
                    manageChatUserCell = hintInnerCell;
                    break;
            }
            return zzkl.m(manageChatUserCell, manageChatUserCell);
        }

        @Override
        public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
            View view = viewHolder.itemView;
            if (view instanceof ManageChatUserCell) {
                ((ManageChatUserCell) view).avatarImageView.getImageReceiver().cancelLoadImage();
            }
        }
    }

    public ManageLinksActivity(long j, long j2, int i) {
        super(null);
        this.invites = new ArrayList();
        this.revokedInvites = new ArrayList();
        this.users = new HashMap();
        this.admins = new ArrayList();
        this.updateTimerRunnable = new Runnable() {
            @Override
            public final void run() {
                ManageLinksActivity manageLinksActivity = ManageLinksActivity.this;
                if (manageLinksActivity.listView == null) {
                    return;
                }
                for (int i2 = 0; i2 < manageLinksActivity.listView.getChildCount(); i2++) {
                    View childAt = manageLinksActivity.listView.getChildAt(i2);
                    if (childAt instanceof LinkCell) {
                        LinkCell linkCell = (LinkCell) childAt;
                        if (linkCell.timerRunning) {
                            linkCell.setLink(linkCell.invite, linkCell.position);
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(this, 500L);
            }
        };
        boolean z = false;
        this.loadRevoked = false;
        this.linkEditActivityCallback = new AnonymousClass6();
        this.notificationsLocker = new AnimationNotificationsLocker();
        this.currentChatId = j;
        this.invitesCount = i;
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j));
        this.currentChat = chat;
        this.isChannel = ChatObject.isChannel(chat) && !this.currentChat.megagroup;
        if (j2 == 0) {
            this.adminId = getAccountInstance().getUserConfig().clientUserId;
        } else {
            this.adminId = j2;
        }
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.adminId));
        if (this.adminId == getAccountInstance().getUserConfig().clientUserId || (user != null && !user.bot)) {
            z = true;
        }
        this.canEdit = z;
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.InviteLinks));
        this.actionBar.setActionBarMenuOnItemClick(new LogoutActivity.AnonymousClass1(this, 1));
        LoginActivity.AnonymousClass4 anonymousClass4 = new LoginActivity.AnonymousClass4(this, context, 11);
        this.fragmentView = anonymousClass4;
        int i = Theme.key_windowBackgroundGray;
        anonymousClass4.setBackgroundColor(Theme.getColor(null, i, false));
        this.fragmentView.setTag(Integer.valueOf(i));
        FrameLayout frameLayout = (FrameLayout) this.fragmentView;
        RecyclerListView recyclerListView = new RecyclerListView(context, null);
        this.listView = recyclerListView;
        recyclerListView.setSections();
        this.actionBar.setAdaptiveBackground(this.listView);
        PhotoViewer.AnonymousClass36 anonymousClass36 = new PhotoViewer.AnonymousClass36(1, 12, false);
        this.listView.setLayoutManager(anonymousClass36);
        RecyclerListView recyclerListView2 = this.listView;
        ListAdapter listAdapter = new ListAdapter(context);
        this.listViewAdapter = listAdapter;
        recyclerListView2.setAdapter(listAdapter);
        this.listView.setOnScrollListener(new ChatActivity.AnonymousClass35(7, this, anonymousClass36));
        this.recyclerItemsEnterAnimator = new RecyclerItemsEnterAnimator(this.listView, false);
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.setDurations(420L);
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        defaultItemAnimator.mAddInterpolator = cubicBezierInterpolator;
        defaultItemAnimator.mMoveInterpolator = cubicBezierInterpolator;
        defaultItemAnimator.mRemoveInterpolator = cubicBezierInterpolator;
        defaultItemAnimator.mChangeInterpolator = cubicBezierInterpolator;
        defaultItemAnimator.delayAnimations = false;
        defaultItemAnimator.mSupportsChangeAnimations = false;
        this.listView.setItemAnimator(defaultItemAnimator);
        this.listView.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        frameLayout.addView(this.listView, LayoutHelper.createFrame(-1.0f, -1));
        this.listView.setOnItemClickListener(new BoostsActivity$$ExternalSyntheticLambda0(18, this, context));
        this.listView.setOnItemLongClickListener(new ManageLinksActivity$$ExternalSyntheticLambda4(this));
        this.linkIcon = context.getDrawable(R.drawable.msg_link_1);
        this.linkIconRevoked = context.getDrawable(R.drawable.msg_link_2);
        this.linkIconRevenue = context.getDrawable(R.drawable.large_income);
        this.linkIcon.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        updateRows$5(true);
        this.timeDif = ((long) getConnectionsManager().getCurrentTime()) - (System.currentTimeMillis() / 1000);
        return this.fragmentView;
    }

    public final void deleteLink(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        TLRPC.TL_messages_deleteExportedChatInvite tL_messages_deleteExportedChatInvite = new TLRPC.TL_messages_deleteExportedChatInvite();
        tL_messages_deleteExportedChatInvite.link = tL_chatInviteExported.link;
        tL_messages_deleteExportedChatInvite.peer = getMessagesController().getInputPeer(-this.currentChatId);
        getConnectionsManager().sendRequest(tL_messages_deleteExportedChatInvite, new ManageLinksActivity$$ExternalSyntheticLambda11(this, tL_chatInviteExported, 1));
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.dialogDeleted && ((Long) objArr[0]).longValue() == (-this.currentChatId)) {
            INavigationLayout iNavigationLayout = this.parentLayout;
            if (iNavigationLayout == null || ((ActionBarLayout) iNavigationLayout).getLastFragment() != this) {
                removeSelfFromStack();
            } else {
                finishFragment();
            }
        }
    }

    public final void fixDate(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        if (tL_chatInviteExported.expire_date > 0) {
            tL_chatInviteExported.expired = getConnectionsManager().getCurrentTime() >= tL_chatInviteExported.expire_date;
            return;
        }
        int i = tL_chatInviteExported.usage_limit;
        if (i > 0) {
            tL_chatInviteExported.expired = tL_chatInviteExported.usage >= i;
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        QrActivity$$ExternalSyntheticLambda9 qrActivity$$ExternalSyntheticLambda9 = new QrActivity$$ExternalSyntheticLambda9(7, this);
        int i = Theme.key_windowBackgroundWhite;
        arrayList.add(new ThemeDescription(this.listView, 16, new Class[]{HeaderCell.class, CreationTextCell.class, LinkActionView.class, LinkCell.class}, null, null, null, i));
        arrayList.add(new ThemeDescription(this.fragmentView, 262145, null, null, null, null, Theme.key_windowBackgroundGray));
        arrayList.add(new ThemeDescription(this.fragmentView, 262145, null, null, null, null, i));
        arrayList.add(new ThemeDescription(this.listView, 32768, null, null, null, null, Theme.key_actionBarDefault));
        arrayList.add(new ThemeDescription(this.actionBar, 64, null, null, null, null, Theme.key_actionBarDefaultIcon));
        arrayList.add(new ThemeDescription(this.actionBar, 128, null, null, null, null, Theme.key_actionBarDefaultTitle));
        arrayList.add(new ThemeDescription(this.actionBar, 256, null, null, null, null, Theme.key_actionBarDefaultSelector));
        arrayList.add(new ThemeDescription(this.listView, 4096, null, null, null, null, Theme.key_listSelector));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{View.class}, Theme.dividerPaint, null, null, Theme.key_divider));
        arrayList.add(new ThemeDescription(this.listView, 32, new Class[]{TextInfoPrivacyCell.class}, null, null, null, Theme.key_windowBackgroundGrayShadow));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteGrayText4));
        int i2 = Theme.key_windowBackgroundWhiteBlackText;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{ManageChatUserCell.class}, new String[]{"nameTextView"}, null, null, -1, null, i2));
        int i3 = Theme.key_windowBackgroundWhiteGrayText;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{ManageChatUserCell.class}, new String[]{"statusColor"}, null, null, -1, qrActivity$$ExternalSyntheticLambda9, i3));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{ManageChatUserCell.class}, new String[]{"statusOnlineColor"}, null, null, -1, qrActivity$$ExternalSyntheticLambda9, Theme.key_windowBackgroundWhiteBlueText));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{ManageChatUserCell.class}, null, Theme.avatarDrawables, null, Theme.key_avatar_text));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, qrActivity$$ExternalSyntheticLambda9, Theme.key_avatar_backgroundRed));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, qrActivity$$ExternalSyntheticLambda9, Theme.key_avatar_backgroundOrange));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, qrActivity$$ExternalSyntheticLambda9, Theme.key_avatar_backgroundViolet));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, qrActivity$$ExternalSyntheticLambda9, Theme.key_avatar_backgroundGreen));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, qrActivity$$ExternalSyntheticLambda9, Theme.key_avatar_backgroundCyan));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, qrActivity$$ExternalSyntheticLambda9, Theme.key_avatar_backgroundBlue));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, qrActivity$$ExternalSyntheticLambda9, Theme.key_avatar_backgroundPink));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{HintInnerCell.class}, new String[]{"messageTextView"}, null, null, -1, null, Theme.key_chats_message));
        arrayList.add(new ThemeDescription(this.listView, 262144, new Class[]{ManageChatTextCell.class}, new String[]{"textView"}, null, null, -1, null, i2));
        arrayList.add(new ThemeDescription(this.listView, 262144, new Class[]{ManageChatTextCell.class}, new String[]{"imageView"}, null, null, -1, null, Theme.key_chats_unreadCounterMuted));
        arrayList.add(new ThemeDescription(this.listView, 262144, new Class[]{ManageChatTextCell.class}, new String[]{"imageView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteBlueButton));
        arrayList.add(new ThemeDescription(this.listView, 262144, new Class[]{ManageChatTextCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteBlueIcon));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{CreationTextCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteBlueText2));
        arrayList.add(new ThemeDescription(this.listView, 32, new Class[]{CreationTextCell.class}, new String[]{"imageView"}, null, null, -1, null, Theme.key_switchTrackChecked));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{CreationTextCell.class}, new String[]{"imageView"}, null, null, -1, null, Theme.key_checkboxCheck));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{HeaderCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteBlueHeader));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{LinkCell.class}, new String[]{"titleView"}, null, null, -1, null, i2));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{LinkCell.class}, new String[]{"subtitleView"}, null, null, -1, null, i3));
        arrayList.add(new ThemeDescription(this.listView, 8, new Class[]{LinkCell.class}, new String[]{"optionsView"}, null, null, -1, null, Theme.key_stickers_menu));
        return arrayList;
    }

    public final void lambda$loadLinks$0(TLObject tLObject, TLRPC.TL_error tL_error) {
        RecyclerItemsEnterAnimator recyclerItemsEnterAnimator;
        this.linksLoading = false;
        ArrayList arrayList = this.admins;
        if (tL_error == null) {
            TLRPC.TL_messages_chatAdminsWithInvites tL_messages_chatAdminsWithInvites = (TLRPC.TL_messages_chatAdminsWithInvites) tLObject;
            for (int i = 0; i < tL_messages_chatAdminsWithInvites.admins.size(); i++) {
                TLRPC.TL_chatAdminWithInvites tL_chatAdminWithInvites = tL_messages_chatAdminsWithInvites.admins.get(i);
                if (tL_chatAdminWithInvites.admin_id != getAccountInstance().getUserConfig().clientUserId) {
                    arrayList.add(tL_chatAdminWithInvites);
                }
            }
            for (int i2 = 0; i2 < tL_messages_chatAdminsWithInvites.users.size(); i2++) {
                TLRPC.User user = tL_messages_chatAdminsWithInvites.users.get(i2);
                this.users.put(Long.valueOf(user.id), user);
            }
        }
        int i3 = this.rowCount;
        this.adminsLoaded = true;
        this.hasMore = false;
        if (arrayList.size() > 0 && (recyclerItemsEnterAnimator = this.recyclerItemsEnterAnimator) != null && !this.isPaused && this.isOpened) {
            recyclerItemsEnterAnimator.showItemsAnimated(i3 + 1);
        }
        if (!this.hasMore) {
            resumeDelayedFragmentAnimation();
        } else if (arrayList.size() + this.revokedInvites.size() + this.invites.size() >= 5) {
            resumeDelayedFragmentAnimation();
        }
        if (!this.hasMore && !this.loadRevoked) {
            this.hasMore = true;
            this.loadRevoked = true;
            loadLinks(false);
        }
        updateRows$5(true);
    }

    public final void lambda$loadLinks$3(TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_error tL_error, TLObject tLObject, boolean z) {
        boolean z2;
        boolean z3;
        DiffCallback diffCallbackSaveListState = saveListState();
        this.linksLoading = false;
        this.hasMore = false;
        if (tL_chatInviteExported != null) {
            this.invite = tL_chatInviteExported;
            TLRPC.ChatFull chatFull = this.info;
            if (chatFull != null) {
                chatFull.exported_invite = tL_chatInviteExported;
            }
        }
        ArrayList arrayList = this.revokedInvites;
        ArrayList arrayList2 = this.invites;
        long j = this.adminId;
        if (tL_error == null) {
            TLRPC.TL_messages_exportedChatInvites tL_messages_exportedChatInvites = (TLRPC.TL_messages_exportedChatInvites) tLObject;
            if (z) {
                for (int i = 0; i < tL_messages_exportedChatInvites.invites.size(); i++) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvites.invites.get(i);
                    fixDate(tL_chatInviteExported2);
                    arrayList.add(tL_chatInviteExported2);
                }
            } else {
                if (j != getAccountInstance().getUserConfig().clientUserId && arrayList2.size() == 0 && tL_messages_exportedChatInvites.invites.size() > 0) {
                    this.invite = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvites.invites.get(0);
                    tL_messages_exportedChatInvites.invites.remove(0);
                }
                for (int i2 = 0; i2 < tL_messages_exportedChatInvites.invites.size(); i2++) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported3 = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvites.invites.get(i2);
                    fixDate(tL_chatInviteExported3);
                    arrayList2.add(tL_chatInviteExported3);
                }
            }
            for (int i3 = 0; i3 < tL_messages_exportedChatInvites.users.size(); i3++) {
                this.users.put(Long.valueOf(tL_messages_exportedChatInvites.users.get(i3).id), tL_messages_exportedChatInvites.users.get(i3));
            }
            int i4 = this.rowCount;
            if (tL_messages_exportedChatInvites.invites.size() == 0) {
                this.hasMore = false;
            } else if (z) {
                this.hasMore = arrayList.size() + 1 < tL_messages_exportedChatInvites.count;
            } else {
                this.hasMore = arrayList2.size() + 1 < tL_messages_exportedChatInvites.count;
            }
            if (tL_messages_exportedChatInvites.invites.size() <= 0 || !this.isOpened) {
                z2 = true;
            } else {
                RecyclerItemsEnterAnimator recyclerItemsEnterAnimator = this.recyclerItemsEnterAnimator;
                if (recyclerItemsEnterAnimator != null && !this.isPaused) {
                    recyclerItemsEnterAnimator.showItemsAnimated(i4 + 1);
                }
                z2 = false;
            }
            TLRPC.ChatFull chatFull2 = this.info;
            if (chatFull2 != null && !z) {
                chatFull2.invitesCount = tL_messages_exportedChatInvites.count;
                getMessagesStorage().saveChatLinksCount(this.currentChatId, this.info.invitesCount);
            }
        } else {
            this.hasMore = false;
            z2 = false;
        }
        if (this.hasMore || this.loadRevoked || j != getAccountInstance().getUserConfig().clientUserId) {
            if (this.hasMore || this.loadRevoked) {
                z3 = false;
            } else {
                this.hasMore = true;
                this.loadRevoked = true;
            }
            if (this.hasMore) {
                resumeDelayedFragmentAnimation();
            } else if (this.admins.size() + arrayList.size() + arrayList2.size() >= 5) {
                resumeDelayedFragmentAnimation();
            }
            if (z3) {
                loadLinks(false);
            }
            if (!z2 && this.listViewAdapter != null && this.listView.getChildCount() > 0) {
                updateRecyclerViewAnimated(diffCallbackSaveListState);
                return;
            }
            updateRows$5(true);
        }
        this.hasMore = true;
        this.loadAdmins = true;
        z3 = true;
        if (this.hasMore) {
            resumeDelayedFragmentAnimation();
        } else if (this.admins.size() + arrayList.size() + arrayList2.size() >= 5) {
            resumeDelayedFragmentAnimation();
        }
        if (z3) {
            loadLinks(false);
        }
        if (!z2) {
        }
        updateRows$5(true);
    }

    public final void loadLinks(boolean z) {
        boolean z2 = this.loadAdmins;
        long j = this.currentChatId;
        if (!z2 || this.adminsLoaded) {
            TLRPC.TL_messages_getExportedChatInvites tL_messages_getExportedChatInvites = new TLRPC.TL_messages_getExportedChatInvites();
            tL_messages_getExportedChatInvites.peer = getMessagesController().getInputPeer(-j);
            long clientUserId = getUserConfig().getClientUserId();
            long j2 = this.adminId;
            if (j2 == clientUserId) {
                tL_messages_getExportedChatInvites.admin_id = getMessagesController().getInputUser(getUserConfig().getCurrentUser());
            } else {
                tL_messages_getExportedChatInvites.admin_id = getMessagesController().getInputUser(j2);
            }
            boolean z3 = this.loadRevoked;
            if (z3) {
                tL_messages_getExportedChatInvites.revoked = true;
                ArrayList arrayList = this.revokedInvites;
                if (!arrayList.isEmpty()) {
                    tL_messages_getExportedChatInvites.flags |= 4;
                    tL_messages_getExportedChatInvites.offset_link = ((TLRPC.TL_chatInviteExported) SurfaceContainer$$ExternalSyntheticOutline0.m(1, arrayList)).link;
                    tL_messages_getExportedChatInvites.offset_date = ((TLRPC.TL_chatInviteExported) SurfaceContainer$$ExternalSyntheticOutline0.m(1, arrayList)).date;
                }
            } else {
                ArrayList arrayList2 = this.invites;
                if (!arrayList2.isEmpty()) {
                    tL_messages_getExportedChatInvites.flags |= 4;
                    tL_messages_getExportedChatInvites.offset_link = ((TLRPC.TL_chatInviteExported) SurfaceContainer$$ExternalSyntheticOutline0.m(1, arrayList2)).link;
                    tL_messages_getExportedChatInvites.offset_date = ((TLRPC.TL_chatInviteExported) SurfaceContainer$$ExternalSyntheticOutline0.m(1, arrayList2)).date;
                }
            }
            this.linksLoading = true;
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getExportedChatInvites, new DialogsActivity$50$$ExternalSyntheticLambda2(this, this.isPublic ? null : this.invite, z3, 5)), getClassGuid());
        } else {
            this.linksLoading = true;
            TLRPC.TL_messages_getAdminsWithInvites tL_messages_getAdminsWithInvites = new TLRPC.TL_messages_getAdminsWithInvites();
            tL_messages_getAdminsWithInvites.peer = getMessagesController().getInputPeer(-j);
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getAdminsWithInvites, new ManageLinksActivity$$ExternalSyntheticLambda0(this, 0)), getClassGuid());
        }
        if (z) {
            updateRows$5(true);
        }
    }

    @Override
    public final boolean needDelayOpenAnimation() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.dialogDeleted);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogDeleted);
        super.onFragmentDestroy();
    }

    @Override
    public final void onResume() {
        super.onResume();
        ListAdapter listAdapter = this.listViewAdapter;
        if (listAdapter != null) {
            listAdapter.mObservable.notifyChanged();
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        InviteLinkBottomSheet inviteLinkBottomSheet;
        super.onTransitionAnimationEnd(z, z2);
        if (z) {
            this.isOpened = true;
            if (z2 && (inviteLinkBottomSheet = this.inviteLinkBottomSheet) != null && inviteLinkBottomSheet.isNeedReopen) {
                inviteLinkBottomSheet.show();
            }
        }
        this.notificationsLocker.unlock();
    }

    @Override
    public final void onTransitionAnimationStart(boolean z, boolean z2) {
        super.onTransitionAnimationStart(z, z2);
        this.notificationsLocker.lock();
    }

    public final void revokeLink(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        TLRPC.TL_messages_editExportedChatInvite tL_messages_editExportedChatInvite = new TLRPC.TL_messages_editExportedChatInvite();
        tL_messages_editExportedChatInvite.link = tL_chatInviteExported.link;
        tL_messages_editExportedChatInvite.revoked = true;
        tL_messages_editExportedChatInvite.peer = getMessagesController().getInputPeer(-this.currentChatId);
        getConnectionsManager().sendRequest(tL_messages_editExportedChatInvite, new ManageLinksActivity$$ExternalSyntheticLambda11(this, tL_chatInviteExported, 2));
    }

    public final void revokePermanent() {
        if (this.adminId != getAccountInstance().getUserConfig().clientUserId) {
            revokeLink(this.invite);
            return;
        }
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.peer = getMessagesController().getInputPeer(-this.currentChatId);
        tL_messages_exportChatInvite.legacy_revoke_permanent = true;
        TLRPC.TL_chatInviteExported tL_chatInviteExported = this.invite;
        this.invite = null;
        this.info.exported_invite = null;
        int iSendRequest = getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new ManageLinksActivity$$ExternalSyntheticLambda11(this, tL_chatInviteExported, 0));
        AndroidUtilities.updateVisibleRows(this.listView);
        getConnectionsManager().bindRequestToGuid(iSendRequest, this.classGuid);
    }

    public final DiffCallback saveListState() {
        DiffCallback diffCallback = new DiffCallback();
        diffCallback.fillPositions(diffCallback.oldPositionToItem);
        diffCallback.oldLinksStartRow = this.linksStartRow;
        diffCallback.oldLinksEndRow = this.linksEndRow;
        diffCallback.oldRevokedLinksStartRow = this.revokedLinksStartRow;
        diffCallback.oldRevokedLinksEndRow = this.revokedLinksEndRow;
        diffCallback.oldAdminsStartRow = this.adminsStartRow;
        diffCallback.oldAdminsEndRow = this.adminsEndRow;
        diffCallback.oldRowCount = this.rowCount;
        ArrayList arrayList = diffCallback.oldLinks;
        arrayList.clear();
        arrayList.addAll(this.invites);
        ArrayList arrayList2 = diffCallback.oldRevokedLinks;
        arrayList2.clear();
        arrayList2.addAll(this.revokedInvites);
        return diffCallback;
    }

    public final void updateRecyclerViewAnimated(DiffCallback diffCallback) {
        if (this.isPaused || this.listViewAdapter == null || this.listView == null) {
            updateRows$5(true);
            return;
        }
        updateRows$5(false);
        diffCallback.fillPositions(diffCallback.newPositionToItem);
        DiffUtil.calculateDiff(diffCallback, true).dispatchUpdatesTo(new GroupCallActivity.UpdateCallback(this.listViewAdapter, 1));
        AndroidUtilities.updateVisibleRows(this.listView);
    }

    public final void updateRows$5(boolean z) {
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.currentChatId));
        this.currentChat = chat;
        if (chat == null) {
            return;
        }
        this.creatorRow = -1;
        this.creatorDividerRow = -1;
        this.linksStartRow = -1;
        this.linksEndRow = -1;
        this.linksLoadingRow = -1;
        this.revokedLinksStartRow = -1;
        this.revokedLinksEndRow = -1;
        this.revokedHeader = -1;
        this.revokedDivider = -1;
        this.lastDivider = -1;
        this.revokeAllRow = -1;
        this.revokeAllDivider = -1;
        this.createLinkHelpRow = -1;
        this.helpRow = -1;
        this.createNewLinkRow = -1;
        this.adminsEndRow = -1;
        this.adminsStartRow = -1;
        this.adminsDividerRow = -1;
        this.adminsHeaderRow = -1;
        this.linksHeaderRow = -1;
        this.dividerRow = -1;
        this.linksInfoRow = -1;
        this.rowCount = 0;
        boolean z2 = this.adminId != getAccountInstance().getUserConfig().clientUserId;
        if (z2) {
            int i = this.rowCount;
            this.creatorRow = i;
            this.rowCount = i + 2;
            this.creatorDividerRow = i + 1;
        } else {
            int i2 = this.rowCount;
            this.rowCount = i2 + 1;
            this.helpRow = i2;
        }
        int i3 = this.rowCount;
        this.permanentLinkHeaderRow = i3;
        int i4 = i3 + 2;
        this.rowCount = i4;
        this.permanentLinkRow = i3 + 1;
        ArrayList arrayList = this.invites;
        if (!z2) {
            this.dividerRow = i4;
            this.rowCount = i3 + 4;
            this.createNewLinkRow = i3 + 3;
        } else if (!arrayList.isEmpty()) {
            int i5 = this.rowCount;
            this.dividerRow = i5;
            this.rowCount = i5 + 2;
            this.linksHeaderRow = i5 + 1;
        }
        if (!arrayList.isEmpty()) {
            int i6 = this.rowCount;
            this.linksStartRow = i6;
            int size = arrayList.size() + i6;
            this.rowCount = size;
            this.linksEndRow = size;
        }
        if (!z2 && arrayList.isEmpty() && this.createNewLinkRow >= 0 && (!this.linksLoading || this.loadAdmins || this.loadRevoked)) {
            int i7 = this.rowCount;
            this.rowCount = i7 + 1;
            this.createLinkHelpRow = i7;
        }
        if (!z2) {
            ArrayList arrayList2 = this.admins;
            if (arrayList2.size() > 0) {
                if ((!arrayList.isEmpty() || this.createNewLinkRow >= 0) && this.createLinkHelpRow == -1) {
                    int i8 = this.rowCount;
                    this.rowCount = i8 + 1;
                    this.adminsDividerRow = i8;
                }
                int i9 = this.rowCount;
                int i10 = i9 + 1;
                this.rowCount = i10;
                this.adminsHeaderRow = i9;
                this.adminsStartRow = i10;
                int size2 = arrayList2.size() + i10;
                this.rowCount = size2;
                this.adminsEndRow = size2;
            }
        }
        ArrayList arrayList3 = this.revokedInvites;
        if (!arrayList3.isEmpty()) {
            if (this.adminsStartRow >= 0) {
                int i11 = this.rowCount;
                this.rowCount = i11 + 1;
                this.revokedDivider = i11;
            } else if ((!arrayList.isEmpty() || this.createNewLinkRow >= 0) && this.createLinkHelpRow == -1) {
                int i12 = this.rowCount;
                this.rowCount = i12 + 1;
                this.revokedDivider = i12;
            } else if (z2 && this.linksStartRow == -1) {
                int i13 = this.rowCount;
                this.rowCount = i13 + 1;
                this.revokedDivider = i13;
            }
            int i14 = this.rowCount;
            int i15 = i14 + 1;
            this.rowCount = i15;
            this.revokedHeader = i14;
            this.revokedLinksStartRow = i15;
            int size3 = arrayList3.size() + i15;
            this.revokedLinksEndRow = size3;
            this.revokeAllDivider = size3;
            this.rowCount = size3 + 2;
            this.revokeAllRow = size3 + 1;
        }
        if (!this.loadAdmins && !this.loadRevoked && ((this.linksLoading || this.hasMore) && !z2)) {
            int i16 = this.rowCount;
            this.rowCount = i16 + 1;
            this.linksLoadingRow = i16;
        }
        if (!arrayList.isEmpty()) {
            int i17 = this.linksEndRow;
            int i18 = this.rowCount;
            if (i17 == i18) {
                this.rowCount = i18 + 1;
                this.linksInfoRow = i18;
            } else if (arrayList.isEmpty() || !arrayList3.isEmpty()) {
                int i19 = this.rowCount;
                this.rowCount = i19 + 1;
                this.lastDivider = i19;
            }
        } else if (arrayList.isEmpty()) {
            int i110 = this.rowCount;
            this.rowCount = i110 + 1;
            this.lastDivider = i110;
        } else {
            int i111 = this.rowCount;
            this.rowCount = i111 + 1;
            this.lastDivider = i111;
        }
        ListAdapter listAdapter = this.listViewAdapter;
        if (listAdapter == null || !z) {
            return;
        }
        listAdapter.mObservable.notifyChanged();
    }
}
