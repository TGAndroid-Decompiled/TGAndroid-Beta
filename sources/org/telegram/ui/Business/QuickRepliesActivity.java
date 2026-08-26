package org.telegram.ui.Business;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.util.Consumer;
import com.google.android.gms.internal.mlkit_vision_common.zzkf;
import com.google.android.gms.internal.mlkit_vision_common.zzki;
import com.google.firebase.messaging.FirebaseMessaging$AutoInit$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController$$ExternalSyntheticOutline0;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationBadge$ZukHomeBadger$$ExternalSyntheticOutline0;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.utils.WindowVisibilityManager$$ExternalSyntheticLambda0;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.AccountFrozenAlert$$ExternalSyntheticOutline0;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenu;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet$$ExternalSyntheticLambda6;
import org.telegram.ui.ActionBar.DarkAlertDialog;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.DialogCell$$ExternalSyntheticLambda6;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.AnimatedColor;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.CheckBox2;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.Components.Text;
import org.telegram.ui.Components.TypefaceSpan;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.Components.spoilers.SpoilersTextView;
import org.telegram.ui.Components.voip.VoIPEllipsizeSpan;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda23;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda58;
import org.telegram.ui.Storage.CacheModel$$ExternalSyntheticLambda0;
import org.telegram.ui.Stories.StealthModeAlert$$ExternalSyntheticLambda3;
import org.telegram.ui.Stories.recorder.PreviewView$$ExternalSyntheticLambda8;
import org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda46;
import org.telegram.ui.web.HistoryFragment$1$$ExternalSyntheticLambda0;

public final class QuickRepliesActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    public static AlertDialog currentDialog;
    public NumberTextView countText;
    public ActionBarMenuItem editItem;
    public UniversalRecyclerView listView;
    public int repliesOrderId;
    public final ArrayList selected;
    public boolean shownEditItem;

    public final class AnonymousClass1 extends ActionBar.ActionBarMenuOnItemClick {
        public AnonymousClass1() {
        }

        @Override
        public final void onItemClick(int i) {
            QuickRepliesActivity quickRepliesActivity = QuickRepliesActivity.this;
            ArrayList arrayList = quickRepliesActivity.selected;
            if (i == -1) {
                if (arrayList.isEmpty()) {
                    quickRepliesActivity.finishFragment();
                    return;
                } else {
                    quickRepliesActivity.clearSelection();
                    return;
                }
            }
            if (i != 1) {
                if (i == 2) {
                    quickRepliesActivity.showDialog(new AlertDialog.Builder(quickRepliesActivity.getContext(), 0, quickRepliesActivity.getResourceProvider()).setTitle(LocaleController.formatPluralString("BusinessRepliesDeleteTitle", arrayList.size(), new Object[0])).setMessage(LocaleController.formatPluralString("BusinessRepliesDeleteMessage", arrayList.size(), new Object[0])).setPositiveButton(LocaleController.getString(R.string.Remove), new WindowVisibilityManager$$ExternalSyntheticLambda0(this, 14)).setNegativeButton(LocaleController.getString(R.string.Cancel), null).create());
                }
            } else {
                if (arrayList.size() != 1) {
                    return;
                }
                int iIntValue = ((Integer) arrayList.get(0)).intValue();
                QuickRepliesController.QuickReply quickReplyFindReply = QuickRepliesController.getInstance(((BaseFragment) quickRepliesActivity).currentAccount).findReply(iIntValue);
                if (quickReplyFindReply == null) {
                    return;
                }
                QuickRepliesActivity.openRenameReplyAlert(quickRepliesActivity.getContext(), ((BaseFragment) quickRepliesActivity).currentAccount, null, quickReplyFindReply, ((BaseFragment) quickRepliesActivity).resourceProvider, new PreviewView$$ExternalSyntheticLambda8(this, iIntValue, 1));
            }
        }
    }

    public final class AnonymousClass2 extends SizeNotifierFrameLayout {
        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824));
        }
    }

    public final class AnonymousClass4 implements InputFilter {
        @Override
        public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
            return String.valueOf(charSequence).replaceAll("[^\\d_\\p{L}\\x{200c}\\x{00b7}\\x{0d80}-\\x{0dff}]", "");
        }
    }

    public final class LargeQuickReplyView extends FrameLayout {
        public final Paint arrowPaint;
        public final Path arrowPath;
        public final AvatarDrawable avatarDrawable;
        public final CheckBox2 checkBox;
        public final ImageReceiver imageReceiver;
        public boolean needDivider;
        public final Theme.ResourcesProvider resourcesProvider;
        public final int[] spanWidth;
        public final TextView textView;
        public final TextView titleView;

        public LargeQuickReplyView(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.avatarDrawable = new AvatarDrawable();
            this.imageReceiver = new ImageReceiver(this);
            this.arrowPath = new Path();
            this.arrowPaint = new Paint(1);
            this.spanWidth = new int[1];
            this.resourcesProvider = resourcesProvider;
            setWillNotDraw(false);
            TextView textView = new TextView(context);
            this.titleView = textView;
            textView.setSingleLine();
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            textView.setEllipsize(truncateAt);
            textView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
            textView.setTypeface(AndroidUtilities.bold());
            textView.setTextSize(1, 16.0f);
            boolean z = LocaleController.isRTL;
            addView(textView, LayoutHelper.createFrame(-1, -2.0f, 7, z ? 40.0f : 78.0f, 10.33f, z ? 78.0f : 40.0f, 0.0f));
            TextView textView2 = new TextView(context);
            this.textView = textView2;
            textView2.setLines(2);
            textView2.setEllipsize(truncateAt);
            OKLCH.m(Theme.key_windowBackgroundWhiteGrayText2, resourcesProvider, textView2, 15.0f);
            boolean z2 = LocaleController.isRTL;
            addView(textView2, LayoutHelper.createFrame(-1, -2.0f, 7, z2 ? 40.0f : 78.0f, 32.0f, z2 ? 78.0f : 40.0f, 0.0f));
            CheckBox2 checkBox2 = new CheckBox2(getContext(), 21, resourcesProvider);
            this.checkBox = checkBox2;
            checkBox2.setColor(-1, Theme.key_windowBackgroundWhite, Theme.key_checkboxCheck);
            checkBox2.setDrawUnchecked(false);
            checkBox2.setDrawBackgroundAsArc(3);
            addView(checkBox2, LayoutHelper.createFrameRelatively(24.0f, 24.0f, 8388659, 33.0f, 25.0f, 0.0f, 0.0f));
        }

        @Override
        public final void onDraw(Canvas canvas) {
            ImageReceiver imageReceiver = this.imageReceiver;
            imageReceiver.setImageCoords(LocaleController.isRTL ? getMeasuredWidth() - AndroidUtilities.dp(65.0f) : AndroidUtilities.dp(9.0f), AndroidUtilities.dp(11.33f), AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f));
            imageReceiver.draw(canvas);
            super.onDraw(canvas);
            canvas.drawPath(this.arrowPath, this.arrowPaint);
            if (this.needDivider) {
                Paint themePaint = Theme.getThemePaint("paintDivider", this.resourcesProvider);
                if (themePaint == null) {
                    themePaint = Theme.dividerPaint;
                }
                canvas.drawRect(AndroidUtilities.dp(LocaleController.isRTL ? 0.0f : 78.0f), getMeasuredHeight() - 1, getWidth() - AndroidUtilities.dp(LocaleController.isRTL ? 78.0f : 0.0f), getMeasuredHeight(), themePaint);
            }
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(78.0f) + (this.needDivider ? 1 : 0), 1073741824));
            Paint paint = this.arrowPaint;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeJoin(Paint.Join.ROUND);
            paint.setStrokeWidth(AndroidUtilities.dpf2(1.66f));
            paint.setColor(Theme.multAlpha(0.85f, Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, this.resourcesProvider)));
            Path path = this.arrowPath;
            path.rewind();
            float measuredHeight = getMeasuredHeight() / 2.0f;
            float fDpf2 = LocaleController.isRTL ? AndroidUtilities.dpf2(29.66f) : getMeasuredWidth() - AndroidUtilities.dpf2(24.33f);
            path.moveTo(fDpf2, measuredHeight - AndroidUtilities.dpf2(5.66f));
            path.lineTo((AndroidUtilities.dpf2(5.33f) * (LocaleController.isRTL ? -1 : 1)) + fDpf2, measuredHeight);
            path.lineTo(fDpf2, AndroidUtilities.dpf2(5.66f) + measuredHeight);
        }
    }

    public final class QuickReplyView extends FrameLayout {
        public final AvatarDrawable avatarDrawable;
        public final CheckBox2 checkBox;
        public final ImageReceiver imageReceiver;
        public boolean local;
        public boolean needDivider;
        public final ImageView orderView;
        public final Theme.ResourcesProvider resourcesProvider;
        public final int[] spanWidth;
        public final SpoilersTextView textView;

        public QuickReplyView(Context context, boolean z, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.avatarDrawable = new AvatarDrawable();
            this.imageReceiver = new ImageReceiver(this);
            this.spanWidth = new int[1];
            this.resourcesProvider = resourcesProvider;
            setWillNotDraw(false);
            int i = z ? 42 : 16;
            SpoilersTextView spoilersTextView = new SpoilersTextView(context, true, null);
            this.textView = spoilersTextView;
            spoilersTextView.setLines(2);
            spoilersTextView.setEllipsize(TextUtils.TruncateAt.END);
            spoilersTextView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, resourcesProvider));
            spoilersTextView.setTextSize(1, 14.0f);
            boolean z2 = LocaleController.isRTL;
            addView(spoilersTextView, LayoutHelper.createFrame(-1, -2.0f, 7, z2 ? i : 64.0f, 7.0f, z2 ? 64.0f : i, 0.0f));
            if (z) {
                ImageView imageView = new ImageView(context);
                this.orderView = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setImageResource(R.drawable.list_reorder);
                imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_stickers_menu, false), PorterDuff.Mode.MULTIPLY));
                imageView.setAlpha(0.0f);
                addView(imageView, LayoutHelper.createFrame(50, 50, (LocaleController.isRTL ? 3 : 5) | 112));
            } else {
                this.orderView = null;
            }
            CheckBox2 checkBox2 = new CheckBox2(getContext(), 21, resourcesProvider);
            this.checkBox = checkBox2;
            checkBox2.setColor(-1, Theme.key_windowBackgroundWhite, Theme.key_checkboxCheck);
            checkBox2.setDrawUnchecked(false);
            checkBox2.setDrawBackgroundAsArc(3);
            addView(checkBox2, LayoutHelper.createFrameRelatively(24.0f, 24.0f, 8388659, 33.0f, 25.0f, 0.0f, 0.0f));
        }

        @Override
        public final void onDraw(Canvas canvas) {
            ImageReceiver imageReceiver = this.imageReceiver;
            imageReceiver.setImageCoords(LocaleController.isRTL ? getMeasuredWidth() - AndroidUtilities.dp(51.0f) : AndroidUtilities.dp(15.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f));
            imageReceiver.draw(canvas);
            super.onDraw(canvas);
            if (this.needDivider) {
                Paint themePaint = Theme.getThemePaint("paintDivider", this.resourcesProvider);
                if (themePaint == null) {
                    themePaint = Theme.dividerPaint;
                }
                canvas.drawRect(AndroidUtilities.dp(LocaleController.isRTL ? 0.0f : 64.0f), getMeasuredHeight() - 1, getWidth() - AndroidUtilities.dp(LocaleController.isRTL ? 64.0f : 0.0f), getMeasuredHeight(), themePaint);
            }
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f) + (this.needDivider ? 1 : 0), 1073741824));
        }

        public final void set(QuickRepliesController.QuickReply quickReply, String str, boolean z) {
            TLRPC.WebPage webPage;
            TLRPC.Photo photo;
            long j;
            String str2;
            ImageLocation imageLocation;
            TLRPC.Photo photo2;
            this.local = quickReply != null ? quickReply.local : false;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (str != null && str.length() > 0 && !str.startsWith("/")) {
                str = "/".concat(str);
            }
            spannableStringBuilder.append((CharSequence) "/").append((CharSequence) quickReply.name);
            spannableStringBuilder.setSpan(new TypefaceSpan(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
            int i = Theme.key_windowBackgroundWhiteBlackText;
            Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
            spannableStringBuilder.setSpan(new ForegroundColorSpan(Theme.getColor(i, resourcesProvider)), 0, spannableStringBuilder.length(), 33);
            if (str != null) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(Theme.getColor(Theme.key_windowBackgroundWhiteBlueText2, resourcesProvider)), 0, Math.min(str.length() <= 0 ? 1 : str.length(), spannableStringBuilder.length()), 33);
            }
            MessageObject messageObject = quickReply.topMessage;
            SpoilersTextView spoilersTextView = this.textView;
            if (messageObject != null) {
                spannableStringBuilder.append((CharSequence) " ");
                CharSequence charSequence = quickReply.topMessage.caption;
                if (TextUtils.isEmpty(charSequence)) {
                    charSequence = quickReply.topMessage.messageText;
                }
                CharSequence charSequenceReplaceEmoji = Emoji.replaceEmoji(new SpannableStringBuilder(charSequence), spoilersTextView.getPaint().getFontMetricsInt(), false);
                TLRPC.Message message = quickReply.topMessage.messageOwner;
                if (message != null) {
                    MessageObject.replaceAnimatedEmoji(charSequenceReplaceEmoji, message.entities, spoilersTextView.getPaint().getFontMetricsInt());
                }
                spannableStringBuilder.append(charSequenceReplaceEmoji);
            }
            if (quickReply.getMessagesCount() > 1) {
                spannableStringBuilder.append((CharSequence) "  ");
                int iDp = AndroidUtilities.displaySize.x - AndroidUtilities.dp(80.0f);
                int messagesCount = quickReply.getMessagesCount() - 1;
                int i2 = VoIPEllipsizeSpan.$r8$clinit;
                SpannableString spannableString = new SpannableString("+");
                VoIPEllipsizeSpan voIPEllipsizeSpan = new VoIPEllipsizeSpan(messagesCount);
                int currentWidth = (int) (((Text) voIPEllipsizeSpan.parents).getCurrentWidth() + AndroidUtilities.dp(10.0f));
                int[] iArr = this.spanWidth;
                iArr[0] = currentWidth;
                spannableString.setSpan(voIPEllipsizeSpan, 0, spannableString.length(), 33);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(TextUtils.ellipsize(spannableStringBuilder, spoilersTextView.getPaint(), (iDp * 1.5f) - iArr[0], TextUtils.TruncateAt.END));
                if (spannableStringBuilder2.length() > 0 && spannableStringBuilder2.charAt(spannableStringBuilder2.length() - 1) == 8230) {
                    spannableStringBuilder2.append((CharSequence) "  ");
                }
                spannableStringBuilder2.append((CharSequence) spannableString);
                spannableStringBuilder = spannableStringBuilder2;
            }
            spoilersTextView.setText(spannableStringBuilder);
            int i3 = UserConfig.selectedAccount;
            TLRPC.MessageMedia media = MessageObject.getMedia(quickReply.topMessage);
            ImageReceiver imageReceiver = this.imageReceiver;
            if (media != null && (photo2 = media.photo) != null) {
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo2.sizes, AndroidUtilities.dp(36.0f), true, null, true);
                ImageLocation forObject = ImageLocation.getForObject(closestPhotoSizeWithSize, media.photo);
                MessageObject messageObject2 = quickReply.topMessage;
                imageReceiver.setImage(forObject, "36_36", messageObject2.strippedThumb, closestPhotoSizeWithSize != null ? closestPhotoSizeWithSize.size : 0L, (String) null, messageObject2, 0);
                imageReceiver.setRoundRadius(AndroidUtilities.dp(4.0f));
            } else if (media != null && media.document != null && (quickReply.topMessage.isVideo() || quickReply.topMessage.isSticker())) {
                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(media.document.thumbs, AndroidUtilities.dp(36.0f), true, null, true);
                if (closestPhotoSizeWithSize2 == null) {
                    ImageLocation forDocument = ImageLocation.getForDocument(media.document);
                    j = media.document.size;
                    imageLocation = forDocument;
                    str2 = "g";
                } else {
                    ImageLocation forObject2 = ImageLocation.getForObject(closestPhotoSizeWithSize2, media.document);
                    j = closestPhotoSizeWithSize2.size;
                    str2 = "36_36";
                    imageLocation = forObject2;
                }
                MessageObject messageObject3 = quickReply.topMessage;
                imageReceiver.setImage(imageLocation, str2, messageObject3.strippedThumb, j, (String) null, messageObject3, 0);
                imageReceiver.setRoundRadius(AndroidUtilities.dp(4.0f));
            } else if (media == null || (webPage = media.webpage) == null || (photo = webPage.photo) == null) {
                AvatarDrawable avatarDrawable = this.avatarDrawable;
                avatarDrawable.setInfo(UserConfig.getInstance(i3).getCurrentUser());
                imageReceiver.setForUserOrChat(UserConfig.getInstance(i3).getCurrentUser(), avatarDrawable);
                imageReceiver.setRoundRadius(AndroidUtilities.dp(36.0f));
            } else {
                TLRPC.PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.dp(36.0f), true, null, true);
                imageReceiver.setImage(ImageLocation.getForObject(closestPhotoSizeWithSize3, media.webpage.photo), "36_36", quickReply.topMessage.strippedThumb, closestPhotoSizeWithSize3 != null ? closestPhotoSizeWithSize3.size : 0L, (String) null, media.webpage, 0);
                imageReceiver.setRoundRadius(AndroidUtilities.dp(4.0f));
            }
            this.needDivider = z;
            invalidate();
        }

        public void setReorder(boolean z) {
            this.orderView.animate().alpha((!z || this.local) ? 0.0f : 1.0f).start();
        }
    }

    public QuickRepliesActivity() {
        super(null);
        this.selected = new ArrayList();
        this.shownEditItem = true;
    }

    public static void openRenameReplyAlert(Context context, final int i, String str, final QuickRepliesController.QuickReply quickReply, final Theme.ResourcesProvider resourcesProvider, final Utilities.Callback callback) {
        String str2;
        ?? r3;
        int i2 = 0;
        BaseFragment lastFragment = LaunchActivity.getLastFragment();
        Activity activityFindActivity = AndroidUtilities.findActivity(context);
        final View currentFocus = activityFindActivity != null ? activityFindActivity.getCurrentFocus() : null;
        boolean z = lastFragment != null && (lastFragment.getFragmentView() instanceof SizeNotifierFrameLayout) && ((SizeNotifierFrameLayout) lastFragment.getFragmentView()).measureKeyboardHeight() > AndroidUtilities.dp(20.0f);
        final AlertDialog[] alertDialogArr = new AlertDialog[1];
        AlertDialog.Builder builder = z ? new DarkAlertDialog.Builder(context, i2, resourcesProvider) : new AlertDialog.Builder(context, 0, resourcesProvider);
        builder.setTitle(LocaleController.getString((quickReply == null && str == null) ? R.string.BusinessRepliesNewTitle : R.string.BusinessRepliesEditTitle));
        final ?? r2 = new EditTextBoldCursor(context) {
            public final AnimatedTextView.AnimatedTextDrawable limit;
            public final AnimatedColor limitColor = new AnimatedColor(this);
            public int limitCount;

            {
                AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = new AnimatedTextView.AnimatedTextDrawable(false, true, true);
                this.limit = animatedTextDrawable;
                animatedTextDrawable.setAnimationProperties(0.2f, 0L, 160L, CubicBezierInterpolator.EASE_OUT_QUINT);
                animatedTextDrawable.setTextSize(AndroidUtilities.dp(15.33f));
                animatedTextDrawable.setCallback(this);
                animatedTextDrawable.setGravity(5);
            }

            @Override
            public final void dispatchDraw(Canvas canvas) {
                super.dispatchDraw(canvas);
                AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.limit;
                animatedTextDrawable.setTextColor(this.limitColor.set(Theme.getColor(this.limitCount < 0 ? Theme.key_text_RedRegular : Theme.key_dialogSearchHint, resourcesProvider)));
                animatedTextDrawable.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
                animatedTextDrawable.draw(canvas);
            }

            @Override
            public final void onMeasure(int i3, int i4) {
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(36.0f), 1073741824));
            }

            @Override
            public final void onTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
                super.onTextChanged(charSequence, i3, i4, i5);
                AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.limit;
                if (animatedTextDrawable != null) {
                    this.limitCount = 32 - charSequence.length();
                    animatedTextDrawable.cancelAnimation();
                    String str3 = "";
                    if (this.limitCount <= 4) {
                        str3 = "" + this.limitCount;
                    }
                    animatedTextDrawable.setText(str3);
                }
            }

            @Override
            public final boolean verifyDrawable(Drawable drawable) {
                return drawable == this.limit || super.verifyDrawable(drawable);
            }
        };
        MediaDataController.getInstance(i).fetchNewEmojiKeywords(AndroidUtilities.getCurrentKeyboardLanguage(), true);
        r2.setTextSize(1, 18.0f);
        if (quickReply == null) {
            str2 = str == null ? "" : str;
        } else {
            str2 = quickReply.name;
        }
        r2.setText(str2);
        int i3 = Theme.key_dialogTextBlack;
        r2.setTextColor(Theme.getColor(i3, resourcesProvider));
        r2.setHintColor(Theme.getColor(Theme.key_groupcreate_hintText, resourcesProvider));
        r2.setHintText(LocaleController.getString(R.string.BusinessRepliesNamePlaceholder));
        r2.setSingleLine(true);
        r2.setFocusable(true);
        r2.setLineColors(Theme.getColor(Theme.key_windowBackgroundWhiteInputField, resourcesProvider), Theme.getColor(Theme.key_windowBackgroundWhiteInputFieldActivated, resourcesProvider), Theme.getColor(Theme.key_text_RedRegular, resourcesProvider));
        r2.setImeOptions(6);
        r2.setBackgroundDrawable(null);
        r2.setPadding(0, 0, AndroidUtilities.dp(42.0f), 0);
        r2.setFilters(new InputFilter[]{new AnonymousClass4()});
        LinearLayout linearLayoutM = AccountFrozenAlert$$ExternalSyntheticOutline0.m(1, context);
        FrameLayout frameLayout = new FrameLayout(context);
        TextView textView = new TextView(context);
        OKLCH.m(i3, resourcesProvider, textView, 16.0f);
        textView.setText(LocaleController.getString((quickReply == null && str == null) ? R.string.BusinessRepliesNewMessage : R.string.BusinessRepliesEditMessage));
        frameLayout.addView(textView, LayoutHelper.createFrame(-1, -2, 83));
        final TextView textView2 = new TextView(context);
        OKLCH.m(Theme.key_text_RedBold, resourcesProvider, textView2, 16.0f);
        textView2.setText(LocaleController.getString(R.string.BusinessRepliesNameBusy));
        textView2.setAlpha(0.0f);
        frameLayout.addView(textView2, LayoutHelper.createFrame(-1, -2, 83));
        final Runnable[] runnableArr = {new ChatbotSheet$$ExternalSyntheticLambda0(giftSheet$$ExternalSyntheticLambda23, 4)};
        final GiftSheet$$ExternalSyntheticLambda23 giftSheet$$ExternalSyntheticLambda23 = new GiftSheet$$ExternalSyntheticLambda23(1, runnableArr, new ValueAnimator[1], textView2, textView);
        r2.addTextChangedListener(new TextWatcher() {
            @Override
            public final void afterTextChanged(Editable editable) {
                if (textView2.getAlpha() > 0.0f) {
                    Runnable[] runnableArr2 = runnableArr;
                    AndroidUtilities.cancelRunOnUIThread(runnableArr2[0]);
                    AndroidUtilities.runOnUIThread(runnableArr2[0]);
                }
            }

            @Override
            public final void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
            }

            @Override
            public final void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
            }
        });
        linearLayoutM.addView(frameLayout, LayoutHelper.createLinear(-1, -2, 24.0f, 5.0f, 24.0f, 12.0f));
        linearLayoutM.addView((View) r2, LayoutHelper.createLinear(-1, -2, 24.0f, 0.0f, 24.0f, 10.0f));
        builder.setView(linearLayoutM);
        builder.setWidth(AndroidUtilities.dp(292.0f));
        r2.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public final boolean onEditorAction(TextView textView3, int i4, KeyEvent keyEvent) {
                if (i4 != 6) {
                    return false;
                }
                AnonymousClass3 anonymousClass3 = r2;
                String string = anonymousClass3.getText().toString();
                if (string.length() <= 0 || string.length() > 32) {
                    AndroidUtilities.shakeView(anonymousClass3);
                    return true;
                }
                QuickRepliesController quickRepliesController = QuickRepliesController.getInstance(i);
                QuickRepliesController.QuickReply quickReply2 = quickReply;
                int i5 = quickReply2 == null ? -1 : quickReply2.id;
                QuickRepliesController.QuickReply quickReplyFindReply = quickRepliesController.findReply(string);
                if (quickReplyFindReply != null && quickReplyFindReply.id != i5) {
                    AndroidUtilities.shakeView(anonymousClass3);
                    textView2.setText(LocaleController.getString(R.string.BusinessRepliesNameBusy));
                    giftSheet$$ExternalSyntheticLambda23.run(Boolean.TRUE);
                    return true;
                }
                callback.run(string);
                AlertDialog[] alertDialogArr2 = alertDialogArr;
                AlertDialog alertDialog = alertDialogArr2[0];
                if (alertDialog != null) {
                    alertDialog.dismiss();
                }
                if (alertDialogArr2[0] == QuickRepliesActivity.currentDialog) {
                    QuickRepliesActivity.currentDialog = null;
                }
                View view = currentFocus;
                if (view != null) {
                    view.requestFocus();
                }
                return true;
            }
        });
        builder.setPositiveButton(LocaleController.getString(R.string.Done), new LaunchActivity$$ExternalSyntheticLambda58((AnonymousClass3) r2, giftSheet$$ExternalSyntheticLambda23, i, quickReply, textView2, callback));
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), new FirebaseMessaging$AutoInit$$ExternalSyntheticLambda0(17));
        if (z) {
            AlertDialog alertDialogCreate = builder.create();
            currentDialog = alertDialogCreate;
            alertDialogArr[0] = alertDialogCreate;
            r3 = 0;
            alertDialogCreate.setOnDismissListener(new QuickRepliesActivity$$ExternalSyntheticLambda9(currentFocus, false ? 1 : 0));
            AlertDialog alertDialog = currentDialog;
            final boolean z2 = false ? 1 : 0;
            alertDialog.setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    switch (z2) {
                        case 0:
                            QuickRepliesActivity.AnonymousClass3 anonymousClass3 = r2;
                            anonymousClass3.requestFocus();
                            AndroidUtilities.showKeyboard(anonymousClass3);
                            break;
                        default:
                            QuickRepliesActivity.AnonymousClass3 anonymousClass4 = r2;
                            anonymousClass4.requestFocus();
                            AndroidUtilities.showKeyboard(anonymousClass4);
                            break;
                    }
                }
            });
            currentDialog.showDelayed(250L);
        } else {
            r3 = 0;
            builder.overrideDismissListener(new DialogCell$$ExternalSyntheticLambda6(r2, 7));
            AlertDialog alertDialogCreate2 = builder.create();
            alertDialogArr[0] = alertDialogCreate2;
            alertDialogCreate2.setOnDismissListener(new RichEditor$$ExternalSyntheticLambda46(r2, 2));
            final int i4 = 1;
            alertDialogArr[0].setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    switch (i4) {
                        case 0:
                            QuickRepliesActivity.AnonymousClass3 anonymousClass3 = r2;
                            anonymousClass3.requestFocus();
                            AndroidUtilities.showKeyboard(anonymousClass3);
                            break;
                        default:
                            QuickRepliesActivity.AnonymousClass3 anonymousClass4 = r2;
                            anonymousClass4.requestFocus();
                            AndroidUtilities.showKeyboard(anonymousClass4);
                            break;
                    }
                }
            });
            alertDialogArr[0].show();
        }
        alertDialogArr[r3].dismissDialogByButtons = r3;
        r2.setSelection(r2.getText().length());
    }

    public final void clearSelection() {
        this.selected.clear();
        AndroidUtilities.forEachViews((RecyclerView) this.listView, (Consumer) new HistoryFragment$1$$ExternalSyntheticLambda0(3));
        this.actionBar.hideActionMode();
        this.listView.allowReorder(false);
    }

    @Override
    public final View createView(Context context) {
        zzki.m(this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.BusinessReplies));
        this.actionBar.setActionBarMenuOnItemClick(new AnonymousClass1());
        ActionBarMenu actionBarMenuCreateActionMode = this.actionBar.createActionMode();
        NumberTextView numberTextView = new NumberTextView(getContext());
        this.countText = numberTextView;
        numberTextView.setTextSize(18);
        this.countText.setTypeface(AndroidUtilities.bold());
        this.countText.setTextColor(Theme.getColor(null, Theme.key_actionBarActionModeDefaultIcon, false));
        actionBarMenuCreateActionMode.addView(this.countText, LayoutHelper.createLinear(0, -1, 1.0f, 72, 0, 0, 0));
        this.countText.setOnTouchListener(new BottomSheet$$ExternalSyntheticLambda6(1));
        ActionBarMenuItem actionBarMenuItemAddItem = actionBarMenuCreateActionMode.addItem(1, R.drawable.msg_edit);
        this.editItem = actionBarMenuItemAddItem;
        actionBarMenuItemAddItem.setContentDescription(LocaleController.getString(R.string.Edit));
        actionBarMenuCreateActionMode.addItem(2, R.drawable.msg_delete).setContentDescription(LocaleController.getString(R.string.Delete));
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(context);
        anonymousClass2.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundGray, false));
        final int i = 0;
        UniversalRecyclerView universalRecyclerView = new UniversalRecyclerView(this, new Utilities.Callback2(this) {
            public final QuickRepliesActivity f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void run(Object obj, Object obj2) {
                switch (i) {
                    case 0:
                        this.f$0.fillItems$5((ArrayList) obj, (UniversalAdapter) obj2);
                        break;
                    default:
                        this.f$0.whenReordered(((Integer) obj).intValue(), (ArrayList) obj2);
                        break;
                }
            }
        }, new QuickRepliesActivity$$ExternalSyntheticLambda2(this), new QuickRepliesActivity$$ExternalSyntheticLambda2(this));
        this.listView = universalRecyclerView;
        universalRecyclerView.setSections();
        this.listView.adapter.setApplyBackground(false);
        final int i2 = 1;
        this.listView.listenReorder(new Utilities.Callback2(this) {
            public final QuickRepliesActivity f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void run(Object obj, Object obj2) {
                switch (i2) {
                    case 0:
                        this.f$0.fillItems$5((ArrayList) obj, (UniversalAdapter) obj2);
                        break;
                    default:
                        this.f$0.whenReordered(((Integer) obj).intValue(), (ArrayList) obj2);
                        break;
                }
            }
        });
        anonymousClass2.addView(this.listView, LayoutHelper.createFrame(-1, -1.0f));
        this.actionBar.setAdaptiveBackground(this.listView, true);
        this.fragmentView = anonymousClass2;
        return anonymousClass2;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        UniversalRecyclerView universalRecyclerView;
        UniversalAdapter universalAdapter;
        if (i != NotificationCenter.quickRepliesUpdated || (universalRecyclerView = this.listView) == null || (universalAdapter = universalRecyclerView.adapter) == null) {
            return;
        }
        universalAdapter.update(true);
    }

    public final void fillItems$5(ArrayList arrayList, UniversalAdapter universalAdapter) {
        ArrayList arrayList2;
        arrayList.add(UItem.asTopView(LocaleController.getString(R.string.BusinessReplies), LocaleController.getString(R.string.BusinessRepliesInfo), "RestrictedEmoji", "📝"));
        universalAdapter.whiteSectionStart();
        QuickRepliesController quickRepliesController = QuickRepliesController.getInstance(this.currentAccount);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            arrayList2 = quickRepliesController.replies;
            if (i2 < arrayList2.size()) {
                i3 = (i3 != 0 || "hello".equalsIgnoreCase(((QuickRepliesController.QuickReply) arrayList2.get(i2)).name)) ? 1 : 0;
                i4 = (i4 != 0 || "away".equalsIgnoreCase(((QuickRepliesController.QuickReply) arrayList2.get(i2)).name)) ? 1 : 0;
                if (i3 != 0 && i4 != 0) {
                    break;
                } else {
                    i2++;
                }
            } else {
                break;
            }
        }
        if (arrayList2.size() + (i3 ^ 1) + (i4 ^ 1) < MessagesController.getInstance(quickRepliesController.currentAccount).quickRepliesLimit) {
            arrayList.add(UItem.asButton(1, R.drawable.msg_viewintopic, LocaleController.getString(R.string.BusinessRepliesAdd)).accent());
        }
        this.repliesOrderId = universalAdapter.reorderSectionStart();
        ArrayList arrayList3 = QuickRepliesController.getInstance(this.currentAccount).replies;
        int size = arrayList3.size();
        while (i < size) {
            Object obj = arrayList3.get(i);
            i++;
            QuickRepliesController.QuickReply quickReply = (QuickRepliesController.QuickReply) obj;
            arrayList.add(UItem.asQuickReply(quickReply).setChecked(this.selected.contains(Integer.valueOf(quickReply.id))));
        }
        universalAdapter.reorderSectionEnd();
        universalAdapter.whiteSectionEnd();
        zzkf.m(R.string.BusinessRepliesAddInfo, arrayList);
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void onClick$5(UItem uItem, View view) {
        if (uItem.id == 1) {
            openRenameReplyAlert(getContext(), this.currentAccount, null, null, getResourceProvider(), new DialogCell$$ExternalSyntheticLambda6(this, 8));
            return;
        }
        if (uItem.viewType == 16 && (uItem.object instanceof QuickRepliesController.QuickReply)) {
            if (!this.selected.isEmpty()) {
                updateSelect(uItem, view);
                return;
            }
            QuickRepliesController.QuickReply quickReply = (QuickRepliesController.QuickReply) uItem.object;
            if (quickReply.local) {
                return;
            }
            Bundle bundleM = NotificationBadge$ZukHomeBadger$$ExternalSyntheticOutline0.m(5, "chatMode");
            bundleM.putLong("user_id", getUserConfig().getClientUserId());
            bundleM.putString("quick_reply", quickReply.name);
            ChatActivity chatActivity = new ChatActivity(bundleM);
            chatActivity.setQuickReplyId(quickReply.id);
            presentFragment(chatActivity);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.quickRepliesUpdated);
        QuickRepliesController.getInstance(this.currentAccount).load(true, null);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.quickRepliesUpdated);
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i, int i2, int i3, int i4) {
        this.listView.setPadding(0, 0, 0, i4);
        this.listView.setClipToPadding(false);
    }

    public final void updateSelect(UItem uItem, View view) {
        QuickRepliesController.QuickReply quickReply = (QuickRepliesController.QuickReply) uItem.object;
        QuickReplyView quickReplyView = (QuickReplyView) view;
        ArrayList arrayList = this.selected;
        if (arrayList.contains(Integer.valueOf(quickReply.id))) {
            arrayList.remove(Integer.valueOf(quickReply.id));
        } else {
            arrayList.add(Integer.valueOf(quickReply.id));
        }
        boolean z = true;
        this.listView.allowReorder(!arrayList.isEmpty());
        boolean zContains = arrayList.contains(Integer.valueOf(quickReply.id));
        uItem.checked = zContains;
        quickReplyView.checkBox.setChecked(zContains, true);
        if (this.actionBar.isActionModeShowed() == arrayList.isEmpty()) {
            if (arrayList.isEmpty()) {
                this.actionBar.hideActionMode();
            } else {
                this.actionBar.showActionMode();
            }
        }
        this.countText.setNumber(Math.max(1, arrayList.size()), true);
        boolean z2 = arrayList.size() == 1;
        if (z2) {
            QuickRepliesController.QuickReply quickReplyFindReply = QuickRepliesController.getInstance(this.currentAccount).findReply(((Integer) arrayList.get(0)).intValue());
            if (quickReplyFindReply == null || QuickRepliesController.isSpecial(quickReplyFindReply.name)) {
                z = false;
            }
        } else {
            z = z2;
        }
        if (this.shownEditItem != z) {
            this.shownEditItem = z;
            OKLCH.m(this.editItem.animate().alpha(this.shownEditItem ? 1.0f : 0.0f).scaleX(this.shownEditItem ? 1.0f : 0.7f).scaleY(this.shownEditItem ? 1.0f : 0.7f), CubicBezierInterpolator.EASE_OUT_QUINT, 340L);
        }
    }

    public final void whenReordered(int i, ArrayList arrayList) {
        ArrayList arrayList2;
        if (i == this.repliesOrderId) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                if (((UItem) arrayList.get(i2)).object instanceof QuickRepliesController.QuickReply) {
                    ((QuickRepliesController.QuickReply) ((UItem) arrayList.get(i2)).object).order = i2;
                }
            }
            QuickRepliesController quickRepliesController = QuickRepliesController.getInstance(this.currentAccount);
            ArrayList arrayList3 = new ArrayList();
            int iM = 0;
            while (true) {
                arrayList2 = quickRepliesController.replies;
                if (iM >= arrayList2.size()) {
                    break;
                } else {
                    iM = LocationController$$ExternalSyntheticOutline0.m(((QuickRepliesController.QuickReply) arrayList2.get(iM)).id, iM, 1, arrayList3);
                }
            }
            Collections.sort(arrayList2, new CacheModel$$ExternalSyntheticLambda0(1));
            for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                if (((QuickRepliesController.QuickReply) arrayList2.get(i3)).id != ((Integer) arrayList3.get(i3)).intValue()) {
                    TLRPC.TL_messages_reorderQuickReplies tL_messages_reorderQuickReplies = new TLRPC.TL_messages_reorderQuickReplies();
                    for (int iM2 = 0; iM2 < arrayList2.size(); iM2 = LocationController$$ExternalSyntheticOutline0.m(((QuickRepliesController.QuickReply) arrayList2.get(iM2)).id, iM2, 1, tL_messages_reorderQuickReplies.order)) {
                    }
                    ConnectionsManager.getInstance(quickRepliesController.currentAccount).sendRequest(tL_messages_reorderQuickReplies, new StealthModeAlert$$ExternalSyntheticLambda3(2));
                    quickRepliesController.saveToCache();
                    return;
                }
            }
        }
    }
}
