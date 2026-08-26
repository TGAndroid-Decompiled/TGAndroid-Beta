package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Region;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Build;
import android.text.Editable;
import android.text.Html;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.URLSpan;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import androidx.core.util.Consumer;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.util.Log;
import com.google.android.gms.internal.mlkit_language_id_common.zzil;
import com.google.android.gms.internal.mlkit_vision_common.zzkf;
import com.google.android.gms.internal.mlkit_vision_common.zzkg;
import com.google.android.gms.internal.mlkit_vision_common.zzko;
import com.google.android.gms.internal.mlkit_vision_common.zzlc;
import com.google.android.gms.internal.mlkit_vision_common.zzlf;
import com.google.android.gms.internal.mlkit_vision_common.zzlj;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.temporal.ChronoUnit;
import j$.util.Collection;
import j$.util.stream.Collectors;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.LongFunction;
import java.util.regex.Pattern;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AiTonesController$$ExternalSyntheticLambda0;
import org.telegram.messenger.AiTonesController$$ExternalSyntheticOutline0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AppGlobalConfig;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline0;
import org.telegram.messenger.FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline1;
import org.telegram.messenger.FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline2;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.NotificationsController$$ExternalSyntheticOutline0;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda56;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.messenger.voip.VoIPService$$ExternalSyntheticLambda80;
import org.telegram.messenger.voip.VoIPService$$ExternalSyntheticOutline0;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_ephemeral;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.AccountFrozenAlert$$ExternalSyntheticLambda3;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.AlertDialog$$ExternalSyntheticLambda1;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda23;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda74;
import org.telegram.ui.CallLogActivity$$ExternalSyntheticLambda27;
import org.telegram.ui.Cells.AccountSelectCell;
import org.telegram.ui.Cells.CheckBoxCell;
import org.telegram.ui.Cells.DialogCell$$ExternalSyntheticLambda6;
import org.telegram.ui.Cells.RadioColorCell;
import org.telegram.ui.Cells.TextColorCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda131;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda168;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda177;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda189;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda22;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda248;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda264;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda342;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda356;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda454;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda470;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda5;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda62;
import org.telegram.ui.ChatActivity$$ExternalSyntheticOutline2;
import org.telegram.ui.ChatActivity$16$$ExternalSyntheticLambda4;
import org.telegram.ui.ChatUsersActivity$$ExternalSyntheticLambda11;
import org.telegram.ui.Components.Forum.ForumUtilities;
import org.telegram.ui.Components.Premium.LimitReachedBottomSheet;
import org.telegram.ui.Components.Premium.boosts.BoostDialogs;
import org.telegram.ui.Gifts.AuctionBidSheet$$ExternalSyntheticLambda15;
import org.telegram.ui.Gifts.AuctionJoinSheet$$ExternalSyntheticLambda0;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda20;
import org.telegram.ui.GroupCallActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda121;
import org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda14;
import org.telegram.ui.LoginActivity;
import org.telegram.ui.LoginActivity$$ExternalSyntheticLambda31;
import org.telegram.ui.LogoutActivity$$ExternalSyntheticLambda1;
import org.telegram.ui.OAuthSheet$$ExternalSyntheticLambda11;
import org.telegram.ui.OAuthSheet$$ExternalSyntheticLambda6;
import org.telegram.ui.OAuthSheet$$ExternalSyntheticLambda7;
import org.telegram.ui.OAuthSheet$$ExternalSyntheticLambda9;
import org.telegram.ui.PassportActivity$$ExternalSyntheticLambda52;
import org.telegram.ui.PassportActivity$3$$ExternalSyntheticLambda3;
import org.telegram.ui.PaymentFormActivity$$ExternalSyntheticLambda11;
import org.telegram.ui.PaymentFormActivity$$ExternalSyntheticLambda45;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PhotoViewer$$ExternalSyntheticLambda161;
import org.telegram.ui.ProfileActivity$$ExternalSyntheticLambda60;
import org.telegram.ui.QrActivity$$ExternalSyntheticLambda15;
import org.telegram.ui.SettingsActivity$$ExternalSyntheticLambda21;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda81;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.StatisticActivity$$ExternalSyntheticLambda4;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.Stories.DarkThemeResourceProvider;
import org.telegram.ui.Stories.LiveCommentsView$$ExternalSyntheticLambda25;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.TooManyCommunitiesActivity;
import org.telegram.ui.VoIPFragment$$ExternalSyntheticLambda12;
import org.telegram.ui.VoIPFragment$$ExternalSyntheticLambda16;
import org.telegram.ui.WearAuthSheet$$ExternalSyntheticLambda1;
import org.telegram.ui.WearAuthSheet$$ExternalSyntheticLambda3;
import org.telegram.ui.WearAuthSheet$$ExternalSyntheticLambda6;
import org.telegram.ui.bots.BotAdView$$ExternalSyntheticLambda2;
import org.telegram.ui.bots.BotLocation$$ExternalSyntheticLambda10;
import org.telegram.ui.bots.BotLocation$$ExternalSyntheticLambda14;
import org.telegram.ui.bots.BotLocation$$ExternalSyntheticLambda7;
import org.telegram.ui.iv.RichEditor;

public abstract class AlertsCreator {
    public static final Pattern URL_PATTERN = Pattern.compile("^([a-zA-Z][a-zA-Z0-9+\\-.]*://)?([a-zA-Z0-9\\-]+\\.)+[a-zA-Z]{2,}(:\\d+)?(/[^\\s]*)?$");

    public final class AnonymousClass10 extends TextView {
        @Override
        public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
            super.setText(Emoji.replaceEmoji(charSequence, getPaint().getFontMetricsInt(), false), bufferType);
        }
    }

    public final class AnonymousClass14 extends TextView {
        @Override
        public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
            super.setText(Emoji.replaceEmoji(charSequence, getPaint().getFontMetricsInt(), false), bufferType);
        }
    }

    public final class AnonymousClass16 extends TextView {
        @Override
        public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
            super.setText(Emoji.replaceEmoji(charSequence, getPaint().getFontMetricsInt(), false), bufferType);
        }
    }

    public final class AnonymousClass21 extends NumberPicker {
        @Override
        public final CharSequence getContentDescription(int i) {
            return LocaleController.formatPluralString("Hours", i, new Object[0]);
        }
    }

    public final class AnonymousClass23 extends NumberPicker {
        @Override
        public final CharSequence getContentDescription(int i) {
            return LocaleController.formatPluralString("Minutes", i, new Object[0]);
        }
    }

    public final class AnonymousClass25 extends NumberPicker {
        @Override
        public final CharSequence getContentDescription(int i) {
            return LocaleController.formatPluralString("Hours", i, new Object[0]);
        }
    }

    public final class AnonymousClass26 extends NumberPicker {
        @Override
        public final CharSequence getContentDescription(int i) {
            return LocaleController.formatPluralString("Minutes", i, new Object[0]);
        }
    }

    public final class AnonymousClass27 extends LinearLayout {
        public final int $r8$classId;
        public boolean ignoreLayout;
        public final NumberPicker val$dayPicker;
        public final NumberPicker val$hourPicker;
        public final NumberPicker val$minutePicker;

        public AnonymousClass27(Context context, NumberPicker numberPicker, NumberPicker numberPicker2, NumberPicker numberPicker3, int i) {
            super(context);
            this.$r8$classId = i;
            this.val$dayPicker = numberPicker;
            this.val$hourPicker = numberPicker2;
            this.val$minutePicker = numberPicker3;
            this.ignoreLayout = false;
        }

        @Override
        public final void onMeasure(int i, int i2) {
            switch (this.$r8$classId) {
                case 0:
                    this.ignoreLayout = true;
                    Point point = AndroidUtilities.displaySize;
                    int i3 = point.x > point.y ? 3 : 5;
                    NumberPicker numberPicker = this.val$dayPicker;
                    numberPicker.setItemCount(i3);
                    AnonymousClass25 anonymousClass25 = (AnonymousClass25) this.val$hourPicker;
                    anonymousClass25.setItemCount(i3);
                    AnonymousClass26 anonymousClass26 = (AnonymousClass26) this.val$minutePicker;
                    anonymousClass26.setItemCount(i3);
                    numberPicker.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i3;
                    anonymousClass25.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i3;
                    anonymousClass26.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i3;
                    this.ignoreLayout = false;
                    super.onMeasure(i, i2);
                    break;
                case 1:
                    this.ignoreLayout = true;
                    Point point2 = AndroidUtilities.displaySize;
                    int i4 = point2.x > point2.y ? 3 : 5;
                    NumberPicker numberPicker2 = this.val$dayPicker;
                    numberPicker2.setItemCount(i4);
                    AnonymousClass29 anonymousClass29 = (AnonymousClass29) this.val$hourPicker;
                    anonymousClass29.setItemCount(i4);
                    AnonymousClass30 anonymousClass30 = (AnonymousClass30) this.val$minutePicker;
                    anonymousClass30.setItemCount(i4);
                    numberPicker2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i4;
                    anonymousClass29.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i4;
                    anonymousClass30.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i4;
                    this.ignoreLayout = false;
                    super.onMeasure(i, i2);
                    break;
                case 2:
                    this.ignoreLayout = true;
                    Point point3 = AndroidUtilities.displaySize;
                    int i5 = point3.x > point3.y ? 3 : 5;
                    NumberPicker numberPicker3 = this.val$dayPicker;
                    numberPicker3.setItemCount(i5);
                    AnonymousClass37 anonymousClass37 = (AnonymousClass37) this.val$hourPicker;
                    anonymousClass37.setItemCount(i5);
                    AnonymousClass38 anonymousClass38 = (AnonymousClass38) this.val$minutePicker;
                    anonymousClass38.setItemCount(i5);
                    numberPicker3.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i5;
                    anonymousClass37.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i5;
                    anonymousClass38.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i5;
                    this.ignoreLayout = false;
                    super.onMeasure(i, i2);
                    break;
                case 3:
                    this.ignoreLayout = true;
                    Point point4 = AndroidUtilities.displaySize;
                    int i6 = point4.x > point4.y ? 3 : 5;
                    NumberPicker numberPicker4 = this.val$dayPicker;
                    numberPicker4.setItemCount(i6);
                    AnonymousClass41 anonymousClass41 = (AnonymousClass41) this.val$hourPicker;
                    anonymousClass41.setItemCount(i6);
                    AnonymousClass42 anonymousClass42 = (AnonymousClass42) this.val$minutePicker;
                    anonymousClass42.setItemCount(i6);
                    numberPicker4.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i6;
                    anonymousClass41.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i6;
                    anonymousClass42.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i6;
                    this.ignoreLayout = false;
                    super.onMeasure(i, i2);
                    break;
                case 4:
                    this.ignoreLayout = true;
                    Point point5 = AndroidUtilities.displaySize;
                    int i7 = point5.x > point5.y ? 3 : 5;
                    AnonymousClass48 anonymousClass48 = (AnonymousClass48) this.val$hourPicker;
                    anonymousClass48.setItemCount(i7);
                    anonymousClass48.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i7;
                    AnonymousClass49 anonymousClass49 = (AnonymousClass49) this.val$minutePicker;
                    anonymousClass49.setItemCount(i7);
                    anonymousClass49.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i7;
                    NumberPicker numberPicker5 = this.val$dayPicker;
                    numberPicker5.setItemCount(i7);
                    numberPicker5.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i7;
                    this.ignoreLayout = false;
                    super.onMeasure(i, i2);
                    break;
                default:
                    this.ignoreLayout = true;
                    Point point6 = AndroidUtilities.displaySize;
                    int i8 = point6.x > point6.y ? 3 : 5;
                    NumberPicker numberPicker6 = this.val$dayPicker;
                    numberPicker6.setItemCount(i8);
                    AnonymousClass64 anonymousClass64 = (AnonymousClass64) this.val$hourPicker;
                    anonymousClass64.setItemCount(i8);
                    AnonymousClass65 anonymousClass65 = (AnonymousClass65) this.val$minutePicker;
                    anonymousClass65.setItemCount(i8);
                    numberPicker6.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i8;
                    anonymousClass64.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i8;
                    anonymousClass65.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i8;
                    this.ignoreLayout = false;
                    super.onMeasure(i, i2);
                    break;
            }
        }

        @Override
        public final void requestLayout() {
            switch (this.$r8$classId) {
                case 0:
                    if (!this.ignoreLayout) {
                        super.requestLayout();
                        break;
                    }
                    break;
                case 1:
                    if (!this.ignoreLayout) {
                        super.requestLayout();
                        break;
                    }
                    break;
                case 2:
                    if (!this.ignoreLayout) {
                        super.requestLayout();
                        break;
                    }
                    break;
                case 3:
                    if (!this.ignoreLayout) {
                        super.requestLayout();
                        break;
                    }
                    break;
                case 4:
                    if (!this.ignoreLayout) {
                        super.requestLayout();
                        break;
                    }
                    break;
                default:
                    if (!this.ignoreLayout) {
                        super.requestLayout();
                        break;
                    }
                    break;
            }
        }

        public AnonymousClass27(Activity activity, AnonymousClass48 anonymousClass48, AnonymousClass49 anonymousClass49, NumberPicker numberPicker) {
            super(activity);
            this.$r8$classId = 4;
            this.val$hourPicker = anonymousClass48;
            this.val$minutePicker = anonymousClass49;
            this.val$dayPicker = numberPicker;
            this.ignoreLayout = false;
        }
    }

    public final class AnonymousClass28 extends TextView {
        @Override
        public final CharSequence getAccessibilityClassName() {
            return Button.class.getName();
        }
    }

    public final class AnonymousClass29 extends NumberPicker {
        @Override
        public final CharSequence getContentDescription(int i) {
            return LocaleController.formatPluralString("Hours", i, new Object[0]);
        }
    }

    public final class AnonymousClass3 extends EditTextBoldCursor {
        @Override
        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
            editorInfo.imeOptions &= -1073741825;
            return inputConnectionOnCreateInputConnection;
        }
    }

    public final class AnonymousClass30 extends NumberPicker {
        @Override
        public final CharSequence getContentDescription(int i) {
            return LocaleController.formatPluralString("Minutes", i, new Object[0]);
        }
    }

    public final class AnonymousClass32 extends TextView {
        @Override
        public final CharSequence getAccessibilityClassName() {
            return Button.class.getName();
        }
    }

    public final class AnonymousClass34 extends TextView {
        @Override
        public final CharSequence getAccessibilityClassName() {
            return Button.class.getName();
        }
    }

    public final class AnonymousClass37 extends NumberPicker {
        @Override
        public final CharSequence getContentDescription(int i) {
            return LocaleController.formatPluralString("Hours", i, new Object[0]);
        }
    }

    public final class AnonymousClass38 extends NumberPicker {
        @Override
        public final CharSequence getContentDescription(int i) {
            return LocaleController.formatPluralString("Minutes", i, new Object[0]);
        }
    }

    public final class AnonymousClass40 extends TextView {
        @Override
        public final CharSequence getAccessibilityClassName() {
            return Button.class.getName();
        }
    }

    public final class AnonymousClass41 extends NumberPicker {
        @Override
        public final CharSequence getContentDescription(int i) {
            return LocaleController.formatPluralString("Hours", i, new Object[0]);
        }
    }

    public final class AnonymousClass42 extends NumberPicker {
        @Override
        public final CharSequence getContentDescription(int i) {
            return LocaleController.formatPluralString("Minutes", i, new Object[0]);
        }
    }

    public final class AnonymousClass44 extends TextView {
        @Override
        public final CharSequence getAccessibilityClassName() {
            return Button.class.getName();
        }
    }

    public final class AnonymousClass46 extends LinearLayout {
        public final int $r8$classId;
        public boolean ignoreLayout;
        public final NumberPicker val$numberPicker;

        public AnonymousClass46(Context context, NumberPicker numberPicker, int i) {
            super(context);
            this.$r8$classId = i;
            this.val$numberPicker = numberPicker;
            this.ignoreLayout = false;
        }

        @Override
        public final void onMeasure(int i, int i2) {
            switch (this.$r8$classId) {
                case 0:
                    this.ignoreLayout = true;
                    Point point = AndroidUtilities.displaySize;
                    int i3 = point.x > point.y ? 3 : 5;
                    AnonymousClass45 anonymousClass45 = (AnonymousClass45) this.val$numberPicker;
                    anonymousClass45.setItemCount(i3);
                    anonymousClass45.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i3;
                    this.ignoreLayout = false;
                    super.onMeasure(i, i2);
                    break;
                default:
                    this.ignoreLayout = true;
                    Point point2 = AndroidUtilities.displaySize;
                    int i4 = point2.x > point2.y ? 3 : 5;
                    AnonymousClass52 anonymousClass52 = (AnonymousClass52) this.val$numberPicker;
                    anonymousClass52.setItemCount(i4);
                    anonymousClass52.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i4;
                    this.ignoreLayout = false;
                    super.onMeasure(i, i2);
                    break;
            }
        }

        @Override
        public final void requestLayout() {
            switch (this.$r8$classId) {
                case 0:
                    if (!this.ignoreLayout) {
                        super.requestLayout();
                        break;
                    }
                    break;
                default:
                    if (!this.ignoreLayout) {
                        super.requestLayout();
                        break;
                    }
                    break;
            }
        }
    }

    public final class AnonymousClass47 extends AnimatedTextView {
        @Override
        public final CharSequence getAccessibilityClassName() {
            return Button.class.getName();
        }
    }

    public final class AnonymousClass48 extends NumberPicker {
        @Override
        public final CharSequence getContentDescription(int i) {
            return LocaleController.formatPluralString("Times", i + 1, new Object[0]);
        }
    }

    public final class AnonymousClass49 extends NumberPicker {
        @Override
        public final CharSequence getContentDescription(int i) {
            return LocaleController.formatPluralString("Times", i + 1, new Object[0]);
        }
    }

    public final class AnonymousClass5 extends LinkSpanDrawable.LinksTextView {
        @Override
        public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
            super.setText(Emoji.replaceEmoji(charSequence, getPaint().getFontMetricsInt(), false), bufferType);
        }
    }

    public final class AnonymousClass51 extends TextView {
        @Override
        public final CharSequence getAccessibilityClassName() {
            return Button.class.getName();
        }
    }

    public final class AnonymousClass54 extends TextView {
        @Override
        public final CharSequence getAccessibilityClassName() {
            return Button.class.getName();
        }
    }

    public final class AnonymousClass56 extends TextView {
        @Override
        public final CharSequence getAccessibilityClassName() {
            return Button.class.getName();
        }
    }

    public final class AnonymousClass57 extends ReportAlert {
        public final AuctionJoinSheet$$ExternalSyntheticLambda0 val$report;

        public AnonymousClass57(Activity activity, int i, DarkThemeResourceProvider darkThemeResourceProvider, AuctionJoinSheet$$ExternalSyntheticLambda0 auctionJoinSheet$$ExternalSyntheticLambda0) {
            super(activity, i, darkThemeResourceProvider);
            this.val$report = auctionJoinSheet$$ExternalSyntheticLambda0;
        }
    }

    public final class AnonymousClass58 extends ViewOutlineProvider {
        @Override
        public final void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, view.getMeasuredWidth(), AndroidUtilities.dp(6.0f) + view.getMeasuredHeight(), AndroidUtilities.dp(6.0f));
        }
    }

    public final class AnonymousClass6 extends LinkSpanDrawable.LinksTextView {
        @Override
        public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
            super.setText(Emoji.replaceEmoji(charSequence, getPaint().getFontMetricsInt(), false), bufferType);
        }
    }

    public final class AnonymousClass64 extends NumberPicker {
        @Override
        public final CharSequence getContentDescription(int i) {
            return LocaleController.formatPluralString("Hours", i, new Object[0]);
        }
    }

    public final class AnonymousClass65 extends NumberPicker {
        @Override
        public final CharSequence getContentDescription(int i) {
            return LocaleController.formatPluralString("Minutes", i, new Object[0]);
        }
    }

    public final class AnonymousClass67 extends TextView {
        @Override
        public final CharSequence getAccessibilityClassName() {
            return Button.class.getName();
        }
    }

    public final class AnonymousClass68 extends TextView {
        @Override
        public final CharSequence getAccessibilityClassName() {
            return Button.class.getName();
        }
    }

    public final class AnonymousClass8 extends TextView {
        @Override
        public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
            super.setText(Emoji.replaceEmoji(charSequence, getPaint().getFontMetricsInt(), false), bufferType);
        }
    }

    public interface AccountSelectDelegate {
        void didSelectAccount(int i);
    }

    public interface ScheduleDatePickerDelegate {
        void didSelectDate(int i, int i2, boolean z);
    }

    public static void checkCalendarDate(NumberPicker numberPicker, NumberPicker numberPicker2, NumberPicker numberPicker3) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(1375315200000L);
        int i = 1;
        int i2 = calendar.get(1);
        int i3 = calendar.get(2);
        int i4 = calendar.get(5);
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i5 = calendar.get(1);
        int i6 = calendar.get(2);
        int i7 = calendar.get(5);
        numberPicker3.setMaxValue(i5);
        numberPicker3.setMinValue(i2);
        int value = numberPicker3.getValue();
        numberPicker2.setMaxValue(value == i5 ? i6 : 11);
        numberPicker2.setMinValue(value == i2 ? i3 : 0);
        int value2 = numberPicker2.getValue();
        calendar.set(1, value);
        calendar.set(2, value2);
        int actualMaximum = calendar.getActualMaximum(5);
        if (value == i5 && value2 == i6) {
            actualMaximum = Math.min(i7, actualMaximum);
        }
        numberPicker.setMaxValue(actualMaximum);
        if (value == i2 && value2 == i3) {
            i = i4;
        }
        numberPicker.setMinValue(i);
    }

    public static long checkFormattedDateInput(ButtonWithCounterView buttonWithCounterView, NumberPicker numberPicker, NumberPicker numberPicker2, NumberPicker numberPicker3, NumberPicker numberPicker4) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(jCurrentTimeMillis);
        int i = 1;
        int i2 = calendar.get(1);
        int value = ((numberPicker2.getValue() - 120) / 12) + i2;
        int value2 = (numberPicker2.getValue() - 120) % 12;
        calendar.clear();
        calendar.set(1, value);
        calendar.set(2, value2);
        numberPicker.setMinValue(1);
        numberPicker.setMaxValue(calendar.getActualMaximum(5));
        int value3 = numberPicker.getValue();
        int value4 = numberPicker3.getValue();
        int value5 = numberPicker4.getValue();
        calendar.set(5, value3);
        calendar.set(11, value4);
        calendar.set(12, value5);
        long timeInMillis = calendar.getTimeInMillis();
        calendar.setTimeInMillis(timeInMillis);
        if (buttonWithCounterView != null) {
            if (value3 == 0) {
                i = 0;
            } else if (i2 != value) {
                i = 2;
            }
            buttonWithCounterView.setText(LocaleController.getInstance().getFormatterScheduleSend(i + 9).format(timeInMillis));
        }
        return timeInMillis;
    }

    public static void checkPickerDate(NumberPicker numberPicker, NumberPicker numberPicker2, NumberPicker numberPicker3) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i = 1;
        int i2 = calendar.get(1);
        int i3 = calendar.get(2);
        int i4 = calendar.get(5);
        numberPicker3.setMinValue(i2);
        int value = numberPicker3.getValue();
        numberPicker2.setMinValue(value == i2 ? i3 : 0);
        int value2 = numberPicker2.getValue();
        if (value == i2 && value2 == i3) {
            i = i4;
        }
        numberPicker.setMinValue(i);
    }

    public static void checkPollCloseCustomDeadline(TextView textView, NumberPicker numberPicker, AnonymousClass37 anonymousClass37, AnonymousClass38 anonymousClass38) {
        int value = numberPicker.getValue();
        int value2 = anonymousClass37.getValue();
        int value3 = anonymousClass38.getValue();
        Calendar calendar = Calendar.getInstance();
        long jCurrentTimeMillis = System.currentTimeMillis();
        calendar.setTimeInMillis(jCurrentTimeMillis);
        calendar.add(6, value);
        calendar.set(11, value2);
        calendar.set(12, value3);
        calendar.set(13, 0);
        calendar.set(14, 0);
        int timeInMillis = (int) ((calendar.getTimeInMillis() - jCurrentTimeMillis) / 1000);
        int i = timeInMillis / 86400;
        int i2 = (timeInMillis % 86400) / 3600;
        int i3 = (timeInMillis % 3600) / 60;
        textView.setText(LocaleController.formatString(R.string.PollCustomDeadlineClosesIn, LocaleController.formatString(R.string.PollCustomDeadlineClosesInFmt, i > 0 ? LocaleController.formatPluralString("Days", i, new Object[0]) : "", i2 > 0 ? LocaleController.formatPluralString("Hours", i2, new Object[0]) : "", i3 > 0 ? LocaleController.formatPluralString("Minutes", i3, new Object[0]) : "").trim()));
    }

    public static void checkRestrictedInviteUsers(int i, TLRPC.Chat chat, TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers) {
        TLRPC.User user;
        if (tL_messages_invitedUsers == null || tL_messages_invitedUsers.missing_invitees.isEmpty() || chat == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList<TLRPC.TL_missingInvitee> arrayList4 = tL_messages_invitedUsers.missing_invitees;
        int size = arrayList4.size();
        int i2 = 0;
        while (i2 < size) {
            TLRPC.TL_missingInvitee tL_missingInvitee = arrayList4.get(i2);
            i2++;
            TLRPC.TL_missingInvitee tL_missingInvitee2 = tL_missingInvitee;
            if (tL_messages_invitedUsers.updates == null) {
                user = null;
                break;
            }
            int i3 = 0;
            while (true) {
                if (i3 >= tL_messages_invitedUsers.updates.users.size()) {
                    user = null;
                    break;
                }
                user = tL_messages_invitedUsers.updates.users.get(i3);
                if (user.id == tL_missingInvitee2.user_id) {
                    break;
                } else {
                    i3++;
                }
            }
            if (user == null) {
                user = MessagesController.getInstance(i).getUser(Long.valueOf(tL_missingInvitee2.user_id));
            }
            if (user != null) {
                arrayList.add(user);
                if (tL_missingInvitee2.premium_required_for_pm) {
                    arrayList2.add(Long.valueOf(user.id));
                }
                if (tL_missingInvitee2.premium_would_allow_invite) {
                    arrayList3.add(Long.valueOf(user.id));
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        AndroidUtilities.runOnUIThread(new WearAuthSheet$$ExternalSyntheticLambda3(i, chat, arrayList, arrayList2, arrayList3), 200L);
    }

    public static void checkScheduleDate(GroupCallActivity.AnonymousClass42 anonymousClass42, TextView textView, NumberPicker numberPicker, GroupCallActivity.AnonymousClass40 anonymousClass40, GroupCallActivity.AnonymousClass41 anonymousClass41) {
        checkScheduleDate(anonymousClass42, textView, 0L, 604800L, 2, numberPicker, anonymousClass40, anonymousClass41);
    }

    public static boolean checkSlowMode(Context context, int i, long j, boolean z) {
        TLRPC.Chat chat;
        if (!DialogObject.isChatDialog(j) || (chat = MessagesController.getInstance(i).getChat(Long.valueOf(-j))) == null || !chat.slowmode_enabled || ChatObject.hasAdminRights(chat)) {
            return false;
        }
        if (!z) {
            TLRPC.ChatFull chatFull = MessagesController.getInstance(i).getChatFull(chat.id);
            if (chatFull == null) {
                chatFull = MessagesStorage.getInstance(i).loadChatInfo(chat.id, ChatObject.isChannel(chat), new CountDownLatch(1), false, false);
            }
            if (chatFull != null && chatFull.slowmode_next_send_date >= ConnectionsManager.getInstance(i).getCurrentTime()) {
                z = true;
            }
        }
        if (!z) {
            return false;
        }
        createSimpleAlert(context, chat.title, LocaleController.getString(R.string.SlowmodeSendError)).show();
        return true;
    }

    public static AlertDialog createAccountSelectDialog(Activity activity, AccountSelectDelegate accountSelectDelegate) {
        if (UserConfig.getActivatedAccountsCount() < 2) {
            return null;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(activity, 0, null);
        AlertDialog alertDialog = builder.alertDialog;
        AlertDialog$$ExternalSyntheticLambda1 alertDialog$$ExternalSyntheticLambda1 = alertDialog.dismissRunnable;
        AlertDialog[] alertDialogArr = new AlertDialog[1];
        LinearLayout linearLayoutM = FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline0.m(activity, 1);
        for (int i = 0; i < 4; i++) {
            if (UserConfig.getInstance(i).getCurrentUser() != null) {
                AccountSelectCell accountSelectCell = new AccountSelectCell(activity, false);
                accountSelectCell.accountNumber = i;
                TLRPC.User currentUser = UserConfig.getInstance(i).getCurrentUser();
                AvatarDrawable avatarDrawable = accountSelectCell.avatarDrawable;
                avatarDrawable.setInfo(i, currentUser);
                accountSelectCell.textView.setText(ContactsController.formatName(currentUser.first_name, currentUser.last_name), false);
                BackupImageView backupImageView = accountSelectCell.imageView;
                backupImageView.getImageReceiver().setCurrentAccount(i);
                backupImageView.imageReceiver.setForUserOrChat(currentUser, avatarDrawable);
                backupImageView.onNewImageSet();
                accountSelectCell.checkImageView.setVisibility(4);
                accountSelectCell.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
                accountSelectCell.setBackgroundDrawable(Theme.getSelectorDrawable(false));
                linearLayoutM.addView(accountSelectCell, LayoutHelper.createLinear(-1, 50));
                accountSelectCell.setOnClickListener(new ChatActivity$$ExternalSyntheticLambda62(alertDialogArr, alertDialog$$ExternalSyntheticLambda1, accountSelectDelegate, 15));
            }
        }
        alertDialog.title = LocaleController.getString(R.string.SelectAccount);
        builder.setView(linearLayoutM);
        builder.setPositiveButton(LocaleController.getString(R.string.Cancel), null);
        alertDialogArr[0] = alertDialog;
        return alertDialog;
    }

    public static void createAutoDeleteDatePickerDialog(Context context, Theme.ResourcesProvider resourcesProvider, ScheduleDatePickerDelegate scheduleDatePickerDelegate) {
        int i = 0;
        if (context == null) {
            return;
        }
        int colorOrDefault = resourcesProvider != null ? resourcesProvider.getColorOrDefault(Theme.key_dialogTextBlack) : Theme.getColor(null, Theme.key_dialogTextBlack, false);
        int colorOrDefault2 = resourcesProvider != null ? resourcesProvider.getColorOrDefault(Theme.key_dialogBackground) : Theme.getColor(null, Theme.key_dialogBackground, false);
        if (resourcesProvider != null) {
            resourcesProvider.getColorOrDefault(Theme.key_sheet_other);
        } else {
            Theme.getColor(null, Theme.key_sheet_other, false);
        }
        if (resourcesProvider != null) {
            resourcesProvider.getColorOrDefault(Theme.key_player_actionBarSelector);
        } else {
            Theme.getColor(null, Theme.key_player_actionBarSelector, false);
        }
        if (resourcesProvider != null) {
            resourcesProvider.getColorOrDefault(Theme.key_actionBarDefaultSubmenuItem);
        } else {
            Theme.getColor(null, Theme.key_actionBarDefaultSubmenuItem, false);
        }
        if (resourcesProvider != null) {
            resourcesProvider.getColorOrDefault(Theme.key_actionBarDefaultSubmenuBackground);
        } else {
            Theme.getColor(null, Theme.key_actionBarDefaultSubmenuBackground, false);
        }
        if (resourcesProvider != null) {
            resourcesProvider.getColorOrDefault(Theme.key_listSelector);
        } else {
            Theme.getColor(null, Theme.key_listSelector, false);
        }
        int colorOrDefault3 = resourcesProvider != null ? resourcesProvider.getColorOrDefault(Theme.key_featuredStickers_buttonText) : Theme.getColor(null, Theme.key_featuredStickers_buttonText, false);
        int colorOrDefault4 = resourcesProvider != null ? resourcesProvider.getColorOrDefault(Theme.key_featuredStickers_addButton) : Theme.getColor(null, Theme.key_featuredStickers_addButton, false);
        int colorOrDefault5 = resourcesProvider != null ? resourcesProvider.getColorOrDefault(Theme.key_featuredStickers_addButtonPressed) : Theme.getColor(null, Theme.key_featuredStickers_addButtonPressed, false);
        BottomSheet.Builder builder = new BottomSheet.Builder(context, resourcesProvider);
        BottomSheet bottomSheet = builder.bottomSheet;
        bottomSheet.applyBottomPadding = false;
        final int[] iArr = {0, 1440, 2880, 4320, 5760, 7200, 8640, 10080, 20160, 30240, 44640, 89280, 133920, 178560, 223200, 267840, 525600};
        NumberPicker numberPicker = new NumberPicker(context, resourcesProvider) {
            @Override
            public final CharSequence getContentDescription(int i2) {
                int i3 = iArr[i2];
                if (i3 == 0) {
                    return LocaleController.getString(R.string.AutoDeleteNever);
                }
                if (i3 < 10080) {
                    return LocaleController.formatPluralString("Days", i3 / 1440, new Object[0]);
                }
                if (i3 < 44640) {
                    return LocaleController.formatPluralString("Weeks", i3 / 1440, new Object[0]);
                }
                return i3 < 525600 ? LocaleController.formatPluralString("Months", i3 / 10080, new Object[0]) : LocaleController.formatPluralString("Years", ((i3 * 5) / 31) * 1440, new Object[0]);
            }
        };
        numberPicker.setMinValue(0);
        numberPicker.setMaxValue(16);
        numberPicker.setTextColor(colorOrDefault);
        numberPicker.setValue(0);
        numberPicker.setFormatter(new AlertsCreator$$ExternalSyntheticLambda82(0, iArr));
        AnonymousClass46 anonymousClass46 = new AnonymousClass46(context, numberPicker, i);
        anonymousClass46.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        anonymousClass46.addView(frameLayout, LayoutHelper.createLinear(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.AutoDeleteAfteTitle));
        textView.setTextColor(colorOrDefault);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        frameLayout.addView(textView, LayoutHelper.createFrame(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new ArticleViewer$$ExternalSyntheticLambda23(9));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        anonymousClass46.addView(linearLayout, LayoutHelper.createLinear(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        AnonymousClass47 anonymousClass47 = new AnonymousClass47(context, true, true, false);
        linearLayout.addView(numberPicker, LayoutHelper.createLinear(1.0f, 0, 270));
        anonymousClass47.setPadding(0, 0, 0, 0);
        anonymousClass47.setGravity(17);
        anonymousClass47.setTextColor(colorOrDefault3);
        anonymousClass47.setTextSize(AndroidUtilities.dp(14.0f));
        anonymousClass47.setTypeface(AndroidUtilities.bold());
        int iDp = AndroidUtilities.dp(8.0f);
        anonymousClass47.setBackgroundDrawable(Theme.createSimpleSelectorRoundRectDrawable(iDp, iDp, iDp, iDp, colorOrDefault4, colorOrDefault5, colorOrDefault5));
        anonymousClass46.addView(anonymousClass47, LayoutHelper.createLinear(-1, 48, 83, 16, 15, 16, 16));
        anonymousClass47.setText(LocaleController.getString(R.string.DisableAutoDeleteTimer));
        numberPicker.setOnValueChangedListener(new ColorPicker$$ExternalSyntheticLambda6(anonymousClass47, 4));
        anonymousClass47.setOnClickListener(new BotAdView$$ExternalSyntheticLambda2(iArr, numberPicker, scheduleDatePickerDelegate, builder, 5));
        bottomSheet.customView = anonymousClass46;
        bottomSheet.show();
        bottomSheet.setBackgroundColor(colorOrDefault2);
        bottomSheet.fixNavigationBar(colorOrDefault2);
    }

    public static AlertDialog.Builder createBackgroundLocationPermissionDialog(Activity activity, TLRPC.User user, Runnable runnable, Theme.ResourcesProvider resourcesProvider) {
        if (Build.VERSION.SDK_INT < 29) {
            return null;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(activity, 0, resourcesProvider);
        Theme.ThemeInfo themeInfo = Theme.currentDayTheme;
        if (themeInfo == null) {
            themeInfo = Theme.defaultTheme;
        }
        String res = AndroidUtilities.readRes(themeInfo.isDark() ? R.raw.permission_map_dark : R.raw.permission_map);
        Theme.ThemeInfo themeInfo2 = Theme.currentDayTheme;
        if (themeInfo2 == null) {
            themeInfo2 = Theme.defaultTheme;
        }
        String res2 = AndroidUtilities.readRes(themeInfo2.isDark() ? R.raw.permission_pin_dark : R.raw.permission_pin);
        FrameLayout frameLayout = new FrameLayout(activity);
        frameLayout.setClipToOutline(true);
        frameLayout.setOutlineProvider(new AnonymousClass58());
        View view = new View(activity);
        view.setBackground(SvgHelper.getDrawable(res));
        frameLayout.addView(view, LayoutHelper.createFrame(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        View view2 = new View(activity);
        view2.setBackground(SvgHelper.getDrawable(res2));
        frameLayout.addView(view2, LayoutHelper.createFrame(60, 82.0f, 17, 0.0f, 0.0f, 0.0f, 0.0f));
        BackupImageView backupImageView = new BackupImageView(activity);
        backupImageView.setRoundRadius(AndroidUtilities.dp(26.0f));
        backupImageView.imageReceiver.setForUserOrChat(user, new AvatarDrawable(user));
        backupImageView.onNewImageSet();
        frameLayout.addView(backupImageView, LayoutHelper.createFrame(52, 52.0f, 17, 0.0f, 0.0f, 0.0f, 11.0f));
        AlertDialog alertDialog = builder.alertDialog;
        alertDialog.topView = frameLayout;
        alertDialog.aspectRatio = 0.37820512f;
        alertDialog.message = AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionBackgroundLocation));
        builder.setPositiveButton(LocaleController.getString(R.string.Continue), new BotLocation$$ExternalSyntheticLambda7(activity, 1));
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), new ChatActivity$$ExternalSyntheticLambda177(1, runnable));
        return builder;
    }

    public static BottomSheet.Builder createBirthdayPickerDialog(Context context, String str, String str2, TL_account.TL_birthday tL_birthday, Utilities.Callback callback, Runnable runnable, boolean z, boolean z2, Theme.ResourcesProvider resourcesProvider) {
        float f;
        if (context == null) {
            return null;
        }
        BottomSheet.Builder builder = new BottomSheet.Builder(context, resourcesProvider);
        BottomSheet bottomSheet = builder.bottomSheet;
        bottomSheet.applyBottomPadding = false;
        final NumberPicker numberPicker = new NumberPicker(context, 18, resourcesProvider);
        numberPicker.setTextOffset(AndroidUtilities.dp(10.0f));
        numberPicker.setItemCount(5);
        final NumberPicker numberPicker2 = new NumberPicker(context, 18, resourcesProvider);
        numberPicker2.setItemCount(5);
        numberPicker2.setTextOffset(-AndroidUtilities.dp(10.0f));
        final NumberPicker numberPicker3 = new NumberPicker(context, 18, resourcesProvider);
        numberPicker3.setItemCount(5);
        numberPicker3.setTextOffset(-AndroidUtilities.dp(24.0f));
        LinearLayout linearLayout = new LinearLayout(context) {
            public boolean ignoreLayout = false;

            @Override
            public final void onMeasure(int i, int i2) {
                this.ignoreLayout = true;
                Point point = AndroidUtilities.displaySize;
                int i3 = point.x > point.y ? 3 : 5;
                NumberPicker numberPicker4 = numberPicker;
                numberPicker4.setItemCount(i3);
                NumberPicker numberPicker5 = numberPicker2;
                numberPicker5.setItemCount(i3);
                NumberPicker numberPicker6 = numberPicker3;
                numberPicker6.setItemCount(i3);
                numberPicker4.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i3;
                numberPicker5.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i3;
                numberPicker6.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i3;
                this.ignoreLayout = false;
                super.onMeasure(i, i2);
            }

            @Override
            public final void requestLayout() {
                if (this.ignoreLayout) {
                    return;
                }
                super.requestLayout();
            }
        };
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        linearLayout.addView(frameLayout, LayoutHelper.createLinear(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(str);
        zzlj.m(Theme.key_dialogTextBlack, resourcesProvider, textView, 20.0f);
        frameLayout.addView(textView, LayoutHelper.createFrame(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new ArticleViewer$$ExternalSyntheticLambda23(9));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setGravity(17);
        linearLayout2.setOrientation(0);
        linearLayout2.setWeightSum(1.0f);
        linearLayout.addView(linearLayout2, LayoutHelper.createLinear(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        Calendar calendar = Calendar.getInstance();
        int i = calendar.get(1) - 149;
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i2 = calendar.get(5);
        int i3 = calendar.get(2);
        int i4 = calendar.get(1);
        int i5 = i4 + 1;
        AlertsCreator$$ExternalSyntheticLambda70 alertsCreator$$ExternalSyntheticLambda70 = new AlertsCreator$$ExternalSyntheticLambda70(numberPicker3, i5, numberPicker, numberPicker2, i4, i3, i2);
        System.currentTimeMillis();
        AnonymousClass34 anonymousClass34 = new AnonymousClass34(context);
        linearLayout2.addView(numberPicker, LayoutHelper.createLinear(0.25f, 0, 270));
        numberPicker.setMinValue(1);
        numberPicker.setMaxValue(31);
        numberPicker.setWrapSelectorWheel(false);
        numberPicker.setFormatter(new EmojiView$$ExternalSyntheticLambda21(17));
        ColorPicker$$ExternalSyntheticLambda6 colorPicker$$ExternalSyntheticLambda6 = new ColorPicker$$ExternalSyntheticLambda6(alertsCreator$$ExternalSyntheticLambda70, 2);
        numberPicker.setOnScrollListener(colorPicker$$ExternalSyntheticLambda6);
        numberPicker2.setMinValue(0);
        numberPicker2.setMaxValue(11);
        numberPicker2.setWrapSelectorWheel(false);
        linearLayout2.addView(numberPicker2, LayoutHelper.createLinear(0.5f, 0, 270));
        numberPicker2.setFormatter(new EmojiView$$ExternalSyntheticLambda21(18));
        numberPicker2.setOnScrollListener(colorPicker$$ExternalSyntheticLambda6);
        numberPicker3.setMinValue(i);
        numberPicker3.setMaxValue(i5);
        numberPicker3.setWrapSelectorWheel(false);
        numberPicker3.setFormatter(new LogoutActivity$$ExternalSyntheticLambda1(i5, 5));
        linearLayout2.addView(numberPicker3, LayoutHelper.createLinear(0.25f, 0, 270));
        numberPicker3.setOnScrollListener(colorPicker$$ExternalSyntheticLambda6);
        if (tL_birthday != null) {
            numberPicker.setValue(tL_birthday.day);
            numberPicker2.setValue(tL_birthday.month - 1);
            if ((tL_birthday.flags & 1) != 0) {
                numberPicker3.setValue(tL_birthday.year);
            } else {
                numberPicker3.setValue(i5);
            }
        } else {
            numberPicker.setValue(calendar.get(5));
            numberPicker2.setValue(calendar.get(2));
            numberPicker3.setValue(i5);
        }
        alertsCreator$$ExternalSyntheticLambda70.run();
        if (runnable != null) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context, null);
            linksTextView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
            linksTextView.setTextSize(1, 13.0f);
            linksTextView.setTextColor(Theme.getColor(Theme.key_dialogTextGray2, resourcesProvider));
            linksTextView.setLinkTextColor(Theme.getColor(Theme.key_chat_messageLinkIn, resourcesProvider));
            linksTextView.setGravity(17);
            frameLayout2.addView(linksTextView, LayoutHelper.createFrame(-2, -2, 17));
            linearLayout.addView(frameLayout2, LayoutHelper.createLinear(-1, -2));
            int i6 = UserConfig.selectedAccount;
            ArticleViewer$$ExternalSyntheticLambda74 articleViewer$$ExternalSyntheticLambda74 = new ArticleViewer$$ExternalSyntheticLambda74(i6, linksTextView, 19);
            articleViewer$$ExternalSyntheticLambda74.run();
            f = 8.0f;
            NotificationCenter.getInstance(i6).listen(frameLayout2, NotificationCenter.privacyRulesUpdated, new DialogCell$$ExternalSyntheticLambda6(articleViewer$$ExternalSyntheticLambda74, 14));
            ContactsController.getInstance(i6).loadPrivacySettings();
        } else {
            f = 8.0f;
        }
        if (z) {
            ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, resourcesProvider, false);
            buttonWithCounterView.setText(LocaleController.getString(R.string.DateOfBirthHideYear), false, true);
            buttonWithCounterView.setOnClickListener(new WearAuthSheet$$ExternalSyntheticLambda6(numberPicker3, i5, alertsCreator$$ExternalSyntheticLambda70, 6));
            linearLayout.addView(buttonWithCounterView, LayoutHelper.createLinear(-1, 48, 83, 16, 15, 16, 4));
        }
        anonymousClass34.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        anonymousClass34.setGravity(17);
        anonymousClass34.setTextColor(Theme.getColor(Theme.key_featuredStickers_buttonText, resourcesProvider));
        anonymousClass34.setTextSize(1, 14.0f);
        anonymousClass34.setTypeface(AndroidUtilities.bold());
        anonymousClass34.setText(str2);
        int iDp = AndroidUtilities.dp(f);
        int color = Theme.getColor(Theme.key_featuredStickers_addButton, resourcesProvider);
        int color2 = Theme.getColor(Theme.key_featuredStickers_addButtonPressed, resourcesProvider);
        anonymousClass34.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp, iDp, iDp, iDp, color, color2, color2));
        ScaleStateListAnimator.apply(anonymousClass34, 0.1f, 1.5f);
        linearLayout.addView(anonymousClass34, LayoutHelper.createLinear(-1, 48, 83, 16, z ? 0 : 15, 16, z2 ? 0 : 16));
        anonymousClass34.setOnClickListener(new OAuthSheet$$ExternalSyntheticLambda7(numberPicker, numberPicker2, numberPicker3, i5, builder, callback));
        if (z2) {
            ButtonWithCounterView buttonWithCounterView2 = new ButtonWithCounterView(context, resourcesProvider, false);
            buttonWithCounterView2.setText(LocaleController.getString(R.string.BirthdayRemove), false, true);
            buttonWithCounterView2.setOnClickListener(new ItemOptions$$ExternalSyntheticLambda7(5, builder, callback));
            linearLayout.addView(buttonWithCounterView2, LayoutHelper.createLinear(-1, 48, 83, 16, 4, 16, 16));
        }
        bottomSheet.customView = linearLayout;
        return builder;
    }

    public static void createBotLaunchAlert(BaseFragment baseFragment, TLRPC.User user, Runnable runnable, Runnable runnable2) {
        int i;
        boolean z;
        int i2;
        int i3;
        int i4;
        boolean z2;
        int i5;
        int i6;
        int i7;
        Context context = baseFragment.getContext();
        AlertDialog.Builder builder = new AlertDialog.Builder(context, 0, null);
        AnonymousClass5 anonymousClass5 = new AnonymousClass5(context, null);
        NotificationCenter.listenEmojiLoading(anonymousClass5);
        anonymousClass5.setTextColor(Theme.getColor(null, Theme.key_dialogTextBlack, false));
        anonymousClass5.setLinkTextColor(Theme.getColor(null, Theme.key_chat_messageLinkIn, false));
        anonymousClass5.setTextSize(1, 16.0f);
        anonymousClass5.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        FrameLayout frameLayout = new FrameLayout(context);
        AlertDialog alertDialog = builder.alertDialog;
        alertDialog.customViewOffset = 6;
        builder.setView(frameLayout);
        AvatarDrawable avatarDrawable = new AvatarDrawable((Theme.ResourcesProvider) null);
        avatarDrawable.namePaint.setTextSize(AndroidUtilities.dp(18.0f));
        BackupImageView backupImageView = new BackupImageView(context);
        backupImageView.setRoundRadius(AndroidUtilities.dp(20.0f));
        frameLayout.addView(backupImageView, LayoutHelper.createFrame(40, 40.0f, (LocaleController.isRTL ? 5 : 3) | 48, 22.0f, 5.0f, 22.0f, 0.0f));
        SimpleTextView simpleTextView = new SimpleTextView(context);
        simpleTextView.setTextColor(Theme.getColor(null, Theme.key_actionBarDefaultSubmenuItem, false));
        simpleTextView.setTextSize(20);
        simpleTextView.setTypeface(AndroidUtilities.bold());
        simpleTextView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        simpleTextView.setEllipsizeByGradient(true);
        simpleTextView.setText(user.first_name, false);
        if (user.scam) {
            simpleTextView.setRightDrawable(Theme.dialogs_scamDrawable);
        } else {
            if (!user.fake) {
                if (user.verified) {
                    Drawable drawableMutate = context.getResources().getDrawable(R.drawable.verified_area).mutate();
                    int color = Theme.getColor(null, Theme.key_chats_verifiedBackground, false);
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    drawableMutate.setColorFilter(new PorterDuffColorFilter(color, mode));
                    Drawable drawableMutate2 = context.getResources().getDrawable(R.drawable.verified_check).mutate();
                    drawableMutate2.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_chats_verifiedCheck, false), mode));
                    simpleTextView.setRightDrawable(new CombinedDrawable(drawableMutate, drawableMutate2));
                }
                TextView textView = new TextView(context);
                ArticleViewer.IBlock.CC.m(textView, Theme.getColor(null, Theme.key_dialogTextBlue, false), 14.0f, 1, true);
                if (LocaleController.isRTL) {
                    i = 5;
                } else {
                    i = 3;
                }
                textView.setGravity(i | 16);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setOnClickListener(new AlertsCreator$$ExternalSyntheticLambda22(user, baseFragment, builder, 0));
                SpannableString spannableStringValueOf = SpannableString.valueOf(LocaleController.getString(R.string.MoreAboutThisBot) + "  ");
                ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.attach_arrow_right);
                coloredImageSpan.setTopOffset(1);
                coloredImageSpan.setSize(AndroidUtilities.dp(10.0f));
                spannableStringValueOf.setSpan(coloredImageSpan, spannableStringValueOf.length() - 1, spannableStringValueOf.length(), 33);
                textView.setText(spannableStringValueOf);
                z = LocaleController.isRTL;
                if (z) {
                    i2 = 5;
                } else {
                    i2 = 3;
                }
                int i8 = i2 | 48;
                if (z) {
                    i3 = 21;
                } else {
                    i3 = 76;
                }
                float f = i3;
                if (z) {
                    i4 = 76;
                } else {
                    i4 = 21;
                }
                frameLayout.addView(simpleTextView, LayoutHelper.createFrame(-1, -2.0f, i8, f, 0.0f, i4, 0.0f));
                z2 = LocaleController.isRTL;
                if (z2) {
                    i5 = 5;
                } else {
                    i5 = 3;
                }
                int i9 = i5 | 48;
                if (z2) {
                    i6 = 21;
                } else {
                    i6 = 76;
                }
                frameLayout.addView(textView, LayoutHelper.createFrame(-1, -2.0f, i9, i6, 24.0f, z2 ? 76 : 21, 0.0f));
                if (LocaleController.isRTL) {
                    i7 = 5;
                } else {
                    i7 = 3;
                }
                frameLayout.addView(anonymousClass5, LayoutHelper.createFrame(-2, -2.0f, i7 | 48, 24.0f, 57.0f, 24.0f, 1.0f));
                if (UserObject.isReplyUser(user)) {
                    avatarDrawable.scaleSize = 0.8f;
                    avatarDrawable.setAvatarType(12);
                    backupImageView.setImage(null, null, avatarDrawable, user);
                } else {
                    avatarDrawable.scaleSize = 1.0f;
                    avatarDrawable.setInfo(baseFragment.getCurrentAccount(), user);
                    backupImageView.imageReceiver.setForUserOrChat(user, avatarDrawable);
                    backupImageView.onNewImageSet();
                }
                builder.setPositiveButton(LocaleController.getString(R.string.Start), new ChatActivity$$ExternalSyntheticLambda177(5, runnable));
                builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                baseFragment.showDialog(alertDialog, false, new PhotoViewer$$ExternalSyntheticLambda161(1, runnable2));
                anonymousClass5.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.BotWebViewStartPermission2), new AlertsCreator$$ExternalSyntheticLambda25(0, context, alertDialog)));
            }
            simpleTextView.setRightDrawable(Theme.dialogs_fakeDrawable);
        }
        TextView textView2 = new TextView(context);
        ArticleViewer.IBlock.CC.m(textView2, Theme.getColor(null, Theme.key_dialogTextBlue, false), 14.0f, 1, true);
        if (LocaleController.isRTL) {
            i = 5;
        } else {
            i = 3;
        }
        textView2.setGravity(i | 16);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setOnClickListener(new AlertsCreator$$ExternalSyntheticLambda22(user, baseFragment, builder, 0));
        SpannableString spannableStringValueOf2 = SpannableString.valueOf(LocaleController.getString(R.string.MoreAboutThisBot) + "  ");
        ColoredImageSpan coloredImageSpan2 = new ColoredImageSpan(R.drawable.attach_arrow_right);
        coloredImageSpan2.setTopOffset(1);
        coloredImageSpan2.setSize(AndroidUtilities.dp(10.0f));
        spannableStringValueOf2.setSpan(coloredImageSpan2, spannableStringValueOf2.length() - 1, spannableStringValueOf2.length(), 33);
        textView2.setText(spannableStringValueOf2);
        z = LocaleController.isRTL;
        if (z) {
            i2 = 5;
        } else {
            i2 = 3;
        }
        int i10 = i2 | 48;
        if (z) {
            i3 = 21;
        } else {
            i3 = 76;
        }
        float f2 = i3;
        if (z) {
            i4 = 76;
        } else {
            i4 = 21;
        }
        frameLayout.addView(simpleTextView, LayoutHelper.createFrame(-1, -2.0f, i10, f2, 0.0f, i4, 0.0f));
        z2 = LocaleController.isRTL;
        if (z2) {
            i5 = 5;
        } else {
            i5 = 3;
        }
        int i11 = i5 | 48;
        if (z2) {
            i6 = 21;
        } else {
            i6 = 76;
        }
        frameLayout.addView(textView2, LayoutHelper.createFrame(-1, -2.0f, i11, i6, 24.0f, z2 ? 76 : 21, 0.0f));
        if (LocaleController.isRTL) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        frameLayout.addView(anonymousClass5, LayoutHelper.createFrame(-2, -2.0f, i7 | 48, 24.0f, 57.0f, 24.0f, 1.0f));
        if (UserObject.isReplyUser(user)) {
            avatarDrawable.scaleSize = 0.8f;
            avatarDrawable.setAvatarType(12);
            backupImageView.setImage(null, null, avatarDrawable, user);
        } else {
            avatarDrawable.scaleSize = 1.0f;
            avatarDrawable.setInfo(baseFragment.getCurrentAccount(), user);
            backupImageView.imageReceiver.setForUserOrChat(user, avatarDrawable);
            backupImageView.onNewImageSet();
        }
        builder.setPositiveButton(LocaleController.getString(R.string.Start), new ChatActivity$$ExternalSyntheticLambda177(5, runnable));
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        baseFragment.showDialog(alertDialog, false, new PhotoViewer$$ExternalSyntheticLambda161(1, runnable2));
        anonymousClass5.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.BotWebViewStartPermission2), new AlertsCreator$$ExternalSyntheticLambda25(0, context, alertDialog)));
    }

    public static BottomSheet.Builder createCalendarPickerDialog(Activity activity, MessagesStorage.IntCallback intCallback, Theme.ResourcesProvider resourcesProvider) {
        if (activity == null) {
            return null;
        }
        BottomSheet.Builder builder = new BottomSheet.Builder(activity, resourcesProvider);
        BottomSheet bottomSheet = builder.bottomSheet;
        bottomSheet.applyBottomPadding = false;
        final NumberPicker numberPicker = new NumberPicker(activity, 18, resourcesProvider);
        numberPicker.setTextOffset(AndroidUtilities.dp(10.0f));
        numberPicker.setItemCount(5);
        final NumberPicker numberPicker2 = new NumberPicker(activity, 18, resourcesProvider);
        numberPicker2.setItemCount(5);
        numberPicker2.setTextOffset(-AndroidUtilities.dp(10.0f));
        final NumberPicker numberPicker3 = new NumberPicker(activity, 18, resourcesProvider);
        numberPicker3.setItemCount(5);
        numberPicker3.setTextOffset(-AndroidUtilities.dp(24.0f));
        LinearLayout linearLayout = new LinearLayout(activity) {
            public boolean ignoreLayout = false;

            @Override
            public final void onMeasure(int i, int i2) {
                this.ignoreLayout = true;
                Point point = AndroidUtilities.displaySize;
                int i3 = point.x > point.y ? 3 : 5;
                NumberPicker numberPicker4 = numberPicker;
                numberPicker4.setItemCount(i3);
                NumberPicker numberPicker5 = numberPicker2;
                numberPicker5.setItemCount(i3);
                NumberPicker numberPicker6 = numberPicker3;
                numberPicker6.setItemCount(i3);
                numberPicker4.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i3;
                numberPicker5.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i3;
                numberPicker6.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i3;
                this.ignoreLayout = false;
                super.onMeasure(i, i2);
            }

            @Override
            public final void requestLayout() {
                if (this.ignoreLayout) {
                    return;
                }
                super.requestLayout();
            }
        };
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(activity);
        linearLayout.addView(frameLayout, LayoutHelper.createLinear(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(activity);
        textView.setText(LocaleController.getString(R.string.ChooseDate));
        zzlj.m(Theme.key_dialogTextBlack, resourcesProvider, textView, 20.0f);
        frameLayout.addView(textView, LayoutHelper.createFrame(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new ArticleViewer$$ExternalSyntheticLambda23(9));
        LinearLayout linearLayout2 = new LinearLayout(activity);
        linearLayout2.setOrientation(0);
        linearLayout2.setWeightSum(1.0f);
        linearLayout.addView(linearLayout2, LayoutHelper.createLinear(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        System.currentTimeMillis();
        AnonymousClass56 anonymousClass56 = new AnonymousClass56(activity);
        linearLayout2.addView(numberPicker, LayoutHelper.createLinear(0.25f, 0, 270));
        numberPicker.setMinValue(1);
        numberPicker.setMaxValue(31);
        numberPicker.setWrapSelectorWheel(false);
        numberPicker.setFormatter(new EmojiView$$ExternalSyntheticLambda21(19));
        AlertsCreator$$ExternalSyntheticLambda95 alertsCreator$$ExternalSyntheticLambda95 = new AlertsCreator$$ExternalSyntheticLambda95(numberPicker, numberPicker2, numberPicker3, 0);
        numberPicker.setOnValueChangedListener(alertsCreator$$ExternalSyntheticLambda95);
        numberPicker2.setMinValue(0);
        numberPicker2.setMaxValue(11);
        numberPicker2.setWrapSelectorWheel(false);
        linearLayout2.addView(numberPicker2, LayoutHelper.createLinear(0.5f, 0, 270));
        numberPicker2.setFormatter(new EmojiView$$ExternalSyntheticLambda21(20));
        numberPicker2.setOnValueChangedListener(alertsCreator$$ExternalSyntheticLambda95);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(1375315200000L);
        int i = calendar.get(1);
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i2 = calendar.get(1);
        numberPicker3.setMinValue(i);
        numberPicker3.setMaxValue(i2);
        numberPicker3.setWrapSelectorWheel(false);
        numberPicker3.setFormatter(new EmojiView$$ExternalSyntheticLambda21(21));
        linearLayout2.addView(numberPicker3, LayoutHelper.createLinear(0.25f, 0, 270));
        numberPicker3.setOnValueChangedListener(alertsCreator$$ExternalSyntheticLambda95);
        numberPicker.setValue(31);
        numberPicker2.setValue(12);
        numberPicker3.setValue(i2);
        checkCalendarDate(numberPicker, numberPicker2, numberPicker3);
        anonymousClass56.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        anonymousClass56.setGravity(17);
        anonymousClass56.setTextColor(Theme.getColor(Theme.key_featuredStickers_buttonText, resourcesProvider));
        anonymousClass56.setTextSize(1, 14.0f);
        anonymousClass56.setTypeface(AndroidUtilities.bold());
        anonymousClass56.setText(LocaleController.getString(R.string.JumpToDate));
        int iDp = AndroidUtilities.dp(8.0f);
        int color = Theme.getColor(Theme.key_featuredStickers_addButton, resourcesProvider);
        int color2 = Theme.getColor(Theme.key_featuredStickers_addButtonPressed, resourcesProvider);
        anonymousClass56.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp, iDp, iDp, iDp, color, color2, color2));
        linearLayout.addView(anonymousClass56, LayoutHelper.createLinear(-1, 48, 83, 16, 15, 16, 16));
        anonymousClass56.setOnClickListener(new WearAuthSheet$$ExternalSyntheticLambda1(numberPicker, numberPicker2, numberPicker3, calendar, intCallback, builder, 3));
        bottomSheet.customView = linearLayout;
        return builder;
    }

    public static void createCallDialogAlert(BaseFragment baseFragment, TLRPC.User user, boolean z) {
        String string;
        String string2;
        if (baseFragment.getParentActivity() == null || user == null || UserObject.isDeleted(user) || UserConfig.getInstance(baseFragment.getCurrentAccount()).getClientUserId() == user.id) {
            return;
        }
        baseFragment.getCurrentAccount();
        Activity parentActivity = baseFragment.getParentActivity();
        FrameLayout frameLayout = new FrameLayout(parentActivity);
        if (z) {
            string = LocaleController.getString(R.string.VideoCallAlertTitle);
            string2 = LocaleController.formatString("VideoCallAlert", R.string.VideoCallAlert, UserObject.getUserName(user));
        } else {
            string = LocaleController.getString(R.string.CallAlertTitle);
            string2 = LocaleController.formatString("CallAlert", R.string.CallAlert, UserObject.getUserName(user));
        }
        AnonymousClass16 anonymousClass16 = new AnonymousClass16(parentActivity);
        NotificationCenter.listenEmojiLoading(anonymousClass16);
        anonymousClass16.setTextColor(Theme.getColor(null, Theme.key_dialogTextBlack, false));
        anonymousClass16.setTextSize(1, 16.0f);
        anonymousClass16.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        anonymousClass16.setText(AndroidUtilities.replaceTags(string2));
        AvatarDrawable avatarDrawable = new AvatarDrawable((Theme.ResourcesProvider) null);
        avatarDrawable.namePaint.setTextSize(AndroidUtilities.dp(12.0f));
        avatarDrawable.scaleSize = 1.0f;
        avatarDrawable.setInfo(baseFragment.getCurrentAccount(), user);
        BackupImageView backupImageView = new BackupImageView(parentActivity);
        backupImageView.setRoundRadius(AndroidUtilities.dp(20.0f));
        backupImageView.imageReceiver.setForUserOrChat(user, avatarDrawable);
        backupImageView.onNewImageSet();
        frameLayout.addView(backupImageView, LayoutHelper.createFrame(40, 40.0f, (LocaleController.isRTL ? 5 : 3) | 48, 22.0f, 5.0f, 22.0f, 0.0f));
        TextView textView = new TextView(parentActivity);
        textView.setTextColor(Theme.getColor(null, Theme.key_actionBarDefaultSubmenuItem, false));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setText(string);
        boolean z2 = LocaleController.isRTL;
        frameLayout.addView(textView, LayoutHelper.createFrame(-1, -2.0f, (z2 ? 5 : 3) | 48, z2 ? 21 : 76, 11.0f, z2 ? 76 : 21, 0.0f));
        frameLayout.addView(anonymousClass16, LayoutHelper.createFrame(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 57.0f, 24.0f, 9.0f));
        AlertDialog.Builder builder = new AlertDialog.Builder(parentActivity, 0, null);
        builder.setView(frameLayout);
        builder.setPositiveButton(LocaleController.getString(R.string.Call), new LoginActivity$$ExternalSyntheticLambda31(baseFragment, user, z));
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        baseFragment.showDialog(builder.alertDialog);
    }

    public static void createClearDaysDialogAlert(BaseFragment baseFragment, int i, TLRPC.User user, TLRPC.Chat chat, boolean z, MessagesStorage.BooleanCallback booleanCallback, Theme.ResourcesProvider resourcesProvider) {
        int i2;
        boolean[] zArr;
        String string;
        TextView textView;
        int iDp;
        int iDp2;
        long j;
        if (baseFragment == null || baseFragment.getParentActivity() == null) {
            return;
        }
        if (user == null && chat == null) {
            return;
        }
        int currentAccount = baseFragment.getCurrentAccount();
        Activity parentActivity = baseFragment.getParentActivity();
        AlertDialog.Builder builder = new AlertDialog.Builder(parentActivity, 0, resourcesProvider);
        long clientUserId = UserConfig.getInstance(currentAccount).getClientUserId();
        final CheckBoxCell[] checkBoxCellArr = new CheckBoxCell[1];
        AnonymousClass14 anonymousClass14 = new AnonymousClass14(parentActivity);
        NotificationCenter.listenEmojiLoading(anonymousClass14);
        anonymousClass14.setTextColor(Theme.getColor(null, Theme.key_dialogTextBlack, false));
        anonymousClass14.setTextSize(1, 16.0f);
        anonymousClass14.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        FrameLayout frameLayout = new FrameLayout(parentActivity) {
            @Override
            public final void onMeasure(int i3, int i4) {
                super.onMeasure(i3, i4);
                CheckBoxCell[] checkBoxCellArr2 = checkBoxCellArr;
                if (checkBoxCellArr2[0] != null) {
                    setMeasuredDimension(getMeasuredWidth(), checkBoxCellArr2[0].getMeasuredHeight() + getMeasuredHeight());
                }
            }
        };
        builder.setView(frameLayout);
        TextView textView2 = new TextView(parentActivity);
        textView2.setTextColor(Theme.getColor(null, Theme.key_actionBarDefaultSubmenuItem, false));
        textView2.setTextSize(1, 20.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        frameLayout.addView(textView2, LayoutHelper.createFrame(-1, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 11.0f, 24.0f, 0.0f));
        frameLayout.addView(anonymousClass14, LayoutHelper.createFrame(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 48.0f, 24.0f, 18.0f));
        if (i == -1) {
            textView2.setText(LocaleController.formatString("ClearHistory", R.string.ClearHistory, new Object[0]));
            if (user != null) {
                anonymousClass14.setText(AndroidUtilities.replaceTags(LocaleController.formatString("AreYouSureClearHistoryWithUser", R.string.AreYouSureClearHistoryWithUser, UserObject.getUserName(user))));
            } else {
                if (z) {
                    if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                        i2 = 1;
                        anonymousClass14.setText(AndroidUtilities.replaceTags(LocaleController.formatString("AreYouSureClearHistoryWithChannel", R.string.AreYouSureClearHistoryWithChannel, chat.title)));
                    } else {
                        anonymousClass14.setText(AndroidUtilities.replaceTags(LocaleController.formatString("AreYouSureClearHistoryWithChat", R.string.AreYouSureClearHistoryWithChat, chat.title)));
                    }
                    zArr = new boolean[i2];
                    zArr[0] = false;
                    if (chat != null && z && ChatObject.isPublic(chat)) {
                        zArr[0] = i2;
                    }
                    if (user != null) {
                        j = user.id;
                        if (j == clientUserId && j != 489000 && !ChatObject.isMonoForum(chat)) {
                            CheckBoxCell checkBoxCell = new CheckBoxCell(parentActivity, 1, 17, false, resourcesProvider);
                            checkBoxCellArr[0] = checkBoxCell;
                            checkBoxCell.setBackgroundDrawable(Theme.getSelectorDrawable(false));
                            if (chat != null) {
                                checkBoxCellArr[0].setText(LocaleController.getString(R.string.DeleteMessagesOptionAlsoChat), "", false, false, false);
                            } else {
                                checkBoxCellArr[0].setText(LocaleController.formatString("DeleteMessagesOptionAlso", R.string.DeleteMessagesOptionAlso, UserObject.getFirstName(user)), "", false, false, false);
                            }
                            CheckBoxCell checkBoxCell2 = checkBoxCellArr[0];
                            if (LocaleController.isRTL) {
                                iDp = AndroidUtilities.dp(16.0f);
                            } else {
                                iDp = AndroidUtilities.dp(8.0f);
                            }
                            if (LocaleController.isRTL) {
                                iDp2 = AndroidUtilities.dp(8.0f);
                            } else {
                                iDp2 = AndroidUtilities.dp(16.0f);
                            }
                            checkBoxCell2.setPadding(iDp, 0, iDp2, 0);
                            frameLayout.addView(checkBoxCellArr[0], LayoutHelper.createFrame(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
                            checkBoxCellArr[0].setChecked(false, false);
                            checkBoxCellArr[0].setOnClickListener(new ChatActivity$$ExternalSyntheticLambda342(9, zArr));
                        } else if (chat != null && z && !ChatObject.isPublic(chat) && !ChatObject.isChannelAndNotMegaGroup(chat) && !ChatObject.isMonoForum(chat)) {
                            CheckBoxCell checkBoxCell3 = new CheckBoxCell(parentActivity, 1, 17, false, resourcesProvider);
                            checkBoxCellArr[0] = checkBoxCell3;
                            checkBoxCell3.setBackgroundDrawable(Theme.getSelectorDrawable(false));
                            if (chat != null) {
                                checkBoxCellArr[0].setText(LocaleController.getString(R.string.DeleteMessagesOptionAlsoChat), "", false, false, false);
                            } else {
                                checkBoxCellArr[0].setText(LocaleController.formatString("DeleteMessagesOptionAlso", R.string.DeleteMessagesOptionAlso, UserObject.getFirstName(user)), "", false, false, false);
                            }
                            CheckBoxCell checkBoxCell4 = checkBoxCellArr[0];
                            if (LocaleController.isRTL) {
                                iDp = AndroidUtilities.dp(16.0f);
                            } else {
                                iDp = AndroidUtilities.dp(8.0f);
                            }
                            if (LocaleController.isRTL) {
                                iDp2 = AndroidUtilities.dp(8.0f);
                            } else {
                                iDp2 = AndroidUtilities.dp(16.0f);
                            }
                            checkBoxCell4.setPadding(iDp, 0, iDp2, 0);
                            frameLayout.addView(checkBoxCellArr[0], LayoutHelper.createFrame(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
                            checkBoxCellArr[0].setChecked(false, false);
                            checkBoxCellArr[0].setOnClickListener(new ChatActivity$$ExternalSyntheticLambda342(9, zArr));
                        }
                    } else if (chat != null) {
                        CheckBoxCell checkBoxCell5 = new CheckBoxCell(parentActivity, 1, 17, false, resourcesProvider);
                        checkBoxCellArr[0] = checkBoxCell5;
                        checkBoxCell5.setBackgroundDrawable(Theme.getSelectorDrawable(false));
                        if (chat != null) {
                            checkBoxCellArr[0].setText(LocaleController.getString(R.string.DeleteMessagesOptionAlsoChat), "", false, false, false);
                        } else {
                            checkBoxCellArr[0].setText(LocaleController.formatString("DeleteMessagesOptionAlso", R.string.DeleteMessagesOptionAlso, UserObject.getFirstName(user)), "", false, false, false);
                        }
                        CheckBoxCell checkBoxCell6 = checkBoxCellArr[0];
                        if (LocaleController.isRTL) {
                            iDp = AndroidUtilities.dp(16.0f);
                        } else {
                            iDp = AndroidUtilities.dp(8.0f);
                        }
                        if (LocaleController.isRTL) {
                            iDp2 = AndroidUtilities.dp(8.0f);
                        } else {
                            iDp2 = AndroidUtilities.dp(16.0f);
                        }
                        checkBoxCell6.setPadding(iDp, 0, iDp2, 0);
                        frameLayout.addView(checkBoxCellArr[0], LayoutHelper.createFrame(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
                        checkBoxCellArr[0].setChecked(false, false);
                        checkBoxCellArr[0].setOnClickListener(new ChatActivity$$ExternalSyntheticLambda342(9, zArr));
                    }
                    string = LocaleController.getString(R.string.Delete);
                    if (chat != null && z && ChatObject.isPublic(chat) && !ChatObject.isChannelAndNotMegaGroup(chat)) {
                        string = LocaleController.getString(R.string.ClearForAll);
                    }
                    builder.setPositiveButton(string, new ChatActivity$$ExternalSyntheticLambda189(22, booleanCallback, zArr));
                    builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                    AlertDialog alertDialog = builder.alertDialog;
                    baseFragment.showDialog(alertDialog);
                    textView = (TextView) alertDialog.getButton(-1);
                    if (textView != null) {
                        textView.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
                    }
                }
                if (chat.megagroup) {
                    anonymousClass14.setText(LocaleController.getString(R.string.AreYouSureClearHistoryGroup));
                } else {
                    anonymousClass14.setText(LocaleController.getString(R.string.AreYouSureClearHistoryChannel));
                }
            }
        } else {
            textView2.setText(LocaleController.formatPluralString("DeleteDays", i, new Object[0]));
            anonymousClass14.setText(LocaleController.getString(R.string.DeleteHistoryByDaysMessage));
        }
        i2 = 1;
        zArr = new boolean[i2];
        zArr[0] = false;
        if (chat != null) {
            zArr[0] = i2;
        }
        if (user != null) {
            j = user.id;
            if (j == clientUserId) {
                if (chat != null) {
                    CheckBoxCell checkBoxCell7 = new CheckBoxCell(parentActivity, 1, 17, false, resourcesProvider);
                    checkBoxCellArr[0] = checkBoxCell7;
                    checkBoxCell7.setBackgroundDrawable(Theme.getSelectorDrawable(false));
                    if (chat != null) {
                        checkBoxCellArr[0].setText(LocaleController.getString(R.string.DeleteMessagesOptionAlsoChat), "", false, false, false);
                    } else {
                        checkBoxCellArr[0].setText(LocaleController.formatString("DeleteMessagesOptionAlso", R.string.DeleteMessagesOptionAlso, UserObject.getFirstName(user)), "", false, false, false);
                    }
                    CheckBoxCell checkBoxCell8 = checkBoxCellArr[0];
                    if (LocaleController.isRTL) {
                        iDp = AndroidUtilities.dp(16.0f);
                    } else {
                        iDp = AndroidUtilities.dp(8.0f);
                    }
                    if (LocaleController.isRTL) {
                        iDp2 = AndroidUtilities.dp(8.0f);
                    } else {
                        iDp2 = AndroidUtilities.dp(16.0f);
                    }
                    checkBoxCell8.setPadding(iDp, 0, iDp2, 0);
                    frameLayout.addView(checkBoxCellArr[0], LayoutHelper.createFrame(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
                    checkBoxCellArr[0].setChecked(false, false);
                    checkBoxCellArr[0].setOnClickListener(new ChatActivity$$ExternalSyntheticLambda342(9, zArr));
                }
            } else if (chat != null) {
                CheckBoxCell checkBoxCell9 = new CheckBoxCell(parentActivity, 1, 17, false, resourcesProvider);
                checkBoxCellArr[0] = checkBoxCell9;
                checkBoxCell9.setBackgroundDrawable(Theme.getSelectorDrawable(false));
                if (chat != null) {
                    checkBoxCellArr[0].setText(LocaleController.getString(R.string.DeleteMessagesOptionAlsoChat), "", false, false, false);
                } else {
                    checkBoxCellArr[0].setText(LocaleController.formatString("DeleteMessagesOptionAlso", R.string.DeleteMessagesOptionAlso, UserObject.getFirstName(user)), "", false, false, false);
                }
                CheckBoxCell checkBoxCell10 = checkBoxCellArr[0];
                if (LocaleController.isRTL) {
                    iDp = AndroidUtilities.dp(16.0f);
                } else {
                    iDp = AndroidUtilities.dp(8.0f);
                }
                if (LocaleController.isRTL) {
                    iDp2 = AndroidUtilities.dp(8.0f);
                } else {
                    iDp2 = AndroidUtilities.dp(16.0f);
                }
                checkBoxCell10.setPadding(iDp, 0, iDp2, 0);
                frameLayout.addView(checkBoxCellArr[0], LayoutHelper.createFrame(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
                checkBoxCellArr[0].setChecked(false, false);
                checkBoxCellArr[0].setOnClickListener(new ChatActivity$$ExternalSyntheticLambda342(9, zArr));
            }
        } else if (chat != null) {
            CheckBoxCell checkBoxCell11 = new CheckBoxCell(parentActivity, 1, 17, false, resourcesProvider);
            checkBoxCellArr[0] = checkBoxCell11;
            checkBoxCell11.setBackgroundDrawable(Theme.getSelectorDrawable(false));
            if (chat != null) {
                checkBoxCellArr[0].setText(LocaleController.getString(R.string.DeleteMessagesOptionAlsoChat), "", false, false, false);
            } else {
                checkBoxCellArr[0].setText(LocaleController.formatString("DeleteMessagesOptionAlso", R.string.DeleteMessagesOptionAlso, UserObject.getFirstName(user)), "", false, false, false);
            }
            CheckBoxCell checkBoxCell12 = checkBoxCellArr[0];
            if (LocaleController.isRTL) {
                iDp = AndroidUtilities.dp(16.0f);
            } else {
                iDp = AndroidUtilities.dp(8.0f);
            }
            if (LocaleController.isRTL) {
                iDp2 = AndroidUtilities.dp(8.0f);
            } else {
                iDp2 = AndroidUtilities.dp(16.0f);
            }
            checkBoxCell12.setPadding(iDp, 0, iDp2, 0);
            frameLayout.addView(checkBoxCellArr[0], LayoutHelper.createFrame(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
            checkBoxCellArr[0].setChecked(false, false);
            checkBoxCellArr[0].setOnClickListener(new ChatActivity$$ExternalSyntheticLambda342(9, zArr));
        }
        string = LocaleController.getString(R.string.Delete);
        if (chat != null) {
            string = LocaleController.getString(R.string.ClearForAll);
        }
        builder.setPositiveButton(string, new ChatActivity$$ExternalSyntheticLambda189(22, booleanCallback, zArr));
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        AlertDialog alertDialog2 = builder.alertDialog;
        baseFragment.showDialog(alertDialog2);
        textView = (TextView) alertDialog2.getButton(-1);
        if (textView != null) {
            textView.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
        }
    }

    public static void createClearOrDeleteDialogAlert(BaseFragment baseFragment, boolean z, TLRPC.Chat chat, TLRPC.User user, boolean z2, boolean z3, boolean z4, boolean z5, MessagesStorage.BooleanCallback booleanCallback) {
        createClearOrDeleteDialogAlert(baseFragment, z, false, chat, user, z2, z3, z4, z5, booleanCallback, baseFragment != null ? baseFragment.getResourceProvider() : null);
    }

    public static AlertDialog createColorSelectDialog(Activity activity, final long j, final long j2, final int i, final Runnable runnable, Theme.ResourcesProvider resourcesProvider) {
        int iM;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(UserConfig.selectedAccount);
        final String sharedPrefKey = NotificationsController.getSharedPrefKey(j, j2);
        if (j != 0) {
            iM = notificationsSettings.contains("color_" + sharedPrefKey) ? ArticleViewer.IBlock.CC.m("color_", sharedPrefKey, notificationsSettings, -16776961) : DialogObject.isChatDialog(j) ? notificationsSettings.getInt("GroupLed", -16776961) : notificationsSettings.getInt("MessagesLed", -16776961);
        } else if (i == 1) {
            iM = notificationsSettings.getInt("MessagesLed", -16776961);
        } else if (i == 0) {
            iM = notificationsSettings.getInt("GroupLed", -16776961);
        } else if (i == 3) {
            iM = notificationsSettings.getInt("StoriesLed", -16776961);
        } else {
            iM = (i == 5 || i == 4) ? notificationsSettings.getInt("ReactionsLed", -16776961) : notificationsSettings.getInt("ChannelLed", -16776961);
        }
        LinearLayout linearLayoutM = FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline0.m(activity, 1);
        String[] strArr = {LocaleController.getString(R.string.ColorRed), LocaleController.getString(R.string.ColorOrange), LocaleController.getString(R.string.ColorYellow), LocaleController.getString(R.string.ColorGreen), LocaleController.getString(R.string.ColorCyan), LocaleController.getString(R.string.ColorBlue), LocaleController.getString(R.string.ColorViolet), LocaleController.getString(R.string.ColorPink), LocaleController.getString(R.string.ColorWhite)};
        final int[] iArr = {iM};
        for (int i2 = 0; i2 < 9; i2++) {
            RadioColorCell radioColorCell = new RadioColorCell(activity, resourcesProvider);
            radioColorCell.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            radioColorCell.setTag(Integer.valueOf(i2));
            int i3 = TextColorCell.colors[i2];
            radioColorCell.setCheckColor(i3, i3);
            radioColorCell.setTextAndValue(strArr[i2], iM == TextColorCell.colorsToSave[i2]);
            linearLayoutM.addView(radioColorCell);
            radioColorCell.setOnClickListener(new AlertsCreator$$ExternalSyntheticLambda148(linearLayoutM, iArr));
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(activity, 0, resourcesProvider);
        String string = LocaleController.getString(R.string.LedColor);
        AlertDialog alertDialog = builder.alertDialog;
        alertDialog.title = string;
        builder.setView(linearLayoutM);
        builder.setPositiveButton(LocaleController.getString(R.string.Set), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog2, int i4) {
                SharedPreferences.Editor editorEdit = MessagesController.getNotificationsSettings(UserConfig.selectedAccount).edit();
                long j3 = j;
                int[] iArr2 = iArr;
                if (j3 != 0) {
                    editorEdit.putInt(zzil.m("color_", sharedPrefKey), iArr2[0]);
                    NotificationsController.getInstance(UserConfig.selectedAccount).deleteNotificationChannel(j3, j2);
                } else {
                    int i5 = i;
                    if (i5 == 1) {
                        editorEdit.putInt("MessagesLed", iArr2[0]);
                    } else if (i5 == 0) {
                        editorEdit.putInt("GroupLed", iArr2[0]);
                    } else if (i5 == 3) {
                        editorEdit.putInt("StoriesLed", iArr2[0]);
                    } else if (i5 == 5 || i5 == 4) {
                        editorEdit.putInt("ReactionLed", iArr2[0]);
                    } else {
                        editorEdit.putInt("ChannelLed", iArr2[0]);
                    }
                    NotificationsController.getInstance(UserConfig.selectedAccount).deleteNotificationChannelGlobal(i5);
                }
                editorEdit.commit();
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        });
        builder.setNeutralButton(LocaleController.getString(R.string.LedDisabled), new VoIPService$$ExternalSyntheticLambda80(runnable, i, j, 3));
        if (j != 0) {
            builder.setNegativeButton(LocaleController.getString(R.string.Default), new ChatActivity$$ExternalSyntheticLambda189(sharedPrefKey, 16, runnable));
        }
        return alertDialog;
    }

    public static void createContactInviteDialog(BaseFragment baseFragment, String str, String str2, String str3) {
        AlertDialog.Builder builder = new AlertDialog.Builder(baseFragment.getParentActivity(), 0, null);
        String string = LocaleController.getString(R.string.ContactNotRegisteredTitle);
        AlertDialog alertDialog = builder.alertDialog;
        alertDialog.title = string;
        alertDialog.message = LocaleController.formatString("ContactNotRegistered", R.string.ContactNotRegistered, ContactsController.formatName(str, str2));
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        builder.setPositiveButton(LocaleController.getString(R.string.Invite), new ChatActivity$$ExternalSyntheticLambda189(str3, 18, baseFragment));
        baseFragment.showDialog(alertDialog);
    }

    public static AlertDialog.Builder createContactsPermissionDialog(Activity activity, final MessagesStorage.IntCallback intCallback) {
        AlertDialog.Builder builder = new AlertDialog.Builder(activity, 0, null);
        builder.setTopAnimation(R.raw.permission_request_contacts, 72, Theme.getColor(null, Theme.key_dialogTopBackground, false), null);
        builder.alertDialog.message = AndroidUtilities.replaceTags(LocaleController.getString(R.string.ContactsPermissionAlert));
        final int i = 0;
        builder.setPositiveButton(LocaleController.getString(R.string.ContactsPermissionAlertContinue), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i2) {
                switch (i) {
                    case 0:
                        intCallback.run(1);
                        break;
                    default:
                        intCallback.run(0);
                        break;
                }
            }
        });
        final int i2 = 1;
        builder.setNegativeButton(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i3) {
                switch (i2) {
                    case 0:
                        intCallback.run(1);
                        break;
                    default:
                        intCallback.run(0);
                        break;
                }
            }
        });
        return builder;
    }

    public static AlertDialog.Builder createDatePickerDialog(Context context, int i, int i2, int i3, int i4, int i5, int i6, String str, final boolean z, PassportActivity$$ExternalSyntheticLambda52 passportActivity$$ExternalSyntheticLambda52) {
        if (context == null) {
            return null;
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        final NumberPicker numberPicker = new NumberPicker(context, 18, null);
        final NumberPicker numberPicker2 = new NumberPicker(context, 18, null);
        final NumberPicker numberPicker3 = new NumberPicker(context, 18, null);
        linearLayout.addView(numberPicker2, LayoutHelper.createLinear(0.3f, 0, -2));
        final int i7 = 0;
        numberPicker2.setOnScrollListener(new NumberPicker.OnScrollListener() {
            @Override
            public final void onScrollStateChange(int i8) {
                switch (i7) {
                    case 0:
                        if (z && i8 == 0) {
                            AlertsCreator.checkPickerDate(numberPicker2, numberPicker, numberPicker3);
                            break;
                        }
                        break;
                    case 1:
                        if (z && i8 == 0) {
                            AlertsCreator.checkPickerDate(numberPicker2, numberPicker, numberPicker3);
                            break;
                        }
                        break;
                    default:
                        if (z && i8 == 0) {
                            AlertsCreator.checkPickerDate(numberPicker2, numberPicker, numberPicker3);
                            break;
                        }
                        break;
                }
            }
        });
        numberPicker.setMinValue(0);
        numberPicker.setMaxValue(11);
        linearLayout.addView(numberPicker, LayoutHelper.createLinear(0.3f, 0, -2));
        numberPicker.setFormatter(new EmojiView$$ExternalSyntheticLambda21(5));
        numberPicker.setOnValueChangedListener(new AlertsCreator$$ExternalSyntheticLambda95(numberPicker2, numberPicker, numberPicker3, 1));
        final int i8 = 1;
        numberPicker.setOnScrollListener(new NumberPicker.OnScrollListener() {
            @Override
            public final void onScrollStateChange(int i9) {
                switch (i8) {
                    case 0:
                        if (z && i9 == 0) {
                            AlertsCreator.checkPickerDate(numberPicker2, numberPicker, numberPicker3);
                            break;
                        }
                        break;
                    case 1:
                        if (z && i9 == 0) {
                            AlertsCreator.checkPickerDate(numberPicker2, numberPicker, numberPicker3);
                            break;
                        }
                        break;
                    default:
                        if (z && i9 == 0) {
                            AlertsCreator.checkPickerDate(numberPicker2, numberPicker, numberPicker3);
                            break;
                        }
                        break;
                }
            }
        });
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i9 = calendar.get(1);
        numberPicker3.setMinValue(i + i9);
        numberPicker3.setMaxValue(i9 + i2);
        numberPicker3.setValue(i9 + i3);
        linearLayout.addView(numberPicker3, LayoutHelper.createLinear(0.4f, 0, -2));
        numberPicker3.setOnValueChangedListener(new AlertsCreator$$ExternalSyntheticLambda95(numberPicker2, numberPicker, numberPicker3, 2));
        final int i10 = 2;
        numberPicker3.setOnScrollListener(new NumberPicker.OnScrollListener() {
            @Override
            public final void onScrollStateChange(int i11) {
                switch (i10) {
                    case 0:
                        if (z && i11 == 0) {
                            AlertsCreator.checkPickerDate(numberPicker2, numberPicker, numberPicker3);
                            break;
                        }
                        break;
                    case 1:
                        if (z && i11 == 0) {
                            AlertsCreator.checkPickerDate(numberPicker2, numberPicker, numberPicker3);
                            break;
                        }
                        break;
                    default:
                        if (z && i11 == 0) {
                            AlertsCreator.checkPickerDate(numberPicker2, numberPicker, numberPicker3);
                            break;
                        }
                        break;
                }
            }
        });
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(2, numberPicker.getValue());
        calendar2.set(1, numberPicker3.getValue());
        numberPicker2.setMinValue(1);
        numberPicker2.setMaxValue(calendar2.getActualMaximum(5));
        if (z) {
            checkPickerDate(numberPicker2, numberPicker, numberPicker3);
        }
        if (i4 != -1) {
            numberPicker2.setValue(i4);
            numberPicker.setValue(i5);
            numberPicker3.setValue(i6);
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(context, 0, null);
        builder.alertDialog.title = str;
        builder.setView(linearLayout);
        builder.setPositiveButton(LocaleController.getString(R.string.Set), new SendMessagesHelper$$ExternalSyntheticLambda56(z, numberPicker2, numberPicker, numberPicker3, passportActivity$$ExternalSyntheticLambda52));
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        return builder;
    }

    public static void createDeleteMessagesAlert(final BaseFragment baseFragment, final TLRPC.User user, final TLRPC.Chat chat, final TLRPC.EncryptedChat encryptedChat, final TLRPC.ChatFull chatFull, final long j, final MessageObject messageObject, final SparseArray[] sparseArrayArr, final MessageObject.GroupedMessages groupedMessages, final int i, final int i2, TLRPC.ChannelParticipant[] channelParticipantArr, final Runnable runnable, final ChatActivity$$ExternalSyntheticLambda5 chatActivity$$ExternalSyntheticLambda5, final Theme.ResourcesProvider resourcesProvider) {
        Activity parentActivity;
        int i3;
        long jMakeEncryptedDialogId;
        AlertDialog alertDialog;
        boolean z;
        boolean z2;
        boolean z3;
        int i4;
        int i5;
        int i6;
        MessageObject messageObject2;
        long j2;
        AlertDialog alertDialog2;
        int i7;
        boolean z4;
        boolean z5;
        boolean z6;
        TLRPC.MessageAction messageAction;
        AlertDialog alertDialog3;
        int i8;
        String str;
        boolean z7;
        AlertDialog.Builder builder;
        TLRPC.MessageAction messageAction2;
        int i9;
        final int i10;
        TLRPC.Message message;
        MessageObject messageObject3 = messageObject;
        boolean z8 = i2 == 1;
        boolean z9 = i2 == 3;
        if (baseFragment != null) {
            if ((user == null && chat == null && encryptedChat == null) || (parentActivity = baseFragment.getParentActivity()) == null) {
                return;
            }
            int currentAccount = baseFragment.getCurrentAccount();
            AlertDialog.Builder builder2 = new AlertDialog.Builder(parentActivity, 0, resourcesProvider);
            float f = chatActivity$$ExternalSyntheticLambda5 != null ? 0.5f : 0.6f;
            AlertDialog alertDialog4 = builder2.alertDialog;
            alertDialog4.dimAlpha = f;
            int size = groupedMessages != null ? groupedMessages.messages.size() : messageObject3 != null ? 1 : sparseArrayArr[1].size() + sparseArrayArr[0].size();
            if (encryptedChat != null) {
                i3 = currentAccount;
                jMakeEncryptedDialogId = DialogObject.makeEncryptedDialogId(encryptedChat.id);
            } else {
                i3 = currentAccount;
                jMakeEncryptedDialogId = user != null ? user.id : -chat.id;
            }
            if (z8) {
                if (messageObject3 == null || (message = messageObject3.messageOwner) == null) {
                    alertDialog = alertDialog4;
                } else {
                    alertDialog = alertDialog4;
                    int i11 = message.schedule_repeat_period;
                    if (i11 > 0) {
                        i9 = message.date;
                        i10 = i11;
                    }
                    if (i9 <= 0 && i10 > 0) {
                        String string = LocaleController.formatString(R.string.MessageScheduledRepeatDeletePostponeSeconds, Integer.valueOf(i10));
                        if (i10 == 31536000) {
                            string = LocaleController.getString(R.string.MessageScheduledRepeatDeletePostponeYear);
                        } else if (i10 >= 2592000) {
                            string = LocaleController.formatPluralString("MessageScheduledRepeatDeletePostponeMonths", i10 / 2592000, new Object[0]);
                        } else if (i10 >= 604800) {
                            string = LocaleController.formatPluralString("MessageScheduledRepeatDeletePostponeWeeks", i10 / 604800, new Object[0]);
                        } else if (i10 >= 86400) {
                            string = LocaleController.formatPluralString("MessageScheduledRepeatDeletePostponeDays", i10 / 86400, new Object[0]);
                        }
                        String str2 = string;
                        AlertDialog.Builder builder3 = new AlertDialog.Builder(parentActivity, 0, resourcesProvider);
                        String string2 = LocaleController.getString(R.string.MessageScheduledRepeatDeleteTitle);
                        AlertDialog alertDialog5 = builder3.alertDialog;
                        alertDialog5.title = string2;
                        alertDialog5.message = LocaleController.getString(R.string.MessageScheduledRepeatDeleteText);
                        final int i12 = i9;
                        final int i13 = i3;
                        builder3.setNegativeButton(str2, new AlertDialog.OnButtonClickListener() {
                            @Override
                            public final void onClick(AlertDialog alertDialog6, int i14) {
                                MessageObject.GroupedMessages groupedMessages2 = groupedMessages;
                                int i15 = i13;
                                BaseFragment baseFragment2 = baseFragment;
                                int i16 = i12;
                                int i17 = i10;
                                if (groupedMessages2 != null && !groupedMessages2.messages.isEmpty()) {
                                    SendMessagesHelper.getInstance(i15).editMessage(groupedMessages2.messages.get(0), null, false, baseFragment2, null, i16 + i17, i17);
                                } else {
                                    SendMessagesHelper.getInstance(i15).editMessage(messageObject, null, false, baseFragment2, null, i16 + i17, i17);
                                }
                            }
                        });
                        final boolean z10 = z9;
                        final long j3 = jMakeEncryptedDialogId;
                        builder3.setNeutralButton(LocaleController.getString(R.string.MessageScheduledRepeatDeleteAll), new AlertDialog.OnButtonClickListener() {
                            @Override
                            public final void onClick(AlertDialog alertDialog6, int i14) {
                                SparseArray[] sparseArrayArr2;
                                ArrayList<Long> arrayList;
                                int i15;
                                long j4;
                                ArrayList<Long> arrayList2;
                                long j5;
                                TLRPC.Peer peer;
                                ArrayList<Integer> arrayList3;
                                boolean z11 = z10;
                                int i16 = i13;
                                long clientUserId = z11 ? UserConfig.getInstance(i16).getClientUserId() : j3;
                                MessageObject messageObject4 = messageObject;
                                TLRPC.EncryptedChat encryptedChat2 = encryptedChat;
                                long j6 = j;
                                int i17 = i;
                                int i18 = i2;
                                ArrayList<Long> arrayList4 = null;
                                if (messageObject4 != null) {
                                    ArrayList<Integer> arrayList5 = new ArrayList<>();
                                    MessageObject.GroupedMessages groupedMessages2 = groupedMessages;
                                    if (groupedMessages2 != null) {
                                        int i19 = 0;
                                        while (i19 < groupedMessages2.messages.size()) {
                                            MessageObject messageObject5 = groupedMessages2.messages.get(i19);
                                            arrayList5.add(Integer.valueOf(messageObject5.getId()));
                                            if (encryptedChat2 != null) {
                                                arrayList3 = arrayList5;
                                                if (messageObject5.messageOwner.random_id != 0 && messageObject5.type != 10) {
                                                    if (arrayList4 == null) {
                                                        arrayList4 = new ArrayList<>();
                                                    }
                                                    ArrayList<Long> arrayList6 = arrayList4;
                                                    arrayList6.add(Long.valueOf(messageObject5.messageOwner.random_id));
                                                    arrayList4 = arrayList6;
                                                }
                                            } else {
                                                arrayList3 = arrayList5;
                                            }
                                            i19++;
                                            arrayList5 = arrayList3;
                                            i16 = i16;
                                            clientUserId = clientUserId;
                                        }
                                        i15 = i16;
                                        j4 = clientUserId;
                                    } else {
                                        i15 = i16;
                                        j4 = clientUserId;
                                        arrayList5.add(Integer.valueOf(messageObject4.getId()));
                                        if (encryptedChat2 != null && messageObject4.messageOwner.random_id != 0 && messageObject4.type != 10) {
                                            ArrayList<Long> arrayList7 = new ArrayList<>();
                                            arrayList7.add(Long.valueOf(messageObject4.messageOwner.random_id));
                                            arrayList2 = arrayList7;
                                        }
                                        if (j6 == 0 && (peer = messageObject4.messageOwner.peer_id) != null && peer.chat_id == (-j6)) {
                                            j5 = j6;
                                        } else {
                                            j5 = j4;
                                        }
                                        MessagesController.getInstance(i15).deleteMessages(arrayList5, arrayList2, encryptedChat2, j5, i17, true, i18);
                                    }
                                    arrayList2 = arrayList4;
                                    if (j6 == 0) {
                                        j5 = j4;
                                    } else {
                                        j5 = j4;
                                    }
                                    MessagesController.getInstance(i15).deleteMessages(arrayList5, arrayList2, encryptedChat2, j5, i17, true, i18);
                                } else {
                                    long j7 = clientUserId;
                                    int i20 = 1;
                                    while (i20 >= 0) {
                                        ArrayList<Integer> arrayList8 = new ArrayList<>();
                                        int i21 = 0;
                                        while (true) {
                                            sparseArrayArr2 = sparseArrayArr;
                                            if (i21 >= sparseArrayArr2[i20].size()) {
                                                break;
                                            }
                                            arrayList8.add(Integer.valueOf(sparseArrayArr2[i20].keyAt(i21)));
                                            i21++;
                                        }
                                        if (encryptedChat2 != null) {
                                            ArrayList<Long> arrayList9 = new ArrayList<>();
                                            for (int i22 = 0; i22 < sparseArrayArr2[i20].size(); i22++) {
                                                MessageObject messageObject6 = (MessageObject) sparseArrayArr2[i20].valueAt(i22);
                                                long j8 = messageObject6.messageOwner.random_id;
                                                if (j8 != 0 && messageObject6.type != 10) {
                                                    arrayList9.add(Long.valueOf(j8));
                                                }
                                            }
                                            arrayList = arrayList9;
                                        } else {
                                            arrayList = null;
                                        }
                                        MessagesController.getInstance(i16).deleteMessages(arrayList8, arrayList, encryptedChat2, (i20 != 1 || j6 == 0) ? j7 : j6, i17, true, i18);
                                        sparseArrayArr2[i20].clear();
                                        i20--;
                                    }
                                }
                                Runnable runnable2 = runnable;
                                if (runnable2 != null) {
                                    runnable2.run();
                                }
                            }
                        });
                        builder3.setPositiveButton(LocaleController.getString(R.string.Cancel), null);
                        builder3.makeRed(-2);
                        builder3.makeRed(-3);
                        final int i14 = 2;
                        alertDialog5.onDismissListener = new DialogInterface.OnDismissListener() {
                            @Override
                            public final void onDismiss(DialogInterface dialogInterface) throws Throwable {
                                switch (i14) {
                                    case 0:
                                        chatActivity$$ExternalSyntheticLambda5.run();
                                        break;
                                    case 1:
                                        ChatActivity$$ExternalSyntheticLambda5 chatActivity$$ExternalSyntheticLambda6 = chatActivity$$ExternalSyntheticLambda5;
                                        if (chatActivity$$ExternalSyntheticLambda6 != null) {
                                            chatActivity$$ExternalSyntheticLambda6.run();
                                        }
                                        break;
                                    default:
                                        ChatActivity$$ExternalSyntheticLambda5 chatActivity$$ExternalSyntheticLambda7 = chatActivity$$ExternalSyntheticLambda5;
                                        if (chatActivity$$ExternalSyntheticLambda7 != null) {
                                            chatActivity$$ExternalSyntheticLambda7.run();
                                        }
                                        break;
                                }
                            }
                        };
                        builder3.show();
                        return;
                    }
                    messageObject3 = messageObject;
                }
                if (groupedMessages == null || groupedMessages.messages.isEmpty() || groupedMessages.messages.get(0) == null || groupedMessages.messages.get(0).messageOwner == null || groupedMessages.messages.get(0).messageOwner.schedule_repeat_period <= 0) {
                    i9 = 0;
                    i10 = 0;
                } else {
                    int i15 = groupedMessages.messages.get(0).messageOwner.date;
                    i10 = groupedMessages.messages.get(0).messageOwner.schedule_repeat_period;
                    i9 = i15;
                }
                if (i9 <= 0) {
                }
                messageObject3 = messageObject;
            } else {
                alertDialog = alertDialog4;
            }
            final int i16 = i3;
            final long j4 = jMakeEncryptedDialogId;
            final boolean z11 = z9;
            int currentTime = ConnectionsManager.getInstance(i16).getCurrentTime();
            MessagesController.getInstance(i16).config.starsSuggestedPostAgeMin.get(TimeUnit.SECONDS);
            if (messageObject3 != null) {
                z3 = !messageObject3.isDice() || Math.abs(currentTime - messageObject3.messageOwner.date) > 86400;
                if (messageObject3.isPaidSuggestedPostProtected()) {
                    TLRPC.Message message2 = messageObject3.messageOwner;
                    z = message2.paid_suggested_post_stars;
                    z2 = message2.paid_suggested_post_ton;
                } else {
                    z = false;
                    z2 = false;
                }
            } else {
                int i17 = 0;
                boolean z12 = false;
                boolean z13 = false;
                boolean z14 = false;
                for (int i18 = 2; i17 < i18; i18 = 2) {
                    int i19 = 0;
                    while (i19 < sparseArrayArr[i17].size()) {
                        MessageObject messageObject4 = (MessageObject) sparseArrayArr[i17].valueAt(i19);
                        if (messageObject4.isDice()) {
                            i4 = i17;
                            i5 = i19;
                            if (Math.abs(currentTime - messageObject4.messageOwner.date) > 86400) {
                            }
                            if (messageObject4.isPaidSuggestedPostProtected()) {
                                TLRPC.Message message3 = messageObject4.messageOwner;
                                z13 |= message3.paid_suggested_post_stars;
                                z12 |= message3.paid_suggested_post_ton;
                            }
                            i19 = i5 + 1;
                            i17 = i4;
                        } else {
                            i4 = i17;
                            i5 = i19;
                        }
                        z14 = true;
                        if (messageObject4.isPaidSuggestedPostProtected()) {
                            TLRPC.Message message4 = messageObject4.messageOwner;
                            z13 |= message4.paid_suggested_post_stars;
                            z12 |= message4.paid_suggested_post_ton;
                        }
                        i19 = i5 + 1;
                        i17 = i4;
                    }
                    i17++;
                }
                z = z13;
                z2 = z12;
                z3 = z14;
            }
            if (groupedMessages != null) {
                for (int i20 = 0; i20 < groupedMessages.messages.size(); i20++) {
                    MessageObject messageObject5 = groupedMessages.messages.get(i20);
                    if (messageObject5.isPaidSuggestedPostProtected()) {
                        TLRPC.Message message5 = messageObject5.messageOwner;
                        boolean z15 = message5.paid_suggested_post_stars | z;
                        z2 = message5.paid_suggested_post_ton | z2;
                        z = z15;
                    }
                }
            }
            boolean z16 = z;
            boolean z17 = z3;
            boolean z18 = z2;
            final boolean[] zArr = new boolean[1];
            boolean z19 = user != null && MessagesController.getInstance(i16).canRevokePmInbox;
            int i21 = user != null ? MessagesController.getInstance(i16).revokeTimePmLimit : MessagesController.getInstance(i16).revokeTimeLimit;
            boolean z20 = encryptedChat == null && user != null && z19 && i21 == Integer.MAX_VALUE;
            if (chat == null || !chat.megagroup || z8 || z11) {
                i6 = i16;
                messageObject2 = messageObject3;
                j2 = 1000;
                if (z8 || z11 || ChatObject.isChannel(chat) || encryptedChat != null) {
                    alertDialog2 = alertDialog;
                    i7 = 0;
                    z4 = false;
                    z5 = false;
                } else {
                    if ((user == null || user.id == UserConfig.getInstance(i6).getClientUserId() || (user.bot && !user.support)) && chat == null) {
                        i7 = 0;
                        z6 = false;
                    } else if (messageObject2 != null) {
                        int i22 = (messageObject2.isSendError() || !((messageAction = messageObject2.messageOwner.action) == null || (messageAction instanceof TLRPC.TL_messageActionEmpty) || (messageAction instanceof TLRPC.TL_messageActionPhoneCall) || (messageAction instanceof TLRPC.TL_messageActionPinMessage) || (messageAction instanceof TLRPC.TL_messageActionGeoProximityReached) || (messageAction instanceof TLRPC.TL_messageActionSetChatTheme)) || (!(messageObject2.isOut() || z19 || ChatObject.hasAdminRights(chat)) || currentTime - messageObject2.messageOwner.date > i21)) ? 0 : 1;
                        z6 = !messageObject2.isOut();
                        i7 = i22;
                    } else {
                        int i23 = 0;
                        boolean z21 = false;
                        for (int i24 = 1; i24 >= 0; i24--) {
                            int i25 = 0;
                            while (i25 < sparseArrayArr[i24].size()) {
                                MessageObject messageObject6 = (MessageObject) sparseArrayArr[i24].valueAt(i25);
                                TLRPC.MessageAction messageAction3 = messageObject6.messageOwner.action;
                                boolean z22 = z19;
                                if ((messageAction3 == null || (messageAction3 instanceof TLRPC.TL_messageActionEmpty) || (messageAction3 instanceof TLRPC.TL_messageActionPhoneCall) || (messageAction3 instanceof TLRPC.TL_messageActionPinMessage) || (messageAction3 instanceof TLRPC.TL_messageActionGeoProximityReached)) && ((messageObject6.isOut() || z22 || (chat != null && ChatObject.canBlockUsers(chat))) && currentTime - messageObject6.messageOwner.date <= i21)) {
                                    i23++;
                                    if (!z21 && !messageObject6.isOut()) {
                                        z21 = true;
                                    }
                                }
                                i25++;
                                z19 = z22;
                            }
                        }
                        i7 = i23;
                        z6 = z21;
                    }
                    if (i7 <= 0 || !z17 || (user != null && UserObject.isDeleted(user))) {
                        alertDialog2 = alertDialog;
                        z5 = z6;
                        z4 = false;
                    } else {
                        FrameLayout frameLayout = new FrameLayout(parentActivity);
                        AlertDialog alertDialog6 = alertDialog;
                        CheckBoxCell checkBoxCell = new CheckBoxCell(parentActivity, 1, 17, false, resourcesProvider);
                        checkBoxCell.setBackgroundDrawable(Theme.getSelectorDrawable(false));
                        if (z20) {
                            checkBoxCell.setText(LocaleController.formatString("DeleteMessagesOptionAlso", R.string.DeleteMessagesOptionAlso, UserObject.getFirstName(user)), "", false, false, false);
                        } else {
                            if (chat == null || !(z6 || i7 == size)) {
                                checkBoxCell.setText(LocaleController.getString(R.string.DeleteMessagesOption), "", false, false, false);
                            } else {
                                checkBoxCell.setText(LocaleController.getString(R.string.DeleteForAll), "", false, false, false);
                            }
                            checkBoxCell = checkBoxCell;
                        }
                        checkBoxCell.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), 0);
                        frameLayout.addView(checkBoxCell, LayoutHelper.createFrame(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                        checkBoxCell.setOnClickListener(new ChatActivity$$ExternalSyntheticLambda342(5, zArr));
                        builder2.setView(frameLayout);
                        alertDialog6.customViewOffset = 9;
                        alertDialog2 = alertDialog6;
                        z5 = z6;
                        z4 = true;
                    }
                }
            } else {
                ArrayList arrayList = new ArrayList();
                if (messageObject3 != null) {
                    TLRPC.MessageAction messageAction4 = messageObject3.messageOwner.action;
                    if (messageAction4 == null || (messageAction4 instanceof TLRPC.TL_messageActionEmpty) || (messageAction4 instanceof TLRPC.TL_messageActionChatDeleteUser) || (messageAction4 instanceof TLRPC.TL_messageActionChatJoinedByLink) || (messageAction4 instanceof TLRPC.TL_messageActionChatAddUser)) {
                        if (groupedMessages != null) {
                            arrayList.addAll(groupedMessages.messages);
                        } else {
                            arrayList.add(messageObject3);
                        }
                    }
                    i7 = (!messageObject3.isSendError() && messageObject3.getDialogId() == j && ((messageAction2 = messageObject3.messageOwner.action) == null || (messageAction2 instanceof TLRPC.TL_messageActionEmpty)) && messageObject3.isOut() && currentTime - messageObject3.messageOwner.date <= i21) ? 1 : 0;
                } else {
                    i7 = 0;
                    for (int i26 = 1; i26 >= 0; i26--) {
                        for (int i27 = 0; i27 < sparseArrayArr[i26].size(); i27++) {
                            MessageObject messageObject7 = (MessageObject) sparseArrayArr[i26].valueAt(i27);
                            if (i26 == 1 && messageObject7.isOut()) {
                                TLRPC.Message message6 = messageObject7.messageOwner;
                                if (message6.action == null && currentTime - message6.date <= i21) {
                                    i7++;
                                }
                            }
                            arrayList.add(messageObject7);
                        }
                    }
                }
                ArrayList arrayList2 = (ArrayList) Collection.EL.stream(arrayList).filter(new GiftSheet$$ExternalSyntheticLambda20(2)).mapToLong(new StatisticActivity$$ExternalSyntheticLambda4(1)).distinct().mapToObj(new LongFunction() {
                    @Override
                    public final Object apply(long j5) {
                        int i28 = i16;
                        return j5 > 0 ? MessagesController.getInstance(i28).getUser(Long.valueOf(j5)) : MessagesController.getInstance(i28).getChat(Long.valueOf(-j5));
                    }
                }).filter(new GiftSheet$$ExternalSyntheticLambda20(3)).filter(new CallLogActivity$$ExternalSyntheticLambda27(UserConfig.getInstance(i16).getClientUserId(), 2)).collect(Collectors.toCollection(new ChatActivity$$ExternalSyntheticLambda264()));
                if (!arrayList2.isEmpty()) {
                    if (channelParticipantArr != null) {
                        DeleteMessagesBottomSheet deleteMessagesBottomSheet = new DeleteMessagesBottomSheet(baseFragment, chat, arrayList, arrayList2, channelParticipantArr, j, i, i2, false, runnable);
                        if (chatActivity$$ExternalSyntheticLambda5 != null) {
                            final int i28 = 0;
                            deleteMessagesBottomSheet.setOnHideListener(new DialogInterface.OnDismissListener() {
                                @Override
                                public final void onDismiss(DialogInterface dialogInterface) throws Throwable {
                                    switch (i28) {
                                        case 0:
                                            chatActivity$$ExternalSyntheticLambda5.run();
                                            break;
                                        case 1:
                                            ChatActivity$$ExternalSyntheticLambda5 chatActivity$$ExternalSyntheticLambda6 = chatActivity$$ExternalSyntheticLambda5;
                                            if (chatActivity$$ExternalSyntheticLambda6 != null) {
                                                chatActivity$$ExternalSyntheticLambda6.run();
                                            }
                                            break;
                                        default:
                                            ChatActivity$$ExternalSyntheticLambda5 chatActivity$$ExternalSyntheticLambda7 = chatActivity$$ExternalSyntheticLambda5;
                                            if (chatActivity$$ExternalSyntheticLambda7 != null) {
                                                chatActivity$$ExternalSyntheticLambda7.run();
                                            }
                                            break;
                                    }
                                }
                            });
                        }
                        deleteMessagesBottomSheet.show();
                        return;
                    }
                    final AlertDialog[] alertDialogArr = {new AlertDialog(parentActivity, 3, null)};
                    final int size2 = arrayList2.size();
                    final TLRPC.ChannelParticipant[] channelParticipantArr2 = new TLRPC.ChannelParticipant[size2];
                    final int[] iArr = new int[size2];
                    int[] iArr2 = new int[1];
                    int i29 = 0;
                    while (i29 < size2) {
                        TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                        tL_channels_getParticipant.channel = MessagesController.getInputChannel(chat);
                        tL_channels_getParticipant.participant = MessagesController.getInputPeer((TLObject) arrayList2.get(i29));
                        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i16);
                        ArrayList arrayList3 = arrayList2;
                        final int[] iArr3 = iArr2;
                        int i30 = i16;
                        final int i31 = i29;
                        final ChatActivity$$ExternalSyntheticLambda5 chatActivity$$ExternalSyntheticLambda6 = chatActivity$$ExternalSyntheticLambda5;
                        iArr[i31] = connectionsManager.sendRequest(tL_channels_getParticipant, new RequestDelegate() {
                            @Override
                            public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                                final int[] iArr4 = iArr3;
                                final int[] iArr5 = iArr;
                                final TLRPC.ChannelParticipant[] channelParticipantArr3 = channelParticipantArr2;
                                final AlertDialog[] alertDialogArr2 = alertDialogArr;
                                final BaseFragment baseFragment2 = baseFragment;
                                final Runnable runnable2 = runnable;
                                final ChatActivity$$ExternalSyntheticLambda5 chatActivity$$ExternalSyntheticLambda7 = chatActivity$$ExternalSyntheticLambda6;
                                final Theme.ResourcesProvider resourcesProvider2 = resourcesProvider;
                                final int i32 = i31;
                                final int i33 = size2;
                                final TLRPC.User user2 = user;
                                final TLRPC.Chat chat2 = chat;
                                final TLRPC.EncryptedChat encryptedChat2 = encryptedChat;
                                final TLRPC.ChatFull chatFull2 = chatFull;
                                final long j5 = j;
                                final MessageObject messageObject8 = messageObject;
                                final SparseArray[] sparseArrayArr2 = sparseArrayArr;
                                final MessageObject.GroupedMessages groupedMessages2 = groupedMessages;
                                final int i34 = i;
                                final int i35 = i2;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        AlertDialog[] alertDialogArr3 = alertDialogArr2;
                                        int[] iArr6 = iArr4;
                                        iArr6[0] = iArr6[0] + 1;
                                        int[] iArr7 = iArr5;
                                        int i36 = i32;
                                        iArr7[i36] = 0;
                                        TLRPC.ChannelParticipant[] channelParticipantArr4 = channelParticipantArr3;
                                        TLObject tLObject2 = tLObject;
                                        if (tLObject2 != null) {
                                            channelParticipantArr4[i36] = ((TLRPC.TL_channels_channelParticipant) tLObject2).participant;
                                        }
                                        if (iArr6[0] == i33) {
                                            try {
                                                alertDialogArr3[0].dismiss();
                                            } catch (Throwable unused) {
                                            }
                                            alertDialogArr3[0] = null;
                                            AlertsCreator.createDeleteMessagesAlert(baseFragment2, user2, chat2, encryptedChat2, chatFull2, j5, messageObject8, sparseArrayArr2, groupedMessages2, i34, i35, channelParticipantArr4, runnable2, chatActivity$$ExternalSyntheticLambda7, resourcesProvider2);
                                        }
                                    }
                                });
                            }
                        });
                        i29 = i31 + 1;
                        chatActivity$$ExternalSyntheticLambda5 = chatActivity$$ExternalSyntheticLambda5;
                        iArr2 = iArr3;
                        i16 = i30;
                        arrayList2 = arrayList3;
                    }
                    AndroidUtilities.runOnUIThread(new WearAuthSheet$$ExternalSyntheticLambda3(alertDialogArr, iArr, i16, chatActivity$$ExternalSyntheticLambda5, baseFragment), 1000L);
                    return;
                }
                i6 = i16;
                j2 = 1000;
                z4 = true;
                if (i7 <= 0 || !z17) {
                    alertDialog2 = alertDialog;
                    z4 = false;
                } else {
                    FrameLayout frameLayout2 = new FrameLayout(parentActivity);
                    AlertDialog alertDialog7 = alertDialog;
                    CheckBoxCell checkBoxCell2 = new CheckBoxCell(parentActivity, 1, 17, false, resourcesProvider);
                    checkBoxCell2.setBackgroundDrawable(Theme.getSelectorDrawable(false));
                    checkBoxCell2.setText(LocaleController.getString(R.string.DeleteMessagesOption), "", false, false, false);
                    checkBoxCell2.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), 0);
                    frameLayout2.addView(checkBoxCell2, LayoutHelper.createFrame(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                    checkBoxCell2.setOnClickListener(new ChatActivity$$ExternalSyntheticLambda342(4, zArr));
                    builder2.setView(frameLayout2);
                    alertDialog7.customViewOffset = 9;
                    alertDialog2 = alertDialog7;
                }
                z5 = false;
                messageObject2 = messageObject;
            }
            int i32 = i7;
            final MessageObject messageObject8 = messageObject2;
            int i33 = size;
            final int i34 = i6;
            AlertDialog alertDialog8 = alertDialog2;
            final int i35 = 1;
            AlertDialog.OnButtonClickListener onButtonClickListener = new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog9, int i36) {
                    SparseArray[] sparseArrayArr2;
                    ArrayList<Long> arrayList4;
                    int i37;
                    long j5;
                    long j6;
                    TLRPC.Peer peer;
                    int i38;
                    long j7;
                    boolean z23 = z11;
                    int i39 = i34;
                    long clientUserId = z23 ? UserConfig.getInstance(i39).getClientUserId() : j4;
                    MessageObject messageObject9 = messageObject8;
                    TLRPC.EncryptedChat encryptedChat2 = encryptedChat;
                    long j8 = j;
                    int i40 = i;
                    boolean[] zArr2 = zArr;
                    int i41 = i2;
                    ArrayList<Long> arrayList5 = null;
                    if (messageObject9 != null) {
                        ArrayList arrayList6 = new ArrayList();
                        ArrayList<Integer> arrayList7 = new ArrayList<>();
                        MessageObject.GroupedMessages groupedMessages2 = groupedMessages;
                        if (groupedMessages2 != null) {
                            int i42 = 0;
                            while (i42 < groupedMessages2.messages.size()) {
                                MessageObject messageObject10 = groupedMessages2.messages.get(i42);
                                if (messageObject10.isEphemeral()) {
                                    arrayList6.add(messageObject10);
                                    i38 = i39;
                                } else {
                                    i38 = i39;
                                    arrayList7.add(Integer.valueOf(messageObject10.getId()));
                                    if (encryptedChat2 != null) {
                                        j7 = clientUserId;
                                        if (messageObject10.messageOwner.random_id != 0 && messageObject10.type != 10) {
                                            if (arrayList5 == null) {
                                                arrayList5 = new ArrayList<>();
                                            }
                                            ArrayList<Long> arrayList8 = arrayList5;
                                            arrayList8.add(Long.valueOf(messageObject10.messageOwner.random_id));
                                            arrayList5 = arrayList8;
                                        }
                                    }
                                    i42++;
                                    i39 = i38;
                                    clientUserId = j7;
                                }
                                j7 = clientUserId;
                                i42++;
                                i39 = i38;
                                clientUserId = j7;
                            }
                            i37 = i39;
                            j5 = clientUserId;
                        } else {
                            i37 = i39;
                            j5 = clientUserId;
                            if (messageObject9.isEphemeral()) {
                                arrayList6.add(messageObject9);
                            } else {
                                arrayList7.add(Integer.valueOf(messageObject9.getId()));
                                if (encryptedChat2 != null && messageObject9.messageOwner.random_id != 0 && messageObject9.type != 10) {
                                    ArrayList<Long> arrayList9 = new ArrayList<>();
                                    arrayList9.add(Long.valueOf(messageObject9.messageOwner.random_id));
                                    arrayList5 = arrayList9;
                                }
                            }
                        }
                        long j9 = (j8 == 0 || (peer = messageObject9.messageOwner.peer_id) == null || peer.chat_id != (-j8)) ? j5 : j8;
                        if (arrayList7.isEmpty()) {
                            j6 = j9;
                        } else {
                            j6 = j9;
                            MessagesController.getInstance(i37).deleteMessages(arrayList7, arrayList5, encryptedChat2, j6, i40, zArr2[0], i41);
                        }
                        int size3 = arrayList6.size();
                        int i43 = 0;
                        while (i43 < size3) {
                            Object obj = arrayList6.get(i43);
                            i43++;
                            MessagesController.getInstance(i37).deleteEphemeralMessage(j6, i40, (MessageObject) obj);
                        }
                    } else {
                        long j10 = clientUserId;
                        int i44 = 1;
                        while (i44 >= 0) {
                            ArrayList<Integer> arrayList10 = new ArrayList<>();
                            int i45 = 0;
                            while (true) {
                                sparseArrayArr2 = sparseArrayArr;
                                if (i45 >= sparseArrayArr2[i44].size()) {
                                    break;
                                }
                                arrayList10.add(Integer.valueOf(sparseArrayArr2[i44].keyAt(i45)));
                                i45++;
                            }
                            if (encryptedChat2 != null) {
                                ArrayList<Long> arrayList11 = new ArrayList<>();
                                int i46 = 0;
                                while (i46 < sparseArrayArr2[i44].size()) {
                                    MessageObject messageObject11 = (MessageObject) sparseArrayArr2[i44].valueAt(i46);
                                    int i47 = i44;
                                    long j11 = messageObject11.messageOwner.random_id;
                                    if (j11 != 0 && messageObject11.type != 10) {
                                        arrayList11.add(Long.valueOf(j11));
                                    }
                                    i46++;
                                    i44 = i47;
                                }
                                arrayList4 = arrayList11;
                            } else {
                                arrayList4 = null;
                            }
                            int i48 = i44;
                            MessagesController.getInstance(i39).deleteMessages(arrayList10, arrayList4, encryptedChat2, (i48 != 1 || j8 == 0) ? j10 : j8, i40, zArr2[0], i41);
                            sparseArrayArr2[i48].clear();
                            i44 = i48 - 1;
                        }
                    }
                    Runnable runnable2 = runnable;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                }
            };
            if (z11) {
                i8 = i33;
                if (i8 == 1) {
                    alertDialog3 = alertDialog8;
                    alertDialog3.title = LocaleController.getString(R.string.UnsaveSingleMessagesTitle);
                } else {
                    alertDialog3 = alertDialog8;
                    alertDialog3.title = LocaleController.formatString(R.string.UnsaveMessagesTitle, LocaleController.formatPluralString("messages", i8, new Object[0]));
                }
            } else {
                alertDialog3 = alertDialog8;
                i8 = i33;
                if (i8 == 1) {
                    alertDialog3.title = LocaleController.getString(R.string.DeleteSingleMessagesTitle);
                } else {
                    alertDialog3.title = LocaleController.formatString(R.string.DeleteMessagesTitle, LocaleController.formatPluralString("messages", i8, new Object[0]));
                }
            }
            if (z11) {
                if (i8 == 1) {
                    alertDialog3.message = LocaleController.getString(R.string.AreYouSureUnsaveSingleMessage);
                } else {
                    alertDialog3.message = LocaleController.getString(R.string.AreYouSureUnsaveFewMessages);
                }
            } else if (chat == null || !z5) {
                if (!z4 || z20 || i32 == i8) {
                    if (chat == null || !chat.megagroup || z8) {
                        if (i8 == 1) {
                            alertDialog3.message = LocaleController.getString(R.string.AreYouSureDeleteSingleMessage);
                        } else {
                            alertDialog3.message = LocaleController.getString(R.string.AreYouSureDeleteFewMessages);
                        }
                    } else if (i8 == 1) {
                        alertDialog3.message = LocaleController.getString((messageObject8 == null || !messageObject8.isEphemeral()) ? R.string.AreYouSureDeleteSingleMessageMega : R.string.AreYouSureDeleteSingleMessage);
                    } else {
                        alertDialog3.message = LocaleController.getString(R.string.AreYouSureDeleteFewMessagesMega);
                    }
                } else if (chat != null) {
                    alertDialog3.message = LocaleController.formatString("DeleteMessagesTextGroup", R.string.DeleteMessagesTextGroup, LocaleController.formatPluralString("messages", i32, new Object[0]));
                } else {
                    alertDialog3.message = AndroidUtilities.replaceTags(LocaleController.formatString("DeleteMessagesText", R.string.DeleteMessagesText, LocaleController.formatPluralString("messages", i32, new Object[0]), UserObject.getFirstName(user)));
                }
            } else if (z4 && i32 != i8) {
                alertDialog3.message = LocaleController.formatString(R.string.DeleteMessagesTextGroupPart, LocaleController.formatPluralString("messages", i32, new Object[0]));
            } else if (i8 == 1) {
                alertDialog3.message = LocaleController.getString(R.string.AreYouSureDeleteSingleMessage);
            } else {
                alertDialog3.message = LocaleController.getString(R.string.AreYouSureDeleteFewMessages);
            }
            if (messageObject8 != null) {
                z7 = messageObject8.isGiveaway() && !messageObject8.isForwarded();
                if (z7) {
                    long j5 = ((long) ((TLRPC.TL_messageMediaGiveaway) messageObject8.messageOwner.media).until_date) * j2;
                    String str3 = LocaleController.getInstance().getFormatterGiveawayMonthDayYear().format(new Date(j5));
                    z7 = System.currentTimeMillis() < j5;
                    str = str3;
                } else {
                    str = null;
                }
            } else if (i8 == 1) {
                int i36 = 1;
                str = null;
                z7 = false;
                while (i36 >= 0) {
                    boolean z23 = z7;
                    for (int i37 = 0; i37 < sparseArrayArr[i36].size(); i37++) {
                        MessageObject messageObject9 = (MessageObject) sparseArrayArr[i36].valueAt(i37);
                        boolean z24 = messageObject9.isGiveaway() && !messageObject9.isForwarded();
                        if (z24) {
                            long j6 = ((long) ((TLRPC.TL_messageMediaGiveaway) messageObject9.messageOwner.media).until_date) * j2;
                            str = LocaleController.getInstance().getFormatterGiveawayMonthDayYear().format(new Date(j6));
                            z23 = System.currentTimeMillis() < j6;
                        } else {
                            z23 = z24;
                        }
                    }
                    i36--;
                    z7 = z23;
                }
            } else {
                str = null;
                z7 = false;
            }
            if (z16) {
                int i38 = (int) MessagesController.getInstance(i34).config.starsSuggestedPostAgeMin.get(TimeUnit.HOURS);
                alertDialog3.title = LocaleController.getString(R.string.SuggestionStarsWillBeLost);
                alertDialog3.message = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestionStarsWillBeLostInfo, Integer.valueOf(i38)));
                AlertDialog.Builder builder4 = builder2;
                builder4.setPositiveButton(LocaleController.getString(R.string.SuggestionStarsWillBeLostDelete), onButtonClickListener);
                builder = builder4;
            } else {
                AlertDialog.Builder builder5 = builder2;
                if (z18) {
                    int i39 = (int) MessagesController.getInstance(i34).config.starsSuggestedPostAgeMin.get(TimeUnit.HOURS);
                    alertDialog3.title = LocaleController.getString(R.string.SuggestionTONWillBeLost);
                    alertDialog3.message = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestionTONWillBeLostInfo, Integer.valueOf(i39)));
                    builder5.setPositiveButton(LocaleController.getString(R.string.SuggestionStarsWillBeLostDelete), onButtonClickListener);
                    builder = builder5;
                } else if (!z7 || z11) {
                    builder5.setPositiveButton(LocaleController.getString(z11 ? R.string.Remove : R.string.Delete), onButtonClickListener);
                    builder = builder5;
                } else {
                    alertDialog3.title = LocaleController.getString(R.string.BoostingGiveawayDeleteMsgTitle);
                    alertDialog3.message = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BoostingGiveawayDeleteMsgText, str));
                    builder5.setNeutralButton(LocaleController.getString(R.string.Delete), onButtonClickListener);
                    builder = builder5;
                }
            }
            builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
            alertDialog3.onDismissListener = new DialogInterface.OnDismissListener() {
                @Override
                public final void onDismiss(DialogInterface dialogInterface) throws Throwable {
                    switch (i35) {
                        case 0:
                            chatActivity$$ExternalSyntheticLambda5.run();
                            break;
                        case 1:
                            ChatActivity$$ExternalSyntheticLambda5 chatActivity$$ExternalSyntheticLambda7 = chatActivity$$ExternalSyntheticLambda5;
                            if (chatActivity$$ExternalSyntheticLambda7 != null) {
                                chatActivity$$ExternalSyntheticLambda7.run();
                            }
                            break;
                        default:
                            ChatActivity$$ExternalSyntheticLambda5 chatActivity$$ExternalSyntheticLambda8 = chatActivity$$ExternalSyntheticLambda5;
                            if (chatActivity$$ExternalSyntheticLambda8 != null) {
                                chatActivity$$ExternalSyntheticLambda8.run();
                            }
                            break;
                    }
                }
            };
            baseFragment.showDialog(alertDialog3);
            TextView textView = (TextView) alertDialog3.getButton(-1);
            if (textView != null) {
                textView.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
            }
            TextView textView2 = (TextView) alertDialog3.getButton(-3);
            if (textView2 != null) {
                alertDialog3.buttonsLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f));
                ((ViewGroup.MarginLayoutParams) alertDialog3.buttonsLayout.getLayoutParams()).topMargin = AndroidUtilities.dp(-8.0f);
                textView2.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
            }
        }
    }

    public static AlertDialog.Builder createDrawOverlayGroupCallPermissionDialog(Context context) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context, 0, null);
        String res = AndroidUtilities.readRes(R.raw.pip_voice_request);
        GroupCallPipButton groupCallPipButton = new GroupCallPipButton(0, context, true);
        groupCallPipButton.setImportantForAccessibility(2);
        ChatActivity.AnonymousClass60 anonymousClass60 = new ChatActivity.AnonymousClass60(5, context, groupCallPipButton);
        anonymousClass60.setBackground(new GradientDrawable(GradientDrawable.Orientation.BL_TR, new int[]{-15128003, -15118002}));
        anonymousClass60.setClipToOutline(true);
        anonymousClass60.setOutlineProvider(new RichEditor.AnonymousClass5(7));
        View view = new View(context);
        view.setBackground(new BitmapDrawable(SvgHelper.getBitmap(res, AndroidUtilities.dp(320.0f), AndroidUtilities.dp(184.61539f), false)));
        anonymousClass60.addView(view, LayoutHelper.createFrame(-1, -1.0f, 0, -1.0f, -1.0f, -1.0f, -1.0f));
        anonymousClass60.addView(groupCallPipButton, LayoutHelper.createFrame(117.0f, 117));
        AlertDialog alertDialog = builder.alertDialog;
        alertDialog.topView = anonymousClass60;
        alertDialog.title = LocaleController.getString(R.string.PermissionDrawAboveOtherAppsGroupCallTitle);
        alertDialog.message = LocaleController.getString(R.string.PermissionDrawAboveOtherAppsGroupCall);
        builder.setPositiveButton(LocaleController.getString(R.string.Enable), new BotLocation$$ExternalSyntheticLambda10(context, 2));
        alertDialog.notDrawBackgroundOnTopView = true;
        alertDialog.blurredBackground = false;
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        alertDialog.aspectRatio = 0.5769231f;
        return builder;
    }

    public static AlertDialog.Builder createDrawOverlayPermissionDialog(Activity activity, VoIPFragment$$ExternalSyntheticLambda12 voIPFragment$$ExternalSyntheticLambda12, boolean z) {
        AlertDialog.Builder builder = new AlertDialog.Builder(activity, 0, null);
        String res = AndroidUtilities.readRes(R.raw.pip_video_request);
        FrameLayout frameLayout = new FrameLayout(activity);
        frameLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.BL_TR, new int[]{-14535089, -14527894}));
        frameLayout.setClipToOutline(true);
        frameLayout.setOutlineProvider(new RichEditor.AnonymousClass5(6));
        View view = new View(activity);
        view.setBackground(new BitmapDrawable(SvgHelper.getBitmap(res, AndroidUtilities.dp(320.0f), AndroidUtilities.dp(161.36752f), false)));
        frameLayout.addView(view, LayoutHelper.createFrame(-1, -1.0f, 0, -1.0f, -1.0f, -1.0f, -1.0f));
        AlertDialog alertDialog = builder.alertDialog;
        alertDialog.topView = frameLayout;
        alertDialog.title = LocaleController.getString(R.string.PermissionDrawAboveOtherAppsTitle);
        alertDialog.message = LocaleController.getString(R.string.PermissionDrawAboveOtherApps);
        builder.setPositiveButton(LocaleController.getString(R.string.Enable), new ChatActivity$$ExternalSyntheticLambda168(4, activity, z));
        alertDialog.notDrawBackgroundOnTopView = true;
        alertDialog.blurredBackground = false;
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), voIPFragment$$ExternalSyntheticLambda12);
        alertDialog.aspectRatio = 0.50427353f;
        return builder;
    }

    public static AlertDialog createFreeSpaceDialog(LaunchActivity launchActivity) {
        AlertDialog.Builder builder = new AlertDialog.Builder(launchActivity, 0, null);
        String string = LocaleController.getString(R.string.LowDiskSpaceTitle);
        AlertDialog alertDialog = builder.alertDialog;
        alertDialog.title = string;
        alertDialog.message = LocaleController.getString(R.string.LowDiskSpaceMessage2);
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        builder.setPositiveButton(LocaleController.getString(R.string.LowDiskSpaceButton), new LaunchActivity$$ExternalSyntheticLambda14(launchActivity, 2));
        return alertDialog;
    }

    public static AlertDialog createLocationRequiredDialog(Activity activity) {
        AlertDialog.Builder builder = new AlertDialog.Builder(activity, 0, null);
        SpannableStringBuilder spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionNoLocationFriends));
        AlertDialog alertDialog = builder.alertDialog;
        alertDialog.message = spannableStringBuilderReplaceTags;
        builder.setTopAnimation(R.raw.permission_request_location, 72, Theme.getColor(null, Theme.key_dialogTopBackground, false), null);
        builder.setPositiveButton(LocaleController.getString(R.string.PermissionOpenSettings), new BotLocation$$ExternalSyntheticLambda7(activity, 2));
        builder.setNegativeButton(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
        return alertDialog;
    }

    public static AlertDialog createLocationUpdateDialog(Activity activity, boolean z, TLRPC.User user, MessagesStorage.IntCallback intCallback, Theme.ResourcesProvider resourcesProvider) {
        int[] iArr = new int[1];
        String[] strArr = {LocaleController.getString(R.string.SendLiveLocationFor15m), LocaleController.getString(R.string.SendLiveLocationFor1h), LocaleController.getString(R.string.SendLiveLocationFor8h), LocaleController.getString(R.string.SendLiveLocationForever)};
        LinearLayout linearLayoutM = FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline0.m(activity, 1);
        linearLayoutM.setPadding(0, 0, 0, AndroidUtilities.dp(4.0f));
        TextView textView = new TextView(activity);
        if (z) {
            textView.setText(LocaleController.getString(R.string.LiveLocationAlertExpandMessage));
        } else if (user != null) {
            textView.setText(LocaleController.formatString(R.string.LiveLocationAlertPrivate, UserObject.getFirstName(user)));
        } else {
            textView.setText(LocaleController.getString(R.string.LiveLocationAlertGroup));
        }
        textView.setTextColor(resourcesProvider != null ? resourcesProvider.getColorOrDefault(Theme.key_dialogTextBlack) : Theme.getColor(null, Theme.key_dialogTextBlack, false));
        textView.setTextSize(1, 16.0f);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        linearLayoutM.addView(textView, LayoutHelper.createLinear(-2, -2, (LocaleController.isRTL ? 5 : 3) | 48, 24, z ? 4 : 0, 24, 8));
        int i = 0;
        while (i < 4) {
            RadioColorCell radioColorCell = new RadioColorCell(activity, resourcesProvider);
            radioColorCell.heightDp = 42;
            radioColorCell.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            radioColorCell.setTag(Integer.valueOf(i));
            radioColorCell.setCheckColor(resourcesProvider != null ? resourcesProvider.getColorOrDefault(Theme.key_radioBackground) : Theme.getColor(null, Theme.key_radioBackground, false), resourcesProvider != null ? resourcesProvider.getColorOrDefault(Theme.key_dialogRadioBackgroundChecked) : Theme.getColor(null, Theme.key_dialogRadioBackgroundChecked, false));
            radioColorCell.setTextAndValue(strArr[i], iArr[0] == i);
            linearLayoutM.addView(radioColorCell);
            radioColorCell.setOnClickListener(new AlertsCreator$$ExternalSyntheticLambda148(iArr, linearLayoutM));
            i++;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(activity, 0, resourcesProvider);
        AlertDialog alertDialog = builder.alertDialog;
        if (z) {
            alertDialog.title = LocaleController.getString(R.string.LiveLocationAlertExpandTitle);
        } else {
            int colorOrDefault = resourcesProvider != null ? resourcesProvider.getColorOrDefault(Theme.key_dialogTopBackground) : Theme.getColor(null, Theme.key_dialogTopBackground, false);
            alertDialog.topDrawable = new ShareLocationDrawable(activity, 0);
            alertDialog.topBackgroundColor = colorOrDefault;
        }
        builder.setView(linearLayoutM);
        builder.setPositiveButton(LocaleController.getString(R.string.ShareFile), new ChatActivity$$ExternalSyntheticLambda189(15, iArr, intCallback));
        builder.setNeutralButton(LocaleController.getString(R.string.Cancel), null);
        return alertDialog;
    }

    public static BottomSheet createMuteAlert(final long j, final long j2, final BaseFragment baseFragment, final Theme.ResourcesProvider resourcesProvider) {
        if (baseFragment.getParentActivity() == null) {
            return null;
        }
        BottomSheet bottomSheet = new BottomSheet(baseFragment.getParentActivity(), resourcesProvider, false, false);
        bottomSheet.fixNavigationBar();
        bottomSheet.title = LocaleController.getString(R.string.Notifications);
        bottomSheet.bigTitle = true;
        int i = R.string.MuteFor;
        CharSequence[] charSequenceArr = {LocaleController.formatString("MuteFor", i, LocaleController.formatPluralString("Hours", 1, new Object[0])), LocaleController.formatString("MuteFor", i, LocaleController.formatPluralString("Hours", 8, new Object[0])), LocaleController.formatString("MuteFor", i, LocaleController.formatPluralString("Days", 2, new Object[0])), LocaleController.getString(R.string.MuteDisable)};
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i2) {
                int i3;
                if (i2 == 0) {
                    i3 = 0;
                } else if (i2 == 1) {
                    i3 = 1;
                } else {
                    i3 = i2 == 2 ? 2 : 3;
                }
                NotificationsController.getInstance(UserConfig.selectedAccount).setDialogNotificationsSettings(j, j2, i3);
                BaseFragment baseFragment2 = baseFragment;
                if (BulletinFactory.canShowBulletin(baseFragment2)) {
                    BulletinFactory.createMuteBulletin(baseFragment2, i3, 0, resourcesProvider).show();
                }
            }
        };
        bottomSheet.items = charSequenceArr;
        bottomSheet.onClickListener = onClickListener;
        return bottomSheet;
    }

    public static void createMuteForPickerDialog(Context context, Theme.ResourcesProvider resourcesProvider, ScheduleDatePickerDelegate scheduleDatePickerDelegate) {
        int i = 1;
        if (context == null) {
            return;
        }
        int colorOrDefault = resourcesProvider != null ? resourcesProvider.getColorOrDefault(Theme.key_dialogTextBlack) : Theme.getColor(null, Theme.key_dialogTextBlack, false);
        int colorOrDefault2 = resourcesProvider != null ? resourcesProvider.getColorOrDefault(Theme.key_dialogBackground) : Theme.getColor(null, Theme.key_dialogBackground, false);
        if (resourcesProvider != null) {
            resourcesProvider.getColorOrDefault(Theme.key_sheet_other);
        } else {
            Theme.getColor(null, Theme.key_sheet_other, false);
        }
        if (resourcesProvider != null) {
            resourcesProvider.getColorOrDefault(Theme.key_player_actionBarSelector);
        } else {
            Theme.getColor(null, Theme.key_player_actionBarSelector, false);
        }
        if (resourcesProvider != null) {
            resourcesProvider.getColorOrDefault(Theme.key_actionBarDefaultSubmenuItem);
        } else {
            Theme.getColor(null, Theme.key_actionBarDefaultSubmenuItem, false);
        }
        if (resourcesProvider != null) {
            resourcesProvider.getColorOrDefault(Theme.key_actionBarDefaultSubmenuBackground);
        } else {
            Theme.getColor(null, Theme.key_actionBarDefaultSubmenuBackground, false);
        }
        if (resourcesProvider != null) {
            resourcesProvider.getColorOrDefault(Theme.key_listSelector);
        } else {
            Theme.getColor(null, Theme.key_listSelector, false);
        }
        int colorOrDefault3 = resourcesProvider != null ? resourcesProvider.getColorOrDefault(Theme.key_featuredStickers_buttonText) : Theme.getColor(null, Theme.key_featuredStickers_buttonText, false);
        int colorOrDefault4 = resourcesProvider != null ? resourcesProvider.getColorOrDefault(Theme.key_featuredStickers_addButton) : Theme.getColor(null, Theme.key_featuredStickers_addButton, false);
        int colorOrDefault5 = resourcesProvider != null ? resourcesProvider.getColorOrDefault(Theme.key_featuredStickers_addButtonPressed) : Theme.getColor(null, Theme.key_featuredStickers_addButtonPressed, false);
        BottomSheet.Builder builder = new BottomSheet.Builder(context, resourcesProvider);
        BottomSheet bottomSheet = builder.bottomSheet;
        bottomSheet.applyBottomPadding = false;
        final int[] iArr = {30, 60, 120, 180, 480, 1440, 2880, 4320, 5760, 7200, 8640, 10080, 20160, 30240, 44640, 89280, 133920, 178560, 223200, 267840, 525600};
        NumberPicker numberPicker = new NumberPicker(context, resourcesProvider) {
            @Override
            public final CharSequence getContentDescription(int i2) {
                int i3 = iArr[i2];
                if (i3 == 0) {
                    return LocaleController.getString(R.string.MuteNever);
                }
                if (i3 < 60) {
                    return LocaleController.formatPluralString("Minutes", i3, new Object[0]);
                }
                if (i3 < 1440) {
                    return LocaleController.formatPluralString("Hours", i3 / 60, new Object[0]);
                }
                if (i3 < 10080) {
                    return LocaleController.formatPluralString("Days", i3 / 1440, new Object[0]);
                }
                if (i3 < 44640) {
                    return LocaleController.formatPluralString("Weeks", i3 / 10080, new Object[0]);
                }
                return i3 < 525600 ? LocaleController.formatPluralString("Months", i3 / 44640, new Object[0]) : LocaleController.formatPluralString("Years", i3 / 525600, new Object[0]);
            }
        };
        numberPicker.setMinValue(0);
        numberPicker.setMaxValue(20);
        numberPicker.setTextColor(colorOrDefault);
        numberPicker.setValue(0);
        numberPicker.setFormatter(new AlertsCreator$$ExternalSyntheticLambda82(1, iArr));
        AnonymousClass46 anonymousClass46 = new AnonymousClass46(context, numberPicker, i);
        anonymousClass46.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        anonymousClass46.addView(frameLayout, LayoutHelper.createLinear(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.MuteForAlert));
        textView.setTextColor(colorOrDefault);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        frameLayout.addView(textView, LayoutHelper.createFrame(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new ArticleViewer$$ExternalSyntheticLambda23(9));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        anonymousClass46.addView(linearLayout, LayoutHelper.createLinear(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        AnonymousClass54 anonymousClass54 = new AnonymousClass54(context);
        linearLayout.addView(numberPicker, LayoutHelper.createLinear(1.0f, 0, 270));
        numberPicker.setOnValueChangedListener(new ChatActivity$$ExternalSyntheticLambda131(19));
        anonymousClass54.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        anonymousClass54.setGravity(17);
        anonymousClass54.setTextColor(colorOrDefault3);
        anonymousClass54.setTextSize(1, 14.0f);
        anonymousClass54.setTypeface(AndroidUtilities.bold());
        int iDp = AndroidUtilities.dp(8.0f);
        anonymousClass54.setBackgroundDrawable(Theme.createSimpleSelectorRoundRectDrawable(iDp, iDp, iDp, iDp, colorOrDefault4, colorOrDefault5, colorOrDefault5));
        anonymousClass54.setText(LocaleController.getString(R.string.AutoDeleteConfirm));
        anonymousClass46.addView(anonymousClass54, LayoutHelper.createLinear(-1, 48, 83, 16, 15, 16, 16));
        anonymousClass54.setOnClickListener(new BotAdView$$ExternalSyntheticLambda2(iArr, numberPicker, scheduleDatePickerDelegate, builder, 3));
        bottomSheet.customView = anonymousClass46;
        bottomSheet.show();
        bottomSheet.setBackgroundColor(colorOrDefault2);
        bottomSheet.fixNavigationBar(colorOrDefault2);
    }

    public static AlertDialog.Builder createNoAccessAlert(LaunchActivity launchActivity, String str, String str2) {
        AlertDialog.Builder builder = new AlertDialog.Builder(launchActivity, 0, null);
        AlertDialog alertDialog = builder.alertDialog;
        alertDialog.title = str;
        HashMap map = new HashMap();
        int i = Theme.key_dialogTopBackground;
        map.put("info1", Integer.valueOf(Theme.getColor(null, i, false)));
        map.put("info2", Integer.valueOf(Theme.getColor(null, i, false)));
        builder.setTopAnimation(R.raw.not_available, 52, Theme.getColor(null, i, false), map);
        alertDialog.topAnimationIsNew = true;
        builder.setPositiveButton(LocaleController.getString(R.string.Close), null);
        alertDialog.message = str2;
        return builder;
    }

    public static AlertDialog createPrioritySelectDialog(Activity activity, long j, final long j2, int i, final Runnable runnable, Theme.ResourcesProvider resourcesProvider) {
        String[] strArr;
        final long j3 = j;
        final int i2 = i;
        final SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(UserConfig.selectedAccount);
        final int[] iArr = new int[1];
        if (j3 != 0) {
            int i3 = notificationsSettings.getInt("priority_" + j3, 3);
            iArr[0] = i3;
            if (i3 == 3) {
                iArr[0] = 0;
            } else if (i3 == 4) {
                iArr[0] = 1;
            } else if (i3 == 5) {
                iArr[0] = 2;
            } else if (i3 == 0) {
                iArr[0] = 3;
            } else {
                iArr[0] = 4;
            }
            strArr = new String[]{LocaleController.getString(R.string.NotificationsPrioritySettings), LocaleController.getString(R.string.NotificationsPriorityLow), LocaleController.getString(R.string.NotificationsPriorityMedium), LocaleController.getString(R.string.NotificationsPriorityHigh), LocaleController.getString(R.string.NotificationsPriorityUrgent)};
        } else {
            if (i2 == 1) {
                iArr[0] = notificationsSettings.getInt("priority_messages", 1);
            } else if (i2 == 0) {
                iArr[0] = notificationsSettings.getInt("priority_group", 1);
            } else if (i2 == 2) {
                iArr[0] = notificationsSettings.getInt("priority_channel", 1);
            } else if (i2 == 3) {
                iArr[0] = notificationsSettings.getInt("priority_stories", 1);
            } else if (i2 == 4 || i2 == 5) {
                iArr[0] = notificationsSettings.getInt("priority_react", 1);
            }
            int i4 = iArr[0];
            if (i4 == 4) {
                iArr[0] = 0;
            } else if (i4 == 5) {
                iArr[0] = 1;
            } else if (i4 == 0) {
                iArr[0] = 2;
            } else {
                iArr[0] = 3;
            }
            strArr = new String[]{LocaleController.getString(R.string.NotificationsPriorityLow), LocaleController.getString(R.string.NotificationsPriorityMedium), LocaleController.getString(R.string.NotificationsPriorityHigh), LocaleController.getString(R.string.NotificationsPriorityUrgent)};
        }
        String[] strArr2 = strArr;
        LinearLayout linearLayoutM = FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline0.m(activity, 1);
        final AlertDialog.Builder builder = new AlertDialog.Builder(activity, 0, resourcesProvider);
        int i5 = 0;
        while (i5 < strArr2.length) {
            RadioColorCell radioColorCell = new RadioColorCell(activity, resourcesProvider);
            radioColorCell.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            radioColorCell.setTag(Integer.valueOf(i5));
            radioColorCell.setCheckColor(Theme.getColor(Theme.key_radioBackground, resourcesProvider), Theme.getColor(Theme.key_dialogRadioBackgroundChecked, resourcesProvider));
            radioColorCell.setTextAndValue(strArr2[i5], iArr[0] == i5);
            linearLayoutM.addView(radioColorCell);
            radioColorCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    int i6;
                    int iIntValue = ((Integer) view.getTag()).intValue();
                    int[] iArr2 = iArr;
                    int i7 = 0;
                    iArr2[0] = iIntValue;
                    SharedPreferences.Editor editorEdit = MessagesController.getNotificationsSettings(UserConfig.selectedAccount).edit();
                    long j4 = j3;
                    if (j4 != 0) {
                        int i8 = iArr2[0];
                        if (i8 == 0) {
                            i7 = 3;
                        } else if (i8 == 1) {
                            i7 = 4;
                        } else if (i8 == 2) {
                            i7 = 5;
                        } else if (i8 != 3) {
                            i7 = 1;
                        }
                        editorEdit.putInt("priority_" + j4, i7);
                        NotificationsController.getInstance(UserConfig.selectedAccount).deleteNotificationChannel(j4, j2);
                    } else {
                        int i9 = iArr2[0];
                        if (i9 == 0) {
                            i6 = 4;
                        } else if (i9 == 1) {
                            i6 = 5;
                        } else {
                            i6 = i9 == 2 ? 0 : 1;
                        }
                        int i10 = i2;
                        SharedPreferences sharedPreferences = notificationsSettings;
                        if (i10 == 1) {
                            editorEdit.putInt("priority_messages", i6);
                            iArr2[0] = sharedPreferences.getInt("priority_messages", 1);
                        } else if (i10 == 0) {
                            editorEdit.putInt("priority_group", i6);
                            iArr2[0] = sharedPreferences.getInt("priority_group", 1);
                        } else if (i10 == 2) {
                            editorEdit.putInt("priority_channel", i6);
                            iArr2[0] = sharedPreferences.getInt("priority_channel", 1);
                        } else if (i10 == 3) {
                            editorEdit.putInt("priority_stories", i6);
                            iArr2[0] = sharedPreferences.getInt("priority_stories", 1);
                        } else if (i10 == 4 || i10 == 5) {
                            editorEdit.putInt("priority_react", i6);
                            iArr2[0] = sharedPreferences.getInt("priority_react", 1);
                        }
                        NotificationsController.getInstance(UserConfig.selectedAccount).deleteNotificationChannelGlobal(i10);
                    }
                    editorEdit.commit();
                    builder.alertDialog.dismissRunnable.run();
                    runnable.run();
                }
            });
            i5++;
            j3 = j;
            i2 = i;
        }
        String string = LocaleController.getString(R.string.NotificationsImportance);
        AlertDialog alertDialog = builder.alertDialog;
        alertDialog.title = string;
        builder.setView(linearLayoutM);
        builder.setPositiveButton(LocaleController.getString(R.string.Cancel), null);
        return alertDialog;
    }

    public static void createReportPhotoAlert(int i, long j, Activity activity, TLRPC.Photo photo, DarkThemeResourceProvider darkThemeResourceProvider) {
        if (activity != null) {
            AuctionJoinSheet$$ExternalSyntheticLambda0 auctionJoinSheet$$ExternalSyntheticLambda0 = new AuctionJoinSheet$$ExternalSyntheticLambda0(i, j, activity, photo, darkThemeResourceProvider);
            BottomSheet bottomSheet = new BottomSheet(activity, darkThemeResourceProvider, true, false);
            bottomSheet.fixNavigationBar();
            bottomSheet.title = LocaleController.getString(R.string.ReportProfilePhoto);
            bottomSheet.bigTitle = true;
            CharSequence[] charSequenceArr = {LocaleController.getString(R.string.ReportChatSpam), LocaleController.getString(R.string.ReportChatFakeAccount), LocaleController.getString(R.string.ReportChatViolence), LocaleController.getString(R.string.ReportChatChild), LocaleController.getString(R.string.ReportChatIllegalDrugs), LocaleController.getString(R.string.ReportChatPersonalDetails), LocaleController.getString(R.string.ReportChatPornography), LocaleController.getString(R.string.ReportChatOther)};
            int[] iArr = {R.drawable.msg_clearcache, R.drawable.msg_report_fake, R.drawable.msg_report_violence, R.drawable.msg_block2, R.drawable.msg_report_drugs, R.drawable.msg_report_personal, R.drawable.msg_report_xxx, R.drawable.msg_report_other};
            PaymentFormActivity$$ExternalSyntheticLambda45 paymentFormActivity$$ExternalSyntheticLambda45 = new PaymentFormActivity$$ExternalSyntheticLambda45(new int[]{0, 6, 1, 2, 3, 4, 5, 100}, activity, darkThemeResourceProvider, auctionJoinSheet$$ExternalSyntheticLambda0, 1);
            bottomSheet.items = charSequenceArr;
            bottomSheet.itemIcons = iArr;
            bottomSheet.onClickListener = paymentFormActivity$$ExternalSyntheticLambda45;
            bottomSheet.show();
        }
    }

    public static void createScheduleDatePickerDialog(Context context, long j, ScheduleDatePickerDelegate scheduleDatePickerDelegate) {
        createScheduleDatePickerDialog(context, j, -1L, 0, false, scheduleDatePickerDelegate, null, new ScheduleDatePickerColors(null), null);
    }

    public static AlertDialog.Builder createSimpleAlert(Context context, String str, String str2) {
        return createSimpleAlert(context, str, str2, null, null, null);
    }

    public static AlertDialog createSimpleConfirmAlert(Context context, Theme.ResourcesProvider resourcesProvider, String str, CharSequence charSequence, String str2, Runnable runnable) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context, 0, resourcesProvider);
        AlertDialog alertDialog = builder.alertDialog;
        alertDialog.title = str;
        alertDialog.message = charSequence;
        builder.setPositiveButton(str2, new ChatActivity$$ExternalSyntheticLambda177(6, runnable));
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        return alertDialog;
    }

    public static ActionBarPopupWindow createSimplePopup(BaseFragment baseFragment, ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout, View view, float f, float f2) {
        if (baseFragment == null || view == null) {
            return null;
        }
        ActionBarPopupWindow actionBarPopupWindow = new ActionBarPopupWindow(actionBarPopupWindowLayout);
        actionBarPopupWindow.pauseNotifications = true;
        actionBarPopupWindow.dismissAnimationDuration = 220;
        actionBarPopupWindow.setOutsideTouchable(true);
        actionBarPopupWindow.setClippingEnabled(true);
        actionBarPopupWindow.setAnimationStyle(R.style.PopupContextAnimation);
        actionBarPopupWindow.setFocusable(true);
        actionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
        actionBarPopupWindow.setInputMethodMode(2);
        actionBarPopupWindow.getContentView().setFocusableInTouchMode(true);
        float x = 0.0f;
        View view2 = view;
        float y = 0.0f;
        while (view2 != view.getRootView()) {
            x += view2.getX();
            y += view2.getY();
            view2 = (View) view2.getParent();
            if (view2 == null) {
                break;
            }
        }
        actionBarPopupWindow.showAtLocation(view.getRootView(), 0, (int) ((x + f) - (actionBarPopupWindowLayout.getMeasuredWidth() / 2.0f)), (int) ((y + f2) - (actionBarPopupWindowLayout.getMeasuredHeight() / 2.0f)));
        actionBarPopupWindow.dimBehind(0.2f);
        return actionBarPopupWindow;
    }

    public static void createSimpleTextInputAlert(Context context, BaseFragment baseFragment, String str, String str2, String str3, String str4, final int i, String str5, Theme.ResourcesProvider resourcesProvider, MessagesStorage.StringCallback stringCallback) {
        Activity activityFindActivity = AndroidUtilities.findActivity(context);
        View currentFocus = activityFindActivity != null ? activityFindActivity.getCurrentFocus() : null;
        AlertDialog[] alertDialogArr = new AlertDialog[1];
        AlertDialog.Builder builder = new AlertDialog.Builder(context, 0, resourcesProvider);
        String string = str == null ? LocaleController.getString(R.string.AppName) : str;
        AlertDialog alertDialog = builder.alertDialog;
        alertDialog.title = string;
        alertDialog.message = str2;
        final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        editTextBoldCursor.setTextSize(1, 16.0f);
        int i2 = Theme.key_dialogTextBlack;
        editTextBoldCursor.setTextColor(Theme.getColor(i2, resourcesProvider));
        editTextBoldCursor.setHintTextColor(Theme.getColor(Theme.key_groupcreate_hintText, resourcesProvider));
        editTextBoldCursor.setHint(str3);
        editTextBoldCursor.setFocusable(true);
        editTextBoldCursor.setInputType(147457);
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setMaxLines(10);
        editTextBoldCursor.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(11.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setCursorColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlueText4, resourcesProvider));
        if (str4 != null) {
            editTextBoldCursor.setText(str4);
        }
        editTextBoldCursor.setOnEditorActionListener(new AlertsCreator$$ExternalSyntheticLambda201(editTextBoldCursor, i, stringCallback, alertDialogArr, currentFocus, 0));
        editTextBoldCursor.addTextChangedListener(new TextWatcher() {
            public boolean ignoreTextChange;

            @Override
            public final void afterTextChanged(Editable editable) {
                if (this.ignoreTextChange) {
                    return;
                }
                int length = editable.length();
                int i3 = i;
                if (length > i3) {
                    this.ignoreTextChange = true;
                    editable.delete(i3, editable.length());
                    EditTextBoldCursor editTextBoldCursor2 = editTextBoldCursor;
                    AndroidUtilities.shakeView(editTextBoldCursor2);
                    try {
                        editTextBoldCursor2.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    this.ignoreTextChange = false;
                }
            }

            @Override
            public final void beforeTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
            }

            @Override
            public final void onTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
            }
        });
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(AndroidUtilities.dp(22.0f));
        gradientDrawable.setColor(Theme.multAlpha(0.06f, Theme.getColor(i2, resourcesProvider)));
        editTextBoldCursor.setBackground(gradientDrawable);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(editTextBoldCursor, LayoutHelper.createLinear(20.0f, 9.0f, 20.0f, 9.0f, -1, -2));
        builder.makeCustomMaxHeight();
        builder.setView(linearLayout);
        alertDialog.customWidth = Math.min(AndroidUtilities.dp(320.0f), (AndroidUtilities.displaySize.x * 85) / 100);
        builder.setPositiveButton(str5, new PassportActivity$$ExternalSyntheticLambda52(editTextBoldCursor, i, stringCallback));
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), new EmojiView$$ExternalSyntheticLambda21(4));
        alertDialogArr[0] = alertDialog;
        if (baseFragment != null) {
            AndroidUtilities.requestAdjustNothing(activityFindActivity, baseFragment.getClassGuid());
        }
        AlertDialog alertDialog2 = alertDialogArr[0];
        alertDialog2.dismissDialogByButtons = false;
        alertDialog2.setOnDismissListener(new BotLocation$$ExternalSyntheticLambda14(editTextBoldCursor, baseFragment, activityFindActivity, 1));
        alertDialogArr[0].setOnShowListener(new AlertsCreator$$ExternalSyntheticLambda55(2, editTextBoldCursor));
        alertDialogArr[0].show();
        editTextBoldCursor.setSelection(editTextBoldCursor.getText().length());
    }

    public static void createStoriesAlbumEnterNameForCreate(Context context, BaseFragment baseFragment, Theme.ResourcesProvider resourcesProvider, MessagesStorage.StringCallback stringCallback) {
        createSimpleTextInputAlert(context, baseFragment, LocaleController.getString(R.string.StoriesAlbumCreateNew), LocaleController.getString(R.string.StoriesAlbumAddHint), LocaleController.getString(R.string.StoriesAlbumTitleInputHint), null, 12, LocaleController.getString(R.string.Create), resourcesProvider, stringCallback);
    }

    public static BottomSheet.Builder createSuggestedMessageDatePickerDialog(Context context, long j, final ScheduleDatePickerDelegate scheduleDatePickerDelegate, ScheduleDatePickerColors scheduleDatePickerColors, Theme.ResourcesProvider resourcesProvider, int i) {
        BottomSheet.Builder builder;
        if (context == null) {
            return null;
        }
        BottomSheet.Builder builder2 = new BottomSheet.Builder(context, resourcesProvider);
        BottomSheet bottomSheet = builder2.bottomSheet;
        bottomSheet.applyBottomPadding = false;
        final NumberPicker numberPicker = new NumberPicker(context, 18, resourcesProvider);
        int i2 = scheduleDatePickerColors.textColor;
        numberPicker.setTextColor(i2);
        numberPicker.setTextOffset(AndroidUtilities.dp(10.0f));
        numberPicker.setItemCount(5);
        final AnonymousClass64 anonymousClass64 = new AnonymousClass64(context, 18, resourcesProvider);
        anonymousClass64.setWrapSelectorWheel(true);
        anonymousClass64.setAllItemsCount(24);
        anonymousClass64.setItemCount(5);
        anonymousClass64.setTextColor(i2);
        anonymousClass64.setTextOffset(-AndroidUtilities.dp(10.0f));
        final AnonymousClass65 anonymousClass65 = new AnonymousClass65(context, 18, resourcesProvider);
        anonymousClass65.setWrapSelectorWheel(true);
        anonymousClass65.setAllItemsCount(60);
        anonymousClass65.setItemCount(5);
        anonymousClass65.setTextColor(i2);
        anonymousClass65.setTextOffset(-AndroidUtilities.dp(34.0f));
        AnonymousClass27 anonymousClass27 = new AnonymousClass27(context, numberPicker, anonymousClass64, anonymousClass65, 5);
        anonymousClass27.setOrientation(1);
        LinearLayout linearLayoutM = zzkf.m(context, 1);
        anonymousClass27.addView(linearLayoutM, LayoutHelper.createLinear(-1, -2, 51, 22, 0, 22, 4));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(i == 1 ? R.string.SuggestedPostAcceptTitle : R.string.PostSuggestionsAddTime));
        FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline2.m(20.0f, i2, 1, textView);
        linearLayoutM.addView(textView, LayoutHelper.createLinear(-2, -2, 51, 0, 12, 0, 0));
        textView.setOnTouchListener(new ArticleViewer$$ExternalSyntheticLambda23(9));
        TextView textView2 = new TextView(context);
        OKLCH.m(Theme.key_windowBackgroundWhiteGrayText2, resourcesProvider, textView2, 14.0f);
        textView2.setText(LocaleController.getString(R.string.PostSuggestionsAddTimeHint));
        linearLayoutM.addView(textView2, LayoutHelper.createLinear(-2, -2, 51, 0, 2, 0, 0));
        textView2.setOnTouchListener(new ArticleViewer$$ExternalSyntheticLambda23(9));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        anonymousClass27.addView(linearLayout, LayoutHelper.createLinear(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        long jCurrentTimeMillis = System.currentTimeMillis();
        final Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(jCurrentTimeMillis);
        int i3 = calendar.get(1);
        AppGlobalConfig.ConfigTime configTime = MessagesController.getInstance(UserConfig.selectedAccount).config.starsSuggestedPostFutureMin;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        final long j2 = configTime.get(timeUnit) * 2;
        final long j3 = MessagesController.getInstance(UserConfig.selectedAccount).config.starsSuggestedPostFutureMax.get(timeUnit) - 86400;
        final AnonymousClass67 anonymousClass67 = new AnonymousClass67(context);
        linearLayout.addView(numberPicker, LayoutHelper.createLinear(0.5f, 0, 270));
        numberPicker.setMinValue(0);
        numberPicker.setMaxValue(365);
        numberPicker.setWrapSelectorWheel(false);
        numberPicker.setFormatter(new LogoutActivity$$ExternalSyntheticLambda1(i3, 4));
        final int i4 = i == 1 ? 5 : 3;
        NumberPicker.OnValueChangeListener onValueChangeListener = new NumberPicker.OnValueChangeListener() {
            @Override
            public final void onValueChange(NumberPicker numberPicker2, int i5) {
                AlertsCreator.checkScheduleDate(anonymousClass67, null, j2, j3, i4, numberPicker, anonymousClass64, anonymousClass65);
            }
        };
        numberPicker.setOnValueChangedListener(onValueChangeListener);
        anonymousClass64.setMinValue(0);
        anonymousClass64.setMaxValue(23);
        linearLayout.addView(anonymousClass64, LayoutHelper.createLinear(0.2f, 0, 270));
        anonymousClass64.setFormatter(new ChatActivity$$ExternalSyntheticLambda131(25));
        anonymousClass64.setOnValueChangedListener(onValueChangeListener);
        anonymousClass65.setMinValue(0);
        anonymousClass65.setMaxValue(59);
        anonymousClass65.setValue(0);
        anonymousClass65.setFormatter(new ChatActivity$$ExternalSyntheticLambda131(26));
        linearLayout.addView(anonymousClass65, LayoutHelper.createLinear(0.3f, 0, 270));
        anonymousClass65.setOnValueChangedListener(onValueChangeListener);
        if (j <= 0 || j == 2147483646) {
            builder = builder2;
        } else {
            long j4 = 1000 * j;
            calendar.setTimeInMillis(System.currentTimeMillis());
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            calendar.set(11, 0);
            builder = builder2;
            int timeInMillis = (int) ((j4 - calendar.getTimeInMillis()) / 86400000);
            calendar.setTimeInMillis(j4);
            if (timeInMillis >= 0) {
                anonymousClass65.setValue(calendar.get(12));
                anonymousClass64.setValue(calendar.get(11));
                numberPicker.setValue(timeInMillis);
            }
        }
        final boolean[] zArr = {true};
        checkScheduleDate(anonymousClass67, null, j2, j3, i4, numberPicker, anonymousClass64, anonymousClass65);
        anonymousClass67.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        anonymousClass67.setGravity(17);
        anonymousClass67.setTextColor(scheduleDatePickerColors.buttonTextColor);
        anonymousClass67.setTextSize(1, 14.0f);
        anonymousClass67.setTypeface(AndroidUtilities.bold());
        int i5 = scheduleDatePickerColors.buttonBackgroundColor;
        anonymousClass67.setBackground(Theme.AdaptiveRipple.createRect(new float[]{8.0f}, i5, Theme.AdaptiveRipple.calcRippleColor(i5)));
        anonymousClass27.addView(anonymousClass67, LayoutHelper.createLinear(-1, 48, 83, 16, 15, 16, 4));
        final BottomSheet.Builder builder3 = builder;
        anonymousClass67.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                zArr[0] = false;
                NumberPicker numberPicker2 = numberPicker;
                AlertsCreator.AnonymousClass64 anonymousClass66 = anonymousClass64;
                AlertsCreator.AnonymousClass65 anonymousClass68 = anonymousClass65;
                boolean zCheckScheduleDate = AlertsCreator.checkScheduleDate(null, null, j2, j3, i4, numberPicker2, anonymousClass66, anonymousClass68);
                long epochMilli = LocalDate.now().plusDays(numberPicker2.getValue()).atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli();
                Calendar calendar2 = calendar;
                calendar2.setTimeInMillis(epochMilli);
                calendar2.set(11, anonymousClass66.getValue());
                calendar2.set(12, anonymousClass68.getValue());
                if (zCheckScheduleDate) {
                    calendar2.set(13, 0);
                }
                scheduleDatePickerDelegate.didSelectDate((int) (calendar2.getTimeInMillis() / 1000), 0, true);
                builder3.bottomSheet.dismissRunnable.run();
            }
        });
        ScaleStateListAnimator.apply(anonymousClass67, 0.02f, 1.2f);
        AnonymousClass68 anonymousClass68 = new AnonymousClass68(context);
        anonymousClass68.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        anonymousClass68.setGravity(17);
        anonymousClass68.setText(LocaleController.getString(i == 1 ? R.string.MessageSuggestionPublishNow : R.string.PostSuggestionsAnytime));
        anonymousClass68.setTextColor(i5);
        anonymousClass68.setTextSize(1, 14.0f);
        int iDp = AndroidUtilities.dp(8.0f);
        int color = Theme.getColor(null, Theme.key_windowBackgroundWhite, false);
        int color2 = Theme.getColor(null, Theme.key_listSelector, false);
        anonymousClass68.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp, iDp, iDp, iDp, color, color2, color2));
        anonymousClass27.addView(anonymousClass68, LayoutHelper.createLinear(-1, 48, 83, 16, 0, 16, 16));
        anonymousClass68.setOnClickListener(new ChatActivity$$ExternalSyntheticLambda62((Object) zArr, (Object) scheduleDatePickerDelegate, (Object) builder3, false, 14));
        ScaleStateListAnimator.apply(anonymousClass68, 0.02f, 1.2f);
        bottomSheet.customView = anonymousClass27;
        bottomSheet.show();
        bottomSheet.setOnDismissListener(new SettingsActivity$$ExternalSyntheticLambda21(zArr));
        int i6 = scheduleDatePickerColors.backgroundColor;
        bottomSheet.setBackgroundColor(i6);
        bottomSheet.fixNavigationBar(i6);
        return builder3;
    }

    public static AlertDialog createSupportAlert(BaseFragment baseFragment, Theme.ResourcesProvider resourcesProvider) {
        if (baseFragment == null || baseFragment.getParentActivity() == null) {
            return null;
        }
        LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(baseFragment.getParentActivity(), baseFragment.getResourceProvider());
        SpannableString spannableString = new SpannableString(Html.fromHtml(LocaleController.getString(R.string.AskAQuestionInfo).replace("\n", "<br>")));
        for (URLSpan uRLSpan : (URLSpan[]) spannableString.getSpans(0, spannableString.length(), URLSpan.class)) {
            int spanStart = spannableString.getSpanStart(uRLSpan);
            int spanEnd = spannableString.getSpanEnd(uRLSpan);
            spannableString.removeSpan(uRLSpan);
            spannableString.setSpan(new StickersActivity.AnonymousClass4(baseFragment, uRLSpan.getURL()), spanStart, spanEnd, 0);
        }
        linksTextView.setText(spannableString);
        linksTextView.setTextSize(1, 16.0f);
        linksTextView.setLinkTextColor(Theme.getColor(Theme.key_dialogTextLink, resourcesProvider));
        linksTextView.setHighlightColor(Theme.getColor(Theme.key_dialogLinkSelection, resourcesProvider));
        linksTextView.setPadding(AndroidUtilities.dp(23.0f), 0, AndroidUtilities.dp(23.0f), 0);
        linksTextView.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        linksTextView.setTextColor(Theme.getColor(Theme.key_dialogTextBlack, resourcesProvider));
        AlertDialog.Builder builder = new AlertDialog.Builder(baseFragment.getParentActivity(), 0, resourcesProvider);
        builder.setView(linksTextView);
        String string = LocaleController.getString(R.string.AskAQuestion);
        AlertDialog alertDialog = builder.alertDialog;
        alertDialog.title = string;
        builder.setPositiveButton(LocaleController.getString(R.string.AskButton), new AlertsCreator$$ExternalSyntheticLambda46(1, baseFragment));
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        return alertDialog;
    }

    public static AlertDialog.Builder createTTLAlert(Context context, TLRPC.EncryptedChat encryptedChat, Theme.ResourcesProvider resourcesProvider) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context, 0, resourcesProvider);
        builder.alertDialog.title = LocaleController.getString(R.string.MessageLifetime);
        NumberPicker numberPicker = new NumberPicker(context, 18, null);
        numberPicker.setMinValue(0);
        numberPicker.setMaxValue(20);
        int i = encryptedChat.ttl;
        if (i > 0 && i < 16) {
            numberPicker.setValue(i);
        } else if (i == 30) {
            numberPicker.setValue(16);
        } else if (i == 60) {
            numberPicker.setValue(17);
        } else if (i == 3600) {
            numberPicker.setValue(18);
        } else if (i == 86400) {
            numberPicker.setValue(19);
        } else if (i == 604800) {
            numberPicker.setValue(20);
        } else if (i == 0) {
            numberPicker.setValue(0);
        }
        numberPicker.setFormatter(new EmojiView$$ExternalSyntheticLambda21(15));
        builder.setView(numberPicker);
        builder.setNegativeButton(LocaleController.getString(R.string.Done), new ChatActivity$$ExternalSyntheticLambda189(19, encryptedChat, numberPicker));
        return builder;
    }

    public static void createThemeCreateDialog(BaseFragment baseFragment, int i, Theme.ThemeInfo themeInfo, Theme.ThemeAccent themeAccent) {
        Theme.ThemeAccent accent;
        int i2;
        String string;
        if (baseFragment.getParentActivity() == null) {
            return;
        }
        Activity parentActivity = baseFragment.getParentActivity();
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(parentActivity);
        String str = null;
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setLineColors(Theme.getColor(null, Theme.key_dialogInputField, false), Theme.getColor(null, Theme.key_dialogInputFieldActivated, false), Theme.getColor(null, Theme.key_text_RedBold, false));
        AlertDialog.Builder builder = new AlertDialog.Builder(parentActivity, 0, null);
        String string2 = LocaleController.getString(R.string.NewTheme);
        AlertDialog alertDialog = builder.alertDialog;
        alertDialog.title = string2;
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        builder.setPositiveButton(LocaleController.getString(R.string.Create), new EmojiView$$ExternalSyntheticLambda21(16));
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        linearLayout.setOrientation(1);
        builder.setView(linearLayout);
        TextView textView = new TextView(parentActivity);
        if (i != 0) {
            FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline1.m(R.string.EnterThemeNameEdit, textView);
        } else {
            textView.setText(LocaleController.getString(R.string.EnterThemeName));
        }
        textView.setTextSize(1, 16.0f);
        textView.setPadding(AndroidUtilities.dp(23.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(23.0f), AndroidUtilities.dp(6.0f));
        int i3 = Theme.key_dialogTextBlack;
        textView.setTextColor(Theme.getColor(null, i3, false));
        linearLayout.addView(textView, LayoutHelper.createLinear(-1, -2));
        editTextBoldCursor.setTextSize(1, 16.0f);
        editTextBoldCursor.setTextColor(Theme.getColor(null, i3, false));
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setLines(1);
        editTextBoldCursor.setInputType(16385);
        editTextBoldCursor.setGravity(51);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setCursorColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false));
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
        linearLayout.addView(editTextBoldCursor, LayoutHelper.createLinear(-1, 36, 51, 24, 6, 24, 0));
        editTextBoldCursor.setOnEditorActionListener(new PaymentFormActivity$$ExternalSyntheticLambda11(1));
        List listAsList = Arrays.asList("Ancient", "Antique", "Autumn", "Baby", "Barely", "Baroque", "Blazing", "Blushing", "Bohemian", "Bubbly", "Burning", "Buttered", "Classic", "Clear", "Cool", "Cosmic", "Cotton", "Cozy", "Crystal", "Dark", "Daring", "Darling", "Dawn", "Dazzling", "Deep", "Deepest", "Delicate", "Delightful", "Divine", "Double", "Downtown", "Dreamy", "Dusky", "Dusty", "Electric", "Enchanted", "Endless", "Evening", "Fantastic", "Flirty", "Forever", "Frigid", "Frosty", "Frozen", "Gentle", "Heavenly", "Hyper", "Icy", "Infinite", "Innocent", "Instant", "Luscious", "Lunar", "Lustrous", "Magic", "Majestic", "Mambo", "Midnight", "Millenium", "Morning", "Mystic", "Natural", "Neon", "Night", "Opaque", "Paradise", "Perfect", "Perky", "Polished", "Powerful", "Rich", "Royal", "Sheer", "Simply", "Sizzling", "Solar", "Sparkling", "Splendid", "Spicy", "Spring", "Stellar", "Sugared", "Summer", "Sunny", "Super", "Sweet", "Tender", "Tenacious", "Tidal", "Toasted", "Totally", "Tranquil", "Tropical", "True", "Twilight", "Twinkling", "Ultimate", "Ultra", "Velvety", "Vibrant", "Vintage", "Virtual", "Warm", "Warmest", "Whipped", "Wild", "Winsome");
        List listAsList2 = Arrays.asList("Ambrosia", "Attack", "Avalanche", "Blast", "Bliss", "Blossom", "Blush", "Burst", "Butter", "Candy", "Carnival", "Charm", "Chiffon", "Cloud", "Comet", "Delight", "Dream", "Dust", "Fantasy", "Flame", "Flash", "Fire", "Freeze", "Frost", "Glade", "Glaze", "Gleam", "Glimmer", "Glitter", "Glow", "Grande", "Haze", "Highlight", "Ice", "Illusion", "Intrigue", "Jewel", "Jubilee", "Kiss", "Lights", "Lollypop", "Love", "Luster", "Madness", "Matte", "Mirage", "Mist", "Moon", "Muse", "Myth", "Nectar", "Nova", "Parfait", "Passion", "Pop", "Rain", "Reflection", "Rhapsody", "Romance", "Satin", "Sensation", "Silk", "Shine", "Shadow", "Shimmer", "Sky", "Spice", "Star", "Sugar", "Sunrise", "Sunset", "Sun", "Twist", "Unbound", "Velvet", "Vibrant", "Waters", "Wine", "Wink", "Wonder", "Zone");
        HashMap map = new HashMap();
        zzlc.m(9306112, map, "Berry", 14598550, "Brandy");
        zzlc.m(8391495, map, "Cherry", 16744272, "Coral");
        zzlc.m(14372985, map, "Cranberry", 14423100, "Crimson");
        zzlc.m(14725375, map, "Mauve", 16761035, "Pink");
        zzlc.m(16711680, map, "Red", 16711807, "Rose");
        zzlc.m(8406555, map, "Russet", 16720896, "Scarlet");
        zzlc.m(15856113, map, "Seashell", 16724889, "Strawberry");
        zzlc.m(16760576, map, "Amber", 15438707, "Apricot");
        zzlc.m(16508850, map, "Banana", 10601738, "Citrus");
        zzlc.m(11560192, map, "Ginger", 16766720, "Gold");
        zzlc.m(16640272, map, "Lemon", 16753920, "Orange");
        zzlc.m(16770484, map, "Peach", 16739155, "Persimmon");
        zzlc.m(14996514, map, "Sunflower", 15893760, "Tangerine");
        zzlc.m(16763004, map, "Topaz", 16776960, "Yellow");
        zzlc.m(3688720, map, "Clover", 8628829, "Cucumber");
        zzlc.m(5294200, map, "Emerald", 11907932, "Olive");
        zzlc.m(65280, map, "Green", 43115, "Jade");
        zzlc.m(2730887, map, "Jungle", 12582656, "Lime");
        zzlc.m(776785, map, "Malachite", 10026904, "Mint");
        zzlc.m(11394989, map, "Moss", 3234721, "Azure");
        zzlc.m(255, map, "Blue", 18347, "Cobalt");
        zzlc.m(5204422, map, "Indigo", 96647, "Lagoon");
        zzlc.m(7461346, map, "Aquamarine", 1182351, "Ultramarine");
        zzlc.m(128, map, "Navy", 3101086, "Sapphire");
        zzlc.m(7788522, map, "Sky", 32896, "Teal");
        zzlc.m(4251856, map, "Turquoise", 10053324, "Amethyst");
        zzlc.m(5046581, map, "Blackberry", 6373457, "Eggplant");
        zzlc.m(13148872, map, "Lilac", 11894492, "Lavender");
        zzlc.m(13421823, map, "Periwinkle", 8663417, "Plum");
        zzlc.m(6684825, map, "Purple", 14204888, "Thistle");
        zzlc.m(14315734, map, "Orchid", 2361920, "Violet");
        zzlc.m(4137225, map, "Bronze", 3604994, "Chocolate");
        zzlc.m(8077056, map, "Cinnamon", 3153694, "Cocoa");
        zzlc.m(7365973, map, "Coffee", 7956873, "Rum");
        zzlc.m(5113350, map, "Mahogany", 7875865, "Mocha");
        zzlc.m(12759680, map, "Sand", 8924439, "Sienna");
        zzlc.m(7864585, map, "Maple", 15787660, "Khaki");
        zzlc.m(12088115, map, "Copper", 12144200, "Chestnut");
        zzlc.m(15653316, map, "Almond", 16776656, "Cream");
        zzlc.m(12186367, map, "Diamond", 11109127, "Honey");
        zzlc.m(16777200, map, "Ivory", 15392968, "Pearl");
        zzlc.m(15725299, map, "Porcelain", 13745832, "Vanilla");
        zzlc.m(16777215, map, "White", 8421504, "Gray");
        zzlc.m(0, map, "Black", 15266260, "Chrome");
        zzlc.m(3556687, map, "Charcoal", 789277, "Ebony");
        zzlc.m(12632256, map, "Silver", 16119285, "Smoke");
        zzlc.m(2499381, map, "Steel", 5220413, "Apple");
        zzlc.m(8434628, map, "Glacier", 16693933, "Melon");
        zzlc.m(12929932, map, "Mulberry", 11126466, "Opal");
        map.put(5547512, "Blue");
        if (themeAccent == null) {
            Theme.ThemeInfo themeInfo2 = Theme.currentDayTheme;
            if (themeInfo2 == null) {
                themeInfo2 = Theme.defaultTheme;
            }
            accent = themeInfo2.getAccent(false);
        } else {
            accent = themeAccent;
        }
        if (accent == null || (i2 = accent.accentColor) == 0) {
            i2 = AndroidUtilities.calcDrawableColor(Theme.getCachedWallpaper())[0];
        }
        int iRed = Color.red(i2);
        int iGreen = Color.green(i2);
        int iBlue = Color.blue(i2);
        int i4 = Integer.MAX_VALUE;
        for (Map.Entry entry : map.entrySet()) {
            Integer num = (Integer) entry.getKey();
            int iRed2 = Color.red(num.intValue());
            int i5 = (iRed + iRed2) / 2;
            int i6 = iRed - iRed2;
            int iGreen2 = iGreen - Color.green(num.intValue());
            int iBlue2 = iBlue - Color.blue(num.intValue());
            int i7 = ((((767 - i5) * iBlue2) * iBlue2) >> 8) + (iGreen2 * 4 * iGreen2) + ((((i5 + 512) * i6) * i6) >> 8);
            if (i7 < i4) {
                str = (String) entry.getValue();
                i4 = i7;
            }
        }
        if (Utilities.random.nextInt() % 2 == 0) {
            string = SurfaceContainer$$ExternalSyntheticOutline0.m((String) listAsList.get(Utilities.random.nextInt(listAsList.size())), " ", str, new StringBuilder());
        } else {
            StringBuilder sbM = Log.m(str, " ");
            sbM.append((String) listAsList2.get(Utilities.random.nextInt(listAsList2.size())));
            string = sbM.toString();
        }
        editTextBoldCursor.setText(string);
        editTextBoldCursor.setSelection(editTextBoldCursor.length());
        alertDialog.setOnShowListener(new AlertsCreator$$ExternalSyntheticLambda55(0, editTextBoldCursor));
        baseFragment.showDialog(alertDialog);
        editTextBoldCursor.requestFocus();
        alertDialog.getButton(-1).setOnClickListener(new OAuthSheet$$ExternalSyntheticLambda6(baseFragment, editTextBoldCursor, themeAccent, themeInfo, alertDialog, 5));
    }

    public static void createTimePickerDialog(Activity activity, String str, int i, int i2, int i3, Utilities.Callback callback) {
        if (activity == null) {
            return;
        }
        int color = Theme.getColor(null, Theme.key_dialogTextBlack, false);
        int color2 = Theme.getColor(null, Theme.key_dialogBackground, false);
        Theme.getColor(null, Theme.key_sheet_other, false);
        Theme.getColor(null, Theme.key_player_actionBarSelector, false);
        Theme.getColor(null, Theme.key_actionBarDefaultSubmenuItem, false);
        Theme.getColor(null, Theme.key_actionBarDefaultSubmenuBackground, false);
        Theme.getColor(null, Theme.key_listSelector, false);
        Theme.getColor(null, Theme.key_featuredStickers_buttonText, false);
        Theme.getColor(null, Theme.key_featuredStickers_addButton, false);
        Theme.getColor(null, Theme.key_featuredStickers_addButtonPressed, false);
        BottomSheet bottomSheet = new BottomSheet(activity, null, false, false);
        bottomSheet.fixNavigationBar();
        bottomSheet.applyBottomPadding = false;
        final AnonymousClass21 anonymousClass21 = new AnonymousClass21(activity, 18, null);
        ?? r12 = new LinearLayout(activity) {
            public Text ampmText;
            public boolean isAM;
            public final Text separatorText = new Text(":", 18.0f, null);

            @Override
            public final void dispatchDraw(Canvas canvas) {
                float width = (getWidth() - this.separatorText.width) / 2.0f;
                float height = getHeight() / 2.0f;
                int i4 = Theme.key_windowBackgroundWhiteBlackText;
                this.separatorText.draw(width, height, 1.0f, Theme.getColor(null, i4, false), canvas);
                if (!LocaleController.is24HourFormat) {
                    boolean z = anonymousClass21.getValue() % 24 < 12;
                    if (this.isAM != z || this.ampmText == null) {
                        this.isAM = z;
                        this.ampmText = new Text(z ? "AM" : "PM", 18.0f, null);
                    }
                    this.ampmText.draw((getWidth() / 2.0f) + AndroidUtilities.dp(43.0f), (getHeight() / 2.0f) + AndroidUtilities.dp(1.0f), 1.0f, Theme.getColor(null, i4, false), canvas);
                }
                super.dispatchDraw(canvas);
            }
        };
        r12.setOrientation(0);
        r12.setWeightSum(1.0f);
        anonymousClass21.setAllItemsCount(24);
        anonymousClass21.setItemCount(5);
        anonymousClass21.setTextColor(color);
        anonymousClass21.setGravity(5);
        anonymousClass21.setTextOffset(-AndroidUtilities.dp(12.0f));
        final AnonymousClass23 anonymousClass23 = new AnonymousClass23(activity, 18, null);
        anonymousClass23.setWrapSelectorWheel(true);
        anonymousClass23.setAllItemsCount(60);
        anonymousClass23.setItemCount(5);
        anonymousClass23.setTextColor(color);
        anonymousClass23.setGravity(3);
        anonymousClass23.setTextOffset(AndroidUtilities.dp(12.0f));
        final StarGiftSheet$$ExternalSyntheticLambda81 starGiftSheet$$ExternalSyntheticLambda81 = new StarGiftSheet$$ExternalSyntheticLambda81(i2, i3, anonymousClass21, anonymousClass23, i, (AnonymousClass22) r12);
        r12.addView(anonymousClass21, LayoutHelper.createLinear(0.5f, 0, 270));
        anonymousClass21.setFormatter(new EmojiView$$ExternalSyntheticLambda21(10));
        final int i4 = 0;
        anonymousClass21.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public final void onValueChange(NumberPicker numberPicker, int i5) {
                switch (i4) {
                    case 0:
                        starGiftSheet$$ExternalSyntheticLambda81.run(Boolean.TRUE);
                        break;
                    default:
                        starGiftSheet$$ExternalSyntheticLambda81.run(Boolean.TRUE);
                        break;
                }
            }
        });
        r12.addView(anonymousClass23, LayoutHelper.createLinear(0.5f, 0, 270));
        anonymousClass23.setFormatter(new EmojiView$$ExternalSyntheticLambda21(11));
        final int i5 = 1;
        anonymousClass23.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public final void onValueChange(NumberPicker numberPicker, int i6) {
                switch (i5) {
                    case 0:
                        starGiftSheet$$ExternalSyntheticLambda81.run(Boolean.TRUE);
                        break;
                    default:
                        starGiftSheet$$ExternalSyntheticLambda81.run(Boolean.TRUE);
                        break;
                }
            }
        });
        starGiftSheet$$ExternalSyntheticLambda81.run(Boolean.FALSE);
        LinearLayout linearLayout = new LinearLayout(activity) {
            public boolean ignoreLayout = false;

            @Override
            public final void onMeasure(int i6, int i7) {
                this.ignoreLayout = true;
                Point point = AndroidUtilities.displaySize;
                int i8 = point.x > point.y ? 3 : 5;
                AnonymousClass21 anonymousClass22 = anonymousClass21;
                anonymousClass22.setItemCount(i8);
                AnonymousClass23 anonymousClass24 = anonymousClass23;
                anonymousClass24.setItemCount(i8);
                anonymousClass22.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i8;
                anonymousClass24.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i8;
                this.ignoreLayout = false;
                super.onMeasure(i6, i7);
            }

            @Override
            public final void requestLayout() {
                if (this.ignoreLayout) {
                    return;
                }
                super.requestLayout();
            }
        };
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(activity);
        TextView textView = new TextView(activity);
        textView.setText(str);
        textView.setTextColor(color);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        frameLayout.addView(textView, LayoutHelper.createFrame(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new ArticleViewer$$ExternalSyntheticLambda23(9));
        linearLayout.addView(frameLayout, LayoutHelper.createLinear(-1, -2, 51, 22, 0, 0, 4));
        linearLayout.addView((View) r12, LayoutHelper.createLinear(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(activity, null, true);
        buttonWithCounterView.setRoundRadius(24);
        buttonWithCounterView.setText(LocaleController.getString(R.string.Select), false, true);
        buttonWithCounterView.setOnClickListener(new AccountFrozenAlert$$ExternalSyntheticLambda3(bottomSheetArr, 1));
        linearLayout.addView(buttonWithCounterView, LayoutHelper.createLinear(-1, 48, 0, 16, 12, 16, 12));
        bottomSheet.customView = linearLayout;
        bottomSheet.show();
        bottomSheet.setOnDismissListener(new BotLocation$$ExternalSyntheticLambda14(callback, anonymousClass21, anonymousClass23, 2));
        bottomSheet.setBackgroundColor(color2);
        bottomSheet.fixNavigationBar(color2);
        BottomSheet[] bottomSheetArr = {bottomSheet};
    }

    public static AlertDialog createVibrationSelectDialog(Activity activity, final long j, final long j2, String str, final Runnable runnable, Theme.ResourcesProvider resourcesProvider) {
        String[] strArr;
        final String str2 = str;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(UserConfig.selectedAccount);
        final int[] iArr = new int[1];
        if (j != 0) {
            int i = notificationsSettings.getInt(str2, 0);
            iArr[0] = i;
            if (i == 3) {
                iArr[0] = 2;
            } else if (i == 2) {
                iArr[0] = 3;
            }
            strArr = new String[]{LocaleController.getString(R.string.VibrationDefault), LocaleController.getString(R.string.Short), LocaleController.getString(R.string.Long), LocaleController.getString(R.string.VibrationDisabled)};
        } else {
            int i2 = notificationsSettings.getInt(str2, 0);
            iArr[0] = i2;
            if (i2 == 0) {
                iArr[0] = 1;
            } else if (i2 == 1) {
                iArr[0] = 2;
            } else if (i2 == 2) {
                iArr[0] = 0;
            }
            strArr = new String[]{LocaleController.getString(R.string.VibrationDisabled), LocaleController.getString(R.string.VibrationDefault), LocaleController.getString(R.string.Short), LocaleController.getString(R.string.Long), LocaleController.getString(R.string.OnlyIfSilent)};
        }
        String[] strArr2 = strArr;
        LinearLayout linearLayoutM = FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline0.m(activity, 1);
        final AlertDialog.Builder builder = new AlertDialog.Builder(activity, 0, resourcesProvider);
        int i3 = 0;
        while (i3 < strArr2.length) {
            RadioColorCell radioColorCell = new RadioColorCell(activity, resourcesProvider);
            radioColorCell.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            radioColorCell.setTag(Integer.valueOf(i3));
            radioColorCell.setCheckColor(Theme.getColor(Theme.key_radioBackground, resourcesProvider), Theme.getColor(Theme.key_dialogRadioBackgroundChecked, resourcesProvider));
            radioColorCell.setTextAndValue(strArr2[i3], iArr[0] == i3);
            linearLayoutM.addView(radioColorCell);
            radioColorCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    int iIntValue = ((Integer) view.getTag()).intValue();
                    int[] iArr2 = iArr;
                    iArr2[0] = iIntValue;
                    SharedPreferences.Editor editorEdit = MessagesController.getNotificationsSettings(UserConfig.selectedAccount).edit();
                    long j3 = j;
                    String str3 = str2;
                    if (j3 != 0) {
                        int i4 = iArr2[0];
                        if (i4 == 0) {
                            editorEdit.putInt(str3, 0);
                        } else if (i4 == 1) {
                            editorEdit.putInt(str3, 1);
                        } else if (i4 == 2) {
                            editorEdit.putInt(str3, 3);
                        } else if (i4 == 3) {
                            editorEdit.putInt(str3, 2);
                        }
                        NotificationsController.getInstance(UserConfig.selectedAccount).deleteNotificationChannel(j3, j2);
                    } else {
                        int i5 = iArr2[0];
                        if (i5 == 0) {
                            editorEdit.putInt(str3, 2);
                        } else if (i5 == 1) {
                            editorEdit.putInt(str3, 0);
                        } else if (i5 == 2) {
                            editorEdit.putInt(str3, 1);
                        } else if (i5 == 3) {
                            editorEdit.putInt(str3, 3);
                        } else if (i5 == 4) {
                            editorEdit.putInt(str3, 4);
                        }
                        if (str3.equals("vibrate_channel")) {
                            NotificationsController.getInstance(UserConfig.selectedAccount).deleteNotificationChannelGlobal(2);
                        } else if (str3.equals("vibrate_group")) {
                            NotificationsController.getInstance(UserConfig.selectedAccount).deleteNotificationChannelGlobal(0);
                        } else if (str3.equals("vibrate_react")) {
                            NotificationsController.getInstance(UserConfig.selectedAccount).deleteNotificationChannelGlobal(4);
                        } else {
                            NotificationsController.getInstance(UserConfig.selectedAccount).deleteNotificationChannelGlobal(1);
                        }
                    }
                    editorEdit.commit();
                    builder.alertDialog.dismissRunnable.run();
                    runnable.run();
                }
            });
            i3++;
            str2 = str;
        }
        String string = LocaleController.getString(R.string.Vibrate);
        AlertDialog alertDialog = builder.alertDialog;
        alertDialog.title = string;
        builder.setView(linearLayoutM);
        builder.setPositiveButton(LocaleController.getString(R.string.Cancel), null);
        return alertDialog;
    }

    public static AlertDialog createWebViewPermissionsRequestDialog(Context context, Theme.ResourcesProvider resourcesProvider, String[] strArr, int i, String str, String str2, Consumer consumer) {
        boolean z;
        if ((context instanceof Activity) && Build.VERSION.SDK_INT >= 23) {
            Activity activity = (Activity) context;
            int length = strArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    z = false;
                    break;
                }
                String str3 = strArr[i2];
                if (activity.checkSelfPermission(str3) != 0 && activity.shouldShowRequestPermissionRationale(str3)) {
                    z = true;
                    break;
                }
                i2++;
            }
        } else {
            z = false;
            break;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        AlertDialog.Builder builder = new AlertDialog.Builder(context, 0, resourcesProvider);
        builder.setTopAnimation(i, 72, Theme.getColor(null, Theme.key_dialogTopBackground, false), null);
        if (z) {
            str = str2;
        }
        SpannableStringBuilder spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(str);
        AlertDialog alertDialog = builder.alertDialog;
        alertDialog.message = spannableStringBuilderReplaceTags;
        builder.setPositiveButton(LocaleController.getString(z ? R.string.PermissionOpenSettings : R.string.BotWebViewRequestAllow), new ChatActivity$$ExternalSyntheticLambda454(z, context, atomicBoolean, consumer, 2));
        builder.setNegativeButton(LocaleController.getString(R.string.BotWebViewRequestDontAllow), new ChatActivity$$ExternalSyntheticLambda189(14, atomicBoolean, consumer));
        alertDialog.setOnDismissListener(new VoIPFragment$$ExternalSyntheticLambda16(4, atomicBoolean, consumer));
        return alertDialog;
    }

    public static boolean ensurePaidMessageConfirmation(final int i, final long j, int i2, Utilities.Callback callback, long j2) {
        Theme.ResourcesProvider darkThemeResourceProvider;
        TLRPC.Chat chat;
        long sendPaidMessagesStars = MessagesController.getInstance(i).getSendPaidMessagesStars(j);
        if (sendPaidMessagesStars <= 0 && j > 0) {
            sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(i).isUserContactBlocked(j));
        }
        long j3 = ((long) i2) * sendPaidMessagesStars;
        StarsController.getInstance(i, false).sendingMessagesCount.put(Long.valueOf(j), Integer.valueOf(i2));
        if (j3 <= 0 || j2 == j3) {
            callback.run(Long.valueOf(j3));
            return false;
        }
        final long j4 = sendPaidMessagesStars;
        final AlertsCreator$$ExternalSyntheticLambda8 alertsCreator$$ExternalSyntheticLambda8 = new AlertsCreator$$ExternalSyntheticLambda8(i, j3, j, callback, j4, 0);
        if (j4 <= MessagesController.getInstance(i).getMainSettings().getLong(RendererCapabilities.CC.m(j, "ask_paid_message_", "_price"), 0L)) {
            alertsCreator$$ExternalSyntheticLambda8.run();
            return true;
        }
        Activity activity = AndroidUtilities.getActivity();
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (PhotoViewer.getInstance().isVisible() || (safeLastFragment != null && safeLastFragment.hasShownSheet())) {
            darkThemeResourceProvider = new DarkThemeResourceProvider();
        } else {
            darkThemeResourceProvider = safeLastFragment != null ? safeLastFragment.getResourceProvider() : null;
        }
        Theme.ResourcesProvider resourcesProvider = darkThemeResourceProvider;
        String shortName = DialogObject.getShortName(i, j);
        if (ChatObject.isMonoForum(i, j)) {
            shortName = ForumUtilities.getMonoForumTitle(i, j);
        } else if (safeLastFragment instanceof ChatActivity) {
            ChatActivity chatActivity = (ChatActivity) safeLastFragment;
            if (chatActivity.isComments && chatActivity.getDialogId() == j && (chat = chatActivity.replyOriginalChat) != null) {
                shortName = DialogObject.getShortName(i, -chat.id);
            }
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i3 = (int) j4;
        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("MessageLockedStarsConfirmMessage1", i3, shortName)));
        spannableStringBuilder.append((CharSequence) " ");
        if (i2 == 1) {
            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("MessageLockedStarsConfirmMessage2One", i3)));
        } else {
            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("MessageLockedStarsConfirmMessage2Many1", (int) j3)));
            spannableStringBuilder.append((CharSequence) " ");
            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("MessageLockedStarsConfirmMessage2Many2", i2)));
        }
        showAlertWithCheckbox(activity, LocaleController.getString(R.string.MessageLockedStarsConfirmTitle), spannableStringBuilder, LocaleController.getString(R.string.MessageLockedStarsConfirmMessageDontAsk), LocaleController.formatPluralStringComma("MessageLockedStarsConfirmMessagePay", i2), new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                if (((Boolean) obj).booleanValue()) {
                    int i4 = i;
                    SharedPreferences.Editor editorM = AiTonesController$$ExternalSyntheticOutline0.m(i4);
                    StringBuilder sb = new StringBuilder("ask_paid_message_");
                    long j5 = j;
                    editorM.putLong(SurfaceContainer$$ExternalSyntheticOutline0.m(sb, j5, "_price"), j4).apply();
                    StarsController.getInstance(i4, false).justAgreedToNotAskDialogs.put(Long.valueOf(j5), Long.valueOf(System.currentTimeMillis()));
                }
                AndroidUtilities.runOnUIThread(alertsCreator$$ExternalSyntheticLambda8);
            }
        }, resourcesProvider, true);
        return true;
    }

    public static boolean ensurePaidMessagesMultiConfirmation(int i, ArrayList arrayList, int i2, Utilities.Callback callback) {
        Theme.ResourcesProvider darkThemeResourceProvider;
        boolean z = false;
        int i3 = 1;
        if (arrayList.isEmpty()) {
            callback.run(new HashMap());
            return false;
        }
        HashMap map = new HashMap();
        int size = arrayList.size();
        long j = 0;
        int i4 = 0;
        boolean z2 = true;
        int i5 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4 += i3;
            Long l = (Long) obj;
            long j2 = j;
            long jLongValue = l.longValue();
            long sendPaidMessagesStars = MessagesController.getInstance(i).getSendPaidMessagesStars(jLongValue);
            if (sendPaidMessagesStars <= 0 && jLongValue > 0) {
                sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(i).isUserContactBlocked(jLongValue));
            }
            map.put(l, Long.valueOf(sendPaidMessagesStars));
            j = j2 + sendPaidMessagesStars;
            StarsController.getInstance(i, z).sendingMessagesCount.put(l, Integer.valueOf(i2));
            if (sendPaidMessagesStars > 0) {
                i5++;
            }
            if (sendPaidMessagesStars <= 0 || !z2 || MessagesController.getInstance(i).getMainSettings().getLong(RendererCapabilities.CC.m(jLongValue, "ask_paid_message_", "_price"), 0L) >= sendPaidMessagesStars) {
                z = false;
            } else {
                z = false;
                z2 = false;
            }
            i3 = 1;
        }
        long jMax = ((long) Math.max(1, i2)) * j;
        if (z2 || jMax <= 0) {
            callback.run(map);
            return false;
        }
        Activity activity = AndroidUtilities.getActivity();
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (PhotoViewer.getInstance().isVisible() || (safeLastFragment != null && safeLastFragment.hasShownSheet())) {
            darkThemeResourceProvider = new DarkThemeResourceProvider();
        } else {
            darkThemeResourceProvider = safeLastFragment != null ? safeLastFragment.getResourceProvider() : null;
        }
        Theme.ResourcesProvider resourcesProvider = darkThemeResourceProvider;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("MessageLockedStarsConfirmMessageMulti1", i5)));
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("MessageLockedStarsConfirmMessageMulti2", (int) jMax, LocaleController.formatPluralStringComma("MessageLockedStarsConfirmMessageMulti2Messages", Math.max(1, i5) * i2))));
        showAlertWithCheckbox(activity, LocaleController.getString(R.string.MessageLockedStarsConfirmTitle), spannableStringBuilder, LocaleController.getString(R.string.MessageLockedStarsConfirmMessageDontAsk), LocaleController.formatPluralStringComma("MessageLockedStarsConfirmMessagePay", i2), new ChatUsersActivity$$ExternalSyntheticLambda11(i, jMax, activity, arrayList, map, callback, resourcesProvider), resourcesProvider, true);
        return true;
    }

    public static boolean needsPaidMessageAlert(int i, long j) {
        long sendPaidMessagesStars = MessagesController.getInstance(i).getSendPaidMessagesStars(j);
        if (sendPaidMessagesStars <= 0 && j > 0) {
            sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(i).isUserContactBlocked(j));
        }
        return sendPaidMessagesStars > 0 && sendPaidMessagesStars > MessagesController.getInstance(i).getMainSettings().getLong(RendererCapabilities.CC.m(j, "ask_paid_message_", "_price"), 0L);
    }

    public static void processCreate(EditTextBoldCursor editTextBoldCursor, AlertDialog alertDialog, BaseFragment baseFragment) {
        if (baseFragment == null || baseFragment.getParentActivity() == null) {
            return;
        }
        AndroidUtilities.hideKeyboard(editTextBoldCursor);
        String string = editTextBoldCursor.getText().toString();
        int i = Theme.default_shadow_color;
        Theme.ThemeInfo themeInfo = new Theme.ThemeInfo();
        themeInfo.pathToFile = new File(ApplicationLoader.getFilesDirFixed(), "theme" + Utilities.random.nextLong() + ".attheme").getAbsolutePath();
        themeInfo.name = string;
        Theme.themedWallpaperLink = Theme.getWallpaperUrl(Theme.currentTheme.overrideWallpaper);
        themeInfo.account = UserConfig.selectedAccount;
        Theme.saveCurrentTheme(themeInfo, true, true, false);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeListUpdated, new Object[0]);
        new ThemeEditorView().show(baseFragment.getParentActivity(), themeInfo);
        alertDialog.dismiss();
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        if (globalMainSettings.getBoolean("themehint", false)) {
            return;
        }
        globalMainSettings.edit().putBoolean("themehint", true).commit();
        try {
            Toast.makeText(baseFragment.getParentActivity(), LocaleController.getString(R.string.CreateNewThemeHelp), 1).show();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static AlertDialog processError(final int i, TLRPC.TL_error tL_error, BaseFragment baseFragment, TLObject tLObject, Object... objArr) {
        String str;
        int i2;
        TLRPC.InputPeer inputPeer;
        long peerDialogId;
        String firstName;
        final long j;
        long peerDialogId2;
        if (tL_error != null && tL_error.code != 406 && (str = tL_error.text) != null) {
            if ("BALANCE_TOO_LOW".equalsIgnoreCase(str)) {
                final long allowedPaidStars = StarsController.getAllowedPaidStars(tLObject);
                if (tLObject instanceof TLRPC.TL_messages_sendMessage) {
                    peerDialogId2 = DialogObject.getPeerDialogId(((TLRPC.TL_messages_sendMessage) tLObject).peer);
                } else if (tLObject instanceof TLRPC.TL_messages_sendMultiMedia) {
                    peerDialogId2 = DialogObject.getPeerDialogId(((TLRPC.TL_messages_sendMultiMedia) tLObject).peer);
                } else if (tLObject instanceof TLRPC.TL_messages_sendInlineBotResult) {
                    peerDialogId2 = DialogObject.getPeerDialogId(((TLRPC.TL_messages_sendInlineBotResult) tLObject).peer);
                } else if (tLObject instanceof TLRPC.TL_messages_forwardMessages) {
                    peerDialogId2 = DialogObject.getPeerDialogId(((TLRPC.TL_messages_forwardMessages) tLObject).to_peer);
                } else {
                    if (tLObject instanceof TLRPC.TL_messages_sendMedia) {
                        peerDialogId2 = DialogObject.getPeerDialogId(((TLRPC.TL_messages_sendMedia) tLObject).peer);
                    } else {
                        j = 0;
                    }
                    if (allowedPaidStars > 0) {
                        StarsController.getInstance(i, false).getBalance(true, true, new Runnable() {
                            @Override
                            public final void run() {
                                Theme.ResourcesProvider darkThemeResourceProvider;
                                Activity activity = AndroidUtilities.getActivity();
                                BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                                if (PhotoViewer.getInstance().isVisible() || (safeLastFragment != null && safeLastFragment.hasShownSheet())) {
                                    darkThemeResourceProvider = new DarkThemeResourceProvider();
                                } else {
                                    darkThemeResourceProvider = safeLastFragment != null ? safeLastFragment.getResourceProvider() : null;
                                }
                                Theme.ResourcesProvider resourcesProvider = darkThemeResourceProvider;
                                int i3 = i;
                                long j2 = j;
                                new StarsIntroActivity.StarsNeededSheet(activity, resourcesProvider, allowedPaidStars, 13, DialogObject.getShortName(i3, j2), new ChatActivity$$ExternalSyntheticLambda470(8), j2).show();
                            }
                        });
                        return null;
                    }
                }
                j = peerDialogId2;
                if (allowedPaidStars > 0) {
                    StarsController.getInstance(i, false).getBalance(true, true, new Runnable() {
                        @Override
                        public final void run() {
                            Theme.ResourcesProvider darkThemeResourceProvider;
                            Activity activity = AndroidUtilities.getActivity();
                            BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                            if (PhotoViewer.getInstance().isVisible() || (safeLastFragment != null && safeLastFragment.hasShownSheet())) {
                                darkThemeResourceProvider = new DarkThemeResourceProvider();
                            } else {
                                darkThemeResourceProvider = safeLastFragment != null ? safeLastFragment.getResourceProvider() : null;
                            }
                            Theme.ResourcesProvider resourcesProvider = darkThemeResourceProvider;
                            int i3 = i;
                            long j2 = j;
                            new StarsIntroActivity.StarsNeededSheet(activity, resourcesProvider, allowedPaidStars, 13, DialogObject.getShortName(i3, j2), new ChatActivity$$ExternalSyntheticLambda470(8), j2).show();
                        }
                    });
                    return null;
                }
            } else {
                if (tL_error.text.equals("JOIN_GUARD_TIMEOUT")) {
                    showSimpleAlert(baseFragment, LocaleController.getString(R.string.GuardBotTimeoutTitle), LocaleController.getString(R.string.GuardBotTimeout), null);
                    return null;
                }
                boolean z = tLObject instanceof TLRPC.TL_messages_sendMessage;
                if (z) {
                    i2 = 5;
                    if (tL_error.text.contains("PRIVACY_PREMIUM_REQUIRED")) {
                        long peerDialogId3 = DialogObject.getPeerDialogId(((TLRPC.TL_messages_sendMessage) tLObject).peer);
                        if (peerDialogId3 >= 0) {
                            firstName = UserObject.getFirstName(MessagesController.getInstance(i).getUser(Long.valueOf(peerDialogId3)));
                        } else {
                            TLRPC.Chat chat = MessagesController.getInstance(i).getChat(Long.valueOf(-peerDialogId3));
                            firstName = chat != null ? chat.title : "";
                        }
                        showSimpleAlert(baseFragment == null ? LaunchActivity.getLastFragment() : baseFragment, LocaleController.getString(R.string.MessagePremiumErrorTitle), LocaleController.formatString(R.string.MessagePremiumErrorMessage, firstName), null);
                        MessagesController.getInstance(i).invalidateUserPremiumBlocked(peerDialogId3, 0);
                        return null;
                    }
                } else {
                    i2 = 5;
                }
                boolean z2 = tLObject instanceof TLRPC.TL_messages_initHistoryImport;
                if (z2 || (tLObject instanceof TLRPC.TL_messages_checkHistoryImportPeer) || (tLObject instanceof TLRPC.TL_messages_checkHistoryImport) || (tLObject instanceof TLRPC.TL_messages_startHistoryImport)) {
                    if (z2) {
                        inputPeer = ((TLRPC.TL_messages_initHistoryImport) tLObject).peer;
                    } else {
                        inputPeer = tLObject instanceof TLRPC.TL_messages_startHistoryImport ? ((TLRPC.TL_messages_startHistoryImport) tLObject).peer : null;
                    }
                    BaseFragment lastFragment = baseFragment == null ? LaunchActivity.getLastFragment() : baseFragment;
                    if (tL_error.text.contains("USER_IS_BLOCKED")) {
                        showSimpleAlert(lastFragment, LocaleController.getString(R.string.ImportErrorTitle), LocaleController.getString(R.string.ImportErrorUserBlocked), null);
                        return null;
                    }
                    if (tL_error.text.contains("USER_NOT_MUTUAL_CONTACT")) {
                        showSimpleAlert(lastFragment, LocaleController.getString(R.string.ImportErrorTitle), LocaleController.getString(R.string.ImportMutualError), null);
                        return null;
                    }
                    if (tL_error.text.contains("IMPORT_PEER_TYPE_INVALID")) {
                        if (inputPeer instanceof TLRPC.TL_inputPeerUser) {
                            showSimpleAlert(lastFragment, LocaleController.getString(R.string.ImportErrorTitle), LocaleController.getString(R.string.ImportErrorChatInvalidUser), null);
                            return null;
                        }
                        showSimpleAlert(lastFragment, LocaleController.getString(R.string.ImportErrorTitle), LocaleController.getString(R.string.ImportErrorChatInvalidGroup), null);
                        return null;
                    }
                    if (tL_error.text.contains("CHAT_ADMIN_REQUIRED")) {
                        showSimpleAlert(lastFragment, LocaleController.getString(R.string.ImportErrorTitle), LocaleController.getString(R.string.ImportErrorNotAdmin), null);
                        return null;
                    }
                    if (tL_error.text.startsWith("IMPORT_FORMAT")) {
                        showSimpleAlert(lastFragment, LocaleController.getString(R.string.ImportErrorTitle), LocaleController.getString(R.string.ImportErrorFileFormatInvalid), null);
                        return null;
                    }
                    if (tL_error.text.startsWith("PEER_ID_INVALID")) {
                        showSimpleAlert(lastFragment, LocaleController.getString(R.string.ImportErrorTitle), LocaleController.getString(R.string.ImportErrorPeerInvalid), null);
                        return null;
                    }
                    if (tL_error.text.contains("IMPORT_LANG_NOT_FOUND")) {
                        showSimpleAlert(lastFragment, LocaleController.getString(R.string.ImportErrorTitle), LocaleController.getString(R.string.ImportErrorFileLang), null);
                        return null;
                    }
                    if (tL_error.text.contains("IMPORT_UPLOAD_FAILED")) {
                        showSimpleAlert(lastFragment, LocaleController.getString(R.string.ImportErrorTitle), LocaleController.getString(R.string.ImportFailedToUpload), null);
                        return null;
                    }
                    if (tL_error.text.startsWith("FLOOD_WAIT")) {
                        showFloodWaitAlert(lastFragment, tL_error.text);
                        return null;
                    }
                    String string = LocaleController.getString(R.string.ImportErrorTitle);
                    StringBuilder sb = new StringBuilder();
                    zzlf.m(R.string.ErrorOccurred, "\n", sb);
                    sb.append(tL_error.text);
                    showSimpleAlert(lastFragment, string, sb.toString(), null);
                } else {
                    if ((tLObject instanceof TL_account.saveSecureValue) || (tLObject instanceof TL_account.getAuthorizationForm)) {
                        BaseFragment lastFragment2 = baseFragment == null ? LaunchActivity.getLastFragment() : baseFragment;
                        if (tL_error.text.contains("PHONE_NUMBER_INVALID")) {
                            showSimpleAlert(lastFragment2, null, LocaleController.getString(R.string.InvalidPhoneNumber), null);
                            return null;
                        }
                        if (tL_error.text.startsWith("FLOOD_WAIT")) {
                            showSimpleAlert(lastFragment2, null, LocaleController.getString(R.string.FloodWait), null);
                            return null;
                        }
                        if ("APP_VERSION_OUTDATED".equals(tL_error.text)) {
                            showUpdateAppAlert(lastFragment2.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                            return null;
                        }
                        StringBuilder sb2 = new StringBuilder();
                        zzlf.m(R.string.ErrorOccurred, "\n", sb2);
                        sb2.append(tL_error.text);
                        showSimpleAlert(lastFragment2, null, sb2.toString(), null);
                        return null;
                    }
                    boolean z3 = tLObject instanceof TLRPC.TL_channels_joinChannel;
                    if (z3 || (tLObject instanceof TLRPC.TL_channels_editAdmin) || (tLObject instanceof TLRPC.TL_channels_inviteToChannel) || (tLObject instanceof TLRPC.TL_messages_addChatUser) || (tLObject instanceof TLRPC.TL_messages_startBot) || (tLObject instanceof TLRPC.TL_channels_editBanned) || (tLObject instanceof TLRPC.TL_messages_editChatDefaultBannedRights) || (tLObject instanceof TLRPC.TL_messages_editChatAdmin) || (tLObject instanceof TLRPC.TL_messages_migrateChat) || (tLObject instanceof TL_phone.inviteToGroupCall)) {
                        if (baseFragment != null && tL_error.text.equals("CHANNELS_TOO_MUCH")) {
                            if (baseFragment.getParentActivity() != null) {
                                baseFragment.showDialog(new LimitReachedBottomSheet(5, i, baseFragment.getParentActivity(), baseFragment, null));
                                return null;
                            }
                            if (z3 || (tLObject instanceof TLRPC.TL_channels_inviteToChannel)) {
                                baseFragment.presentFragment(new TooManyCommunitiesActivity(0));
                                return null;
                            }
                            baseFragment.presentFragment(new TooManyCommunitiesActivity(1));
                            return null;
                        }
                        if (baseFragment != null) {
                            showAddUserAlert(tL_error, baseFragment, objArr.length > 0 ? ((Boolean) objArr[0]).booleanValue() : false, objArr.length > 1 ? ((Boolean) objArr[1]).booleanValue() : false, tLObject);
                            return null;
                        }
                        if (tL_error.text.equals("PEER_FLOOD")) {
                            NotificationCenter.getInstance(i).lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShowAlert, 1);
                            return null;
                        }
                    } else {
                        if (tLObject instanceof TLRPC.TL_messages_createChat) {
                            BaseFragment lastFragment3 = baseFragment == null ? LaunchActivity.getLastFragment() : baseFragment;
                            if (tL_error.text.equals("CHANNELS_TOO_MUCH")) {
                                if (lastFragment3.getParentActivity() != null) {
                                    lastFragment3.showDialog(new LimitReachedBottomSheet(5, i, lastFragment3.getParentActivity(), lastFragment3, null));
                                    return null;
                                }
                                lastFragment3.presentFragment(new TooManyCommunitiesActivity(2));
                                return null;
                            }
                            if (tL_error.text.startsWith("FLOOD_WAIT")) {
                                showFloodWaitAlert(lastFragment3, tL_error.text);
                                return null;
                            }
                            showAddUserAlert(tL_error, lastFragment3, false, false, tLObject);
                            return null;
                        }
                        if (tLObject instanceof TLRPC.TL_channels_createChannel) {
                            BaseFragment lastFragment4 = baseFragment == null ? LaunchActivity.getLastFragment() : baseFragment;
                            if (tL_error.text.equals("CHANNELS_TOO_MUCH")) {
                                if (lastFragment4.getParentActivity() != null) {
                                    lastFragment4.showDialog(new LimitReachedBottomSheet(5, i, lastFragment4.getParentActivity(), lastFragment4, null));
                                    return null;
                                }
                                lastFragment4.presentFragment(new TooManyCommunitiesActivity(2));
                                return null;
                            }
                            if (tL_error.text.startsWith("FLOOD_WAIT")) {
                                showFloodWaitAlert(lastFragment4, tL_error.text);
                                return null;
                            }
                            showAddUserAlert(tL_error, lastFragment4, false, false, tLObject);
                            return null;
                        }
                        if (tLObject instanceof TLRPC.TL_messages_editMessage) {
                            if (!tL_error.text.equals("MESSAGE_NOT_MODIFIED")) {
                                if (baseFragment != null) {
                                    showSimpleAlert(baseFragment, null, LocaleController.getString(R.string.EditMessageError), null);
                                    return null;
                                }
                                showSimpleToast(null, LocaleController.getString(R.string.EditMessageError));
                                return null;
                            }
                        } else {
                            if (z || (tLObject instanceof TL_ephemeral.TL_sendMessage) || (tLObject instanceof TLRPC.TL_messages_sendMedia) || (tLObject instanceof TLRPC.TL_messages_sendInlineBotResult) || (tLObject instanceof TLRPC.TL_messages_forwardMessages) || (tLObject instanceof TLRPC.TL_messages_sendMultiMedia) || (tLObject instanceof TLRPC.TL_messages_sendScheduledMessages)) {
                                if (z) {
                                    peerDialogId = DialogObject.getPeerDialogId(((TLRPC.TL_messages_sendMessage) tLObject).peer);
                                } else if (tLObject instanceof TLRPC.TL_messages_sendMedia) {
                                    peerDialogId = DialogObject.getPeerDialogId(((TLRPC.TL_messages_sendMedia) tLObject).peer);
                                } else if (tLObject instanceof TL_ephemeral.TL_sendMessage) {
                                    peerDialogId = DialogObject.getPeerDialogId(((TL_ephemeral.TL_sendMessage) tLObject).peer);
                                } else if (tLObject instanceof TLRPC.TL_messages_sendInlineBotResult) {
                                    peerDialogId = DialogObject.getPeerDialogId(((TLRPC.TL_messages_sendInlineBotResult) tLObject).peer);
                                } else if (tLObject instanceof TLRPC.TL_messages_forwardMessages) {
                                    peerDialogId = DialogObject.getPeerDialogId(((TLRPC.TL_messages_forwardMessages) tLObject).to_peer);
                                } else if (tLObject instanceof TLRPC.TL_messages_sendMultiMedia) {
                                    peerDialogId = DialogObject.getPeerDialogId(((TLRPC.TL_messages_sendMultiMedia) tLObject).peer);
                                } else {
                                    peerDialogId = tLObject instanceof TLRPC.TL_messages_sendScheduledMessages ? DialogObject.getPeerDialogId(((TLRPC.TL_messages_sendScheduledMessages) tLObject).peer) : 0L;
                                }
                                String str2 = tL_error.text;
                                if (str2 == null || !str2.startsWith("CHAT_SEND_") || !tL_error.text.endsWith("FORBIDDEN")) {
                                    String str3 = tL_error.text;
                                    str3.getClass();
                                    switch (str3) {
                                        case "USER_BANNED_IN_CHANNEL":
                                            NotificationCenter.getInstance(i).lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShowAlert, Integer.valueOf(i2));
                                            return null;
                                        case "PEER_FLOOD":
                                            NotificationCenter.getInstance(i).lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShowAlert, 0);
                                            return null;
                                        case "SCHEDULE_TOO_MUCH":
                                            showSimpleToast(baseFragment, LocaleController.getString(R.string.MessageScheduledLimitReached));
                                            return null;
                                    }
                                }
                                String restrictedErrorText = tL_error.text;
                                TLRPC.Chat chat2 = peerDialogId < 0 ? MessagesController.getInstance(i).getChat(Long.valueOf(-peerDialogId)) : null;
                                String str4 = tL_error.text;
                                str4.getClass();
                                switch (str4) {
                                    case "CHAT_SEND_VOICES_FORBIDDEN":
                                        restrictedErrorText = ChatObject.getRestrictedErrorText(chat2, 20);
                                        break;
                                    case "CHAT_SEND_PLAIN_FORBIDDEN":
                                        restrictedErrorText = ChatObject.getRestrictedErrorText(chat2, 22);
                                        break;
                                    case "CHAT_SEND_AUDIOS_FORBIDDEN":
                                        restrictedErrorText = ChatObject.getRestrictedErrorText(chat2, 18);
                                        break;
                                    case "CHAT_SEND_POLL_FORBIDDEN":
                                        restrictedErrorText = ChatObject.getRestrictedErrorText(chat2, 10);
                                        break;
                                    case "CHAT_SEND_DOCS_FORBIDDEN":
                                        restrictedErrorText = ChatObject.getRestrictedErrorText(chat2, 19);
                                        break;
                                    case "CHAT_SEND_ROUNDVIDEOS_FORBIDDEN":
                                        restrictedErrorText = ChatObject.getRestrictedErrorText(chat2, 21);
                                        break;
                                    case "CHAT_SEND_VIDEOS_FORBIDDEN":
                                        restrictedErrorText = ChatObject.getRestrictedErrorText(chat2, 17);
                                        break;
                                    case "CHAT_SEND_GIFS_FORBIDDEN":
                                        restrictedErrorText = ChatObject.getRestrictedErrorText(chat2, 23);
                                        break;
                                    case "CHAT_SEND_PHOTOS_FORBIDDEN":
                                        restrictedErrorText = ChatObject.getRestrictedErrorText(chat2, 16);
                                        break;
                                    case "CHAT_SEND_STICKERS_FORBIDDEN":
                                        restrictedErrorText = ChatObject.getRestrictedErrorText(chat2, 8);
                                        break;
                                }
                                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 1, restrictedErrorText);
                                return null;
                            }
                            if (tLObject instanceof TLRPC.TL_messages_importChatInvite) {
                                BaseFragment lastFragment5 = baseFragment == null ? LaunchActivity.getLastFragment() : baseFragment;
                                if (tL_error.text.startsWith("FLOOD_WAIT")) {
                                    showSimpleAlert(lastFragment5, null, LocaleController.getString(R.string.FloodWait), null);
                                    return null;
                                }
                                if (tL_error.text.equals("USERS_TOO_MUCH")) {
                                    showSimpleAlert(lastFragment5, null, LocaleController.getString(R.string.JoinToGroupErrorFull), null);
                                    return null;
                                }
                                if (tL_error.text.equals("CHANNELS_TOO_MUCH")) {
                                    if (lastFragment5.getParentActivity() != null) {
                                        lastFragment5.showDialog(new LimitReachedBottomSheet(5, i, lastFragment5.getParentActivity(), lastFragment5, null));
                                        return null;
                                    }
                                    lastFragment5.presentFragment(new TooManyCommunitiesActivity(0));
                                    return null;
                                }
                                if (tL_error.text.equals("INVITE_HASH_EXPIRED")) {
                                    showSimpleAlert(lastFragment5, LocaleController.getString(R.string.ExpiredLink), LocaleController.getString(R.string.InviteExpired), null);
                                    return null;
                                }
                                showSimpleAlert(lastFragment5, null, LocaleController.getString(R.string.JoinToGroupErrorNotExist), null);
                                return null;
                            }
                            if (tLObject instanceof TLRPC.TL_messages_getAttachedStickers) {
                                if (baseFragment != null && baseFragment.getParentActivity() != null) {
                                    Activity parentActivity = baseFragment.getParentActivity();
                                    StringBuilder sb3 = new StringBuilder();
                                    zzlf.m(R.string.ErrorOccurred, "\n", sb3);
                                    sb3.append(tL_error.text);
                                    Toast.makeText(parentActivity, sb3.toString(), 0).show();
                                    return null;
                                }
                            } else {
                                if ((tLObject instanceof TL_account.confirmPhone) || (tLObject instanceof TL_account.verifyPhone) || (tLObject instanceof TL_account.verifyEmail)) {
                                    if (tL_error.text.contains("PHONE_CODE_EMPTY") || tL_error.text.contains("PHONE_CODE_INVALID") || tL_error.text.contains("CODE_INVALID") || tL_error.text.contains("CODE_EMPTY")) {
                                        return showSimpleAlert(baseFragment, null, LocaleController.getString(R.string.InvalidCode), null);
                                    }
                                    if (tL_error.text.contains("PHONE_CODE_EXPIRED") || tL_error.text.contains("EMAIL_VERIFY_EXPIRED")) {
                                        return showSimpleAlert(baseFragment, null, LocaleController.getString(R.string.CodeExpired), null);
                                    }
                                    return tL_error.text.startsWith("FLOOD_WAIT") ? showSimpleAlert(baseFragment, null, LocaleController.getString(R.string.FloodWait), null) : showSimpleAlert(baseFragment, null, tL_error.text, null);
                                }
                                if (tLObject instanceof TLRPC.TL_auth_resendCode) {
                                    if (tL_error.text.contains("PHONE_NUMBER_INVALID")) {
                                        return showSimpleAlert(baseFragment, null, LocaleController.getString(R.string.InvalidPhoneNumber), null);
                                    }
                                    if (tL_error.text.contains("PHONE_CODE_EMPTY") || tL_error.text.contains("PHONE_CODE_INVALID")) {
                                        return showSimpleAlert(baseFragment, null, LocaleController.getString(R.string.InvalidCode), null);
                                    }
                                    if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                                        return showSimpleAlert(baseFragment, null, LocaleController.getString(R.string.CodeExpired), null);
                                    }
                                    if (tL_error.text.startsWith("FLOOD_WAIT")) {
                                        return showSimpleAlert(baseFragment, null, LocaleController.getString(R.string.FloodWait), null);
                                    }
                                    if (tL_error.code != -1000) {
                                        StringBuilder sb4 = new StringBuilder();
                                        zzlf.m(R.string.ErrorOccurred, "\n", sb4);
                                        sb4.append(tL_error.text);
                                        return showSimpleAlert(baseFragment, null, sb4.toString(), null);
                                    }
                                } else {
                                    if (tLObject instanceof TL_account.sendConfirmPhoneCode) {
                                        if (tL_error.code == 400) {
                                            return showSimpleAlert(baseFragment, null, LocaleController.getString(R.string.CancelLinkExpired), null);
                                        }
                                        return tL_error.text.startsWith("FLOOD_WAIT") ? showSimpleAlert(baseFragment, null, LocaleController.getString(R.string.FloodWait), null) : showSimpleAlert(baseFragment, null, LocaleController.getString(R.string.ErrorOccurred), null);
                                    }
                                    if (tLObject instanceof TL_account.changePhone) {
                                        if (tL_error.text.contains("PHONE_NUMBER_INVALID")) {
                                            showSimpleAlert(baseFragment, null, LocaleController.getString(R.string.InvalidPhoneNumber), null);
                                            return null;
                                        }
                                        if (tL_error.text.contains("PHONE_CODE_EMPTY") || tL_error.text.contains("PHONE_CODE_INVALID")) {
                                            showSimpleAlert(baseFragment, null, LocaleController.getString(R.string.InvalidCode), null);
                                            return null;
                                        }
                                        if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                                            showSimpleAlert(baseFragment, null, LocaleController.getString(R.string.CodeExpired), null);
                                            return null;
                                        }
                                        if (tL_error.text.startsWith("FLOOD_WAIT")) {
                                            showSimpleAlert(baseFragment, null, LocaleController.getString(R.string.FloodWait), null);
                                            return null;
                                        }
                                        if (tL_error.text.contains("FRESH_CHANGE_PHONE_FORBIDDEN")) {
                                            showSimpleAlert(baseFragment, LocaleController.getString(R.string.FreshChangePhoneForbiddenTitle), LocaleController.getString(R.string.FreshChangePhoneForbidden), null);
                                            return null;
                                        }
                                        showSimpleAlert(baseFragment, null, tL_error.text, null);
                                        return null;
                                    }
                                    if (tLObject instanceof TL_account.sendChangePhoneCode) {
                                        if (tL_error.text.contains("PHONE_NUMBER_INVALID")) {
                                            LoginActivity.needShowInvalidAlert(baseFragment, (String) objArr[0], null, false);
                                            return null;
                                        }
                                        if (tL_error.text.contains("PHONE_CODE_EMPTY") || tL_error.text.contains("PHONE_CODE_INVALID")) {
                                            showSimpleAlert(baseFragment, null, LocaleController.getString(R.string.InvalidCode), null);
                                            return null;
                                        }
                                        if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                                            showSimpleAlert(baseFragment, null, LocaleController.getString(R.string.CodeExpired), null);
                                            return null;
                                        }
                                        if (tL_error.text.startsWith("FLOOD_WAIT")) {
                                            showSimpleAlert(baseFragment, null, LocaleController.getString(R.string.FloodWait), null);
                                            return null;
                                        }
                                        if (tL_error.text.startsWith("PHONE_NUMBER_OCCUPIED")) {
                                            showSimpleAlert(baseFragment, null, LocaleController.formatString("ChangePhoneNumberOccupied", R.string.ChangePhoneNumberOccupied, objArr[0]), null);
                                            return null;
                                        }
                                        if (tL_error.text.startsWith("PHONE_NUMBER_BANNED")) {
                                            LoginActivity.needShowInvalidAlert(baseFragment, (String) objArr[0], null, true);
                                            return null;
                                        }
                                        showSimpleAlert(baseFragment, null, LocaleController.getString(R.string.ErrorOccurred), null);
                                        return null;
                                    }
                                    if (tLObject instanceof TL_account.updateUsername) {
                                        String str5 = tL_error.text;
                                        str5.getClass();
                                        if (str5.equals("USERNAME_INVALID")) {
                                            showSimpleAlert(baseFragment, null, LocaleController.getString(R.string.UsernameInvalid), null);
                                            return null;
                                        }
                                        if (str5.equals("USERNAME_OCCUPIED")) {
                                            showSimpleAlert(baseFragment, null, LocaleController.getString(R.string.UsernameInUse), null);
                                            return null;
                                        }
                                        showSimpleAlert(baseFragment, null, LocaleController.getString(R.string.ErrorOccurred), null);
                                        return null;
                                    }
                                    if (tLObject instanceof TLRPC.TL_contacts_importContacts) {
                                        if (tL_error.text.startsWith("FLOOD_WAIT")) {
                                            showSimpleAlert(baseFragment, null, LocaleController.getString(R.string.FloodWait), null);
                                            return null;
                                        }
                                        StringBuilder sb5 = new StringBuilder();
                                        zzlf.m(R.string.ErrorOccurred, "\n", sb5);
                                        sb5.append(tL_error.text);
                                        showSimpleAlert(baseFragment, null, sb5.toString(), null);
                                        return null;
                                    }
                                    if ((tLObject instanceof TL_account.getPassword) || (tLObject instanceof TL_account.getTmpPassword)) {
                                        if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                                            showSimpleToast(baseFragment, tL_error.text);
                                            return null;
                                        }
                                        int iIntValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                                        showSimpleToast(baseFragment, LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, iIntValue < 60 ? LocaleController.formatPluralString("Seconds", iIntValue, new Object[0]) : LocaleController.formatPluralString("Minutes", iIntValue / 60, new Object[0])));
                                        return null;
                                    }
                                    if (tLObject instanceof TLRPC.TL_payments_sendPaymentForm) {
                                        String str6 = tL_error.text;
                                        str6.getClass();
                                        if (str6.equals("BOT_PRECHECKOUT_FAILED")) {
                                            showSimpleToast(baseFragment, LocaleController.getString(R.string.PaymentPrecheckoutFailed));
                                            return null;
                                        }
                                        if (str6.equals("PAYMENT_FAILED")) {
                                            showSimpleToast(baseFragment, LocaleController.getString(R.string.PaymentFailed));
                                            return null;
                                        }
                                        showSimpleToast(baseFragment, tL_error.text);
                                        return null;
                                    }
                                    if (tLObject instanceof TLRPC.TL_payments_validateRequestedInfo) {
                                        String str7 = tL_error.text;
                                        str7.getClass();
                                        if (str7.equals("SHIPPING_NOT_AVAILABLE")) {
                                            showSimpleToast(baseFragment, LocaleController.getString(R.string.PaymentNoShippingMethod));
                                            return null;
                                        }
                                        showSimpleToast(baseFragment, tL_error.text);
                                        return null;
                                    }
                                    if (tLObject instanceof TLRPC.TL_payments_assignPlayMarketTransaction) {
                                        StringBuilder sb6 = new StringBuilder();
                                        zzlf.m(R.string.PaymentConfirmationError, "\n", sb6);
                                        sb6.append(tL_error.text);
                                        showSimpleAlert(baseFragment, null, sb6.toString(), null);
                                        return null;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    public static void showAddLinkToPoll(Context context, Theme.ResourcesProvider resourcesProvider, String str, TLRPC.WebPage webPage, final Utilities.Callback callback, ChatAttachAlertPollLayout$$ExternalSyntheticLambda24 chatAttachAlertPollLayout$$ExternalSyntheticLambda24) {
        Activity activityFindActivity = AndroidUtilities.findActivity(context);
        final View currentFocus = activityFindActivity != null ? activityFindActivity.getCurrentFocus() : null;
        final AlertDialog[] alertDialogArr = new AlertDialog[1];
        AlertDialog.Builder builder = new AlertDialog.Builder(context, 0, resourcesProvider);
        String string = LocaleController.getString(R.string.PollV2AddLinkTitle);
        AlertDialog alertDialog = builder.alertDialog;
        alertDialog.title = string;
        alertDialog.message = LocaleController.getString(R.string.PollV2AddLinkMessage);
        final AnonymousClass3 anonymousClass3 = new AnonymousClass3(context);
        anonymousClass3.setTextSize(1, 16.0f);
        int i = Theme.key_dialogTextBlack;
        anonymousClass3.setTextColor(Theme.getColor(i, resourcesProvider));
        anonymousClass3.setHintTextColor(Theme.getColor(Theme.key_groupcreate_hintText, resourcesProvider));
        anonymousClass3.setHint(LocaleController.getString(R.string.PollV2AddLinkUrlHint));
        anonymousClass3.setInputType(17);
        anonymousClass3.setImeOptions(6);
        anonymousClass3.setMaxLines(10);
        anonymousClass3.setSingleLine(false);
        anonymousClass3.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.0f));
        anonymousClass3.setCursorWidth(1.5f);
        anonymousClass3.setCursorColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlueText4, resourcesProvider));
        if (str != null) {
            anonymousClass3.setText(str);
            anonymousClass3.setSelection(str.length());
        }
        anonymousClass3.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
                if (i2 != 6) {
                    return false;
                }
                AlertsCreator.AnonymousClass3 anonymousClass4 = anonymousClass3;
                String strTrim = anonymousClass4.getText().toString().trim();
                if (!(TextUtils.isEmpty(strTrim) ? false : AlertsCreator.URL_PATTERN.matcher(strTrim.trim()).matches())) {
                    AndroidUtilities.shakeView(anonymousClass4);
                    return true;
                }
                callback.run(strTrim);
                AlertDialog alertDialog2 = alertDialogArr[0];
                if (alertDialog2 != null) {
                    alertDialog2.dismiss();
                }
                View view = currentFocus;
                if (view != null) {
                    view.requestFocus();
                }
                return true;
            }
        });
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(AndroidUtilities.dp(22.0f));
        gradientDrawable.setColor(Theme.multAlpha(0.06f, Theme.getColor(i, resourcesProvider)));
        anonymousClass3.setBackground(gradientDrawable);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(anonymousClass3, LayoutHelper.createLinear(24.0f, 4.0f, 24.0f, 9.0f, -1, -2));
        int i2 = WebPagePreviewView.$r8$clinit;
        if (webPage != null && (webPage.site_name != null || webPage.title != null || webPage.description != null || webPage.photo != null || webPage.document != null)) {
            WebPagePreviewView webPagePreviewView = new WebPagePreviewView(context, resourcesProvider);
            webPagePreviewView.setWebPage(webPage);
            linearLayout.addView(webPagePreviewView, LayoutHelper.createLinear(22.0f, 3.0f, 22.0f, 7.0f, -1, -2));
        }
        builder.makeCustomMaxHeight();
        builder.setView(linearLayout);
        alertDialog.customWidth = Math.min(AndroidUtilities.dp(320.0f), (AndroidUtilities.displaySize.x * 85) / 100);
        builder.setPositiveButton(LocaleController.getString(R.string.Done), new ChatActivity$$ExternalSyntheticLambda189(17, anonymousClass3, callback));
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), new EmojiView$$ExternalSyntheticLambda21(9));
        if (chatAttachAlertPollLayout$$ExternalSyntheticLambda24 != null) {
            builder.setNeutralButton(LocaleController.getString(R.string.Delete), new ChatActivity$$ExternalSyntheticLambda356(chatAttachAlertPollLayout$$ExternalSyntheticLambda24, 29));
        }
        alertDialogArr[0] = alertDialog;
        alertDialog.dismissDialogByButtons = false;
        alertDialog.setOnDismissListener(new OAuthSheet$$ExternalSyntheticLambda11(anonymousClass3, 11));
        alertDialogArr[0].setOnShowListener(new AuctionBidSheet$$ExternalSyntheticLambda15(3, anonymousClass3));
        alertDialogArr[0].show();
        TextView textView = (TextView) alertDialogArr[0].getButton(-3);
        if (textView != null) {
            textView.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
        }
    }

    public static void showAddUserAlert(TLRPC.TL_error tL_error, BaseFragment baseFragment, boolean z, boolean z2, TLObject tLObject) {
        int i = 0;
        if (tL_error == null || tL_error.code == 406 || tL_error.text == null || baseFragment == null || baseFragment.getParentActivity() == null) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(baseFragment.getParentActivity(), 0, null);
        String string = LocaleController.getString(R.string.AppName);
        AlertDialog alertDialog = builder.alertDialog;
        alertDialog.title = string;
        String str = tL_error.text;
        str.getClass();
        switch (str) {
            case "CHANNELS_ADMIN_LOCATED_TOO_MUCH":
                alertDialog.message = LocaleController.getString(R.string.LocatedChannelsTooMuch);
                break;
            case "CHANNELS_ADMIN_PUBLIC_TOO_MUCH":
                alertDialog.message = LocaleController.getString(R.string.PublicChannelsTooMuch);
                break;
            case "USERS_TOO_FEW":
                alertDialog.message = LocaleController.getString(R.string.CreateGroupError);
                break;
            case "USER_BLOCKED":
            case "USER_BOT":
            case "USER_ID_INVALID":
                if (z) {
                    alertDialog.message = LocaleController.getString(R.string.ChannelUserCantAdd);
                    break;
                } else {
                    alertDialog.message = LocaleController.getString(R.string.GroupUserCantAdd);
                    break;
                }
                break;
            case "USER_RESTRICTED":
                alertDialog.message = LocaleController.getString(R.string.UserRestricted);
                break;
            case "PEER_FLOOD":
                alertDialog.message = LocaleController.getString(R.string.NobodyLikesSpam2);
                builder.setNegativeButton(LocaleController.getString(R.string.MoreInfo), new AlertsCreator$$ExternalSyntheticLambda46(i, baseFragment));
                break;
            case "BOTS_TOO_MUCH":
                if (z) {
                    alertDialog.message = LocaleController.getString(R.string.ChannelUserCantBot);
                    break;
                } else {
                    alertDialog.message = LocaleController.getString(R.string.GroupUserCantBot);
                    break;
                }
                break;
            case "USER_KICKED":
            case "CHAT_ADMIN_BAN_REQUIRED":
                if (tLObject instanceof TLRPC.TL_channels_inviteToChannel) {
                    alertDialog.message = LocaleController.getString(R.string.AddUserErrorBlacklisted);
                    break;
                } else {
                    alertDialog.message = LocaleController.getString(R.string.AddAdminErrorBlacklisted);
                    break;
                }
                break;
            case "YOU_BLOCKED_USER":
                alertDialog.message = LocaleController.getString(R.string.YouBlockedUser);
                break;
            case "USER_ADMIN_INVALID":
                alertDialog.message = LocaleController.getString(R.string.AddBannedErrorAdmin);
                break;
            case "USERS_TOO_MUCH":
                if (z) {
                    alertDialog.message = LocaleController.getString(R.string.ChannelUserAddLimit);
                    break;
                } else {
                    alertDialog.message = LocaleController.getString(R.string.GroupUserAddLimit);
                    break;
                }
                break;
            case "ADMINS_TOO_MUCH":
                if (z) {
                    alertDialog.message = LocaleController.getString(R.string.ChannelUserCantAdmin);
                    break;
                } else {
                    alertDialog.message = LocaleController.getString(R.string.GroupUserCantAdmin);
                    break;
                }
                break;
            case "CHANNELS_TOO_MUCH":
                alertDialog.title = LocaleController.getString(R.string.ChannelTooMuchTitle);
                if (tLObject instanceof TLRPC.TL_channels_createChannel) {
                    alertDialog.message = LocaleController.getString(R.string.ChannelTooMuch);
                    break;
                } else {
                    alertDialog.message = LocaleController.getString(R.string.ChannelTooMuchJoin);
                    break;
                }
                break;
            case "USER_CHANNELS_TOO_MUCH":
                alertDialog.title = LocaleController.getString(R.string.ChannelTooMuchTitle);
                alertDialog.message = LocaleController.getString(R.string.UserChannelTooMuchJoin);
                break;
            case "USER_NOT_MUTUAL_CONTACT":
                if (z) {
                    alertDialog.message = LocaleController.getString(R.string.ChannelUserLeftError);
                    break;
                } else {
                    alertDialog.message = LocaleController.getString(R.string.GroupUserLeftError);
                    break;
                }
                break;
            case "CHAT_ADMIN_INVITE_REQUIRED":
                alertDialog.message = LocaleController.getString(R.string.AddAdminErrorNotAMember);
                break;
            case "USER_PRIVACY_RESTRICTED":
                if (z2) {
                    alertDialog.message = LocaleController.getString(R.string.InviteToCommunityError);
                    break;
                } else {
                    if (!z) {
                        alertDialog.message = LocaleController.getString(R.string.InviteToGroupError);
                    } else {
                        alertDialog.message = LocaleController.getString(R.string.InviteToChannelError);
                    }
                    break;
                }
                break;
            case "USER_ALREADY_PARTICIPANT":
                alertDialog.title = LocaleController.getString(R.string.VoipGroupVoiceChat);
                alertDialog.message = LocaleController.getString(R.string.VoipGroupInviteAlreadyParticipant);
                break;
            default:
                StringBuilder sb = new StringBuilder();
                zzlf.m(R.string.ErrorOccurred, "\n", sb);
                sb.append(tL_error.text);
                alertDialog.message = sb.toString();
                break;
        }
        builder.setPositiveButton(LocaleController.getString(R.string.OK), null);
        builder.show();
    }

    public static AlertDialog showAlertWithCheckbox(Activity activity, String str, CharSequence charSequence, CharSequence charSequence2, String str2, Utilities.Callback callback, Theme.ResourcesProvider resourcesProvider, boolean z) {
        AlertDialog alertDialog;
        if (activity == null) {
            callback.run(Boolean.FALSE);
            return null;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(activity, 0, resourcesProvider);
        final CheckBoxCell[] checkBoxCellArr = new CheckBoxCell[1];
        boolean[] zArr = new boolean[1];
        AnonymousClass8 anonymousClass8 = new AnonymousClass8(activity);
        NotificationCenter.listenEmojiLoading(anonymousClass8);
        anonymousClass8.setTextColor(Theme.getColor(Theme.key_dialogTextBlack, resourcesProvider));
        anonymousClass8.setTextSize(1, 16.0f);
        anonymousClass8.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        anonymousClass8.setText(charSequence);
        FrameLayout frameLayout = new FrameLayout(activity) {
            @Override
            public final void onMeasure(int i, int i2) {
                super.onMeasure(i, i2);
                CheckBoxCell[] checkBoxCellArr2 = checkBoxCellArr;
                if (checkBoxCellArr2[0] != null) {
                    setMeasuredDimension(getMeasuredWidth(), AndroidUtilities.dp(7.0f) + checkBoxCellArr2[0].getMeasuredHeight() + getMeasuredHeight());
                }
            }
        };
        AlertDialog alertDialog2 = builder.alertDialog;
        alertDialog2.customViewOffset = 6;
        builder.setView(frameLayout);
        TextView textView = new TextView(activity);
        zzlj.m(Theme.key_actionBarDefaultSubmenuItem, resourcesProvider, textView, 20.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setText(str);
        frameLayout.addView(textView, LayoutHelper.createFrame(-1, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 8.0f, 24.0f, 0.0f));
        frameLayout.addView(anonymousClass8, LayoutHelper.createFrame(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 48.0f, 24.0f, 6.0f));
        if (TextUtils.isEmpty(charSequence2)) {
            alertDialog = alertDialog2;
        } else {
            alertDialog = alertDialog2;
            CheckBoxCell checkBoxCell = new CheckBoxCell(activity, 1, 17, false, resourcesProvider);
            checkBoxCellArr[0] = checkBoxCell;
            checkBoxCell.setBackground(Theme.createSelectorDrawable(Theme.getColor(Theme.key_listSelector, resourcesProvider), 7, AndroidUtilities.dp(12.0f)));
            checkBoxCellArr[0].setMultiline(true);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) checkBoxCellArr[0].getCheckBoxView().getLayoutParams();
            layoutParams.topMargin = 0;
            layoutParams.gravity = (LocaleController.isRTL ? 5 : 3) | 16;
            checkBoxCellArr[0].getCheckBoxView().setLayoutParams(layoutParams);
            checkBoxCellArr[0].setText(charSequence2, "", false, false, false);
            checkBoxCellArr[0].setPadding(LocaleController.isRTL ? AndroidUtilities.dp(4.0f) : 0, AndroidUtilities.dp(12.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f));
            frameLayout.addView(checkBoxCellArr[0], LayoutHelper.createFrame(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 0.0f));
            checkBoxCellArr[0].setOnClickListener(new ChatActivity$$ExternalSyntheticLambda342(8, zArr));
        }
        builder.setPositiveButton(str2, new ChatActivity$$ExternalSyntheticLambda189(21, callback, zArr));
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        if (z) {
            alertDialog.needStarsBalance = true;
        }
        alertDialog.show();
        return alertDialog;
    }

    public static void showBlockReportSpamAlert(BaseFragment baseFragment, long j, final TLRPC.User user, final TLRPC.Chat chat, final TLRPC.EncryptedChat encryptedChat, final boolean z, TLRPC.ChatFull chatFull, final MessagesStorage.IntCallback intCallback, Theme.ResourcesProvider resourcesProvider) {
        long j2;
        boolean z2;
        AlertDialog alertDialog;
        AlertDialog alertDialog2;
        Object obj;
        String string;
        final AccountInstance accountInstance;
        final CheckBoxCell[] checkBoxCellArr;
        ?? r14;
        TextView textView;
        CheckBoxCell[] checkBoxCellArr2;
        LinearLayout linearLayout;
        int i;
        CheckBoxCell[] checkBoxCellArr3;
        LinearLayout linearLayout2;
        int i2;
        AlertDialog alertDialog3;
        int iDp;
        int iDp2;
        int i3 = 2;
        if (baseFragment.getParentActivity() == null) {
            return;
        }
        AccountInstance accountInstance2 = baseFragment.getAccountInstance();
        Theme.ResourcesProvider resourcesProvider2 = resourcesProvider;
        AlertDialog.Builder builder = new AlertDialog.Builder(baseFragment.getParentActivity(), 0, resourcesProvider2);
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(baseFragment.getCurrentAccount());
        if (encryptedChat == null) {
            j2 = j;
            if (!NotificationsController$$ExternalSyntheticOutline0.m("dialog_bar_report", j2, notificationsSettings, false)) {
                z2 = false;
            }
            alertDialog = builder.alertDialog;
            if (user != null) {
                alertDialog.title = LocaleController.formatString("BlockUserTitle", R.string.BlockUserTitle, UserObject.getFirstName(user));
                alertDialog.message = AndroidUtilities.replaceTags(LocaleController.formatString("BlockUserAlert", R.string.BlockUserAlert, UserObject.getFirstName(user)));
                string = LocaleController.getString(R.string.BlockContact);
                checkBoxCellArr2 = new CheckBoxCell[2];
                linearLayout = new LinearLayout(baseFragment.getParentActivity());
                linearLayout.setOrientation(1);
                i = 0;
                while (i < i3) {
                    if (i == 0 || z2) {
                        checkBoxCellArr3 = checkBoxCellArr2;
                        linearLayout2 = linearLayout;
                        i2 = i;
                        Theme.ResourcesProvider resourcesProvider3 = resourcesProvider2;
                        alertDialog3 = alertDialog;
                        CheckBoxCell checkBoxCell = new CheckBoxCell(baseFragment.getParentActivity(), 1, 17, false, resourcesProvider3);
                        checkBoxCellArr3[i2] = checkBoxCell;
                        checkBoxCell.setBackgroundDrawable(Theme.getSelectorDrawable(false));
                        checkBoxCellArr3[i2].setTag(Integer.valueOf(i2));
                        if (i2 == 0) {
                            checkBoxCellArr3[i2].setText(LocaleController.getString(R.string.DeleteReportSpam), "", true, false, false);
                        } else {
                            checkBoxCellArr3[i2].setText(LocaleController.formatString("DeleteThisChat", R.string.DeleteThisChat, new Object[0]), "", true, false, false);
                        }
                        CheckBoxCell checkBoxCell2 = checkBoxCellArr3[i2];
                        if (LocaleController.isRTL) {
                            iDp = AndroidUtilities.dp(16.0f);
                        } else {
                            iDp = AndroidUtilities.dp(8.0f);
                        }
                        if (LocaleController.isRTL) {
                            iDp2 = AndroidUtilities.dp(8.0f);
                        } else {
                            iDp2 = AndroidUtilities.dp(16.0f);
                        }
                        checkBoxCell2.setPadding(iDp, 0, iDp2, 0);
                        linearLayout2.addView(checkBoxCellArr3[i2], LayoutHelper.createLinear(-1, -2));
                        checkBoxCellArr3[i2].setOnClickListener(new ProfileActivity$$ExternalSyntheticLambda60(checkBoxCellArr3, 2));
                    } else {
                        i2 = i;
                        alertDialog3 = alertDialog;
                        checkBoxCellArr3 = checkBoxCellArr2;
                        linearLayout2 = linearLayout;
                    }
                    i = i2 + 1;
                    linearLayout = linearLayout2;
                    checkBoxCellArr2 = checkBoxCellArr3;
                    alertDialog = alertDialog3;
                    i3 = 2;
                    resourcesProvider2 = resourcesProvider;
                }
                alertDialog2 = alertDialog;
                obj = null;
                builder.setView(linearLayout);
                checkBoxCellArr = checkBoxCellArr2;
                accountInstance = accountInstance2;
            } else {
                alertDialog2 = alertDialog;
                obj = null;
                if (chat == null && z) {
                    alertDialog2.title = LocaleController.getString(R.string.ReportUnrelatedGroup);
                    if (chatFull != null) {
                        TLRPC.ChannelLocation channelLocation = chatFull.location;
                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                            alertDialog2.message = AndroidUtilities.replaceTags(LocaleController.formatString("ReportUnrelatedGroupText", R.string.ReportUnrelatedGroupText, ((TLRPC.TL_channelLocation) channelLocation).address));
                        } else {
                            alertDialog2.message = LocaleController.getString(R.string.ReportUnrelatedGroupTextNoAddress);
                        }
                    } else {
                        alertDialog2.message = LocaleController.getString(R.string.ReportUnrelatedGroupTextNoAddress);
                    }
                } else {
                    alertDialog2.title = LocaleController.getString(R.string.ReportSpamTitle);
                    if (ChatObject.isChannel(chat) || chat.megagroup) {
                        alertDialog2.message = LocaleController.getString(R.string.ReportSpamAlertGroup);
                    } else {
                        alertDialog2.message = LocaleController.getString(R.string.ReportSpamAlertChannel);
                    }
                }
                string = LocaleController.getString(R.string.ReportChat);
                accountInstance = accountInstance2;
                checkBoxCellArr = null;
            }
            AlertDialog alertDialog4 = alertDialog2;
            final long j3 = j2;
            r14 = obj;
            builder.setPositiveButton(string, new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog5, int i4) {
                    CheckBoxCell checkBoxCell3;
                    TLRPC.User user2 = user;
                    AccountInstance accountInstance3 = accountInstance;
                    if (user2 != null) {
                        accountInstance3.getMessagesController().blockPeer(user2.id);
                    }
                    CheckBoxCell[] checkBoxCellArr4 = checkBoxCellArr;
                    long j4 = j3;
                    TLRPC.Chat chat2 = chat;
                    if (checkBoxCellArr4 == null || ((checkBoxCell3 = checkBoxCellArr4[0]) != null && checkBoxCell3.isChecked())) {
                        accountInstance3.getMessagesController().reportSpam(j4, user2, chat2, encryptedChat, chat2 != null && z);
                    }
                    MessagesStorage.IntCallback intCallback2 = intCallback;
                    if (checkBoxCellArr4 != null && !checkBoxCellArr4[1].isChecked()) {
                        intCallback2.run(0);
                        return;
                    }
                    if (chat2 == null || ChatObject.isNotInChat(chat2)) {
                        accountInstance3.getMessagesController().deleteDialog(j4, 0);
                    } else {
                        accountInstance3.getMessagesController().deleteParticipantFromChat(-j4, accountInstance3.getMessagesController().getUser(Long.valueOf(accountInstance3.getUserConfig().getClientUserId())));
                    }
                    intCallback2.run(1);
                }
            });
            builder.setNegativeButton(LocaleController.getString(R.string.Cancel), r14);
            baseFragment.showDialog(alertDialog4);
            textView = (TextView) alertDialog4.getButton(-1);
            if (textView != null) {
                textView.setTextColor(Theme.getColor(r14, Theme.key_text_RedBold, false));
            }
        }
        j2 = j;
        z2 = true;
        alertDialog = builder.alertDialog;
        if (user != null) {
            alertDialog.title = LocaleController.formatString("BlockUserTitle", R.string.BlockUserTitle, UserObject.getFirstName(user));
            alertDialog.message = AndroidUtilities.replaceTags(LocaleController.formatString("BlockUserAlert", R.string.BlockUserAlert, UserObject.getFirstName(user)));
            string = LocaleController.getString(R.string.BlockContact);
            checkBoxCellArr2 = new CheckBoxCell[2];
            linearLayout = new LinearLayout(baseFragment.getParentActivity());
            linearLayout.setOrientation(1);
            i = 0;
            while (i < i3) {
                if (i == 0) {
                    checkBoxCellArr3 = checkBoxCellArr2;
                    linearLayout2 = linearLayout;
                    i2 = i;
                    Theme.ResourcesProvider resourcesProvider4 = resourcesProvider2;
                    alertDialog3 = alertDialog;
                    CheckBoxCell checkBoxCell3 = new CheckBoxCell(baseFragment.getParentActivity(), 1, 17, false, resourcesProvider4);
                    checkBoxCellArr3[i2] = checkBoxCell3;
                    checkBoxCell3.setBackgroundDrawable(Theme.getSelectorDrawable(false));
                    checkBoxCellArr3[i2].setTag(Integer.valueOf(i2));
                    if (i2 == 0) {
                        checkBoxCellArr3[i2].setText(LocaleController.getString(R.string.DeleteReportSpam), "", true, false, false);
                    } else {
                        checkBoxCellArr3[i2].setText(LocaleController.formatString("DeleteThisChat", R.string.DeleteThisChat, new Object[0]), "", true, false, false);
                    }
                    CheckBoxCell checkBoxCell4 = checkBoxCellArr3[i2];
                    if (LocaleController.isRTL) {
                        iDp = AndroidUtilities.dp(16.0f);
                    } else {
                        iDp = AndroidUtilities.dp(8.0f);
                    }
                    if (LocaleController.isRTL) {
                        iDp2 = AndroidUtilities.dp(8.0f);
                    } else {
                        iDp2 = AndroidUtilities.dp(16.0f);
                    }
                    checkBoxCell4.setPadding(iDp, 0, iDp2, 0);
                    linearLayout2.addView(checkBoxCellArr3[i2], LayoutHelper.createLinear(-1, -2));
                    checkBoxCellArr3[i2].setOnClickListener(new ProfileActivity$$ExternalSyntheticLambda60(checkBoxCellArr3, 2));
                } else {
                    checkBoxCellArr3 = checkBoxCellArr2;
                    linearLayout2 = linearLayout;
                    i2 = i;
                    Theme.ResourcesProvider resourcesProvider5 = resourcesProvider2;
                    alertDialog3 = alertDialog;
                    CheckBoxCell checkBoxCell5 = new CheckBoxCell(baseFragment.getParentActivity(), 1, 17, false, resourcesProvider5);
                    checkBoxCellArr3[i2] = checkBoxCell5;
                    checkBoxCell5.setBackgroundDrawable(Theme.getSelectorDrawable(false));
                    checkBoxCellArr3[i2].setTag(Integer.valueOf(i2));
                    if (i2 == 0) {
                        checkBoxCellArr3[i2].setText(LocaleController.getString(R.string.DeleteReportSpam), "", true, false, false);
                    } else {
                        checkBoxCellArr3[i2].setText(LocaleController.formatString("DeleteThisChat", R.string.DeleteThisChat, new Object[0]), "", true, false, false);
                    }
                    CheckBoxCell checkBoxCell6 = checkBoxCellArr3[i2];
                    if (LocaleController.isRTL) {
                        iDp = AndroidUtilities.dp(16.0f);
                    } else {
                        iDp = AndroidUtilities.dp(8.0f);
                    }
                    if (LocaleController.isRTL) {
                        iDp2 = AndroidUtilities.dp(8.0f);
                    } else {
                        iDp2 = AndroidUtilities.dp(16.0f);
                    }
                    checkBoxCell6.setPadding(iDp, 0, iDp2, 0);
                    linearLayout2.addView(checkBoxCellArr3[i2], LayoutHelper.createLinear(-1, -2));
                    checkBoxCellArr3[i2].setOnClickListener(new ProfileActivity$$ExternalSyntheticLambda60(checkBoxCellArr3, 2));
                }
                i = i2 + 1;
                linearLayout = linearLayout2;
                checkBoxCellArr2 = checkBoxCellArr3;
                alertDialog = alertDialog3;
                i3 = 2;
                resourcesProvider2 = resourcesProvider;
            }
            alertDialog2 = alertDialog;
            obj = null;
            builder.setView(linearLayout);
            checkBoxCellArr = checkBoxCellArr2;
            accountInstance = accountInstance2;
        } else {
            alertDialog2 = alertDialog;
            obj = null;
            if (chat == null) {
                alertDialog2.title = LocaleController.getString(R.string.ReportSpamTitle);
                if (ChatObject.isChannel(chat)) {
                    alertDialog2.message = LocaleController.getString(R.string.ReportSpamAlertGroup);
                } else {
                    alertDialog2.message = LocaleController.getString(R.string.ReportSpamAlertGroup);
                }
            } else {
                alertDialog2.title = LocaleController.getString(R.string.ReportSpamTitle);
                if (ChatObject.isChannel(chat)) {
                    alertDialog2.message = LocaleController.getString(R.string.ReportSpamAlertGroup);
                } else {
                    alertDialog2.message = LocaleController.getString(R.string.ReportSpamAlertGroup);
                }
            }
            string = LocaleController.getString(R.string.ReportChat);
            accountInstance = accountInstance2;
            checkBoxCellArr = null;
        }
        AlertDialog alertDialog5 = alertDialog2;
        final long j4 = j2;
        r14 = obj;
        builder.setPositiveButton(string, new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog6, int i4) {
                CheckBoxCell checkBoxCell7;
                TLRPC.User user2 = user;
                AccountInstance accountInstance3 = accountInstance;
                if (user2 != null) {
                    accountInstance3.getMessagesController().blockPeer(user2.id);
                }
                CheckBoxCell[] checkBoxCellArr4 = checkBoxCellArr;
                long j5 = j4;
                TLRPC.Chat chat2 = chat;
                if (checkBoxCellArr4 == null || ((checkBoxCell7 = checkBoxCellArr4[0]) != null && checkBoxCell7.isChecked())) {
                    accountInstance3.getMessagesController().reportSpam(j5, user2, chat2, encryptedChat, chat2 != null && z);
                }
                MessagesStorage.IntCallback intCallback2 = intCallback;
                if (checkBoxCellArr4 != null && !checkBoxCellArr4[1].isChecked()) {
                    intCallback2.run(0);
                    return;
                }
                if (chat2 == null || ChatObject.isNotInChat(chat2)) {
                    accountInstance3.getMessagesController().deleteDialog(j5, 0);
                } else {
                    accountInstance3.getMessagesController().deleteParticipantFromChat(-j5, accountInstance3.getMessagesController().getUser(Long.valueOf(accountInstance3.getUserConfig().getClientUserId())));
                }
                intCallback2.run(1);
            }
        });
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), r14);
        baseFragment.showDialog(alertDialog5);
        textView = (TextView) alertDialog5.getButton(-1);
        if (textView != null) {
            textView.setTextColor(Theme.getColor(r14, Theme.key_text_RedBold, false));
        }
    }

    public static void showBlockReportSpamReplyAlert(ChatActivity chatActivity, MessageObject messageObject, long j, Theme.ResourcesProvider resourcesProvider, ChatActivity$$ExternalSyntheticLambda22 chatActivity$$ExternalSyntheticLambda22) {
        if (chatActivity == null || chatActivity.getParentActivity() == null || messageObject == null) {
            return;
        }
        AccountInstance accountInstance = chatActivity.getAccountInstance();
        TLRPC.User user = j > 0 ? accountInstance.getMessagesController().getUser(Long.valueOf(j)) : null;
        TLRPC.Chat chat = j < 0 ? accountInstance.getMessagesController().getChat(Long.valueOf(-j)) : null;
        if (user == null && chat == null) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(chatActivity.getParentActivity(), 0, resourcesProvider);
        AlertDialog alertDialog = builder.alertDialog;
        alertDialog.dimEnabled = false;
        alertDialog.onDismissListener = new OAuthSheet$$ExternalSyntheticLambda11(chatActivity$$ExternalSyntheticLambda22, 10);
        alertDialog.title = LocaleController.getString(R.string.BlockUser);
        if (user != null) {
            alertDialog.message = AndroidUtilities.replaceTags(LocaleController.formatString("BlockUserReplyAlert", R.string.BlockUserReplyAlert, UserObject.getFirstName(user)));
        } else {
            alertDialog.message = AndroidUtilities.replaceTags(LocaleController.formatString("BlockUserReplyAlert", R.string.BlockUserReplyAlert, chat.title));
        }
        LinearLayout linearLayout = new LinearLayout(chatActivity.getParentActivity());
        linearLayout.setOrientation(1);
        CheckBoxCell[] checkBoxCellArr = {new CheckBoxCell(chatActivity.getParentActivity(), 1, 17, false, resourcesProvider)};
        checkBoxCellArr[0].setBackgroundDrawable(Theme.getSelectorDrawable(false));
        checkBoxCellArr[0].setTag(0);
        checkBoxCellArr[0].setText(LocaleController.getString(R.string.DeleteReportSpam), "", true, false, false);
        checkBoxCellArr[0].setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), 0);
        linearLayout.addView(checkBoxCellArr[0], LayoutHelper.createLinear(-1, -2));
        checkBoxCellArr[0].setOnClickListener(new ProfileActivity$$ExternalSyntheticLambda60(checkBoxCellArr, 1));
        builder.setView(linearLayout);
        builder.setPositiveButton(LocaleController.getString(R.string.BlockAndDeleteReplies), new PassportActivity$3$$ExternalSyntheticLambda3(user, accountInstance, chatActivity, chat, messageObject, checkBoxCellArr, resourcesProvider));
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        chatActivity.showDialog(alertDialog);
        TextView textView = (TextView) alertDialog.getButton(-1);
        if (textView != null) {
            textView.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
        }
    }

    public static void showCallsForbidden(Context context, int i, long j) {
        BottomSheet bottomSheetM = VoIPService$$ExternalSyntheticOutline0.m(context, null, false, false);
        LinearLayout linearLayoutM = zzkf.m(context, 1);
        linearLayoutM.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        linearLayoutM.addView(frameLayout, LayoutHelper.createLinear(-1, 92, 17, 0, 0, 0, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.story_link);
        imageView.setScaleX(2.0f);
        imageView.setScaleY(2.0f);
        frameLayout2.addView(imageView, LayoutHelper.createFrame(-1, -1, 17));
        frameLayout2.setBackground(Theme.createCircleDrawable(AndroidUtilities.dp(80.0f), Theme.getColor(null, Theme.key_featuredStickers_addButton, false)));
        frameLayout.addView(frameLayout2, LayoutHelper.createFrame(80, 80.0f, 1, 0.0f, 12.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        int i2 = Theme.key_windowBackgroundWhiteBlackText;
        FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline2.m(20.0f, Theme.getColor(null, i2, false), 1, textView);
        zzkg.m(R.string.CallForbiddenInviteLinkTitle, textView, 17);
        TextView textViewM = ArticleViewer.IBlock.CC.m(linearLayoutM, textView, LayoutHelper.createLinear(32.0f, 16.0f, 32.0f, 8.0f, -1, -2), context);
        textViewM.setTextColor(Theme.getColor(null, i2, false));
        textViewM.setTextSize(1, 14.0f);
        textViewM.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.CallForbiddenInviteLinkText, DialogObject.getName(i, j))));
        textViewM.setGravity(17);
        linearLayoutM.addView(textViewM, LayoutHelper.createLinear(32.0f, 0.0f, 32.0f, 18.0f, -1, -2));
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, null, true);
        buttonWithCounterView.setText(LocaleController.getString(R.string.CallForbiddenInviteLinkButton), false, true);
        linearLayoutM.addView(buttonWithCounterView, LayoutHelper.createLinear(0.0f, 0.0f, 0.0f, 0.0f, -1, 48));
        bottomSheetM.customView = linearLayoutM;
        buttonWithCounterView.setOnClickListener(new AlertsCreator$$ExternalSyntheticLambda26(i, buttonWithCounterView, bottomSheetM, j));
        bottomSheetM.fixNavigationBar();
        bottomSheetM.show();
    }

    public static void showFloodWaitAlert(BaseFragment baseFragment, String str) {
        if (str == null || !str.startsWith("FLOOD_WAIT") || baseFragment == null || baseFragment.getParentActivity() == null) {
            return;
        }
        int iIntValue = Utilities.parseInt((CharSequence) str).intValue();
        String pluralString = iIntValue < 60 ? LocaleController.formatPluralString("Seconds", iIntValue, new Object[0]) : LocaleController.formatPluralString("Minutes", iIntValue / 60, new Object[0]);
        AlertDialog.Builder builder = new AlertDialog.Builder(baseFragment.getParentActivity(), 0, null);
        String string = LocaleController.getString(R.string.AppName);
        AlertDialog alertDialog = builder.alertDialog;
        alertDialog.title = string;
        alertDialog.message = LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, pluralString);
        builder.setPositiveButton(LocaleController.getString(R.string.OK), null);
        baseFragment.showDialog(alertDialog, true, null);
    }

    public static void showGiftThemeApplyConfirm(int i, long j, Context context, Runnable runnable, TL_stars.TL_starGiftUnique tL_starGiftUnique, Theme.ResourcesProvider resourcesProvider) {
        TLObject userOrChat = MessagesController.getInstance(i).getUserOrChat(j);
        LinearLayout linearLayoutM = zzkf.m(context, 1);
        linearLayoutM.addView(new StarGiftSheet.GiftThemeReuseTopView(context, tL_starGiftUnique, userOrChat), LayoutHelper.createLinear(-1, -2, 48, 0, -4, 0, 0));
        TextView textView = new TextView(context);
        OKLCH.m(Theme.key_dialogTextBlack, resourcesProvider, textView, 16.0f);
        zzko.m(R.string.GiftThemesSetInReuseInfo, new Object[]{DialogObject.getDialogTitle(userOrChat)}, textView);
        linearLayoutM.addView(textView, LayoutHelper.createLinear(-1, -2, 48, 24, 0, 24, 4));
        AlertDialog.Builder builder = new AlertDialog.Builder(context, 0, resourcesProvider);
        builder.setView(linearLayoutM);
        builder.setPositiveButton(LocaleController.getString(R.string.GiftThemesSetInReuseConfirm), new ChatActivity$$ExternalSyntheticLambda177(4, runnable));
        ArticleViewer.IBlock.CC.m(R.string.Cancel, builder, (AlertDialog.OnButtonClickListener) null);
    }

    public static void showOpenExternalBrowserAlert(Activity activity, Theme.ResourcesProvider resourcesProvider, String str, boolean z, final Utilities.Callback2 callback2) {
        if (AndroidUtilities.isContextSafe(activity)) {
            final AlertDialog[] alertDialogArr = new AlertDialog[1];
            AlertDialog.Builder builder = new AlertDialog.Builder(activity, 0, resourcesProvider);
            String string = LocaleController.getString(R.string.OpenUrlTitle);
            AlertDialog alertDialog = builder.alertDialog;
            alertDialog.title = string;
            TextView textView = new TextView(activity);
            textView.setText(str);
            textView.setTextSize(1, 14.0f);
            int i = Theme.key_dialogTextBlack;
            textView.setTextColor(Theme.getColor(i, resourcesProvider));
            textView.setGravity(17);
            textView.setMaxLines(5);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(12.0f));
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(AndroidUtilities.dp(22.0f));
            gradientDrawable.setColor(Theme.multAlpha(0.06f, Theme.getColor(i, resourcesProvider)));
            textView.setBackground(gradientDrawable);
            final CheckBoxCell checkBoxCell = new CheckBoxCell(activity, 1, 17, false, resourcesProvider);
            checkBoxCell.setMultiline(true);
            checkBoxCell.getTextView().getLayoutParams().width = -1;
            checkBoxCell.getTextView().setSingleLine(false);
            checkBoxCell.getTextView().setMaxLines(3);
            checkBoxCell.getTextView().setTextSize(1, 16.0f);
            checkBoxCell.setText(LocaleController.getString(z ? R.string.BrowserAlwaysOpenExternal : R.string.BrowserAlwaysOpenInApp), "", false, false, false);
            checkBoxCell.setOnClickListener(new LiveCommentsView$$ExternalSyntheticLambda25(checkBoxCell, 1));
            LinearLayout linearLayout = new LinearLayout(activity);
            linearLayout.setOrientation(1);
            linearLayout.addView(textView, LayoutHelper.createLinear(22.0f, 4.0f, 22.0f, 9.0f, -1, -2));
            linearLayout.addView(checkBoxCell, LayoutHelper.createLinear(-1, -2, 3, 8, 6, 8, 4));
            builder.setView(linearLayout);
            alertDialog.customWidth = Math.min(AndroidUtilities.dp(320.0f), (AndroidUtilities.displaySize.x * 85) / 100);
            final int i2 = 0;
            builder.setPositiveButton(LocaleController.getString(R.string.Open), new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog2, int i3) {
                    switch (i2) {
                        case 0:
                            callback2.run(Boolean.TRUE, Boolean.valueOf(checkBoxCell.isChecked()));
                            AlertDialog alertDialog3 = alertDialogArr[0];
                            if (alertDialog3 != null) {
                                alertDialog3.dismiss();
                            }
                            break;
                        default:
                            callback2.run(Boolean.FALSE, Boolean.valueOf(checkBoxCell.isChecked()));
                            AlertDialog alertDialog4 = alertDialogArr[0];
                            if (alertDialog4 != null) {
                                alertDialog4.dismiss();
                            }
                            break;
                    }
                }
            });
            final int i3 = 1;
            builder.setNegativeButton(LocaleController.getString(R.string.Cancel), new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog2, int i4) {
                    switch (i3) {
                        case 0:
                            callback2.run(Boolean.TRUE, Boolean.valueOf(checkBoxCell.isChecked()));
                            AlertDialog alertDialog3 = alertDialogArr[0];
                            if (alertDialog3 != null) {
                                alertDialog3.dismiss();
                            }
                            break;
                        default:
                            callback2.run(Boolean.FALSE, Boolean.valueOf(checkBoxCell.isChecked()));
                            AlertDialog alertDialog4 = alertDialogArr[0];
                            if (alertDialog4 != null) {
                                alertDialog4.dismiss();
                            }
                            break;
                    }
                }
            });
            alertDialogArr[0] = builder.show();
        }
    }

    public static void showOpenUrlAlert(BaseFragment baseFragment, String str, boolean z, boolean z2) {
        showOpenUrlAlert(baseFragment, str, z, z2, false, null, null, null);
    }

    public static void showSecretLocationAlert(Activity activity, int i, Runnable runnable, boolean z, Theme.ResourcesProvider resourcesProvider) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i2 = MessagesController.getInstance(i).availableMapProviders;
        if ((i2 & 1) != 0) {
            ChatActivity$$ExternalSyntheticOutline2.m(R.string.MapPreviewProviderTelegram, 0, arrayList, arrayList2);
        }
        if ((i2 & 2) != 0) {
            ChatActivity$$ExternalSyntheticOutline2.m(R.string.MapPreviewProviderGoogle, 1, arrayList, arrayList2);
        }
        if ((i2 & 4) != 0) {
            ChatActivity$$ExternalSyntheticOutline2.m(R.string.MapPreviewProviderYandex, 3, arrayList, arrayList2);
        }
        arrayList.add(LocaleController.getString(R.string.MapPreviewProviderNobody));
        arrayList2.add(2);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity, 0, resourcesProvider);
        builder.alertDialog.title = LocaleController.getString(R.string.MapPreviewProviderTitle);
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        builder.setView(linearLayout);
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            RadioColorCell radioColorCell = new RadioColorCell(activity, resourcesProvider);
            radioColorCell.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            radioColorCell.setTag(Integer.valueOf(i3));
            radioColorCell.setCheckColor(Theme.getColor(null, Theme.key_radioBackground, false), Theme.getColor(null, Theme.key_dialogRadioBackgroundChecked, false));
            radioColorCell.setTextAndValue((CharSequence) arrayList.get(i3), SharedConfig.mapPreviewType == ((Integer) arrayList2.get(i3)).intValue());
            radioColorCell.setBackground(Theme.createSelectorDrawable(Theme.getColor(null, Theme.key_listSelector, false), 2, -1));
            linearLayout.addView(radioColorCell);
            radioColorCell.setOnClickListener(new ChatActivity$$ExternalSyntheticLambda62(arrayList2, runnable, builder, 13));
        }
        if (!z) {
            builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        }
        AlertDialog alertDialogShow = builder.show();
        if (z) {
            alertDialogShow.setCanceledOnTouchOutside(false);
        }
    }

    public static void showSendMediaAlert(int i, BaseFragment baseFragment, Theme.ResourcesProvider resourcesProvider) {
        if (i == 0 || baseFragment == null || baseFragment.getParentActivity() == null) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(baseFragment.getParentActivity(), 0, resourcesProvider);
        String string = LocaleController.getString(R.string.UnableForward);
        AlertDialog alertDialog = builder.alertDialog;
        alertDialog.title = string;
        if (i == 1) {
            alertDialog.message = LocaleController.getString(R.string.ErrorSendRestrictedStickers);
        } else if (i == 2) {
            alertDialog.message = LocaleController.getString(R.string.ErrorSendRestrictedMedia);
        } else if (i == 3) {
            alertDialog.message = LocaleController.getString(R.string.ErrorSendRestrictedPolls);
        } else if (i == 4) {
            alertDialog.message = LocaleController.getString(R.string.ErrorSendRestrictedStickersAll);
        } else if (i == 5) {
            alertDialog.message = LocaleController.getString(R.string.ErrorSendRestrictedMediaAll);
        } else if (i == 6) {
            alertDialog.message = LocaleController.getString(R.string.ErrorSendRestrictedPollsAll);
        } else if (i == 7) {
            alertDialog.message = LocaleController.getString(R.string.ErrorSendRestrictedPrivacyVoiceMessages);
        } else if (i == 8) {
            alertDialog.message = LocaleController.getString(R.string.ErrorSendRestrictedPrivacyVideoMessages);
        } else if (i == 9) {
            alertDialog.message = LocaleController.getString(R.string.ErrorSendRestrictedVideoAll);
        } else if (i == 10) {
            alertDialog.message = LocaleController.getString(R.string.ErrorSendRestrictedPhotoAll);
        } else if (i == 11) {
            alertDialog.message = LocaleController.getString(R.string.ErrorSendRestrictedVideo);
        } else if (i == 12) {
            alertDialog.message = LocaleController.getString(R.string.ErrorSendRestrictedPhoto);
        } else if (i == 13) {
            alertDialog.message = LocaleController.getString(R.string.ErrorSendRestrictedVoiceAll);
        } else if (i == 14) {
            alertDialog.message = LocaleController.getString(R.string.ErrorSendRestrictedVoice);
        } else if (i == 15) {
            alertDialog.message = LocaleController.getString(R.string.ErrorSendRestrictedRoundAll);
        } else if (i == 16) {
            alertDialog.message = LocaleController.getString(R.string.ErrorSendRestrictedRound);
        } else if (i == 17) {
            alertDialog.message = LocaleController.getString(R.string.ErrorSendRestrictedDocumentsAll);
        } else if (i == 18) {
            alertDialog.message = LocaleController.getString(R.string.ErrorSendRestrictedDocuments);
        } else if (i == 19) {
            alertDialog.message = LocaleController.getString(R.string.ErrorSendRestrictedMusicAll);
        } else if (i == 20) {
            alertDialog.message = LocaleController.getString(R.string.ErrorSendRestrictedMusic);
        } else if (i == 21) {
            alertDialog.message = LocaleController.getString(R.string.ErrorSendRestrictedTodoAll);
        } else if (i == 22) {
            alertDialog.message = LocaleController.getString(R.string.ErrorSendRestrictedTodo);
        }
        builder.setPositiveButton(LocaleController.getString(R.string.OK), null);
        baseFragment.showDialog(alertDialog, true, null);
    }

    public static AlertDialog showSimpleAlert(BaseFragment baseFragment, String str, String str2, Theme.ResourcesProvider resourcesProvider) {
        if (baseFragment == null) {
            baseFragment = LaunchActivity.getSafeLastFragment();
        }
        if (str2 == null || baseFragment == null || baseFragment.getParentActivity() == null) {
            return null;
        }
        AlertDialog alertDialog = createSimpleAlert(baseFragment.getParentActivity(), str, str2, null, null, resourcesProvider).alertDialog;
        baseFragment.showDialog(alertDialog);
        return alertDialog;
    }

    public static AlertDialog showSimpleConfirmAlert(BaseFragment baseFragment, String str, CharSequence charSequence, String str2, boolean z, Runnable runnable) {
        TextView textView;
        AlertDialog alertDialogCreateSimpleConfirmAlert = createSimpleConfirmAlert(baseFragment.getContext(), baseFragment.getResourceProvider(), str, charSequence, str2, runnable);
        baseFragment.showDialog(alertDialogCreateSimpleConfirmAlert);
        if (z && (textView = (TextView) alertDialogCreateSimpleConfirmAlert.getButton(-1)) != null) {
            textView.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
        }
        return alertDialogCreateSimpleConfirmAlert;
    }

    public static void showSimpleToast(BaseFragment baseFragment, String str) {
        if (str == null) {
            return;
        }
        Toast.makeText((baseFragment == null || baseFragment.getParentActivity() == null) ? ApplicationLoader.applicationContext : baseFragment.getParentActivity(), str, 1).show();
    }

    public static AlertDialog showUpdateAppAlert(Context context, String str, boolean z) {
        if (context == null || str == null) {
            return null;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(context, 0, null);
        String string = LocaleController.getString(R.string.AppName);
        AlertDialog alertDialog = builder.alertDialog;
        alertDialog.title = string;
        alertDialog.message = str;
        builder.setPositiveButton(LocaleController.getString(R.string.OK), null);
        if (z) {
            builder.setNegativeButton(LocaleController.getString(R.string.UpdateApp), new BotLocation$$ExternalSyntheticLambda10(context, 1));
        }
        return builder.show();
    }

    public static boolean checkScheduleDate(TextView textView, TextView textView2, long j, long j2, int i, NumberPicker numberPicker, NumberPicker numberPicker2, NumberPicker numberPicker3) {
        long timeInMillis;
        int i2;
        int iBetween;
        int i3;
        boolean z;
        boolean z2;
        String pluralString;
        int i4;
        int value = numberPicker.getValue();
        int value2 = numberPicker2.getValue();
        int value3 = numberPicker3.getValue();
        Calendar calendar = Calendar.getInstance();
        long jCurrentTimeMillis = System.currentTimeMillis();
        calendar.setTimeInMillis(jCurrentTimeMillis);
        int i5 = calendar.get(1);
        calendar.get(6);
        if (j2 > 0) {
            calendar.setTimeInMillis((j2 * 1000) + jCurrentTimeMillis);
            calendar.set(11, 23);
            calendar.set(12, 59);
            calendar.set(13, 59);
            calendar.set(14, 0);
            iBetween = (int) ChronoUnit.DAYS.between(Instant.ofEpochMilli(jCurrentTimeMillis).atZone(ZoneId.systemDefault()).d(), Instant.ofEpochMilli(calendar.getTimeInMillis()).atZone(ZoneId.systemDefault()).d());
            timeInMillis = calendar.getTimeInMillis();
            i2 = 23;
            i3 = 59;
        } else {
            timeInMillis = j2;
            i2 = 0;
            iBetween = 0;
            i3 = 0;
        }
        long millis = j > 0 ? TimeUnit.SECONDS.toMillis(j) : 60000L;
        long j3 = jCurrentTimeMillis + millis;
        calendar.setTimeInMillis(j3);
        int i6 = calendar.get(11);
        int i7 = calendar.get(12);
        long j4 = timeInMillis;
        calendar.setTimeInMillis(System.currentTimeMillis());
        calendar.add(6, value);
        calendar.set(11, value2);
        calendar.set(12, value3);
        calendar.set(13, 0);
        calendar.set(14, 0);
        long timeInMillis2 = calendar.getTimeInMillis();
        numberPicker.setMinValue(0);
        if (j4 > 0) {
            numberPicker.setMaxValue(iBetween);
        }
        int value4 = numberPicker.getValue();
        numberPicker2.setMinValue(value4 == 0 ? i6 : 0);
        if (j4 > 0) {
            numberPicker2.setMaxValue(value4 == iBetween ? i2 : 23);
        }
        int value5 = numberPicker2.getValue();
        numberPicker3.setMinValue((value4 == 0 && value5 == i6) ? i7 : 0);
        if (j4 > 0) {
            numberPicker3.setMaxValue((value4 == iBetween && value5 == i2) ? i3 : 59);
        }
        int value6 = numberPicker3.getValue();
        if (timeInMillis2 <= j3) {
            calendar.setTimeInMillis(j3);
        } else if (j4 > 0 && timeInMillis2 > j4) {
            calendar.setTimeInMillis(j4);
        }
        int i8 = calendar.get(1);
        calendar.setTimeInMillis(System.currentTimeMillis());
        calendar.add(6, value4);
        calendar.set(11, value5);
        calendar.set(12, value6);
        calendar.set(13, 0);
        calendar.set(14, 0);
        long timeInMillis3 = calendar.getTimeInMillis();
        if (textView != null) {
            if (value4 == 0) {
                i4 = 0;
            } else {
                i4 = i5 == i8 ? 1 : 2;
            }
            textView.setText(LocaleController.getInstance().getFormatterScheduleSend((i * 3) + i4).format(timeInMillis3));
        }
        if (textView2 != null) {
            int i9 = (int) ((timeInMillis3 - jCurrentTimeMillis) / 1000);
            if (i9 > 86400) {
                z2 = false;
                pluralString = LocaleController.formatPluralString("DaysSchedule", Math.round(i9 / 86400.0f), new Object[0]);
            } else {
                z2 = false;
                z2 = false;
                z2 = false;
                if (i9 >= 3600) {
                    pluralString = LocaleController.formatPluralString("HoursSchedule", Math.round(i9 / 3600.0f), new Object[0]);
                } else {
                    pluralString = i9 >= 60 ? LocaleController.formatPluralString("MinutesSchedule", Math.round(i9 / 60.0f), new Object[0]) : LocaleController.formatPluralString("SecondsSchedule", i9, new Object[0]);
                }
            }
            if (textView2.getTag() != null) {
                int i10 = R.string.VoipChannelScheduleInfo;
                z = true;
                Object[] objArr = new Object[1];
                objArr[z2 ? 1 : 0] = pluralString;
                textView2.setText(LocaleController.formatString("VoipChannelScheduleInfo", i10, objArr));
            } else {
                z = true;
                int i11 = R.string.VoipGroupScheduleInfo;
                Object[] objArr2 = new Object[1];
                objArr2[z2 ? 1 : 0] = pluralString;
                textView2.setText(LocaleController.formatString("VoipGroupScheduleInfo", i11, objArr2));
            }
        } else {
            z = true;
            z2 = false;
        }
        return timeInMillis2 - jCurrentTimeMillis > millis ? z : z2;
    }

    public static void createClearOrDeleteDialogAlert(final BaseFragment baseFragment, final boolean z, final boolean z2, TLRPC.Chat chat, final TLRPC.User user, final boolean z3, final boolean z4, boolean z5, final boolean z6, final MessagesStorage.BooleanCallback booleanCallback, final Theme.ResourcesProvider resourcesProvider) {
        float f;
        float f2;
        TLRPC.Chat chat2;
        boolean z7;
        AlertDialog alertDialog;
        boolean[] zArr;
        boolean z8;
        int iDp;
        int iDp2;
        QrActivity$$ExternalSyntheticLambda15 qrActivity$$ExternalSyntheticLambda15;
        TLRPC.Chat chat3;
        TLRPC.Chat chat4;
        String string;
        String string2;
        String string3;
        TextView textView;
        if (baseFragment == null || baseFragment.getParentActivity() == null) {
            return;
        }
        if (chat == null && user == null) {
            return;
        }
        int currentAccount = baseFragment.getCurrentAccount();
        final Activity parentActivity = baseFragment.getParentActivity();
        final AlertDialog.Builder builder = new AlertDialog.Builder(parentActivity, 0, resourcesProvider);
        long clientUserId = UserConfig.getInstance(currentAccount).getClientUserId();
        final CheckBoxCell[] checkBoxCellArr = new CheckBoxCell[1];
        AnonymousClass10 anonymousClass10 = new AnonymousClass10(parentActivity);
        NotificationCenter.listenEmojiLoading(anonymousClass10);
        anonymousClass10.setTextColor(Theme.getColor(null, Theme.key_dialogTextBlack, false));
        anonymousClass10.setTextSize(1, 16.0f);
        anonymousClass10.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        boolean z9 = !z6 && ChatObject.isChannel(chat) && ChatObject.isPublic(chat);
        FrameLayout frameLayout = new FrameLayout(parentActivity) {
            @Override
            public final void onMeasure(int i, int i2) {
                super.onMeasure(i, i2);
                CheckBoxCell[] checkBoxCellArr2 = checkBoxCellArr;
                if (checkBoxCellArr2[0] != null) {
                    setMeasuredDimension(getMeasuredWidth(), AndroidUtilities.dp(7.0f) + checkBoxCellArr2[0].getMeasuredHeight() + getMeasuredHeight());
                }
            }
        };
        AlertDialog alertDialog2 = builder.alertDialog;
        alertDialog2.customViewOffset = 6;
        builder.setView(frameLayout);
        AvatarDrawable avatarDrawable = new AvatarDrawable((Theme.ResourcesProvider) null);
        avatarDrawable.namePaint.setTextSize(AndroidUtilities.dp(18.0f));
        BackupImageView backupImageView = new BackupImageView(parentActivity);
        backupImageView.setRoundRadius(AndroidUtilities.dp(15.0f));
        frameLayout.addView(backupImageView, LayoutHelper.createFrame(30, 30.0f, (LocaleController.isRTL ? 5 : 3) | 48, 22.0f, 5.0f, 22.0f, 0.0f));
        AnimatedTextView animatedTextView = new AnimatedTextView(parentActivity, false, false, false);
        animatedTextView.setTextColor(Theme.getColor(null, Theme.key_actionBarDefaultSubmenuItem, false));
        animatedTextView.setTextSize(AndroidUtilities.dp(20.0f));
        animatedTextView.setTypeface(AndroidUtilities.bold());
        animatedTextView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        animatedTextView.setEllipsizeByGradient(true);
        if (z) {
            if (z9) {
                animatedTextView.setText(LocaleController.getString(R.string.ClearHistoryCache));
            } else {
                animatedTextView.setText(LocaleController.getString(R.string.ClearHistory));
            }
        } else if (chat == null) {
            animatedTextView.setText(LocaleController.getString(R.string.DeleteChatUser));
        } else if (ChatObject.isCommunity(chat)) {
            animatedTextView.setText(LocaleController.getString(R.string.CommunityDelete));
        } else if (!ChatObject.isChannel(chat)) {
            animatedTextView.setText(LocaleController.getString(R.string.LeaveMega));
        } else if (chat.monoforum) {
            animatedTextView.setText(LocaleController.getString(R.string.LeaveConversationMenu));
        } else if (chat.megagroup) {
            animatedTextView.setText(LocaleController.getString(R.string.LeaveMega));
        } else {
            animatedTextView.setText(LocaleController.getString(R.string.LeaveChannel));
        }
        boolean z10 = LocaleController.isRTL;
        frameLayout.addView(animatedTextView, LayoutHelper.createFrame(-1, 24.0f, (z10 ? 5 : 3) | 48, z10 ? 22 : 65, 7.66f, z10 ? 65 : 22, 0.0f));
        frameLayout.addView(anonymousClass10, LayoutHelper.createFrame(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 49.0f, 24.0f, 1.0f));
        TLRPC.Chat monoForumLinkedChat = ChatObject.isMonoForum(chat) ? baseFragment.getMessagesController().getMonoForumLinkedChat(chat.id) : null;
        boolean z11 = !z3 && user != null && (user != null && !user.bot && (user.id > clientUserId ? 1 : (user.id == clientUserId ? 0 : -1)) != 0 && MessagesController.getInstance(currentAccount).canRevokePmInbox) && (user != null ? MessagesController.getInstance(currentAccount).revokeTimePmLimit : MessagesController.getInstance(currentAccount).revokeTimeLimit) == Integer.MAX_VALUE;
        boolean[] zArr2 = new boolean[1];
        ArrayList arrayList = user != null ? (ArrayList) MessagesController.getInstance(currentAccount).dialogMessage.get(user.id) : null;
        boolean z12 = (arrayList == null || arrayList.size() != 1 || arrayList.get(0) == null || ((MessageObject) arrayList.get(0)).messageOwner == null || (!(((MessageObject) arrayList.get(0)).messageOwner.action instanceof TLRPC.TL_messageActionUserJoined) && !(((MessageObject) arrayList.get(0)).messageOwner.action instanceof TLRPC.TL_messageActionContactSignUp))) ? false : true;
        if (user != null && user.bot) {
            f2 = 10.0f;
            if (user.id != 489000) {
                anonymousClass10 = anonymousClass10;
                CheckBoxCell checkBoxCell = new CheckBoxCell(parentActivity, 1, 17, false, resourcesProvider);
                checkBoxCellArr[0] = checkBoxCell;
                checkBoxCell.setBackground(Theme.getSelectorDrawable(false));
                checkBoxCellArr[0].setText(LocaleController.getString(R.string.BlockBot), "", false, false, false);
                checkBoxCellArr[0].setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), AndroidUtilities.dp(10.0f), LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), AndroidUtilities.dp(10.0f));
                CheckBoxCell checkBoxCell2 = checkBoxCellArr[0];
                zArr2[0] = true;
                checkBoxCell2.setChecked(true, false);
                checkBoxCellArr[0].setMultiline(true);
                frameLayout.addView(checkBoxCellArr[0], LayoutHelper.createFrame(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
                zArr2 = zArr2;
                checkBoxCellArr[0].setOnClickListener(new ChatActivity$$ExternalSyntheticLambda342(6, zArr2));
                chat2 = chat;
                alertDialog = alertDialog2;
                z7 = false;
            } else {
                f = 16.0f;
            }
            zArr = zArr2;
            if (user == null) {
                int currentAccount2 = baseFragment.getCurrentAccount();
                if (monoForumLinkedChat != null) {
                    chat3 = monoForumLinkedChat;
                } else {
                    chat3 = chat2;
                }
                avatarDrawable.setInfo(currentAccount2, chat3);
                if (monoForumLinkedChat != null) {
                    chat4 = monoForumLinkedChat;
                } else {
                    chat4 = chat2;
                }
                backupImageView.imageReceiver.setForUserOrChat(chat4, avatarDrawable);
                backupImageView.onNewImageSet();
            } else if (UserObject.isReplyUser(user)) {
                avatarDrawable.scaleSize = 0.8f;
                avatarDrawable.setAvatarType(12);
                backupImageView.setImage(null, null, avatarDrawable, user);
            } else if (user.id == clientUserId) {
                avatarDrawable.scaleSize = 0.8f;
                avatarDrawable.setAvatarType(1);
                backupImageView.setImage(null, null, avatarDrawable, user);
            } else {
                avatarDrawable.scaleSize = 1.0f;
                avatarDrawable.setInfo(baseFragment.getCurrentAccount(), user);
                backupImageView.imageReceiver.setForUserOrChat(user, avatarDrawable);
                backupImageView.onNewImageSet();
            }
            if (z2) {
                if (UserObject.isUserSelf(user)) {
                    anonymousClass10.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.DeleteAllMessagesSavedAlert)));
                } else if (chat2 == null && ChatObject.isChannelAndNotMegaGroup(chat2)) {
                    anonymousClass10.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.DeleteAllMessagesChannelAlert)));
                } else {
                    anonymousClass10.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.DeleteAllMessagesAlert)));
                }
            } else if (z) {
                if (user == null) {
                    if (monoForumLinkedChat != null) {
                        string2 = LocaleController.formatString(R.string.MonoforumTitle, monoForumLinkedChat.title);
                    } else {
                        string2 = chat2.title;
                    }
                    if (ChatObject.isChannel(chat2) || (chat2.megagroup && !ChatObject.isPublic(chat2))) {
                        anonymousClass10.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureClearHistoryWithChat, string2)));
                    } else if (chat2.megagroup) {
                        anonymousClass10.setText(LocaleController.getString(R.string.AreYouSureClearHistoryGroup));
                    } else {
                        anonymousClass10.setText(LocaleController.getString(R.string.AreYouSureClearHistoryChannel));
                    }
                } else if (z3) {
                    anonymousClass10.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureClearHistoryWithSecretUser, UserObject.getUserName(user))));
                } else if (user.id == clientUserId) {
                    anonymousClass10.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.AreYouSureClearHistorySavedMessages)));
                } else {
                    anonymousClass10.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureClearHistoryWithUser, UserObject.getUserName(user))));
                }
            } else if (user != null) {
                if (z3) {
                    anonymousClass10.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureDeleteThisChatWithSecretUser, UserObject.getUserName(user))));
                } else if (user.id == clientUserId) {
                    anonymousClass10.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.AreYouSureDeleteThisChatSavedMessages)));
                } else if (user.bot || user.support) {
                    anonymousClass10.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureDeleteThisChatWithUser, UserObject.getUserName(user))));
                } else {
                    anonymousClass10.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureDeleteThisChatWithBotWithCheckmark, UserObject.getUserName(user))));
                }
            } else if (ChatObject.isChannel(chat2)) {
                if (monoForumLinkedChat != null) {
                    string = LocaleController.formatString(R.string.MonoforumTitle, monoForumLinkedChat.title);
                } else {
                    string = chat2.title;
                }
                if (chat2.megagroup) {
                    anonymousClass10.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.MegaLeaveAlertWithName, string)));
                } else {
                    anonymousClass10.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.ChannelLeaveAlertWithName, string)));
                }
            } else {
                anonymousClass10.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureDeleteAndExitName, chat2.title)));
            }
            if (!z2) {
                if (z) {
                    if (z9) {
                        string3 = LocaleController.getString(R.string.ClearHistoryCache);
                    } else {
                        string3 = LocaleController.getString(R.string.ClearForMe);
                    }
                } else if (!z7 && zArr[0]) {
                    string3 = LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat2) ? R.string.ChannelDelete : R.string.DeleteMega);
                } else if (!ChatObject.isChannel(chat2)) {
                    string3 = LocaleController.getString(R.string.DeleteChatUser);
                } else if (chat2.monoforum) {
                    string3 = LocaleController.getString(R.string.LeaveConversationMenu);
                } else if (chat2.megagroup) {
                    string3 = LocaleController.getString(R.string.LeaveMegaMenu);
                } else {
                    string3 = LocaleController.getString(R.string.LeaveChannelMenu);
                }
                final TLRPC.Chat chat5 = chat2;
                final boolean[] zArr3 = zArr;
                final int i = currentAccount;
                final boolean z13 = z9;
                builder.setPositiveButton(string3, new AlertDialog.OnButtonClickListener() {
                    @Override
                    public final void onClick(AlertDialog alertDialog3, int i2) {
                        final boolean[] zArr4 = zArr3;
                        final MessagesStorage.BooleanCallback booleanCallback2 = booleanCallback;
                        boolean z14 = z13;
                        final boolean z15 = z2;
                        boolean z16 = true;
                        if (!z14 && !z15 && !z3) {
                            final TLRPC.User user2 = user;
                            boolean zIsUserSelf = UserObject.isUserSelf(user2);
                            final BaseFragment baseFragment2 = baseFragment;
                            final boolean z17 = z;
                            final TLRPC.Chat chat6 = chat5;
                            final boolean z18 = z4;
                            final boolean z19 = z6;
                            final Theme.ResourcesProvider resourcesProvider2 = resourcesProvider;
                            if (zIsUserSelf) {
                                AlertsCreator.createClearOrDeleteDialogAlert(baseFragment2, z17, true, chat6, user2, false, z18, zArr4[0], z19, booleanCallback2, resourcesProvider2);
                                return;
                            }
                            if (user2 != null && zArr4[0]) {
                                MessagesStorage.getInstance(baseFragment2.getCurrentAccount()).getMessagesCount(user2.id, new MessagesStorage.IntCallback() {
                                    @Override
                                    public final void run(int i3) {
                                        boolean[] zArr5 = zArr4;
                                        MessagesStorage.BooleanCallback booleanCallback3 = booleanCallback2;
                                        if (i3 >= 50) {
                                            AlertsCreator.createClearOrDeleteDialogAlert(baseFragment2, z17, true, chat6, user2, false, z18, zArr5[0], z19, booleanCallback3, resourcesProvider2);
                                        } else if (booleanCallback3 != null) {
                                            booleanCallback3.run(zArr5[0]);
                                        }
                                    }
                                });
                                return;
                            }
                            if (ChatObject.isChannel(chat6) && chat6.creator && !zArr4[0]) {
                                final Browser.Progress progressMakeButtonLoading = builder.alertDialog.makeButtonLoading(-1, true, true);
                                progressMakeButtonLoading.init();
                                TLRPC.TL_channels_getFutureCreatorAfterLeave tL_channels_getFutureCreatorAfterLeave = new TLRPC.TL_channels_getFutureCreatorAfterLeave();
                                tL_channels_getFutureCreatorAfterLeave.channel = MessagesController.getInputChannel(chat6);
                                final int i3 = i;
                                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i3);
                                AiTonesController$$ExternalSyntheticLambda0 aiTonesController$$ExternalSyntheticLambda0 = new AiTonesController$$ExternalSyntheticLambda0();
                                final Activity activity = parentActivity;
                                connectionsManager.sendRequestTyped(tL_channels_getFutureCreatorAfterLeave, aiTonesController$$ExternalSyntheticLambda0, new Utilities.Callback2() {
                                    @Override
                                    public final void run(Object obj, Object obj2) {
                                        TLRPC.User user3 = (TLRPC.User) obj;
                                        progressMakeButtonLoading.end(false);
                                        TLRPC.User user4 = user3 instanceof TLRPC.TL_userEmpty ? null : user3;
                                        MessagesStorage.BooleanCallback booleanCallback3 = booleanCallback2;
                                        if (user4 == null) {
                                            booleanCallback3.run(z15 || zArr4[0]);
                                            return;
                                        }
                                        int i4 = i3;
                                        Theme.ResourcesProvider resourcesProvider3 = resourcesProvider2;
                                        Activity activity2 = activity;
                                        TLRPC.Chat chat7 = chat6;
                                        OAuthSheet$$ExternalSyntheticLambda9 oAuthSheet$$ExternalSyntheticLambda9 = new OAuthSheet$$ExternalSyntheticLambda9(activity2, chat7, user4, i4, booleanCallback3, resourcesProvider3, 7);
                                        AlertsCreator$$ExternalSyntheticLambda188 alertsCreator$$ExternalSyntheticLambda188 = new AlertsCreator$$ExternalSyntheticLambda188(booleanCallback3, 0);
                                        BaseFragment baseFragment3 = baseFragment2;
                                        if (baseFragment3 == null || baseFragment3.getParentActivity() == null || chat7 == null) {
                                            return;
                                        }
                                        Context context = baseFragment3.getContext();
                                        TLRPC.User currentUser = UserConfig.getInstance(baseFragment3.getCurrentAccount()).getCurrentUser();
                                        boolean zIsChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat7);
                                        FrameLayout frameLayout2 = new FrameLayout(context);
                                        frameLayout2.setClipToPadding(false);
                                        frameLayout2.setClipChildren(false);
                                        BackupImageView backupImageView2 = new BackupImageView(context);
                                        AvatarDrawable avatarDrawable2 = new AvatarDrawable((Theme.ResourcesProvider) null);
                                        avatarDrawable2.setInfo(UserConfig.selectedAccount, currentUser);
                                        backupImageView2.setRoundRadius(AndroidUtilities.dp(30.0f));
                                        backupImageView2.imageReceiver.setForUserOrChat(currentUser, avatarDrawable2);
                                        backupImageView2.onNewImageSet();
                                        frameLayout2.addView(backupImageView2, LayoutHelper.createFrame(60, 60.0f, 17, -48.0f, 15.0f, 0.0f, 12.0f));
                                        ImageView imageView = new ImageView(context);
                                        imageView.setImageResource(R.drawable.msg_arrow_avatar);
                                        imageView.setColorFilter(new PorterDuffColorFilter(baseFragment3.getThemedColor(Theme.key_divider), PorterDuff.Mode.SRC_IN));
                                        frameLayout2.addView(imageView, LayoutHelper.createFrame(24, 24.0f, 17, 0.0f, 15.0f, 0.0f, 12.0f));
                                        BackupImageView backupImageView3 = new BackupImageView(context) {
                                            public final Path path = new Path();

                                            @Override
                                            public final void onDraw(Canvas canvas) {
                                                canvas.save();
                                                Path path = this.path;
                                                path.rewind();
                                                path.addCircle(AndroidUtilities.dp(54.0f), AndroidUtilities.dp(53.0f), AndroidUtilities.dp(14.0f), Path.Direction.CW);
                                                canvas.clipPath(path, Region.Op.DIFFERENCE);
                                                super.onDraw(canvas);
                                                canvas.restore();
                                            }
                                        };
                                        AvatarDrawable avatarDrawable3 = new AvatarDrawable((Theme.ResourcesProvider) null);
                                        avatarDrawable3.setInfo(UserConfig.selectedAccount, user4);
                                        backupImageView3.setRoundRadius(AndroidUtilities.dp(30.0f));
                                        backupImageView3.imageReceiver.setForUserOrChat(user4, avatarDrawable3);
                                        backupImageView3.onNewImageSet();
                                        frameLayout2.addView(backupImageView3, LayoutHelper.createFrame(60, 60.0f, 17, 48.0f, 15.0f, 0.0f, 12.0f));
                                        BackupImageView backupImageView4 = new BackupImageView(context);
                                        AvatarDrawable avatarDrawable4 = new AvatarDrawable((Theme.ResourcesProvider) null);
                                        avatarDrawable4.setInfo(UserConfig.selectedAccount, chat7);
                                        backupImageView4.setRoundRadius(AndroidUtilities.dp(12.0f));
                                        backupImageView4.imageReceiver.setForUserOrChat(chat7, avatarDrawable4);
                                        backupImageView4.onNewImageSet();
                                        frameLayout2.addView(backupImageView4, LayoutHelper.createFrame(24, 24.0f, 17, 72.0f, 26.0f, 0.0f, 0.0f));
                                        AlertDialog.Builder builder2 = new AlertDialog.Builder(context, 0, null);
                                        AlertDialog alertDialog4 = builder2.alertDialog;
                                        alertDialog4.aspectRatio = -1.0f;
                                        alertDialog4.topView = frameLayout2;
                                        alertDialog4.title = LocaleController.getString(zIsChannelAndNotMegaGroup ? R.string.LeaveChannelTitle : R.string.LeaveGroupTitle);
                                        alertDialog4.message = AndroidUtilities.replaceTags(LocaleController.formatString(zIsChannelAndNotMegaGroup ? R.string.LeaveChannelNewOwnerText : R.string.LeaveGroupNewOwnerText, UserObject.getUserName(user4), chat7.title));
                                        builder2.setNegativeButton(LocaleController.getString(R.string.AppointNewOwner), new ChatActivity$$ExternalSyntheticLambda356(oAuthSheet$$ExternalSyntheticLambda9, 26));
                                        builder2.setNeutralButton(LocaleController.getString(R.string.Cancel), null);
                                        builder2.setPositiveButton(LocaleController.getString(zIsChannelAndNotMegaGroup ? R.string.LeaveChannel : R.string.LeaveMegaMenu), new ChatActivity$$ExternalSyntheticLambda356(alertsCreator$$ExternalSyntheticLambda188, 27));
                                        alertDialog4.show();
                                        View button = alertDialog4.getButton(-1);
                                        if (button instanceof TextView) {
                                            ((TextView) button).setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
                                        }
                                    }
                                });
                                return;
                            }
                        }
                        if (!z15 && !zArr4[0]) {
                            z16 = false;
                        }
                        booleanCallback2.run(z16);
                    }
                });
                builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                AlertDialog alertDialog3 = alertDialog;
                baseFragment.showDialog(alertDialog3);
                textView = (TextView) alertDialog3.getButton(-1);
                if (textView != null) {
                    textView.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
                }
            }
            string3 = LocaleController.getString(R.string.DeleteAll);
            final TLRPC.Chat chat6 = chat2;
            final boolean[] zArr4 = zArr;
            final int i2 = currentAccount;
            final boolean z14 = z9;
            builder.setPositiveButton(string3, new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog4, int i3) {
                    final boolean[] zArr5 = zArr4;
                    final MessagesStorage.BooleanCallback booleanCallback2 = booleanCallback;
                    boolean z15 = z14;
                    final boolean z16 = z2;
                    boolean z17 = true;
                    if (!z15 && !z16 && !z3) {
                        final TLRPC.User user2 = user;
                        boolean zIsUserSelf = UserObject.isUserSelf(user2);
                        final BaseFragment baseFragment2 = baseFragment;
                        final boolean z18 = z;
                        final TLRPC.Chat chat7 = chat6;
                        final boolean z19 = z4;
                        final boolean z110 = z6;
                        final Theme.ResourcesProvider resourcesProvider2 = resourcesProvider;
                        if (zIsUserSelf) {
                            AlertsCreator.createClearOrDeleteDialogAlert(baseFragment2, z18, true, chat7, user2, false, z19, zArr5[0], z110, booleanCallback2, resourcesProvider2);
                            return;
                        }
                        if (user2 != null && zArr5[0]) {
                            MessagesStorage.getInstance(baseFragment2.getCurrentAccount()).getMessagesCount(user2.id, new MessagesStorage.IntCallback() {
                                @Override
                                public final void run(int i4) {
                                    boolean[] zArr6 = zArr5;
                                    MessagesStorage.BooleanCallback booleanCallback3 = booleanCallback2;
                                    if (i4 >= 50) {
                                        AlertsCreator.createClearOrDeleteDialogAlert(baseFragment2, z18, true, chat7, user2, false, z19, zArr6[0], z110, booleanCallback3, resourcesProvider2);
                                    } else if (booleanCallback3 != null) {
                                        booleanCallback3.run(zArr6[0]);
                                    }
                                }
                            });
                            return;
                        }
                        if (ChatObject.isChannel(chat7) && chat7.creator && !zArr5[0]) {
                            final Browser.Progress progressMakeButtonLoading = builder.alertDialog.makeButtonLoading(-1, true, true);
                            progressMakeButtonLoading.init();
                            TLRPC.TL_channels_getFutureCreatorAfterLeave tL_channels_getFutureCreatorAfterLeave = new TLRPC.TL_channels_getFutureCreatorAfterLeave();
                            tL_channels_getFutureCreatorAfterLeave.channel = MessagesController.getInputChannel(chat7);
                            final int i4 = i2;
                            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i4);
                            AiTonesController$$ExternalSyntheticLambda0 aiTonesController$$ExternalSyntheticLambda0 = new AiTonesController$$ExternalSyntheticLambda0();
                            final Activity activity = parentActivity;
                            connectionsManager.sendRequestTyped(tL_channels_getFutureCreatorAfterLeave, aiTonesController$$ExternalSyntheticLambda0, new Utilities.Callback2() {
                                @Override
                                public final void run(Object obj, Object obj2) {
                                    TLRPC.User user3 = (TLRPC.User) obj;
                                    progressMakeButtonLoading.end(false);
                                    TLRPC.User user4 = user3 instanceof TLRPC.TL_userEmpty ? null : user3;
                                    MessagesStorage.BooleanCallback booleanCallback3 = booleanCallback2;
                                    if (user4 == null) {
                                        booleanCallback3.run(z16 || zArr5[0]);
                                        return;
                                    }
                                    int i5 = i4;
                                    Theme.ResourcesProvider resourcesProvider3 = resourcesProvider2;
                                    Activity activity2 = activity;
                                    TLRPC.Chat chat8 = chat7;
                                    OAuthSheet$$ExternalSyntheticLambda9 oAuthSheet$$ExternalSyntheticLambda9 = new OAuthSheet$$ExternalSyntheticLambda9(activity2, chat8, user4, i5, booleanCallback3, resourcesProvider3, 7);
                                    AlertsCreator$$ExternalSyntheticLambda188 alertsCreator$$ExternalSyntheticLambda188 = new AlertsCreator$$ExternalSyntheticLambda188(booleanCallback3, 0);
                                    BaseFragment baseFragment3 = baseFragment2;
                                    if (baseFragment3 == null || baseFragment3.getParentActivity() == null || chat8 == null) {
                                        return;
                                    }
                                    Context context = baseFragment3.getContext();
                                    TLRPC.User currentUser = UserConfig.getInstance(baseFragment3.getCurrentAccount()).getCurrentUser();
                                    boolean zIsChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat8);
                                    FrameLayout frameLayout2 = new FrameLayout(context);
                                    frameLayout2.setClipToPadding(false);
                                    frameLayout2.setClipChildren(false);
                                    BackupImageView backupImageView2 = new BackupImageView(context);
                                    AvatarDrawable avatarDrawable2 = new AvatarDrawable((Theme.ResourcesProvider) null);
                                    avatarDrawable2.setInfo(UserConfig.selectedAccount, currentUser);
                                    backupImageView2.setRoundRadius(AndroidUtilities.dp(30.0f));
                                    backupImageView2.imageReceiver.setForUserOrChat(currentUser, avatarDrawable2);
                                    backupImageView2.onNewImageSet();
                                    frameLayout2.addView(backupImageView2, LayoutHelper.createFrame(60, 60.0f, 17, -48.0f, 15.0f, 0.0f, 12.0f));
                                    ImageView imageView = new ImageView(context);
                                    imageView.setImageResource(R.drawable.msg_arrow_avatar);
                                    imageView.setColorFilter(new PorterDuffColorFilter(baseFragment3.getThemedColor(Theme.key_divider), PorterDuff.Mode.SRC_IN));
                                    frameLayout2.addView(imageView, LayoutHelper.createFrame(24, 24.0f, 17, 0.0f, 15.0f, 0.0f, 12.0f));
                                    BackupImageView backupImageView3 = new BackupImageView(context) {
                                        public final Path path = new Path();

                                        @Override
                                        public final void onDraw(Canvas canvas) {
                                            canvas.save();
                                            Path path = this.path;
                                            path.rewind();
                                            path.addCircle(AndroidUtilities.dp(54.0f), AndroidUtilities.dp(53.0f), AndroidUtilities.dp(14.0f), Path.Direction.CW);
                                            canvas.clipPath(path, Region.Op.DIFFERENCE);
                                            super.onDraw(canvas);
                                            canvas.restore();
                                        }
                                    };
                                    AvatarDrawable avatarDrawable3 = new AvatarDrawable((Theme.ResourcesProvider) null);
                                    avatarDrawable3.setInfo(UserConfig.selectedAccount, user4);
                                    backupImageView3.setRoundRadius(AndroidUtilities.dp(30.0f));
                                    backupImageView3.imageReceiver.setForUserOrChat(user4, avatarDrawable3);
                                    backupImageView3.onNewImageSet();
                                    frameLayout2.addView(backupImageView3, LayoutHelper.createFrame(60, 60.0f, 17, 48.0f, 15.0f, 0.0f, 12.0f));
                                    BackupImageView backupImageView4 = new BackupImageView(context);
                                    AvatarDrawable avatarDrawable4 = new AvatarDrawable((Theme.ResourcesProvider) null);
                                    avatarDrawable4.setInfo(UserConfig.selectedAccount, chat8);
                                    backupImageView4.setRoundRadius(AndroidUtilities.dp(12.0f));
                                    backupImageView4.imageReceiver.setForUserOrChat(chat8, avatarDrawable4);
                                    backupImageView4.onNewImageSet();
                                    frameLayout2.addView(backupImageView4, LayoutHelper.createFrame(24, 24.0f, 17, 72.0f, 26.0f, 0.0f, 0.0f));
                                    AlertDialog.Builder builder2 = new AlertDialog.Builder(context, 0, null);
                                    AlertDialog alertDialog5 = builder2.alertDialog;
                                    alertDialog5.aspectRatio = -1.0f;
                                    alertDialog5.topView = frameLayout2;
                                    alertDialog5.title = LocaleController.getString(zIsChannelAndNotMegaGroup ? R.string.LeaveChannelTitle : R.string.LeaveGroupTitle);
                                    alertDialog5.message = AndroidUtilities.replaceTags(LocaleController.formatString(zIsChannelAndNotMegaGroup ? R.string.LeaveChannelNewOwnerText : R.string.LeaveGroupNewOwnerText, UserObject.getUserName(user4), chat8.title));
                                    builder2.setNegativeButton(LocaleController.getString(R.string.AppointNewOwner), new ChatActivity$$ExternalSyntheticLambda356(oAuthSheet$$ExternalSyntheticLambda9, 26));
                                    builder2.setNeutralButton(LocaleController.getString(R.string.Cancel), null);
                                    builder2.setPositiveButton(LocaleController.getString(zIsChannelAndNotMegaGroup ? R.string.LeaveChannel : R.string.LeaveMegaMenu), new ChatActivity$$ExternalSyntheticLambda356(alertsCreator$$ExternalSyntheticLambda188, 27));
                                    alertDialog5.show();
                                    View button = alertDialog5.getButton(-1);
                                    if (button instanceof TextView) {
                                        ((TextView) button).setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
                                    }
                                }
                            });
                            return;
                        }
                    }
                    if (!z16 && !zArr5[0]) {
                        z17 = false;
                    }
                    booleanCallback2.run(z17);
                }
            });
            builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
            AlertDialog alertDialog4 = alertDialog;
            baseFragment.showDialog(alertDialog4);
            textView = (TextView) alertDialog4.getButton(-1);
            if (textView != null) {
                textView.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
            }
        }
        f = 16.0f;
        f2 = 10.0f;
        if (z2 || (((!z3 || z) && !z11) || UserObject.isDeleted(user) || z12)) {
            if (z4 && !z && chat != null) {
                chat2 = chat;
                z7 = chat2.creator;
                if (z7) {
                    alertDialog = alertDialog2;
                    zArr = zArr2;
                }
                if (user == null) {
                    int currentAccount3 = baseFragment.getCurrentAccount();
                    if (monoForumLinkedChat != null) {
                        chat3 = monoForumLinkedChat;
                    } else {
                        chat3 = chat2;
                    }
                    avatarDrawable.setInfo(currentAccount3, chat3);
                    if (monoForumLinkedChat != null) {
                        chat4 = monoForumLinkedChat;
                    } else {
                        chat4 = chat2;
                    }
                    backupImageView.imageReceiver.setForUserOrChat(chat4, avatarDrawable);
                    backupImageView.onNewImageSet();
                } else if (UserObject.isReplyUser(user)) {
                    avatarDrawable.scaleSize = 0.8f;
                    avatarDrawable.setAvatarType(12);
                    backupImageView.setImage(null, null, avatarDrawable, user);
                } else if (user.id == clientUserId) {
                    avatarDrawable.scaleSize = 0.8f;
                    avatarDrawable.setAvatarType(1);
                    backupImageView.setImage(null, null, avatarDrawable, user);
                } else {
                    avatarDrawable.scaleSize = 1.0f;
                    avatarDrawable.setInfo(baseFragment.getCurrentAccount(), user);
                    backupImageView.imageReceiver.setForUserOrChat(user, avatarDrawable);
                    backupImageView.onNewImageSet();
                }
                if (z2) {
                    if (UserObject.isUserSelf(user)) {
                        anonymousClass10.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.DeleteAllMessagesSavedAlert)));
                    } else if (chat2 == null) {
                        anonymousClass10.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.DeleteAllMessagesAlert)));
                    } else {
                        anonymousClass10.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.DeleteAllMessagesAlert)));
                    }
                } else if (z) {
                    if (user == null) {
                        if (monoForumLinkedChat != null) {
                            string2 = LocaleController.formatString(R.string.MonoforumTitle, monoForumLinkedChat.title);
                        } else {
                            string2 = chat2.title;
                        }
                        if (ChatObject.isChannel(chat2)) {
                            anonymousClass10.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureClearHistoryWithChat, string2)));
                        } else {
                            anonymousClass10.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureClearHistoryWithChat, string2)));
                        }
                    } else if (z3) {
                        anonymousClass10.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureClearHistoryWithSecretUser, UserObject.getUserName(user))));
                    } else if (user.id == clientUserId) {
                        anonymousClass10.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.AreYouSureClearHistorySavedMessages)));
                    } else {
                        anonymousClass10.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureClearHistoryWithUser, UserObject.getUserName(user))));
                    }
                } else if (user != null) {
                    if (z3) {
                        anonymousClass10.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureDeleteThisChatWithSecretUser, UserObject.getUserName(user))));
                    } else if (user.id == clientUserId) {
                        anonymousClass10.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.AreYouSureDeleteThisChatSavedMessages)));
                    } else if (user.bot) {
                        anonymousClass10.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureDeleteThisChatWithUser, UserObject.getUserName(user))));
                    } else {
                        anonymousClass10.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureDeleteThisChatWithUser, UserObject.getUserName(user))));
                    }
                } else if (ChatObject.isChannel(chat2)) {
                    if (monoForumLinkedChat != null) {
                        string = LocaleController.formatString(R.string.MonoforumTitle, monoForumLinkedChat.title);
                    } else {
                        string = chat2.title;
                    }
                    if (chat2.megagroup) {
                        anonymousClass10.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.MegaLeaveAlertWithName, string)));
                    } else {
                        anonymousClass10.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.ChannelLeaveAlertWithName, string)));
                    }
                } else {
                    anonymousClass10.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureDeleteAndExitName, chat2.title)));
                }
                if (!z2) {
                    if (z) {
                        if (z9) {
                            string3 = LocaleController.getString(R.string.ClearHistoryCache);
                        } else {
                            string3 = LocaleController.getString(R.string.ClearForMe);
                        }
                    } else if (!z7) {
                        if (!ChatObject.isChannel(chat2)) {
                            string3 = LocaleController.getString(R.string.DeleteChatUser);
                        } else if (chat2.monoforum) {
                            string3 = LocaleController.getString(R.string.LeaveConversationMenu);
                        } else if (chat2.megagroup) {
                            string3 = LocaleController.getString(R.string.LeaveMegaMenu);
                        } else {
                            string3 = LocaleController.getString(R.string.LeaveChannelMenu);
                        }
                    } else if (!ChatObject.isChannel(chat2)) {
                        string3 = LocaleController.getString(R.string.DeleteChatUser);
                    } else if (chat2.monoforum) {
                        string3 = LocaleController.getString(R.string.LeaveConversationMenu);
                    } else if (chat2.megagroup) {
                        string3 = LocaleController.getString(R.string.LeaveMegaMenu);
                    } else {
                        string3 = LocaleController.getString(R.string.LeaveChannelMenu);
                    }
                    final TLRPC.Chat chat7 = chat2;
                    final boolean[] zArr5 = zArr;
                    final int i3 = currentAccount;
                    final boolean z15 = z9;
                    builder.setPositiveButton(string3, new AlertDialog.OnButtonClickListener() {
                        @Override
                        public final void onClick(AlertDialog alertDialog5, int i4) {
                            final boolean[] zArr6 = zArr5;
                            final MessagesStorage.BooleanCallback booleanCallback2 = booleanCallback;
                            boolean z16 = z15;
                            final boolean z17 = z2;
                            boolean z18 = true;
                            if (!z16 && !z17 && !z3) {
                                final TLRPC.User user2 = user;
                                boolean zIsUserSelf = UserObject.isUserSelf(user2);
                                final BaseFragment baseFragment2 = baseFragment;
                                final boolean z19 = z;
                                final TLRPC.Chat chat8 = chat7;
                                final boolean z110 = z4;
                                final boolean z111 = z6;
                                final Theme.ResourcesProvider resourcesProvider2 = resourcesProvider;
                                if (zIsUserSelf) {
                                    AlertsCreator.createClearOrDeleteDialogAlert(baseFragment2, z19, true, chat8, user2, false, z110, zArr6[0], z111, booleanCallback2, resourcesProvider2);
                                    return;
                                }
                                if (user2 != null && zArr6[0]) {
                                    MessagesStorage.getInstance(baseFragment2.getCurrentAccount()).getMessagesCount(user2.id, new MessagesStorage.IntCallback() {
                                        @Override
                                        public final void run(int i5) {
                                            boolean[] zArr7 = zArr6;
                                            MessagesStorage.BooleanCallback booleanCallback3 = booleanCallback2;
                                            if (i5 >= 50) {
                                                AlertsCreator.createClearOrDeleteDialogAlert(baseFragment2, z19, true, chat8, user2, false, z110, zArr7[0], z111, booleanCallback3, resourcesProvider2);
                                            } else if (booleanCallback3 != null) {
                                                booleanCallback3.run(zArr7[0]);
                                            }
                                        }
                                    });
                                    return;
                                }
                                if (ChatObject.isChannel(chat8) && chat8.creator && !zArr6[0]) {
                                    final Browser.Progress progressMakeButtonLoading = builder.alertDialog.makeButtonLoading(-1, true, true);
                                    progressMakeButtonLoading.init();
                                    TLRPC.TL_channels_getFutureCreatorAfterLeave tL_channels_getFutureCreatorAfterLeave = new TLRPC.TL_channels_getFutureCreatorAfterLeave();
                                    tL_channels_getFutureCreatorAfterLeave.channel = MessagesController.getInputChannel(chat8);
                                    final int i5 = i3;
                                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i5);
                                    AiTonesController$$ExternalSyntheticLambda0 aiTonesController$$ExternalSyntheticLambda0 = new AiTonesController$$ExternalSyntheticLambda0();
                                    final Activity activity = parentActivity;
                                    connectionsManager.sendRequestTyped(tL_channels_getFutureCreatorAfterLeave, aiTonesController$$ExternalSyntheticLambda0, new Utilities.Callback2() {
                                        @Override
                                        public final void run(Object obj, Object obj2) {
                                            TLRPC.User user3 = (TLRPC.User) obj;
                                            progressMakeButtonLoading.end(false);
                                            TLRPC.User user4 = user3 instanceof TLRPC.TL_userEmpty ? null : user3;
                                            MessagesStorage.BooleanCallback booleanCallback3 = booleanCallback2;
                                            if (user4 == null) {
                                                booleanCallback3.run(z17 || zArr6[0]);
                                                return;
                                            }
                                            int i6 = i5;
                                            Theme.ResourcesProvider resourcesProvider3 = resourcesProvider2;
                                            Activity activity2 = activity;
                                            TLRPC.Chat chat9 = chat8;
                                            OAuthSheet$$ExternalSyntheticLambda9 oAuthSheet$$ExternalSyntheticLambda9 = new OAuthSheet$$ExternalSyntheticLambda9(activity2, chat9, user4, i6, booleanCallback3, resourcesProvider3, 7);
                                            AlertsCreator$$ExternalSyntheticLambda188 alertsCreator$$ExternalSyntheticLambda188 = new AlertsCreator$$ExternalSyntheticLambda188(booleanCallback3, 0);
                                            BaseFragment baseFragment3 = baseFragment2;
                                            if (baseFragment3 == null || baseFragment3.getParentActivity() == null || chat9 == null) {
                                                return;
                                            }
                                            Context context = baseFragment3.getContext();
                                            TLRPC.User currentUser = UserConfig.getInstance(baseFragment3.getCurrentAccount()).getCurrentUser();
                                            boolean zIsChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat9);
                                            FrameLayout frameLayout2 = new FrameLayout(context);
                                            frameLayout2.setClipToPadding(false);
                                            frameLayout2.setClipChildren(false);
                                            BackupImageView backupImageView2 = new BackupImageView(context);
                                            AvatarDrawable avatarDrawable2 = new AvatarDrawable((Theme.ResourcesProvider) null);
                                            avatarDrawable2.setInfo(UserConfig.selectedAccount, currentUser);
                                            backupImageView2.setRoundRadius(AndroidUtilities.dp(30.0f));
                                            backupImageView2.imageReceiver.setForUserOrChat(currentUser, avatarDrawable2);
                                            backupImageView2.onNewImageSet();
                                            frameLayout2.addView(backupImageView2, LayoutHelper.createFrame(60, 60.0f, 17, -48.0f, 15.0f, 0.0f, 12.0f));
                                            ImageView imageView = new ImageView(context);
                                            imageView.setImageResource(R.drawable.msg_arrow_avatar);
                                            imageView.setColorFilter(new PorterDuffColorFilter(baseFragment3.getThemedColor(Theme.key_divider), PorterDuff.Mode.SRC_IN));
                                            frameLayout2.addView(imageView, LayoutHelper.createFrame(24, 24.0f, 17, 0.0f, 15.0f, 0.0f, 12.0f));
                                            BackupImageView backupImageView3 = new BackupImageView(context) {
                                                public final Path path = new Path();

                                                @Override
                                                public final void onDraw(Canvas canvas) {
                                                    canvas.save();
                                                    Path path = this.path;
                                                    path.rewind();
                                                    path.addCircle(AndroidUtilities.dp(54.0f), AndroidUtilities.dp(53.0f), AndroidUtilities.dp(14.0f), Path.Direction.CW);
                                                    canvas.clipPath(path, Region.Op.DIFFERENCE);
                                                    super.onDraw(canvas);
                                                    canvas.restore();
                                                }
                                            };
                                            AvatarDrawable avatarDrawable3 = new AvatarDrawable((Theme.ResourcesProvider) null);
                                            avatarDrawable3.setInfo(UserConfig.selectedAccount, user4);
                                            backupImageView3.setRoundRadius(AndroidUtilities.dp(30.0f));
                                            backupImageView3.imageReceiver.setForUserOrChat(user4, avatarDrawable3);
                                            backupImageView3.onNewImageSet();
                                            frameLayout2.addView(backupImageView3, LayoutHelper.createFrame(60, 60.0f, 17, 48.0f, 15.0f, 0.0f, 12.0f));
                                            BackupImageView backupImageView4 = new BackupImageView(context);
                                            AvatarDrawable avatarDrawable4 = new AvatarDrawable((Theme.ResourcesProvider) null);
                                            avatarDrawable4.setInfo(UserConfig.selectedAccount, chat9);
                                            backupImageView4.setRoundRadius(AndroidUtilities.dp(12.0f));
                                            backupImageView4.imageReceiver.setForUserOrChat(chat9, avatarDrawable4);
                                            backupImageView4.onNewImageSet();
                                            frameLayout2.addView(backupImageView4, LayoutHelper.createFrame(24, 24.0f, 17, 72.0f, 26.0f, 0.0f, 0.0f));
                                            AlertDialog.Builder builder2 = new AlertDialog.Builder(context, 0, null);
                                            AlertDialog alertDialog6 = builder2.alertDialog;
                                            alertDialog6.aspectRatio = -1.0f;
                                            alertDialog6.topView = frameLayout2;
                                            alertDialog6.title = LocaleController.getString(zIsChannelAndNotMegaGroup ? R.string.LeaveChannelTitle : R.string.LeaveGroupTitle);
                                            alertDialog6.message = AndroidUtilities.replaceTags(LocaleController.formatString(zIsChannelAndNotMegaGroup ? R.string.LeaveChannelNewOwnerText : R.string.LeaveGroupNewOwnerText, UserObject.getUserName(user4), chat9.title));
                                            builder2.setNegativeButton(LocaleController.getString(R.string.AppointNewOwner), new ChatActivity$$ExternalSyntheticLambda356(oAuthSheet$$ExternalSyntheticLambda9, 26));
                                            builder2.setNeutralButton(LocaleController.getString(R.string.Cancel), null);
                                            builder2.setPositiveButton(LocaleController.getString(zIsChannelAndNotMegaGroup ? R.string.LeaveChannel : R.string.LeaveMegaMenu), new ChatActivity$$ExternalSyntheticLambda356(alertsCreator$$ExternalSyntheticLambda188, 27));
                                            alertDialog6.show();
                                            View button = alertDialog6.getButton(-1);
                                            if (button instanceof TextView) {
                                                ((TextView) button).setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
                                            }
                                        }
                                    });
                                    return;
                                }
                            }
                            if (!z17 && !zArr6[0]) {
                                z18 = false;
                            }
                            booleanCallback2.run(z18);
                        }
                    });
                    builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                    AlertDialog alertDialog5 = alertDialog;
                    baseFragment.showDialog(alertDialog5);
                    textView = (TextView) alertDialog5.getButton(-1);
                    if (textView != null) {
                        textView.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
                    }
                }
                string3 = LocaleController.getString(R.string.DeleteAll);
                final TLRPC.Chat chat8 = chat2;
                final boolean[] zArr6 = zArr;
                final int i4 = currentAccount;
                final boolean z16 = z9;
                builder.setPositiveButton(string3, new AlertDialog.OnButtonClickListener() {
                    @Override
                    public final void onClick(AlertDialog alertDialog6, int i5) {
                        final boolean[] zArr7 = zArr6;
                        final MessagesStorage.BooleanCallback booleanCallback2 = booleanCallback;
                        boolean z17 = z16;
                        final boolean z18 = z2;
                        boolean z19 = true;
                        if (!z17 && !z18 && !z3) {
                            final TLRPC.User user2 = user;
                            boolean zIsUserSelf = UserObject.isUserSelf(user2);
                            final BaseFragment baseFragment2 = baseFragment;
                            final boolean z110 = z;
                            final TLRPC.Chat chat9 = chat8;
                            final boolean z111 = z4;
                            final boolean z112 = z6;
                            final Theme.ResourcesProvider resourcesProvider2 = resourcesProvider;
                            if (zIsUserSelf) {
                                AlertsCreator.createClearOrDeleteDialogAlert(baseFragment2, z110, true, chat9, user2, false, z111, zArr7[0], z112, booleanCallback2, resourcesProvider2);
                                return;
                            }
                            if (user2 != null && zArr7[0]) {
                                MessagesStorage.getInstance(baseFragment2.getCurrentAccount()).getMessagesCount(user2.id, new MessagesStorage.IntCallback() {
                                    @Override
                                    public final void run(int i6) {
                                        boolean[] zArr8 = zArr7;
                                        MessagesStorage.BooleanCallback booleanCallback3 = booleanCallback2;
                                        if (i6 >= 50) {
                                            AlertsCreator.createClearOrDeleteDialogAlert(baseFragment2, z110, true, chat9, user2, false, z111, zArr8[0], z112, booleanCallback3, resourcesProvider2);
                                        } else if (booleanCallback3 != null) {
                                            booleanCallback3.run(zArr8[0]);
                                        }
                                    }
                                });
                                return;
                            }
                            if (ChatObject.isChannel(chat9) && chat9.creator && !zArr7[0]) {
                                final Browser.Progress progressMakeButtonLoading = builder.alertDialog.makeButtonLoading(-1, true, true);
                                progressMakeButtonLoading.init();
                                TLRPC.TL_channels_getFutureCreatorAfterLeave tL_channels_getFutureCreatorAfterLeave = new TLRPC.TL_channels_getFutureCreatorAfterLeave();
                                tL_channels_getFutureCreatorAfterLeave.channel = MessagesController.getInputChannel(chat9);
                                final int i6 = i4;
                                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i6);
                                AiTonesController$$ExternalSyntheticLambda0 aiTonesController$$ExternalSyntheticLambda0 = new AiTonesController$$ExternalSyntheticLambda0();
                                final Activity activity = parentActivity;
                                connectionsManager.sendRequestTyped(tL_channels_getFutureCreatorAfterLeave, aiTonesController$$ExternalSyntheticLambda0, new Utilities.Callback2() {
                                    @Override
                                    public final void run(Object obj, Object obj2) {
                                        TLRPC.User user3 = (TLRPC.User) obj;
                                        progressMakeButtonLoading.end(false);
                                        TLRPC.User user4 = user3 instanceof TLRPC.TL_userEmpty ? null : user3;
                                        MessagesStorage.BooleanCallback booleanCallback3 = booleanCallback2;
                                        if (user4 == null) {
                                            booleanCallback3.run(z18 || zArr7[0]);
                                            return;
                                        }
                                        int i7 = i6;
                                        Theme.ResourcesProvider resourcesProvider3 = resourcesProvider2;
                                        Activity activity2 = activity;
                                        TLRPC.Chat chat10 = chat9;
                                        OAuthSheet$$ExternalSyntheticLambda9 oAuthSheet$$ExternalSyntheticLambda9 = new OAuthSheet$$ExternalSyntheticLambda9(activity2, chat10, user4, i7, booleanCallback3, resourcesProvider3, 7);
                                        AlertsCreator$$ExternalSyntheticLambda188 alertsCreator$$ExternalSyntheticLambda188 = new AlertsCreator$$ExternalSyntheticLambda188(booleanCallback3, 0);
                                        BaseFragment baseFragment3 = baseFragment2;
                                        if (baseFragment3 == null || baseFragment3.getParentActivity() == null || chat10 == null) {
                                            return;
                                        }
                                        Context context = baseFragment3.getContext();
                                        TLRPC.User currentUser = UserConfig.getInstance(baseFragment3.getCurrentAccount()).getCurrentUser();
                                        boolean zIsChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat10);
                                        FrameLayout frameLayout2 = new FrameLayout(context);
                                        frameLayout2.setClipToPadding(false);
                                        frameLayout2.setClipChildren(false);
                                        BackupImageView backupImageView2 = new BackupImageView(context);
                                        AvatarDrawable avatarDrawable2 = new AvatarDrawable((Theme.ResourcesProvider) null);
                                        avatarDrawable2.setInfo(UserConfig.selectedAccount, currentUser);
                                        backupImageView2.setRoundRadius(AndroidUtilities.dp(30.0f));
                                        backupImageView2.imageReceiver.setForUserOrChat(currentUser, avatarDrawable2);
                                        backupImageView2.onNewImageSet();
                                        frameLayout2.addView(backupImageView2, LayoutHelper.createFrame(60, 60.0f, 17, -48.0f, 15.0f, 0.0f, 12.0f));
                                        ImageView imageView = new ImageView(context);
                                        imageView.setImageResource(R.drawable.msg_arrow_avatar);
                                        imageView.setColorFilter(new PorterDuffColorFilter(baseFragment3.getThemedColor(Theme.key_divider), PorterDuff.Mode.SRC_IN));
                                        frameLayout2.addView(imageView, LayoutHelper.createFrame(24, 24.0f, 17, 0.0f, 15.0f, 0.0f, 12.0f));
                                        BackupImageView backupImageView3 = new BackupImageView(context) {
                                            public final Path path = new Path();

                                            @Override
                                            public final void onDraw(Canvas canvas) {
                                                canvas.save();
                                                Path path = this.path;
                                                path.rewind();
                                                path.addCircle(AndroidUtilities.dp(54.0f), AndroidUtilities.dp(53.0f), AndroidUtilities.dp(14.0f), Path.Direction.CW);
                                                canvas.clipPath(path, Region.Op.DIFFERENCE);
                                                super.onDraw(canvas);
                                                canvas.restore();
                                            }
                                        };
                                        AvatarDrawable avatarDrawable3 = new AvatarDrawable((Theme.ResourcesProvider) null);
                                        avatarDrawable3.setInfo(UserConfig.selectedAccount, user4);
                                        backupImageView3.setRoundRadius(AndroidUtilities.dp(30.0f));
                                        backupImageView3.imageReceiver.setForUserOrChat(user4, avatarDrawable3);
                                        backupImageView3.onNewImageSet();
                                        frameLayout2.addView(backupImageView3, LayoutHelper.createFrame(60, 60.0f, 17, 48.0f, 15.0f, 0.0f, 12.0f));
                                        BackupImageView backupImageView4 = new BackupImageView(context);
                                        AvatarDrawable avatarDrawable4 = new AvatarDrawable((Theme.ResourcesProvider) null);
                                        avatarDrawable4.setInfo(UserConfig.selectedAccount, chat10);
                                        backupImageView4.setRoundRadius(AndroidUtilities.dp(12.0f));
                                        backupImageView4.imageReceiver.setForUserOrChat(chat10, avatarDrawable4);
                                        backupImageView4.onNewImageSet();
                                        frameLayout2.addView(backupImageView4, LayoutHelper.createFrame(24, 24.0f, 17, 72.0f, 26.0f, 0.0f, 0.0f));
                                        AlertDialog.Builder builder2 = new AlertDialog.Builder(context, 0, null);
                                        AlertDialog alertDialog7 = builder2.alertDialog;
                                        alertDialog7.aspectRatio = -1.0f;
                                        alertDialog7.topView = frameLayout2;
                                        alertDialog7.title = LocaleController.getString(zIsChannelAndNotMegaGroup ? R.string.LeaveChannelTitle : R.string.LeaveGroupTitle);
                                        alertDialog7.message = AndroidUtilities.replaceTags(LocaleController.formatString(zIsChannelAndNotMegaGroup ? R.string.LeaveChannelNewOwnerText : R.string.LeaveGroupNewOwnerText, UserObject.getUserName(user4), chat10.title));
                                        builder2.setNegativeButton(LocaleController.getString(R.string.AppointNewOwner), new ChatActivity$$ExternalSyntheticLambda356(oAuthSheet$$ExternalSyntheticLambda9, 26));
                                        builder2.setNeutralButton(LocaleController.getString(R.string.Cancel), null);
                                        builder2.setPositiveButton(LocaleController.getString(zIsChannelAndNotMegaGroup ? R.string.LeaveChannel : R.string.LeaveMegaMenu), new ChatActivity$$ExternalSyntheticLambda356(alertsCreator$$ExternalSyntheticLambda188, 27));
                                        alertDialog7.show();
                                        View button = alertDialog7.getButton(-1);
                                        if (button instanceof TextView) {
                                            ((TextView) button).setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
                                        }
                                    }
                                });
                                return;
                            }
                        }
                        if (!z18 && !zArr7[0]) {
                            z19 = false;
                        }
                        booleanCallback2.run(z19);
                    }
                });
                builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                AlertDialog alertDialog6 = alertDialog;
                baseFragment.showDialog(alertDialog6);
                textView = (TextView) alertDialog6.getButton(-1);
                if (textView != null) {
                    textView.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
                }
            }
            chat2 = chat;
            if (z7) {
                alertDialog = alertDialog2;
                zArr = zArr2;
            }
            if (user == null) {
                int currentAccount4 = baseFragment.getCurrentAccount();
                if (monoForumLinkedChat != null) {
                    chat3 = monoForumLinkedChat;
                } else {
                    chat3 = chat2;
                }
                avatarDrawable.setInfo(currentAccount4, chat3);
                if (monoForumLinkedChat != null) {
                    chat4 = monoForumLinkedChat;
                } else {
                    chat4 = chat2;
                }
                backupImageView.imageReceiver.setForUserOrChat(chat4, avatarDrawable);
                backupImageView.onNewImageSet();
            } else if (UserObject.isReplyUser(user)) {
                avatarDrawable.scaleSize = 0.8f;
                avatarDrawable.setAvatarType(12);
                backupImageView.setImage(null, null, avatarDrawable, user);
            } else if (user.id == clientUserId) {
                avatarDrawable.scaleSize = 0.8f;
                avatarDrawable.setAvatarType(1);
                backupImageView.setImage(null, null, avatarDrawable, user);
            } else {
                avatarDrawable.scaleSize = 1.0f;
                avatarDrawable.setInfo(baseFragment.getCurrentAccount(), user);
                backupImageView.imageReceiver.setForUserOrChat(user, avatarDrawable);
                backupImageView.onNewImageSet();
            }
            if (z2) {
                if (UserObject.isUserSelf(user)) {
                    anonymousClass10.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.DeleteAllMessagesSavedAlert)));
                } else if (chat2 == null) {
                    anonymousClass10.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.DeleteAllMessagesAlert)));
                } else {
                    anonymousClass10.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.DeleteAllMessagesAlert)));
                }
            } else if (z) {
                if (user == null) {
                    if (monoForumLinkedChat != null) {
                        string2 = LocaleController.formatString(R.string.MonoforumTitle, monoForumLinkedChat.title);
                    } else {
                        string2 = chat2.title;
                    }
                    if (ChatObject.isChannel(chat2)) {
                        anonymousClass10.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureClearHistoryWithChat, string2)));
                    } else {
                        anonymousClass10.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureClearHistoryWithChat, string2)));
                    }
                } else if (z3) {
                    anonymousClass10.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureClearHistoryWithSecretUser, UserObject.getUserName(user))));
                } else if (user.id == clientUserId) {
                    anonymousClass10.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.AreYouSureClearHistorySavedMessages)));
                } else {
                    anonymousClass10.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureClearHistoryWithUser, UserObject.getUserName(user))));
                }
            } else if (user != null) {
                if (z3) {
                    anonymousClass10.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureDeleteThisChatWithSecretUser, UserObject.getUserName(user))));
                } else if (user.id == clientUserId) {
                    anonymousClass10.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.AreYouSureDeleteThisChatSavedMessages)));
                } else if (user.bot) {
                    anonymousClass10.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureDeleteThisChatWithUser, UserObject.getUserName(user))));
                } else {
                    anonymousClass10.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureDeleteThisChatWithUser, UserObject.getUserName(user))));
                }
            } else if (ChatObject.isChannel(chat2)) {
                if (monoForumLinkedChat != null) {
                    string = LocaleController.formatString(R.string.MonoforumTitle, monoForumLinkedChat.title);
                } else {
                    string = chat2.title;
                }
                if (chat2.megagroup) {
                    anonymousClass10.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.MegaLeaveAlertWithName, string)));
                } else {
                    anonymousClass10.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.ChannelLeaveAlertWithName, string)));
                }
            } else {
                anonymousClass10.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureDeleteAndExitName, chat2.title)));
            }
            if (!z2) {
                if (z) {
                    if (z9) {
                        string3 = LocaleController.getString(R.string.ClearHistoryCache);
                    } else {
                        string3 = LocaleController.getString(R.string.ClearForMe);
                    }
                } else if (!z7) {
                    if (!ChatObject.isChannel(chat2)) {
                        string3 = LocaleController.getString(R.string.DeleteChatUser);
                    } else if (chat2.monoforum) {
                        string3 = LocaleController.getString(R.string.LeaveConversationMenu);
                    } else if (chat2.megagroup) {
                        string3 = LocaleController.getString(R.string.LeaveMegaMenu);
                    } else {
                        string3 = LocaleController.getString(R.string.LeaveChannelMenu);
                    }
                } else if (!ChatObject.isChannel(chat2)) {
                    string3 = LocaleController.getString(R.string.DeleteChatUser);
                } else if (chat2.monoforum) {
                    string3 = LocaleController.getString(R.string.LeaveConversationMenu);
                } else if (chat2.megagroup) {
                    string3 = LocaleController.getString(R.string.LeaveMegaMenu);
                } else {
                    string3 = LocaleController.getString(R.string.LeaveChannelMenu);
                }
                final TLRPC.Chat chat9 = chat2;
                final boolean[] zArr7 = zArr;
                final int i5 = currentAccount;
                final boolean z17 = z9;
                builder.setPositiveButton(string3, new AlertDialog.OnButtonClickListener() {
                    @Override
                    public final void onClick(AlertDialog alertDialog7, int i6) {
                        final boolean[] zArr8 = zArr7;
                        final MessagesStorage.BooleanCallback booleanCallback2 = booleanCallback;
                        boolean z18 = z17;
                        final boolean z19 = z2;
                        boolean z110 = true;
                        if (!z18 && !z19 && !z3) {
                            final TLRPC.User user2 = user;
                            boolean zIsUserSelf = UserObject.isUserSelf(user2);
                            final BaseFragment baseFragment2 = baseFragment;
                            final boolean z111 = z;
                            final TLRPC.Chat chat10 = chat9;
                            final boolean z112 = z4;
                            final boolean z113 = z6;
                            final Theme.ResourcesProvider resourcesProvider2 = resourcesProvider;
                            if (zIsUserSelf) {
                                AlertsCreator.createClearOrDeleteDialogAlert(baseFragment2, z111, true, chat10, user2, false, z112, zArr8[0], z113, booleanCallback2, resourcesProvider2);
                                return;
                            }
                            if (user2 != null && zArr8[0]) {
                                MessagesStorage.getInstance(baseFragment2.getCurrentAccount()).getMessagesCount(user2.id, new MessagesStorage.IntCallback() {
                                    @Override
                                    public final void run(int i7) {
                                        boolean[] zArr9 = zArr8;
                                        MessagesStorage.BooleanCallback booleanCallback3 = booleanCallback2;
                                        if (i7 >= 50) {
                                            AlertsCreator.createClearOrDeleteDialogAlert(baseFragment2, z111, true, chat10, user2, false, z112, zArr9[0], z113, booleanCallback3, resourcesProvider2);
                                        } else if (booleanCallback3 != null) {
                                            booleanCallback3.run(zArr9[0]);
                                        }
                                    }
                                });
                                return;
                            }
                            if (ChatObject.isChannel(chat10) && chat10.creator && !zArr8[0]) {
                                final Browser.Progress progressMakeButtonLoading = builder.alertDialog.makeButtonLoading(-1, true, true);
                                progressMakeButtonLoading.init();
                                TLRPC.TL_channels_getFutureCreatorAfterLeave tL_channels_getFutureCreatorAfterLeave = new TLRPC.TL_channels_getFutureCreatorAfterLeave();
                                tL_channels_getFutureCreatorAfterLeave.channel = MessagesController.getInputChannel(chat10);
                                final int i7 = i5;
                                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i7);
                                AiTonesController$$ExternalSyntheticLambda0 aiTonesController$$ExternalSyntheticLambda0 = new AiTonesController$$ExternalSyntheticLambda0();
                                final Activity activity = parentActivity;
                                connectionsManager.sendRequestTyped(tL_channels_getFutureCreatorAfterLeave, aiTonesController$$ExternalSyntheticLambda0, new Utilities.Callback2() {
                                    @Override
                                    public final void run(Object obj, Object obj2) {
                                        TLRPC.User user3 = (TLRPC.User) obj;
                                        progressMakeButtonLoading.end(false);
                                        TLRPC.User user4 = user3 instanceof TLRPC.TL_userEmpty ? null : user3;
                                        MessagesStorage.BooleanCallback booleanCallback3 = booleanCallback2;
                                        if (user4 == null) {
                                            booleanCallback3.run(z19 || zArr8[0]);
                                            return;
                                        }
                                        int i8 = i7;
                                        Theme.ResourcesProvider resourcesProvider3 = resourcesProvider2;
                                        Activity activity2 = activity;
                                        TLRPC.Chat chat11 = chat10;
                                        OAuthSheet$$ExternalSyntheticLambda9 oAuthSheet$$ExternalSyntheticLambda9 = new OAuthSheet$$ExternalSyntheticLambda9(activity2, chat11, user4, i8, booleanCallback3, resourcesProvider3, 7);
                                        AlertsCreator$$ExternalSyntheticLambda188 alertsCreator$$ExternalSyntheticLambda188 = new AlertsCreator$$ExternalSyntheticLambda188(booleanCallback3, 0);
                                        BaseFragment baseFragment3 = baseFragment2;
                                        if (baseFragment3 == null || baseFragment3.getParentActivity() == null || chat11 == null) {
                                            return;
                                        }
                                        Context context = baseFragment3.getContext();
                                        TLRPC.User currentUser = UserConfig.getInstance(baseFragment3.getCurrentAccount()).getCurrentUser();
                                        boolean zIsChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat11);
                                        FrameLayout frameLayout2 = new FrameLayout(context);
                                        frameLayout2.setClipToPadding(false);
                                        frameLayout2.setClipChildren(false);
                                        BackupImageView backupImageView2 = new BackupImageView(context);
                                        AvatarDrawable avatarDrawable2 = new AvatarDrawable((Theme.ResourcesProvider) null);
                                        avatarDrawable2.setInfo(UserConfig.selectedAccount, currentUser);
                                        backupImageView2.setRoundRadius(AndroidUtilities.dp(30.0f));
                                        backupImageView2.imageReceiver.setForUserOrChat(currentUser, avatarDrawable2);
                                        backupImageView2.onNewImageSet();
                                        frameLayout2.addView(backupImageView2, LayoutHelper.createFrame(60, 60.0f, 17, -48.0f, 15.0f, 0.0f, 12.0f));
                                        ImageView imageView = new ImageView(context);
                                        imageView.setImageResource(R.drawable.msg_arrow_avatar);
                                        imageView.setColorFilter(new PorterDuffColorFilter(baseFragment3.getThemedColor(Theme.key_divider), PorterDuff.Mode.SRC_IN));
                                        frameLayout2.addView(imageView, LayoutHelper.createFrame(24, 24.0f, 17, 0.0f, 15.0f, 0.0f, 12.0f));
                                        BackupImageView backupImageView3 = new BackupImageView(context) {
                                            public final Path path = new Path();

                                            @Override
                                            public final void onDraw(Canvas canvas) {
                                                canvas.save();
                                                Path path = this.path;
                                                path.rewind();
                                                path.addCircle(AndroidUtilities.dp(54.0f), AndroidUtilities.dp(53.0f), AndroidUtilities.dp(14.0f), Path.Direction.CW);
                                                canvas.clipPath(path, Region.Op.DIFFERENCE);
                                                super.onDraw(canvas);
                                                canvas.restore();
                                            }
                                        };
                                        AvatarDrawable avatarDrawable3 = new AvatarDrawable((Theme.ResourcesProvider) null);
                                        avatarDrawable3.setInfo(UserConfig.selectedAccount, user4);
                                        backupImageView3.setRoundRadius(AndroidUtilities.dp(30.0f));
                                        backupImageView3.imageReceiver.setForUserOrChat(user4, avatarDrawable3);
                                        backupImageView3.onNewImageSet();
                                        frameLayout2.addView(backupImageView3, LayoutHelper.createFrame(60, 60.0f, 17, 48.0f, 15.0f, 0.0f, 12.0f));
                                        BackupImageView backupImageView4 = new BackupImageView(context);
                                        AvatarDrawable avatarDrawable4 = new AvatarDrawable((Theme.ResourcesProvider) null);
                                        avatarDrawable4.setInfo(UserConfig.selectedAccount, chat11);
                                        backupImageView4.setRoundRadius(AndroidUtilities.dp(12.0f));
                                        backupImageView4.imageReceiver.setForUserOrChat(chat11, avatarDrawable4);
                                        backupImageView4.onNewImageSet();
                                        frameLayout2.addView(backupImageView4, LayoutHelper.createFrame(24, 24.0f, 17, 72.0f, 26.0f, 0.0f, 0.0f));
                                        AlertDialog.Builder builder2 = new AlertDialog.Builder(context, 0, null);
                                        AlertDialog alertDialog8 = builder2.alertDialog;
                                        alertDialog8.aspectRatio = -1.0f;
                                        alertDialog8.topView = frameLayout2;
                                        alertDialog8.title = LocaleController.getString(zIsChannelAndNotMegaGroup ? R.string.LeaveChannelTitle : R.string.LeaveGroupTitle);
                                        alertDialog8.message = AndroidUtilities.replaceTags(LocaleController.formatString(zIsChannelAndNotMegaGroup ? R.string.LeaveChannelNewOwnerText : R.string.LeaveGroupNewOwnerText, UserObject.getUserName(user4), chat11.title));
                                        builder2.setNegativeButton(LocaleController.getString(R.string.AppointNewOwner), new ChatActivity$$ExternalSyntheticLambda356(oAuthSheet$$ExternalSyntheticLambda9, 26));
                                        builder2.setNeutralButton(LocaleController.getString(R.string.Cancel), null);
                                        builder2.setPositiveButton(LocaleController.getString(zIsChannelAndNotMegaGroup ? R.string.LeaveChannel : R.string.LeaveMegaMenu), new ChatActivity$$ExternalSyntheticLambda356(alertsCreator$$ExternalSyntheticLambda188, 27));
                                        alertDialog8.show();
                                        View button = alertDialog8.getButton(-1);
                                        if (button instanceof TextView) {
                                            ((TextView) button).setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
                                        }
                                    }
                                });
                                return;
                            }
                        }
                        if (!z19 && !zArr8[0]) {
                            z110 = false;
                        }
                        booleanCallback2.run(z110);
                    }
                });
                builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                AlertDialog alertDialog7 = alertDialog;
                baseFragment.showDialog(alertDialog7);
                textView = (TextView) alertDialog7.getButton(-1);
                if (textView != null) {
                    textView.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
                }
            }
            string3 = LocaleController.getString(R.string.DeleteAll);
            final TLRPC.Chat chat10 = chat2;
            final boolean[] zArr8 = zArr;
            final int i6 = currentAccount;
            final boolean z18 = z9;
            builder.setPositiveButton(string3, new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog8, int i7) {
                    final boolean[] zArr9 = zArr8;
                    final MessagesStorage.BooleanCallback booleanCallback2 = booleanCallback;
                    boolean z19 = z18;
                    final boolean z110 = z2;
                    boolean z111 = true;
                    if (!z19 && !z110 && !z3) {
                        final TLRPC.User user2 = user;
                        boolean zIsUserSelf = UserObject.isUserSelf(user2);
                        final BaseFragment baseFragment2 = baseFragment;
                        final boolean z112 = z;
                        final TLRPC.Chat chat11 = chat10;
                        final boolean z113 = z4;
                        final boolean z114 = z6;
                        final Theme.ResourcesProvider resourcesProvider2 = resourcesProvider;
                        if (zIsUserSelf) {
                            AlertsCreator.createClearOrDeleteDialogAlert(baseFragment2, z112, true, chat11, user2, false, z113, zArr9[0], z114, booleanCallback2, resourcesProvider2);
                            return;
                        }
                        if (user2 != null && zArr9[0]) {
                            MessagesStorage.getInstance(baseFragment2.getCurrentAccount()).getMessagesCount(user2.id, new MessagesStorage.IntCallback() {
                                @Override
                                public final void run(int i8) {
                                    boolean[] zArr10 = zArr9;
                                    MessagesStorage.BooleanCallback booleanCallback3 = booleanCallback2;
                                    if (i8 >= 50) {
                                        AlertsCreator.createClearOrDeleteDialogAlert(baseFragment2, z112, true, chat11, user2, false, z113, zArr10[0], z114, booleanCallback3, resourcesProvider2);
                                    } else if (booleanCallback3 != null) {
                                        booleanCallback3.run(zArr10[0]);
                                    }
                                }
                            });
                            return;
                        }
                        if (ChatObject.isChannel(chat11) && chat11.creator && !zArr9[0]) {
                            final Browser.Progress progressMakeButtonLoading = builder.alertDialog.makeButtonLoading(-1, true, true);
                            progressMakeButtonLoading.init();
                            TLRPC.TL_channels_getFutureCreatorAfterLeave tL_channels_getFutureCreatorAfterLeave = new TLRPC.TL_channels_getFutureCreatorAfterLeave();
                            tL_channels_getFutureCreatorAfterLeave.channel = MessagesController.getInputChannel(chat11);
                            final int i8 = i6;
                            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i8);
                            AiTonesController$$ExternalSyntheticLambda0 aiTonesController$$ExternalSyntheticLambda0 = new AiTonesController$$ExternalSyntheticLambda0();
                            final Activity activity = parentActivity;
                            connectionsManager.sendRequestTyped(tL_channels_getFutureCreatorAfterLeave, aiTonesController$$ExternalSyntheticLambda0, new Utilities.Callback2() {
                                @Override
                                public final void run(Object obj, Object obj2) {
                                    TLRPC.User user3 = (TLRPC.User) obj;
                                    progressMakeButtonLoading.end(false);
                                    TLRPC.User user4 = user3 instanceof TLRPC.TL_userEmpty ? null : user3;
                                    MessagesStorage.BooleanCallback booleanCallback3 = booleanCallback2;
                                    if (user4 == null) {
                                        booleanCallback3.run(z110 || zArr9[0]);
                                        return;
                                    }
                                    int i9 = i8;
                                    Theme.ResourcesProvider resourcesProvider3 = resourcesProvider2;
                                    Activity activity2 = activity;
                                    TLRPC.Chat chat12 = chat11;
                                    OAuthSheet$$ExternalSyntheticLambda9 oAuthSheet$$ExternalSyntheticLambda9 = new OAuthSheet$$ExternalSyntheticLambda9(activity2, chat12, user4, i9, booleanCallback3, resourcesProvider3, 7);
                                    AlertsCreator$$ExternalSyntheticLambda188 alertsCreator$$ExternalSyntheticLambda188 = new AlertsCreator$$ExternalSyntheticLambda188(booleanCallback3, 0);
                                    BaseFragment baseFragment3 = baseFragment2;
                                    if (baseFragment3 == null || baseFragment3.getParentActivity() == null || chat12 == null) {
                                        return;
                                    }
                                    Context context = baseFragment3.getContext();
                                    TLRPC.User currentUser = UserConfig.getInstance(baseFragment3.getCurrentAccount()).getCurrentUser();
                                    boolean zIsChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat12);
                                    FrameLayout frameLayout2 = new FrameLayout(context);
                                    frameLayout2.setClipToPadding(false);
                                    frameLayout2.setClipChildren(false);
                                    BackupImageView backupImageView2 = new BackupImageView(context);
                                    AvatarDrawable avatarDrawable2 = new AvatarDrawable((Theme.ResourcesProvider) null);
                                    avatarDrawable2.setInfo(UserConfig.selectedAccount, currentUser);
                                    backupImageView2.setRoundRadius(AndroidUtilities.dp(30.0f));
                                    backupImageView2.imageReceiver.setForUserOrChat(currentUser, avatarDrawable2);
                                    backupImageView2.onNewImageSet();
                                    frameLayout2.addView(backupImageView2, LayoutHelper.createFrame(60, 60.0f, 17, -48.0f, 15.0f, 0.0f, 12.0f));
                                    ImageView imageView = new ImageView(context);
                                    imageView.setImageResource(R.drawable.msg_arrow_avatar);
                                    imageView.setColorFilter(new PorterDuffColorFilter(baseFragment3.getThemedColor(Theme.key_divider), PorterDuff.Mode.SRC_IN));
                                    frameLayout2.addView(imageView, LayoutHelper.createFrame(24, 24.0f, 17, 0.0f, 15.0f, 0.0f, 12.0f));
                                    BackupImageView backupImageView3 = new BackupImageView(context) {
                                        public final Path path = new Path();

                                        @Override
                                        public final void onDraw(Canvas canvas) {
                                            canvas.save();
                                            Path path = this.path;
                                            path.rewind();
                                            path.addCircle(AndroidUtilities.dp(54.0f), AndroidUtilities.dp(53.0f), AndroidUtilities.dp(14.0f), Path.Direction.CW);
                                            canvas.clipPath(path, Region.Op.DIFFERENCE);
                                            super.onDraw(canvas);
                                            canvas.restore();
                                        }
                                    };
                                    AvatarDrawable avatarDrawable3 = new AvatarDrawable((Theme.ResourcesProvider) null);
                                    avatarDrawable3.setInfo(UserConfig.selectedAccount, user4);
                                    backupImageView3.setRoundRadius(AndroidUtilities.dp(30.0f));
                                    backupImageView3.imageReceiver.setForUserOrChat(user4, avatarDrawable3);
                                    backupImageView3.onNewImageSet();
                                    frameLayout2.addView(backupImageView3, LayoutHelper.createFrame(60, 60.0f, 17, 48.0f, 15.0f, 0.0f, 12.0f));
                                    BackupImageView backupImageView4 = new BackupImageView(context);
                                    AvatarDrawable avatarDrawable4 = new AvatarDrawable((Theme.ResourcesProvider) null);
                                    avatarDrawable4.setInfo(UserConfig.selectedAccount, chat12);
                                    backupImageView4.setRoundRadius(AndroidUtilities.dp(12.0f));
                                    backupImageView4.imageReceiver.setForUserOrChat(chat12, avatarDrawable4);
                                    backupImageView4.onNewImageSet();
                                    frameLayout2.addView(backupImageView4, LayoutHelper.createFrame(24, 24.0f, 17, 72.0f, 26.0f, 0.0f, 0.0f));
                                    AlertDialog.Builder builder2 = new AlertDialog.Builder(context, 0, null);
                                    AlertDialog alertDialog9 = builder2.alertDialog;
                                    alertDialog9.aspectRatio = -1.0f;
                                    alertDialog9.topView = frameLayout2;
                                    alertDialog9.title = LocaleController.getString(zIsChannelAndNotMegaGroup ? R.string.LeaveChannelTitle : R.string.LeaveGroupTitle);
                                    alertDialog9.message = AndroidUtilities.replaceTags(LocaleController.formatString(zIsChannelAndNotMegaGroup ? R.string.LeaveChannelNewOwnerText : R.string.LeaveGroupNewOwnerText, UserObject.getUserName(user4), chat12.title));
                                    builder2.setNegativeButton(LocaleController.getString(R.string.AppointNewOwner), new ChatActivity$$ExternalSyntheticLambda356(oAuthSheet$$ExternalSyntheticLambda9, 26));
                                    builder2.setNeutralButton(LocaleController.getString(R.string.Cancel), null);
                                    builder2.setPositiveButton(LocaleController.getString(zIsChannelAndNotMegaGroup ? R.string.LeaveChannel : R.string.LeaveMegaMenu), new ChatActivity$$ExternalSyntheticLambda356(alertsCreator$$ExternalSyntheticLambda188, 27));
                                    alertDialog9.show();
                                    View button = alertDialog9.getButton(-1);
                                    if (button instanceof TextView) {
                                        ((TextView) button).setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
                                    }
                                }
                            });
                            return;
                        }
                    }
                    if (!z110 && !zArr9[0]) {
                        z111 = false;
                    }
                    booleanCallback2.run(z111);
                }
            });
            builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
            AlertDialog alertDialog8 = alertDialog;
            baseFragment.showDialog(alertDialog8);
            textView = (TextView) alertDialog8.getButton(-1);
            if (textView != null) {
                textView.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
            }
        }
        chat2 = chat;
        z7 = false;
        currentAccount = currentAccount;
        zArr = zArr2;
        alertDialog = alertDialog2;
        CheckBoxCell checkBoxCell3 = new CheckBoxCell(parentActivity, 1, 17, false, resourcesProvider);
        checkBoxCellArr[0] = checkBoxCell3;
        checkBoxCell3.setBackground(Theme.getSelectorDrawable(false));
        if (!z7) {
            if (z) {
                checkBoxCellArr[0].setText(LocaleController.formatString(R.string.ClearHistoryOptionAlso, UserObject.getFirstName(user)), "", false, false, false);
            } else {
                z8 = true;
                checkBoxCellArr[0].setText(LocaleController.formatString(R.string.DeleteMessagesOptionAlso, UserObject.getFirstName(user)), "", false, false, false);
            }
            checkBoxCellArr[0].setMultiline(z8);
            CheckBoxCell checkBoxCell4 = checkBoxCellArr[0];
            if (LocaleController.isRTL) {
                iDp = AndroidUtilities.dp(f);
            } else {
                iDp = AndroidUtilities.dp(8.0f);
            }
            int iDp3 = AndroidUtilities.dp(f2);
            if (LocaleController.isRTL) {
                iDp2 = AndroidUtilities.dp(8.0f);
            } else {
                iDp2 = AndroidUtilities.dp(f);
            }
            checkBoxCell4.setPadding(iDp, iDp3, iDp2, AndroidUtilities.dp(f2));
            frameLayout.addView(checkBoxCellArr[0], LayoutHelper.createFrame(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
            builder = builder;
            qrActivity$$ExternalSyntheticLambda15 = new QrActivity$$ExternalSyntheticLambda15(z7, chat2, builder, zArr);
            checkBoxCellArr[0].setOnClickListener(new ItemOptions$$ExternalSyntheticLambda7(4, zArr, qrActivity$$ExternalSyntheticLambda15));
            if (z5) {
                CheckBoxCell checkBoxCell5 = checkBoxCellArr[0];
                zArr[0] = true;
                checkBoxCell5.setChecked(true, false);
                qrActivity$$ExternalSyntheticLambda15.run();
            }
            if (user == null) {
                int currentAccount5 = baseFragment.getCurrentAccount();
                if (monoForumLinkedChat != null) {
                    chat3 = monoForumLinkedChat;
                } else {
                    chat3 = chat2;
                }
                avatarDrawable.setInfo(currentAccount5, chat3);
                if (monoForumLinkedChat != null) {
                    chat4 = monoForumLinkedChat;
                } else {
                    chat4 = chat2;
                }
                backupImageView.imageReceiver.setForUserOrChat(chat4, avatarDrawable);
                backupImageView.onNewImageSet();
            } else if (UserObject.isReplyUser(user)) {
                avatarDrawable.scaleSize = 0.8f;
                avatarDrawable.setAvatarType(12);
                backupImageView.setImage(null, null, avatarDrawable, user);
            } else if (user.id == clientUserId) {
                avatarDrawable.scaleSize = 0.8f;
                avatarDrawable.setAvatarType(1);
                backupImageView.setImage(null, null, avatarDrawable, user);
            } else {
                avatarDrawable.scaleSize = 1.0f;
                avatarDrawable.setInfo(baseFragment.getCurrentAccount(), user);
                backupImageView.imageReceiver.setForUserOrChat(user, avatarDrawable);
                backupImageView.onNewImageSet();
            }
            if (z2) {
                if (UserObject.isUserSelf(user)) {
                    anonymousClass10.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.DeleteAllMessagesSavedAlert)));
                } else if (chat2 == null) {
                    anonymousClass10.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.DeleteAllMessagesAlert)));
                } else {
                    anonymousClass10.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.DeleteAllMessagesAlert)));
                }
            } else if (z) {
                if (user == null) {
                    if (monoForumLinkedChat != null) {
                        string2 = LocaleController.formatString(R.string.MonoforumTitle, monoForumLinkedChat.title);
                    } else {
                        string2 = chat2.title;
                    }
                    if (ChatObject.isChannel(chat2)) {
                        anonymousClass10.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureClearHistoryWithChat, string2)));
                    } else {
                        anonymousClass10.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureClearHistoryWithChat, string2)));
                    }
                } else if (z3) {
                    anonymousClass10.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureClearHistoryWithSecretUser, UserObject.getUserName(user))));
                } else if (user.id == clientUserId) {
                    anonymousClass10.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.AreYouSureClearHistorySavedMessages)));
                } else {
                    anonymousClass10.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureClearHistoryWithUser, UserObject.getUserName(user))));
                }
            } else if (user != null) {
                if (z3) {
                    anonymousClass10.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureDeleteThisChatWithSecretUser, UserObject.getUserName(user))));
                } else if (user.id == clientUserId) {
                    anonymousClass10.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.AreYouSureDeleteThisChatSavedMessages)));
                } else if (user.bot) {
                    anonymousClass10.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureDeleteThisChatWithUser, UserObject.getUserName(user))));
                } else {
                    anonymousClass10.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureDeleteThisChatWithUser, UserObject.getUserName(user))));
                }
            } else if (ChatObject.isChannel(chat2)) {
                if (monoForumLinkedChat != null) {
                    string = LocaleController.formatString(R.string.MonoforumTitle, monoForumLinkedChat.title);
                } else {
                    string = chat2.title;
                }
                if (chat2.megagroup) {
                    anonymousClass10.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.MegaLeaveAlertWithName, string)));
                } else {
                    anonymousClass10.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.ChannelLeaveAlertWithName, string)));
                }
            } else {
                anonymousClass10.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureDeleteAndExitName, chat2.title)));
            }
            if (!z2) {
                if (z) {
                    if (z9) {
                        string3 = LocaleController.getString(R.string.ClearHistoryCache);
                    } else {
                        string3 = LocaleController.getString(R.string.ClearForMe);
                    }
                } else if (!z7) {
                    if (!ChatObject.isChannel(chat2)) {
                        string3 = LocaleController.getString(R.string.DeleteChatUser);
                    } else if (chat2.monoforum) {
                        string3 = LocaleController.getString(R.string.LeaveConversationMenu);
                    } else if (chat2.megagroup) {
                        string3 = LocaleController.getString(R.string.LeaveMegaMenu);
                    } else {
                        string3 = LocaleController.getString(R.string.LeaveChannelMenu);
                    }
                } else if (!ChatObject.isChannel(chat2)) {
                    string3 = LocaleController.getString(R.string.DeleteChatUser);
                } else if (chat2.monoforum) {
                    string3 = LocaleController.getString(R.string.LeaveConversationMenu);
                } else if (chat2.megagroup) {
                    string3 = LocaleController.getString(R.string.LeaveMegaMenu);
                } else {
                    string3 = LocaleController.getString(R.string.LeaveChannelMenu);
                }
                final TLRPC.Chat chat11 = chat2;
                final boolean[] zArr9 = zArr;
                final int i7 = currentAccount;
                final boolean z19 = z9;
                builder.setPositiveButton(string3, new AlertDialog.OnButtonClickListener() {
                    @Override
                    public final void onClick(AlertDialog alertDialog9, int i8) {
                        final boolean[] zArr10 = zArr9;
                        final MessagesStorage.BooleanCallback booleanCallback2 = booleanCallback;
                        boolean z110 = z19;
                        final boolean z111 = z2;
                        boolean z112 = true;
                        if (!z110 && !z111 && !z3) {
                            final TLRPC.User user2 = user;
                            boolean zIsUserSelf = UserObject.isUserSelf(user2);
                            final BaseFragment baseFragment2 = baseFragment;
                            final boolean z113 = z;
                            final TLRPC.Chat chat12 = chat11;
                            final boolean z114 = z4;
                            final boolean z115 = z6;
                            final Theme.ResourcesProvider resourcesProvider2 = resourcesProvider;
                            if (zIsUserSelf) {
                                AlertsCreator.createClearOrDeleteDialogAlert(baseFragment2, z113, true, chat12, user2, false, z114, zArr10[0], z115, booleanCallback2, resourcesProvider2);
                                return;
                            }
                            if (user2 != null && zArr10[0]) {
                                MessagesStorage.getInstance(baseFragment2.getCurrentAccount()).getMessagesCount(user2.id, new MessagesStorage.IntCallback() {
                                    @Override
                                    public final void run(int i9) {
                                        boolean[] zArr11 = zArr10;
                                        MessagesStorage.BooleanCallback booleanCallback3 = booleanCallback2;
                                        if (i9 >= 50) {
                                            AlertsCreator.createClearOrDeleteDialogAlert(baseFragment2, z113, true, chat12, user2, false, z114, zArr11[0], z115, booleanCallback3, resourcesProvider2);
                                        } else if (booleanCallback3 != null) {
                                            booleanCallback3.run(zArr11[0]);
                                        }
                                    }
                                });
                                return;
                            }
                            if (ChatObject.isChannel(chat12) && chat12.creator && !zArr10[0]) {
                                final Browser.Progress progressMakeButtonLoading = builder.alertDialog.makeButtonLoading(-1, true, true);
                                progressMakeButtonLoading.init();
                                TLRPC.TL_channels_getFutureCreatorAfterLeave tL_channels_getFutureCreatorAfterLeave = new TLRPC.TL_channels_getFutureCreatorAfterLeave();
                                tL_channels_getFutureCreatorAfterLeave.channel = MessagesController.getInputChannel(chat12);
                                final int i9 = i7;
                                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i9);
                                AiTonesController$$ExternalSyntheticLambda0 aiTonesController$$ExternalSyntheticLambda0 = new AiTonesController$$ExternalSyntheticLambda0();
                                final Activity activity = parentActivity;
                                connectionsManager.sendRequestTyped(tL_channels_getFutureCreatorAfterLeave, aiTonesController$$ExternalSyntheticLambda0, new Utilities.Callback2() {
                                    @Override
                                    public final void run(Object obj, Object obj2) {
                                        TLRPC.User user3 = (TLRPC.User) obj;
                                        progressMakeButtonLoading.end(false);
                                        TLRPC.User user4 = user3 instanceof TLRPC.TL_userEmpty ? null : user3;
                                        MessagesStorage.BooleanCallback booleanCallback3 = booleanCallback2;
                                        if (user4 == null) {
                                            booleanCallback3.run(z111 || zArr10[0]);
                                            return;
                                        }
                                        int i10 = i9;
                                        Theme.ResourcesProvider resourcesProvider3 = resourcesProvider2;
                                        Activity activity2 = activity;
                                        TLRPC.Chat chat13 = chat12;
                                        OAuthSheet$$ExternalSyntheticLambda9 oAuthSheet$$ExternalSyntheticLambda9 = new OAuthSheet$$ExternalSyntheticLambda9(activity2, chat13, user4, i10, booleanCallback3, resourcesProvider3, 7);
                                        AlertsCreator$$ExternalSyntheticLambda188 alertsCreator$$ExternalSyntheticLambda188 = new AlertsCreator$$ExternalSyntheticLambda188(booleanCallback3, 0);
                                        BaseFragment baseFragment3 = baseFragment2;
                                        if (baseFragment3 == null || baseFragment3.getParentActivity() == null || chat13 == null) {
                                            return;
                                        }
                                        Context context = baseFragment3.getContext();
                                        TLRPC.User currentUser = UserConfig.getInstance(baseFragment3.getCurrentAccount()).getCurrentUser();
                                        boolean zIsChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat13);
                                        FrameLayout frameLayout2 = new FrameLayout(context);
                                        frameLayout2.setClipToPadding(false);
                                        frameLayout2.setClipChildren(false);
                                        BackupImageView backupImageView2 = new BackupImageView(context);
                                        AvatarDrawable avatarDrawable2 = new AvatarDrawable((Theme.ResourcesProvider) null);
                                        avatarDrawable2.setInfo(UserConfig.selectedAccount, currentUser);
                                        backupImageView2.setRoundRadius(AndroidUtilities.dp(30.0f));
                                        backupImageView2.imageReceiver.setForUserOrChat(currentUser, avatarDrawable2);
                                        backupImageView2.onNewImageSet();
                                        frameLayout2.addView(backupImageView2, LayoutHelper.createFrame(60, 60.0f, 17, -48.0f, 15.0f, 0.0f, 12.0f));
                                        ImageView imageView = new ImageView(context);
                                        imageView.setImageResource(R.drawable.msg_arrow_avatar);
                                        imageView.setColorFilter(new PorterDuffColorFilter(baseFragment3.getThemedColor(Theme.key_divider), PorterDuff.Mode.SRC_IN));
                                        frameLayout2.addView(imageView, LayoutHelper.createFrame(24, 24.0f, 17, 0.0f, 15.0f, 0.0f, 12.0f));
                                        BackupImageView backupImageView3 = new BackupImageView(context) {
                                            public final Path path = new Path();

                                            @Override
                                            public final void onDraw(Canvas canvas) {
                                                canvas.save();
                                                Path path = this.path;
                                                path.rewind();
                                                path.addCircle(AndroidUtilities.dp(54.0f), AndroidUtilities.dp(53.0f), AndroidUtilities.dp(14.0f), Path.Direction.CW);
                                                canvas.clipPath(path, Region.Op.DIFFERENCE);
                                                super.onDraw(canvas);
                                                canvas.restore();
                                            }
                                        };
                                        AvatarDrawable avatarDrawable3 = new AvatarDrawable((Theme.ResourcesProvider) null);
                                        avatarDrawable3.setInfo(UserConfig.selectedAccount, user4);
                                        backupImageView3.setRoundRadius(AndroidUtilities.dp(30.0f));
                                        backupImageView3.imageReceiver.setForUserOrChat(user4, avatarDrawable3);
                                        backupImageView3.onNewImageSet();
                                        frameLayout2.addView(backupImageView3, LayoutHelper.createFrame(60, 60.0f, 17, 48.0f, 15.0f, 0.0f, 12.0f));
                                        BackupImageView backupImageView4 = new BackupImageView(context);
                                        AvatarDrawable avatarDrawable4 = new AvatarDrawable((Theme.ResourcesProvider) null);
                                        avatarDrawable4.setInfo(UserConfig.selectedAccount, chat13);
                                        backupImageView4.setRoundRadius(AndroidUtilities.dp(12.0f));
                                        backupImageView4.imageReceiver.setForUserOrChat(chat13, avatarDrawable4);
                                        backupImageView4.onNewImageSet();
                                        frameLayout2.addView(backupImageView4, LayoutHelper.createFrame(24, 24.0f, 17, 72.0f, 26.0f, 0.0f, 0.0f));
                                        AlertDialog.Builder builder2 = new AlertDialog.Builder(context, 0, null);
                                        AlertDialog alertDialog10 = builder2.alertDialog;
                                        alertDialog10.aspectRatio = -1.0f;
                                        alertDialog10.topView = frameLayout2;
                                        alertDialog10.title = LocaleController.getString(zIsChannelAndNotMegaGroup ? R.string.LeaveChannelTitle : R.string.LeaveGroupTitle);
                                        alertDialog10.message = AndroidUtilities.replaceTags(LocaleController.formatString(zIsChannelAndNotMegaGroup ? R.string.LeaveChannelNewOwnerText : R.string.LeaveGroupNewOwnerText, UserObject.getUserName(user4), chat13.title));
                                        builder2.setNegativeButton(LocaleController.getString(R.string.AppointNewOwner), new ChatActivity$$ExternalSyntheticLambda356(oAuthSheet$$ExternalSyntheticLambda9, 26));
                                        builder2.setNeutralButton(LocaleController.getString(R.string.Cancel), null);
                                        builder2.setPositiveButton(LocaleController.getString(zIsChannelAndNotMegaGroup ? R.string.LeaveChannel : R.string.LeaveMegaMenu), new ChatActivity$$ExternalSyntheticLambda356(alertsCreator$$ExternalSyntheticLambda188, 27));
                                        alertDialog10.show();
                                        View button = alertDialog10.getButton(-1);
                                        if (button instanceof TextView) {
                                            ((TextView) button).setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
                                        }
                                    }
                                });
                                return;
                            }
                        }
                        if (!z111 && !zArr10[0]) {
                            z112 = false;
                        }
                        booleanCallback2.run(z112);
                    }
                });
                builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                AlertDialog alertDialog9 = alertDialog;
                baseFragment.showDialog(alertDialog9);
                textView = (TextView) alertDialog9.getButton(-1);
                if (textView != null) {
                    textView.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
                }
            }
            string3 = LocaleController.getString(R.string.DeleteAll);
            final TLRPC.Chat chat12 = chat2;
            final boolean[] zArr10 = zArr;
            final int i8 = currentAccount;
            final boolean z110 = z9;
            builder.setPositiveButton(string3, new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog10, int i9) {
                    final boolean[] zArr11 = zArr10;
                    final MessagesStorage.BooleanCallback booleanCallback2 = booleanCallback;
                    boolean z111 = z110;
                    final boolean z112 = z2;
                    boolean z113 = true;
                    if (!z111 && !z112 && !z3) {
                        final TLRPC.User user2 = user;
                        boolean zIsUserSelf = UserObject.isUserSelf(user2);
                        final BaseFragment baseFragment2 = baseFragment;
                        final boolean z114 = z;
                        final TLRPC.Chat chat13 = chat12;
                        final boolean z115 = z4;
                        final boolean z116 = z6;
                        final Theme.ResourcesProvider resourcesProvider2 = resourcesProvider;
                        if (zIsUserSelf) {
                            AlertsCreator.createClearOrDeleteDialogAlert(baseFragment2, z114, true, chat13, user2, false, z115, zArr11[0], z116, booleanCallback2, resourcesProvider2);
                            return;
                        }
                        if (user2 != null && zArr11[0]) {
                            MessagesStorage.getInstance(baseFragment2.getCurrentAccount()).getMessagesCount(user2.id, new MessagesStorage.IntCallback() {
                                @Override
                                public final void run(int i10) {
                                    boolean[] zArr12 = zArr11;
                                    MessagesStorage.BooleanCallback booleanCallback3 = booleanCallback2;
                                    if (i10 >= 50) {
                                        AlertsCreator.createClearOrDeleteDialogAlert(baseFragment2, z114, true, chat13, user2, false, z115, zArr12[0], z116, booleanCallback3, resourcesProvider2);
                                    } else if (booleanCallback3 != null) {
                                        booleanCallback3.run(zArr12[0]);
                                    }
                                }
                            });
                            return;
                        }
                        if (ChatObject.isChannel(chat13) && chat13.creator && !zArr11[0]) {
                            final Browser.Progress progressMakeButtonLoading = builder.alertDialog.makeButtonLoading(-1, true, true);
                            progressMakeButtonLoading.init();
                            TLRPC.TL_channels_getFutureCreatorAfterLeave tL_channels_getFutureCreatorAfterLeave = new TLRPC.TL_channels_getFutureCreatorAfterLeave();
                            tL_channels_getFutureCreatorAfterLeave.channel = MessagesController.getInputChannel(chat13);
                            final int i10 = i8;
                            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
                            AiTonesController$$ExternalSyntheticLambda0 aiTonesController$$ExternalSyntheticLambda0 = new AiTonesController$$ExternalSyntheticLambda0();
                            final Activity activity = parentActivity;
                            connectionsManager.sendRequestTyped(tL_channels_getFutureCreatorAfterLeave, aiTonesController$$ExternalSyntheticLambda0, new Utilities.Callback2() {
                                @Override
                                public final void run(Object obj, Object obj2) {
                                    TLRPC.User user3 = (TLRPC.User) obj;
                                    progressMakeButtonLoading.end(false);
                                    TLRPC.User user4 = user3 instanceof TLRPC.TL_userEmpty ? null : user3;
                                    MessagesStorage.BooleanCallback booleanCallback3 = booleanCallback2;
                                    if (user4 == null) {
                                        booleanCallback3.run(z112 || zArr11[0]);
                                        return;
                                    }
                                    int i11 = i10;
                                    Theme.ResourcesProvider resourcesProvider3 = resourcesProvider2;
                                    Activity activity2 = activity;
                                    TLRPC.Chat chat14 = chat13;
                                    OAuthSheet$$ExternalSyntheticLambda9 oAuthSheet$$ExternalSyntheticLambda9 = new OAuthSheet$$ExternalSyntheticLambda9(activity2, chat14, user4, i11, booleanCallback3, resourcesProvider3, 7);
                                    AlertsCreator$$ExternalSyntheticLambda188 alertsCreator$$ExternalSyntheticLambda188 = new AlertsCreator$$ExternalSyntheticLambda188(booleanCallback3, 0);
                                    BaseFragment baseFragment3 = baseFragment2;
                                    if (baseFragment3 == null || baseFragment3.getParentActivity() == null || chat14 == null) {
                                        return;
                                    }
                                    Context context = baseFragment3.getContext();
                                    TLRPC.User currentUser = UserConfig.getInstance(baseFragment3.getCurrentAccount()).getCurrentUser();
                                    boolean zIsChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat14);
                                    FrameLayout frameLayout2 = new FrameLayout(context);
                                    frameLayout2.setClipToPadding(false);
                                    frameLayout2.setClipChildren(false);
                                    BackupImageView backupImageView2 = new BackupImageView(context);
                                    AvatarDrawable avatarDrawable2 = new AvatarDrawable((Theme.ResourcesProvider) null);
                                    avatarDrawable2.setInfo(UserConfig.selectedAccount, currentUser);
                                    backupImageView2.setRoundRadius(AndroidUtilities.dp(30.0f));
                                    backupImageView2.imageReceiver.setForUserOrChat(currentUser, avatarDrawable2);
                                    backupImageView2.onNewImageSet();
                                    frameLayout2.addView(backupImageView2, LayoutHelper.createFrame(60, 60.0f, 17, -48.0f, 15.0f, 0.0f, 12.0f));
                                    ImageView imageView = new ImageView(context);
                                    imageView.setImageResource(R.drawable.msg_arrow_avatar);
                                    imageView.setColorFilter(new PorterDuffColorFilter(baseFragment3.getThemedColor(Theme.key_divider), PorterDuff.Mode.SRC_IN));
                                    frameLayout2.addView(imageView, LayoutHelper.createFrame(24, 24.0f, 17, 0.0f, 15.0f, 0.0f, 12.0f));
                                    BackupImageView backupImageView3 = new BackupImageView(context) {
                                        public final Path path = new Path();

                                        @Override
                                        public final void onDraw(Canvas canvas) {
                                            canvas.save();
                                            Path path = this.path;
                                            path.rewind();
                                            path.addCircle(AndroidUtilities.dp(54.0f), AndroidUtilities.dp(53.0f), AndroidUtilities.dp(14.0f), Path.Direction.CW);
                                            canvas.clipPath(path, Region.Op.DIFFERENCE);
                                            super.onDraw(canvas);
                                            canvas.restore();
                                        }
                                    };
                                    AvatarDrawable avatarDrawable3 = new AvatarDrawable((Theme.ResourcesProvider) null);
                                    avatarDrawable3.setInfo(UserConfig.selectedAccount, user4);
                                    backupImageView3.setRoundRadius(AndroidUtilities.dp(30.0f));
                                    backupImageView3.imageReceiver.setForUserOrChat(user4, avatarDrawable3);
                                    backupImageView3.onNewImageSet();
                                    frameLayout2.addView(backupImageView3, LayoutHelper.createFrame(60, 60.0f, 17, 48.0f, 15.0f, 0.0f, 12.0f));
                                    BackupImageView backupImageView4 = new BackupImageView(context);
                                    AvatarDrawable avatarDrawable4 = new AvatarDrawable((Theme.ResourcesProvider) null);
                                    avatarDrawable4.setInfo(UserConfig.selectedAccount, chat14);
                                    backupImageView4.setRoundRadius(AndroidUtilities.dp(12.0f));
                                    backupImageView4.imageReceiver.setForUserOrChat(chat14, avatarDrawable4);
                                    backupImageView4.onNewImageSet();
                                    frameLayout2.addView(backupImageView4, LayoutHelper.createFrame(24, 24.0f, 17, 72.0f, 26.0f, 0.0f, 0.0f));
                                    AlertDialog.Builder builder2 = new AlertDialog.Builder(context, 0, null);
                                    AlertDialog alertDialog11 = builder2.alertDialog;
                                    alertDialog11.aspectRatio = -1.0f;
                                    alertDialog11.topView = frameLayout2;
                                    alertDialog11.title = LocaleController.getString(zIsChannelAndNotMegaGroup ? R.string.LeaveChannelTitle : R.string.LeaveGroupTitle);
                                    alertDialog11.message = AndroidUtilities.replaceTags(LocaleController.formatString(zIsChannelAndNotMegaGroup ? R.string.LeaveChannelNewOwnerText : R.string.LeaveGroupNewOwnerText, UserObject.getUserName(user4), chat14.title));
                                    builder2.setNegativeButton(LocaleController.getString(R.string.AppointNewOwner), new ChatActivity$$ExternalSyntheticLambda356(oAuthSheet$$ExternalSyntheticLambda9, 26));
                                    builder2.setNeutralButton(LocaleController.getString(R.string.Cancel), null);
                                    builder2.setPositiveButton(LocaleController.getString(zIsChannelAndNotMegaGroup ? R.string.LeaveChannel : R.string.LeaveMegaMenu), new ChatActivity$$ExternalSyntheticLambda356(alertsCreator$$ExternalSyntheticLambda188, 27));
                                    alertDialog11.show();
                                    View button = alertDialog11.getButton(-1);
                                    if (button instanceof TextView) {
                                        ((TextView) button).setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
                                    }
                                }
                            });
                            return;
                        }
                    }
                    if (!z112 && !zArr11[0]) {
                        z113 = false;
                    }
                    booleanCallback2.run(z113);
                }
            });
            builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
            AlertDialog alertDialog10 = alertDialog;
            baseFragment.showDialog(alertDialog10);
            textView = (TextView) alertDialog10.getButton(-1);
            if (textView != null) {
                textView.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
            }
        }
        if (!ChatObject.isChannel(chat2) || chat2.megagroup) {
            checkBoxCellArr[0].setText(LocaleController.getString(R.string.DeleteGroupForAll), "", false, false, false);
        } else {
            checkBoxCellArr[0].setText(LocaleController.getString(R.string.DeleteChannelForAll), "", false, false, false);
        }
        z8 = true;
        checkBoxCellArr[0].setMultiline(z8);
        CheckBoxCell checkBoxCell6 = checkBoxCellArr[0];
        if (LocaleController.isRTL) {
            iDp = AndroidUtilities.dp(f);
        } else {
            iDp = AndroidUtilities.dp(8.0f);
        }
        int iDp4 = AndroidUtilities.dp(f2);
        if (LocaleController.isRTL) {
            iDp2 = AndroidUtilities.dp(8.0f);
        } else {
            iDp2 = AndroidUtilities.dp(f);
        }
        checkBoxCell6.setPadding(iDp, iDp4, iDp2, AndroidUtilities.dp(f2));
        frameLayout.addView(checkBoxCellArr[0], LayoutHelper.createFrame(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        builder = builder;
        qrActivity$$ExternalSyntheticLambda15 = new QrActivity$$ExternalSyntheticLambda15(z7, chat2, builder, zArr);
        checkBoxCellArr[0].setOnClickListener(new ItemOptions$$ExternalSyntheticLambda7(4, zArr, qrActivity$$ExternalSyntheticLambda15));
        if (z5) {
            CheckBoxCell checkBoxCell7 = checkBoxCellArr[0];
            zArr[0] = true;
            checkBoxCell7.setChecked(true, false);
            qrActivity$$ExternalSyntheticLambda15.run();
        }
        if (user == null) {
            int currentAccount6 = baseFragment.getCurrentAccount();
            if (monoForumLinkedChat != null) {
                chat3 = monoForumLinkedChat;
            } else {
                chat3 = chat2;
            }
            avatarDrawable.setInfo(currentAccount6, chat3);
            if (monoForumLinkedChat != null) {
                chat4 = monoForumLinkedChat;
            } else {
                chat4 = chat2;
            }
            backupImageView.imageReceiver.setForUserOrChat(chat4, avatarDrawable);
            backupImageView.onNewImageSet();
        } else if (UserObject.isReplyUser(user)) {
            avatarDrawable.scaleSize = 0.8f;
            avatarDrawable.setAvatarType(12);
            backupImageView.setImage(null, null, avatarDrawable, user);
        } else if (user.id == clientUserId) {
            avatarDrawable.scaleSize = 0.8f;
            avatarDrawable.setAvatarType(1);
            backupImageView.setImage(null, null, avatarDrawable, user);
        } else {
            avatarDrawable.scaleSize = 1.0f;
            avatarDrawable.setInfo(baseFragment.getCurrentAccount(), user);
            backupImageView.imageReceiver.setForUserOrChat(user, avatarDrawable);
            backupImageView.onNewImageSet();
        }
        if (z2) {
            if (UserObject.isUserSelf(user)) {
                anonymousClass10.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.DeleteAllMessagesSavedAlert)));
            } else if (chat2 == null) {
                anonymousClass10.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.DeleteAllMessagesAlert)));
            } else {
                anonymousClass10.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.DeleteAllMessagesAlert)));
            }
        } else if (z) {
            if (user == null) {
                if (monoForumLinkedChat != null) {
                    string2 = LocaleController.formatString(R.string.MonoforumTitle, monoForumLinkedChat.title);
                } else {
                    string2 = chat2.title;
                }
                if (ChatObject.isChannel(chat2)) {
                    anonymousClass10.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureClearHistoryWithChat, string2)));
                } else {
                    anonymousClass10.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureClearHistoryWithChat, string2)));
                }
            } else if (z3) {
                anonymousClass10.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureClearHistoryWithSecretUser, UserObject.getUserName(user))));
            } else if (user.id == clientUserId) {
                anonymousClass10.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.AreYouSureClearHistorySavedMessages)));
            } else {
                anonymousClass10.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureClearHistoryWithUser, UserObject.getUserName(user))));
            }
        } else if (user != null) {
            if (z3) {
                anonymousClass10.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureDeleteThisChatWithSecretUser, UserObject.getUserName(user))));
            } else if (user.id == clientUserId) {
                anonymousClass10.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.AreYouSureDeleteThisChatSavedMessages)));
            } else if (user.bot) {
                anonymousClass10.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureDeleteThisChatWithUser, UserObject.getUserName(user))));
            } else {
                anonymousClass10.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureDeleteThisChatWithUser, UserObject.getUserName(user))));
            }
        } else if (ChatObject.isChannel(chat2)) {
            if (monoForumLinkedChat != null) {
                string = LocaleController.formatString(R.string.MonoforumTitle, monoForumLinkedChat.title);
            } else {
                string = chat2.title;
            }
            if (chat2.megagroup) {
                anonymousClass10.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.MegaLeaveAlertWithName, string)));
            } else {
                anonymousClass10.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.ChannelLeaveAlertWithName, string)));
            }
        } else {
            anonymousClass10.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureDeleteAndExitName, chat2.title)));
        }
        if (!z2) {
            if (z) {
                if (z9) {
                    string3 = LocaleController.getString(R.string.ClearHistoryCache);
                } else {
                    string3 = LocaleController.getString(R.string.ClearForMe);
                }
            } else if (!z7) {
                if (!ChatObject.isChannel(chat2)) {
                    string3 = LocaleController.getString(R.string.DeleteChatUser);
                } else if (chat2.monoforum) {
                    string3 = LocaleController.getString(R.string.LeaveConversationMenu);
                } else if (chat2.megagroup) {
                    string3 = LocaleController.getString(R.string.LeaveMegaMenu);
                } else {
                    string3 = LocaleController.getString(R.string.LeaveChannelMenu);
                }
            } else if (!ChatObject.isChannel(chat2)) {
                string3 = LocaleController.getString(R.string.DeleteChatUser);
            } else if (chat2.monoforum) {
                string3 = LocaleController.getString(R.string.LeaveConversationMenu);
            } else if (chat2.megagroup) {
                string3 = LocaleController.getString(R.string.LeaveMegaMenu);
            } else {
                string3 = LocaleController.getString(R.string.LeaveChannelMenu);
            }
            final TLRPC.Chat chat13 = chat2;
            final boolean[] zArr11 = zArr;
            final int i9 = currentAccount;
            final boolean z111 = z9;
            builder.setPositiveButton(string3, new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog11, int i10) {
                    final boolean[] zArr12 = zArr11;
                    final MessagesStorage.BooleanCallback booleanCallback2 = booleanCallback;
                    boolean z112 = z111;
                    final boolean z113 = z2;
                    boolean z114 = true;
                    if (!z112 && !z113 && !z3) {
                        final TLRPC.User user2 = user;
                        boolean zIsUserSelf = UserObject.isUserSelf(user2);
                        final BaseFragment baseFragment2 = baseFragment;
                        final boolean z115 = z;
                        final TLRPC.Chat chat14 = chat13;
                        final boolean z116 = z4;
                        final boolean z117 = z6;
                        final Theme.ResourcesProvider resourcesProvider2 = resourcesProvider;
                        if (zIsUserSelf) {
                            AlertsCreator.createClearOrDeleteDialogAlert(baseFragment2, z115, true, chat14, user2, false, z116, zArr12[0], z117, booleanCallback2, resourcesProvider2);
                            return;
                        }
                        if (user2 != null && zArr12[0]) {
                            MessagesStorage.getInstance(baseFragment2.getCurrentAccount()).getMessagesCount(user2.id, new MessagesStorage.IntCallback() {
                                @Override
                                public final void run(int i11) {
                                    boolean[] zArr13 = zArr12;
                                    MessagesStorage.BooleanCallback booleanCallback3 = booleanCallback2;
                                    if (i11 >= 50) {
                                        AlertsCreator.createClearOrDeleteDialogAlert(baseFragment2, z115, true, chat14, user2, false, z116, zArr13[0], z117, booleanCallback3, resourcesProvider2);
                                    } else if (booleanCallback3 != null) {
                                        booleanCallback3.run(zArr13[0]);
                                    }
                                }
                            });
                            return;
                        }
                        if (ChatObject.isChannel(chat14) && chat14.creator && !zArr12[0]) {
                            final Browser.Progress progressMakeButtonLoading = builder.alertDialog.makeButtonLoading(-1, true, true);
                            progressMakeButtonLoading.init();
                            TLRPC.TL_channels_getFutureCreatorAfterLeave tL_channels_getFutureCreatorAfterLeave = new TLRPC.TL_channels_getFutureCreatorAfterLeave();
                            tL_channels_getFutureCreatorAfterLeave.channel = MessagesController.getInputChannel(chat14);
                            final int i11 = i9;
                            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
                            AiTonesController$$ExternalSyntheticLambda0 aiTonesController$$ExternalSyntheticLambda0 = new AiTonesController$$ExternalSyntheticLambda0();
                            final Activity activity = parentActivity;
                            connectionsManager.sendRequestTyped(tL_channels_getFutureCreatorAfterLeave, aiTonesController$$ExternalSyntheticLambda0, new Utilities.Callback2() {
                                @Override
                                public final void run(Object obj, Object obj2) {
                                    TLRPC.User user3 = (TLRPC.User) obj;
                                    progressMakeButtonLoading.end(false);
                                    TLRPC.User user4 = user3 instanceof TLRPC.TL_userEmpty ? null : user3;
                                    MessagesStorage.BooleanCallback booleanCallback3 = booleanCallback2;
                                    if (user4 == null) {
                                        booleanCallback3.run(z113 || zArr12[0]);
                                        return;
                                    }
                                    int i12 = i11;
                                    Theme.ResourcesProvider resourcesProvider3 = resourcesProvider2;
                                    Activity activity2 = activity;
                                    TLRPC.Chat chat15 = chat14;
                                    OAuthSheet$$ExternalSyntheticLambda9 oAuthSheet$$ExternalSyntheticLambda9 = new OAuthSheet$$ExternalSyntheticLambda9(activity2, chat15, user4, i12, booleanCallback3, resourcesProvider3, 7);
                                    AlertsCreator$$ExternalSyntheticLambda188 alertsCreator$$ExternalSyntheticLambda188 = new AlertsCreator$$ExternalSyntheticLambda188(booleanCallback3, 0);
                                    BaseFragment baseFragment3 = baseFragment2;
                                    if (baseFragment3 == null || baseFragment3.getParentActivity() == null || chat15 == null) {
                                        return;
                                    }
                                    Context context = baseFragment3.getContext();
                                    TLRPC.User currentUser = UserConfig.getInstance(baseFragment3.getCurrentAccount()).getCurrentUser();
                                    boolean zIsChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat15);
                                    FrameLayout frameLayout2 = new FrameLayout(context);
                                    frameLayout2.setClipToPadding(false);
                                    frameLayout2.setClipChildren(false);
                                    BackupImageView backupImageView2 = new BackupImageView(context);
                                    AvatarDrawable avatarDrawable2 = new AvatarDrawable((Theme.ResourcesProvider) null);
                                    avatarDrawable2.setInfo(UserConfig.selectedAccount, currentUser);
                                    backupImageView2.setRoundRadius(AndroidUtilities.dp(30.0f));
                                    backupImageView2.imageReceiver.setForUserOrChat(currentUser, avatarDrawable2);
                                    backupImageView2.onNewImageSet();
                                    frameLayout2.addView(backupImageView2, LayoutHelper.createFrame(60, 60.0f, 17, -48.0f, 15.0f, 0.0f, 12.0f));
                                    ImageView imageView = new ImageView(context);
                                    imageView.setImageResource(R.drawable.msg_arrow_avatar);
                                    imageView.setColorFilter(new PorterDuffColorFilter(baseFragment3.getThemedColor(Theme.key_divider), PorterDuff.Mode.SRC_IN));
                                    frameLayout2.addView(imageView, LayoutHelper.createFrame(24, 24.0f, 17, 0.0f, 15.0f, 0.0f, 12.0f));
                                    BackupImageView backupImageView3 = new BackupImageView(context) {
                                        public final Path path = new Path();

                                        @Override
                                        public final void onDraw(Canvas canvas) {
                                            canvas.save();
                                            Path path = this.path;
                                            path.rewind();
                                            path.addCircle(AndroidUtilities.dp(54.0f), AndroidUtilities.dp(53.0f), AndroidUtilities.dp(14.0f), Path.Direction.CW);
                                            canvas.clipPath(path, Region.Op.DIFFERENCE);
                                            super.onDraw(canvas);
                                            canvas.restore();
                                        }
                                    };
                                    AvatarDrawable avatarDrawable3 = new AvatarDrawable((Theme.ResourcesProvider) null);
                                    avatarDrawable3.setInfo(UserConfig.selectedAccount, user4);
                                    backupImageView3.setRoundRadius(AndroidUtilities.dp(30.0f));
                                    backupImageView3.imageReceiver.setForUserOrChat(user4, avatarDrawable3);
                                    backupImageView3.onNewImageSet();
                                    frameLayout2.addView(backupImageView3, LayoutHelper.createFrame(60, 60.0f, 17, 48.0f, 15.0f, 0.0f, 12.0f));
                                    BackupImageView backupImageView4 = new BackupImageView(context);
                                    AvatarDrawable avatarDrawable4 = new AvatarDrawable((Theme.ResourcesProvider) null);
                                    avatarDrawable4.setInfo(UserConfig.selectedAccount, chat15);
                                    backupImageView4.setRoundRadius(AndroidUtilities.dp(12.0f));
                                    backupImageView4.imageReceiver.setForUserOrChat(chat15, avatarDrawable4);
                                    backupImageView4.onNewImageSet();
                                    frameLayout2.addView(backupImageView4, LayoutHelper.createFrame(24, 24.0f, 17, 72.0f, 26.0f, 0.0f, 0.0f));
                                    AlertDialog.Builder builder2 = new AlertDialog.Builder(context, 0, null);
                                    AlertDialog alertDialog12 = builder2.alertDialog;
                                    alertDialog12.aspectRatio = -1.0f;
                                    alertDialog12.topView = frameLayout2;
                                    alertDialog12.title = LocaleController.getString(zIsChannelAndNotMegaGroup ? R.string.LeaveChannelTitle : R.string.LeaveGroupTitle);
                                    alertDialog12.message = AndroidUtilities.replaceTags(LocaleController.formatString(zIsChannelAndNotMegaGroup ? R.string.LeaveChannelNewOwnerText : R.string.LeaveGroupNewOwnerText, UserObject.getUserName(user4), chat15.title));
                                    builder2.setNegativeButton(LocaleController.getString(R.string.AppointNewOwner), new ChatActivity$$ExternalSyntheticLambda356(oAuthSheet$$ExternalSyntheticLambda9, 26));
                                    builder2.setNeutralButton(LocaleController.getString(R.string.Cancel), null);
                                    builder2.setPositiveButton(LocaleController.getString(zIsChannelAndNotMegaGroup ? R.string.LeaveChannel : R.string.LeaveMegaMenu), new ChatActivity$$ExternalSyntheticLambda356(alertsCreator$$ExternalSyntheticLambda188, 27));
                                    alertDialog12.show();
                                    View button = alertDialog12.getButton(-1);
                                    if (button instanceof TextView) {
                                        ((TextView) button).setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
                                    }
                                }
                            });
                            return;
                        }
                    }
                    if (!z113 && !zArr12[0]) {
                        z114 = false;
                    }
                    booleanCallback2.run(z114);
                }
            });
            builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
            AlertDialog alertDialog11 = alertDialog;
            baseFragment.showDialog(alertDialog11);
            textView = (TextView) alertDialog11.getButton(-1);
            if (textView != null) {
                textView.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
            }
        }
        string3 = LocaleController.getString(R.string.DeleteAll);
        final TLRPC.Chat chat14 = chat2;
        final boolean[] zArr12 = zArr;
        final int i10 = currentAccount;
        final boolean z112 = z9;
        builder.setPositiveButton(string3, new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog12, int i11) {
                final boolean[] zArr13 = zArr12;
                final MessagesStorage.BooleanCallback booleanCallback2 = booleanCallback;
                boolean z113 = z112;
                final boolean z114 = z2;
                boolean z115 = true;
                if (!z113 && !z114 && !z3) {
                    final TLRPC.User user2 = user;
                    boolean zIsUserSelf = UserObject.isUserSelf(user2);
                    final BaseFragment baseFragment2 = baseFragment;
                    final boolean z116 = z;
                    final TLRPC.Chat chat15 = chat14;
                    final boolean z117 = z4;
                    final boolean z118 = z6;
                    final Theme.ResourcesProvider resourcesProvider2 = resourcesProvider;
                    if (zIsUserSelf) {
                        AlertsCreator.createClearOrDeleteDialogAlert(baseFragment2, z116, true, chat15, user2, false, z117, zArr13[0], z118, booleanCallback2, resourcesProvider2);
                        return;
                    }
                    if (user2 != null && zArr13[0]) {
                        MessagesStorage.getInstance(baseFragment2.getCurrentAccount()).getMessagesCount(user2.id, new MessagesStorage.IntCallback() {
                            @Override
                            public final void run(int i12) {
                                boolean[] zArr14 = zArr13;
                                MessagesStorage.BooleanCallback booleanCallback3 = booleanCallback2;
                                if (i12 >= 50) {
                                    AlertsCreator.createClearOrDeleteDialogAlert(baseFragment2, z116, true, chat15, user2, false, z117, zArr14[0], z118, booleanCallback3, resourcesProvider2);
                                } else if (booleanCallback3 != null) {
                                    booleanCallback3.run(zArr14[0]);
                                }
                            }
                        });
                        return;
                    }
                    if (ChatObject.isChannel(chat15) && chat15.creator && !zArr13[0]) {
                        final Browser.Progress progressMakeButtonLoading = builder.alertDialog.makeButtonLoading(-1, true, true);
                        progressMakeButtonLoading.init();
                        TLRPC.TL_channels_getFutureCreatorAfterLeave tL_channels_getFutureCreatorAfterLeave = new TLRPC.TL_channels_getFutureCreatorAfterLeave();
                        tL_channels_getFutureCreatorAfterLeave.channel = MessagesController.getInputChannel(chat15);
                        final int i12 = i10;
                        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i12);
                        AiTonesController$$ExternalSyntheticLambda0 aiTonesController$$ExternalSyntheticLambda0 = new AiTonesController$$ExternalSyntheticLambda0();
                        final Activity activity = parentActivity;
                        connectionsManager.sendRequestTyped(tL_channels_getFutureCreatorAfterLeave, aiTonesController$$ExternalSyntheticLambda0, new Utilities.Callback2() {
                            @Override
                            public final void run(Object obj, Object obj2) {
                                TLRPC.User user3 = (TLRPC.User) obj;
                                progressMakeButtonLoading.end(false);
                                TLRPC.User user4 = user3 instanceof TLRPC.TL_userEmpty ? null : user3;
                                MessagesStorage.BooleanCallback booleanCallback3 = booleanCallback2;
                                if (user4 == null) {
                                    booleanCallback3.run(z114 || zArr13[0]);
                                    return;
                                }
                                int i13 = i12;
                                Theme.ResourcesProvider resourcesProvider3 = resourcesProvider2;
                                Activity activity2 = activity;
                                TLRPC.Chat chat16 = chat15;
                                OAuthSheet$$ExternalSyntheticLambda9 oAuthSheet$$ExternalSyntheticLambda9 = new OAuthSheet$$ExternalSyntheticLambda9(activity2, chat16, user4, i13, booleanCallback3, resourcesProvider3, 7);
                                AlertsCreator$$ExternalSyntheticLambda188 alertsCreator$$ExternalSyntheticLambda188 = new AlertsCreator$$ExternalSyntheticLambda188(booleanCallback3, 0);
                                BaseFragment baseFragment3 = baseFragment2;
                                if (baseFragment3 == null || baseFragment3.getParentActivity() == null || chat16 == null) {
                                    return;
                                }
                                Context context = baseFragment3.getContext();
                                TLRPC.User currentUser = UserConfig.getInstance(baseFragment3.getCurrentAccount()).getCurrentUser();
                                boolean zIsChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat16);
                                FrameLayout frameLayout2 = new FrameLayout(context);
                                frameLayout2.setClipToPadding(false);
                                frameLayout2.setClipChildren(false);
                                BackupImageView backupImageView2 = new BackupImageView(context);
                                AvatarDrawable avatarDrawable2 = new AvatarDrawable((Theme.ResourcesProvider) null);
                                avatarDrawable2.setInfo(UserConfig.selectedAccount, currentUser);
                                backupImageView2.setRoundRadius(AndroidUtilities.dp(30.0f));
                                backupImageView2.imageReceiver.setForUserOrChat(currentUser, avatarDrawable2);
                                backupImageView2.onNewImageSet();
                                frameLayout2.addView(backupImageView2, LayoutHelper.createFrame(60, 60.0f, 17, -48.0f, 15.0f, 0.0f, 12.0f));
                                ImageView imageView = new ImageView(context);
                                imageView.setImageResource(R.drawable.msg_arrow_avatar);
                                imageView.setColorFilter(new PorterDuffColorFilter(baseFragment3.getThemedColor(Theme.key_divider), PorterDuff.Mode.SRC_IN));
                                frameLayout2.addView(imageView, LayoutHelper.createFrame(24, 24.0f, 17, 0.0f, 15.0f, 0.0f, 12.0f));
                                BackupImageView backupImageView3 = new BackupImageView(context) {
                                    public final Path path = new Path();

                                    @Override
                                    public final void onDraw(Canvas canvas) {
                                        canvas.save();
                                        Path path = this.path;
                                        path.rewind();
                                        path.addCircle(AndroidUtilities.dp(54.0f), AndroidUtilities.dp(53.0f), AndroidUtilities.dp(14.0f), Path.Direction.CW);
                                        canvas.clipPath(path, Region.Op.DIFFERENCE);
                                        super.onDraw(canvas);
                                        canvas.restore();
                                    }
                                };
                                AvatarDrawable avatarDrawable3 = new AvatarDrawable((Theme.ResourcesProvider) null);
                                avatarDrawable3.setInfo(UserConfig.selectedAccount, user4);
                                backupImageView3.setRoundRadius(AndroidUtilities.dp(30.0f));
                                backupImageView3.imageReceiver.setForUserOrChat(user4, avatarDrawable3);
                                backupImageView3.onNewImageSet();
                                frameLayout2.addView(backupImageView3, LayoutHelper.createFrame(60, 60.0f, 17, 48.0f, 15.0f, 0.0f, 12.0f));
                                BackupImageView backupImageView4 = new BackupImageView(context);
                                AvatarDrawable avatarDrawable4 = new AvatarDrawable((Theme.ResourcesProvider) null);
                                avatarDrawable4.setInfo(UserConfig.selectedAccount, chat16);
                                backupImageView4.setRoundRadius(AndroidUtilities.dp(12.0f));
                                backupImageView4.imageReceiver.setForUserOrChat(chat16, avatarDrawable4);
                                backupImageView4.onNewImageSet();
                                frameLayout2.addView(backupImageView4, LayoutHelper.createFrame(24, 24.0f, 17, 72.0f, 26.0f, 0.0f, 0.0f));
                                AlertDialog.Builder builder2 = new AlertDialog.Builder(context, 0, null);
                                AlertDialog alertDialog13 = builder2.alertDialog;
                                alertDialog13.aspectRatio = -1.0f;
                                alertDialog13.topView = frameLayout2;
                                alertDialog13.title = LocaleController.getString(zIsChannelAndNotMegaGroup ? R.string.LeaveChannelTitle : R.string.LeaveGroupTitle);
                                alertDialog13.message = AndroidUtilities.replaceTags(LocaleController.formatString(zIsChannelAndNotMegaGroup ? R.string.LeaveChannelNewOwnerText : R.string.LeaveGroupNewOwnerText, UserObject.getUserName(user4), chat16.title));
                                builder2.setNegativeButton(LocaleController.getString(R.string.AppointNewOwner), new ChatActivity$$ExternalSyntheticLambda356(oAuthSheet$$ExternalSyntheticLambda9, 26));
                                builder2.setNeutralButton(LocaleController.getString(R.string.Cancel), null);
                                builder2.setPositiveButton(LocaleController.getString(zIsChannelAndNotMegaGroup ? R.string.LeaveChannel : R.string.LeaveMegaMenu), new ChatActivity$$ExternalSyntheticLambda356(alertsCreator$$ExternalSyntheticLambda188, 27));
                                alertDialog13.show();
                                View button = alertDialog13.getButton(-1);
                                if (button instanceof TextView) {
                                    ((TextView) button).setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
                                }
                            }
                        });
                        return;
                    }
                }
                if (!z114 && !zArr13[0]) {
                    z115 = false;
                }
                booleanCallback2.run(z115);
            }
        });
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        AlertDialog alertDialog12 = alertDialog;
        baseFragment.showDialog(alertDialog12);
        textView = (TextView) alertDialog12.getButton(-1);
        if (textView != null) {
            textView.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
        }
    }

    public static AlertDialog.Builder createSimpleAlert(Context context, String str, String str2, String str3, Runnable runnable, Theme.ResourcesProvider resourcesProvider) {
        if (context == null || str2 == null) {
            return null;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(context, 0, resourcesProvider);
        if (str == null) {
            str = LocaleController.getString(R.string.AppName);
        }
        AlertDialog alertDialog = builder.alertDialog;
        alertDialog.title = str;
        alertDialog.message = str2;
        if (str3 == null) {
            builder.setPositiveButton(LocaleController.getString(R.string.OK), null);
            return builder;
        }
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        builder.setPositiveButton(str3, new ChatActivity$$ExternalSyntheticLambda177(2, runnable));
        return builder;
    }

    public static void showOpenUrlAlert(BaseFragment baseFragment, String str, boolean z, boolean z2, boolean z3, Browser.Progress progress, TLRPC.WebPage webPage, Theme.ResourcesProvider resourcesProvider) {
        if (baseFragment == null || baseFragment.getParentActivity() == null) {
            return;
        }
        showOpenUrlAlert(baseFragment.getParentActivity(), str, z, z2, z3, baseFragment instanceof ChatActivity ? ((ChatActivity) baseFragment).inlineReturn : 0L, progress, webPage, resourcesProvider);
    }

    public static BottomSheet.Builder createScheduleDatePickerDialog(Context context, long j, long j2, int i, ScheduleDatePickerDelegate scheduleDatePickerDelegate, Runnable runnable, Theme.ResourcesProvider resourcesProvider) {
        return createScheduleDatePickerDialog(context, j, j2, i, false, scheduleDatePickerDelegate, runnable, new ScheduleDatePickerColors(resourcesProvider), resourcesProvider);
    }

    public static org.telegram.ui.ActionBar.BottomSheet.Builder createScheduleDatePickerDialog(android.content.Context r54, final long r55, long r57, int r59, boolean r60, org.telegram.ui.Components.AlertsCreator.ScheduleDatePickerDelegate r61, java.lang.Runnable r62, org.telegram.ui.Components.AlertsCreator.ScheduleDatePickerColors r63, org.telegram.ui.ActionBar.Theme.ResourcesProvider r64) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.AlertsCreator.createScheduleDatePickerDialog(android.content.Context, long, long, int, boolean, org.telegram.ui.Components.AlertsCreator$ScheduleDatePickerDelegate, java.lang.Runnable, org.telegram.ui.Components.AlertsCreator$ScheduleDatePickerColors, org.telegram.ui.ActionBar.Theme$ResourcesProvider):org.telegram.ui.ActionBar.BottomSheet$Builder");
    }

    public static void showOpenUrlAlert(Context context, String str, boolean z, boolean z2, boolean z3, long j, Browser.Progress progress, TLRPC.WebPage webPage, Theme.ResourcesProvider resourcesProvider) {
        String strReplace;
        if (AndroidUtilities.isContextSafe(context)) {
            String scheme = str == null ? null : Uri.parse(str).getScheme();
            if (!Browser.isInternalUri(Uri.parse(str), false, null) && z2 && !"mailto".equalsIgnoreCase(scheme)) {
                if (z) {
                    try {
                        Uri uri = Uri.parse(str);
                        strReplace = Browser.replace(uri, null, null, Browser.IDN_toUnicode(uri.getHost()), null);
                    } catch (Exception e) {
                        FileLog.e((Throwable) e, false);
                        strReplace = str;
                    }
                } else {
                    strReplace = str;
                }
                LaunchActivity$$ExternalSyntheticLambda121 launchActivity$$ExternalSyntheticLambda121 = new LaunchActivity$$ExternalSyntheticLambda121(context, str, j, progress, 24);
                AlertDialog.Builder builder = new AlertDialog.Builder(context, 0, resourcesProvider);
                String string = LocaleController.getString(R.string.OpenUrlTitle);
                AlertDialog alertDialog = builder.alertDialog;
                alertDialog.title = string;
                TextView textView = new TextView(context);
                textView.setText(strReplace);
                textView.setTextSize(1, 14.0f);
                int i = Theme.key_dialogTextBlack;
                textView.setTextColor(Theme.getColor(i, resourcesProvider));
                textView.setGravity(17);
                textView.setMaxLines(5);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(12.0f));
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setCornerRadius(AndroidUtilities.dp(22.0f));
                gradientDrawable.setColor(Theme.multAlpha(0.06f, Theme.getColor(i, resourcesProvider)));
                textView.setBackground(gradientDrawable);
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                linearLayout.addView(textView, LayoutHelper.createLinear(22.0f, 4.0f, 22.0f, 9.0f, -1, -2));
                int i2 = WebPagePreviewView.$r8$clinit;
                if (webPage != null && (webPage.site_name != null || webPage.title != null || webPage.description != null || webPage.photo != null || webPage.document != null)) {
                    WebPagePreviewView webPagePreviewView = new WebPagePreviewView(context, resourcesProvider);
                    webPagePreviewView.setWebPage(webPage);
                    linearLayout.addView(webPagePreviewView, LayoutHelper.createLinear(22.0f, 3.0f, 22.0f, 7.0f, -1, -2));
                }
                builder.setView(linearLayout);
                alertDialog.customWidth = Math.min(AndroidUtilities.dp(320.0f), (AndroidUtilities.displaySize.x * 85) / 100);
                builder.setPositiveButton(LocaleController.getString(R.string.Open), new ColorPicker$$ExternalSyntheticLambda6(launchActivity$$ExternalSyntheticLambda121, 3));
                ArticleViewer.IBlock.CC.m(R.string.Cancel, builder, (AlertDialog.OnButtonClickListener) null);
                return;
            }
            Browser.openUrl(context, Uri.parse(str), j == 0, true, z3 && Uri.parse(str).getPath().matches("^/\\w*/[^\\d]*(?:\\?startapp=.*?|)$"), progress, null, false, true, false);
        }
    }

    public final class AnonymousClass35 extends LinearLayout {
        public final int $r8$classId = 1;
        public boolean ignoreLayout;
        public final Object val$dayPicker;
        public final NumberPicker val$hourPicker;
        public final NumberPicker val$minutePicker;
        public final NumberPicker val$monthPicker;

        public AnonymousClass35(Context context, ScheduleDatePickerColors scheduleDatePickerColors, NumberPicker numberPicker, BoostDialogs.AnonymousClass1 anonymousClass1, BoostDialogs.AnonymousClass2 anonymousClass2) {
            super(context);
            this.val$monthPicker = numberPicker;
            this.val$hourPicker = anonymousClass1;
            this.val$minutePicker = anonymousClass2;
            this.ignoreLayout = false;
            TextPaint textPaint = new TextPaint(1);
            this.val$dayPicker = textPaint;
            setWillNotDraw(false);
            textPaint.setTextSize(AndroidUtilities.dp(20.0f));
            textPaint.setTypeface(AndroidUtilities.bold());
            textPaint.setColor(scheduleDatePickerColors.textColor);
        }

        @Override
        public void onDraw(Canvas canvas) {
            switch (this.$r8$classId) {
                case 1:
                    super.onDraw(canvas);
                    canvas.drawText(":", ((BoostDialogs.AnonymousClass1) this.val$hourPicker).getRight() - AndroidUtilities.dp(12.0f), (getHeight() / 2.0f) - AndroidUtilities.dp(11.0f), (TextPaint) this.val$dayPicker);
                    break;
                default:
                    super.onDraw(canvas);
                    break;
            }
        }

        @Override
        public final void onMeasure(int i, int i2) {
            switch (this.$r8$classId) {
                case 0:
                    this.ignoreLayout = true;
                    Point point = AndroidUtilities.displaySize;
                    int i3 = point.x > point.y ? 3 : 5;
                    NumberPicker numberPicker = this.val$monthPicker;
                    numberPicker.setItemCount(i3);
                    NumberPicker numberPicker2 = (NumberPicker) this.val$dayPicker;
                    numberPicker2.setItemCount(i3);
                    NumberPicker numberPicker3 = this.val$hourPicker;
                    numberPicker3.setItemCount(i3);
                    NumberPicker numberPicker4 = this.val$minutePicker;
                    numberPicker4.setItemCount(i3);
                    numberPicker.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i3;
                    numberPicker2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i3;
                    numberPicker3.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i3;
                    numberPicker4.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i3;
                    this.ignoreLayout = false;
                    super.onMeasure(i, i2);
                    break;
                default:
                    this.ignoreLayout = true;
                    Point point2 = AndroidUtilities.displaySize;
                    int i4 = point2.x > point2.y ? 3 : 5;
                    NumberPicker numberPicker5 = this.val$monthPicker;
                    numberPicker5.setItemCount(i4);
                    BoostDialogs.AnonymousClass1 anonymousClass1 = (BoostDialogs.AnonymousClass1) this.val$hourPicker;
                    anonymousClass1.setItemCount(i4);
                    BoostDialogs.AnonymousClass2 anonymousClass2 = (BoostDialogs.AnonymousClass2) this.val$minutePicker;
                    anonymousClass2.setItemCount(i4);
                    numberPicker5.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i4;
                    anonymousClass1.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i4;
                    anonymousClass2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i4;
                    this.ignoreLayout = false;
                    super.onMeasure(i, i2);
                    break;
            }
        }

        @Override
        public final void requestLayout() {
            switch (this.$r8$classId) {
                case 0:
                    if (!this.ignoreLayout) {
                        super.requestLayout();
                        break;
                    }
                    break;
                default:
                    if (!this.ignoreLayout) {
                        super.requestLayout();
                        break;
                    }
                    break;
            }
        }

        public AnonymousClass35(Context context, NumberPicker numberPicker, NumberPicker numberPicker2, NumberPicker numberPicker3, NumberPicker numberPicker4) {
            super(context);
            this.val$monthPicker = numberPicker;
            this.val$dayPicker = numberPicker2;
            this.val$hourPicker = numberPicker3;
            this.val$minutePicker = numberPicker4;
            this.ignoreLayout = false;
        }
    }

    public final class ScheduleDatePickerColors {
        public final int backgroundColor;
        public final int buttonBackgroundColor;
        public final int buttonTextColor;
        public final int iconSelectorColor;
        public final int subMenuBackgroundColor;
        public final int subMenuSelectorColor;
        public final int subMenuTextColor;
        public final int textColor;

        public ScheduleDatePickerColors(Theme.ResourcesProvider resourcesProvider) {
            int colorOrDefault = resourcesProvider != null ? resourcesProvider.getColorOrDefault(Theme.key_dialogTextBlack) : Theme.getColor(null, Theme.key_dialogTextBlack, false);
            int colorOrDefault2 = resourcesProvider != null ? resourcesProvider.getColorOrDefault(Theme.key_dialogBackground) : Theme.getColor(null, Theme.key_dialogBackground, false);
            if (resourcesProvider != null) {
                resourcesProvider.getColorOrDefault(Theme.key_sheet_other);
            } else {
                Theme.getColor(null, Theme.key_sheet_other, false);
            }
            int colorOrDefault3 = resourcesProvider != null ? resourcesProvider.getColorOrDefault(Theme.key_player_actionBarSelector) : Theme.getColor(null, Theme.key_player_actionBarSelector, false);
            int colorOrDefault4 = resourcesProvider != null ? resourcesProvider.getColorOrDefault(Theme.key_actionBarDefaultSubmenuItem) : Theme.getColor(null, Theme.key_actionBarDefaultSubmenuItem, false);
            int colorOrDefault5 = resourcesProvider != null ? resourcesProvider.getColorOrDefault(Theme.key_actionBarDefaultSubmenuBackground) : Theme.getColor(null, Theme.key_actionBarDefaultSubmenuBackground, false);
            int colorOrDefault6 = resourcesProvider != null ? resourcesProvider.getColorOrDefault(Theme.key_listSelector) : Theme.getColor(null, Theme.key_listSelector, false);
            int colorOrDefault7 = resourcesProvider != null ? resourcesProvider.getColorOrDefault(Theme.key_featuredStickers_buttonText) : Theme.getColor(null, Theme.key_featuredStickers_buttonText, false);
            int colorOrDefault8 = resourcesProvider != null ? resourcesProvider.getColorOrDefault(Theme.key_featuredStickers_addButton) : Theme.getColor(null, Theme.key_featuredStickers_addButton, false);
            if (resourcesProvider != null) {
                resourcesProvider.getColorOrDefault(Theme.key_featuredStickers_addButtonPressed);
            } else {
                Theme.getColor(null, Theme.key_featuredStickers_addButtonPressed, false);
            }
            this(colorOrDefault, colorOrDefault2, colorOrDefault3, colorOrDefault4, colorOrDefault5, colorOrDefault6, colorOrDefault7, colorOrDefault8);
        }

        public ScheduleDatePickerColors(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            this.textColor = i;
            this.backgroundColor = i2;
            this.iconSelectorColor = i3;
            this.subMenuTextColor = i4;
            this.subMenuBackgroundColor = i5;
            this.subMenuSelectorColor = i6;
            this.buttonTextColor = i7;
            this.buttonBackgroundColor = i8;
        }
    }

    public static void createDatePickerDialog(Context context, String str, String str2, long j, ScheduleDatePickerDelegate scheduleDatePickerDelegate) {
        BottomSheet bottomSheet;
        int i;
        if (context == null) {
            return;
        }
        int color = Theme.getColor(null, Theme.key_dialogTextBlack, false);
        int color2 = Theme.getColor(null, Theme.key_dialogBackground, false);
        Theme.getColor(null, Theme.key_sheet_other, false);
        Theme.getColor(null, Theme.key_player_actionBarSelector, false);
        Theme.getColor(null, Theme.key_actionBarDefaultSubmenuItem, false);
        Theme.getColor(null, Theme.key_actionBarDefaultSubmenuBackground, false);
        Theme.getColor(null, Theme.key_listSelector, false);
        int color3 = Theme.getColor(null, Theme.key_featuredStickers_buttonText, false);
        int color4 = Theme.getColor(null, Theme.key_featuredStickers_addButton, false);
        int color5 = Theme.getColor(null, Theme.key_featuredStickers_addButtonPressed, false);
        BottomSheet.Builder builder = new BottomSheet.Builder(context, null);
        BottomSheet bottomSheet2 = builder.bottomSheet;
        bottomSheet2.applyBottomPadding = false;
        NumberPicker numberPicker = new NumberPicker(context, 18, null);
        numberPicker.setTextColor(color);
        numberPicker.setTextOffset(AndroidUtilities.dp(10.0f));
        numberPicker.setItemCount(5);
        AnonymousClass29 anonymousClass29 = new AnonymousClass29(context, 18, null);
        anonymousClass29.setItemCount(5);
        anonymousClass29.setTextColor(color);
        anonymousClass29.setTextOffset(-AndroidUtilities.dp(10.0f));
        AnonymousClass30 anonymousClass30 = new AnonymousClass30(context, 18, null);
        anonymousClass30.setItemCount(5);
        anonymousClass30.setTextColor(color);
        anonymousClass30.setTextOffset(-AndroidUtilities.dp(34.0f));
        AnonymousClass27 anonymousClass27 = new AnonymousClass27(context, numberPicker, anonymousClass29, anonymousClass30, 1);
        anonymousClass27.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        anonymousClass27.addView(frameLayout, LayoutHelper.createLinear(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(str);
        FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline2.m(20.0f, color, 1, textView);
        frameLayout.addView(textView, LayoutHelper.createFrame(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new ArticleViewer$$ExternalSyntheticLambda23(9));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        anonymousClass27.addView(linearLayout, LayoutHelper.createLinear(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        Calendar calendar = Calendar.getInstance();
        AnonymousClass32 anonymousClass32 = new AnonymousClass32(context);
        linearLayout.addView(numberPicker, LayoutHelper.createLinear(0.5f, 0, 270));
        numberPicker.setMinValue(0);
        numberPicker.setMaxValue(365);
        numberPicker.setWrapSelectorWheel(false);
        numberPicker.setFormatter(new EmojiView$$ExternalSyntheticLambda21(1));
        ChatActivity$$ExternalSyntheticLambda248 chatActivity$$ExternalSyntheticLambda248 = new ChatActivity$$ExternalSyntheticLambda248(numberPicker, anonymousClass29, anonymousClass30, 20);
        numberPicker.setOnValueChangedListener(chatActivity$$ExternalSyntheticLambda248);
        anonymousClass29.setMinValue(0);
        anonymousClass29.setMaxValue(23);
        linearLayout.addView(anonymousClass29, LayoutHelper.createLinear(0.2f, 0, 270));
        anonymousClass29.setFormatter(new EmojiView$$ExternalSyntheticLambda21(2));
        anonymousClass29.setOnValueChangedListener(chatActivity$$ExternalSyntheticLambda248);
        anonymousClass30.setMinValue(0);
        anonymousClass30.setMaxValue(59);
        anonymousClass30.setValue(0);
        anonymousClass30.setFormatter(new EmojiView$$ExternalSyntheticLambda21(3));
        linearLayout.addView(anonymousClass30, LayoutHelper.createLinear(0.3f, 0, 270));
        anonymousClass30.setOnValueChangedListener(chatActivity$$ExternalSyntheticLambda248);
        if (j <= 0 || j == 2147483646) {
            bottomSheet = bottomSheet2;
            i = color4;
        } else {
            long j2 = 1000 * j;
            bottomSheet = bottomSheet2;
            calendar.setTimeInMillis(System.currentTimeMillis());
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            calendar.set(11, 0);
            i = color4;
            int timeInMillis = (int) ((j2 - calendar.getTimeInMillis()) / 86400000);
            calendar.setTimeInMillis(j2);
            if (timeInMillis >= 0) {
                anonymousClass30.setValue(calendar.get(12));
                anonymousClass29.setValue(calendar.get(11));
                numberPicker.setValue(timeInMillis);
            }
        }
        checkScheduleDate(null, null, 0L, 0L, 0, numberPicker, anonymousClass29, anonymousClass30);
        anonymousClass32.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        anonymousClass32.setGravity(17);
        anonymousClass32.setTextColor(color3);
        anonymousClass32.setTextSize(1, 14.0f);
        anonymousClass32.setTypeface(AndroidUtilities.bold());
        int iDp = AndroidUtilities.dp(8.0f);
        anonymousClass32.setBackgroundDrawable(Theme.createSimpleSelectorRoundRectDrawable(iDp, iDp, iDp, iDp, i, color5, color5));
        anonymousClass32.setText(str2);
        anonymousClass27.addView(anonymousClass32, LayoutHelper.createLinear(-1, 48, 83, 16, 15, 16, 16));
        anonymousClass32.setOnClickListener(new WearAuthSheet$$ExternalSyntheticLambda1(numberPicker, anonymousClass29, anonymousClass30, calendar, scheduleDatePickerDelegate, builder, 2));
        bottomSheet.customView = anonymousClass27;
        bottomSheet.show();
        bottomSheet.setBackgroundColor(color2);
        bottomSheet.fixNavigationBar(color2);
    }

    public static void createBotLaunchAlert(BaseFragment baseFragment, AtomicBoolean atomicBoolean, TLRPC.User user, Runnable runnable) {
        boolean z;
        int i;
        boolean z2;
        int i2;
        int i3;
        int i4;
        boolean z3;
        int i5;
        int i6;
        int i7;
        CheckBoxCell checkBoxCell;
        int iDp;
        int iDp2;
        if (baseFragment == null) {
            return;
        }
        Context context = baseFragment.getContext();
        final CheckBoxCell[] checkBoxCellArr = new CheckBoxCell[1];
        AlertDialog.Builder builder = new AlertDialog.Builder(context, 0, null);
        AnonymousClass6 anonymousClass6 = new AnonymousClass6(context, null);
        NotificationCenter.listenEmojiLoading(anonymousClass6);
        anonymousClass6.setTextColor(Theme.getColor(null, Theme.key_dialogTextBlack, false));
        anonymousClass6.setLinkTextColor(Theme.getColor(null, Theme.key_chat_messageLinkIn, false));
        anonymousClass6.setTextSize(1, 16.0f);
        anonymousClass6.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        FrameLayout frameLayout = new FrameLayout(context) {
            @Override
            public final void onMeasure(int i8, int i9) {
                super.onMeasure(i8, i9);
                CheckBoxCell[] checkBoxCellArr2 = checkBoxCellArr;
                if (checkBoxCellArr2[0] != null) {
                    setMeasuredDimension(getMeasuredWidth(), AndroidUtilities.dp(7.0f) + checkBoxCellArr2[0].getMeasuredHeight() + getMeasuredHeight());
                }
            }
        };
        AlertDialog alertDialog = builder.alertDialog;
        alertDialog.customViewOffset = 6;
        builder.setView(frameLayout);
        AvatarDrawable avatarDrawable = new AvatarDrawable((Theme.ResourcesProvider) null);
        avatarDrawable.namePaint.setTextSize(AndroidUtilities.dp(18.0f));
        BackupImageView backupImageView = new BackupImageView(context);
        backupImageView.setRoundRadius(AndroidUtilities.dp(20.0f));
        frameLayout.addView(backupImageView, LayoutHelper.createFrame(40, 40.0f, (LocaleController.isRTL ? 5 : 3) | 48, 22.0f, 5.0f, 22.0f, 0.0f));
        SimpleTextView simpleTextView = new SimpleTextView(context);
        simpleTextView.setTextColor(Theme.getColor(null, Theme.key_actionBarDefaultSubmenuItem, false));
        simpleTextView.setTextSize(20);
        simpleTextView.setTypeface(AndroidUtilities.bold());
        simpleTextView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        simpleTextView.setEllipsizeByGradient(true);
        simpleTextView.setText(user.first_name, false);
        if (user.scam) {
            simpleTextView.setRightDrawable(Theme.dialogs_scamDrawable);
        } else if (user.fake) {
            simpleTextView.setRightDrawable(Theme.dialogs_fakeDrawable);
        } else {
            if (user.verified) {
                Drawable drawableMutate = context.getResources().getDrawable(R.drawable.verified_area).mutate();
                int color = Theme.getColor(null, Theme.key_chats_verifiedBackground, false);
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                drawableMutate.setColorFilter(new PorterDuffColorFilter(color, mode));
                Drawable drawableMutate2 = context.getResources().getDrawable(R.drawable.verified_check).mutate();
                z = false;
                drawableMutate2.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_chats_verifiedCheck, false), mode));
                simpleTextView.setRightDrawable(new CombinedDrawable(drawableMutate, drawableMutate2));
            }
            TextView textView = new TextView(context);
            int i8 = 1;
            ArticleViewer.IBlock.CC.m(textView, Theme.getColor(null, Theme.key_dialogTextBlue, z), 14.0f, 1, true);
            if (LocaleController.isRTL) {
                i = 5;
            } else {
                i = 3;
            }
            textView.setGravity(i | 16);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setOnClickListener(new AlertsCreator$$ExternalSyntheticLambda22(user, baseFragment, builder, i8));
            SpannableString spannableStringValueOf = SpannableString.valueOf(LocaleController.getString(R.string.MoreAboutThisBot) + "  ");
            ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.attach_arrow_right);
            coloredImageSpan.setTopOffset(1);
            coloredImageSpan.setSize(AndroidUtilities.dp(10.0f));
            spannableStringValueOf.setSpan(coloredImageSpan, spannableStringValueOf.length() - 1, spannableStringValueOf.length(), 33);
            textView.setText(spannableStringValueOf);
            z2 = LocaleController.isRTL;
            if (z2) {
                i2 = 5;
            } else {
                i2 = 3;
            }
            int i9 = i2 | 48;
            if (z2) {
                i3 = 21;
            } else {
                i3 = 76;
            }
            float f = i3;
            if (z2) {
                i4 = 76;
            } else {
                i4 = 21;
            }
            frameLayout.addView(simpleTextView, LayoutHelper.createFrame(-1, -2.0f, i9, f, 0.0f, i4, 0.0f));
            z3 = LocaleController.isRTL;
            if (z3) {
                i5 = 5;
            } else {
                i5 = 3;
            }
            int i10 = i5 | 48;
            if (z3) {
                i6 = 21;
            } else {
                i6 = 76;
            }
            frameLayout.addView(textView, LayoutHelper.createFrame(-1, -2.0f, i10, i6, 24.0f, z3 ? 76 : 21, 0.0f));
            if (LocaleController.isRTL) {
                i7 = 5;
            } else {
                i7 = 3;
            }
            frameLayout.addView(anonymousClass6, LayoutHelper.createFrame(-2, -2.0f, i7 | 48, 24.0f, 57.0f, 24.0f, 1.0f));
            atomicBoolean.set(true);
            checkBoxCell = new CheckBoxCell(context, 1, 17, false, baseFragment.getResourceProvider());
            checkBoxCellArr[0] = checkBoxCell;
            if (!checkBoxCell.textAnimated) {
                CheckBoxCell.AnonymousClass2 anonymousClass2 = checkBoxCell.linksTextView;
                anonymousClass2.setLines(3);
                anonymousClass2.setMaxLines(3);
                anonymousClass2.setSingleLine(false);
            }
            checkBoxCellArr[0].setBackgroundDrawable(Theme.getSelectorDrawable(false));
            checkBoxCellArr[0].setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.OpenUrlOption2, UserObject.getUserName(user))), "", true, false, false);
            CheckBoxCell checkBoxCell2 = checkBoxCellArr[0];
            if (LocaleController.isRTL) {
                iDp = AndroidUtilities.dp(16.0f);
            } else {
                iDp = AndroidUtilities.dp(8.0f);
            }
            if (LocaleController.isRTL) {
                iDp2 = AndroidUtilities.dp(8.0f);
            } else {
                iDp2 = AndroidUtilities.dp(16.0f);
            }
            checkBoxCell2.setPadding(iDp, 0, iDp2, 0);
            checkBoxCellArr[0].setChecked(true, false);
            frameLayout.addView(checkBoxCellArr[0], LayoutHelper.createFrame(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
            checkBoxCellArr[0].setOnClickListener(new ChatActivity$16$$ExternalSyntheticLambda4(atomicBoolean, 4));
            if (UserObject.isReplyUser(user)) {
                avatarDrawable.scaleSize = 0.8f;
                avatarDrawable.setAvatarType(12);
                backupImageView.setImage(null, null, avatarDrawable, user);
            } else {
                avatarDrawable.scaleSize = 1.0f;
                avatarDrawable.setInfo(baseFragment.getCurrentAccount(), user);
                backupImageView.imageReceiver.setForUserOrChat(user, avatarDrawable);
                backupImageView.onNewImageSet();
            }
            builder.setPositiveButton(LocaleController.getString(R.string.Start), new ChatActivity$$ExternalSyntheticLambda177(3, runnable));
            builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
            baseFragment.showDialog(alertDialog);
            anonymousClass6.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.BotWebViewStartPermission2), new AlertsCreator$$ExternalSyntheticLambda25(1, context, alertDialog)));
        }
        z = false;
        TextView textView2 = new TextView(context);
        int i11 = 1;
        ArticleViewer.IBlock.CC.m(textView2, Theme.getColor(null, Theme.key_dialogTextBlue, z), 14.0f, 1, true);
        if (LocaleController.isRTL) {
            i = 5;
        } else {
            i = 3;
        }
        textView2.setGravity(i | 16);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setOnClickListener(new AlertsCreator$$ExternalSyntheticLambda22(user, baseFragment, builder, i11));
        SpannableString spannableStringValueOf2 = SpannableString.valueOf(LocaleController.getString(R.string.MoreAboutThisBot) + "  ");
        ColoredImageSpan coloredImageSpan2 = new ColoredImageSpan(R.drawable.attach_arrow_right);
        coloredImageSpan2.setTopOffset(1);
        coloredImageSpan2.setSize(AndroidUtilities.dp(10.0f));
        spannableStringValueOf2.setSpan(coloredImageSpan2, spannableStringValueOf2.length() - 1, spannableStringValueOf2.length(), 33);
        textView2.setText(spannableStringValueOf2);
        z2 = LocaleController.isRTL;
        if (z2) {
            i2 = 5;
        } else {
            i2 = 3;
        }
        int i12 = i2 | 48;
        if (z2) {
            i3 = 21;
        } else {
            i3 = 76;
        }
        float f2 = i3;
        if (z2) {
            i4 = 76;
        } else {
            i4 = 21;
        }
        frameLayout.addView(simpleTextView, LayoutHelper.createFrame(-1, -2.0f, i12, f2, 0.0f, i4, 0.0f));
        z3 = LocaleController.isRTL;
        if (z3) {
            i5 = 5;
        } else {
            i5 = 3;
        }
        int i13 = i5 | 48;
        if (z3) {
            i6 = 21;
        } else {
            i6 = 76;
        }
        frameLayout.addView(textView2, LayoutHelper.createFrame(-1, -2.0f, i13, i6, 24.0f, z3 ? 76 : 21, 0.0f));
        if (LocaleController.isRTL) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        frameLayout.addView(anonymousClass6, LayoutHelper.createFrame(-2, -2.0f, i7 | 48, 24.0f, 57.0f, 24.0f, 1.0f));
        atomicBoolean.set(true);
        checkBoxCell = new CheckBoxCell(context, 1, 17, false, baseFragment.getResourceProvider());
        checkBoxCellArr[0] = checkBoxCell;
        if (!checkBoxCell.textAnimated) {
            CheckBoxCell.AnonymousClass2 anonymousClass3 = checkBoxCell.linksTextView;
            anonymousClass3.setLines(3);
            anonymousClass3.setMaxLines(3);
            anonymousClass3.setSingleLine(false);
        }
        checkBoxCellArr[0].setBackgroundDrawable(Theme.getSelectorDrawable(false));
        checkBoxCellArr[0].setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.OpenUrlOption2, UserObject.getUserName(user))), "", true, false, false);
        CheckBoxCell checkBoxCell3 = checkBoxCellArr[0];
        if (LocaleController.isRTL) {
            iDp = AndroidUtilities.dp(16.0f);
        } else {
            iDp = AndroidUtilities.dp(8.0f);
        }
        if (LocaleController.isRTL) {
            iDp2 = AndroidUtilities.dp(8.0f);
        } else {
            iDp2 = AndroidUtilities.dp(16.0f);
        }
        checkBoxCell3.setPadding(iDp, 0, iDp2, 0);
        checkBoxCellArr[0].setChecked(true, false);
        frameLayout.addView(checkBoxCellArr[0], LayoutHelper.createFrame(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        checkBoxCellArr[0].setOnClickListener(new ChatActivity$16$$ExternalSyntheticLambda4(atomicBoolean, 4));
        if (UserObject.isReplyUser(user)) {
            avatarDrawable.scaleSize = 0.8f;
            avatarDrawable.setAvatarType(12);
            backupImageView.setImage(null, null, avatarDrawable, user);
        } else {
            avatarDrawable.scaleSize = 1.0f;
            avatarDrawable.setInfo(baseFragment.getCurrentAccount(), user);
            backupImageView.imageReceiver.setForUserOrChat(user, avatarDrawable);
            backupImageView.onNewImageSet();
        }
        builder.setPositiveButton(LocaleController.getString(R.string.Start), new ChatActivity$$ExternalSyntheticLambda177(3, runnable));
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        baseFragment.showDialog(alertDialog);
        anonymousClass6.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.BotWebViewStartPermission2), new AlertsCreator$$ExternalSyntheticLambda25(1, context, alertDialog)));
    }
}
