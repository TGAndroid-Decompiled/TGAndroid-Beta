package org.telegram.ui.Components;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.mlkit_vision_common.zzlb;
import java.util.ArrayList;
import me.vkryl.android.animator.FactorAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CompoundEmoji;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.EmojiData;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.Components.EmojiView.AnonymousClass31;
import org.telegram.ui.Components.chat.ViewPositionWatcher;

public final class EmojiView$$ExternalSyntheticLambda2 implements ViewPositionWatcher.OnChangedListener, RecyclerListView.OnItemLongClickListener, ScrollSlidingTabStrip.ScrollSlidingTabStripDelegate, FactorAnimator.Target {
    public final int $r8$classId;
    public final EmojiView f$0;

    public EmojiView$$ExternalSyntheticLambda2(EmojiView emojiView, int i) {
        this.$r8$classId = i;
        this.f$0 = emojiView;
    }

    @Override
    public void onFactorChangeFinished(float f, int i) {
    }

    @Override
    public void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
        this.f$0.updateBottomTabContainerPosition();
    }

    @Override
    public boolean onItemClick(int i, View view) {
        String str;
        int iDp;
        EmojiView emojiView = this.f$0;
        if (!(view instanceof EmojiView.ImageViewEmoji)) {
            return false;
        }
        EmojiView.ImageViewEmoji imageViewEmoji = (EmojiView.ImageViewEmoji) view;
        boolean z = imageViewEmoji.isRecent;
        EmojiView.AnonymousClass5 anonymousClass5 = emojiView.emojiGridView;
        if (z) {
            RecyclerView.ViewHolder viewHolderFindContainingViewHolder = anonymousClass5.findContainingViewHolder(view);
            if (viewHolderFindContainingViewHolder != null && viewHolderFindContainingViewHolder.getAdapterPosition() <= emojiView.getRecentEmoji().size()) {
                emojiView.delegate.onClearEmojiRecent();
            }
            anonymousClass5.clearTouchesFor(imageViewEmoji);
            return true;
        }
        if (imageViewEmoji.getSpan() != null || (str = (String) imageViewEmoji.getTag()) == null) {
            return false;
        }
        String strReplace = str.replace("🏻", "").replace("🏼", "").replace("🏽", "").replace("🏾", "").replace("🏿", "");
        String str2 = !imageViewEmoji.isRecent ? Emoji.emojiColor.get(strReplace) : null;
        boolean zIsCompound = CompoundEmoji.isCompound(strReplace);
        if (!zIsCompound && !EmojiData.emojiColoredMap.contains(strReplace)) {
            return false;
        }
        emojiView.emojiTouchedView = imageViewEmoji;
        emojiView.emojiTouchedX = emojiView.emojiLastX;
        emojiView.emojiTouchedY = emojiView.emojiLastY;
        EmojiColorPickerWindow emojiColorPickerWindow = emojiView.colorPickerView;
        if (zIsCompound) {
            strReplace = EmojiView.addColorToCode(strReplace, str2);
        } else {
            int iIndexOf = CompoundEmoji.skinTones.indexOf(str2) + 1;
            EmojiColorPickerWindow.EmojiColorPickerView emojiColorPickerView = emojiColorPickerWindow.pickerView;
            int[] iArr = emojiColorPickerView.selection;
            if (iArr[0] != iIndexOf) {
                iArr[0] = iIndexOf;
                emojiColorPickerView.invalidate();
            }
        }
        emojiColorPickerWindow.getClass();
        boolean z2 = CompoundEmoji.getCompoundEmojiDrawable(strReplace) != null;
        emojiColorPickerWindow.isCompound = z2;
        EmojiColorPickerWindow.EmojiColorPickerView emojiColorPickerView2 = emojiColorPickerWindow.pickerView;
        emojiColorPickerView2.isCompound = z2;
        emojiColorPickerView2.currentEmoji = strReplace;
        int[] iArr2 = emojiColorPickerView2.selection;
        Drawable[] drawableArr = emojiColorPickerView2.drawables;
        if (z2) {
            drawableArr[0] = CompoundEmoji.getCompoundEmojiDrawable(strReplace, -1, -1);
            drawableArr[1] = CompoundEmoji.getCompoundEmojiDrawable(emojiColorPickerView2.currentEmoji, 0, -2);
            drawableArr[2] = CompoundEmoji.getCompoundEmojiDrawable(emojiColorPickerView2.currentEmoji, 1, -2);
            drawableArr[3] = CompoundEmoji.getCompoundEmojiDrawable(emojiColorPickerView2.currentEmoji, 2, -2);
            drawableArr[4] = CompoundEmoji.getCompoundEmojiDrawable(emojiColorPickerView2.currentEmoji, 3, -2);
            drawableArr[5] = CompoundEmoji.getCompoundEmojiDrawable(emojiColorPickerView2.currentEmoji, 4, -2);
            drawableArr[6] = CompoundEmoji.getCompoundEmojiDrawable(emojiColorPickerView2.currentEmoji, -2, 0);
            drawableArr[7] = CompoundEmoji.getCompoundEmojiDrawable(emojiColorPickerView2.currentEmoji, -2, 1);
            drawableArr[8] = CompoundEmoji.getCompoundEmojiDrawable(emojiColorPickerView2.currentEmoji, -2, 2);
            drawableArr[9] = CompoundEmoji.getCompoundEmojiDrawable(emojiColorPickerView2.currentEmoji, -2, 3);
            drawableArr[10] = CompoundEmoji.getCompoundEmojiDrawable(emojiColorPickerView2.currentEmoji, -2, 4);
            Pair<Integer, Integer> pairIsHandshake = CompoundEmoji.isHandshake(strReplace);
            if (pairIsHandshake != null) {
                int iIntValue = ((Integer) pairIsHandshake.first).intValue();
                if (iArr2[0] != iIntValue) {
                    iArr2[0] = iIntValue;
                    emojiColorPickerView2.invalidate();
                }
                int iIntValue2 = ((Integer) pairIsHandshake.second).intValue();
                if (iArr2[1] != iIntValue2) {
                    iArr2[1] = iIntValue2;
                    emojiColorPickerView2.invalidate();
                }
                emojiColorPickerView2.both = iArr2[0] == iArr2[1];
            }
            emojiColorPickerView2.ignore = true;
        } else {
            int i2 = 0;
            while (i2 < 6) {
                drawableArr[i2] = Emoji.getEmojiBigDrawable(i2 != 0 ? EmojiView.addColorToCode(strReplace, CompoundEmoji.skinTones.get(i2 - 1)) : strReplace);
                i2++;
            }
        }
        emojiColorPickerView2.invalidate();
        int i3 = emojiColorPickerWindow.emojiSize;
        int i4 = i3 * 6;
        emojiColorPickerWindow.setWidth(AndroidUtilities.dp((emojiColorPickerWindow.isCompound ? 3 : 0) + 30) + i4);
        emojiColorPickerWindow.setHeight(((emojiColorPickerWindow.isCompound ? 2 : 1) * i3) + AndroidUtilities.dp(emojiColorPickerWindow.isCompound ? 11.66f : 15.0f));
        int iDp2 = AndroidUtilities.dp((emojiColorPickerWindow.isCompound ? 3 : 0) + 30) + i4;
        int iDp3 = ((emojiColorPickerWindow.isCompound ? 2 : 1) * i3) + AndroidUtilities.dp(emojiColorPickerWindow.isCompound ? 11.66f : 15.0f);
        int[] iArr3 = emojiView.location;
        imageViewEmoji.getLocationOnScreen(iArr3);
        boolean z3 = emojiColorPickerWindow.isCompound;
        int i5 = emojiView.emojiSize;
        if (z3) {
            iDp = 0;
        } else {
            int i6 = iArr2[0];
            iDp = AndroidUtilities.dp((i6 * 4) - (AndroidUtilities.isTablet() ? 5 : 1)) + (i6 * i5);
        }
        if (iArr3[0] - iDp < AndroidUtilities.dp(5.0f)) {
            iDp = zzlb.m(iArr3[0] - iDp, 5.0f, iDp);
        } else if ((iArr3[0] - iDp) + iDp2 > AndroidUtilities.displaySize.x - AndroidUtilities.dp(5.0f)) {
            iDp += ((iArr3[0] - iDp) + iDp2) - (AndroidUtilities.displaySize.x - AndroidUtilities.dp(5.0f));
        }
        int i7 = -iDp;
        int top = imageViewEmoji.getTop() < 0 ? imageViewEmoji.getTop() : 0;
        emojiColorPickerView2.setArrowX((AndroidUtilities.dp(AndroidUtilities.isTablet() ? 30.0f : 22.0f) - i7) + ((int) AndroidUtilities.dpf2(0.5f)));
        emojiColorPickerWindow.setFocusable(true);
        emojiColorPickerWindow.showAsDropDown(view, i7, (((view.getMeasuredHeight() - i5) / 2) + ((-view.getMeasuredHeight()) - iDp3)) - top);
        emojiView.pager.requestDisallowInterceptTouchEvent(true);
        anonymousClass5.hideSelector(true);
        anonymousClass5.clearTouchesFor(imageViewEmoji);
        return true;
    }

    @Override
    public void onPageSelected(int i) {
        int i2;
        EmojiView.SearchField.AnonymousClass5 anonymousClass5;
        switch (this.$r8$classId) {
            case 3:
                EmojiView emojiView = this.f$0;
                int i3 = emojiView.gifTrendingTabNum;
                EmojiView.GifAdapter gifAdapter = emojiView.gifAdapter;
                if (i != i3 || !gifAdapter.results.isEmpty()) {
                    emojiView.gifGridView.stopScroll();
                    emojiView.gifTabs.onPageScrolled(i, 0);
                    int i4 = emojiView.gifRecentTabNum;
                    int i5 = emojiView.currentAccount;
                    EmojiView.GifSearchPreloader gifSearchPreloader = emojiView.gifSearchPreloader;
                    if (i == i4 || i == emojiView.gifTrendingTabNum) {
                        emojiView.gifSearchField.searchEditText.setText("");
                        int i6 = emojiView.gifTrendingTabNum;
                        EmojiView.GifLayoutManager gifLayoutManager = emojiView.gifLayoutManager;
                        if (i != i6 || (i2 = gifAdapter.trendingSectionItem) < 1) {
                            EmojiView.EmojiViewDelegate emojiViewDelegate = emojiView.delegate;
                            gifLayoutManager.scrollToPositionWithOffset((emojiViewDelegate == null || !emojiViewDelegate.isExpanded()) ? 1 : 0, 0, gifLayoutManager.mShouldReverseLayout);
                        } else {
                            gifLayoutManager.scrollToPositionWithOffset(i2, -AndroidUtilities.dp(4.0f), gifLayoutManager.mShouldReverseLayout);
                        }
                        if (i == emojiView.gifTrendingTabNum) {
                            ArrayList<String> arrayList = MessagesController.getInstance(i5).gifSearchEmojies;
                            if (!arrayList.isEmpty()) {
                                gifSearchPreloader.preload(arrayList.get(0), true);
                            }
                        }
                    } else {
                        ArrayList<String> arrayList2 = MessagesController.getInstance(i5).gifSearchEmojies;
                        String str = arrayList2.get(i - emojiView.gifFirstEmojiTabNum);
                        EmojiView.GifAdapter gifAdapter2 = emojiView.gifSearchAdapter;
                        if (gifAdapter2.lastSearchIsEmoji && TextUtils.equals(gifAdapter2.lastSearchImageString, str)) {
                            EmojiView.GifLayoutManager gifLayoutManager2 = EmojiView.this.gifLayoutManager;
                            gifLayoutManager2.scrollToPositionWithOffset(0, 0, gifLayoutManager2.mShouldReverseLayout);
                        } else {
                            gifAdapter2.search(str, "", true, true, true);
                        }
                        int i7 = i - emojiView.gifFirstEmojiTabNum;
                        if (i7 > 0) {
                            gifSearchPreloader.preload(arrayList2.get(i7 - 1), true);
                        }
                        if (i - emojiView.gifFirstEmojiTabNum < arrayList2.size() - 1) {
                            gifSearchPreloader.preload(arrayList2.get((i - emojiView.gifFirstEmojiTabNum) + 1), true);
                        }
                    }
                    emojiView.resetTabsY(2);
                }
                break;
            default:
                EmojiView emojiView2 = this.f$0;
                if (!emojiView2.firstTabUpdate) {
                    if (i == emojiView2.trendingTabNum) {
                        emojiView2.delegate.showTrendingStickersAlert(new TrendingStickersLayout(emojiView2.getContext(), emojiView2.new AnonymousClass31(), emojiView2.primaryInstallingStickerSets, emojiView2.installingStickerSets, emojiView2.removingStickerSets, null, emojiView2.resourcesProvider));
                        break;
                    } else {
                        EmojiView.AnonymousClass22 anonymousClass22 = emojiView2.stickersSearchField;
                        if (anonymousClass22 != null && (anonymousClass5 = anonymousClass22.categoriesListView) != null && anonymousClass5.getSelectedCategory() != null) {
                            anonymousClass22.search(null, false);
                            anonymousClass5.selectCategory((StickerCategoriesListView.EmojiCategory) null);
                        }
                        int i8 = emojiView2.recentTabNum;
                        EmojiView.AnonymousClass23 anonymousClass23 = emojiView2.stickersTab;
                        EmojiView.StickersGridAdapter stickersGridAdapter = emojiView2.stickersGridAdapter;
                        EmojiView.AnonymousClass19 anonymousClass19 = emojiView2.stickersGridView;
                        if (i == i8) {
                            anonymousClass19.stopScroll();
                            Integer num = (Integer) stickersGridAdapter.packStartPosition.get("recent");
                            emojiView2.scrollStickersToPosition(num != null ? num.intValue() : -1, 0);
                            emojiView2.resetTabsY(0);
                            int i9 = emojiView2.recentTabNum;
                            anonymousClass23.onPageScrolled(i9, i9 > 0 ? i9 : emojiView2.stickersTabOffset);
                            break;
                        } else if (i == emojiView2.favTabNum) {
                            anonymousClass19.stopScroll();
                            Integer num2 = (Integer) stickersGridAdapter.packStartPosition.get("fav");
                            emojiView2.scrollStickersToPosition(num2 != null ? num2.intValue() : -1, 0);
                            emojiView2.resetTabsY(0);
                            int i10 = emojiView2.favTabNum;
                            anonymousClass23.onPageScrolled(i10, i10 > 0 ? i10 : emojiView2.stickersTabOffset);
                            break;
                        } else if (i == emojiView2.premiumTabNum) {
                            anonymousClass19.stopScroll();
                            Integer num3 = (Integer) stickersGridAdapter.packStartPosition.get("premium");
                            emojiView2.scrollStickersToPosition(num3 != null ? num3.intValue() : -1, 0);
                            emojiView2.resetTabsY(0);
                            int i11 = emojiView2.premiumTabNum;
                            anonymousClass23.onPageScrolled(i11, i11 > 0 ? i11 : emojiView2.stickersTabOffset);
                            break;
                        } else {
                            int size = i - emojiView2.stickersTabOffset;
                            ArrayList arrayList3 = emojiView2.stickerSets;
                            if (size < arrayList3.size()) {
                                if (size >= arrayList3.size()) {
                                    size = arrayList3.size() - 1;
                                }
                                emojiView2.firstStickersAttach = false;
                                anonymousClass19.stopScroll();
                                Integer num4 = (Integer) stickersGridAdapter.packStartPosition.get(arrayList3.get(size));
                                emojiView2.scrollStickersToPosition(num4 != null ? num4.intValue() : -1, 0);
                                emojiView2.resetTabsY(0);
                                emojiView2.checkScroll$1(0);
                                int i12 = emojiView2.favTabNum;
                                if (i12 <= 0 && (i12 = emojiView2.recentTabNum) <= 0) {
                                    i12 = emojiView2.stickersTabOffset;
                                }
                                anonymousClass23.onPageScrolled(i, i12);
                                emojiView2.expandStickersByDragg = false;
                                emojiView2.updateStickerTabsPosition();
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }

    @Override
    public void onPositionChanged(View view, RectF rectF) {
        this.f$0.invalidateBlurCaptures();
    }
}
