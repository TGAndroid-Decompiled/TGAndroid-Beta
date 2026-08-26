package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import me.vkryl.core.BitwiseUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLoader$$ExternalSyntheticLambda1;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController$$ExternalSyntheticOutline1;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Business.BusinessLinksActivity;
import org.telegram.ui.Business.BusinessLinksController;
import org.telegram.ui.Business.QuickRepliesActivity;
import org.telegram.ui.Business.QuickRepliesController;
import org.telegram.ui.Cells.CheckBoxCell;
import org.telegram.ui.Cells.CollapseTextCell;
import org.telegram.ui.Cells.DialogCell;
import org.telegram.ui.Cells.DialogRadioCell;
import org.telegram.ui.Cells.GraySectionCell;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.NotificationsCheckCell;
import org.telegram.ui.Cells.ProfileSearchCell;
import org.telegram.ui.Cells.RadioButtonCell;
import org.telegram.ui.Cells.SlideIntChooseView;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Cells.TextCheckCell;
import org.telegram.ui.Cells.TextCheckCell2;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Cells.TextRightIconCell;
import org.telegram.ui.Cells.TextSettingsCell;
import org.telegram.ui.Cells.UserCell;
import org.telegram.ui.ChannelMonetizationLayout;
import org.telegram.ui.Charts.BaseChartView;
import org.telegram.ui.Components.ListView.AdapterWithDiffUtils;
import org.telegram.ui.Components.spoilers.SpoilersTextView;
import org.telegram.ui.Components.voip.VoIPEllipsizeSpan;
import org.telegram.ui.DialogsActivity$$ExternalSyntheticLambda8;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.StatisticActivity;
import org.telegram.ui.StatisticActivity$$ExternalSyntheticLambda13;
import org.telegram.ui.Stories.recorder.HintView2;
import org.telegram.ui.Stories.recorder.StoryPrivacyBottomSheet;
import org.telegram.ui.VoIPFragment$$ExternalSyntheticLambda7;

public class UniversalAdapter extends AdapterWithDiffUtils {
    public boolean allowReorder;
    public BaseChartView.SharedUiComponents chartSharedUI;
    public final int classGuid;
    public final Context context;
    public final int currentAccount;
    public Section currentReorderSection;
    public Section currentWhiteSection;
    public final boolean dialog;
    public Utilities.Callback2 fillItems;
    public final RecyclerListView listView;
    public Utilities.Callback2 onReordered;
    public boolean orderChanged;
    public int orderChangedId;
    public final Theme.ResourcesProvider resourcesProvider;
    public boolean applyBackground = true;
    public final ArrayList oldItems = new ArrayList();
    public final ArrayList items = new ArrayList();
    public int itemsOffset = 0;
    public final ArrayList whiteSections = new ArrayList();
    public final ArrayList reorderSections = new ArrayList();

    public final class FullscreenCustomFrameLayout extends FrameLayout {
        public int minusHeight;
        public boolean minusPadding;

        @Override
        public final void onMeasure(int i, int i2) {
            int paddingBottom = this.minusHeight;
            View view = getParent() instanceof View ? (View) getParent() : null;
            if (this.minusPadding && view != null) {
                paddingBottom = view.getPaddingBottom() + view.getPaddingTop() + paddingBottom;
            }
            if (view != null && view.getMeasuredHeight() > 0) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight() - paddingBottom, 1073741824));
                return;
            }
            if (View.MeasureSpec.getMode(i2) != 0) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2) - paddingBottom, 1073741824));
                return;
            }
            int size = View.MeasureSpec.getSize(i2);
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824);
            measureChildren(iMakeMeasureSpec, i2);
            int iMin = 0;
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                iMin = Math.max(iMin, getChildAt(i3).getMeasuredHeight());
            }
            if (size > 0) {
                iMin = Math.min(iMin, size - paddingBottom);
            }
            super.onMeasure(iMakeMeasureSpec, View.MeasureSpec.makeMeasureSpec(iMin, 1073741824));
        }
    }

    public final class Section {
        public int end;
        public int start;
    }

    public final class SpaceView extends View {
        public int height;

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(this.height, 1073741824));
        }

        public void setHeight(int i) {
            if (this.height == i) {
                return;
            }
            this.height = i;
            requestLayout();
        }
    }

    public UniversalAdapter(RecyclerListView recyclerListView, Context context, int i, int i2, boolean z, Utilities.Callback2 callback2, Theme.ResourcesProvider resourcesProvider) {
        this.listView = recyclerListView;
        this.context = context;
        this.currentAccount = i;
        this.classGuid = i2;
        this.dialog = z;
        this.fillItems = callback2;
        this.resourcesProvider = resourcesProvider;
        update(false);
    }

    public static boolean isShadow(int i) {
        if (i < 10000) {
            return i == 7 || i == 8 || i == 38 || i == 31 || i == -4 || i == 28 || i == 2 || i == -2;
        }
        UItem.UItemFactory uItemFactoryFindFactory = UItem.findFactory(i);
        return uItemFactoryFindFactory != null && uItemFactoryFindFactory.isShadow();
    }

    public final UItem getItem(int i) {
        if (i < 0) {
            return null;
        }
        ArrayList arrayList = this.items;
        if (i >= arrayList.size()) {
            return null;
        }
        return (UItem) arrayList.get(i);
    }

    @Override
    public final int getItemCount() {
        return this.items.size();
    }

    @Override
    public final int getItemViewType(int i) {
        UItem item = getItem(i);
        if (item == null) {
            return 0;
        }
        return item.viewType;
    }

    public final int getReorderSectionId(int i) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.reorderSections;
            if (i2 >= arrayList.size()) {
                return -1;
            }
            Section section = (Section) arrayList.get(i2);
            if (i >= section.start && i <= section.end) {
                return i2;
            }
            i2++;
        }
    }

    public int getThemedColor(int i) {
        return Theme.getColor(i, this.resourcesProvider);
    }

    public final boolean hasDivider(int i) {
        UItem item = getItem(i);
        UItem item2 = getItem(i + 1);
        return (item == null || item.hideDivider || item2 == null || isShadow(item2.viewType) != isShadow(item.viewType)) ? false : true;
    }

    @Override
    public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
        int i = viewHolder.mItemViewType;
        UItem item = getItem(viewHolder.getAdapterPosition());
        if (i >= 10000) {
            UItem.UItemFactory uItemFactoryFindFactory = UItem.findFactory(i);
            if (uItemFactoryFindFactory == null || !uItemFactoryFindFactory.isClickable()) {
                return false;
            }
        } else if (i != 3 && i != 5 && i != 6 && i != 30 && i != 4 && i != 10 && i != 44 && i != 11 && i != 12 && i != 17 && i != 16 && i != 29 && i != 25 && i != 27 && i != 32 && i != 33 && i != 35 && i != 36 && i != 37 && i != 41 && i != 39 && i != 40 && i != 38) {
            return false;
        }
        return item == null || item.enabled;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        View view;
        View view2;
        boolean z;
        boolean z2;
        int i2;
        CollapseTextCell collapseTextCell;
        CharSequence charSequence;
        TLRPC.Document document;
        long j;
        ImageLocation imageLocation;
        String str;
        TLRPC.Photo photo;
        long j2;
        boolean z3;
        long j3;
        boolean z4;
        CharSequence charSequenceConcat;
        int i3;
        VoIPFragment$$ExternalSyntheticLambda7 voIPFragment$$ExternalSyntheticLambda7;
        UItem item = getItem(i);
        UItem item2 = getItem(i + 1);
        UItem item3 = getItem(i - 1);
        if (item == null) {
            return;
        }
        int i4 = viewHolder.mItemViewType;
        boolean zHasDivider = hasDivider(i);
        updateColors(viewHolder);
        RecyclerListView recyclerListView = this.listView;
        View view3 = viewHolder.itemView;
        if (i4 < 10000) {
            int i5 = this.currentAccount;
            long j4 = 0;
            String userName = "";
            byte b = -1;
            switch (i4) {
                case -4:
                case -2:
                case -1:
                    view = view3;
                    FrameLayout frameLayout = (FrameLayout) view;
                    frameLayout.setClipChildren(!item.checked);
                    frameLayout.setClipToPadding(!item.checked);
                    if (frameLayout.getChildCount() != (item.view == null ? 0 : 1) || frameLayout.getChildAt(0) != item.view) {
                        frameLayout.removeAllViews();
                        View view4 = item.view;
                        if (view4 != null) {
                            AndroidUtilities.removeFromParent(view4);
                            frameLayout.addView(item.view, (i4 == -1 || i4 == -4) ? LayoutHelper.createFrame(item.intValue, -1) : LayoutHelper.createFrame(-2.0f, -2));
                        }
                    }
                    break;
                case -3:
                    view = view3;
                    FullscreenCustomFrameLayout fullscreenCustomFrameLayout = (FullscreenCustomFrameLayout) view;
                    fullscreenCustomFrameLayout.minusHeight = item.intValue;
                    fullscreenCustomFrameLayout.minusPadding = BitwiseUtils.hasFlag(item.flags, 1);
                    if (fullscreenCustomFrameLayout.getChildCount() != (item.view == null ? 0 : 1) || fullscreenCustomFrameLayout.getChildAt(0) != item.view) {
                        fullscreenCustomFrameLayout.removeAllViews();
                        View view5 = item.view;
                        if (view5 != null) {
                            AndroidUtilities.removeFromParent(view5);
                            fullscreenCustomFrameLayout.addView(item.view, LayoutHelper.createFrame(-1.0f, -1));
                        }
                    }
                    break;
                case 0:
                case 1:
                case 26:
                    view = view3;
                    HeaderCell headerCell = (HeaderCell) view;
                    headerCell.setText(item.text);
                    headerCell.setEnabled$1(item.enabled);
                    break;
                case 2:
                    view = view3;
                    TopViewCell topViewCell = (TopViewCell) view;
                    int i6 = item.iconResId;
                    if (i6 == 0) {
                        int i7 = item.intValue;
                        if (i7 != 0) {
                            topViewCell.setEmojiSize(i7);
                        }
                        String string = item.subtext.toString();
                        String string2 = item.textValue.toString();
                        topViewCell.getClass();
                        MediaDataController.getInstance(UserConfig.selectedAccount).setPlaceholderImage(topViewCell.imageView, string, string2, "90_90");
                    } else if (item.accent) {
                        topViewCell.setEmojiStatic(i6);
                    } else {
                        topViewCell.setEmoji(i6);
                    }
                    if (!TextUtils.isEmpty(item.animatedText)) {
                        CharSequence charSequence2 = item.text;
                        CharSequence charSequence3 = item.animatedText;
                        topViewCell.titleView.setText(charSequence2);
                        topViewCell.titleView.setVisibility(0);
                        LinkSpanDrawable.LinksTextView linksTextView = topViewCell.textView;
                        linksTextView.setText(charSequence3);
                        linksTextView.setMaxWidth(HintView2.cutInFancyHalf(charSequence3, linksTextView.getPaint()));
                        linksTextView.requestLayout();
                        topViewCell.updateColors$1();
                    } else {
                        topViewCell.setText(item.text);
                    }
                    break;
                case 3:
                    view = view3;
                    TextCell textCell = (TextCell) view;
                    Object obj = item.object;
                    if (obj instanceof TLRPC.Document) {
                        CharSequence charSequence4 = item.text;
                        TLRPC.Document document2 = (TLRPC.Document) obj;
                        textCell.imageLeft = 16;
                        textCell.offsetFromImage = 58;
                        textCell.textView.setText(charSequence4, false);
                        textCell.textView.setRightDrawable((Drawable) null);
                        AnimatedTextView animatedTextView = textCell.valueTextView;
                        textCell.valueText = null;
                        animatedTextView.setText(null, false, true);
                        textCell.valueImageView.setVisibility(8);
                        textCell.valueTextView.setVisibility(8);
                        textCell.valueSpoilersTextView.setVisibility(8);
                        textCell.imageView.setVisibility(8);
                        textCell.imageView.setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
                        textCell.needDivider = zHasDivider;
                        textCell.setWillNotDraw(!zHasDivider);
                        Switch r3 = textCell.checkBox;
                        if (r3 != null) {
                            r3.setVisibility(8);
                        }
                        textCell.setValueSticker(document2);
                    } else if (obj instanceof String) {
                        CharSequence charSequence5 = item.text;
                        String str2 = (String) obj;
                        textCell.imageLeft = 16;
                        textCell.offsetFromImage = 58;
                        SimpleTextView simpleTextView = textCell.textView;
                        simpleTextView.setText(charSequence5, false);
                        simpleTextView.setRightDrawable((Drawable) null);
                        AnimatedTextView animatedTextView2 = textCell.valueTextView;
                        textCell.valueText = null;
                        animatedTextView2.setText(null, false, true);
                        textCell.valueImageView.setVisibility(8);
                        animatedTextView2.setVisibility(8);
                        textCell.valueSpoilersTextView.setVisibility(8);
                        RLottieImageView rLottieImageView = textCell.imageView;
                        rLottieImageView.setVisibility(8);
                        rLottieImageView.setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
                        textCell.needDivider = zHasDivider;
                        textCell.setWillNotDraw(!zHasDivider);
                        Switch r4 = textCell.checkBox;
                        if (r4 != null) {
                            r4.setVisibility(8);
                        }
                        textCell.setValueSticker(str2);
                    } else if (TextUtils.isEmpty(item.textValue)) {
                        Object obj2 = item.object;
                        if (obj2 instanceof Drawable) {
                            textCell.setTextAndIcon(item.text, (Drawable) obj2, zHasDivider);
                        } else {
                            int i8 = item.iconResId;
                            if (i8 == 0) {
                                textCell.setText(item.text, zHasDivider);
                            } else {
                                textCell.setTextAndIcon(i8, item.text, zHasDivider);
                            }
                        }
                    } else {
                        Object obj3 = item.object;
                        if (obj3 instanceof Drawable) {
                            textCell.setTextAndValueAndIcon(item.text, item.textValue, (Drawable) obj3, zHasDivider);
                        } else {
                            int i9 = item.iconResId;
                            if (i9 == 0) {
                                textCell.setTextAndValue(item.text, item.textValue, false, zHasDivider);
                            } else {
                                textCell.setTextAndValueAndIcon(item.text, item.textValue, false, i9, zHasDivider);
                            }
                        }
                    }
                    if (item.accent) {
                        int i10 = Theme.key_windowBackgroundWhiteBlueText4;
                        textCell.setColors(i10, i10);
                    } else if (item.red) {
                        textCell.setColors(Theme.key_text_RedBold, Theme.key_text_RedRegular);
                    } else {
                        textCell.setColors(Theme.key_windowBackgroundWhiteGrayIcon, Theme.key_windowBackgroundWhiteBlackText);
                    }
                    textCell.setEnabled$1(item.enabled);
                    break;
                case 4:
                case 9:
                    view = view3;
                    TextCheckCell textCheckCell = (TextCheckCell) view;
                    if (textCheckCell.itemId == item.id) {
                        textCheckCell.setChecked(item.checked);
                    }
                    textCheckCell.setEnabled(null, item.enabled);
                    textCheckCell.setTextAndCheck(item.text, item.checked, zHasDivider);
                    textCheckCell.itemId = item.id;
                    if (i4 == 9) {
                        view.setBackgroundColor(Theme.getColor(null, item.checked ? Theme.key_windowBackgroundChecked : Theme.key_windowBackgroundUnchecked, false));
                    }
                    break;
                case 5:
                    view = view3;
                    NotificationsCheckCell notificationsCheckCell = (NotificationsCheckCell) view;
                    CharSequence charSequence6 = item.subtext;
                    notificationsCheckCell.setTextAndValueAndIconAndCheck(item.text, item.subtext, 0, item.checked, 0, charSequence6 != null && charSequence6.toString().contains("\n"), zHasDivider, false);
                    break;
                case 6:
                    view = view3;
                    ((NotificationsCheckCell) view).setTextAndValueAndIconAndCheck(item.text, item.subtext, 0, item.checked, 0, false, zHasDivider, false);
                    break;
                case 7:
                case 8:
                case 38:
                    view = view3;
                    if (i4 == 7 || i4 == 8) {
                        TextInfoPrivacyCell textInfoPrivacyCell = (TextInfoPrivacyCell) view;
                        if (TextUtils.isEmpty(item.text)) {
                            textInfoPrivacyCell.setFixedSize(i4 == 8 ? 220 : 12);
                            textInfoPrivacyCell.setText("");
                        } else {
                            textInfoPrivacyCell.setFixedSize(0);
                            textInfoPrivacyCell.setText(item.text);
                        }
                        if (item.accent) {
                            textInfoPrivacyCell.setTextGravity(17);
                            textInfoPrivacyCell.getTextView().setWidth(Math.min(HintView2.cutInFancyHalf(textInfoPrivacyCell.getText(), textInfoPrivacyCell.getTextView().getPaint()), AndroidUtilities.displaySize.x - AndroidUtilities.dp(60.0f)));
                            textInfoPrivacyCell.getTextView().setPadding(0, AndroidUtilities.dp(17.0f), 0, AndroidUtilities.dp(17.0f));
                        } else {
                            textInfoPrivacyCell.setTextGravity(8388611);
                            textInfoPrivacyCell.getTextView().setMinWidth(0);
                            textInfoPrivacyCell.getTextView().setMaxWidth(AndroidUtilities.displaySize.x);
                            textInfoPrivacyCell.getTextView().setPadding(0, AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(17.0f));
                        }
                        view2 = textInfoPrivacyCell;
                    } else if (i4 == 38) {
                        collapseTextCell = (CollapseTextCell) view;
                        CharSequence charSequence7 = item.animatedText;
                        boolean z5 = item.collapsed;
                        collapseTextCell.textView.setText(charSequence7);
                        collapseTextCell.collapsedArrow.animate().cancel();
                        collapseTextCell.collapsedArrow.animate().rotation(z5 ? 0.0f : 180.0f).setDuration(340L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).start();
                        if (item.accent) {
                            collapseTextCell.setColor(Theme.key_windowBackgroundWhiteBlueText4);
                        } else if (item.red) {
                            collapseTextCell.setColor(Theme.key_text_RedRegular);
                        } else {
                            collapseTextCell.setColor(Theme.key_windowBackgroundWhiteBlackText);
                        }
                    } else {
                        view2 = null;
                    }
                    if (item3 != null) {
                        view2 = collapseTextCell;
                        view2 = collapseTextCell;
                        if (isShadow(item3.viewType)) {
                            view2 = collapseTextCell;
                            view2 = collapseTextCell;
                            view2 = collapseTextCell;
                            view2 = collapseTextCell;
                            z = false;
                        } else {
                            z = true;
                        }
                    } else {
                        view2 = collapseTextCell;
                        view2 = collapseTextCell;
                        view2 = collapseTextCell;
                        view2 = collapseTextCell;
                        z = false;
                    }
                    if (item2 == null || isShadow(item2.viewType)) {
                        view2 = collapseTextCell;
                        view2 = collapseTextCell;
                        z2 = false;
                    } else {
                        view2 = collapseTextCell;
                        z2 = true;
                    }
                    if (!recyclerListView.hasSections()) {
                        if (z && z2) {
                            i2 = R.drawable.greydivider;
                        } else if (z) {
                            i2 = R.drawable.greydivider_bottom;
                        } else {
                            i2 = z2 ? R.drawable.greydivider_top : R.drawable.field_carret_empty;
                        }
                        Drawable themedDrawable = Theme.getThemedDrawable(this.context, i2, Theme.getColor(Theme.key_windowBackgroundGrayShadow, this.resourcesProvider));
                        if (!this.dialog) {
                            view2.setBackground(themedDrawable);
                        } else {
                            view2.setBackground(new LayerDrawable(new Drawable[]{new ColorDrawable(getThemedColor(Theme.key_dialogBackgroundGray)), themedDrawable}));
                        }
                    } else {
                        view2.setBackground(null);
                    }
                    break;
                case 10:
                    view = view3;
                    DialogRadioCell dialogRadioCell = (DialogRadioCell) view;
                    int i11 = dialogRadioCell.itemId;
                    int i12 = item.id;
                    RadioButton radioButton = dialogRadioCell.radioButton;
                    if (i11 == i12) {
                        radioButton.setChecked(item.checked, true);
                        dialogRadioCell.setEnabled(item.enabled, true);
                    } else {
                        dialogRadioCell.setEnabled(item.enabled, false);
                    }
                    boolean zIsEmpty = TextUtils.isEmpty(item.textValue);
                    TextView textView = dialogRadioCell.valueTextView;
                    TextView textView2 = dialogRadioCell.textView;
                    if (zIsEmpty) {
                        CharSequence charSequence8 = item.text;
                        boolean z6 = item.checked;
                        textView.setVisibility(8);
                        textView2.setText(charSequence8);
                        radioButton.setChecked(z6, false);
                        dialogRadioCell.needDivider = zHasDivider;
                        dialogRadioCell.updateLayout();
                        dialogRadioCell.setWillNotDraw(!zHasDivider);
                    } else {
                        CharSequence charSequence9 = item.text;
                        CharSequence charSequence10 = item.textValue;
                        boolean z7 = item.checked;
                        textView.setVisibility(0);
                        textView.setText(charSequence10);
                        textView2.setText(charSequence9);
                        radioButton.setChecked(z7, false);
                        dialogRadioCell.needDivider = zHasDivider;
                        dialogRadioCell.updateLayout();
                        dialogRadioCell.setWillNotDraw(!zHasDivider);
                    }
                    dialogRadioCell.itemId = item.id;
                    break;
                case 11:
                case 12:
                    view = view3;
                    UserCell userCell = (UserCell) view;
                    userCell.setFromUItem(i5, item, zHasDivider);
                    if (i4 == 12) {
                        userCell.setChecked(item.checked, false);
                    }
                    break;
                case 13:
                    view = view3;
                    UserCell userCell2 = (UserCell) view;
                    userCell2.setFromUItem(i5, item, zHasDivider);
                    CharSequence charSequence11 = item.textValue;
                    userCell2.setQuery(charSequence11 == null ? null : charSequence11.toString().toLowerCase());
                    userCell2.setAddButtonVisible(!item.checked);
                    userCell2.setCloseIcon(item.clickCallback);
                    break;
                case 14:
                    view = view3;
                    SlideChooseView slideChooseView = (SlideChooseView) view;
                    slideChooseView.setOptions(item.intValue, null, item.texts);
                    slideChooseView.setMinAllowedIndex((int) item.longValue);
                    slideChooseView.setCallback(new VideoEditTextureView$$ExternalSyntheticLambda1(item, 1));
                    break;
                case 15:
                    view = view3;
                    SlideIntChooseView slideIntChooseView = (SlideIntChooseView) view;
                    slideIntChooseView.set(item.intValue, (SlideIntChooseView.Options) item.object, item.intCallback);
                    slideIntChooseView.setMinValueAllowed((int) item.longValue);
                    break;
                case 16:
                    view = view3;
                    QuickRepliesActivity.QuickReplyView quickReplyView = (QuickRepliesActivity.QuickReplyView) view;
                    quickReplyView.checkBox.checkBoxBase.setChecked(-1, item.checked, false);
                    quickReplyView.setReorder(this.allowReorder);
                    Object obj4 = item.object;
                    if (obj4 instanceof QuickRepliesController.QuickReply) {
                        quickReplyView.set((QuickRepliesController.QuickReply) obj4, null, zHasDivider);
                    }
                    break;
                case 17:
                    view = view3;
                    QuickRepliesActivity.LargeQuickReplyView largeQuickReplyView = (QuickRepliesActivity.LargeQuickReplyView) view;
                    largeQuickReplyView.checkBox.checkBoxBase.setChecked(-1, item.checked, false);
                    Object obj5 = item.object;
                    if (obj5 instanceof QuickRepliesController.QuickReply) {
                        QuickRepliesController.QuickReply quickReply = (QuickRepliesController.QuickReply) obj5;
                        int i13 = UserConfig.selectedAccount;
                        largeQuickReplyView.titleView.setText(MessagesController.getInstance(i13).getPeerName(UserConfig.getInstance(i13).getClientUserId()));
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        MessageObject messageObject = quickReply.topMessage;
                        TextView textView3 = largeQuickReplyView.textView;
                        if (messageObject != null) {
                            spannableStringBuilder.append(Emoji.replaceEmoji(messageObject.messageText, textView3.getPaint().getFontMetricsInt(), false));
                        }
                        if (quickReply.getMessagesCount() > 1) {
                            spannableStringBuilder.append((CharSequence) "  ");
                            int iDp = AndroidUtilities.displaySize.x - AndroidUtilities.dp(80.0f);
                            int messagesCount = quickReply.getMessagesCount() - 1;
                            int i14 = VoIPEllipsizeSpan.$r8$clinit;
                            SpannableString spannableString = new SpannableString("+");
                            VoIPEllipsizeSpan voIPEllipsizeSpan = new VoIPEllipsizeSpan(messagesCount);
                            int iDp2 = (int) (((Text) voIPEllipsizeSpan.parents).width + AndroidUtilities.dp(10.0f));
                            int[] iArr = largeQuickReplyView.spanWidth;
                            iArr[0] = iDp2;
                            spannableString.setSpan(voIPEllipsizeSpan, 0, spannableString.length(), 33);
                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(TextUtils.ellipsize(spannableStringBuilder, textView3.getPaint(), (iDp * 1.5f) - iArr[0], TextUtils.TruncateAt.END));
                            if (spannableStringBuilder2.length() > 0 && spannableStringBuilder2.charAt(spannableStringBuilder2.length() - 1) == 8230) {
                                spannableStringBuilder2.append((CharSequence) "  ");
                            }
                            spannableStringBuilder2.append((CharSequence) spannableString);
                            charSequence = spannableStringBuilder2;
                        } else {
                            charSequence = spannableStringBuilder;
                        }
                        textView3.setText(charSequence);
                        TLRPC.MessageMedia media = MessageObject.getMedia(quickReply.topMessage);
                        ImageReceiver imageReceiver = largeQuickReplyView.imageReceiver;
                        if (media != null && (photo = media.photo) != null) {
                            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.dp(36.0f), true, null, true);
                            ImageLocation forObject = ImageLocation.getForObject(closestPhotoSizeWithSize, media.photo);
                            MessageObject messageObject2 = quickReply.topMessage;
                            imageReceiver.setImage(forObject, "36_36", messageObject2.strippedThumb, closestPhotoSizeWithSize == null ? 0L : closestPhotoSizeWithSize.size, (String) null, messageObject2, 0);
                            imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
                        } else if (media == null || (document = media.document) == null) {
                            AvatarDrawable avatarDrawable = largeQuickReplyView.avatarDrawable;
                            avatarDrawable.setInfo(UserConfig.selectedAccount, UserConfig.getInstance(i13).getCurrentUser());
                            imageReceiver.setForUserOrChat(UserConfig.getInstance(i13).getCurrentUser(), avatarDrawable);
                            imageReceiver.setRoundRadius(AndroidUtilities.dp(56.0f));
                        } else {
                            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(36.0f), true, null, true);
                            if (closestPhotoSizeWithSize2 == null) {
                                ImageLocation forDocument = ImageLocation.getForDocument(media.document);
                                j = media.document.size;
                                str = "g";
                                imageLocation = forDocument;
                            } else {
                                ImageLocation forObject2 = ImageLocation.getForObject(closestPhotoSizeWithSize2, media.document);
                                j = closestPhotoSizeWithSize2.size;
                                imageLocation = forObject2;
                                str = "36_36";
                            }
                            long j5 = j;
                            MessageObject messageObject3 = quickReply.topMessage;
                            imageReceiver.setImage(imageLocation, str, messageObject3.strippedThumb, j5, (String) null, messageObject3, 0);
                            imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
                        }
                        largeQuickReplyView.needDivider = zHasDivider;
                        largeQuickReplyView.invalidate();
                    }
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    view = view3;
                    StatisticActivity.UniversalChartCell universalChartCell = (StatisticActivity.UniversalChartCell) view;
                    int i15 = item.intValue;
                    StatisticActivity.ChartViewData chartViewData = (StatisticActivity.ChartViewData) item.object;
                    StatisticActivity$$ExternalSyntheticLambda13 statisticActivity$$ExternalSyntheticLambda13 = new StatisticActivity$$ExternalSyntheticLambda13(1, this, item);
                    universalChartCell.stats_dc = i15;
                    universalChartCell.findCell = statisticActivity$$ExternalSyntheticLambda13;
                    universalChartCell.updateData(chartViewData, false);
                    break;
                case 24:
                    view = view3;
                    ((ChannelMonetizationLayout.ProceedOverviewCell) view).set((ChannelMonetizationLayout.ProceedOverview) item.object);
                    break;
                case 25:
                    view = view3;
                    ChannelMonetizationLayout.TransactionCell transactionCell = (ChannelMonetizationLayout.TransactionCell) view;
                    TL_stats.BroadcastRevenueTransaction broadcastRevenueTransaction = (TL_stats.BroadcastRevenueTransaction) item.object;
                    transactionCell.getClass();
                    boolean z8 = broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionWithdrawal;
                    TextView textView4 = transactionCell.titleView;
                    TextView textView5 = transactionCell.dateView;
                    if (z8) {
                        TL_stats.TL_broadcastRevenueTransactionWithdrawal tL_broadcastRevenueTransactionWithdrawal = (TL_stats.TL_broadcastRevenueTransactionWithdrawal) broadcastRevenueTransaction;
                        textView4.setText(LocaleController.getString(R.string.MonetizationTransactionWithdraw));
                        if (tL_broadcastRevenueTransactionWithdrawal.pending) {
                            textView5.setText(LocaleController.getString(R.string.MonetizationTransactionPending));
                            z3 = false;
                        } else {
                            z3 = tL_broadcastRevenueTransactionWithdrawal.failed;
                            StringBuilder sb = new StringBuilder();
                            sb.append(LocaleController.formatShortDateTime(tL_broadcastRevenueTransactionWithdrawal.date));
                            sb.append(z3 ? NotificationsController$$ExternalSyntheticOutline1.m(new StringBuilder(" — "), R.string.MonetizationTransactionNotCompleted) : "");
                            textView5.setText(sb.toString());
                        }
                        j2 = tL_broadcastRevenueTransactionWithdrawal.amount;
                    } else {
                        if (broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionProceeds) {
                            TL_stats.TL_broadcastRevenueTransactionProceeds tL_broadcastRevenueTransactionProceeds = (TL_stats.TL_broadcastRevenueTransactionProceeds) broadcastRevenueTransaction;
                            textView4.setText(LocaleController.getString(R.string.MonetizationTransactionProceed));
                            textView5.setText(LocaleController.formatShortDateTime(tL_broadcastRevenueTransactionProceeds.from_date) + " - " + LocaleController.formatShortDateTime(tL_broadcastRevenueTransactionProceeds.to_date));
                            j2 = tL_broadcastRevenueTransactionProceeds.amount;
                        } else if (broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionRefund) {
                            TL_stats.TL_broadcastRevenueTransactionRefund tL_broadcastRevenueTransactionRefund = (TL_stats.TL_broadcastRevenueTransactionRefund) broadcastRevenueTransaction;
                            textView4.setText(LocaleController.getString(R.string.MonetizationTransactionRefund));
                            textView5.setText(LocaleController.formatShortDateTime(tL_broadcastRevenueTransactionRefund.from_date));
                            j2 = tL_broadcastRevenueTransactionRefund.amount;
                        }
                        b = 1;
                        z3 = false;
                    }
                    int i16 = z3 ? Theme.key_text_RedRegular : Theme.key_windowBackgroundWhiteGrayText;
                    Theme.ResourcesProvider resourcesProvider = transactionCell.resourcesProvider;
                    textView5.setTextColor(Theme.getColor(i16, resourcesProvider));
                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                    spannableStringBuilder3.append((CharSequence) (b < 0 ? "-" : "+"));
                    spannableStringBuilder3.append((CharSequence) "TON ");
                    spannableStringBuilder3.append((CharSequence) transactionCell.formatter.format(Math.abs(j2) / 1.0E9d));
                    int iIndexOf = TextUtils.indexOf(spannableStringBuilder3, ".");
                    if (iIndexOf >= 0) {
                        spannableStringBuilder3.setSpan(new RelativeSizeSpan(1.15f), 0, iIndexOf + 1, 33);
                    }
                    AnimatedEmojiSpan.TextViewEmojis textViewEmojis = transactionCell.valueText;
                    textViewEmojis.setText(ChannelMonetizationLayout.replaceTON(spannableStringBuilder3, textViewEmojis.getPaint(), 1.1f, AndroidUtilities.dp(0.33f), false));
                    textViewEmojis.setTextColor(Theme.getColor(b < 0 ? Theme.key_text_RedBold : Theme.key_avatar_nameInMessageGreen, resourcesProvider));
                    transactionCell.needDivider = zHasDivider;
                    transactionCell.setWillNotDraw(!zHasDivider);
                    break;
                case 27:
                    view = view3;
                    StoryPrivacyBottomSheet.UserCell userCell3 = (StoryPrivacyBottomSheet.UserCell) view;
                    long j6 = userCell3.dialogId;
                    Object obj6 = item.object;
                    if (!(obj6 instanceof TLRPC.User)) {
                        if (obj6 instanceof TLRPC.Chat) {
                            j3 = -((TLRPC.Chat) obj6).id;
                        }
                        if (j6 == j4) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        userCell3.setIsSendAs(false, true);
                        userCell3.set(item.object);
                        userCell3.checkBox.setVisibility(8);
                        userCell3.radioButton.setVisibility(0);
                        userCell3.setChecked(item.checked, z4);
                        userCell3.setDivider(zHasDivider);
                    } else {
                        j3 = ((TLRPC.User) obj6).id;
                    }
                    j4 = j3;
                    if (j6 == j4) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    userCell3.setIsSendAs(false, true);
                    userCell3.set(item.object);
                    userCell3.checkBox.setVisibility(8);
                    userCell3.radioButton.setVisibility(0);
                    userCell3.setChecked(item.checked, z4);
                    userCell3.setDivider(zHasDivider);
                    break;
                case 28:
                    view = view3;
                    if (item.transparent) {
                        view.setBackgroundColor(0);
                    } else {
                        int i17 = item.iconResId;
                        if (i17 != 0) {
                            view.setBackgroundColor(i17);
                        }
                    }
                    view.setId(item.id);
                    ((SpaceView) view).setHeight(item.intValue);
                    break;
                case 29:
                    view = view3;
                    BusinessLinksActivity.BusinessLinkView businessLinkView = (BusinessLinksActivity.BusinessLinkView) view;
                    Object obj7 = item.object;
                    if (obj7 instanceof BusinessLinksActivity.BusinessLinkWrapper) {
                        businessLinkView.needDivider = zHasDivider;
                        TL_account.TL_businessChatLink tL_businessChatLink = ((BusinessLinksActivity.BusinessLinkWrapper) obj7).link;
                        businessLinkView.businessLink = tL_businessChatLink;
                        boolean zIsEmpty2 = TextUtils.isEmpty(tL_businessChatLink.title);
                        SimpleTextView simpleTextView2 = businessLinkView.titleTextView;
                        if (zIsEmpty2) {
                            String strSubstring = businessLinkView.businessLink.link;
                            BusinessLinksController[] businessLinksControllerArr = BusinessLinksController.Instance;
                            if (strSubstring.startsWith("https://")) {
                                strSubstring = strSubstring.substring(8);
                            }
                            simpleTextView2.setText(strSubstring, false);
                        } else {
                            simpleTextView2.setText(businessLinkView.businessLink.title, false);
                        }
                        SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(businessLinkView.businessLink.message);
                        TL_account.TL_businessChatLink tL_businessChatLink2 = businessLinkView.businessLink;
                        MediaDataController.addTextStyleRuns(tL_businessChatLink2.entities, tL_businessChatLink2.message, spannableStringBuilder4);
                        SpoilersTextView spoilersTextView = businessLinkView.messagePreviewTextView;
                        CharSequence charSequenceReplaceEmoji = Emoji.replaceEmoji(spannableStringBuilder4, spoilersTextView.getPaint().getFontMetricsInt(), false);
                        MessageObject.replaceAnimatedEmoji(charSequenceReplaceEmoji, businessLinkView.businessLink.entities, spoilersTextView.getPaint().getFontMetricsInt());
                        spoilersTextView.setText(charSequenceReplaceEmoji);
                        int i18 = businessLinkView.businessLink.views;
                        SimpleTextView simpleTextView3 = businessLinkView.clicksCountTextView;
                        if (i18 == 0) {
                            simpleTextView3.setText(LocaleController.formatString(R.string.NoClicks, new Object[0]), false);
                        } else {
                            simpleTextView3.setText(LocaleController.formatPluralString("Clicks", i18, new Object[0]), false);
                        }
                        simpleTextView3.requestLayout();
                        businessLinkView.invalidate();
                    }
                    break;
                case 30:
                    view = view3;
                    TextRightIconCell textRightIconCell = (TextRightIconCell) view;
                    CharSequence charSequence12 = item.text;
                    int i19 = item.iconResId;
                    textRightIconCell.textView.setText(charSequence12, false);
                    textRightIconCell.ivIcon.setImageResource(i19);
                    textRightIconCell.setDivider(zHasDivider);
                    textRightIconCell.setBackgroundColor(getThemedColor(Theme.key_dialogBackground));
                    break;
                case 31:
                    view = view3;
                    GraySectionCell graySectionCell = (GraySectionCell) view;
                    if (!TextUtils.equals(graySectionCell.getText(), item.text)) {
                        graySectionCell.setText(item.text, item.subtext, item.clickCallback);
                    } else {
                        graySectionCell.setRightText(item.subtext, item.clickCallback);
                    }
                    break;
                case 32:
                    view = view3;
                    ProfileSearchCell profileSearchCell = (ProfileSearchCell) view;
                    Object obj8 = item.object;
                    if (item.accent && (obj8 instanceof TLRPC.User) && (i3 = ((TLRPC.User) obj8).bot_active_users) != 0) {
                        if (i3 != 0) {
                            charSequenceConcat = LocaleController.formatPluralStringSpaced("BotUsers", i3);
                        } else {
                            charSequenceConcat = "";
                        }
                    } else if (item.withUsername) {
                        String publicUsername = obj8 instanceof TLRPC.User ? UserObject.getPublicUsername((TLRPC.User) obj8) : obj8 instanceof TLRPC.Chat ? ChatObject.getPublicUsername((TLRPC.Chat) obj8) : null;
                        if (publicUsername != null) {
                            charSequenceConcat = "@".concat(publicUsername);
                        } else {
                            charSequenceConcat = "";
                        }
                    } else {
                        charSequenceConcat = "";
                    }
                    if (obj8 instanceof TLRPC.Chat) {
                        TLRPC.Chat chat = (TLRPC.Chat) obj8;
                        if (chat.participants_count != 0) {
                            String pluralStringSpaced = (!ChatObject.isChannel(chat) || chat.megagroup) ? LocaleController.formatPluralStringSpaced("Members", chat.participants_count) : LocaleController.formatPluralStringSpaced("Subscribers", chat.participants_count);
                            charSequenceConcat = !TextUtils.isEmpty(charSequenceConcat) ? TextUtils.concat(charSequenceConcat, ", ", pluralStringSpaced) : pluralStringSpaced;
                        }
                        userName = chat.title;
                    } else if (obj8 instanceof TLRPC.User) {
                        userName = UserObject.getUserName((TLRPC.User) obj8);
                    }
                    String str3 = userName;
                    boolean z9 = item.locked;
                    Object obj9 = item.object2;
                    Utilities.Callback callback = obj9 instanceof Utilities.Callback ? (Utilities.Callback) obj9 : null;
                    profileSearchCell.allowBotOpenButton = z9;
                    profileSearchCell.onOpenButtonClick = callback;
                    profileSearchCell.setRectangularAvatar(item.red);
                    CharSequence charSequence13 = item.subtext;
                    profileSearchCell.setData(obj8, null, str3, charSequence13 != null ? charSequence13 : charSequenceConcat, false, false);
                    profileSearchCell.setChecked(item.checked, false);
                    profileSearchCell.useSeparator = zHasDivider;
                    break;
                case 33:
                    view = view3;
                    DialogCell dialogCell = (DialogCell) view;
                    Object obj10 = item.object;
                    MessageObject messageObject4 = obj10 instanceof MessageObject ? (MessageObject) obj10 : null;
                    dialogCell.useSeparator = zHasDivider;
                    if (messageObject4 != null) {
                        dialogCell.setDialog(messageObject4.getDialogId(), messageObject4, messageObject4.messageOwner.date, false, false);
                    } else {
                        dialogCell.setDialog(0L, null, 0, false, false);
                    }
                    break;
                case 34:
                    view = view3;
                    ((FlickerLoadingView) view).setViewType(item.intValue);
                    break;
                case 35:
                case 36:
                case 41:
                    CheckBoxCell checkBoxCell = (CheckBoxCell) view3;
                    checkBoxCell.setPad(item.pad);
                    view = view3;
                    checkBoxCell.setText(item.text, "", item.checked, zHasDivider, checkBoxCell.itemId == item.id);
                    checkBoxCell.itemId = item.id;
                    checkBoxCell.setIcon(item.locked ? R.drawable.permission_locked : 0);
                    if (i4 == 36 || i4 == 41) {
                        boolean z10 = item.collapsed;
                        CharSequence charSequence14 = item.animatedText;
                        View.OnClickListener onClickListener = item.clickCallback;
                        CheckBoxCell.CollapseButton collapseButton = checkBoxCell.collapseButton;
                        if (collapseButton != null) {
                            AnimatedTextView animatedTextView3 = collapseButton.textView;
                            animatedTextView3.drawable.cancelAnimation();
                            animatedTextView3.setText(charSequence14);
                            View view6 = collapseButton.collapsedArrow;
                            view6.animate().cancel();
                            view6.animate().rotation(z10 ? 0.0f : 180.0f).setDuration(340L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).start();
                            if (onClickListener != null) {
                                collapseButton.setOnClickListener(onClickListener);
                            }
                        }
                    }
                    break;
                case 37:
                    CheckBoxCell checkBoxCell2 = (CheckBoxCell) view3;
                    checkBoxCell2.setPad(item.pad);
                    checkBoxCell2.setUserOrChat((TLObject) item.object);
                    checkBoxCell2.setChecked(item.checked, checkBoxCell2.itemId == item.id);
                    checkBoxCell2.itemId = item.id;
                    checkBoxCell2.setNeedDivider(zHasDivider);
                    break;
                case 39:
                case 40:
                    TextCheckCell2 textCheckCell2 = (TextCheckCell2) view3;
                    textCheckCell2.setTextAndCheck(item.text.toString(), item.checked, zHasDivider, textCheckCell2.id == item.id);
                    textCheckCell2.getCheckBox().setDrawIconType(item.intValue);
                    Switch checkBox = textCheckCell2.getCheckBox();
                    int i20 = item.intValue == 0 ? Theme.key_switchTrack : Theme.key_fill_RedNormal;
                    int i21 = Theme.key_switchTrackChecked;
                    int i22 = Theme.key_windowBackgroundWhite;
                    checkBox.trackColorKey = i20;
                    checkBox.trackCheckedColorKey = i21;
                    checkBox.thumbColorKey = i22;
                    checkBox.thumbCheckedColorKey = i22;
                    textCheckCell2.id = item.id;
                    textCheckCell2.setIcon(item.locked ? R.drawable.permission_locked : 0);
                    if (i4 == 40) {
                        if (!TextUtils.isEmpty(item.animatedText)) {
                            textCheckCell2.setCollapseArrow(new DialogsActivity$$ExternalSyntheticLambda8(4, item, textCheckCell2), item.animatedText.toString(), item.collapsed);
                        } else {
                            LinearLayout linearLayout = textCheckCell2.collapseViewContainer;
                            if (linearLayout != null) {
                                linearLayout.setVisibility(8);
                            }
                        }
                    }
                    break;
                case 42:
                    HeaderCell headerCell2 = (HeaderCell) view3;
                    headerCell2.setText(item.animatedText, headerCell2.id == item.id);
                    headerCell2.id = item.id;
                    break;
                case 43:
                    TextSettingsCell textSettingsCell = (TextSettingsCell) view3;
                    textSettingsCell.getValueBackupImageView().setImageDrawable(null);
                    CharSequence charSequence15 = item.text;
                    if (charSequence15 != null) {
                        CharSequence charSequence16 = item.subtext;
                        if (charSequence16 != null) {
                            textSettingsCell.setTextAndValue(charSequence15, charSequence16, false, zHasDivider);
                        } else {
                            textSettingsCell.setText(charSequence15, zHasDivider);
                        }
                    }
                    textSettingsCell.setIcon(item.iconResId);
                    break;
                case 44:
                    ((RadioButtonCell) view3).setTextAndValue(item.text.toString(), item.textValue.toString(), zHasDivider, item.checked);
                    break;
            }
            voIPFragment$$ExternalSyntheticLambda7 = item.bind;
            if (voIPFragment$$ExternalSyntheticLambda7 != null) {
                voIPFragment$$ExternalSyntheticLambda7.run(view);
            }
        }
        UItem.UItemFactory uItemFactoryFindFactory = UItem.findFactory(i4);
        if (uItemFactoryFindFactory != null) {
            uItemFactoryFindFactory.bindView(viewHolder.itemView, item, zHasDivider, this, recyclerListView instanceof UniversalRecyclerView ? (UniversalRecyclerView) recyclerListView : null);
        }
        view = view3;
        voIPFragment$$ExternalSyntheticLambda7 = item.bind;
        if (voIPFragment$$ExternalSyntheticLambda7 != null) {
            voIPFragment$$ExternalSyntheticLambda7.run(view);
        }
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View textCell;
        View notificationsCheckCell;
        View headerCell;
        View view;
        View headerCell2;
        boolean z = this.dialog;
        int i2 = z ? Theme.key_dialogBackground : Theme.key_windowBackgroundWhite;
        Context context = this.context;
        if (i < 10000) {
            int i3 = 6;
            Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
            switch (i) {
                case -4:
                case -1:
                    PhotoViewer.AnonymousClass19 anonymousClass19 = new PhotoViewer.AnonymousClass19(context, 20);
                    textCell = anonymousClass19;
                    if (i == -4) {
                        anonymousClass19.setTag(-33024);
                        textCell = anonymousClass19;
                    }
                    break;
                case -3:
                    FullscreenCustomFrameLayout fullscreenCustomFrameLayout = new FullscreenCustomFrameLayout(context);
                    fullscreenCustomFrameLayout.minusHeight = 0;
                    notificationsCheckCell = fullscreenCustomFrameLayout;
                    textCell = notificationsCheckCell;
                    break;
                case -2:
                    textCell = new PhotoViewer.AnonymousClass19(context, 21);
                    break;
                case 0:
                    if (!z) {
                        textCell = new HeaderCell(context, resourcesProvider);
                    } else {
                        headerCell = new HeaderCell(this.context, Theme.key_windowBackgroundWhiteBlueHeader, 21, 15, 0, false, false, this.resourcesProvider);
                        textCell = headerCell;
                    }
                    break;
                case 1:
                    headerCell2 = new HeaderCell(this.context, Theme.key_windowBackgroundWhiteBlackText, 17, 15, 0, false, false, this.resourcesProvider);
                    textCell = headerCell2;
                    break;
                case 2:
                    textCell = new TopViewCell(context, resourcesProvider);
                    break;
                case 3:
                    textCell = new TextCell(23, this.context, this.resourcesProvider, false, false);
                    break;
                case 4:
                case 9:
                    TextCheckCell textCheckCell = new TextCheckCell(21, context, resourcesProvider, false);
                    view = textCheckCell;
                    if (i == 9) {
                        textCheckCell.setDrawCheckRipple(true);
                        textCheckCell.setColors(Theme.key_windowBackgroundCheckText, Theme.key_switchTrackBlue, Theme.key_switchTrackBlueChecked, Theme.key_switchTrackBlueThumb, Theme.key_switchTrackBlueThumbChecked);
                        textCheckCell.setTypeface(AndroidUtilities.bold());
                        textCheckCell.setHeight(56);
                        view = textCheckCell;
                    }
                    textCell = view;
                    break;
                case 5:
                case 6:
                    notificationsCheckCell = new NotificationsCheckCell(this.context, 21, 60, i == 6, this.resourcesProvider);
                    textCell = notificationsCheckCell;
                    break;
                case 7:
                case 8:
                default:
                    textCell = new TextInfoPrivacyCell(context, 24, resourcesProvider);
                    break;
                case 10:
                    textCell = new DialogRadioCell(context);
                    break;
                case 11:
                case 12:
                    UserCell userCell = new UserCell(6, i == 12 ? 3 : 0, this.context, null, false, false);
                    userCell.setSelfAsSavedMessages(true);
                    headerCell = userCell;
                    textCell = headerCell;
                    break;
                case 13:
                    headerCell2 = new UserCell(6, 0, this.context, null, false, true);
                    textCell = headerCell2;
                    break;
                case 14:
                    textCell = new SlideChooseView(context, resourcesProvider);
                    break;
                case 15:
                    textCell = new SlideIntChooseView(context, resourcesProvider);
                    break;
                case 16:
                    textCell = new QuickRepliesActivity.QuickReplyView(context, resourcesProvider, this.onReordered != null);
                    break;
                case 17:
                    textCell = new QuickRepliesActivity.LargeQuickReplyView(context, resourcesProvider);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    if (this.chartSharedUI == null) {
                        this.chartSharedUI = new BaseChartView.SharedUiComponents(null);
                    }
                    textCell = new StatisticActivity.UniversalChartCell(this.context, this.currentAccount, i - 18, this.chartSharedUI, this.classGuid);
                    break;
                case 24:
                    textCell = new ChannelMonetizationLayout.ProceedOverviewCell(context, resourcesProvider);
                    break;
                case 25:
                    textCell = new ChannelMonetizationLayout.TransactionCell(context, resourcesProvider);
                    break;
                case 26:
                    HeaderCell headerCell3 = new HeaderCell(this.context, Theme.key_windowBackgroundWhiteBlackText, 23, 20, 0, false, false, this.resourcesProvider);
                    headerCell3.setTextSize(20.0f);
                    headerCell2 = headerCell3;
                    textCell = headerCell2;
                    break;
                case 27:
                    StoryPrivacyBottomSheet.UserCell userCell2 = new StoryPrivacyBottomSheet.UserCell(context, resourcesProvider);
                    userCell2.setIsSendAs(false, false);
                    textCell = userCell2;
                    break;
                case 28:
                    SpaceView spaceView = new SpaceView(context);
                    spaceView.setTag(-33024);
                    textCell = spaceView;
                    break;
                case 29:
                    textCell = new BusinessLinksActivity.BusinessLinkView(context, resourcesProvider);
                    break;
                case 30:
                    textCell = new TextRightIconCell(context, resourcesProvider);
                    break;
                case 31:
                    RecyclerListView recyclerListView = this.listView;
                    if (recyclerListView != null && recyclerListView.hasSections()) {
                        GraySectionCell graySectionCell = new GraySectionCell(context, 28, resourcesProvider);
                        graySectionCell.setNoBackground(true);
                        textCell = graySectionCell;
                    } else {
                        textCell = new GraySectionCell(context, 16, resourcesProvider);
                    }
                    break;
                case 32:
                    textCell = new ProfileSearchCell(context, null);
                    break;
                case 33:
                    headerCell2 = new DialogCell(null, this.context, true, UserConfig.selectedAccount, null);
                    textCell = headerCell2;
                    break;
                case 34:
                    FlickerLoadingView flickerLoadingView = new FlickerLoadingView(context, resourcesProvider);
                    flickerLoadingView.setIsSingleCell(true);
                    textCell = flickerLoadingView;
                    break;
                case 35:
                case 36:
                case 37:
                case 41:
                    if (i == 35) {
                        i3 = 4;
                    } else if (i != 36) {
                        i3 = i == 37 ? 7 : i == 41 ? 8 : 0;
                    }
                    CheckBoxCell checkBoxCell = new CheckBoxCell(this.context, i3, 21, true, this.resourcesProvider);
                    checkBoxCell.getCheckBoxRound().checkBoxBase.setColor(Theme.key_switch2TrackChecked, Theme.key_radioBackground, Theme.key_checkboxCheck);
                    view = checkBoxCell;
                    textCell = view;
                    break;
                case 38:
                    textCell = new CollapseTextCell(context, resourcesProvider);
                    break;
                case 39:
                case 40:
                    textCell = new TextCheckCell2(context);
                    break;
                case 42:
                    headerCell2 = new HeaderCell(this.context, Theme.key_windowBackgroundWhiteBlueHeader, 21, 15, 0, false, true, this.resourcesProvider);
                    textCell = headerCell2;
                    break;
                case 43:
                    textCell = new TextSettingsCell(context, 0, resourcesProvider);
                    break;
                case 44:
                    textCell = new RadioButtonCell(context, false);
                    break;
            }
        } else {
            UItem.UItemFactory uItemFactoryFindFactory = UItem.findFactory(i);
            textCell = uItemFactoryFindFactory != null ? uItemFactoryFindFactory.createView(this.context, this.listView, this.currentAccount, this.classGuid, this.resourcesProvider) : new View(context);
        }
        if (this.applyBackground) {
            if (i < 10000) {
                switch (i) {
                    case -3:
                    case 0:
                    case 1:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                        textCell.setBackgroundColor(getThemedColor(i2));
                        break;
                }
            } else {
                textCell.setBackgroundColor(getThemedColor(i2));
            }
        }
        return new RecyclerListView.Holder(textCell);
    }

    @Override
    public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        updateReorder(viewHolder, this.allowReorder);
        updateColors(viewHolder);
    }

    public final void reorderSectionEnd() {
        Section section = this.currentReorderSection;
        if (section != null) {
            section.end = Math.max(0, this.items.size() - 1);
        }
    }

    public final int reorderSectionStart() {
        Section section = new Section();
        this.currentReorderSection = section;
        section.start = this.items.size();
        Section section2 = this.currentReorderSection;
        section2.end = -1;
        ArrayList arrayList = this.reorderSections;
        arrayList.add(section2);
        return arrayList.size() - 1;
    }

    public void update(boolean z) {
        RecyclerListView recyclerListView = this.listView;
        if (recyclerListView == null || !recyclerListView.isComputingLayout()) {
            updateInternal(z);
        } else {
            recyclerListView.post(new FileLoader$$ExternalSyntheticLambda1(28, this, z));
        }
    }

    public final void updateColors(RecyclerView.ViewHolder viewHolder) {
        View view = viewHolder.itemView;
        if (view instanceof Theme.Colorable) {
            ((Theme.Colorable) view).updateColors$1();
            int i = viewHolder.mItemViewType;
            if (this.applyBackground) {
                if (i < 10000) {
                    switch (i) {
                    }
                }
                view.setBackgroundColor(getThemedColor(this.dialog ? Theme.key_dialogBackground : Theme.key_windowBackgroundWhite));
            }
        }
    }

    public final void updateInternal(boolean z) {
        RecyclerListView recyclerListView = this.listView;
        if (recyclerListView == null || !recyclerListView.isComputingLayout()) {
            ArrayList arrayList = this.oldItems;
            arrayList.clear();
            ArrayList arrayList2 = this.items;
            arrayList.addAll(arrayList2);
            arrayList2.clear();
            this.currentWhiteSection = null;
            this.whiteSections.clear();
            this.reorderSections.clear();
            Utilities.Callback2 callback2 = this.fillItems;
            if (callback2 != null) {
                callback2.run(arrayList2, this);
                updateReorderSections();
                if (z) {
                    setItems(arrayList, arrayList2);
                } else {
                    this.mObservable.notifyChanged();
                }
            }
        }
    }

    public final void updateReorder(RecyclerView.ViewHolder viewHolder, boolean z) {
        if (viewHolder == null) {
            return;
        }
        int i = viewHolder.mItemViewType;
        View view = viewHolder.itemView;
        if (i < 10000) {
            if (i != 16) {
                return;
            }
            ((QuickRepliesActivity.QuickReplyView) view).setReorder(z);
        } else {
            UItem.UItemFactory uItemFactoryFindFactory = UItem.findFactory(i);
            if (uItemFactoryFindFactory != null) {
                uItemFactoryFindFactory.attachedView(this.listView, view, getItem(viewHolder.getAdapterPosition()));
            }
        }
    }

    public final void updateReorderSections() {
        RecyclerListView recyclerListView = this.listView;
        if (recyclerListView == null) {
            return;
        }
        ArrayList arrayList = recyclerListView.forcedSections;
        if (arrayList == null) {
            recyclerListView.forcedSections = new ArrayList();
        } else {
            arrayList.clear();
        }
        ArrayList arrayList2 = this.whiteSections;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            Section section = (Section) obj;
            recyclerListView.forcedSections.add(Long.valueOf(AndroidUtilities.pack(section.start, section.end)));
        }
    }

    public final void updateWithoutNotify() {
        ArrayList arrayList = this.oldItems;
        arrayList.clear();
        ArrayList arrayList2 = this.items;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        this.whiteSections.clear();
        this.reorderSections.clear();
        Utilities.Callback2 callback2 = this.fillItems;
        if (callback2 != null) {
            callback2.run(arrayList2, this);
        }
        updateReorderSections();
    }

    public final void whiteSectionEnd() {
        Section section = this.currentWhiteSection;
        if (section != null) {
            section.end = Math.max(0, (this.items.size() + this.itemsOffset) - 1);
            Section section2 = this.currentWhiteSection;
            if (section2.start == section2.end) {
                this.whiteSections.remove(section2);
            }
            this.currentWhiteSection = null;
        }
    }

    public final void whiteSectionStart() {
        Section section = new Section();
        this.currentWhiteSection = section;
        section.start = this.items.size() + this.itemsOffset;
        Section section2 = this.currentWhiteSection;
        section2.end = -1;
        this.whiteSections.add(section2);
    }
}
