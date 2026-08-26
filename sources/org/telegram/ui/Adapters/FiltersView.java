package org.telegram.ui.Adapters;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.android.billingclient.api.zzcn;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Cells.GraySectionCell;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.MessageSeenView;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.StickersActivity;

public final class FiltersView extends RecyclerListView {
    public final AnonymousClass4 diffUtilsCallback;
    public boolean drawDivider;
    public final StickersActivity.AnonymousClass2 layoutManager;
    public final ArrayList oldItems;
    public final ArrayList usersFilters;
    public static final MediaFilterData[] filters = {new MediaFilterData(R.drawable.search_media_filled, R.string.SharedMediaTab2, new TLRPC.TL_inputMessagesFilterPhotoVideo(), 0), new MediaFilterData(R.drawable.search_links_filled, R.string.SharedLinksTab2, new TLRPC.TL_inputMessagesFilterUrl(), 2), new MediaFilterData(R.drawable.search_files_filled, R.string.SharedFilesTab2, new TLRPC.TL_inputMessagesFilterDocument(), 1), new MediaFilterData(R.drawable.search_music_filled, R.string.SharedMusicTab2, new TLRPC.TL_inputMessagesFilterMusic(), 3), new MediaFilterData(R.drawable.search_voice_filled, R.string.SharedVoiceTab2, new TLRPC.TL_inputMessagesFilterRoundVoice(), 5)};
    public static final Pattern yearPatter = Pattern.compile("20[0-9]{1,2}");
    public static final Pattern monthYearOrDayPatter = Pattern.compile("(\\w{3,}) ([0-9]{0,4})");
    public static final Pattern yearOrDayAndMonthPatter = Pattern.compile("([0-9]{0,4}) (\\w{2,})");
    public static final Pattern shortDate = Pattern.compile("^([0-9]{1,4})(\\.| |/|\\-)([0-9]{1,4})$");
    public static final Pattern longDate = Pattern.compile("^([0-9]{1,2})(\\.| |/|\\-)([0-9]{1,2})(\\.| |/|\\-)([0-9]{1,4})$");
    public static final int[] numberOfDaysEachMonth = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public final class AnonymousClass2 extends RecyclerView.ItemDecoration {
        public final int $r8$classId;

        public AnonymousClass2(int i) {
            this.$r8$classId = i;
        }

        @Override
        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            switch (this.$r8$classId) {
                case 0:
                    super.getItemOffsets(rect, view, recyclerView, state);
                    recyclerView.getClass();
                    int childAdapterPosition = RecyclerView.getChildAdapterPosition(view);
                    rect.left = AndroidUtilities.dp(8.0f);
                    if (childAdapterPosition == state.getItemCount() - 1) {
                        rect.right = AndroidUtilities.dp(10.0f);
                    }
                    if (childAdapterPosition == 0) {
                        rect.left = AndroidUtilities.dp(10.0f);
                    }
                    break;
                case 1:
                    rect.right = AndroidUtilities.dp(2.0f);
                    break;
                case 2:
                    rect.right = AndroidUtilities.dp(2.0f);
                    break;
                case 3:
                    RecyclerListView.Holder holder = (RecyclerListView.Holder) recyclerView.getChildViewHolder(view);
                    if (holder == null) {
                        rect.left = AndroidUtilities.dp(4.0f);
                        rect.right = AndroidUtilities.dp(4.0f);
                    } else {
                        int adapterPosition = holder.getAdapterPosition() % 4;
                        rect.left = adapterPosition == 0 ? 0 : AndroidUtilities.dp(4.0f);
                        rect.right = adapterPosition != 3 ? AndroidUtilities.dp(4.0f) : 0;
                    }
                    break;
                case 4:
                    RecyclerListView.Holder holder2 = (RecyclerListView.Holder) recyclerView.getChildViewHolder(view);
                    if (holder2 == null) {
                        rect.left = AndroidUtilities.dp(4.0f);
                        rect.right = AndroidUtilities.dp(4.0f);
                    } else {
                        int adapterPosition2 = holder2.getAdapterPosition() % 4;
                        rect.left = adapterPosition2 == 0 ? 0 : AndroidUtilities.dp(4.0f);
                        rect.right = adapterPosition2 != 3 ? AndroidUtilities.dp(4.0f) : 0;
                    }
                    break;
                case 5:
                    RecyclerListView.Holder holder3 = (RecyclerListView.Holder) recyclerView.getChildViewHolder(view);
                    if (holder3 == null) {
                        rect.left = AndroidUtilities.dp(4.0f);
                        rect.right = AndroidUtilities.dp(4.0f);
                    } else if (holder3.mItemViewType == 5) {
                        int adapterPosition3 = holder3.getAdapterPosition() % 4;
                        rect.left = adapterPosition3 == 0 ? 0 : AndroidUtilities.dp(4.0f);
                        rect.right = adapterPosition3 != 3 ? AndroidUtilities.dp(4.0f) : 0;
                    } else {
                        rect.right = 0;
                        rect.left = 0;
                    }
                    break;
                case 6:
                    rect.left = 0;
                    rect.right = 0;
                    rect.bottom = 0;
                    rect.top = 0;
                    break;
                case 7:
                    rect.top = AndroidUtilities.dp(6.0f);
                    break;
                case 8:
                    recyclerView.getClass();
                    int childLayoutPosition = RecyclerView.getChildLayoutPosition(view);
                    rect.setEmpty();
                    if (childLayoutPosition == 1) {
                        rect.left = AndroidUtilities.dp(31.0f) + (-AndroidUtilities.dp(85.0f));
                    } else if (childLayoutPosition == 2) {
                        rect.left = AndroidUtilities.dp(31.0f) + (-AndroidUtilities.dp(85.0f));
                    }
                    break;
                case 9:
                    recyclerView.getClass();
                    int childAdapterPosition2 = RecyclerView.getChildAdapterPosition(view);
                    rect.left = AndroidUtilities.dp(12.0f);
                    rect.top = 0;
                    rect.bottom = 0;
                    if (childAdapterPosition2 == state.getItemCount() - 1) {
                        rect.right = AndroidUtilities.dp(12.0f);
                    }
                    break;
                default:
                    super.getItemOffsets(rect, view, recyclerView, state);
                    rect.top = 1;
                    break;
            }
        }

        @Override
        public void onDraw(Canvas canvas, RecyclerView recyclerView) {
            switch (this.$r8$classId) {
                case 10:
                    int width = recyclerView.getWidth();
                    int childCount = recyclerView.getChildCount();
                    int i = childCount - 1;
                    int i2 = 0;
                    while (i2 < i) {
                        View childAt = recyclerView.getChildAt(i2);
                        View childAt2 = i2 < childCount + (-2) ? recyclerView.getChildAt(i2 + 1) : null;
                        if (RecyclerView.getChildAdapterPosition(childAt) >= 0 && !(childAt instanceof GraySectionCell) && !(childAt2 instanceof GraySectionCell)) {
                            float bottom = childAt.getBottom();
                            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(72.0f), bottom, width - (LocaleController.isRTL ? AndroidUtilities.dp(72.0f) : 0), bottom, Theme.dividerPaint);
                        }
                        i2++;
                    }
                    break;
            }
        }
    }

    public final class AnonymousClass3 extends DefaultItemAnimator {
        @Override
        public final void animateAdd(RecyclerView.ViewHolder viewHolder) {
            super.animateAdd(viewHolder);
            View view = viewHolder.itemView;
            view.setScaleX(0.0f);
            view.setScaleY(0.0f);
        }

        @Override
        public final void animateRemoveImpl(RecyclerView.ViewHolder viewHolder) {
            View view = viewHolder.itemView;
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
            this.mRemoveAnimations.add(viewHolder);
            viewPropertyAnimatorAnimate.setDuration(this.mRemoveDuration).alpha(0.0f).scaleX(0.0f).scaleY(0.0f).setListener(new ProfileActivity.AnonymousClass47(this, viewHolder, viewPropertyAnimatorAnimate, view, 1)).start();
        }

        @Override
        public final long getAddAnimationDelay(long j, long j2, long j3) {
            return 0L;
        }

        @Override
        public final long getAddDuration() {
            return 220L;
        }

        @Override
        public final long getMoveAnimationDelay() {
            return 0L;
        }

        @Override
        public final long getMoveDuration() {
            return 220L;
        }
    }

    public final class DateData {
        public final long maxDate;
        public final long minDate;
        public final String title;

        public DateData(long j, long j2, String str) {
            this.title = str;
            this.minDate = j;
            this.maxDate = j2;
        }
    }

    public final class FilterView extends FrameLayout {
        public static final int $r8$clinit = 0;
        public final BackupImageView avatarImageView;
        public MediaFilterData data;
        public final Theme.ResourcesProvider resourcesProvider;
        public CombinedDrawable thumbDrawable;
        public final TextView titleView;

        public FilterView(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.resourcesProvider = resourcesProvider;
            BackupImageView backupImageView = new BackupImageView(context);
            this.avatarImageView = backupImageView;
            addView(backupImageView, LayoutHelper.createFrame(30.0f, 30));
            TextView textView = new TextView(context);
            this.titleView = textView;
            textView.setTextSize(1, 14.0f);
            addView(textView, LayoutHelper.createFrame(-2, -2.0f, 16, 36.0f, 0.0f, 14.0f, 0.0f));
            updateColors();
        }

        public void setData(MediaFilterData mediaFilterData) {
            String str;
            this.data = mediaFilterData;
            BackupImageView backupImageView = this.avatarImageView;
            backupImageView.getImageReceiver().clearImage();
            int i = mediaFilterData.filterType;
            TextView textView = this.titleView;
            Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
            String str2 = mediaFilterData.title;
            if (i == 7) {
                CombinedDrawable combinedDrawableCreateCircleDrawableWithIcon = Theme.createCircleDrawableWithIcon(AndroidUtilities.dp(32.0f), R.drawable.chats_archive);
                this.thumbDrawable = combinedDrawableCreateCircleDrawableWithIcon;
                int iDp = AndroidUtilities.dp(16.0f);
                int iDp2 = AndroidUtilities.dp(16.0f);
                combinedDrawableCreateCircleDrawableWithIcon.iconWidth = iDp;
                combinedDrawableCreateCircleDrawableWithIcon.iconHeight = iDp2;
                Theme.setCombinedDrawableColor(this.thumbDrawable, Theme.getColor(Theme.key_featuredStickers_addButton, resourcesProvider), false);
                Theme.setCombinedDrawableColor(this.thumbDrawable, Theme.getColor(Theme.key_featuredStickers_buttonText, resourcesProvider), true);
                backupImageView.setImageDrawable(this.thumbDrawable);
                textView.setText(str2);
                return;
            }
            CombinedDrawable combinedDrawableCreateCircleDrawableWithIcon2 = Theme.createCircleDrawableWithIcon(AndroidUtilities.dp(32.0f), mediaFilterData.iconResFilled);
            this.thumbDrawable = combinedDrawableCreateCircleDrawableWithIcon2;
            int i2 = Theme.key_featuredStickers_addButton;
            Theme.setCombinedDrawableColor(combinedDrawableCreateCircleDrawableWithIcon2, Theme.getColor(i2, resourcesProvider), false);
            CombinedDrawable combinedDrawable = this.thumbDrawable;
            int i3 = Theme.key_featuredStickers_buttonText;
            Theme.setCombinedDrawableColor(combinedDrawable, Theme.getColor(i3, resourcesProvider), true);
            if (mediaFilterData.filterType == 4) {
                TLObject tLObject = mediaFilterData.chat;
                if (tLObject instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) tLObject;
                    str = str2;
                    if (UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser().id == user.id) {
                        CombinedDrawable combinedDrawableCreateCircleDrawableWithIcon3 = Theme.createCircleDrawableWithIcon(AndroidUtilities.dp(32.0f), R.drawable.chats_saved);
                        int iDp3 = AndroidUtilities.dp(16.0f);
                        int iDp4 = AndroidUtilities.dp(16.0f);
                        combinedDrawableCreateCircleDrawableWithIcon3.iconWidth = iDp3;
                        combinedDrawableCreateCircleDrawableWithIcon3.iconHeight = iDp4;
                        Theme.setCombinedDrawableColor(combinedDrawableCreateCircleDrawableWithIcon3, Theme.getColor(i2, resourcesProvider), false);
                        Theme.setCombinedDrawableColor(combinedDrawableCreateCircleDrawableWithIcon3, Theme.getColor(i3, resourcesProvider), true);
                        backupImageView.setImageDrawable(combinedDrawableCreateCircleDrawableWithIcon3);
                    } else {
                        backupImageView.getImageReceiver().setRoundRadius(AndroidUtilities.dp(16.0f));
                        backupImageView.getImageReceiver().setForUserOrChat(user, this.thumbDrawable);
                    }
                } else {
                    str = str2;
                    if (tLObject instanceof TLRPC.Chat) {
                        TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                        backupImageView.getImageReceiver().setRoundRadius(AndroidUtilities.dp(ChatObject.isCommunity(chat) ? 10.0f : 16.0f));
                        backupImageView.getImageReceiver().setForUserOrChat(chat, this.thumbDrawable);
                    }
                }
            } else {
                str = str2;
                backupImageView.setImageDrawable(this.thumbDrawable);
            }
            textView.setText(str);
        }

        public final void updateColors() {
            int iDp = AndroidUtilities.dp(28.0f);
            int i = Theme.key_groupcreate_spanBackground;
            Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
            setBackground(Theme.createRoundRectDrawable(iDp, Theme.getColor(i, resourcesProvider)));
            this.titleView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
            CombinedDrawable combinedDrawable = this.thumbDrawable;
            if (combinedDrawable != null) {
                if (this.data.filterType == 7) {
                    Theme.setCombinedDrawableColor(combinedDrawable, Theme.getColor(Theme.key_featuredStickers_addButton, resourcesProvider), false);
                    Theme.setCombinedDrawableColor(this.thumbDrawable, Theme.getColor(Theme.key_featuredStickers_buttonText, resourcesProvider), true);
                } else {
                    Theme.setCombinedDrawableColor(combinedDrawable, Theme.getColor(Theme.key_featuredStickers_addButton, resourcesProvider), false);
                    Theme.setCombinedDrawableColor(this.thumbDrawable, Theme.getColor(Theme.key_featuredStickers_buttonText, resourcesProvider), true);
                }
            }
        }
    }

    public final class ViewHolder extends RecyclerView.ViewHolder {
        public final FilterView filterView;

        public ViewHolder(FilterView filterView) {
            super(filterView);
            this.filterView = filterView;
        }
    }

    public FiltersView(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context, resourcesProvider);
        this.usersFilters = new ArrayList();
        this.oldItems = new ArrayList();
        this.drawDivider = true;
        this.diffUtilsCallback = new DiffUtil() {
            @Override
            public final boolean areContentsTheSame(int i, int i2) {
                return true;
            }

            @Override
            public final boolean areItemsTheSame(int i, int i2) {
                FiltersView filtersView = FiltersView.this;
                MediaFilterData mediaFilterData = (MediaFilterData) filtersView.oldItems.get(i);
                MediaFilterData mediaFilterData2 = (MediaFilterData) filtersView.usersFilters.get(i2);
                if (mediaFilterData.filterType != mediaFilterData2.filterType && (!mediaFilterData.isMedia() || !mediaFilterData2.isMedia())) {
                    return false;
                }
                int i3 = mediaFilterData.filterType;
                if (i3 != 4) {
                    if (i3 == 6) {
                        return mediaFilterData.title.equals(mediaFilterData2.title);
                    }
                    return i3 == 7;
                }
                TLObject tLObject = mediaFilterData.chat;
                if (tLObject instanceof TLRPC.User) {
                    TLObject tLObject2 = mediaFilterData2.chat;
                    if (tLObject2 instanceof TLRPC.User) {
                        return ((TLRPC.User) tLObject).id == ((TLRPC.User) tLObject2).id;
                    }
                }
                if (!(tLObject instanceof TLRPC.Chat)) {
                    return false;
                }
                TLObject tLObject3 = mediaFilterData2.chat;
                return (tLObject3 instanceof TLRPC.Chat) && ((TLRPC.Chat) tLObject).id == ((TLRPC.Chat) tLObject3).id;
            }

            @Override
            public final int getNewListSize() {
                return FiltersView.this.usersFilters.size();
            }

            @Override
            public final int getOldListSize() {
                return FiltersView.this.oldItems.size();
            }
        };
        StickersActivity.AnonymousClass2 anonymousClass2 = new StickersActivity.AnonymousClass2((Object) this, 1);
        this.layoutManager = anonymousClass2;
        anonymousClass2.setOrientation(0);
        setLayoutManager(anonymousClass2);
        setAdapter(new MessageSeenView.AnonymousClass3(this, 1));
        addItemDecoration(new AnonymousClass2(0));
        setItemAnimator(new AnonymousClass3());
        setWillNotDraw(false);
        setHideIfEmpty(false);
        setSelectorRadius(AndroidUtilities.dp(28.0f));
        setSelectorDrawableColor(Theme.getColor(Theme.key_listSelector, this.resourcesProvider));
    }

    public static void createForDayMonth(int i, int i2, ArrayList arrayList) {
        int i3 = i2;
        if (i3 < 0 || i3 >= 12 || i < 0 || i >= numberOfDaysEachMonth[i3]) {
            return;
        }
        int i4 = Calendar.getInstance().get(1);
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        GregorianCalendar gregorianCalendar = (GregorianCalendar) Calendar.getInstance();
        int i5 = i4;
        while (i5 >= 2013) {
            if (i3 != 1 || i != 28 || gregorianCalendar.isLeapYear(i5)) {
                Calendar calendar = Calendar.getInstance();
                calendar.set(i5, i3, i + 1, 0, 0, 0);
                long timeInMillis2 = calendar.getTimeInMillis();
                if (timeInMillis2 <= timeInMillis) {
                    calendar.set(i5, i2, i + 2, 0, 0, 0);
                    long timeInMillis3 = calendar.getTimeInMillis() - 1;
                    if (i5 == i4) {
                        arrayList.add(new DateData(timeInMillis2, timeInMillis3, LocaleController.getInstance().getFormatterDayMonth().format(timeInMillis2)));
                    } else {
                        arrayList.add(new DateData(timeInMillis2, timeInMillis3, LocaleController.getInstance().getFormatterYearMax().format(timeInMillis2)));
                    }
                }
            }
            i5--;
            i3 = i2;
        }
    }

    public static void createForMonthYear(int i, int i2, ArrayList arrayList) {
        int i3 = Calendar.getInstance().get(1);
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        if (i2 < 2013 || i2 > i3) {
            return;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.set(i2, i, 1, 0, 0, 0);
        long timeInMillis2 = calendar.getTimeInMillis();
        if (timeInMillis2 > timeInMillis) {
            return;
        }
        calendar.add(2, 1);
        arrayList.add(new DateData(timeInMillis2, calendar.getTimeInMillis() - 1, LocaleController.getInstance().getFormatterMonthYear().format(timeInMillis2)));
    }

    public static void fillTipDates(String str, ArrayList arrayList) {
        int i;
        arrayList.clear();
        if (str == null) {
            return;
        }
        String strTrim = str.trim();
        if (strTrim.length() < 3) {
            return;
        }
        int i2 = R.string.SearchTipToday;
        if (LocaleController.getString(i2).toLowerCase().startsWith(strTrim) || "today".startsWith(strTrim)) {
            Calendar calendar = Calendar.getInstance();
            int i3 = calendar.get(1);
            int i4 = calendar.get(2);
            int i5 = calendar.get(5);
            calendar.set(i3, i4, i5, 0, 0, 0);
            long timeInMillis = calendar.getTimeInMillis();
            calendar.set(i3, i4, i5 + 1, 0, 0, 0);
            arrayList.add(new DateData(timeInMillis, calendar.getTimeInMillis() - 1, LocaleController.getString(i2)));
            return;
        }
        int i6 = R.string.SearchTipYesterday;
        if (LocaleController.getString(i6).toLowerCase().startsWith(strTrim) || "yesterday".startsWith(strTrim)) {
            Calendar calendar2 = Calendar.getInstance();
            int i7 = calendar2.get(1);
            int i8 = calendar2.get(2);
            int i9 = calendar2.get(5);
            calendar2.set(i7, i8, i9, 0, 0, 0);
            long timeInMillis2 = calendar2.getTimeInMillis() - 86400000;
            calendar2.set(i7, i8, i9 + 1, 0, 0, 0);
            arrayList.add(new DateData(timeInMillis2, calendar2.getTimeInMillis() - 86400001, LocaleController.getString(i6)));
            return;
        }
        Calendar calendar3 = Calendar.getInstance();
        if (strTrim.length() <= 3) {
            i = -1;
            break;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEEE", Locale.ENGLISH);
        i = 0;
        while (true) {
            if (i >= 7) {
                i = -1;
                break;
            }
            calendar3.set(7, i);
            if (LocaleController.getInstance().getFormatterWeekLong().format(calendar3.getTime()).toLowerCase().startsWith(strTrim) || simpleDateFormat.format(calendar3.getTime()).toLowerCase().startsWith(strTrim)) {
                break;
            } else {
                i++;
            }
        }
        if (i >= 0) {
            Calendar calendar4 = Calendar.getInstance();
            long timeInMillis3 = calendar4.getTimeInMillis();
            calendar4.set(7, i);
            if (calendar4.getTimeInMillis() > timeInMillis3) {
                calendar4.setTimeInMillis(calendar4.getTimeInMillis() - 604800000);
            }
            int i10 = calendar4.get(1);
            int i11 = calendar4.get(2);
            int i12 = calendar4.get(5);
            calendar4.set(i10, i11, i12, 0, 0, 0);
            long timeInMillis4 = calendar4.getTimeInMillis();
            calendar4.set(i10, i11, i12 + 1, 0, 0, 0);
            arrayList.add(new DateData(timeInMillis4, calendar4.getTimeInMillis() - 1, LocaleController.getInstance().getFormatterWeekLong().format(timeInMillis4)));
            return;
        }
        Matcher matcher = shortDate.matcher(strTrim);
        if (matcher.matches()) {
            String strGroup = matcher.group(1);
            String strGroup2 = matcher.group(3);
            int i13 = Integer.parseInt(strGroup);
            int i14 = Integer.parseInt(strGroup2);
            if (i13 <= 0 || i13 > 31) {
                if (i13 < 2013 || i14 > 12) {
                    return;
                }
                createForMonthYear(i14 - 1, i13, arrayList);
                return;
            }
            if (i14 >= 2013 && i13 <= 12) {
                createForMonthYear(i13 - 1, i14, arrayList);
                return;
            } else {
                if (i14 <= 12) {
                    createForDayMonth(i13 - 1, i14 - 1, arrayList);
                    return;
                }
                return;
            }
        }
        Matcher matcher2 = longDate.matcher(strTrim);
        if (matcher2.matches()) {
            String strGroup3 = matcher2.group(1);
            String strGroup4 = matcher2.group(3);
            String strGroup5 = matcher2.group(5);
            if (matcher2.group(2).equals(matcher2.group(4))) {
                int i15 = Integer.parseInt(strGroup3);
                int i16 = Integer.parseInt(strGroup4) - 1;
                int i17 = Integer.parseInt(strGroup5);
                if (i17 >= 10 && i17 <= 99) {
                    i17 += 2000;
                }
                int i18 = i17;
                int i19 = Calendar.getInstance().get(1);
                int i20 = i15 - 1;
                if (i16 < 0 || i16 >= 12 || i20 < 0 || i20 >= numberOfDaysEachMonth[i16] || i18 < 2013 || i18 > i19) {
                    return;
                }
                Calendar calendar5 = Calendar.getInstance();
                calendar5.set(i18, i16, i15, 0, 0, 0);
                long timeInMillis5 = calendar5.getTimeInMillis();
                calendar5.set(i18, i16, i15 + 1, 0, 0, 0);
                arrayList.add(new DateData(timeInMillis5, calendar5.getTimeInMillis() - 1, LocaleController.getInstance().getFormatterYearMax().format(timeInMillis5)));
                return;
            }
            return;
        }
        if (yearPatter.matcher(strTrim).matches()) {
            int iIntValue = Integer.valueOf(strTrim).intValue();
            int i21 = Calendar.getInstance().get(1);
            if (iIntValue < 2013) {
                while (i21 >= 2013) {
                    Calendar calendar6 = Calendar.getInstance();
                    calendar6.set(i21, 0, 1, 0, 0, 0);
                    long timeInMillis6 = calendar6.getTimeInMillis();
                    calendar6.set(i21 + 1, 0, 1, 0, 0, 0);
                    arrayList.add(new DateData(timeInMillis6, calendar6.getTimeInMillis() - 1, Integer.toString(i21)));
                    i21--;
                }
                return;
            }
            if (iIntValue <= i21) {
                Calendar calendar7 = Calendar.getInstance();
                calendar7.set(iIntValue, 0, 1, 0, 0, 0);
                long timeInMillis7 = calendar7.getTimeInMillis();
                calendar7.set(iIntValue + 1, 0, 1, 0, 0, 0);
                arrayList.add(new DateData(timeInMillis7, calendar7.getTimeInMillis() - 1, Integer.toString(iIntValue)));
                return;
            }
            return;
        }
        Matcher matcher3 = monthYearOrDayPatter.matcher(strTrim);
        if (matcher3.matches()) {
            String strGroup6 = matcher3.group(1);
            String strGroup7 = matcher3.group(2);
            int month = getMonth(strGroup6);
            if (month >= 0) {
                int iIntValue2 = Integer.valueOf(strGroup7).intValue();
                if (iIntValue2 > 0 && iIntValue2 <= 31) {
                    createForDayMonth(iIntValue2 - 1, month, arrayList);
                    return;
                } else if (iIntValue2 >= 2013) {
                    createForMonthYear(month, iIntValue2, arrayList);
                    return;
                }
            }
        }
        Matcher matcher4 = yearOrDayAndMonthPatter.matcher(strTrim);
        if (matcher4.matches()) {
            String strGroup8 = matcher4.group(1);
            int month2 = getMonth(matcher4.group(2));
            if (month2 >= 0) {
                int iIntValue3 = Integer.valueOf(strGroup8).intValue();
                if (iIntValue3 > 0 && iIntValue3 <= 31) {
                    createForDayMonth(iIntValue3 - 1, month2, arrayList);
                    return;
                } else if (iIntValue3 >= 2013) {
                    createForMonthYear(month2, iIntValue3, arrayList);
                }
            }
        }
        if (TextUtils.isEmpty(strTrim) || strTrim.length() <= 2) {
            return;
        }
        int month3 = getMonth(strTrim);
        long timeInMillis8 = Calendar.getInstance().getTimeInMillis();
        if (month3 >= 0) {
            for (int i22 = Calendar.getInstance().get(1); i22 >= 2013; i22--) {
                Calendar calendar8 = Calendar.getInstance();
                calendar8.set(i22, month3, 1, 0, 0, 0);
                long timeInMillis9 = calendar8.getTimeInMillis();
                if (timeInMillis9 <= timeInMillis8) {
                    calendar8.add(2, 1);
                    arrayList.add(new DateData(timeInMillis9, calendar8.getTimeInMillis() - 1, LocaleController.getInstance().getFormatterMonthYear().format(timeInMillis9)));
                }
            }
        }
    }

    public static int getMonth(String str) {
        String[] strArr = {LocaleController.getString(R.string.January).toLowerCase(), LocaleController.getString(R.string.February).toLowerCase(), LocaleController.getString(R.string.March).toLowerCase(), LocaleController.getString(R.string.April).toLowerCase(), LocaleController.getString(R.string.May).toLowerCase(), LocaleController.getString(R.string.June).toLowerCase(), LocaleController.getString(R.string.July).toLowerCase(), LocaleController.getString(R.string.August).toLowerCase(), LocaleController.getString(R.string.September).toLowerCase(), LocaleController.getString(R.string.October).toLowerCase(), LocaleController.getString(R.string.November).toLowerCase(), LocaleController.getString(R.string.December).toLowerCase()};
        String[] strArr2 = new String[12];
        Calendar calendar = Calendar.getInstance();
        for (int i = 1; i <= 12; i++) {
            calendar.set(0, 0, 0, 0, 0, 0);
            calendar.set(2, i);
            strArr2[i - 1] = calendar.getDisplayName(2, 2, Locale.ENGLISH).toLowerCase();
        }
        for (int i2 = 0; i2 < 12; i2++) {
            if (strArr2[i2].startsWith(str) || strArr[i2].startsWith(str)) {
                return i2;
            }
        }
        return -1;
    }

    public ArrayList<ThemeDescription> getThemeDescriptions() {
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
        arrayList.add(new ThemeDescription(this, 0, null, null, null, null, Theme.key_graySection));
        arrayList.add(new ThemeDescription(this, 0, null, null, null, null, Theme.key_graySectionText));
        return arrayList;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.drawDivider) {
            canvas.drawRect(0.0f, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight(), Theme.dividerPaint);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (isEnabled()) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (isEnabled()) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public final void setUsersAndDates(ArrayList arrayList, ArrayList arrayList2, boolean z) {
        ArrayList arrayList3 = this.oldItems;
        arrayList3.clear();
        ArrayList arrayList4 = this.usersFilters;
        arrayList3.addAll(arrayList4);
        arrayList4.clear();
        if (arrayList != null) {
            for (int i = 0; i < arrayList.size(); i++) {
                Object obj = arrayList.get(i);
                if (obj instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) obj;
                    MediaFilterData mediaFilterData = new MediaFilterData(R.drawable.search_users_filled, 4, UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser().id == user.id ? LocaleController.getString(R.string.SavedMessages) : ContactsController.formatName(user.first_name, user.last_name, 10));
                    mediaFilterData.chat = user;
                    arrayList4.add(mediaFilterData);
                } else if (obj instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) obj;
                    String strM$1 = chat.title;
                    if (strM$1.length() > 12) {
                        strM$1 = SurfaceContainer$$ExternalSyntheticOutline0.m$1(strM$1.substring(0, 10), "...");
                    }
                    MediaFilterData mediaFilterData2 = new MediaFilterData(R.drawable.search_users_filled, 4, strM$1);
                    mediaFilterData2.chat = chat;
                    arrayList4.add(mediaFilterData2);
                }
            }
        }
        if (arrayList2 != null) {
            for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                DateData dateData = (DateData) arrayList2.get(i2);
                MediaFilterData mediaFilterData3 = new MediaFilterData(R.drawable.search_date_filled, 6, dateData.title);
                mediaFilterData3.dateData = dateData;
                arrayList4.add(mediaFilterData3);
            }
        }
        if (z) {
            arrayList4.add(new MediaFilterData(R.drawable.chats_archive, R.string.ArchiveSearchFilter, null, 7));
        }
        if (getAdapter() != null) {
            zzcn zzcnVar = new zzcn(getAdapter(), 8);
            DiffUtil.calculateDiff(this.diffUtilsCallback, true).dispatchUpdatesTo(zzcnVar);
            if (arrayList4.isEmpty() || !zzcnVar.zza) {
                return;
            }
            StickersActivity.AnonymousClass2 anonymousClass2 = this.layoutManager;
            anonymousClass2.scrollToPositionWithOffset(0, 0, anonymousClass2.mShouldReverseLayout);
        }
    }

    public final void updateColors$1() {
        getRecycledViewPool().clear();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof FilterView) {
                int i2 = FilterView.$r8$clinit;
                ((FilterView) childAt).updateColors();
            }
        }
        for (int i3 = 0; i3 < getCachedChildCount(); i3++) {
            View cachedChildAt = getCachedChildAt(i3);
            if (cachedChildAt instanceof FilterView) {
                int i4 = FilterView.$r8$clinit;
                ((FilterView) cachedChildAt).updateColors();
            }
        }
        for (int i5 = 0; i5 < getAttachedScrapChildCount(); i5++) {
            View attachedScrapChildAt = getAttachedScrapChildAt(i5);
            if (attachedScrapChildAt instanceof FilterView) {
                int i6 = FilterView.$r8$clinit;
                ((FilterView) attachedScrapChildAt).updateColors();
            }
        }
        setSelectorDrawableColor(Theme.getColor(Theme.key_listSelector, this.resourcesProvider));
    }

    public final class MediaFilterData {
        public TLObject chat;
        public DateData dateData;
        public final TLRPC.MessagesFilter filter;
        public final int filterType;
        public final int iconResFilled;
        public boolean removable;
        public final String title;
        public final int titleResId;

        public MediaFilterData(int i, int i2, String str) {
            this.removable = true;
            this.iconResFilled = i;
            this.title = str;
            this.filter = null;
            this.filterType = i2;
        }

        public final boolean isMedia() {
            int i = this.filterType;
            return i == 0 || i == 1 || i == 2 || i == 3 || i == 5;
        }

        public MediaFilterData(int i, int i2, TLRPC.MessagesFilter messagesFilter, int i3) {
            this.removable = true;
            this.iconResFilled = i;
            this.titleResId = i2;
            this.filter = messagesFilter;
            this.filterType = i3;
        }
    }
}
