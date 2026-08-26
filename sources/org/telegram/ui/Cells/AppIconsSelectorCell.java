package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import j$.time.YearMonth;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController$$ExternalSyntheticOutline1;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.CalendarActivity;
import org.telegram.ui.CalendarActivity.MonthView;
import org.telegram.ui.Components.AvatarConstructorFragment;
import org.telegram.ui.Components.AvatarConstructorFragment.GradientSelectorView;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayoutPreview;
import org.telegram.ui.Components.ChatAttachRestrictedLayout;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.Easings;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.LauncherIconController;
import org.telegram.ui.MessageSeenView;
import org.telegram.ui.QrActivity;
import org.telegram.ui.Stories.LiveCommentsView$$ExternalSyntheticLambda6;

public final class AppIconsSelectorCell extends RecyclerListView implements NotificationCenter.NotificationCenterDelegate {
    public final ArrayList availableIcons;
    public final int currentAccount;
    public final LinearLayoutManager linearLayoutManager;

    public final class AnonymousClass3 extends LinearSmoothScroller {
        @Override
        public final int calculateDtToFit(int i, int i2, int i3, int i4, int i5) {
            return AndroidUtilities.dp(16.0f) + (i3 - i);
        }

        @Override
        public final float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            return super.calculateSpeedPerPixel(displayMetrics) * 3.0f;
        }
    }

    public class AdaptiveIconImageView extends ImageView {
        public int backgroundOuterPadding;
        public Drawable foreground;
        public int outerPadding;
        public final Path path;

        public AdaptiveIconImageView(Context context) {
            super(context);
            this.path = new Path();
            this.outerPadding = AndroidUtilities.dp(5.0f);
            this.backgroundOuterPadding = AndroidUtilities.dp(42.0f);
        }

        @Override
        public void draw(Canvas canvas) {
            canvas.save();
            canvas.clipPath(this.path);
            canvas.scale((this.backgroundOuterPadding / getWidth()) + 1.0f, (this.backgroundOuterPadding / getHeight()) + 1.0f, getWidth() / 2.0f, getHeight() / 2.0f);
            super.draw(canvas);
            canvas.restore();
            Drawable drawable = this.foreground;
            if (drawable != null) {
                int i = -this.outerPadding;
                drawable.setBounds(i, i, getWidth() + this.outerPadding, getHeight() + this.outerPadding);
                this.foreground.draw(canvas);
            }
        }

        @Override
        public final void onSizeChanged(int i, int i2, int i3, int i4) {
            super.onSizeChanged(i, i2, i3, i4);
            Path path = this.path;
            path.rewind();
            path.addCircle(getWidth() / 2.0f, getHeight() / 2.0f, Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom()) / 2.0f, Path.Direction.CW);
        }

        public void setBackgroundOuterPadding(int i) {
            this.backgroundOuterPadding = i;
        }

        public void setForeground(int i) {
            this.foreground = getContext().getDrawable(i);
            invalidate();
        }

        public void setOuterPadding(int i) {
            this.outerPadding = i;
        }

        public void setPadding(int i) {
            setPadding(i, i, i, i);
        }
    }

    public final class IconHolderView extends LinearLayout {
        public static final int $r8$clinit = 0;
        public final Paint fillPaint;
        public final AdaptiveIconImageView iconView;
        public final Paint outlinePaint;
        public float progress;
        public final TextView titleView;

        public IconHolderView(Context context) {
            super(context);
            Paint paint = new Paint(1);
            this.outlinePaint = paint;
            Paint paint2 = new Paint(1);
            this.fillPaint = paint2;
            setOrientation(1);
            setWillNotDraw(false);
            AdaptiveIconImageView adaptiveIconImageView = new AdaptiveIconImageView(context);
            this.iconView = adaptiveIconImageView;
            adaptiveIconImageView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            addView(adaptiveIconImageView, LayoutHelper.createLinear(58, 58, 1));
            TextView textView = new TextView(context);
            this.titleView = textView;
            textView.setSingleLine();
            textView.setTextSize(1, 13.0f);
            textView.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false));
            addView(textView, LayoutHelper.createLinear(-2, -2, 1, 0, 4, 0, 0));
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(Math.max(2, AndroidUtilities.dp(0.5f)));
            paint2.setColor(-1);
        }

        @Override
        public final void draw(Canvas canvas) {
            Paint paint = this.outlinePaint;
            float strokeWidth = paint.getStrokeWidth();
            RectF rectF = AndroidUtilities.rectTmp;
            AdaptiveIconImageView adaptiveIconImageView = this.iconView;
            rectF.set(adaptiveIconImageView.getLeft() + strokeWidth, adaptiveIconImageView.getTop() + strokeWidth, adaptiveIconImageView.getRight() - strokeWidth, adaptiveIconImageView.getBottom() - strokeWidth);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), this.fillPaint);
            super.draw(canvas);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), paint);
        }

        public final void setProgress(float f) {
            this.progress = f;
            TextView textView = this.titleView;
            int color = Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false);
            int i = Theme.key_windowBackgroundWhiteValueText;
            textView.setTextColor(ColorUtils.blendARGB(f, color, Theme.getColor(null, i, false)));
            Paint paint = this.outlinePaint;
            paint.setColor(ColorUtils.blendARGB(f, ColorUtils.setAlphaComponent(Theme.getColor(null, Theme.key_switchTrack, false), 63), Theme.getColor(null, i, false)));
            paint.setStrokeWidth(Math.max(2, AndroidUtilities.dp(AndroidUtilities.lerp(0.5f, 2.0f, f))));
            invalidate();
        }

        public final void setSelected(boolean z, boolean z2) {
            float f = z ? 1.0f : 0.0f;
            float f2 = this.progress;
            if (f == f2 && z2) {
                return;
            }
            if (!z2) {
                setProgress(f);
                return;
            }
            ValueAnimator duration = ValueAnimator.ofFloat(f2, f).setDuration(250L);
            duration.setInterpolator(Easings.easeInOutQuad);
            duration.addUpdateListener(new BotButton$$ExternalSyntheticLambda0(this, 6));
            duration.start();
        }
    }

    public AppIconsSelectorCell(int i, Context context, BaseFragment baseFragment) {
        super(context, null);
        this.availableIcons = new ArrayList();
        this.currentAccount = i;
        setPadding(0, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f));
        setFocusable(false);
        setItemAnimator(null);
        setLayoutAnimation(null);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(0, false);
        this.linearLayoutManager = linearLayoutManager;
        setLayoutManager(linearLayoutManager);
        setAdapter(new AnonymousClass1(this, 0));
        int i2 = 1;
        addItemDecoration(new MessageSeenView.AnonymousClass2(this, i2));
        setOnItemClickListener(new LiveCommentsView$$ExternalSyntheticLambda6(this, baseFragment, context, i2));
        updateIconsVisibility();
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.premiumStatusChangedGlobal) {
            updateIconsVisibility();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.premiumStatusChangedGlobal);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.premiumStatusChangedGlobal);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
    }

    @Override
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        invalidateItemDecorations();
    }

    public final void updateIconsVisibility() {
        ArrayList arrayList = this.availableIcons;
        arrayList.clear();
        arrayList.addAll(Arrays.asList(LauncherIconController.LauncherIcon.values()));
        if (MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked()) {
            int i = 0;
            while (i < arrayList.size()) {
                if (((LauncherIconController.LauncherIcon) arrayList.get(i)).premium) {
                    arrayList.remove(i);
                    i--;
                }
                i++;
            }
        }
        getAdapter().notifyDataSetChanged();
        invalidateItemDecorations();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if (LauncherIconController.isEnabled((LauncherIconController.LauncherIcon) arrayList.get(i2))) {
                int iDp = AndroidUtilities.dp(16.0f);
                LinearLayoutManager linearLayoutManager = this.linearLayoutManager;
                linearLayoutManager.scrollToPositionWithOffset(i2, iDp, linearLayoutManager.mShouldReverseLayout);
                return;
            }
        }
    }

    public final class AnonymousClass1 extends RecyclerView.Adapter {
        public final int $r8$classId;
        public final Object this$0;

        public AnonymousClass1(Object obj, int i) {
            this.$r8$classId = i;
            this.this$0 = obj;
        }

        @Override
        public final int getItemCount() {
            switch (this.$r8$classId) {
                case 0:
                    return ((AppIconsSelectorCell) this.this$0).availableIcons.size();
                case 1:
                    return ((CalendarActivity) this.this$0).monthCount;
                case 2:
                    return ((AvatarConstructorFragment.BackgroundSelectView) this.this$0).gradients.size() + 1;
                case 3:
                    return 1;
                default:
                    return 1;
            }
        }

        @Override
        public long getItemId(int i) {
            switch (this.$r8$classId) {
                case 1:
                    CalendarActivity calendarActivity = (CalendarActivity) this.this$0;
                    return (((long) (calendarActivity.startFromYear - (i / 12))) * 100) + ((long) (calendarActivity.startFromMonth - (i % 12)));
                case 2:
                    AvatarConstructorFragment.BackgroundSelectView backgroundSelectView = (AvatarConstructorFragment.BackgroundSelectView) this.this$0;
                    if (i >= backgroundSelectView.gradients.size()) {
                        return 1L;
                    }
                    return ((AvatarConstructorFragment.BackgroundGradient) backgroundSelectView.gradients.get(i)).stableId;
                default:
                    return super.getItemId(i);
            }
        }

        @Override
        public int getItemViewType(int i) {
            switch (this.$r8$classId) {
                case 2:
                    return i >= ((AvatarConstructorFragment.BackgroundSelectView) this.this$0).gradients.size() ? 1 : 0;
                default:
                    return super.getItemViewType(i);
            }
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            boolean z;
            switch (this.$r8$classId) {
                case 0:
                    IconHolderView iconHolderView = (IconHolderView) viewHolder.itemView;
                    LauncherIconController.LauncherIcon launcherIcon = (LauncherIconController.LauncherIcon) ((AppIconsSelectorCell) this.this$0).availableIcons.get(i);
                    iconHolderView.iconView.setImageResource(launcherIcon.background);
                    TextView textView = iconHolderView.titleView;
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
                    boolean z2 = launcherIcon.premium;
                    int i2 = launcherIcon.title;
                    if (!z2 || UserConfig.hasPremiumOnAccounts()) {
                        marginLayoutParams.rightMargin = 0;
                        textView.setText(LocaleController.getString(i2));
                    } else {
                        SpannableString spannableString = new SpannableString(NotificationsController$$ExternalSyntheticOutline1.m(new StringBuilder("d "), i2));
                        ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.msg_mini_premiumlock);
                        coloredImageSpan.setTopOffset(1);
                        coloredImageSpan.setSize(AndroidUtilities.dp(13.0f));
                        spannableString.setSpan(coloredImageSpan, 0, 1, 33);
                        marginLayoutParams.rightMargin = AndroidUtilities.dp(4.0f);
                        textView.setText(spannableString);
                    }
                    iconHolderView.setSelected(LauncherIconController.isEnabled(launcherIcon), false);
                    AdaptiveIconImageView adaptiveIconImageView = iconHolderView.iconView;
                    int iDp = AndroidUtilities.dp(18.0f);
                    adaptiveIconImageView.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp, iDp, iDp, iDp, 0, Theme.getColor(null, Theme.key_listSelector, false), -16777216));
                    adaptiveIconImageView.setForeground(launcherIcon.foreground);
                    break;
                case 1:
                    CalendarActivity.MonthView monthView = (CalendarActivity.MonthView) viewHolder.itemView;
                    CalendarActivity calendarActivity = (CalendarActivity) this.this$0;
                    int i3 = calendarActivity.startFromYear - (i / 12);
                    int i4 = calendarActivity.startFromMonth - (i % 12);
                    if (i4 < 0) {
                        i4 += 12;
                        i3--;
                    }
                    int i5 = monthView.currentYear;
                    SparseArray sparseArray = (SparseArray) calendarActivity.messagesByYearMounth.get((i3 * 100) + i4);
                    boolean z3 = (i3 == monthView.currentYear && i4 == monthView.currentMonthInYear) ? false : true;
                    monthView.currentYear = i3;
                    monthView.currentMonthInYear = i4;
                    monthView.messagesByDays = sparseArray;
                    boolean z4 = false;
                    if (z3 && monthView.imagesByDays != null) {
                        for (int i6 = 0; i6 < monthView.imagesByDays.size(); i6++) {
                            ((ImageReceiver) monthView.imagesByDays.valueAt(i6)).onDetachedFromWindow();
                            ((ImageReceiver) monthView.imagesByDays.valueAt(i6)).setParentView(null);
                        }
                        monthView.imagesByDays = null;
                    }
                    CalendarActivity calendarActivity2 = CalendarActivity.this;
                    if (sparseArray != null) {
                        if (monthView.imagesByDays == null) {
                            monthView.imagesByDays = new SparseArray();
                        }
                        int i7 = 0;
                        while (i7 < sparseArray.size()) {
                            int iKeyAt = sparseArray.keyAt(i7);
                            if (monthView.imagesByDays.get(iKeyAt, z4) == null && ((CalendarActivity.PeriodDay) sparseArray.get(iKeyAt)).hasImage) {
                                ImageReceiver imageReceiver = new ImageReceiver();
                                imageReceiver.setParentView(monthView);
                                MessageObject messageObject = ((CalendarActivity.PeriodDay) sparseArray.get(iKeyAt)).messageObject;
                                if (messageObject != null) {
                                    boolean zHasMediaSpoilers = messageObject.hasMediaSpoilers();
                                    if (messageObject.isVideo()) {
                                        TLRPC.Document document = messageObject.getDocument();
                                        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 50);
                                        TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 320);
                                        if (closestPhotoSizeWithSize == closestPhotoSizeWithSize2) {
                                            closestPhotoSizeWithSize2 = null;
                                        }
                                        if (closestPhotoSizeWithSize != null) {
                                            if (messageObject.strippedThumb != null) {
                                                imageReceiver.setImage(ImageLocation.getForDocument(closestPhotoSizeWithSize2, document), zHasMediaSpoilers ? "5_5_b" : "44_44", messageObject.strippedThumb, null, messageObject, 0);
                                            } else {
                                                imageReceiver.setImage(ImageLocation.getForDocument(closestPhotoSizeWithSize2, document), zHasMediaSpoilers ? "5_5_b" : "44_44", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "b", (String) null, messageObject, 0);
                                            }
                                        }
                                    } else {
                                        TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
                                        if ((messageMedia instanceof TLRPC.TL_messageMediaPhoto) && messageMedia.photo != null && !messageObject.photoThumbs.isEmpty()) {
                                            TLRPC.PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 50);
                                            TLRPC.PhotoSize closestPhotoSizeWithSize4 = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 320, false, closestPhotoSizeWithSize3, false);
                                            if (messageObject.mediaExists || DownloadController.getInstance(((BaseFragment) calendarActivity2).currentAccount).canDownloadMedia(messageObject)) {
                                                if (closestPhotoSizeWithSize4 == closestPhotoSizeWithSize3) {
                                                    closestPhotoSizeWithSize3 = null;
                                                }
                                                long j = 0;
                                                if (messageObject.strippedThumb != null) {
                                                    ImageLocation forObject = ImageLocation.getForObject(closestPhotoSizeWithSize4, messageObject.photoThumbsObject);
                                                    String str = zHasMediaSpoilers ? "5_5_b" : "44_44";
                                                    BitmapDrawable bitmapDrawable = messageObject.strippedThumb;
                                                    if (closestPhotoSizeWithSize4 != null) {
                                                        j = closestPhotoSizeWithSize4.size;
                                                    }
                                                    imageReceiver.setImage(forObject, str, null, null, bitmapDrawable, j, null, messageObject, messageObject.shouldEncryptPhotoOrVideo() ? 2 : 1);
                                                } else {
                                                    ImageLocation forObject2 = ImageLocation.getForObject(closestPhotoSizeWithSize4, messageObject.photoThumbsObject);
                                                    String str2 = zHasMediaSpoilers ? "5_5_b" : "44_44";
                                                    ImageLocation forObject3 = ImageLocation.getForObject(closestPhotoSizeWithSize3, messageObject.photoThumbsObject);
                                                    if (closestPhotoSizeWithSize4 != null) {
                                                        j = closestPhotoSizeWithSize4.size;
                                                    }
                                                    imageReceiver.setImage(forObject2, str2, forObject3, "b", j, null, messageObject, r8.shouldEncryptPhotoOrVideo() ? 2 : 1);
                                                }
                                            } else {
                                                BitmapDrawable bitmapDrawable2 = messageObject.strippedThumb;
                                                if (bitmapDrawable2 != null) {
                                                    imageReceiver.setImage(null, null, bitmapDrawable2, null, messageObject, 0);
                                                } else {
                                                    imageReceiver.setImage((ImageLocation) null, (String) null, ImageLocation.getForObject(closestPhotoSizeWithSize3, messageObject.photoThumbsObject), "b", (String) null, messageObject, 0);
                                                }
                                            }
                                        }
                                    }
                                    imageReceiver.setRoundRadius(AndroidUtilities.dp(22.0f));
                                    monthView.imagesByDays.put(iKeyAt, imageReceiver);
                                }
                            }
                            i7++;
                            z4 = false;
                        }
                    }
                    int i8 = i4 + 1;
                    monthView.daysInMonth = YearMonth.of(i3, i8).lengthOfMonth();
                    Calendar calendar = Calendar.getInstance();
                    calendar.set(i3, i4, 0);
                    monthView.startDayOfWeek = (calendar.get(7) + 6) % 7;
                    monthView.startMonthTime = (int) (calendar.getTimeInMillis() / 1000);
                    int i9 = monthView.daysInMonth + monthView.startDayOfWeek;
                    monthView.cellCount = ((int) (i9 / 7.0f)) + (i9 % 7 == 0 ? 0 : 1);
                    calendar.set(i3, i8, 0);
                    monthView.titleView.setText(LocaleController.formatYearMont(calendar.getTimeInMillis() / 1000, true), false);
                    calendarActivity2.updateRowSelections(monthView, false);
                    CalendarActivity.MonthView.access$1100(monthView, calendarActivity.dateSelectedStart, calendarActivity.dateSelectedEnd);
                    CalendarActivity.MonthView.access$1200(monthView, 1.0f);
                    calendarActivity.updateRowSelections(monthView, false);
                    break;
                case 2:
                    AvatarConstructorFragment.GradientSelectorView gradientSelectorView = (AvatarConstructorFragment.GradientSelectorView) viewHolder.itemView;
                    int i10 = viewHolder.mItemViewType;
                    AvatarConstructorFragment.BackgroundSelectView backgroundSelectView = (AvatarConstructorFragment.BackgroundSelectView) this.this$0;
                    if (i10 == 0) {
                        gradientSelectorView.isCustom = false;
                        AvatarConstructorFragment.BackgroundGradient backgroundGradient = (AvatarConstructorFragment.BackgroundGradient) backgroundSelectView.gradients.get(i);
                        boolean z5 = backgroundGradient.premium && !UserConfig.getInstance(((BaseFragment) AvatarConstructorFragment.this).currentAccount).isPremium();
                        if (gradientSelectorView.isLocked != z5) {
                            gradientSelectorView.isLocked = z5;
                            gradientSelectorView.invalidate();
                        }
                        gradientSelectorView.backgroundGradient = backgroundGradient;
                        z = backgroundSelectView.selectedItemId == ((AvatarConstructorFragment.BackgroundGradient) backgroundSelectView.gradients.get(i)).stableId;
                        if (gradientSelectorView.selected != z) {
                            gradientSelectorView.selected = z;
                            gradientSelectorView.invalidate();
                        }
                    } else {
                        gradientSelectorView.isCustom = true;
                        boolean z6 = !UserConfig.getInstance(((BaseFragment) AvatarConstructorFragment.this).currentAccount).isPremium();
                        if (gradientSelectorView.isLocked != z6) {
                            gradientSelectorView.isLocked = z6;
                            gradientSelectorView.invalidate();
                        }
                        gradientSelectorView.backgroundGradient = backgroundSelectView.customSelectedGradient;
                        z = backgroundSelectView.selectedItemId == 1;
                        if (gradientSelectorView.selected != z) {
                            gradientSelectorView.selected = z;
                            gradientSelectorView.invalidate();
                        }
                    }
                    break;
            }
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            switch (this.$r8$classId) {
                case 0:
                    return new RecyclerListView.Holder(new IconHolderView(viewGroup.getContext()));
                case 1:
                    return new RecyclerListView.Holder(((CalendarActivity) this.this$0).new MonthView(viewGroup.getContext()));
                case 2:
                    AvatarConstructorFragment.BackgroundSelectView backgroundSelectView = (AvatarConstructorFragment.BackgroundSelectView) this.this$0;
                    return new RecyclerListView.Holder(AvatarConstructorFragment.this.new GradientSelectorView(backgroundSelectView.getContext()));
                case 3:
                    return new RecyclerListView.Holder(((ChatAttachAlertPhotoLayoutPreview) this.this$0).groupsView);
                default:
                    return new RecyclerListView.Holder(new QrActivity.AnonymousClass2(this, ((ChatAttachRestrictedLayout) this.this$0).getContext(), 7));
            }
        }

        private final void onBindViewHolder$org$telegram$ui$Components$ChatAttachAlertPhotoLayoutPreview$3(RecyclerView.ViewHolder viewHolder, int i) {
        }

        private final void onBindViewHolder$org$telegram$ui$Components$ChatAttachRestrictedLayout$1(RecyclerView.ViewHolder viewHolder, int i) {
        }
    }
}
