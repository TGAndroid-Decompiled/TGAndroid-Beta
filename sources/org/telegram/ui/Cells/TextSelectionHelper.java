package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.NoCopySpan;
import android.text.SpanWatcher;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextWatcher;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.Magnifier;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.internal.mlkit_language_id_common.zzin;
import com.google.android.gms.internal.mlkit_vision_common.zzkb;
import com.google.zxing.common.detector.MathUtils;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.BottomSheet$$ExternalSyntheticLambda3;
import org.telegram.ui.ActionBar.FloatingActionMode;
import org.telegram.ui.ActionBar.FloatingToolbar;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.Theme$$ExternalSyntheticApiModelOutline1;
import org.telegram.ui.ArticleViewer;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda14;
import org.telegram.ui.Business.ChatbotSheet$$ExternalSyntheticLambda0;
import org.telegram.ui.CastSync$$ExternalSyntheticApiModelOutline0;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.CornerPath;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.RestrictedLanguagesSelectActivity;
import org.telegram.ui.iv.RichTableCell;
import org.telegram.ui.iv.TableModel$$ExternalSyntheticLambda0;

public abstract class TextSelectionHelper {
    private static final int TRANSLATE = 3;
    private ActionMode actionMode;
    protected boolean actionsIsShowing;
    boolean allowDiscard;
    public boolean allowScrollPrentRelative;
    protected Callback callback;
    protected int capturedX;
    protected int capturedY;
    protected float cornerRadius;
    private TextView deleteView;
    private RectF endArea;
    protected float enterProgress;
    private ValueAnimator handleViewAnimator;
    protected float handleViewProgress;
    private final Runnable hideActionsRunnable;
    private Interpolator interpolator;
    private boolean invalidateParent;
    private boolean isOneTouch;
    int keyboardSize;
    private int lastX;
    private int lastY;
    protected final LayoutBlock layoutBlock;
    private int longpressDelay;
    private Magnifier magnifier;
    private float magnifierDx;
    private float magnifierDy;
    private float magnifierX;
    private float magnifierXanimated;
    private float magnifierY;
    private float magnifierYanimated;
    protected SelectableView maybeSelectedView;
    protected int maybeTextX;
    protected int maybeTextY;
    protected boolean movingDirectionSettling;
    protected boolean movingHandle;
    protected boolean movingHandleStart;
    float movingOffsetX;
    float movingOffsetY;
    protected boolean multiselect;
    private OnTranslateListener onTranslateListener;
    private boolean parentIsScrolling;
    protected NestedScrollView parentNestedScrollView;
    protected RecyclerListView parentRecyclerView;
    protected ViewGroup parentView;
    protected PathWithSavedBottom path;
    private ActionBarPopupWindow.ActionBarPopupWindowLayout popupLayout;
    private Rect popupRect;
    private ActionBarPopupWindow popupWindow;
    protected Theme.ResourcesProvider resourcesProvider;
    private boolean scrollDown;
    private Runnable scrollRunnable;
    private boolean scrolling;
    protected Integer selectedCellEditDate;
    protected int selectedCellId;
    protected SelectableView selectedView;
    public int selectionEnd;
    protected Paint selectionHandlePaint;
    protected Path selectionHandlePath;
    protected Paint selectionPaint;
    protected CornerPath selectionPath;
    protected PathCopyTo selectionPathMirror;
    public int selectionStart;
    protected boolean showActionsAsPopupAlways;
    protected final Runnable showActionsRunnable;
    private boolean snap;
    private RectF startArea;
    final Runnable startSelectionRunnable;
    private final ScalablePath tempPath2;
    protected final Rect textArea;
    private final ActionMode.Callback textSelectActionCallback;
    protected TextSelectionOverlay textSelectionOverlay;
    protected int textX;
    protected int textY;
    protected int[] tmpCoord = new int[2];
    private int topOffset;
    private int touchSlop;
    private boolean tryCapture;
    public boolean useMovingOffset;

    public final class AnonymousClass4 implements ActionMode.Callback {
        public String translateFromLanguage = null;

        public AnonymousClass4() {
        }

        @Override
        public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            CharSequence text;
            TextSelectionHelper textSelectionHelper = TextSelectionHelper.this;
            if (textSelectionHelper.isInSelectionMode()) {
                int itemId = menuItem.getItemId();
                if (itemId == 16908321) {
                    TextSelectionHelper.access$2600(textSelectionHelper);
                    return true;
                }
                if (itemId != 16908319) {
                    if (itemId == 3) {
                        if (textSelectionHelper.onTranslateListener != null) {
                            ((ArticleViewer$$ExternalSyntheticLambda14) textSelectionHelper.onTranslateListener).f$0.lambda$setParentActivity$45(textSelectionHelper.getSelectedText(), this.translateFromLanguage, LocaleController.getInstance().getCurrentLocale().getLanguage(), new ChatbotSheet$$ExternalSyntheticLambda0(this, 13));
                        }
                        textSelectionHelper.hideActions();
                        return true;
                    }
                    if (itemId == R.id.menu_quote) {
                        TextSelectionHelper.access$2700(textSelectionHelper);
                        textSelectionHelper.hideActions();
                        return true;
                    }
                    if (itemId == 16908320) {
                        textSelectionHelper.onCutAction();
                        textSelectionHelper.hideActions();
                        return true;
                    }
                    if (itemId != 16908322) {
                        textSelectionHelper.clear();
                        return true;
                    }
                    textSelectionHelper.onPasteAction();
                    textSelectionHelper.hideActions();
                    return true;
                }
                if (!textSelectionHelper.onSelectAllOverride() && (text = textSelectionHelper.getText(textSelectionHelper.selectedView, false)) != null) {
                    textSelectionHelper.selectionStart = 0;
                    textSelectionHelper.selectionEnd = text.length();
                    textSelectionHelper.hideActions();
                    textSelectionHelper.invalidate();
                    AndroidUtilities.cancelRunOnUIThread(textSelectionHelper.showActionsRunnable);
                    AndroidUtilities.runOnUIThread(textSelectionHelper.showActionsRunnable);
                    return true;
                }
            }
            return true;
        }

        @Override
        public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            menu.add(0, 16908321, 0, 17039361);
            menu.add(0, R.id.menu_quote, 1, LocaleController.getString(R.string.Quote));
            menu.add(0, 3, 2, LocaleController.getString(R.string.TranslateMessage));
            menu.add(0, 16908320, 3, 17039363);
            menu.add(0, 16908322, 4, 17039371);
            menu.add(0, 16908319, 5, 17039373);
            return true;
        }

        @Override
        public final void onDestroyActionMode(ActionMode actionMode) {
            if (Build.VERSION.SDK_INT < 23) {
                TextSelectionHelper.this.clear();
            }
        }

        @Override
        public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            SelectableView selectableView;
            MenuItem menuItemFindItem = menu.findItem(R.id.menu_quote);
            TextSelectionHelper textSelectionHelper = TextSelectionHelper.this;
            if (menuItemFindItem != null) {
                menuItemFindItem.setVisible(textSelectionHelper.canShowQuote());
            }
            MenuItem menuItemFindItem2 = menu.findItem(16908321);
            if (menuItemFindItem2 != null) {
                menuItemFindItem2.setVisible(textSelectionHelper.canCopy());
            }
            MenuItem menuItemFindItem3 = menu.findItem(16908319);
            boolean z = false;
            if (menuItemFindItem3 != null && (selectableView = textSelectionHelper.selectedView) != null) {
                CharSequence text = textSelectionHelper.getText(selectableView, false);
                if (!textSelectionHelper.canCopy()) {
                    menuItemFindItem3.setVisible(false);
                } else if (textSelectionHelper.forceShowSelectAll()) {
                    menuItemFindItem3.setVisible(true);
                } else if (textSelectionHelper.multiselect || (textSelectionHelper.selectionStart <= 0 && textSelectionHelper.selectionEnd >= text.length() - 1)) {
                    menuItemFindItem3.setVisible(false);
                } else {
                    menuItemFindItem3.setVisible(true);
                }
            }
            MenuItem menuItemFindItem4 = menu.findItem(16908320);
            if (menuItemFindItem4 != null) {
                menuItemFindItem4.setVisible(textSelectionHelper.canCut());
            }
            MenuItem menuItemFindItem5 = menu.findItem(16908322);
            if (menuItemFindItem5 != null) {
                if (textSelectionHelper.canPaste() && textSelectionHelper.clipboardHasContent()) {
                    z = true;
                }
                menuItemFindItem5.setVisible(z);
            }
            if (textSelectionHelper.onTranslateListener != null && LanguageDetector.hasSupport() && textSelectionHelper.getSelectedText() != null) {
                LanguageDetector.detectLanguage(textSelectionHelper.getSelectedText().toString(), new TextSelectionHelper$4$$ExternalSyntheticLambda1(this, menu), new TextSelectionHelper$4$$ExternalSyntheticLambda1(this, menu));
                return true;
            }
            this.translateFromLanguage = null;
            updateTranslateButton(menu);
            return true;
        }

        public final void updateTranslateButton(Menu menu) {
            LocaleController.getInstance().getCurrentLocale().getLanguage();
            MenuItem menuItemFindItem = menu.findItem(3);
            if (menuItemFindItem == null) {
                return;
            }
            menuItemFindItem.setVisible((TextSelectionHelper.this.onTranslateListener == null || ((this.translateFromLanguage == null || RestrictedLanguagesSelectActivity.getRestrictedLanguages().contains(this.translateFromLanguage)) && LanguageDetector.hasSupport())) ? false : true);
        }
    }

    public interface ArticleSelectableView extends SelectableView {
        void fillTextLayoutBlocks(ArrayList arrayList);
    }

    public class ArticleTextSelectionHelper extends TextSelectionHelper {
        public int endViewOffset;
        public LinearLayoutManager layoutManager;
        public boolean startPeek;
        public int startViewOffset;
        public int startViewPosition = -1;
        public int startViewChildPosition = -1;
        public int endViewPosition = -1;
        public int endViewChildPosition = -1;
        public int maybeTextIndex = -1;
        public final SparseArray textByPosition = new SparseArray();
        public final SparseArray prefixTextByPosition = new SparseArray();
        public final SparseIntArray childCountByPosition = new SparseIntArray();
        public final ArrayList arrayList = new ArrayList();
        public int anchorViewPosition = -1;
        public int anchorOffset = -1;
        public int anchorChildPosition = 0;

        public ArticleTextSelectionHelper() {
            this.multiselect = true;
            this.showActionsAsPopupAlways = true;
        }

        public static CharSequence detachedText(CharSequence charSequence) {
            if (charSequence == null) {
                return "";
            }
            if (!(charSequence instanceof Spanned)) {
                return charSequence.toString();
            }
            Spanned spanned = (Spanned) charSequence;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence.toString());
            for (Object obj : spanned.getSpans(0, spanned.length(), Object.class)) {
                if (!(obj instanceof TextWatcher) && !(obj instanceof SpanWatcher) && !(obj instanceof NoCopySpan)) {
                    int spanStart = spanned.getSpanStart(obj);
                    int spanEnd = spanned.getSpanEnd(obj);
                    if (spanStart >= 0 && spanEnd >= spanStart && spanStart <= spannableStringBuilder.length()) {
                        spannableStringBuilder.setSpan(obj, spanStart, Math.min(spanEnd, spannableStringBuilder.length()), spanned.getSpanFlags(obj));
                    }
                }
            }
            return spannableStringBuilder;
        }

        public final void cacheText(int i, String str) {
            this.textByPosition.put(i, detachedText(str));
            this.prefixTextByPosition.remove(i);
            SparseIntArray sparseIntArray = this.childCountByPosition;
            sparseIntArray.put(i, Math.max(1, sparseIntArray.get(i)));
        }

        @Override
        public final boolean canSelect(int i) {
            if (this.startViewPosition == this.endViewPosition && this.startViewChildPosition == this.endViewChildPosition) {
                return super.canSelect(i);
            }
            return true;
        }

        @Override
        public final boolean canShowActions() {
            LinearLayoutManager linearLayoutManager = this.layoutManager;
            if (linearLayoutManager == null) {
                return true;
            }
            int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
            int iFindLastVisibleItemPosition = this.layoutManager.findLastVisibleItemPosition();
            int i = this.startViewPosition;
            if ((iFindFirstVisibleItemPosition < i || iFindFirstVisibleItemPosition > this.endViewPosition) && (iFindLastVisibleItemPosition < i || iFindLastVisibleItemPosition > this.endViewPosition)) {
                return i >= iFindFirstVisibleItemPosition && this.endViewPosition <= iFindLastVisibleItemPosition;
            }
            return true;
        }

        @Override
        public final void clear(boolean z) {
            super.clear(z);
            this.startViewPosition = -1;
            this.endViewPosition = -1;
            this.startViewChildPosition = -1;
            this.endViewChildPosition = -1;
            this.textByPosition.clear();
            this.childCountByPosition.clear();
            this.anchorViewPosition = -1;
            this.anchorOffset = -1;
        }

        public final void draw(Canvas canvas, ArticleSelectableView articleSelectableView, int i) {
            TextLayoutBlock textLayoutBlock;
            Paint paint = this.selectionPaint;
            int i2 = Theme.key_chat_inTextSelectionHighlight;
            paint.setColor(getThemedColor(i2));
            this.selectionHandlePaint.setColor(getThemedColor(i2));
            int adapterPosition = getAdapterPosition(articleSelectableView);
            if (adapterPosition < 0) {
                return;
            }
            ArrayList arrayList = this.arrayList;
            arrayList.clear();
            articleSelectableView.fillTextLayoutBlocks(arrayList);
            if (i < 0 || i >= arrayList.size() || (textLayoutBlock = (TextLayoutBlock) arrayList.get(i)) == null || textLayoutBlock.getLayout() == null || textLayoutBlock.getLayout().getText() == null) {
                return;
            }
            int i3 = this.endViewOffset;
            int length = textLayoutBlock.getLayout().getText().length();
            if (i3 > length) {
                i3 = length;
            }
            int i4 = this.startViewPosition;
            if (adapterPosition == i4 && adapterPosition == this.endViewPosition) {
                int i5 = this.startViewChildPosition;
                int i6 = this.endViewChildPosition;
                if (i5 == i6 && i5 == i) {
                    drawSelection(canvas, textLayoutBlock.getLayout(), this.startViewOffset, i3, true, true, 0.0f);
                    return;
                }
                if (i == i5) {
                    drawSelection(canvas, textLayoutBlock.getLayout(), this.startViewOffset, length, true, false, 0.0f);
                    return;
                }
                int i7 = i3;
                if (i == i6) {
                    drawSelection(canvas, textLayoutBlock.getLayout(), 0, i7, false, true, 0.0f);
                    return;
                } else {
                    if (i <= i5 || i >= i6) {
                        return;
                    }
                    drawSelection(canvas, textLayoutBlock.getLayout(), 0, length, false, false, 0.0f);
                    return;
                }
            }
            int i8 = i3;
            if (adapterPosition == i4 && this.startViewChildPosition == i) {
                drawSelection(canvas, textLayoutBlock.getLayout(), this.startViewOffset, length, true, false, 0.0f);
                return;
            }
            int i9 = this.endViewPosition;
            if (adapterPosition == i9 && this.endViewChildPosition == i) {
                drawSelection(canvas, textLayoutBlock.getLayout(), 0, i8, false, true, 0.0f);
                return;
            }
            if ((adapterPosition <= i4 || adapterPosition >= i9) && ((adapterPosition != i4 || i <= this.startViewChildPosition) && (adapterPosition != i9 || i >= this.endViewChildPosition))) {
                return;
            }
            drawSelection(canvas, textLayoutBlock.getLayout(), 0, length, false, false, 0.0f);
        }

        public final boolean expandSelectionToWholeCurrentBlock() {
            int i;
            int length;
            if (isInSelectionMode() && this.selectedView != null && this.startViewPosition == this.endViewPosition && (i = this.startViewChildPosition) == this.endViewChildPosition) {
                if (i < 0) {
                    i = 0;
                }
                ArrayList arrayList = this.arrayList;
                arrayList.clear();
                ((ArticleSelectableView) this.selectedView).fillTextLayoutBlocks(arrayList);
                if (!arrayList.isEmpty() && i < arrayList.size() && (length = ((TextLayoutBlock) arrayList.get(i)).getLayout().getText().length()) > 0 && (this.startViewOffset > 0 || this.endViewOffset < length)) {
                    return selectRangeOf((ArticleSelectableView) this.selectedView, i, 0, length);
                }
            }
            return false;
        }

        public final boolean extendSelectionTo(int i, int i2, ArticleSelectableView articleSelectableView) {
            int iCompare;
            int i3;
            int i4;
            int i5;
            int adapterPosition = getAdapterPosition(articleSelectableView);
            if (adapterPosition < 0) {
                return false;
            }
            if (this.anchorViewPosition < 0) {
                this.anchorViewPosition = this.startViewPosition;
                this.anchorChildPosition = this.startViewChildPosition;
                this.anchorOffset = this.startViewOffset;
            }
            populateTextCacheForView(articleSelectableView, adapterPosition);
            int i6 = this.anchorViewPosition;
            int i7 = this.anchorChildPosition;
            int i8 = this.anchorOffset;
            if (adapterPosition != i6) {
                iCompare = Integer.compare(adapterPosition, i6);
            } else {
                iCompare = i != i7 ? Integer.compare(i, i7) : Integer.compare(i2, i8);
            }
            if (iCompare < 0) {
                i5 = this.anchorViewPosition;
                i3 = this.anchorChildPosition;
                i4 = this.anchorOffset;
            } else {
                int i9 = this.anchorViewPosition;
                i3 = i;
                i = this.anchorChildPosition;
                i4 = i2;
                i2 = this.anchorOffset;
                adapterPosition = i9;
                i5 = adapterPosition;
            }
            if (adapterPosition == i5 && i == i3 && i2 == i4) {
                clear();
                return true;
            }
            this.startViewPosition = adapterPosition;
            this.startViewChildPosition = i;
            this.startViewOffset = i2;
            this.endViewPosition = i5;
            this.endViewChildPosition = i3;
            this.endViewOffset = i4;
            pickEndView();
            invalidate();
            TextSelectionOverlay textSelectionOverlay = this.textSelectionOverlay;
            if (textSelectionOverlay != null) {
                textSelectionOverlay.invalidate();
            }
            AndroidUtilities.cancelRunOnUIThread(this.showActionsRunnable);
            AndroidUtilities.runOnUIThread(this.showActionsRunnable);
            return true;
        }

        @Override
        public final void fillLayoutForOffset(int i, LayoutBlock layoutBlock, boolean z) {
            int i2;
            ArrayList arrayList = this.arrayList;
            arrayList.clear();
            layoutBlock.selectionBounds = null;
            ArticleSelectableView articleSelectableView = (ArticleSelectableView) (z ? this.maybeSelectedView : this.selectedView);
            if (articleSelectableView == null) {
                layoutBlock.layout = null;
                return;
            }
            articleSelectableView.fillTextLayoutBlocks(arrayList);
            if (z) {
                i2 = this.maybeTextIndex;
            } else {
                i2 = this.startPeek ? this.startViewChildPosition : this.endViewChildPosition;
            }
            if (i2 < 0 || i2 >= arrayList.size()) {
                layoutBlock.layout = null;
                return;
            }
            layoutBlock.layout = ((TextLayoutBlock) arrayList.get(i2)).getLayout();
            layoutBlock.selectionBounds = ((TextLayoutBlock) arrayList.get(i2)).getSelectionBounds();
            layoutBlock.yOffset = 0.0f;
            layoutBlock.xOffset = 0.0f;
        }

        public final int findClosestLayoutIndex(int i, int i2, ArticleSelectableView articleSelectableView) {
            int i3 = 0;
            if (articleSelectableView instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) articleSelectableView;
                for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                    View childAt = viewGroup.getChildAt(i4);
                    if (childAt instanceof ArticleSelectableView) {
                        float f = i2;
                        if (f > childAt.getY() && f < childAt.getY() + childAt.getHeight()) {
                            return findClosestLayoutIndex((int) (i - childAt.getX()), (int) (f - childAt.getY()), (ArticleSelectableView) childAt);
                        }
                    }
                }
            }
            ArrayList arrayList = this.arrayList;
            arrayList.clear();
            articleSelectableView.fillTextLayoutBlocks(arrayList);
            if (arrayList.isEmpty()) {
                return -1;
            }
            int size = arrayList.size() - 1;
            int i5 = Integer.MAX_VALUE;
            int i6 = Integer.MAX_VALUE;
            int i7 = -1;
            while (true) {
                if (size < 0) {
                    i3 = i6;
                    size = i7;
                    break;
                }
                TextLayoutBlock textLayoutBlock = (TextLayoutBlock) arrayList.get(size);
                int y = textLayoutBlock.getY();
                int height = textLayoutBlock.getLayout().getHeight() + y;
                if (i2 >= y && i2 < height) {
                    break;
                }
                int iMin = Math.min(Math.abs(i2 - y), Math.abs(i2 - height));
                if (iMin < i6) {
                    i7 = size;
                    i6 = iMin;
                }
                size--;
            }
            if (size < 0) {
                return -1;
            }
            int row = ((TextLayoutBlock) arrayList.get(size)).getRow();
            if (row > 0 && i3 < AndroidUtilities.dp(24.0f)) {
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    TextLayoutBlock textLayoutBlock2 = (TextLayoutBlock) arrayList.get(size2);
                    if (textLayoutBlock2.getRow() == row) {
                        int x = textLayoutBlock2.getX();
                        int width = textLayoutBlock2.getLayout().getWidth() + textLayoutBlock2.getX();
                        if (i >= x && i <= width) {
                            return size2;
                        }
                        int iMin2 = Math.min(Math.abs(i - x), Math.abs(i - width));
                        if (iMin2 < i5) {
                            size = size2;
                            i5 = iMin2;
                        }
                    }
                }
            }
            return size;
        }

        public final int getAdapterPosition(ArticleSelectableView articleSelectableView) {
            ViewGroup viewGroup;
            View view = (View) articleSelectableView;
            ViewParent parent = view.getParent();
            while (true) {
                viewGroup = this.parentView;
                if (parent != viewGroup && parent != null) {
                    if (!(parent instanceof View)) {
                        parent = null;
                        break;
                    }
                    view = parent;
                    parent = view.getParent();
                } else {
                    break;
                }
            }
            if (parent == null) {
                return -1;
            }
            RecyclerListView recyclerListView = this.parentRecyclerView;
            return recyclerListView != null ? recyclerListView.getChildAdapterPosition(view) : viewGroup.indexOfChild(view);
        }

        @Override
        public final int getCharOffsetFromCord(int i, int i2, int i3, int i4, SelectableView selectableView, boolean z) {
            int i5;
            ArticleSelectableView articleSelectableView = (ArticleSelectableView) selectableView;
            if (articleSelectableView != null) {
                int width = i - i3;
                int lineBottom = i2 - i4;
                ArrayList arrayList = this.arrayList;
                arrayList.clear();
                articleSelectableView.fillTextLayoutBlocks(arrayList);
                if (z) {
                    i5 = this.maybeTextIndex;
                } else {
                    i5 = this.startPeek ? this.startViewChildPosition : this.endViewChildPosition;
                }
                if (i5 >= 0 && i5 < arrayList.size()) {
                    Layout layout = ((TextLayoutBlock) arrayList.get(i5)).getLayout();
                    if (width < 0) {
                        width = 1;
                    }
                    if (lineBottom < 0) {
                        lineBottom = 1;
                    }
                    if (width > layout.getWidth()) {
                        width = layout.getWidth();
                    }
                    if (lineBottom > layout.getLineBottom(layout.getLineCount() - 1)) {
                        lineBottom = layout.getLineBottom(layout.getLineCount() - 1) - 1;
                    }
                    int i6 = 0;
                    while (i6 < layout.getLineCount()) {
                        if (lineBottom < layout.getLineTop(i6) || lineBottom > layout.getLineBottom(i6)) {
                            i6++;
                        } else if (i6 >= 0) {
                            return layout.getOffsetForHorizontal(i6, width);
                        }
                    }
                    i6 = -1;
                    if (i6 >= 0) {
                        return layout.getOffsetForHorizontal(i6, width);
                    }
                }
            }
            return -1;
        }

        @Override
        public final int getLineHeight() {
            if (this.selectedView != null) {
                ArrayList arrayList = this.arrayList;
                arrayList.clear();
                ((ArticleSelectableView) this.selectedView).fillTextLayoutBlocks(arrayList);
                int i = this.startPeek ? this.startViewChildPosition : this.endViewChildPosition;
                if (i >= 0 && i < arrayList.size()) {
                    Layout layout = ((TextLayoutBlock) arrayList.get(i)).getLayout();
                    int i2 = Integer.MAX_VALUE;
                    for (int i3 = 0; i3 < layout.getLineCount(); i3++) {
                        int lineBottom = layout.getLineBottom(i3) - layout.getLineTop(i3);
                        if (lineBottom < i2) {
                            i2 = lineBottom;
                        }
                    }
                    return i2;
                }
            }
            return 0;
        }

        @Override
        public final CharSequence getSelectedText() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            int i = this.startViewPosition;
            while (true) {
                int i2 = this.endViewPosition;
                if (i > i2) {
                    break;
                }
                int i3 = this.startViewPosition;
                SparseIntArray sparseIntArray = this.childCountByPosition;
                SparseArray sparseArray = this.textByPosition;
                SparseArray sparseArray2 = this.prefixTextByPosition;
                if (i == i3) {
                    int i4 = i3 == i2 ? this.endViewChildPosition : sparseIntArray.get(i) - 1;
                    for (int i5 = this.startViewChildPosition; i5 <= i4; i5++) {
                        int i6 = (i5 << 16) + i;
                        CharSequence charSequence = (CharSequence) sparseArray.get(i6);
                        if (charSequence != null) {
                            int i7 = this.startViewPosition;
                            int i8 = this.endViewPosition;
                            if (i7 == i8 && i5 == this.endViewChildPosition && i5 == this.startViewChildPosition) {
                                int i9 = this.endViewOffset;
                                int length = this.startViewOffset;
                                if (i9 >= length) {
                                    length = i9;
                                    i9 = length;
                                }
                                if (i9 < charSequence.length()) {
                                    if (length > charSequence.length()) {
                                        length = charSequence.length();
                                    }
                                    spannableStringBuilder.append(charSequence.subSequence(i9, length));
                                    spannableStringBuilder.append('\n');
                                }
                            } else if (i7 == i8 && i5 == this.endViewChildPosition) {
                                CharSequence charSequence2 = (CharSequence) sparseArray2.get(i6);
                                if (charSequence2 != null) {
                                    spannableStringBuilder.append(charSequence2).append(' ');
                                }
                                int length2 = this.endViewOffset;
                                if (length2 > charSequence.length()) {
                                    length2 = charSequence.length();
                                }
                                spannableStringBuilder.append(charSequence.subSequence(0, length2));
                                spannableStringBuilder.append('\n');
                            } else if (i5 == this.startViewChildPosition) {
                                int i10 = this.startViewOffset;
                                if (i10 < charSequence.length()) {
                                    spannableStringBuilder.append(charSequence.subSequence(i10, charSequence.length()));
                                    spannableStringBuilder.append('\n');
                                }
                            } else {
                                CharSequence charSequence3 = (CharSequence) sparseArray2.get(i6);
                                if (charSequence3 != null) {
                                    spannableStringBuilder.append(charSequence3).append(' ');
                                }
                                spannableStringBuilder.append(charSequence);
                                spannableStringBuilder.append('\n');
                            }
                        }
                    }
                } else if (i == i2) {
                    for (int i11 = 0; i11 <= this.endViewChildPosition; i11++) {
                        int i12 = (i11 << 16) + i;
                        CharSequence charSequence4 = (CharSequence) sparseArray.get(i12);
                        if (charSequence4 != null) {
                            if (this.startViewPosition == this.endViewPosition && i11 == this.endViewChildPosition && i11 == this.startViewChildPosition) {
                                int length3 = this.endViewOffset;
                                int i13 = this.startViewOffset;
                                if (i13 < charSequence4.length()) {
                                    if (length3 > charSequence4.length()) {
                                        length3 = charSequence4.length();
                                    }
                                    spannableStringBuilder.append(charSequence4.subSequence(i13, length3));
                                    spannableStringBuilder.append('\n');
                                }
                            } else if (i11 == this.endViewChildPosition) {
                                CharSequence charSequence5 = (CharSequence) sparseArray2.get(i12);
                                if (charSequence5 != null) {
                                    spannableStringBuilder.append(charSequence5).append(' ');
                                }
                                int length4 = this.endViewOffset;
                                if (length4 > charSequence4.length()) {
                                    length4 = charSequence4.length();
                                }
                                spannableStringBuilder.append(charSequence4.subSequence(0, length4));
                                spannableStringBuilder.append('\n');
                            } else {
                                CharSequence charSequence6 = (CharSequence) sparseArray2.get(i12);
                                if (charSequence6 != null) {
                                    spannableStringBuilder.append(charSequence6).append(' ');
                                }
                                spannableStringBuilder.append(charSequence4);
                                spannableStringBuilder.append('\n');
                            }
                        }
                    }
                } else {
                    int i14 = sparseIntArray.get(i);
                    for (int i15 = this.startViewChildPosition; i15 < i14; i15++) {
                        int i16 = (i15 << 16) + i;
                        CharSequence charSequence7 = (CharSequence) sparseArray2.get(i16);
                        if (charSequence7 != null) {
                            spannableStringBuilder.append(charSequence7).append(' ');
                        }
                        spannableStringBuilder.append((CharSequence) sparseArray.get(i16));
                        spannableStringBuilder.append('\n');
                    }
                }
                i++;
            }
            if (spannableStringBuilder.length() <= 0) {
                return null;
            }
            ReplaceCopyTextSpannable[] replaceCopyTextSpannableArr = (ReplaceCopyTextSpannable[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length() - 1, ReplaceCopyTextSpannable.class);
            if (replaceCopyTextSpannableArr != null && replaceCopyTextSpannableArr.length > 0) {
                Arrays.sort(replaceCopyTextSpannableArr, new TableModel$$ExternalSyntheticLambda0(spannableStringBuilder, 3));
                for (ReplaceCopyTextSpannable replaceCopyTextSpannable : replaceCopyTextSpannableArr) {
                    int spanStart = spannableStringBuilder.getSpanStart(replaceCopyTextSpannable);
                    int spanEnd = spannableStringBuilder.getSpanEnd(replaceCopyTextSpannable);
                    if (spanStart >= 0 && spanEnd > spanStart) {
                        String str = replaceCopyTextSpannable.replacement;
                        if (str == null) {
                            str = "";
                        }
                        spannableStringBuilder.replace(spanStart, spanEnd, (CharSequence) str);
                    }
                }
            }
            for (IgnoreCopySpannable ignoreCopySpannable : (IgnoreCopySpannable[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length() - 1, IgnoreCopySpannable.class)) {
                spannableStringBuilder.delete(spannableStringBuilder.getSpanStart(ignoreCopySpannable), spannableStringBuilder.getSpanEnd(ignoreCopySpannable));
            }
            return spannableStringBuilder.subSequence(0, spannableStringBuilder.length() - 1);
        }

        @Override
        public final void invalidate() {
            super.invalidate();
            if (this.parentView != null) {
                for (int i = 0; i < this.parentView.getChildCount(); i++) {
                    this.parentView.getChildAt(i).invalidate();
                }
            }
        }

        @Override
        public final boolean isSelectable(View view) {
            if (!(view instanceof ArticleSelectableView)) {
                return false;
            }
            ArrayList arrayList = this.arrayList;
            arrayList.clear();
            ((ArticleSelectableView) view).fillTextLayoutBlocks(arrayList);
            if (view instanceof ArticleViewer.BlockTableCell) {
                return true;
            }
            return !arrayList.isEmpty();
        }

        @Override
        public final void jumpToLine(int i, int i2, boolean z, float f, float f2, SelectableView selectableView) {
            ArticleSelectableView articleSelectableView = (ArticleSelectableView) selectableView;
            if (!z || articleSelectableView != this.selectedView || f2 != f) {
                super.jumpToLine(i, i2, z, f, f2, articleSelectableView);
            } else if (this.movingHandleStart) {
                this.selectionStart = i;
            } else {
                this.selectionEnd = i;
            }
        }

        public final void onNewViewSelected(ArticleSelectableView articleSelectableView, ArticleSelectableView articleSelectableView2, int i) {
            int i2;
            int adapterPosition = getAdapterPosition(articleSelectableView2);
            int adapterPosition2 = articleSelectableView != null ? getAdapterPosition(articleSelectableView) : -1;
            invalidate();
            if (this.movingDirectionSettling && (i2 = this.startViewPosition) == this.endViewPosition) {
                if (adapterPosition == i2) {
                    if (i < this.startViewChildPosition) {
                        this.startViewChildPosition = i;
                        pickStartView();
                        this.movingHandleStart = true;
                        int i3 = this.selectionEnd;
                        this.startViewOffset = i3;
                        this.selectionStart = i3 - 1;
                    } else {
                        this.endViewChildPosition = i;
                        pickEndView();
                        this.movingHandleStart = false;
                        this.endViewOffset = 0;
                    }
                } else if (adapterPosition < i2) {
                    this.startViewPosition = adapterPosition;
                    this.startViewChildPosition = i;
                    pickStartView();
                    this.movingHandleStart = true;
                    int i4 = this.selectionEnd;
                    this.startViewOffset = i4;
                    this.selectionStart = i4 - 1;
                } else {
                    this.endViewPosition = adapterPosition;
                    this.endViewChildPosition = i;
                    pickEndView();
                    this.movingHandleStart = false;
                    this.endViewOffset = 0;
                }
            } else if (this.movingHandleStart) {
                if (adapterPosition == adapterPosition2) {
                    int i5 = this.endViewChildPosition;
                    if (i <= i5 || adapterPosition < this.endViewPosition) {
                        this.startViewPosition = adapterPosition;
                        this.startViewChildPosition = i;
                        pickStartView();
                        this.startViewOffset = this.selectionEnd;
                    } else {
                        this.endViewPosition = adapterPosition;
                        this.startViewChildPosition = i5;
                        this.endViewChildPosition = i;
                        this.startViewOffset = this.endViewOffset;
                        pickEndView();
                        this.endViewOffset = 0;
                        this.movingHandleStart = false;
                    }
                } else if (adapterPosition <= this.endViewPosition) {
                    this.startViewPosition = adapterPosition;
                    this.startViewChildPosition = i;
                    pickStartView();
                    this.startViewOffset = this.selectionEnd;
                } else {
                    this.endViewPosition = adapterPosition;
                    this.startViewChildPosition = this.endViewChildPosition;
                    this.endViewChildPosition = i;
                    this.startViewOffset = this.endViewOffset;
                    pickEndView();
                    this.endViewOffset = 0;
                    this.movingHandleStart = false;
                }
            } else if (adapterPosition == adapterPosition2) {
                int i6 = this.startViewChildPosition;
                if (i >= i6 || adapterPosition > this.startViewPosition) {
                    this.endViewPosition = adapterPosition;
                    this.endViewChildPosition = i;
                    pickEndView();
                    this.endViewOffset = 0;
                } else {
                    this.startViewPosition = adapterPosition;
                    this.endViewChildPosition = i6;
                    this.startViewChildPosition = i;
                    this.endViewOffset = this.startViewOffset;
                    pickStartView();
                    this.movingHandleStart = true;
                    this.startViewOffset = this.selectionEnd;
                }
            } else if (adapterPosition >= this.startViewPosition) {
                this.endViewPosition = adapterPosition;
                this.endViewChildPosition = i;
                pickEndView();
                this.endViewOffset = 0;
            } else {
                this.startViewPosition = adapterPosition;
                this.endViewChildPosition = this.startViewChildPosition;
                this.startViewChildPosition = i;
                this.endViewOffset = this.startViewOffset;
                pickStartView();
                this.movingHandleStart = true;
                this.startViewOffset = this.selectionEnd;
            }
            ArrayList arrayList = this.arrayList;
            arrayList.clear();
            articleSelectableView2.fillTextLayoutBlocks(arrayList);
            int size = arrayList.size();
            this.childCountByPosition.put(adapterPosition, size);
            for (int i7 = 0; i7 < size; i7++) {
                TextLayoutBlock textLayoutBlock = (TextLayoutBlock) arrayList.get(i7);
                int i8 = (i7 << 16) + adapterPosition;
                this.textByPosition.put(i8, detachedText(textLayoutBlock.getText()));
                CharSequence prefix = textLayoutBlock.getPrefix();
                SparseArray sparseArray = this.prefixTextByPosition;
                if (prefix == null) {
                    sparseArray.remove(i8);
                } else {
                    sparseArray.put(i8, detachedText(prefix));
                }
            }
        }

        @Override
        public void onOffsetChanged() {
            int adapterPosition = getAdapterPosition((ArticleSelectableView) this.selectedView);
            int i = this.startPeek ? this.startViewChildPosition : this.endViewChildPosition;
            if (adapterPosition == this.startViewPosition && i == this.startViewChildPosition) {
                this.startViewOffset = this.selectionStart;
            }
            if (adapterPosition == this.endViewPosition && i == this.endViewChildPosition) {
                this.endViewOffset = this.selectionEnd;
            }
        }

        @Override
        public final void onTextSelected(SelectableView selectableView, SelectableView selectableView2) {
            ArticleSelectableView articleSelectableView = (ArticleSelectableView) selectableView;
            int adapterPosition = getAdapterPosition(articleSelectableView);
            if (adapterPosition < 0) {
                return;
            }
            this.endViewPosition = adapterPosition;
            this.startViewPosition = adapterPosition;
            int i = this.maybeTextIndex;
            this.endViewChildPosition = i;
            this.startViewChildPosition = i;
            ArrayList arrayList = this.arrayList;
            arrayList.clear();
            articleSelectableView.fillTextLayoutBlocks(arrayList);
            int size = arrayList.size();
            this.childCountByPosition.put(adapterPosition, size);
            for (int i2 = 0; i2 < size; i2++) {
                TextLayoutBlock textLayoutBlock = (TextLayoutBlock) arrayList.get(i2);
                int i3 = (i2 << 16) + adapterPosition;
                this.textByPosition.put(i3, detachedText(textLayoutBlock.getText()));
                CharSequence prefix = textLayoutBlock.getPrefix();
                SparseArray sparseArray = this.prefixTextByPosition;
                if (prefix == null) {
                    sparseArray.remove(i3);
                } else {
                    sparseArray.put(i3, detachedText(prefix));
                }
            }
        }

        @Override
        public final void pickEndView() {
            ArticleSelectableView articleSelectableView;
            if (isInSelectionMode()) {
                this.startPeek = false;
                int i = this.endViewPosition;
                if (i >= 0) {
                    LinearLayoutManager linearLayoutManager = this.layoutManager;
                    if (linearLayoutManager != null) {
                        articleSelectableView = (ArticleSelectableView) linearLayoutManager.findViewByPosition(i);
                    } else {
                        articleSelectableView = i < this.parentView.getChildCount() ? (ArticleSelectableView) this.parentView.getChildAt(this.endViewPosition) : null;
                    }
                    if (articleSelectableView == null) {
                        this.selectedView = null;
                        return;
                    }
                    this.selectedView = articleSelectableView;
                    if (this.startViewPosition == this.endViewPosition && this.startViewChildPosition == this.endViewChildPosition) {
                        this.selectionStart = this.startViewOffset;
                    } else {
                        this.selectionStart = 0;
                    }
                    this.selectionEnd = this.endViewOffset;
                    CharSequence text = getText(articleSelectableView, false);
                    if (this.selectionEnd > text.length()) {
                        this.selectionEnd = text.length();
                    }
                    ArrayList arrayList = this.arrayList;
                    arrayList.clear();
                    ((ArticleSelectableView) this.selectedView).fillTextLayoutBlocks(arrayList);
                    int i2 = this.endViewChildPosition;
                    if (i2 < 0 || i2 >= arrayList.size()) {
                        return;
                    }
                    this.textX = ((TextLayoutBlock) arrayList.get(this.endViewChildPosition)).getX();
                    this.textY = ((TextLayoutBlock) arrayList.get(this.endViewChildPosition)).getY();
                }
            }
        }

        @Override
        public final void pickStartView() {
            ArticleSelectableView articleSelectableView;
            if (isInSelectionMode()) {
                this.startPeek = true;
                int i = this.startViewPosition;
                if (i >= 0) {
                    LinearLayoutManager linearLayoutManager = this.layoutManager;
                    if (linearLayoutManager != null) {
                        articleSelectableView = (ArticleSelectableView) linearLayoutManager.findViewByPosition(i);
                    } else {
                        articleSelectableView = this.endViewPosition < this.parentView.getChildCount() ? (ArticleSelectableView) this.parentView.getChildAt(this.startViewPosition) : null;
                    }
                    if (articleSelectableView == null) {
                        this.selectedView = null;
                        return;
                    }
                    this.selectedView = articleSelectableView;
                    if (this.startViewPosition == this.endViewPosition && this.startViewChildPosition == this.endViewChildPosition) {
                        this.selectionEnd = this.endViewOffset;
                    } else {
                        this.selectionEnd = getText(articleSelectableView, false).length();
                    }
                    this.selectionStart = this.startViewOffset;
                    ArrayList arrayList = this.arrayList;
                    arrayList.clear();
                    ((ArticleSelectableView) this.selectedView).fillTextLayoutBlocks(arrayList);
                    int i2 = this.startViewChildPosition;
                    if (i2 < 0 || i2 >= arrayList.size()) {
                        return;
                    }
                    this.textX = ((TextLayoutBlock) arrayList.get(this.startViewChildPosition)).getX();
                    this.textY = ((TextLayoutBlock) arrayList.get(this.startViewChildPosition)).getY();
                }
            }
        }

        public final void populateTextCacheForView(ArticleSelectableView articleSelectableView, int i) {
            ArrayList arrayList = this.arrayList;
            arrayList.clear();
            articleSelectableView.fillTextLayoutBlocks(arrayList);
            int size = arrayList.size();
            this.childCountByPosition.put(i, size);
            for (int i2 = 0; i2 < size; i2++) {
                TextLayoutBlock textLayoutBlock = (TextLayoutBlock) arrayList.get(i2);
                int i3 = (i2 << 16) + i;
                this.textByPosition.put(i3, detachedText(textLayoutBlock.getText()));
                CharSequence prefix = textLayoutBlock.getPrefix();
                SparseArray sparseArray = this.prefixTextByPosition;
                if (prefix == null) {
                    sparseArray.remove(i3);
                } else {
                    sparseArray.put(i3, detachedText(prefix));
                }
            }
        }

        public final void selectAllBlocksRange(int i, int i2) {
            ArticleSelectableView articleSelectableView;
            if (i < 0 || i2 < i) {
                return;
            }
            CharSequence charSequence = (CharSequence) this.textByPosition.get(i2);
            int length = charSequence == null ? 0 : charSequence.length();
            if (this.parentView == null) {
                articleSelectableView = null;
                break;
            }
            int i3 = 0;
            while (true) {
                if (i3 >= this.parentView.getChildCount()) {
                    articleSelectableView = null;
                    break;
                }
                KeyEvent.Callback childAt = this.parentView.getChildAt(i3);
                if (childAt instanceof ArticleSelectableView) {
                    articleSelectableView = (ArticleSelectableView) childAt;
                    if (getAdapterPosition(articleSelectableView) == i2) {
                        break;
                    }
                }
                i3++;
            }
            this.selectedView = articleSelectableView;
            this.selectionStart = 0;
            this.selectionEnd = length;
            this.startViewPosition = i;
            this.endViewPosition = i2;
            this.endViewChildPosition = 0;
            this.startViewChildPosition = 0;
            this.startViewOffset = 0;
            this.endViewOffset = length;
            SparseIntArray sparseIntArray = this.childCountByPosition;
            sparseIntArray.put(i, Math.max(1, sparseIntArray.get(i)));
            sparseIntArray.put(i2, Math.max(1, sparseIntArray.get(i2)));
            this.anchorViewPosition = i;
            this.anchorOffset = 0;
            TextSelectionOverlay textSelectionOverlay = this.textSelectionOverlay;
            if (textSelectionOverlay != null) {
                textSelectionOverlay.setVisibility(0);
            }
            showHandleViews();
            invalidate();
            hideActions();
            AndroidUtilities.cancelRunOnUIThread(this.showActionsRunnable);
            AndroidUtilities.runOnUIThread(this.showActionsRunnable);
            Callback callback = this.callback;
            if (callback != null) {
                callback.onStateChanged(true);
            }
        }

        public final void selectAllBlocksRange$1(int i, int i2) {
            ArticleSelectableView articleSelectableView;
            if (i >= 0) {
                if (this.parentView == null) {
                    articleSelectableView = null;
                    break;
                }
                int i3 = 0;
                while (true) {
                    if (i3 >= this.parentView.getChildCount()) {
                        articleSelectableView = null;
                        break;
                    }
                    KeyEvent.Callback childAt = this.parentView.getChildAt(i3);
                    if (childAt instanceof ArticleSelectableView) {
                        articleSelectableView = (ArticleSelectableView) childAt;
                        if (getAdapterPosition(articleSelectableView) == i) {
                            break;
                        }
                    }
                    i3++;
                }
                this.selectedView = articleSelectableView;
                this.selectionStart = 0;
                this.selectionEnd = i2;
                this.startViewPosition = 0;
                this.endViewPosition = i;
                this.startViewChildPosition = 0;
                this.endViewChildPosition = 1;
                this.startViewOffset = 0;
                this.endViewOffset = i2;
                SparseIntArray sparseIntArray = this.childCountByPosition;
                sparseIntArray.put(0, Math.max(1, sparseIntArray.get(0)));
                sparseIntArray.put(i, Math.max(2, sparseIntArray.get(i)));
                this.anchorViewPosition = 0;
                this.anchorChildPosition = 0;
                this.anchorOffset = 0;
                TextSelectionOverlay textSelectionOverlay = this.textSelectionOverlay;
                if (textSelectionOverlay != null) {
                    textSelectionOverlay.setVisibility(0);
                }
                showHandleViews();
                invalidate();
                hideActions();
                AndroidUtilities.cancelRunOnUIThread(this.showActionsRunnable);
                AndroidUtilities.runOnUIThread(this.showActionsRunnable);
                Callback callback = this.callback;
                if (callback != null) {
                    callback.onStateChanged(true);
                }
            }
        }

        public final boolean selectChildRange(RichTableCell richTableCell, int i, int i2) {
            int adapterPosition = getAdapterPosition(richTableCell);
            if (adapterPosition < 0 || (i == 0 && i2 == 0)) {
                return false;
            }
            this.selectedView = richTableCell;
            this.endViewPosition = adapterPosition;
            this.startViewPosition = adapterPosition;
            this.startViewChildPosition = 0;
            this.endViewChildPosition = i;
            this.startViewOffset = 0;
            this.endViewOffset = i2;
            this.selectionStart = 0;
            this.selectionEnd = i2;
            this.anchorViewPosition = adapterPosition;
            this.anchorChildPosition = 0;
            this.anchorOffset = 0;
            populateTextCacheForView(richTableCell, adapterPosition);
            ArrayList arrayList = this.arrayList;
            arrayList.clear();
            richTableCell.fillTextLayoutBlocks(arrayList);
            if ((!arrayList.isEmpty() && arrayList.size() > 0) || !arrayList.isEmpty()) {
                this.textX = ((TextLayoutBlock) arrayList.get(0)).getX();
                this.textY = ((TextLayoutBlock) arrayList.get(0)).getY();
            }
            TextSelectionOverlay textSelectionOverlay = this.textSelectionOverlay;
            if (textSelectionOverlay != null) {
                textSelectionOverlay.setVisibility(0);
            }
            showHandleViews();
            invalidate();
            hideActions();
            AndroidUtilities.cancelRunOnUIThread(this.showActionsRunnable);
            AndroidUtilities.runOnUIThread(this.showActionsRunnable);
            Callback callback = this.callback;
            if (callback != null) {
                callback.onStateChanged(true);
            }
            richTableCell.invalidate();
            return true;
        }

        @Override
        public final boolean selectLayout(int i, int i2) {
            if (this.multiselect) {
                if (i2 <= ((ArticleSelectableView) this.selectedView).getTop() || i2 >= ((ArticleSelectableView) this.selectedView).getBottom()) {
                    int childCount = this.parentView.getChildCount();
                    for (int i3 = 0; i3 < childCount; i3++) {
                        if (isSelectable(this.parentView.getChildAt(i3))) {
                            ArticleSelectableView articleSelectableView = (ArticleSelectableView) this.parentView.getChildAt(i3);
                            if (i2 > articleSelectableView.getTop() && i2 < articleSelectableView.getBottom()) {
                                int iFindClosestLayoutIndex = findClosestLayoutIndex((int) (i - articleSelectableView.getX()), (int) (i2 - articleSelectableView.getY()), articleSelectableView);
                                if (iFindClosestLayoutIndex < 0) {
                                    break;
                                }
                                onNewViewSelected((ArticleSelectableView) this.selectedView, articleSelectableView, iFindClosestLayoutIndex);
                                this.selectedView = articleSelectableView;
                                return true;
                            }
                        }
                    }
                } else {
                    int i4 = this.startPeek ? this.startViewChildPosition : this.endViewChildPosition;
                    int iFindClosestLayoutIndex2 = findClosestLayoutIndex((int) (i - ((ArticleSelectableView) this.selectedView).getX()), (int) (i2 - ((ArticleSelectableView) this.selectedView).getY()), (ArticleSelectableView) this.selectedView);
                    if (iFindClosestLayoutIndex2 != i4 && iFindClosestLayoutIndex2 >= 0) {
                        ArticleSelectableView articleSelectableView2 = (ArticleSelectableView) this.selectedView;
                        onNewViewSelected(articleSelectableView2, articleSelectableView2, iFindClosestLayoutIndex2);
                        return true;
                    }
                }
            }
            return false;
        }

        public final boolean selectRangeOf(ArticleSelectableView articleSelectableView, int i, int i2, int i3) {
            int adapterPosition = getAdapterPosition(articleSelectableView);
            if (adapterPosition < 0 || i2 == i3) {
                return false;
            }
            int iMin = Math.min(i2, i3);
            int iMax = Math.max(i2, i3);
            this.selectedView = articleSelectableView;
            this.selectionStart = iMin;
            this.selectionEnd = iMax;
            this.endViewPosition = adapterPosition;
            this.startViewPosition = adapterPosition;
            this.endViewChildPosition = i;
            this.startViewChildPosition = i;
            this.startViewOffset = iMin;
            this.endViewOffset = iMax;
            this.anchorViewPosition = adapterPosition;
            this.anchorOffset = i2;
            this.anchorChildPosition = i;
            populateTextCacheForView(articleSelectableView, adapterPosition);
            ArrayList arrayList = this.arrayList;
            if (!arrayList.isEmpty() && i >= 0 && i < arrayList.size()) {
                this.textX = ((TextLayoutBlock) arrayList.get(i)).getX();
                this.textY = ((TextLayoutBlock) arrayList.get(i)).getY();
            } else if (!arrayList.isEmpty()) {
                this.textX = ((TextLayoutBlock) arrayList.get(0)).getX();
                this.textY = ((TextLayoutBlock) arrayList.get(0)).getY();
            }
            TextSelectionOverlay textSelectionOverlay = this.textSelectionOverlay;
            if (textSelectionOverlay != null) {
                textSelectionOverlay.setVisibility(0);
            }
            showHandleViews();
            invalidate();
            hideActions();
            AndroidUtilities.cancelRunOnUIThread(this.showActionsRunnable);
            AndroidUtilities.runOnUIThread(this.showActionsRunnable);
            Callback callback = this.callback;
            if (callback != null) {
                callback.onStateChanged(true);
            }
            articleSelectableView.invalidate();
            return true;
        }

        public final void setMaybeView(int i, int i2, View view) {
            if (view instanceof ArticleSelectableView) {
                this.capturedX = i;
                this.capturedY = i2;
                ArticleSelectableView articleSelectableView = (ArticleSelectableView) view;
                this.maybeSelectedView = articleSelectableView;
                int iFindClosestLayoutIndex = findClosestLayoutIndex(i, i2, articleSelectableView);
                this.maybeTextIndex = iFindClosestLayoutIndex;
                if (iFindClosestLayoutIndex < 0) {
                    this.maybeSelectedView = null;
                    return;
                }
                ArrayList arrayList = this.arrayList;
                this.maybeTextX = ((TextLayoutBlock) arrayList.get(iFindClosestLayoutIndex)).getX();
                this.maybeTextY = ((TextLayoutBlock) arrayList.get(this.maybeTextIndex)).getY();
            }
        }

        public final void trySelect() {
            if (this.maybeSelectedView != null) {
                this.startSelectionRunnable.run();
            }
        }

        @Override
        public final CharSequence getText(ArticleSelectableView articleSelectableView, boolean z) {
            int i;
            ArrayList arrayList = this.arrayList;
            arrayList.clear();
            articleSelectableView.fillTextLayoutBlocks(arrayList);
            if (z) {
                i = this.maybeTextIndex;
            } else {
                i = this.startPeek ? this.startViewChildPosition : this.endViewChildPosition;
            }
            return (arrayList.isEmpty() || i < 0 || i >= arrayList.size()) ? "" : ((TextLayoutBlock) arrayList.get(i)).getLayout().getText();
        }
    }

    public abstract class Callback {
        public abstract void onStateChanged(boolean z);

        public void onTextCopied() {
        }
    }

    public abstract class ChatListTextSelectionHelper extends TextSelectionHelper {
        public static int TYPE_CAPTION = 1;
        public static int TYPE_DESCRIPTION = 2;
        public static int TYPE_FACTCHECK = 3;
        public static int TYPE_MESSAGE = 0;
        public static int TYPE_RICH = 4;
        SparseArray<Animator> animatorSparseArray = new SparseArray<>();
        public boolean isDescription;
        public boolean isFactCheck;
        public boolean isRich;
        private boolean maybeIsDescription;
        private boolean maybeIsFactCheck;
        private boolean maybeIsRich;

        public static void lambda$onExitSelectionMode$1(ChatMessageCell chatMessageCell, int i, ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (chatMessageCell.getMessageObject() == null || chatMessageCell.getMessageObject().getId() != i) {
                return;
            }
            chatMessageCell.setSelectedBackgroundProgress(fFloatValue);
        }

        public void cancelAllAnimators() {
            for (int i = 0; i < this.animatorSparseArray.size(); i++) {
                SparseArray<Animator> sparseArray = this.animatorSparseArray;
                sparseArray.get(sparseArray.keyAt(i)).cancel();
            }
            this.animatorSparseArray.clear();
        }

        public void checkDataChanged(MessageObject messageObject) {
            try {
                int i = messageObject.messageOwner.edit_date;
            } catch (Exception unused) {
            }
            if (this.selectedCellId == messageObject.getId()) {
                clear(true);
            }
        }

        @Override
        public void clear(boolean z) {
            super.clear(z);
            this.isDescription = false;
            this.isFactCheck = false;
            this.isRich = false;
        }

        public void draw(MessageObject messageObject, MessageObject.TextLayoutBlock textLayoutBlock, Canvas canvas) {
            MessageObject messageObject2;
            SelectableView selectableView = this.selectedView;
            if (selectableView == null || ((ChatMessageCell) selectableView).getMessageObject() == null || this.isDescription || this.isFactCheck || this.isRich || (messageObject2 = ((ChatMessageCell) this.selectedView).getMessageObject()) == null || messageObject2.textLayoutBlocks == null || messageObject.getId() != this.selectedCellId) {
                return;
            }
            int i = this.selectionStart;
            int i2 = textLayoutBlock.charactersOffset;
            int i3 = this.selectionEnd - i2;
            int iDp = 0;
            int iClamp = Utilities.clamp(i - i2, textLayoutBlock.textLayout.getText().length(), 0);
            int iClamp2 = Utilities.clamp(i3, textLayoutBlock.textLayout.getText().length(), 0);
            if (iClamp != iClamp2) {
                if (messageObject2.isOutOwner()) {
                    Paint paint = this.selectionPaint;
                    int i4 = Theme.key_chat_outTextSelectionHighlight;
                    paint.setColor(getThemedColor(i4));
                    this.selectionHandlePaint.setColor(getThemedColor(i4));
                } else {
                    Paint paint2 = this.selectionPaint;
                    int i5 = Theme.key_chat_inTextSelectionHighlight;
                    paint2.setColor(getThemedColor(i5));
                    this.selectionHandlePaint.setColor(getThemedColor(i5));
                }
                if (textLayoutBlock.quote) {
                    iDp = AndroidUtilities.dp(10.0f);
                } else if (textLayoutBlock.code) {
                    iDp = AndroidUtilities.dp(0.0f);
                }
                drawSelection(canvas, textLayoutBlock.textLayout, iClamp, iClamp2, true, true, iDp);
            }
        }

        public void drawCaption(MessageObject messageObject, MessageObject.TextLayoutBlock textLayoutBlock, Canvas canvas) {
            SelectableView selectableView;
            if (messageObject == null || this.isDescription || this.isFactCheck || this.isRich || (selectableView = this.selectedView) == null || ((ChatMessageCell) selectableView).getMessageObject() == null || ((ChatMessageCell) this.selectedView).getMessageObject().getId() != messageObject.getId()) {
                return;
            }
            int i = this.selectionStart;
            int i2 = textLayoutBlock.charactersOffset;
            int i3 = this.selectionEnd - i2;
            int iDp = 0;
            int iClamp = Utilities.clamp(i - i2, textLayoutBlock.textLayout.getText().length(), 0);
            int iClamp2 = Utilities.clamp(i3, textLayoutBlock.textLayout.getText().length(), 0);
            if (iClamp != iClamp2) {
                if (messageObject.isOutOwner()) {
                    Paint paint = this.selectionPaint;
                    int i4 = Theme.key_chat_outTextSelectionHighlight;
                    paint.setColor(getThemedColor(i4));
                    this.selectionHandlePaint.setColor(getThemedColor(i4));
                } else {
                    Paint paint2 = this.selectionPaint;
                    int i5 = Theme.key_chat_inTextSelectionHighlight;
                    paint2.setColor(getThemedColor(i5));
                    this.selectionHandlePaint.setColor(getThemedColor(i5));
                }
                if (textLayoutBlock.quote) {
                    iDp = AndroidUtilities.dp(10.0f);
                } else if (textLayoutBlock.code) {
                    iDp = AndroidUtilities.dp(0.0f);
                }
                drawSelection(canvas, textLayoutBlock.textLayout, iClamp, iClamp2, true, true, iDp);
            }
        }

        public void drawDescription(boolean z, StaticLayout staticLayout, Canvas canvas) {
            if (this.isDescription) {
                if (z) {
                    Paint paint = this.selectionPaint;
                    int i = Theme.key_chat_outTextSelectionHighlight;
                    paint.setColor(getThemedColor(i));
                    this.selectionHandlePaint.setColor(getThemedColor(i));
                } else {
                    Paint paint2 = this.selectionPaint;
                    int i2 = Theme.key_chat_inTextSelectionHighlight;
                    paint2.setColor(getThemedColor(i2));
                    this.selectionHandlePaint.setColor(getThemedColor(i2));
                }
                drawSelection(canvas, staticLayout, this.selectionStart, this.selectionEnd, true, true, 0.0f);
            }
        }

        public void drawFactCheck(boolean z, StaticLayout staticLayout, Canvas canvas) {
            if (this.isFactCheck) {
                if (z) {
                    Paint paint = this.selectionPaint;
                    int i = Theme.key_chat_outTextSelectionHighlight;
                    paint.setColor(getThemedColor(i));
                    this.selectionHandlePaint.setColor(getThemedColor(i));
                } else {
                    Paint paint2 = this.selectionPaint;
                    int i2 = Theme.key_chat_inTextSelectionHighlight;
                    paint2.setColor(getThemedColor(i2));
                    this.selectionHandlePaint.setColor(getThemedColor(i2));
                }
                drawSelection(canvas, staticLayout, this.selectionStart, this.selectionEnd, true, true, 0.0f);
            }
        }

        public void drawRich(MessageObject messageObject, RichMessageLayout richMessageLayout, Canvas canvas) {
            SelectableView selectableView;
            Canvas canvas2;
            if (!this.isRich || richMessageLayout == null || (selectableView = this.selectedView) == null || ((ChatMessageCell) selectableView).getMessageObject() == null || ((ChatMessageCell) this.selectedView).getMessageObject().getId() != messageObject.getId()) {
                return;
            }
            if (messageObject.isOutOwner()) {
                Paint paint = this.selectionPaint;
                int i = Theme.key_chat_outTextSelectionHighlight;
                paint.setColor(getThemedColor(i));
                this.selectionHandlePaint.setColor(getThemedColor(i));
            } else {
                Paint paint2 = this.selectionPaint;
                int i2 = Theme.key_chat_inTextSelectionHighlight;
                paint2.setColor(getThemedColor(i2));
                this.selectionHandlePaint.setColor(getThemedColor(i2));
            }
            int i3 = 0;
            while (i3 < richMessageLayout.textBlocks.size()) {
                TextLayoutBlock textLayoutBlock = richMessageLayout.textBlocks.get(i3);
                Layout layout = textLayoutBlock.getLayout();
                if (layout == null || layout.getText() == null) {
                    canvas2 = canvas;
                } else {
                    int iIntValue = richMessageLayout.textBlockCharOffsets.get(i3).intValue();
                    int length = layout.getText().length();
                    int iClamp = Utilities.clamp(this.selectionStart - iIntValue, length, 0);
                    int iClamp2 = Utilities.clamp(this.selectionEnd - iIntValue, length, 0);
                    if (iClamp == iClamp2) {
                        canvas2 = canvas;
                    } else {
                        boolean z = this.selectionStart >= iIntValue;
                        boolean z2 = this.selectionEnd <= iIntValue + length;
                        canvas.save();
                        canvas.translate(textLayoutBlock.getX(), textLayoutBlock.getY());
                        canvas2 = canvas;
                        drawSelection(canvas2, layout, iClamp, iClamp2, z, z2, 0.0f);
                        canvas2.restore();
                    }
                }
                i3++;
                canvas = canvas2;
            }
        }

        @Override
        public void fillLayoutForOffset(int i, LayoutBlock layoutBlock, boolean z) {
            ChatMessageCell chatMessageCell = (ChatMessageCell) (z ? this.maybeSelectedView : this.selectedView);
            if (chatMessageCell == null) {
                layoutBlock.layout = null;
                return;
            }
            MessageObject messageObject = chatMessageCell.getMessageObject();
            int size = 0;
            if (this.isDescription) {
                layoutBlock.layout = chatMessageCell.getDescriptionlayout();
                layoutBlock.yOffset = 0.0f;
                layoutBlock.xOffset = 0.0f;
                layoutBlock.charOffset = 0;
                return;
            }
            if (this.isFactCheck) {
                layoutBlock.layout = chatMessageCell.getFactCheckLayout();
                layoutBlock.yOffset = 0.0f;
                layoutBlock.xOffset = 0.0f;
                layoutBlock.charOffset = 0;
                return;
            }
            if (this.isRich) {
                RichMessageLayout richMessageLayout = messageObject != null ? messageObject.richLayout : null;
                if (richMessageLayout == null || richMessageLayout.textBlocks.isEmpty()) {
                    layoutBlock.layout = null;
                    return;
                }
                while (true) {
                    if (size >= richMessageLayout.textBlocks.size()) {
                        size = -1;
                        break;
                    }
                    int iIntValue = richMessageLayout.textBlockCharOffsets.get(size).intValue();
                    int length = richMessageLayout.textBlocks.get(size).getLayout().getText().length();
                    if (i >= iIntValue && i <= iIntValue + length) {
                        break;
                    } else {
                        size++;
                    }
                }
                if (size < 0) {
                    size = richMessageLayout.textBlocks.size() - 1;
                }
                TextLayoutBlock textLayoutBlock = richMessageLayout.textBlocks.get(size);
                layoutBlock.layout = textLayoutBlock.getLayout();
                layoutBlock.yOffset = textLayoutBlock.getY();
                layoutBlock.xOffset = textLayoutBlock.getX();
                layoutBlock.charOffset = richMessageLayout.textBlockCharOffsets.get(size).intValue();
                return;
            }
            if (chatMessageCell.hasCaptionLayout()) {
                MessageObject.TextLayoutBlocks captionLayout = chatMessageCell.getCaptionLayout();
                if (captionLayout.textLayoutBlocks.size() == 1) {
                    MessageObject.TextLayoutBlock textLayoutBlock2 = captionLayout.textLayoutBlocks.get(0);
                    layoutBlock.layout = textLayoutBlock2.textLayout;
                    layoutBlock.yOffset = textLayoutBlock2.padTop;
                    MessageObject.TextLayoutBlock textLayoutBlock3 = captionLayout.textLayoutBlocks.get(0);
                    float f = -(textLayoutBlock3.isRtl() ? ((int) Math.ceil(captionLayout.textXOffset)) - (textLayoutBlock3.quote ? AndroidUtilities.dp(10.0f) : 0) : 0);
                    layoutBlock.xOffset = f;
                    if (textLayoutBlock3.code && !textLayoutBlock3.quote) {
                        layoutBlock.xOffset = f + AndroidUtilities.dp(8.0f);
                    }
                    layoutBlock.charOffset = 0;
                    return;
                }
                for (int i2 = 0; i2 < captionLayout.textLayoutBlocks.size(); i2++) {
                    MessageObject.TextLayoutBlock textLayoutBlock4 = captionLayout.textLayoutBlocks.get(i2);
                    int i3 = i - textLayoutBlock4.charactersOffset;
                    if (i3 >= 0 && i3 <= textLayoutBlock4.textLayout.getText().length()) {
                        layoutBlock.layout = textLayoutBlock4.textLayout;
                        layoutBlock.yOffset = textLayoutBlock4.textYOffset(captionLayout.textLayoutBlocks) + textLayoutBlock4.padTop;
                        float f2 = -(textLayoutBlock4.isRtl() ? ((int) Math.ceil(captionLayout.textXOffset)) - (textLayoutBlock4.quote ? AndroidUtilities.dp(10.0f) : 0) : 0);
                        layoutBlock.xOffset = f2;
                        if (textLayoutBlock4.code && !textLayoutBlock4.quote) {
                            layoutBlock.xOffset = f2 + AndroidUtilities.dp(8.0f);
                        }
                        layoutBlock.charOffset = textLayoutBlock4.charactersOffset;
                        return;
                    }
                }
                layoutBlock.layout = null;
                return;
            }
            ArrayList<MessageObject.TextLayoutBlock> arrayList = messageObject.textLayoutBlocks;
            if (arrayList == null) {
                layoutBlock.layout = null;
                return;
            }
            if (arrayList.size() == 1) {
                MessageObject.TextLayoutBlock textLayoutBlock5 = messageObject.textLayoutBlocks.get(0);
                layoutBlock.layout = textLayoutBlock5.textLayout;
                layoutBlock.yOffset = textLayoutBlock5.padTop;
                MessageObject.TextLayoutBlock textLayoutBlock6 = messageObject.textLayoutBlocks.get(0);
                float f3 = -(textLayoutBlock6.isRtl() ? ((int) Math.ceil(messageObject.textXOffset)) - (textLayoutBlock6.quote ? AndroidUtilities.dp(10.0f) : 0) : 0);
                layoutBlock.xOffset = f3;
                if (textLayoutBlock6.code && !textLayoutBlock6.quote) {
                    layoutBlock.xOffset = f3 + AndroidUtilities.dp(8.0f);
                }
                layoutBlock.charOffset = 0;
                return;
            }
            for (int i4 = 0; i4 < messageObject.textLayoutBlocks.size(); i4++) {
                MessageObject.TextLayoutBlock textLayoutBlock7 = messageObject.textLayoutBlocks.get(i4);
                int i5 = i - textLayoutBlock7.charactersOffset;
                if (i5 >= 0 && i5 <= textLayoutBlock7.textLayout.getText().length()) {
                    layoutBlock.layout = textLayoutBlock7.textLayout;
                    layoutBlock.yOffset = textLayoutBlock7.textYOffset(messageObject.textLayoutBlocks) + textLayoutBlock7.padTop;
                    float f4 = -(textLayoutBlock7.isRtl() ? ((int) Math.ceil(messageObject.textXOffset)) - (textLayoutBlock7.quote ? AndroidUtilities.dp(10.0f) : 0) : 0);
                    layoutBlock.xOffset = f4;
                    if (textLayoutBlock7.code && !textLayoutBlock7.quote) {
                        layoutBlock.xOffset = f4 + AndroidUtilities.dp(8.0f);
                    }
                    layoutBlock.charOffset = textLayoutBlock7.charactersOffset;
                    return;
                }
            }
            layoutBlock.layout = null;
        }

        @Override
        public int getLineHeight() {
            Layout layout;
            SelectableView selectableView = this.selectedView;
            if (selectableView == null || ((ChatMessageCell) selectableView).getMessageObject() == null) {
                return 0;
            }
            MessageObject messageObject = ((ChatMessageCell) this.selectedView).getMessageObject();
            if (this.isDescription) {
                layout = ((ChatMessageCell) this.selectedView).getDescriptionlayout();
            } else if (this.isFactCheck) {
                layout = ((ChatMessageCell) this.selectedView).getFactCheckLayout();
            } else if (this.isRich) {
                RichMessageLayout richMessageLayout = messageObject != null ? messageObject.richLayout : null;
                if (richMessageLayout == null || richMessageLayout.textBlocks.isEmpty()) {
                    layout = null;
                } else {
                    layout = richMessageLayout.textBlocks.get(0).getLayout();
                }
            } else if (((ChatMessageCell) this.selectedView).hasCaptionLayout()) {
                layout = ((ChatMessageCell) this.selectedView).getCaptionLayout().textLayoutBlocks.get(0).textLayout;
            } else {
                ArrayList<MessageObject.TextLayoutBlock> arrayList = messageObject.textLayoutBlocks;
                if (arrayList != null) {
                    layout = arrayList.get(0).textLayout;
                } else {
                    layout = null;
                }
            }
            if (layout == null) {
                return 0;
            }
            return layout.getLineBottom(0) - layout.getLineTop(0);
        }

        public int getTextSelectionType(ChatMessageCell chatMessageCell) {
            if (this.isDescription) {
                return TYPE_DESCRIPTION;
            }
            if (this.isFactCheck) {
                return TYPE_FACTCHECK;
            }
            if (this.isRich) {
                return TYPE_RICH;
            }
            return chatMessageCell.hasCaptionLayout() ? TYPE_CAPTION : TYPE_MESSAGE;
        }

        @Override
        public void invalidate() {
            super.invalidate();
            SelectableView selectableView = this.selectedView;
            if (selectableView != null && ((ChatMessageCell) selectableView).getCurrentMessagesGroup() != null) {
                this.parentView.invalidate();
            }
            SelectableView selectableView2 = this.selectedView;
            if (selectableView2 != null) {
                if (this.isFactCheck || this.maybeIsFactCheck) {
                    ((ChatMessageCell) selectableView2).invalidateOutbounds();
                }
            }
        }

        public boolean isMenuEmpty() {
            return (canCopy() || canShowQuote()) ? false : true;
        }

        public boolean isTouched() {
            return this.movingHandle;
        }

        public final void lambda$onTextSelected$0(boolean z, ValueAnimator valueAnimator) {
            this.enterProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            TextSelectionOverlay textSelectionOverlay = this.textSelectionOverlay;
            if (textSelectionOverlay != null) {
                textSelectionOverlay.invalidate();
            }
            SelectableView selectableView = this.selectedView;
            if (selectableView != null && ((ChatMessageCell) selectableView).getCurrentMessagesGroup() == null && z) {
                ((ChatMessageCell) this.selectedView).setSelectedBackgroundProgress(1.0f - this.enterProgress);
            }
        }

        public void onChatMessageCellAttached(ChatMessageCell chatMessageCell) {
            if (chatMessageCell.getMessageObject() == null || chatMessageCell.getMessageObject().getId() != this.selectedCellId) {
                return;
            }
            this.selectedView = chatMessageCell;
        }

        public void onChatMessageCellDetached(ChatMessageCell chatMessageCell) {
            if (chatMessageCell.getMessageObject() == null || chatMessageCell.getMessageObject().getId() != this.selectedCellId) {
                return;
            }
            this.selectedView = null;
        }

        @Override
        public boolean onCopyOverride() {
            SelectableView selectableView;
            RichMessageLayout richMessageLayout;
            CharSequence selectedText;
            String selectionHtml;
            if (this.isRich && (selectableView = this.selectedView) != null && ((ChatMessageCell) selectableView).getMessageObject() != null && (richMessageLayout = ((ChatMessageCell) this.selectedView).getMessageObject().richLayout) != null && !richMessageLayout.textBlocks.isEmpty() && (selectedText = getSelectedText()) != null && selectedText.length() != 0) {
                try {
                    selectionHtml = richMessageLayout.getSelectionHtml(this.selectionStart, this.selectionEnd);
                } catch (Exception e) {
                    FileLog.e(e);
                    selectionHtml = null;
                }
                if (selectionHtml != null && selectionHtml.length() != 0) {
                    AndroidUtilities.addToClipboard(selectedText, selectionHtml);
                    return true;
                }
            }
            return false;
        }

        @Override
        public void onExitSelectionMode(boolean z) {
            int i = 1;
            SelectableView selectableView = this.selectedView;
            if (selectableView == null || !((ChatMessageCell) selectableView).isDrawingSelectionBackground() || z) {
                return;
            }
            ChatMessageCell chatMessageCell = (ChatMessageCell) this.selectedView;
            int id = chatMessageCell.getMessageObject().getId();
            Animator animator = this.animatorSparseArray.get(id);
            if (animator != null) {
                animator.removeAllListeners();
                animator.cancel();
            }
            chatMessageCell.setSelectedBackgroundProgress(0.01f);
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.01f, 1.0f);
            valueAnimatorOfFloat.addUpdateListener(new BottomSheet$$ExternalSyntheticLambda3(chatMessageCell, id, i));
            valueAnimatorOfFloat.addListener(new ChatMessageCell.AnonymousClass9(i, chatMessageCell));
            valueAnimatorOfFloat.setDuration(300L);
            valueAnimatorOfFloat.start();
            this.animatorSparseArray.put(id, valueAnimatorOfFloat);
        }

        public void select(ChatMessageCell chatMessageCell, int i, int i2) {
            if (chatMessageCell == null) {
                return;
            }
            this.selectedView = chatMessageCell;
            this.selectedCellId = chatMessageCell.getMessageObject().getId();
            this.selectionStart = i;
            this.selectionEnd = i2;
            invalidate();
            Callback callback = this.callback;
            if (callback != null) {
                callback.onStateChanged(true);
            }
            this.movingOffsetY = 0.0f;
            this.movingOffsetX = 0.0f;
            onOffsetChanged();
            this.allowDiscard = false;
            TextSelectionOverlay textSelectionOverlay = this.textSelectionOverlay;
            if (textSelectionOverlay != null) {
                textSelectionOverlay.setVisibility(0);
            }
            showHandleViews();
        }

        public void setIsDescription(boolean z) {
            this.maybeIsDescription = z;
        }

        public void setIsFactCheck(boolean z) {
            this.maybeIsFactCheck = z;
        }

        public void setIsRich(boolean z) {
            this.maybeIsRich = z;
        }

        public void setMessageObject(ChatMessageCell chatMessageCell) {
            ArrayList<MessageObject.TextLayoutBlock> arrayList;
            RichMessageLayout richMessageLayout;
            this.maybeSelectedView = chatMessageCell;
            MessageObject messageObject = chatMessageCell.getMessageObject();
            if (this.maybeIsDescription && chatMessageCell.getDescriptionlayout() != null) {
                Rect rect = this.textArea;
                int i = this.maybeTextX;
                rect.set(i, this.maybeTextY, chatMessageCell.getDescriptionlayout().getWidth() + i, chatMessageCell.getDescriptionlayout().getHeight() + this.maybeTextY);
                return;
            }
            if (this.maybeIsFactCheck && chatMessageCell.getFactCheckLayout() != null) {
                Rect rect2 = this.textArea;
                int i2 = this.maybeTextX;
                rect2.set(i2, this.maybeTextY, chatMessageCell.getFactCheckLayout().getWidth() + i2, chatMessageCell.getFactCheckLayout().getHeight() + this.maybeTextY);
                return;
            }
            if (this.maybeIsRich && messageObject != null && (richMessageLayout = messageObject.richLayout) != null && !richMessageLayout.textBlocks.isEmpty()) {
                RichMessageLayout richMessageLayout2 = messageObject.richLayout;
                Rect rect3 = this.textArea;
                int i3 = this.maybeTextX;
                rect3.set(i3, this.maybeTextY, richMessageLayout2.getMinWidth() + i3, richMessageLayout2.getHeight() + this.maybeTextY);
                return;
            }
            if (chatMessageCell.hasCaptionLayout() && chatMessageCell.getCaptionLayout().textLayoutBlocks.size() > 0) {
                MessageObject.TextLayoutBlock textLayoutBlock = (MessageObject.TextLayoutBlock) zzin.m(1, chatMessageCell.getCaptionLayout().textLayoutBlocks);
                Rect rect4 = this.textArea;
                int i4 = this.maybeTextX;
                rect4.set(i4, this.maybeTextY, textLayoutBlock.textLayout.getWidth() + i4, (int) (textLayoutBlock.textYOffset(chatMessageCell.getCaptionLayout().textLayoutBlocks, chatMessageCell.transitionParams) + this.maybeTextY + textLayoutBlock.padTop + textLayoutBlock.textLayout.getHeight()));
                return;
            }
            if (messageObject == null || (arrayList = messageObject.textLayoutBlocks) == null || arrayList.size() <= 0) {
                this.maybeSelectedView = null;
                return;
            }
            MessageObject.TextLayoutBlock textLayoutBlock2 = (MessageObject.TextLayoutBlock) zzin.m(1, messageObject.textLayoutBlocks);
            Rect rect5 = this.textArea;
            int i5 = this.maybeTextX;
            rect5.set(i5, this.maybeTextY, textLayoutBlock2.textLayout.getWidth() + i5, (int) (textLayoutBlock2.textYOffset(messageObject.textLayoutBlocks, chatMessageCell.transitionParams) + this.maybeTextY + textLayoutBlock2.padTop + textLayoutBlock2.textLayout.getHeight()));
        }

        public void updateTextPosition(int i, int i2) {
            if (this.textX == i && this.textY == i2) {
                return;
            }
            this.textX = i;
            this.textY = i2;
            invalidate();
        }

        @Override
        public int getCharOffsetFromCord(int i, int i2, int i3, int i4, ChatMessageCell chatMessageCell, boolean z) {
            StaticLayout staticLayout;
            float fTextYOffset;
            int i5;
            float y;
            float f;
            StaticLayout factCheckLayout;
            int lineBottom;
            MessageObject messageObject;
            int i6;
            LayoutBlock layoutBlock;
            Layout layout;
            int i7;
            int i8;
            float f2;
            int i9;
            MessageObject.TextLayoutBlock textLayoutBlock;
            float f3;
            MessageObject.TextLayoutBlocks captionLayout;
            int i10;
            MessageObject.TextLayoutBlock textLayoutBlock2;
            float f4;
            if (chatMessageCell == null) {
                return 0;
            }
            int i11 = i - i3;
            int i12 = i2 - i4;
            boolean z2 = z ? this.maybeIsDescription : this.isDescription;
            boolean z3 = z ? this.maybeIsFactCheck : this.isFactCheck;
            boolean z4 = z ? this.maybeIsRich : this.isRich;
            if (!z2) {
                if (z3) {
                    factCheckLayout = chatMessageCell.getFactCheckLayout();
                } else {
                    if (z4) {
                        RichMessageLayout richMessageLayout = chatMessageCell.getMessageObject() != null ? chatMessageCell.getMessageObject().richLayout : null;
                        if (richMessageLayout == null || richMessageLayout.textBlocks.isEmpty()) {
                            return -1;
                        }
                        TextLayoutBlock textLayoutBlock3 = (TextLayoutBlock) zzin.m(1, richMessageLayout.textBlocks);
                        Layout layout2 = textLayoutBlock3.getLayout();
                        staticLayout = layout2 instanceof StaticLayout ? (StaticLayout) layout2 : null;
                        y = textLayoutBlock3.getY();
                    } else {
                        if (chatMessageCell.hasCaptionLayout()) {
                            MessageObject.TextLayoutBlock textLayoutBlock4 = chatMessageCell.getCaptionLayout().textLayoutBlocks.get(chatMessageCell.getCaptionLayout().textLayoutBlocks.size() - 1);
                            staticLayout = textLayoutBlock4.textLayout;
                            fTextYOffset = textLayoutBlock4.textYOffset(chatMessageCell.getCaptionLayout().textLayoutBlocks);
                            i5 = textLayoutBlock4.padTop;
                        } else {
                            MessageObject.TextLayoutBlock textLayoutBlock5 = chatMessageCell.getMessageObject().textLayoutBlocks.get(chatMessageCell.getMessageObject().textLayoutBlocks.size() - 1);
                            staticLayout = textLayoutBlock5.textLayout;
                            fTextYOffset = textLayoutBlock5.textYOffset(chatMessageCell.getMessageObject().textLayoutBlocks);
                            i5 = textLayoutBlock5.padTop;
                        }
                        y = i5 + fTextYOffset;
                    }
                    StaticLayout staticLayout2 = staticLayout;
                    f = y;
                    factCheckLayout = staticLayout2;
                }
                if (factCheckLayout == null) {
                    return -1;
                }
                if (i12 < 0) {
                    i12 = 1;
                }
                lineBottom = (int) (f + factCheckLayout.getLineBottom(factCheckLayout.getLineCount() - 1));
                if (i12 > lineBottom) {
                    i12 = lineBottom - 1;
                }
                LayoutBlock layoutBlock2 = this.layoutBlock;
                messageObject = chatMessageCell.getMessageObject();
                if (z ? !this.isDescription : !this.maybeIsDescription) {
                    if (z ? this.isFactCheck : this.maybeIsFactCheck) {
                        layoutBlock2.layout = chatMessageCell.getFactCheckLayout();
                        layoutBlock2.xOffset = 0.0f;
                        layoutBlock2.yOffset = 0.0f;
                        layoutBlock2.charOffset = 0;
                    } else if (z ? !this.isRich : !this.maybeIsRich) {
                        i6 = -1;
                        if (!chatMessageCell.hasCaptionLayout()) {
                            for (i9 = 0; i9 < messageObject.textLayoutBlocks.size(); i9++) {
                                textLayoutBlock = messageObject.textLayoutBlocks.get(i9);
                                f3 = i12;
                                if (f3 < textLayoutBlock.textYOffset(messageObject.textLayoutBlocks) && f3 <= textLayoutBlock.textYOffset(messageObject.textLayoutBlocks) + textLayoutBlock.padTop + textLayoutBlock.height(chatMessageCell.transitionParams)) {
                                    layoutBlock2.layout = textLayoutBlock.textLayout;
                                    layoutBlock2.yOffset = textLayoutBlock.textYOffset(messageObject.textLayoutBlocks) + textLayoutBlock.padTop;
                                    float f5 = -(textLayoutBlock.isRtl() ? ((int) Math.ceil(messageObject.textXOffset)) - (textLayoutBlock.quote ? AndroidUtilities.dp(10.0f) : textLayoutBlock.code ? AndroidUtilities.dp(0.0f) : 0) : 0);
                                    layoutBlock2.xOffset = f5;
                                    if (textLayoutBlock.code && !textLayoutBlock.quote) {
                                        layoutBlock2.xOffset = f5 + AndroidUtilities.dp(8.0f);
                                    }
                                    layoutBlock2.charOffset = textLayoutBlock.charactersOffset;
                                    break;
                                }
                            }
                        } else {
                            captionLayout = chatMessageCell.getCaptionLayout();
                            for (i10 = 0; i10 < captionLayout.textLayoutBlocks.size(); i10++) {
                                textLayoutBlock2 = captionLayout.textLayoutBlocks.get(i10);
                                f4 = i12;
                                if (f4 < textLayoutBlock2.textYOffset(captionLayout.textLayoutBlocks) && f4 <= textLayoutBlock2.textYOffset(captionLayout.textLayoutBlocks) + textLayoutBlock2.padTop + textLayoutBlock2.height(chatMessageCell.transitionParams)) {
                                    layoutBlock2.layout = textLayoutBlock2.textLayout;
                                    layoutBlock2.yOffset = textLayoutBlock2.textYOffset(captionLayout.textLayoutBlocks) + textLayoutBlock2.padTop;
                                    float f6 = -(textLayoutBlock2.isRtl() ? ((int) Math.ceil(captionLayout.textXOffset)) - (textLayoutBlock2.quote ? AndroidUtilities.dp(10.0f) : 0) : 0);
                                    layoutBlock2.xOffset = f6;
                                    if (textLayoutBlock2.code && !textLayoutBlock2.quote) {
                                        layoutBlock2.xOffset = f6 + AndroidUtilities.dp(8.0f);
                                    }
                                    layoutBlock2.charOffset = textLayoutBlock2.charactersOffset;
                                    break;
                                }
                            }
                        }
                    } else {
                        RichMessageLayout richMessageLayout2 = messageObject != null ? messageObject.richLayout : null;
                        if (richMessageLayout2 == null || richMessageLayout2.textBlocks.isEmpty()) {
                            i6 = -1;
                            layoutBlock2.layout = null;
                        } else {
                            int i13 = Integer.MIN_VALUE;
                            int i14 = -1;
                            int i15 = -1;
                            int i16 = Integer.MAX_VALUE;
                            for (int i17 = 0; i17 < richMessageLayout2.textBlocks.size(); i17++) {
                                TextLayoutBlock textLayoutBlock6 = richMessageLayout2.textBlocks.get(i17);
                                int y2 = textLayoutBlock6.getY();
                                int height = textLayoutBlock6.getLayout().getHeight() + y2;
                                int x = textLayoutBlock6.getX();
                                int width = textLayoutBlock6.getLayout().getWidth() + x;
                                boolean z5 = i12 >= y2 && i12 < height;
                                boolean z6 = i11 >= x && i11 < width;
                                textLayoutBlock6.getLayout().getText();
                                if (z5) {
                                    if (x <= i11 && x > i13) {
                                        i13 = x;
                                        i14 = i17;
                                    }
                                    int iMin = z6 ? 0 : Math.min(Math.abs(i11 - x), Math.abs(i11 - width));
                                    if (iMin < i16) {
                                        i16 = iMin;
                                        i15 = i17;
                                    }
                                }
                            }
                            i6 = -1;
                            if (i14 < 0) {
                                i14 = i15;
                            }
                            if (i14 < 0) {
                                int i18 = Integer.MAX_VALUE;
                                i14 = 0;
                                for (int i19 = 0; i19 < richMessageLayout2.textBlocks.size(); i19++) {
                                    TextLayoutBlock textLayoutBlock7 = richMessageLayout2.textBlocks.get(i19);
                                    int y3 = textLayoutBlock7.getY();
                                    int iMin2 = Math.min(Math.abs(i12 - y3), Math.abs(i12 - (textLayoutBlock7.getLayout().getHeight() + y3)));
                                    if (iMin2 < i18) {
                                        i14 = i19;
                                        i18 = iMin2;
                                    }
                                }
                            }
                            TextLayoutBlock textLayoutBlock8 = richMessageLayout2.textBlocks.get(i14);
                            layoutBlock2.layout = textLayoutBlock8.getLayout();
                            layoutBlock2.yOffset = textLayoutBlock8.getY();
                            layoutBlock2.xOffset = textLayoutBlock8.getX();
                            layoutBlock2.charOffset = richMessageLayout2.textBlockCharOffsets.get(i14).intValue();
                        }
                    }
                    layoutBlock = this.layoutBlock;
                    layout = layoutBlock.layout;
                    if (layout == null) {
                        return i6;
                    }
                    i7 = (int) (i11 - layoutBlock.xOffset);
                    i8 = 0;
                    while (true) {
                        if (i8 >= layout.getLineCount()) {
                            i8 = -1;
                            break;
                        }
                        f2 = i12;
                        if (f2 <= this.layoutBlock.yOffset + layout.getLineTop(i8) && f2 < this.layoutBlock.yOffset + layout.getLineBottom(i8)) {
                            break;
                        }
                        i8++;
                    }
                    if (i8 >= 0) {
                        return layout.getOffsetForHorizontal(i8, i7) + this.layoutBlock.charOffset;
                    }
                    return i6;
                }
                layoutBlock2.layout = chatMessageCell.getDescriptionlayout();
                layoutBlock2.xOffset = 0.0f;
                layoutBlock2.yOffset = 0.0f;
                layoutBlock2.charOffset = 0;
                i6 = -1;
                layoutBlock = this.layoutBlock;
                layout = layoutBlock.layout;
                if (layout == null) {
                    return i6;
                }
                i7 = (int) (i11 - layoutBlock.xOffset);
                i8 = 0;
                while (true) {
                    if (i8 >= layout.getLineCount()) {
                        i8 = -1;
                        break;
                    }
                    f2 = i12;
                    if (f2 <= this.layoutBlock.yOffset + layout.getLineTop(i8)) {
                    }
                    i8++;
                }
                if (i8 >= 0) {
                    return layout.getOffsetForHorizontal(i8, i7) + this.layoutBlock.charOffset;
                }
                return i6;
            }
            factCheckLayout = chatMessageCell.getDescriptionlayout();
            f = 0.0f;
            if (factCheckLayout == null) {
                return -1;
            }
            if (i12 < 0) {
                i12 = 1;
            }
            lineBottom = (int) (f + factCheckLayout.getLineBottom(factCheckLayout.getLineCount() - 1));
            if (i12 > lineBottom) {
                i12 = lineBottom - 1;
            }
            LayoutBlock layoutBlock3 = this.layoutBlock;
            messageObject = chatMessageCell.getMessageObject();
            if (z) {
                if (z) {
                    if (z) {
                        i6 = -1;
                        if (!chatMessageCell.hasCaptionLayout()) {
                            captionLayout = chatMessageCell.getCaptionLayout();
                            while (i10 < captionLayout.textLayoutBlocks.size()) {
                                textLayoutBlock2 = captionLayout.textLayoutBlocks.get(i10);
                                f4 = i12;
                                if (f4 < textLayoutBlock2.textYOffset(captionLayout.textLayoutBlocks)) {
                                }
                            }
                        } else {
                            while (i9 < messageObject.textLayoutBlocks.size()) {
                                textLayoutBlock = messageObject.textLayoutBlocks.get(i9);
                                f3 = i12;
                                if (f3 < textLayoutBlock.textYOffset(messageObject.textLayoutBlocks)) {
                                }
                            }
                        }
                    } else {
                        i6 = -1;
                        if (!chatMessageCell.hasCaptionLayout()) {
                            captionLayout = chatMessageCell.getCaptionLayout();
                            while (i10 < captionLayout.textLayoutBlocks.size()) {
                                textLayoutBlock2 = captionLayout.textLayoutBlocks.get(i10);
                                f4 = i12;
                                if (f4 < textLayoutBlock2.textYOffset(captionLayout.textLayoutBlocks)) {
                                }
                            }
                        } else {
                            while (i9 < messageObject.textLayoutBlocks.size()) {
                                textLayoutBlock = messageObject.textLayoutBlocks.get(i9);
                                f3 = i12;
                                if (f3 < textLayoutBlock.textYOffset(messageObject.textLayoutBlocks)) {
                                }
                            }
                        }
                    }
                } else if (z) {
                    i6 = -1;
                    if (!chatMessageCell.hasCaptionLayout()) {
                        captionLayout = chatMessageCell.getCaptionLayout();
                        while (i10 < captionLayout.textLayoutBlocks.size()) {
                            textLayoutBlock2 = captionLayout.textLayoutBlocks.get(i10);
                            f4 = i12;
                            if (f4 < textLayoutBlock2.textYOffset(captionLayout.textLayoutBlocks)) {
                            }
                        }
                    } else {
                        while (i9 < messageObject.textLayoutBlocks.size()) {
                            textLayoutBlock = messageObject.textLayoutBlocks.get(i9);
                            f3 = i12;
                            if (f3 < textLayoutBlock.textYOffset(messageObject.textLayoutBlocks)) {
                            }
                        }
                    }
                } else {
                    i6 = -1;
                    if (!chatMessageCell.hasCaptionLayout()) {
                        captionLayout = chatMessageCell.getCaptionLayout();
                        while (i10 < captionLayout.textLayoutBlocks.size()) {
                            textLayoutBlock2 = captionLayout.textLayoutBlocks.get(i10);
                            f4 = i12;
                            if (f4 < textLayoutBlock2.textYOffset(captionLayout.textLayoutBlocks)) {
                            }
                        }
                    } else {
                        while (i9 < messageObject.textLayoutBlocks.size()) {
                            textLayoutBlock = messageObject.textLayoutBlocks.get(i9);
                            f3 = i12;
                            if (f3 < textLayoutBlock.textYOffset(messageObject.textLayoutBlocks)) {
                            }
                        }
                    }
                }
            } else if (z) {
                if (z) {
                    i6 = -1;
                    if (!chatMessageCell.hasCaptionLayout()) {
                        captionLayout = chatMessageCell.getCaptionLayout();
                        while (i10 < captionLayout.textLayoutBlocks.size()) {
                            textLayoutBlock2 = captionLayout.textLayoutBlocks.get(i10);
                            f4 = i12;
                            if (f4 < textLayoutBlock2.textYOffset(captionLayout.textLayoutBlocks)) {
                            }
                        }
                    } else {
                        while (i9 < messageObject.textLayoutBlocks.size()) {
                            textLayoutBlock = messageObject.textLayoutBlocks.get(i9);
                            f3 = i12;
                            if (f3 < textLayoutBlock.textYOffset(messageObject.textLayoutBlocks)) {
                            }
                        }
                    }
                } else {
                    i6 = -1;
                    if (!chatMessageCell.hasCaptionLayout()) {
                        captionLayout = chatMessageCell.getCaptionLayout();
                        while (i10 < captionLayout.textLayoutBlocks.size()) {
                            textLayoutBlock2 = captionLayout.textLayoutBlocks.get(i10);
                            f4 = i12;
                            if (f4 < textLayoutBlock2.textYOffset(captionLayout.textLayoutBlocks)) {
                            }
                        }
                    } else {
                        while (i9 < messageObject.textLayoutBlocks.size()) {
                            textLayoutBlock = messageObject.textLayoutBlocks.get(i9);
                            f3 = i12;
                            if (f3 < textLayoutBlock.textYOffset(messageObject.textLayoutBlocks)) {
                            }
                        }
                    }
                }
            } else if (z) {
                i6 = -1;
                if (!chatMessageCell.hasCaptionLayout()) {
                    captionLayout = chatMessageCell.getCaptionLayout();
                    while (i10 < captionLayout.textLayoutBlocks.size()) {
                        textLayoutBlock2 = captionLayout.textLayoutBlocks.get(i10);
                        f4 = i12;
                        if (f4 < textLayoutBlock2.textYOffset(captionLayout.textLayoutBlocks)) {
                        }
                    }
                } else {
                    while (i9 < messageObject.textLayoutBlocks.size()) {
                        textLayoutBlock = messageObject.textLayoutBlocks.get(i9);
                        f3 = i12;
                        if (f3 < textLayoutBlock.textYOffset(messageObject.textLayoutBlocks)) {
                        }
                    }
                }
            } else {
                i6 = -1;
                if (!chatMessageCell.hasCaptionLayout()) {
                    captionLayout = chatMessageCell.getCaptionLayout();
                    while (i10 < captionLayout.textLayoutBlocks.size()) {
                        textLayoutBlock2 = captionLayout.textLayoutBlocks.get(i10);
                        f4 = i12;
                        if (f4 < textLayoutBlock2.textYOffset(captionLayout.textLayoutBlocks)) {
                        }
                    }
                } else {
                    while (i9 < messageObject.textLayoutBlocks.size()) {
                        textLayoutBlock = messageObject.textLayoutBlocks.get(i9);
                        f3 = i12;
                        if (f3 < textLayoutBlock.textYOffset(messageObject.textLayoutBlocks)) {
                        }
                    }
                }
            }
            layoutBlock = this.layoutBlock;
            layout = layoutBlock.layout;
            if (layout == null) {
                return i6;
            }
            i7 = (int) (i11 - layoutBlock.xOffset);
            i8 = 0;
            while (true) {
                if (i8 >= layout.getLineCount()) {
                    i8 = -1;
                    break;
                }
                f2 = i12;
                if (f2 <= this.layoutBlock.yOffset + layout.getLineTop(i8)) {
                }
                i8++;
            }
            if (i8 >= 0) {
                return layout.getOffsetForHorizontal(i8, i7) + this.layoutBlock.charOffset;
            }
            return i6;
        }

        @Override
        public CharSequence getText(ChatMessageCell chatMessageCell, boolean z) {
            if (chatMessageCell == null || chatMessageCell.getMessageObject() == null) {
                return null;
            }
            if (!z ? !this.isDescription : !this.maybeIsDescription) {
                return chatMessageCell.getDescriptionlayout().getText();
            }
            if (!z ? !this.isFactCheck : !this.maybeIsFactCheck) {
                return chatMessageCell.getFactCheckLayout().getText();
            }
            if (!z ? this.isRich : this.maybeIsRich) {
                return chatMessageCell.hasCaptionLayout() ? chatMessageCell.getCaptionLayout().text : chatMessageCell.getMessageObject().messageText;
            }
            RichMessageLayout richMessageLayout = chatMessageCell.getMessageObject().richLayout;
            return richMessageLayout != null ? richMessageLayout.joinedText : "";
        }

        @Override
        public void onTextSelected(ChatMessageCell chatMessageCell, ChatMessageCell chatMessageCell2) {
            int i = 1;
            boolean z = chatMessageCell2 == null || !(chatMessageCell2.getMessageObject() == null || chatMessageCell2.getMessageObject().getId() == chatMessageCell.getMessageObject().getId());
            this.selectedCellId = chatMessageCell.getMessageObject().getId();
            try {
                this.selectedCellEditDate = Integer.valueOf(chatMessageCell.getMessageObject().messageOwner.edit_date);
            } catch (Exception unused) {
                this.selectedCellEditDate = null;
            }
            this.enterProgress = 0.0f;
            this.isDescription = this.maybeIsDescription;
            this.isFactCheck = this.maybeIsFactCheck;
            this.isRich = this.maybeIsRich;
            Animator animator = this.animatorSparseArray.get(this.selectedCellId);
            if (animator != null) {
                animator.removeAllListeners();
                animator.cancel();
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.addUpdateListener(new ChatMessageCell$$ExternalSyntheticLambda13(this, z, i));
            valueAnimatorOfFloat.setDuration(250L);
            valueAnimatorOfFloat.start();
            this.animatorSparseArray.put(this.selectedCellId, valueAnimatorOfFloat);
            if (!z) {
                chatMessageCell.setSelectedBackgroundProgress(0.0f);
            }
            SharedConfig.removeTextSelectionHint();
        }

        public void drawCaption(boolean z, StaticLayout staticLayout, Canvas canvas) {
            if (this.isDescription || this.isFactCheck) {
                return;
            }
            if (z) {
                Paint paint = this.selectionPaint;
                int i = Theme.key_chat_outTextSelectionHighlight;
                paint.setColor(getThemedColor(i));
                this.selectionHandlePaint.setColor(getThemedColor(i));
            } else {
                Paint paint2 = this.selectionPaint;
                int i2 = Theme.key_chat_inTextSelectionHighlight;
                paint2.setColor(getThemedColor(i2));
                this.selectionHandlePaint.setColor(getThemedColor(i2));
            }
            drawSelection(canvas, staticLayout, this.selectionStart, this.selectionEnd, true, true, 0.0f);
        }
    }

    public final class IgnoreCopySpannable {
    }

    public final class LayoutBlock {
        public int charOffset;
        public Layout layout;
        public Rect selectionBounds;
        public float xOffset;
        public float yOffset;
    }

    public interface OnTranslateListener {
    }

    public final class PathCopyTo extends Path {
        public final Path destination;

        public PathCopyTo(Path path) {
            this.destination = path;
        }

        @Override
        public final void addRect(float f, float f2, float f3, float f4, Path.Direction direction) {
            this.destination.addRect(f, f2, f3, f4, direction);
        }
    }

    public final class PathWithSavedBottom extends Path {
        public float lastBottom;

        @Override
        public final void addRect(float f, float f2, float f3, float f4, Path.Direction direction) {
            super.addRect(f, f2, f3, f4, direction);
            if (f4 > this.lastBottom) {
                this.lastBottom = f4;
            }
        }

        @Override
        public final void reset() {
            super.reset();
            this.lastBottom = 0.0f;
        }
    }

    public final class ReplaceCopyTextSpannable {
        public final String replacement;

        public ReplaceCopyTextSpannable(String str) {
            this.replacement = str;
        }
    }

    public final class ScalablePath extends Path {
        public static ArrayList recycled;
        public float lastBottom = 0.0f;
        public final ArrayList rects = new ArrayList(1);
        public int rectsCount = 0;

        @Override
        public final void addRect(float f, float f2, float f3, float f4, Path.Direction direction) {
            ArrayList arrayList = recycled;
            RectF rectF = (arrayList == null || arrayList.size() <= 0) ? new RectF() : (RectF) recycled.remove(0);
            rectF.set(f, f2, f3, f4);
            this.rects.add(rectF);
            this.rectsCount++;
            super.addRect(f, f2, f3, f4, direction);
            if (f4 > this.lastBottom) {
                this.lastBottom = f4;
            }
        }

        @Override
        public final void reset() {
            super.reset();
            ArrayList arrayList = recycled;
            ArrayList arrayList2 = this.rects;
            if (arrayList == null) {
                recycled = new ArrayList(arrayList2.size());
            }
            recycled.addAll(arrayList2);
            arrayList2.clear();
            this.rectsCount = 0;
            this.lastBottom = 0.0f;
        }
    }

    public interface SelectableView {
        int getBottom();

        int getMeasuredWidth();

        int getTop();

        float getX();

        float getY();

        void invalidate();
    }

    public interface SimpleSelectabeleView extends SelectableView {
        Layout getStaticTextLayout();

        CharSequence getText();
    }

    public class SimpleTextSelectionHelper extends TextSelectionHelper {
        SimpleSelectabeleView selectabeleView;

        public SimpleTextSelectionHelper(SimpleSelectabeleView simpleSelectabeleView, Theme.ResourcesProvider resourcesProvider) {
            this.selectabeleView = simpleSelectabeleView;
            this.resourcesProvider = resourcesProvider;
        }

        public void draw(Canvas canvas) {
            Layout staticTextLayout = this.selectabeleView.getStaticTextLayout();
            int color = Theme.getColor(Theme.key_chat_textSelectBackground, this.resourcesProvider);
            this.selectionPaint.setColor(color);
            this.selectionHandlePaint.setColor(color);
            drawSelection(canvas, staticTextLayout, this.selectionStart, this.selectionEnd, true, true, 0.0f);
        }

        @Override
        public void fillLayoutForOffset(int i, LayoutBlock layoutBlock, boolean z) {
            layoutBlock.layout = this.selectabeleView.getStaticTextLayout();
            layoutBlock.yOffset = 0.0f;
            layoutBlock.xOffset = 0.0f;
            layoutBlock.charOffset = 0;
        }

        @Override
        public int getLineHeight() {
            Layout staticTextLayout = this.selectabeleView.getStaticTextLayout();
            return staticTextLayout.getLineBottom(0) - staticTextLayout.getLineTop(0);
        }

        public boolean isCurrent(SimpleSelectabeleView simpleSelectabeleView) {
            return this.selectabeleView == simpleSelectabeleView;
        }

        @Override
        public void onTextSelected(SimpleSelectabeleView simpleSelectabeleView, SimpleSelectabeleView simpleSelectabeleView2) {
        }

        public void setSelectabeleView(SimpleSelectabeleView simpleSelectabeleView) {
            this.selectabeleView = simpleSelectabeleView;
        }

        public void update(float f, float f2) {
            Layout staticTextLayout = this.selectabeleView.getStaticTextLayout();
            if (staticTextLayout == null) {
                this.textArea.setEmpty();
                this.maybeSelectedView = null;
                return;
            }
            this.maybeSelectedView = this.selectabeleView;
            int i = (int) f;
            this.maybeTextX = i;
            int i2 = (int) f2;
            this.maybeTextY = i2;
            LayoutBlock layoutBlock = this.layoutBlock;
            layoutBlock.layout = staticTextLayout;
            layoutBlock.xOffset = f;
            layoutBlock.yOffset = f2;
            layoutBlock.charOffset = 0;
            this.textArea.set(i, i2, (int) (f + staticTextLayout.getWidth()), (int) (f2 + staticTextLayout.getHeight()));
        }

        @Override
        public int getCharOffsetFromCord(int i, int i2, int i3, int i4, SimpleSelectabeleView simpleSelectabeleView, boolean z) {
            if (i2 < 0) {
                i2 = 1;
            }
            Layout staticTextLayout = simpleSelectabeleView.getStaticTextLayout();
            if (i2 > staticTextLayout.getLineBottom(staticTextLayout.getLineCount() - 1) + 0.0f) {
                i2 = (int) ((staticTextLayout.getLineBottom(staticTextLayout.getLineCount() - 1) + 0.0f) - 1.0f);
            }
            LayoutBlock layoutBlock = this.layoutBlock;
            Layout layout = layoutBlock.layout;
            if (layout == null) {
                return -1;
            }
            int i5 = (int) (i - layoutBlock.xOffset);
            int i6 = 0;
            while (i6 < layout.getLineCount()) {
                if (i2 > layout.getLineTop(i6) + i4 && i2 < layout.getLineBottom(i6) + i4) {
                    if (i6 >= 0) {
                        try {
                            return this.layoutBlock.charOffset + layout.getOffsetForHorizontal(i6, i5);
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                    }
                    return -1;
                }
                i6++;
            }
            i6 = -1;
            if (i6 >= 0) {
                return this.layoutBlock.charOffset + layout.getOffsetForHorizontal(i6, i5);
            }
            return -1;
        }

        @Override
        public CharSequence getText(SimpleSelectabeleView simpleSelectabeleView, boolean z) {
            return simpleSelectabeleView.getText();
        }
    }

    public interface TextLayoutBlock {
        Layout getLayout();

        CharSequence getPrefix();

        int getRow();

        Rect getSelectionBounds();

        CharSequence getText();

        int getX();

        int getY();
    }

    public final class TextSelectionOverlay extends View {
        public float cancelPressedX;
        public float cancelPressedY;
        public final ArrayList gestureExclusionRects;
        public final Paint handleViewPaint;
        public final Path path;
        public long pressedTime;
        public float pressedX;
        public float pressedY;

        public TextSelectionOverlay(Context context) {
            super(context);
            Paint paint = new Paint(1);
            this.handleViewPaint = paint;
            this.pressedTime = 0L;
            this.path = new Path();
            this.gestureExclusionRects = new ArrayList();
            paint.setStyle(Paint.Style.FILL);
        }

        public final void checkCancel(boolean z) {
            TextSelectionHelper textSelectionHelper = TextSelectionHelper.this;
            if (!z) {
                int i = textSelectionHelper.getCoordsInParent()[1];
            }
            if (textSelectionHelper.movingHandle || !textSelectionHelper.allowDiscard) {
                return;
            }
            textSelectionHelper.clear();
        }

        public final void checkCancelAction(MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            TextSelectionHelper textSelectionHelper = TextSelectionHelper.this;
            if (action == 0) {
                this.cancelPressedX = motionEvent.getX();
                this.cancelPressedY = motionEvent.getY();
                textSelectionHelper.allowDiscard = textSelectionHelper.isInSelectionMode();
            } else {
                if (!textSelectionHelper.allowDiscard || Math.abs(motionEvent.getX() - this.cancelPressedX) >= AndroidUtilities.touchSlop || Math.abs(motionEvent.getY() - this.cancelPressedY) >= AndroidUtilities.touchSlop) {
                    return;
                }
                if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
                    motionEvent.getX();
                    motionEvent.getY();
                    checkCancel(true);
                }
            }
        }

        public final boolean checkOnTap(MotionEvent motionEvent) {
            TextSelectionHelper textSelectionHelper = TextSelectionHelper.this;
            if (textSelectionHelper.isInSelectionMode() && !textSelectionHelper.movingHandle) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    this.pressedX = motionEvent.getX();
                    this.pressedY = motionEvent.getY();
                    this.pressedTime = System.currentTimeMillis();
                } else if (action == 1 && System.currentTimeMillis() - this.pressedTime < 200 && MathUtils.distance((int) this.pressedX, (int) this.pressedY, (int) motionEvent.getX(), (int) motionEvent.getY()) < textSelectionHelper.touchSlop) {
                    textSelectionHelper.onTapToDismiss(motionEvent.getRawX(), motionEvent.getRawY());
                    textSelectionHelper.hideActions();
                    textSelectionHelper.clear();
                    return true;
                }
            }
            return false;
        }

        @Override
        public final void invalidate() {
            ViewGroup viewGroup;
            super.invalidate();
            TextSelectionHelper textSelectionHelper = TextSelectionHelper.this;
            if (!textSelectionHelper.invalidateParent || (viewGroup = textSelectionHelper.parentView) == null) {
                return;
            }
            viewGroup.invalidate();
        }

        @Override
        public final void onDraw(Canvas canvas) {
            char c;
            int i;
            boolean zIsRtlCharAt;
            TextSelectionHelper textSelectionHelper = TextSelectionHelper.this;
            if (textSelectionHelper.isInSelectionMode()) {
                int iDp = AndroidUtilities.dp(22.0f);
                int i2 = textSelectionHelper.topOffset;
                textSelectionHelper.pickEndView();
                SelectableView selectableView = textSelectionHelper.selectedView;
                Paint paint = this.handleViewPaint;
                Path path = this.path;
                boolean zIsRtlCharAt2 = false;
                if (selectableView != null) {
                    canvas.save();
                    int[] coordsInParent = textSelectionHelper.getCoordsInParent();
                    float f = coordsInParent[1] + textSelectionHelper.textY;
                    float f2 = coordsInParent[0] + textSelectionHelper.textX;
                    canvas.translate(f2, f);
                    SelectableView selectableView2 = textSelectionHelper.selectedView;
                    MessageObject messageObject = selectableView2 instanceof ChatMessageCell ? ((ChatMessageCell) selectableView2).getMessageObject() : null;
                    if (messageObject == null || !messageObject.isOutOwner()) {
                        paint.setColor(textSelectionHelper.getThemedColor(Theme.key_chat_TextSelectionCursor));
                    } else {
                        paint.setColor(textSelectionHelper.getThemedColor(Theme.key_chat_outTextSelectionCursor));
                    }
                    int length = textSelectionHelper.getText(textSelectionHelper.selectedView, false).length();
                    int i3 = textSelectionHelper.selectionEnd;
                    if (i3 < 0 || i3 > length) {
                        c = 1;
                        i = 0;
                    } else {
                        textSelectionHelper.fillLayoutForOffset(i3, textSelectionHelper.layoutBlock);
                        LayoutBlock layoutBlock = textSelectionHelper.layoutBlock;
                        Layout layout = layoutBlock.layout;
                        if (layout != null) {
                            int i4 = textSelectionHelper.selectionEnd - layoutBlock.charOffset;
                            int length2 = layout.getText().length();
                            if (i4 > length2) {
                                i4 = length2;
                            }
                            int lineForOffset = layout.getLineForOffset(i4);
                            float primaryHorizontal = layout.getPrimaryHorizontal(i4);
                            float lineBottom = layout.getLineBottom(lineForOffset);
                            LayoutBlock layoutBlock2 = textSelectionHelper.layoutBlock;
                            c = 1;
                            int i5 = (int) (lineBottom + layoutBlock2.yOffset);
                            float f3 = primaryHorizontal + layoutBlock2.xOffset;
                            Rect rect = layoutBlock2.selectionBounds;
                            if (rect != null) {
                                f3 = rect.right - textSelectionHelper.textX;
                                i5 = rect.bottom - textSelectionHelper.textY;
                                zIsRtlCharAt = false;
                            } else {
                                zIsRtlCharAt = layout.isRtlCharAt(textSelectionHelper.selectionEnd);
                            }
                            float f4 = f3;
                            float f5 = i5;
                            float f6 = f5 + f;
                            if (f6 <= textSelectionHelper.keyboardSize + i2 || f6 >= textSelectionHelper.parentView.getMeasuredHeight()) {
                                textSelectionHelper.endArea.setEmpty();
                            } else if (zIsRtlCharAt) {
                                canvas.save();
                                float f7 = iDp;
                                canvas.translate(f4 - f7, f5);
                                float interpolation = textSelectionHelper.interpolator.getInterpolation(textSelectionHelper.handleViewProgress);
                                float f8 = f7 / 2.0f;
                                canvas.scale(interpolation, interpolation, f8, f8);
                                path.reset();
                                Path.Direction direction = Path.Direction.CCW;
                                path.addCircle(f8, f8, f8, direction);
                                path.addRect(f8, 0.0f, f7, f8, direction);
                                canvas.drawPath(path, paint);
                                canvas.restore();
                                float f9 = f2 + f4;
                                textSelectionHelper.endArea.set(f9 - f7, f6 - f7, f9, f6 + f7);
                                textSelectionHelper.endArea.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(8.0f));
                            } else {
                                canvas.save();
                                canvas.translate(f4, f5);
                                float interpolation2 = textSelectionHelper.interpolator.getInterpolation(textSelectionHelper.handleViewProgress);
                                float f10 = iDp;
                                float f11 = f10 / 2.0f;
                                canvas.scale(interpolation2, interpolation2, f11, f11);
                                path.reset();
                                Path.Direction direction2 = Path.Direction.CCW;
                                path.addCircle(f11, f11, f11, direction2);
                                path.addRect(0.0f, 0.0f, f11, f11, direction2);
                                canvas.drawPath(path, paint);
                                canvas.restore();
                                float f12 = f2 + f4;
                                textSelectionHelper.endArea.set(f12, f6 - f10, f12 + f10, f6 + f10);
                                textSelectionHelper.endArea.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(8.0f));
                                i = 1;
                            }
                        } else {
                            c = 1;
                        }
                        i = 0;
                    }
                    canvas.restore();
                } else {
                    c = 1;
                    i = 0;
                }
                textSelectionHelper.pickStartView();
                if (textSelectionHelper.selectedView != null) {
                    canvas.save();
                    int[] coordsInParent2 = textSelectionHelper.getCoordsInParent();
                    float f13 = coordsInParent2[c] + textSelectionHelper.textY;
                    float f14 = coordsInParent2[0] + textSelectionHelper.textX;
                    canvas.translate(f14, f13);
                    int length3 = textSelectionHelper.getText(textSelectionHelper.selectedView, false).length();
                    int i6 = textSelectionHelper.selectionStart;
                    if (i6 >= 0 && i6 <= length3) {
                        textSelectionHelper.fillLayoutForOffset(i6, textSelectionHelper.layoutBlock);
                        LayoutBlock layoutBlock3 = textSelectionHelper.layoutBlock;
                        Layout layout2 = layoutBlock3.layout;
                        if (layout2 != null) {
                            int i7 = textSelectionHelper.selectionStart - layoutBlock3.charOffset;
                            int lineForOffset2 = layout2.getLineForOffset(i7);
                            float primaryHorizontal2 = layout2.getPrimaryHorizontal(i7);
                            float lineBottom2 = layout2.getLineBottom(lineForOffset2);
                            LayoutBlock layoutBlock4 = textSelectionHelper.layoutBlock;
                            int i8 = (int) (lineBottom2 + layoutBlock4.yOffset);
                            float f15 = primaryHorizontal2 + layoutBlock4.xOffset;
                            Rect rect2 = layoutBlock4.selectionBounds;
                            if (rect2 != null) {
                                f15 = rect2.left - textSelectionHelper.textX;
                                i8 = rect2.bottom - textSelectionHelper.textY;
                            } else {
                                zIsRtlCharAt2 = layout2.isRtlCharAt(textSelectionHelper.selectionStart);
                            }
                            float f16 = f15;
                            float f17 = i8;
                            float f18 = f17 + f13;
                            if (f18 <= i2 + textSelectionHelper.keyboardSize || f18 >= textSelectionHelper.parentView.getMeasuredHeight()) {
                                if (f18 > 0.0f && f18 - textSelectionHelper.getLineHeight() < textSelectionHelper.parentView.getMeasuredHeight()) {
                                    i++;
                                }
                                textSelectionHelper.startArea.setEmpty();
                            } else if (zIsRtlCharAt2) {
                                canvas.save();
                                canvas.translate(f16, f17);
                                float interpolation3 = textSelectionHelper.interpolator.getInterpolation(textSelectionHelper.handleViewProgress);
                                float f19 = iDp;
                                float f20 = f19 / 2.0f;
                                canvas.scale(interpolation3, interpolation3, f20, f20);
                                path.reset();
                                Path.Direction direction3 = Path.Direction.CCW;
                                path.addCircle(f20, f20, f20, direction3);
                                path.addRect(0.0f, 0.0f, f20, f20, direction3);
                                canvas.drawPath(path, paint);
                                canvas.restore();
                                float f21 = f14 + f16;
                                textSelectionHelper.startArea.set(f21, f18 - f19, f21 + f19, f18 + f19);
                                textSelectionHelper.startArea.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(8.0f));
                            } else {
                                canvas.save();
                                float f22 = iDp;
                                canvas.translate(f16 - f22, f17);
                                float interpolation4 = textSelectionHelper.interpolator.getInterpolation(textSelectionHelper.handleViewProgress);
                                float f23 = f22 / 2.0f;
                                canvas.scale(interpolation4, interpolation4, f23, f23);
                                path.reset();
                                Path.Direction direction4 = Path.Direction.CCW;
                                path.addCircle(f23, f23, f23, direction4);
                                path.addRect(f23, 0.0f, f22, f23, direction4);
                                canvas.drawPath(path, paint);
                                canvas.restore();
                                float f24 = f14 + f16;
                                textSelectionHelper.startArea.set(f24 - f22, f18 - f22, f24, f18 + f22);
                                textSelectionHelper.startArea.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(8.0f));
                                i++;
                            }
                        }
                    }
                    canvas.restore();
                }
                int i9 = Build.VERSION.SDK_INT;
                if (i9 >= 29) {
                    ArrayList arrayList = this.gestureExclusionRects;
                    arrayList.clear();
                    RectF rectF = textSelectionHelper.startArea;
                    if (!rectF.isEmpty()) {
                        arrayList.add(new Rect((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom)));
                    }
                    RectF rectF2 = textSelectionHelper.endArea;
                    if (!rectF2.isEmpty()) {
                        arrayList.add(new Rect((int) Math.floor(rectF2.left), (int) Math.floor(rectF2.top), (int) Math.ceil(rectF2.right), (int) Math.ceil(rectF2.bottom)));
                    }
                    setSystemGestureExclusionRects(arrayList);
                }
                if (i != 0 && textSelectionHelper.movingHandle) {
                    if (!textSelectionHelper.movingHandleStart) {
                        textSelectionHelper.pickEndView();
                    }
                    TextSelectionHelper.access$1300(textSelectionHelper, textSelectionHelper.lastX);
                    if (textSelectionHelper.magnifierY != textSelectionHelper.magnifierYanimated || textSelectionHelper.magnifierX != textSelectionHelper.magnifierXanimated) {
                        invalidate();
                    }
                }
                if (!textSelectionHelper.parentIsScrolling) {
                    AndroidUtilities.cancelRunOnUIThread(textSelectionHelper.showActionsRunnable);
                    AndroidUtilities.runOnUIThread(textSelectionHelper.showActionsRunnable);
                }
                if (i9 >= 23 && textSelectionHelper.actionMode != null) {
                    textSelectionHelper.actionMode.invalidateContentRect();
                    if (textSelectionHelper.actionMode != null) {
                        ((FloatingActionMode) textSelectionHelper.actionMode).updateViewLocationInWindow();
                    }
                }
                if (textSelectionHelper.isOneTouch) {
                    invalidate();
                }
            }
        }

        @Override
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z;
            ViewParent parent;
            boolean z2;
            float measuredHeight;
            float f;
            CharSequence text;
            int i;
            Layout layout;
            Layout layout2;
            Layout layout3;
            Layout layout4;
            int i2;
            int i3;
            char cCharAt;
            char cCharAt2;
            TextSelectionHelper textSelectionHelper = TextSelectionHelper.this;
            if (!textSelectionHelper.isInSelectionMode()) {
                return false;
            }
            if (motionEvent.getPointerCount() > 1) {
                return textSelectionHelper.movingHandle;
            }
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int i4 = textSelectionHelper.lastX - x;
            textSelectionHelper.lastX = x;
            textSelectionHelper.lastY = y;
            int action = motionEvent.getAction();
            if (action == 0) {
                if (!textSelectionHelper.movingHandle) {
                    float f2 = x;
                    float f3 = y;
                    if (textSelectionHelper.startArea.contains(f2, f3)) {
                        textSelectionHelper.pickStartView();
                        if (textSelectionHelper.selectedView != null) {
                            textSelectionHelper.movingHandle = true;
                            textSelectionHelper.movingHandleStart = true;
                            ViewParent parent2 = getParent();
                            if (parent2 != null) {
                                parent2.requestDisallowInterceptTouchEvent(true);
                            }
                            int[] iArrOffsetToCord = textSelectionHelper.offsetToCord(textSelectionHelper.selectionStart);
                            float lineHeight = textSelectionHelper.getLineHeight() / 2;
                            int[] coordsInParent = textSelectionHelper.getCoordsInParent();
                            if (textSelectionHelper.useMovingOffset) {
                                textSelectionHelper.movingOffsetX = ((iArrOffsetToCord[0] + textSelectionHelper.textX) + coordsInParent[0]) - x;
                            } else {
                                textSelectionHelper.movingOffsetX = 0.0f;
                            }
                            textSelectionHelper.movingOffsetY = (((iArrOffsetToCord[1] + textSelectionHelper.textY) + coordsInParent[1]) - y) - lineHeight;
                            textSelectionHelper.hideActions();
                            textSelectionHelper.textSelectionOverlay.invalidate();
                            return true;
                        }
                    } else {
                        if (!textSelectionHelper.endArea.contains(f2, f3)) {
                            textSelectionHelper.movingHandle = false;
                            textSelectionHelper.allowDiscard = true;
                            return textSelectionHelper.movingHandle;
                        }
                        textSelectionHelper.pickEndView();
                        if (textSelectionHelper.selectedView != null) {
                            textSelectionHelper.movingHandle = true;
                            textSelectionHelper.movingHandleStart = false;
                            ViewParent parent3 = getParent();
                            if (parent3 != null) {
                                parent3.requestDisallowInterceptTouchEvent(true);
                            }
                            int[] iArrOffsetToCord2 = textSelectionHelper.offsetToCord(textSelectionHelper.selectionEnd);
                            float lineHeight2 = textSelectionHelper.getLineHeight() / 2;
                            int[] coordsInParent2 = textSelectionHelper.getCoordsInParent();
                            textSelectionHelper.movingOffsetX = ((iArrOffsetToCord2[0] + textSelectionHelper.textX) + coordsInParent2[0]) - x;
                            textSelectionHelper.movingOffsetY = (((iArrOffsetToCord2[1] + textSelectionHelper.textY) + coordsInParent2[1]) - y) - lineHeight2;
                            TextSelectionHelper.access$1300(textSelectionHelper, textSelectionHelper.lastX);
                            textSelectionHelper.hideActions();
                            textSelectionHelper.textSelectionOverlay.invalidate();
                            return true;
                        }
                    }
                    return false;
                }
                return true;
            }
            if (action == 1) {
                TextSelectionHelper.access$1600(textSelectionHelper);
                if (textSelectionHelper.movingHandle || (parent = getParent()) == null) {
                    z = false;
                } else {
                    z = false;
                    parent.requestDisallowInterceptTouchEvent(false);
                }
                textSelectionHelper.movingHandle = z;
                textSelectionHelper.movingDirectionSettling = z;
                textSelectionHelper.isOneTouch = z;
                if (textSelectionHelper.isInSelectionMode()) {
                    textSelectionHelper.textSelectionOverlay.invalidate();
                    AndroidUtilities.cancelRunOnUIThread(textSelectionHelper.showActionsRunnable);
                    AndroidUtilities.runOnUIThread(textSelectionHelper.showActionsRunnable);
                    textSelectionHelper.showHandleViews();
                }
                if (textSelectionHelper.scrolling) {
                    textSelectionHelper.scrolling = false;
                    AndroidUtilities.cancelRunOnUIThread(textSelectionHelper.scrollRunnable);
                }
            } else if (action != 2) {
                if (action == 3) {
                    TextSelectionHelper.access$1600(textSelectionHelper);
                    if (textSelectionHelper.movingHandle) {
                        z = false;
                    } else {
                        z = false;
                    }
                    textSelectionHelper.movingHandle = z;
                    textSelectionHelper.movingDirectionSettling = z;
                    textSelectionHelper.isOneTouch = z;
                    if (textSelectionHelper.isInSelectionMode()) {
                        textSelectionHelper.textSelectionOverlay.invalidate();
                        AndroidUtilities.cancelRunOnUIThread(textSelectionHelper.showActionsRunnable);
                        AndroidUtilities.runOnUIThread(textSelectionHelper.showActionsRunnable);
                        textSelectionHelper.showHandleViews();
                    }
                    if (textSelectionHelper.scrolling) {
                        textSelectionHelper.scrolling = false;
                        AndroidUtilities.cancelRunOnUIThread(textSelectionHelper.scrollRunnable);
                    }
                }
            } else if (textSelectionHelper.movingHandle) {
                if (textSelectionHelper.movingHandleStart) {
                    textSelectionHelper.pickStartView();
                } else {
                    textSelectionHelper.pickEndView();
                }
                if (textSelectionHelper.selectedView == null) {
                    return textSelectionHelper.movingHandle;
                }
                int i5 = (int) (x + textSelectionHelper.movingOffsetX);
                int i6 = (int) (y + textSelectionHelper.movingOffsetY);
                boolean zSelectLayout = textSelectionHelper.selectLayout(i5, i6);
                if (textSelectionHelper.selectedView != null) {
                    if (textSelectionHelper.movingHandleStart) {
                        textSelectionHelper.fillLayoutForOffset(textSelectionHelper.selectionStart, textSelectionHelper.layoutBlock);
                    } else {
                        textSelectionHelper.fillLayoutForOffset(textSelectionHelper.selectionEnd, textSelectionHelper.layoutBlock);
                    }
                    LayoutBlock layoutBlock = textSelectionHelper.layoutBlock;
                    if (layoutBlock.layout != null) {
                        float f4 = layoutBlock.yOffset;
                        SelectableView selectableView = textSelectionHelper.selectedView;
                        int[] coordsInParent3 = textSelectionHelper.getCoordsInParent();
                        int i7 = i6 - coordsInParent3[1];
                        int i8 = i5 - coordsInParent3[0];
                        boolean z3 = (textSelectionHelper.parentRecyclerView == null && textSelectionHelper.parentNestedScrollView == null) ? false : true;
                        boolean z4 = z3 && y - textSelectionHelper.touchSlop > textSelectionHelper.parentView.getMeasuredHeight() - textSelectionHelper.getParentBottomPadding() && (textSelectionHelper.allowScrollPrentRelative || textSelectionHelper.multiselect || textSelectionHelper.selectedView.getBottom() > textSelectionHelper.parentView.getMeasuredHeight() - textSelectionHelper.getParentBottomPadding());
                        if (!z3) {
                            z2 = false;
                        } else if (y >= textSelectionHelper.getParentTopPadding() + ((View) textSelectionHelper.parentView.getParent()).getTop() || (!textSelectionHelper.multiselect && textSelectionHelper.selectedView.getTop() >= textSelectionHelper.getParentTopPadding())) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        if (z4 || z2) {
                            if (!textSelectionHelper.scrolling) {
                                textSelectionHelper.scrolling = true;
                                AndroidUtilities.runOnUIThread(textSelectionHelper.scrollRunnable);
                            }
                            textSelectionHelper.scrollDown = z4;
                            if (z4) {
                                measuredHeight = textSelectionHelper.parentView.getMeasuredHeight() - textSelectionHelper.selectedView.getTop();
                                f = textSelectionHelper.movingOffsetY;
                            } else {
                                measuredHeight = -textSelectionHelper.selectedView.getTop();
                                f = textSelectionHelper.movingOffsetY;
                            }
                            i7 = (int) (measuredHeight + f);
                        } else if (textSelectionHelper.scrolling) {
                            textSelectionHelper.scrolling = false;
                            AndroidUtilities.cancelRunOnUIThread(textSelectionHelper.scrollRunnable);
                        }
                        int charOffsetFromCord = textSelectionHelper.getCharOffsetFromCord(i8, i7, textSelectionHelper.textX, textSelectionHelper.textY, textSelectionHelper.selectedView, false);
                        if (charOffsetFromCord >= 0) {
                            if (textSelectionHelper.movingDirectionSettling) {
                                if (!zSelectLayout) {
                                    if (charOffsetFromCord < textSelectionHelper.selectionStart) {
                                        textSelectionHelper.movingDirectionSettling = false;
                                        textSelectionHelper.movingHandleStart = true;
                                        textSelectionHelper.hideActions();
                                    } else if (charOffsetFromCord > textSelectionHelper.selectionEnd) {
                                        textSelectionHelper.movingDirectionSettling = false;
                                        textSelectionHelper.movingHandleStart = false;
                                        textSelectionHelper.hideActions();
                                    }
                                    if (textSelectionHelper.movingHandleStart) {
                                        if (textSelectionHelper.selectionStart != charOffsetFromCord) {
                                            CharSequence text2 = textSelectionHelper.getText(textSelectionHelper.selectedView, false);
                                            textSelectionHelper.fillLayoutForOffset(charOffsetFromCord, textSelectionHelper.layoutBlock);
                                            LayoutBlock layoutBlock2 = textSelectionHelper.layoutBlock;
                                            layout3 = layoutBlock2.layout;
                                            textSelectionHelper.fillLayoutForOffset(textSelectionHelper.selectionStart, layoutBlock2);
                                            layout4 = textSelectionHelper.layoutBlock.layout;
                                            if (layout3 != null) {
                                                i2 = charOffsetFromCord;
                                                while (true) {
                                                    i3 = i2 - 1;
                                                    if (i3 < 0) {
                                                        break;
                                                    }
                                                    break;
                                                    break;
                                                    i2--;
                                                }
                                                int lineForOffset = layout4.getLineForOffset(i2);
                                                int lineForOffset2 = layout4.getLineForOffset(textSelectionHelper.selectionStart);
                                                int lineForOffset3 = layout4.getLineForOffset(charOffsetFromCord);
                                                if (zSelectLayout) {
                                                    textSelectionHelper.jumpToLine(charOffsetFromCord, i2, zSelectLayout, textSelectionHelper.layoutBlock.yOffset, f4, selectableView);
                                                    AndroidUtilities.vibrateCursor(textSelectionHelper.textSelectionOverlay);
                                                    textSelectionHelper.invalidate();
                                                } else {
                                                    textSelectionHelper.jumpToLine(charOffsetFromCord, i2, zSelectLayout, textSelectionHelper.layoutBlock.yOffset, f4, selectableView);
                                                    AndroidUtilities.vibrateCursor(textSelectionHelper.textSelectionOverlay);
                                                    textSelectionHelper.invalidate();
                                                }
                                            }
                                        }
                                        textSelectionHelper.onOffsetChanged();
                                    } else {
                                        if (charOffsetFromCord != textSelectionHelper.selectionEnd) {
                                            text = textSelectionHelper.getText(textSelectionHelper.selectedView, false);
                                            i = charOffsetFromCord;
                                            while (i < text.length()) {
                                                i++;
                                            }
                                            textSelectionHelper.fillLayoutForOffset(charOffsetFromCord, textSelectionHelper.layoutBlock);
                                            LayoutBlock layoutBlock3 = textSelectionHelper.layoutBlock;
                                            layout = layoutBlock3.layout;
                                            textSelectionHelper.fillLayoutForOffset(textSelectionHelper.selectionEnd, layoutBlock3);
                                            layout2 = textSelectionHelper.layoutBlock.layout;
                                            if (layout != null) {
                                                if (charOffsetFromCord > text.length()) {
                                                    charOffsetFromCord = text.length();
                                                }
                                                int lineForOffset4 = layout2.getLineForOffset(i);
                                                int lineForOffset5 = layout2.getLineForOffset(textSelectionHelper.selectionEnd);
                                                int lineForOffset6 = layout2.getLineForOffset(charOffsetFromCord);
                                                if (zSelectLayout) {
                                                    textSelectionHelper.jumpToLine(charOffsetFromCord, i, zSelectLayout, textSelectionHelper.layoutBlock.yOffset, f4, selectableView);
                                                    AndroidUtilities.vibrateCursor(textSelectionHelper.textSelectionOverlay);
                                                    textSelectionHelper.invalidate();
                                                } else {
                                                    textSelectionHelper.jumpToLine(charOffsetFromCord, i, zSelectLayout, textSelectionHelper.layoutBlock.yOffset, f4, selectableView);
                                                    AndroidUtilities.vibrateCursor(textSelectionHelper.textSelectionOverlay);
                                                    textSelectionHelper.invalidate();
                                                }
                                            }
                                        }
                                        textSelectionHelper.onOffsetChanged();
                                    }
                                }
                            } else if (textSelectionHelper.movingHandleStart) {
                                if (textSelectionHelper.selectionStart != charOffsetFromCord && textSelectionHelper.canSelect(charOffsetFromCord)) {
                                    CharSequence text3 = textSelectionHelper.getText(textSelectionHelper.selectedView, false);
                                    textSelectionHelper.fillLayoutForOffset(charOffsetFromCord, textSelectionHelper.layoutBlock);
                                    LayoutBlock layoutBlock4 = textSelectionHelper.layoutBlock;
                                    layout3 = layoutBlock4.layout;
                                    textSelectionHelper.fillLayoutForOffset(textSelectionHelper.selectionStart, layoutBlock4);
                                    layout4 = textSelectionHelper.layoutBlock.layout;
                                    if (layout3 != null && layout4 != null) {
                                        i2 = charOffsetFromCord;
                                        while (true) {
                                            i3 = i2 - 1;
                                            if (i3 < 0 || !TextSelectionHelper.isInterruptedCharacter(text3.charAt(i3))) {
                                                break;
                                            }
                                            i2--;
                                        }
                                        int lineForOffset7 = layout4.getLineForOffset(i2);
                                        int lineForOffset8 = layout4.getLineForOffset(textSelectionHelper.selectionStart);
                                        int lineForOffset9 = layout4.getLineForOffset(charOffsetFromCord);
                                        if (zSelectLayout || layout3 != layout4 || (lineForOffset9 != layout4.getLineForOffset(textSelectionHelper.selectionStart) && lineForOffset9 == lineForOffset7)) {
                                            textSelectionHelper.jumpToLine(charOffsetFromCord, i2, zSelectLayout, textSelectionHelper.layoutBlock.yOffset, f4, selectableView);
                                            AndroidUtilities.vibrateCursor(textSelectionHelper.textSelectionOverlay);
                                            textSelectionHelper.invalidate();
                                        } else if (-1 == layout4.getParagraphDirection(layout4.getLineForOffset(charOffsetFromCord)) || layout4.isRtlCharAt(charOffsetFromCord) || lineForOffset7 != lineForOffset8 || lineForOffset9 != lineForOffset7) {
                                            textSelectionHelper.selectionStart = charOffsetFromCord;
                                            int i9 = textSelectionHelper.selectionEnd;
                                            if (charOffsetFromCord > i9) {
                                                textSelectionHelper.selectionEnd = charOffsetFromCord;
                                                textSelectionHelper.selectionStart = i9;
                                                textSelectionHelper.movingHandleStart = false;
                                            }
                                            AndroidUtilities.vibrateCursor(textSelectionHelper.textSelectionOverlay);
                                            textSelectionHelper.invalidate();
                                        } else {
                                            int i10 = charOffsetFromCord;
                                            while (true) {
                                                int i11 = i10 + 1;
                                                if (i11 >= text3.length() || !TextSelectionHelper.isInterruptedCharacter(text3.charAt(i11))) {
                                                    break;
                                                }
                                                i10 = i11;
                                            }
                                            int iAbs = Math.abs(charOffsetFromCord - i2);
                                            int iAbs2 = Math.abs(charOffsetFromCord - i10);
                                            if (textSelectionHelper.snap) {
                                                textSelectionHelper.snap = i4 >= 0;
                                            }
                                            int i12 = charOffsetFromCord - 1;
                                            boolean z5 = i12 > 0 && TextSelectionHelper.isInterruptedCharacter(text3.charAt(i12));
                                            if (charOffsetFromCord >= text3.length()) {
                                                charOffsetFromCord = text3.length();
                                                cCharAt = '\n';
                                            } else {
                                                cCharAt = text3.charAt(charOffsetFromCord);
                                            }
                                            if (textSelectionHelper.selectionStart >= text3.length()) {
                                                textSelectionHelper.selectionStart = text3.length();
                                                cCharAt2 = '\n';
                                            } else {
                                                cCharAt2 = text3.charAt(textSelectionHelper.selectionStart);
                                            }
                                            int i13 = textSelectionHelper.selectionStart;
                                            if ((charOffsetFromCord < i13 && iAbs < iAbs2) || ((charOffsetFromCord > i13 && i4 < 0) || !TextSelectionHelper.isInterruptedCharacter(cCharAt) || ((TextSelectionHelper.isInterruptedCharacter(cCharAt2) && !textSelectionHelper.snap) || charOffsetFromCord == 0 || !z5 || cCharAt2 == '\n'))) {
                                                if (!textSelectionHelper.snap || charOffsetFromCord != 1) {
                                                    if (charOffsetFromCord >= textSelectionHelper.selectionStart || !TextSelectionHelper.isInterruptedCharacter(cCharAt) || ((TextSelectionHelper.isInterruptedCharacter(cCharAt2) && !textSelectionHelper.snap) || cCharAt2 == '\n')) {
                                                        textSelectionHelper.selectionStart = charOffsetFromCord;
                                                    } else {
                                                        textSelectionHelper.selectionStart = i2;
                                                        textSelectionHelper.snap = true;
                                                    }
                                                    int i14 = textSelectionHelper.selectionStart;
                                                    int i15 = textSelectionHelper.selectionEnd;
                                                    if (i14 > i15) {
                                                        textSelectionHelper.selectionEnd = i14;
                                                        textSelectionHelper.selectionStart = i15;
                                                        textSelectionHelper.movingHandleStart = false;
                                                    }
                                                    AndroidUtilities.vibrateCursor(textSelectionHelper.textSelectionOverlay);
                                                    textSelectionHelper.invalidate();
                                                }
                                            }
                                        }
                                    }
                                }
                                textSelectionHelper.onOffsetChanged();
                            } else {
                                if (charOffsetFromCord != textSelectionHelper.selectionEnd && textSelectionHelper.canSelect(charOffsetFromCord)) {
                                    text = textSelectionHelper.getText(textSelectionHelper.selectedView, false);
                                    i = charOffsetFromCord;
                                    while (i < text.length() && TextSelectionHelper.isInterruptedCharacter(text.charAt(i))) {
                                        i++;
                                    }
                                    textSelectionHelper.fillLayoutForOffset(charOffsetFromCord, textSelectionHelper.layoutBlock);
                                    LayoutBlock layoutBlock5 = textSelectionHelper.layoutBlock;
                                    layout = layoutBlock5.layout;
                                    textSelectionHelper.fillLayoutForOffset(textSelectionHelper.selectionEnd, layoutBlock5);
                                    layout2 = textSelectionHelper.layoutBlock.layout;
                                    if (layout != null && layout2 != null) {
                                        if (charOffsetFromCord > text.length()) {
                                            charOffsetFromCord = text.length();
                                        }
                                        int lineForOffset10 = layout2.getLineForOffset(i);
                                        int lineForOffset11 = layout2.getLineForOffset(textSelectionHelper.selectionEnd);
                                        int lineForOffset12 = layout2.getLineForOffset(charOffsetFromCord);
                                        if (zSelectLayout || layout != layout2 || (lineForOffset12 != layout2.getLineForOffset(textSelectionHelper.selectionEnd) && lineForOffset12 == lineForOffset10)) {
                                            textSelectionHelper.jumpToLine(charOffsetFromCord, i, zSelectLayout, textSelectionHelper.layoutBlock.yOffset, f4, selectableView);
                                            AndroidUtilities.vibrateCursor(textSelectionHelper.textSelectionOverlay);
                                            textSelectionHelper.invalidate();
                                        } else if (-1 == layout2.getParagraphDirection(layout2.getLineForOffset(charOffsetFromCord)) || layout2.isRtlCharAt(charOffsetFromCord) || lineForOffset11 != lineForOffset10 || lineForOffset12 != lineForOffset10) {
                                            textSelectionHelper.selectionEnd = charOffsetFromCord;
                                            int i16 = textSelectionHelper.selectionStart;
                                            if (i16 > charOffsetFromCord) {
                                                textSelectionHelper.selectionEnd = i16;
                                                textSelectionHelper.selectionStart = charOffsetFromCord;
                                                textSelectionHelper.movingHandleStart = true;
                                            }
                                            AndroidUtilities.vibrateCursor(textSelectionHelper.textSelectionOverlay);
                                            textSelectionHelper.invalidate();
                                        } else {
                                            int i17 = charOffsetFromCord;
                                            while (true) {
                                                int i18 = i17 - 1;
                                                if (i18 < 0 || !TextSelectionHelper.isInterruptedCharacter(text.charAt(i18))) {
                                                    break;
                                                }
                                                i17--;
                                            }
                                            int iAbs3 = Math.abs(charOffsetFromCord - i);
                                            int iAbs4 = Math.abs(charOffsetFromCord - i17);
                                            int i19 = charOffsetFromCord - 1;
                                            boolean z6 = i19 > 0 && TextSelectionHelper.isInterruptedCharacter(text.charAt(i19));
                                            if (textSelectionHelper.snap) {
                                                textSelectionHelper.snap = i4 <= 0;
                                            }
                                            int i20 = textSelectionHelper.selectionEnd;
                                            boolean z7 = i20 > 0 && TextSelectionHelper.isInterruptedCharacter(text.charAt(i20 - 1));
                                            int i21 = textSelectionHelper.selectionEnd;
                                            if ((charOffsetFromCord > i21 && iAbs3 <= iAbs4) || ((charOffsetFromCord < i21 && i4 > 0) || !z6 || (z7 && !textSelectionHelper.snap))) {
                                                if (charOffsetFromCord <= textSelectionHelper.selectionEnd || !z6 || (z7 && !textSelectionHelper.snap)) {
                                                    textSelectionHelper.selectionEnd = charOffsetFromCord;
                                                } else {
                                                    textSelectionHelper.selectionEnd = i;
                                                    textSelectionHelper.snap = true;
                                                }
                                                int i22 = textSelectionHelper.selectionStart;
                                                int i23 = textSelectionHelper.selectionEnd;
                                                if (i22 > i23) {
                                                    textSelectionHelper.selectionEnd = i22;
                                                    textSelectionHelper.selectionStart = i23;
                                                    textSelectionHelper.movingHandleStart = true;
                                                }
                                                AndroidUtilities.vibrateCursor(textSelectionHelper.textSelectionOverlay);
                                                textSelectionHelper.invalidate();
                                            }
                                        }
                                    }
                                }
                                textSelectionHelper.onOffsetChanged();
                            }
                        }
                        TextSelectionHelper.access$1300(textSelectionHelper, textSelectionHelper.lastX);
                    }
                }
                return true;
            }
            return textSelectionHelper.movingHandle;
        }
    }

    public TextSelectionHelper() {
        PathWithSavedBottom pathWithSavedBottom = new PathWithSavedBottom();
        pathWithSavedBottom.lastBottom = 0.0f;
        this.path = pathWithSavedBottom;
        this.selectionPaint = new Paint(1);
        this.selectionHandlePaint = new Paint(1);
        this.selectionPath = new CornerPath();
        this.selectionHandlePath = new Path();
        this.selectionPathMirror = new PathCopyTo(this.selectionPath);
        this.selectionStart = -1;
        this.selectionEnd = -1;
        final AnonymousClass4 anonymousClass4 = new AnonymousClass4();
        this.textSelectActionCallback = Build.VERSION.SDK_INT >= 23 ? new ActionMode.Callback2() {
            @Override
            public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
                anonymousClass4.onActionItemClicked(actionMode, menuItem);
                return true;
            }

            @Override
            public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
                anonymousClass4.onCreateActionMode(actionMode, menu);
                return true;
            }

            @Override
            public final void onDestroyActionMode(ActionMode actionMode) {
                anonymousClass4.onDestroyActionMode(actionMode);
            }

            @Override
            public final void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
                int i;
                if (TextSelectionHelper.this.isInSelectionMode()) {
                    TextSelectionHelper.this.pickStartView();
                    int[] coordsInParent = TextSelectionHelper.this.getCoordsInParent();
                    TextSelectionHelper textSelectionHelper = TextSelectionHelper.this;
                    int i2 = 1;
                    if (textSelectionHelper.selectedView != null) {
                        int i3 = -textSelectionHelper.getLineHeight();
                        TextSelectionHelper textSelectionHelper2 = TextSelectionHelper.this;
                        int[] iArrOffsetToCord = textSelectionHelper2.offsetToCord(textSelectionHelper2.selectionStart);
                        int i4 = iArrOffsetToCord[0];
                        TextSelectionHelper textSelectionHelper3 = TextSelectionHelper.this;
                        i = i4 + textSelectionHelper3.textX;
                        int iDp = ((i3 / 2) + ((iArrOffsetToCord[1] + textSelectionHelper3.textY) + coordsInParent[1])) - AndroidUtilities.dp(4.0f);
                        if (iDp >= 1) {
                            i2 = iDp;
                        }
                    } else {
                        i = 0;
                    }
                    int width = TextSelectionHelper.this.parentView.getWidth();
                    TextSelectionHelper.this.pickEndView();
                    TextSelectionHelper textSelectionHelper4 = TextSelectionHelper.this;
                    if (textSelectionHelper4.selectedView != null) {
                        width = textSelectionHelper4.offsetToCord(textSelectionHelper4.selectionEnd)[0] + TextSelectionHelper.this.textX;
                    }
                    rect.set(Math.min(i, width), i2, Math.max(i, width), i2 + 1);
                }
            }

            @Override
            public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
                anonymousClass4.onPrepareActionMode(actionMode, menu);
                return true;
            }
        } : anonymousClass4;
        this.textArea = new Rect();
        this.startArea = new RectF();
        this.endArea = new RectF();
        this.layoutBlock = new LayoutBlock();
        this.interpolator = new OvershootInterpolator();
        this.showActionsAsPopupAlways = false;
        final int i = 0;
        this.scrollRunnable = new Runnable(this) {
            public final TextSelectionHelper this$0;

            {
                this.this$0 = this;
            }

            @Override
            public final void run() {
                int lineHeight;
                int bottom;
                int parentTopPadding;
                switch (i) {
                    case 0:
                        TextSelectionHelper textSelectionHelper = this.this$0;
                        if (textSelectionHelper.scrolling) {
                            if (textSelectionHelper.parentRecyclerView != null || textSelectionHelper.parentNestedScrollView != null) {
                                if (textSelectionHelper.multiselect && textSelectionHelper.selectedView == null) {
                                    lineHeight = AndroidUtilities.dp(8.0f);
                                } else if (textSelectionHelper.selectedView != null) {
                                    lineHeight = textSelectionHelper.getLineHeight() >> 1;
                                }
                                if (!textSelectionHelper.multiselect && !textSelectionHelper.allowScrollPrentRelative) {
                                    if (textSelectionHelper.scrollDown) {
                                        if (textSelectionHelper.selectedView.getBottom() - lineHeight < textSelectionHelper.parentView.getMeasuredHeight() - textSelectionHelper.getParentBottomPadding()) {
                                            bottom = textSelectionHelper.selectedView.getBottom() - textSelectionHelper.parentView.getMeasuredHeight();
                                            parentTopPadding = textSelectionHelper.getParentBottomPadding();
                                            lineHeight = bottom + parentTopPadding;
                                        }
                                    } else if (textSelectionHelper.selectedView.getTop() + lineHeight > textSelectionHelper.getParentTopPadding()) {
                                        bottom = -textSelectionHelper.selectedView.getTop();
                                        parentTopPadding = textSelectionHelper.getParentTopPadding();
                                        lineHeight = bottom + parentTopPadding;
                                    }
                                }
                                RecyclerListView recyclerListView = textSelectionHelper.parentRecyclerView;
                                if (recyclerListView != null) {
                                    recyclerListView.scrollBy(0, textSelectionHelper.scrollDown ? lineHeight : -lineHeight);
                                }
                                NestedScrollView nestedScrollView = textSelectionHelper.parentNestedScrollView;
                                if (nestedScrollView != null) {
                                    int scrollY = nestedScrollView.getScrollY();
                                    if (!textSelectionHelper.scrollDown) {
                                        lineHeight = -lineHeight;
                                    }
                                    nestedScrollView.setScrollY(scrollY + lineHeight);
                                }
                                AndroidUtilities.runOnUIThread(this);
                            }
                        }
                        break;
                    default:
                        if (Build.VERSION.SDK_INT >= 23) {
                            TextSelectionHelper textSelectionHelper2 = this.this$0;
                            if (textSelectionHelper2.actionMode != null && !textSelectionHelper2.actionsIsShowing) {
                                textSelectionHelper2.actionMode.hide(Long.MAX_VALUE);
                                AndroidUtilities.runOnUIThread(textSelectionHelper2.hideActionsRunnable, 1000L);
                                break;
                            }
                        }
                        break;
                }
            }
        };
        this.startSelectionRunnable = new Runnable() {
            @Override
            public final void run() {
                TextSelectionHelper textSelectionHelper = TextSelectionHelper.this;
                SelectableView selectableView = textSelectionHelper.maybeSelectedView;
                if (selectableView == null || textSelectionHelper.textSelectionOverlay == null) {
                    return;
                }
                SelectableView selectableView2 = textSelectionHelper.selectedView;
                CharSequence text = textSelectionHelper.getText(selectableView, true);
                RecyclerListView recyclerListView = textSelectionHelper.parentRecyclerView;
                if (recyclerListView != null) {
                    recyclerListView.cancelClickRunnables(false);
                }
                int i2 = textSelectionHelper.capturedX;
                int i3 = textSelectionHelper.capturedY;
                if (!textSelectionHelper.textArea.isEmpty()) {
                    Rect rect = textSelectionHelper.textArea;
                    int i4 = rect.right;
                    if (i2 > i4) {
                        i2 = i4 - 1;
                    }
                    int i5 = rect.left;
                    if (i2 < i5) {
                        i2 = i5 + 1;
                    }
                    int i6 = rect.top;
                    if (i3 < i6) {
                        i3 = i6 + 1;
                    }
                    int i7 = rect.bottom;
                    if (i3 > i7) {
                        i3 = i7 - 1;
                    }
                }
                int charOffsetFromCord = textSelectionHelper.getCharOffsetFromCord(i2, i3, textSelectionHelper.maybeTextX, textSelectionHelper.maybeTextY, selectableView, true);
                if (charOffsetFromCord >= text.length()) {
                    textSelectionHelper.fillLayoutForOffset(charOffsetFromCord, textSelectionHelper.layoutBlock, true);
                    Layout layout = textSelectionHelper.layoutBlock.layout;
                    if (layout == null) {
                        textSelectionHelper.selectionEnd = -1;
                        textSelectionHelper.selectionStart = -1;
                        return;
                    } else {
                        int lineCount = layout.getLineCount() - 1;
                        float f = i2 - textSelectionHelper.maybeTextX;
                        if (f < textSelectionHelper.layoutBlock.layout.getLineRight(lineCount) + AndroidUtilities.dp(4.0f) && f > textSelectionHelper.layoutBlock.layout.getLineLeft(lineCount)) {
                            charOffsetFromCord = text.length() - 1;
                        }
                    }
                }
                if (charOffsetFromCord >= 0 && charOffsetFromCord < text.length() && text.charAt(charOffsetFromCord) != '\n') {
                    int i8 = textSelectionHelper.maybeTextX;
                    int i9 = textSelectionHelper.maybeTextY;
                    textSelectionHelper.clear();
                    textSelectionHelper.textSelectionOverlay.setVisibility(0);
                    textSelectionHelper.onTextSelected(selectableView, selectableView2);
                    textSelectionHelper.selectionStart = charOffsetFromCord;
                    textSelectionHelper.selectionEnd = charOffsetFromCord;
                    if (text instanceof Spanned) {
                        Spanned spanned = (Spanned) text;
                        Emoji.EmojiSpan[] emojiSpanArr = (Emoji.EmojiSpan[]) spanned.getSpans(0, text.length(), Emoji.EmojiSpan.class);
                        int length = emojiSpanArr.length;
                        int i10 = 0;
                        while (true) {
                            if (i10 >= length) {
                                for (AnimatedEmojiSpan animatedEmojiSpan : (AnimatedEmojiSpan[]) spanned.getSpans(0, text.length(), AnimatedEmojiSpan.class)) {
                                    int spanStart = spanned.getSpanStart(animatedEmojiSpan);
                                    int spanEnd = spanned.getSpanEnd(animatedEmojiSpan);
                                    if (charOffsetFromCord >= spanStart && charOffsetFromCord <= spanEnd) {
                                        textSelectionHelper.selectionStart = spanStart;
                                        textSelectionHelper.selectionEnd = spanEnd;
                                        break;
                                    }
                                }
                                break;
                            }
                            Emoji.EmojiSpan emojiSpan = emojiSpanArr[i10];
                            int spanStart2 = spanned.getSpanStart(emojiSpan);
                            int spanEnd2 = spanned.getSpanEnd(emojiSpan);
                            if (charOffsetFromCord >= spanStart2 && charOffsetFromCord <= spanEnd2) {
                                textSelectionHelper.selectionStart = spanStart2;
                                textSelectionHelper.selectionEnd = spanEnd2;
                                break;
                            }
                            i10++;
                        }
                    }
                    if (textSelectionHelper.selectionStart == textSelectionHelper.selectionEnd) {
                        while (true) {
                            int i11 = textSelectionHelper.selectionStart;
                            if (i11 <= 0 || !TextSelectionHelper.isInterruptedCharacter(text.charAt(i11 - 1))) {
                                break;
                            } else {
                                textSelectionHelper.selectionStart--;
                            }
                        }
                        while (textSelectionHelper.selectionEnd < text.length() && TextSelectionHelper.isInterruptedCharacter(text.charAt(textSelectionHelper.selectionEnd))) {
                            textSelectionHelper.selectionEnd++;
                        }
                    }
                    textSelectionHelper.textX = i8;
                    textSelectionHelper.textY = i9;
                    textSelectionHelper.selectedView = selectableView;
                    try {
                        textSelectionHelper.textSelectionOverlay.performHapticFeedback(0, 1);
                    } catch (Exception unused) {
                    }
                    AndroidUtilities.cancelRunOnUIThread(textSelectionHelper.showActionsRunnable);
                    AndroidUtilities.runOnUIThread(textSelectionHelper.showActionsRunnable);
                    textSelectionHelper.showHandleViews();
                    textSelectionHelper.invalidate();
                    if (selectableView2 != null) {
                        selectableView2.invalidate();
                    }
                    Callback callback = textSelectionHelper.callback;
                    if (callback != null) {
                        callback.onStateChanged(true);
                    }
                    textSelectionHelper.movingHandle = true;
                    textSelectionHelper.movingDirectionSettling = true;
                    textSelectionHelper.isOneTouch = true;
                    textSelectionHelper.movingOffsetY = 0.0f;
                    textSelectionHelper.movingOffsetX = 0.0f;
                    textSelectionHelper.onOffsetChanged();
                }
                textSelectionHelper.tryCapture = false;
                textSelectionHelper.allowDiscard = false;
            }
        };
        this.useMovingOffset = true;
        this.onTranslateListener = null;
        this.showActionsRunnable = new ChatbotSheet$$ExternalSyntheticLambda0(this, 12);
        final int i2 = 1;
        this.hideActionsRunnable = new Runnable(this) {
            public final TextSelectionHelper this$0;

            {
                this.this$0 = this;
            }

            @Override
            public final void run() {
                int lineHeight;
                int bottom;
                int parentTopPadding;
                switch (i2) {
                    case 0:
                        TextSelectionHelper textSelectionHelper = this.this$0;
                        if (textSelectionHelper.scrolling) {
                            if (textSelectionHelper.parentRecyclerView != null || textSelectionHelper.parentNestedScrollView != null) {
                                if (textSelectionHelper.multiselect && textSelectionHelper.selectedView == null) {
                                    lineHeight = AndroidUtilities.dp(8.0f);
                                } else if (textSelectionHelper.selectedView != null) {
                                    lineHeight = textSelectionHelper.getLineHeight() >> 1;
                                }
                                if (!textSelectionHelper.multiselect && !textSelectionHelper.allowScrollPrentRelative) {
                                    if (textSelectionHelper.scrollDown) {
                                        if (textSelectionHelper.selectedView.getBottom() - lineHeight < textSelectionHelper.parentView.getMeasuredHeight() - textSelectionHelper.getParentBottomPadding()) {
                                            bottom = textSelectionHelper.selectedView.getBottom() - textSelectionHelper.parentView.getMeasuredHeight();
                                            parentTopPadding = textSelectionHelper.getParentBottomPadding();
                                            lineHeight = bottom + parentTopPadding;
                                        }
                                    } else if (textSelectionHelper.selectedView.getTop() + lineHeight > textSelectionHelper.getParentTopPadding()) {
                                        bottom = -textSelectionHelper.selectedView.getTop();
                                        parentTopPadding = textSelectionHelper.getParentTopPadding();
                                        lineHeight = bottom + parentTopPadding;
                                    }
                                }
                                RecyclerListView recyclerListView = textSelectionHelper.parentRecyclerView;
                                if (recyclerListView != null) {
                                    recyclerListView.scrollBy(0, textSelectionHelper.scrollDown ? lineHeight : -lineHeight);
                                }
                                NestedScrollView nestedScrollView = textSelectionHelper.parentNestedScrollView;
                                if (nestedScrollView != null) {
                                    int scrollY = nestedScrollView.getScrollY();
                                    if (!textSelectionHelper.scrollDown) {
                                        lineHeight = -lineHeight;
                                    }
                                    nestedScrollView.setScrollY(scrollY + lineHeight);
                                }
                                AndroidUtilities.runOnUIThread(this);
                            }
                        }
                        break;
                    default:
                        if (Build.VERSION.SDK_INT >= 23) {
                            TextSelectionHelper textSelectionHelper2 = this.this$0;
                            if (textSelectionHelper2.actionMode != null && !textSelectionHelper2.actionsIsShowing) {
                                textSelectionHelper2.actionMode.hide(Long.MAX_VALUE);
                                AndroidUtilities.runOnUIThread(textSelectionHelper2.hideActionsRunnable, 1000L);
                                break;
                            }
                        }
                        break;
                }
            }
        };
        this.tempPath2 = new ScalablePath();
        this.longpressDelay = ViewConfiguration.getLongPressTimeout();
        this.touchSlop = ViewConfiguration.get(ApplicationLoader.applicationContext).getScaledTouchSlop();
        Paint paint = this.selectionPaint;
        float fDp = AndroidUtilities.dp(6.0f);
        this.cornerRadius = fDp;
        paint.setPathEffect(new CornerPathEffect(fDp));
        this.selectionPath.setRectsUnionDiffDelta(1.0f);
    }

    public static void access$1300(TextSelectionHelper textSelectionHelper, int i) {
        int lineRight;
        int i2;
        textSelectionHelper.getClass();
        if (Build.VERSION.SDK_INT < 28 || textSelectionHelper.selectedView == null || textSelectionHelper.isOneTouch || !textSelectionHelper.movingHandle || textSelectionHelper.textSelectionOverlay == null) {
            return;
        }
        int i3 = textSelectionHelper.movingHandleStart ? textSelectionHelper.selectionStart : textSelectionHelper.selectionEnd;
        textSelectionHelper.fillLayoutForOffset(i3, textSelectionHelper.layoutBlock);
        LayoutBlock layoutBlock = textSelectionHelper.layoutBlock;
        Layout layout = layoutBlock.layout;
        if (layout == null) {
            return;
        }
        int lineForOffset = layout.getLineForOffset(Utilities.clamp(i3 - layoutBlock.charOffset, layout.getText().length(), 0));
        int lineBottom = layout.getLineBottom(lineForOffset) - layout.getLineTop(lineForOffset);
        int[] coordsInParent = textSelectionHelper.getCoordsInParent();
        float lineTop = (((layout.getLineTop(lineForOffset) + textSelectionHelper.textY) + coordsInParent[1]) - lineBottom) - AndroidUtilities.dp(8.0f);
        LayoutBlock layoutBlock2 = textSelectionHelper.layoutBlock;
        int i4 = (int) (lineTop + layoutBlock2.yOffset);
        SelectableView selectableView = textSelectionHelper.selectedView;
        if (selectableView instanceof ArticleViewer.BlockTableCell) {
            i2 = coordsInParent[0];
            lineRight = selectableView.getMeasuredWidth() + i2;
        } else {
            int lineLeft = (int) (layout.getLineLeft(lineForOffset) + coordsInParent[0] + textSelectionHelper.textX + layoutBlock2.xOffset);
            lineRight = (int) (layout.getLineRight(lineForOffset) + coordsInParent[0] + textSelectionHelper.textX + textSelectionHelper.layoutBlock.xOffset);
            i2 = lineLeft;
        }
        if (i < i2) {
            i = i2;
        } else if (i > lineRight) {
            i = lineRight;
        }
        float f = i4;
        if (textSelectionHelper.magnifierY != f) {
            textSelectionHelper.magnifierY = f;
            textSelectionHelper.magnifierDy = (f - textSelectionHelper.magnifierYanimated) / 200.0f;
        }
        float f2 = i;
        if (textSelectionHelper.magnifierX != f2) {
            textSelectionHelper.magnifierX = f2;
            textSelectionHelper.magnifierDx = (f2 - textSelectionHelper.magnifierXanimated) / 100.0f;
        }
        if (textSelectionHelper.magnifier == null) {
            CastSync$$ExternalSyntheticApiModelOutline0.m1178m();
            textSelectionHelper.magnifier = CastSync$$ExternalSyntheticApiModelOutline0.m((View) textSelectionHelper.textSelectionOverlay);
            textSelectionHelper.magnifierYanimated = textSelectionHelper.magnifierY;
            textSelectionHelper.magnifierXanimated = textSelectionHelper.magnifierX;
        }
        float f3 = textSelectionHelper.magnifierYanimated;
        float f4 = textSelectionHelper.magnifierY;
        if (f3 != f4) {
            textSelectionHelper.magnifierYanimated = (textSelectionHelper.magnifierDy * 16.0f) + f3;
        }
        float f5 = textSelectionHelper.magnifierDy;
        if (f5 > 0.0f && textSelectionHelper.magnifierYanimated > f4) {
            textSelectionHelper.magnifierYanimated = f4;
        } else if (f5 < 0.0f && textSelectionHelper.magnifierYanimated < f4) {
            textSelectionHelper.magnifierYanimated = f4;
        }
        float f6 = textSelectionHelper.magnifierXanimated;
        float f7 = textSelectionHelper.magnifierX;
        if (f6 != f7) {
            textSelectionHelper.magnifierXanimated = (textSelectionHelper.magnifierDx * 16.0f) + f6;
        }
        float f8 = textSelectionHelper.magnifierDx;
        if (f8 > 0.0f && textSelectionHelper.magnifierXanimated > f7) {
            textSelectionHelper.magnifierXanimated = f7;
        } else if (f8 < 0.0f && textSelectionHelper.magnifierXanimated < f7) {
            textSelectionHelper.magnifierXanimated = f7;
        }
        textSelectionHelper.magnifier.show(textSelectionHelper.magnifierXanimated, (lineBottom * 1.5f) + textSelectionHelper.magnifierYanimated + AndroidUtilities.dp(8.0f));
        textSelectionHelper.magnifier.update();
    }

    public static void access$1600(TextSelectionHelper textSelectionHelper) {
        Magnifier magnifier;
        textSelectionHelper.getClass();
        if (Build.VERSION.SDK_INT < 28 || (magnifier = textSelectionHelper.magnifier) == null) {
            return;
        }
        magnifier.dismiss();
        textSelectionHelper.magnifier = null;
    }

    public static void access$2600(TextSelectionHelper textSelectionHelper) {
        if (textSelectionHelper.isInSelectionMode()) {
            if (!textSelectionHelper.onCopyOverride()) {
                CharSequence selectedText = textSelectionHelper.getSelectedText();
                if (selectedText == null) {
                    return;
                } else {
                    AndroidUtilities.addToClipboard(selectedText);
                }
            }
            textSelectionHelper.hideActions();
            textSelectionHelper.clear(true);
            Callback callback = textSelectionHelper.callback;
            if (callback != null) {
                callback.onTextCopied();
            }
        }
    }

    public static void access$2700(TextSelectionHelper textSelectionHelper) {
        CharSequence selectedText;
        if (textSelectionHelper.isInSelectionMode()) {
            SelectableView selectableView = textSelectionHelper.selectedView;
            MessageObject messageObject = selectableView instanceof ChatMessageCell ? ((ChatMessageCell) selectableView).getMessageObject() : null;
            if (messageObject == null || (selectedText = textSelectionHelper.getSelectedText()) == null) {
                return;
            }
            textSelectionHelper.onQuoteClick(messageObject, textSelectionHelper.selectionStart, textSelectionHelper.selectionEnd, selectedText);
            textSelectionHelper.clear(true);
        }
    }

    public static boolean isInterruptedCharacter(char c) {
        return Character.isLetter(c) || Character.isDigit(c) || c == '_';
    }

    public boolean canCopy() {
        return true;
    }

    public boolean canCut() {
        return false;
    }

    public boolean canPaste() {
        return false;
    }

    public boolean canSelect(int i) {
        return (i == this.selectionStart || i == this.selectionEnd) ? false : true;
    }

    public boolean canShowActions() {
        return this.selectedView != null;
    }

    public boolean canShowQuote() {
        return false;
    }

    public void cancelTextSelectionRunnable() {
        AndroidUtilities.cancelRunOnUIThread(this.startSelectionRunnable);
        this.tryCapture = false;
    }

    public void checkSelectionCancel(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            cancelTextSelectionRunnable();
        }
    }

    public void clear() {
        clear(false);
    }

    public boolean clipboardHasContent() {
        ClipboardManager clipboardManager;
        try {
            TextSelectionOverlay textSelectionOverlay = this.textSelectionOverlay;
            Context context = textSelectionOverlay != null ? textSelectionOverlay.getContext() : ApplicationLoader.applicationContext;
            return (context == null || (clipboardManager = (ClipboardManager) context.getSystemService("clipboard")) == null || !clipboardManager.hasPrimaryClip()) ? false : true;
        } catch (Exception unused) {
            return false;
        }
    }

    public final void drawLine(Layout layout, int i, int i2, int i3, boolean z, boolean z2, float f) {
        float f2;
        float f3;
        int i4;
        this.tempPath2.reset();
        layout.getSelectionPath(i2, i3, this.tempPath2);
        if (this.tempPath2.lastBottom < layout.getLineBottom(i)) {
            int lineTop = layout.getLineTop(i);
            float lineBottom = layout.getLineBottom(i) - lineTop;
            f3 = lineTop;
            f2 = lineBottom / (this.tempPath2.lastBottom - f3);
        } else {
            f2 = 1.0f;
            f3 = 0.0f;
        }
        int i5 = 0;
        while (true) {
            ScalablePath scalablePath = this.tempPath2;
            i4 = scalablePath.rectsCount;
            if (i5 >= i4) {
                break;
            }
            RectF rectF = (RectF) scalablePath.rects.get(i5);
            rectF.set((int) (Math.max(f, rectF.left) - (z ? this.cornerRadius / 2.0f : 0.0f)), (int) DiffUtil.m(rectF.top, f3, f2, f3), (int) (Math.max(f, rectF.right) + (z2 ? this.cornerRadius / 2.0f : 0.0f)), (int) DiffUtil.m(rectF.bottom, f3, f2, f3));
            this.selectionPath.addRect(rectF, Path.Direction.CW);
            i5++;
        }
        if (i4 != 0 || z2) {
            return;
        }
        try {
            int primaryHorizontal = (int) layout.getPrimaryHorizontal(i2);
            int primaryHorizontal2 = (int) layout.getPrimaryHorizontal(i3);
            int lineTop2 = layout.getLineTop(i);
            int lineBottom2 = layout.getLineBottom(i);
            CornerPath cornerPath = this.selectionPath;
            float f4 = this.cornerRadius;
            cornerPath.addRect(primaryHorizontal - (f4 / 2.0f), lineTop2, (f4 / 4.0f) + primaryHorizontal2, lineBottom2, Path.Direction.CW);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void drawSelection(Canvas canvas, Layout layout, int i, int i2, boolean z, boolean z2, float f) {
        int i3;
        Rect rect;
        TextSelectionHelper textSelectionHelper;
        int i4;
        int i5;
        int i6;
        float lineRight;
        if (layout == null || layout.getText() == null) {
            return;
        }
        int iClamp = Utilities.clamp(i, layout.getText().length(), 0);
        int iClamp2 = Utilities.clamp(i2, layout.getText().length(), 0);
        this.selectionPath.reset();
        this.selectionHandlePath.reset();
        float f2 = this.cornerRadius;
        float f3 = f2 * 1.65f;
        int i7 = (int) (f2 / 2.0f);
        int lineForOffset = layout.getLineForOffset(iClamp);
        int lineForOffset2 = layout.getLineForOffset(iClamp2);
        if (lineForOffset == lineForOffset2) {
            drawLine(layout, lineForOffset, iClamp, iClamp2, !z, !z2, f);
            textSelectionHelper = this;
            i4 = lineForOffset;
            i6 = lineForOffset2;
        } else {
            int lineEnd = layout.getLineEnd(lineForOffset);
            if (layout.getParagraphDirection(lineForOffset) == -1 || lineEnd <= 0) {
                i3 = lineEnd;
            } else {
                i3 = lineEnd - 1;
                CharSequence text = layout.getText();
                int primaryHorizontal = (int) layout.getPrimaryHorizontal(i3);
                if (layout.isRtlCharAt(i3)) {
                    int i8 = i3;
                    while (layout.isRtlCharAt(i8) && i8 != 0) {
                        i8--;
                    }
                    lineRight = layout.getLineForOffset(i8) == layout.getLineForOffset(i3) ? layout.getPrimaryHorizontal(i8 + 1) : layout.getLineLeft(lineForOffset);
                } else {
                    lineRight = layout.getLineRight(lineForOffset);
                }
                int i9 = (int) lineRight;
                int iMin = Math.min(primaryHorizontal, i9);
                int iMax = Math.max(primaryHorizontal, i9);
                if (i3 > 0 && i3 < text.length() && !Character.isWhitespace(text.charAt(lineEnd - 2))) {
                    rect = new Rect(((int) Math.max(f, iMin)) - i7, layout.getLineTop(lineForOffset), ((int) Math.max(f, iMax)) + i7, layout.getLineBottom(lineForOffset));
                }
                textSelectionHelper = this;
                textSelectionHelper.drawLine(layout, lineForOffset, iClamp, i3, !z, true, f);
                i4 = lineForOffset;
                if (rect != null) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(rect);
                    textSelectionHelper.selectionPath.addRect(rectF, Path.Direction.CW);
                }
                for (i5 = i4 + 1; i5 < lineForOffset2; i5++) {
                    int lineLeft = (int) layout.getLineLeft(i5);
                    int lineRight2 = (int) layout.getLineRight(i5);
                    float f4 = i7;
                    textSelectionHelper.selectionPath.addRect(Math.max(f, Math.min(lineLeft, lineRight2)) - f4, layout.getLineTop(i5), Math.max(f, Math.max(lineLeft, lineRight2)) + f4, layout.getLineBottom(i5) + 1, Path.Direction.CW);
                }
                i6 = lineForOffset2;
                iClamp2 = iClamp2;
                textSelectionHelper.drawLine(layout, i6, layout.getLineStart(lineForOffset2), iClamp2, true, !z2, f);
            }
            rect = null;
            textSelectionHelper = this;
            textSelectionHelper.drawLine(layout, lineForOffset, iClamp, i3, !z, true, f);
            i4 = lineForOffset;
            if (rect != null) {
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(rect);
                textSelectionHelper.selectionPath.addRect(rectF2, Path.Direction.CW);
            }
            while (i5 < lineForOffset2) {
                int lineLeft2 = (int) layout.getLineLeft(i5);
                int lineRight3 = (int) layout.getLineRight(i5);
                float f5 = i7;
                textSelectionHelper.selectionPath.addRect(Math.max(f, Math.min(lineLeft2, lineRight3)) - f5, layout.getLineTop(i5), Math.max(f, Math.max(lineLeft2, lineRight3)) + f5, layout.getLineBottom(i5) + 1, Path.Direction.CW);
            }
            i6 = lineForOffset2;
            iClamp2 = iClamp2;
            textSelectionHelper.drawLine(layout, i6, layout.getLineStart(lineForOffset2), iClamp2, true, !z2, f);
        }
        int i10 = Build.VERSION.SDK_INT;
        boolean z3 = i10 >= 26;
        if (z3) {
            canvas.save();
        }
        float primaryHorizontal2 = layout.getPrimaryHorizontal(iClamp);
        float primaryHorizontal3 = layout.getPrimaryHorizontal(iClamp2);
        float lineBottom = layout.getLineBottom(i4);
        float lineBottom2 = layout.getLineBottom(i6);
        if (z && z2 && lineBottom == lineBottom2 && Math.abs(primaryHorizontal3 - primaryHorizontal2) < f3) {
            float fMin = Math.min(primaryHorizontal2, primaryHorizontal3);
            float fMax = Math.max(primaryHorizontal2, primaryHorizontal3);
            Rect rect2 = AndroidUtilities.rectTmp2;
            rect2.set((int) fMin, (int) (lineBottom - f3), (int) fMax, (int) lineBottom);
            RectF rectF3 = AndroidUtilities.rectTmp;
            rectF3.set(rect2);
            textSelectionHelper.selectionHandlePath.addRect(rectF3, Path.Direction.CW);
            if (i10 >= 26) {
                canvas.clipOutRect(rect2);
            }
        } else {
            if (z && !layout.isRtlCharAt(iClamp)) {
                Rect rect3 = AndroidUtilities.rectTmp2;
                rect3.set((int) primaryHorizontal2, (int) (lineBottom - f3), (int) Math.min(primaryHorizontal2 + f3, layout.getLineRight(i4)), (int) lineBottom);
                RectF rectF4 = AndroidUtilities.rectTmp;
                rectF4.set(rect3);
                textSelectionHelper.selectionHandlePath.addRect(rectF4, Path.Direction.CW);
                if (i10 >= 26) {
                    rect3.set(rect3.left - ((int) f3), rect3.top, rect3.right, rect3.bottom);
                    canvas.clipOutRect(rect3);
                }
            }
            if (z2 && !layout.isRtlCharAt(iClamp2)) {
                Rect rect4 = AndroidUtilities.rectTmp2;
                rect4.set((int) Math.max(primaryHorizontal3 - f3, layout.getLineLeft(i6)), (int) (lineBottom2 - f3), (int) primaryHorizontal3, (int) lineBottom2);
                RectF rectF5 = AndroidUtilities.rectTmp;
                rectF5.set(rect4);
                textSelectionHelper.selectionHandlePath.addRect(rectF5, Path.Direction.CW);
                if (i10 >= 26) {
                    canvas.clipOutRect(rect4);
                }
            }
        }
        textSelectionHelper.selectionPath.closeRects();
        canvas.drawPath(textSelectionHelper.selectionPath, textSelectionHelper.selectionPaint);
        if (z3) {
            canvas.restore();
            canvas.drawPath(textSelectionHelper.selectionHandlePath, textSelectionHelper.selectionHandlePaint);
        }
    }

    public void fillLayoutForOffset(int i, LayoutBlock layoutBlock) {
        fillLayoutForOffset(i, layoutBlock, false);
    }

    public abstract void fillLayoutForOffset(int i, LayoutBlock layoutBlock, boolean z);

    public void finishOneTouchSelection() {
        if (isInSelectionMode()) {
            this.movingHandle = false;
            this.movingDirectionSettling = false;
            this.isOneTouch = false;
            TextSelectionOverlay textSelectionOverlay = this.textSelectionOverlay;
            if (textSelectionOverlay != null) {
                textSelectionOverlay.invalidate();
            }
            AndroidUtilities.cancelRunOnUIThread(this.showActionsRunnable);
            AndroidUtilities.runOnUIThread(this.showActionsRunnable);
        }
    }

    public boolean forceShowSelectAll() {
        return false;
    }

    public abstract int getCharOffsetFromCord(int i, int i2, int i3, int i4, SelectableView selectableView, boolean z);

    public final int[] getCoordsInParent() {
        int y;
        View view = (View) this.selectedView;
        int i = 0;
        if (view != null && this.parentView != null) {
            y = 0;
            int x = 0;
            while (true) {
                if (view == this.parentView) {
                    i = x;
                    break;
                }
                if (view != null) {
                    y = (int) (view.getY() + y);
                    x = (int) (view.getX() + x);
                    if (view instanceof NestedScrollView) {
                        y -= view.getScrollY();
                        x -= view.getScrollX();
                    }
                    if (view.getParent() instanceof View) {
                        view = (View) view.getParent();
                    }
                }
                y = 0;
                break;
            }
        }
        y = 0;
        break;
        return new int[]{i, y};
    }

    public abstract int getLineHeight();

    public TextSelectionOverlay getOverlayView(Context context) {
        if (this.textSelectionOverlay == null) {
            this.textSelectionOverlay = new TextSelectionOverlay(context);
        }
        return this.textSelectionOverlay;
    }

    public int getParentBottomPadding() {
        return 0;
    }

    public int getParentTopPadding() {
        return 0;
    }

    public Theme.ResourcesProvider getResourcesProvider() {
        return this.resourcesProvider;
    }

    public SelectableView getSelectedCell() {
        return this.selectedView;
    }

    public CharSequence getSelectedText() {
        CharSequence text = getText(this.selectedView, false);
        if (text != null) {
            return text.subSequence(this.selectionStart, this.selectionEnd);
        }
        return null;
    }

    public abstract CharSequence getText(SelectableView selectableView, boolean z);

    public int getThemedColor(int i) {
        return Theme.getColor(i, this.resourcesProvider);
    }

    public void hideActions() {
        ActionMode actionMode;
        if (Build.VERSION.SDK_INT >= 23) {
            if (this.actionMode != null && this.actionsIsShowing) {
                this.actionsIsShowing = false;
                this.hideActionsRunnable.run();
            }
            this.actionsIsShowing = false;
        }
        if (!isInSelectionMode() && (actionMode = this.actionMode) != null) {
            actionMode.finish();
            this.actionMode = null;
        }
        ActionBarPopupWindow actionBarPopupWindow = this.popupWindow;
        if (actionBarPopupWindow != null) {
            actionBarPopupWindow.dismiss();
        }
    }

    public void hideActionsMenu() {
        AndroidUtilities.cancelRunOnUIThread(this.showActionsRunnable);
        hideActions();
    }

    public void invalidate() {
        SelectableView selectableView = this.selectedView;
        if (selectableView != null) {
            selectableView.invalidate();
        }
        TextSelectionOverlay textSelectionOverlay = this.textSelectionOverlay;
        if (textSelectionOverlay != null) {
            textSelectionOverlay.invalidate();
        }
    }

    public boolean isInSelectionMode() {
        return this.selectionStart >= 0 && this.selectionEnd >= 0;
    }

    public boolean isSelectable(View view) {
        return true;
    }

    public boolean isSelected(MessageObject messageObject) {
        return messageObject != null && this.selectedCellId == messageObject.getId();
    }

    public boolean isTryingSelect() {
        return this.tryCapture;
    }

    public void jumpToLine(int i, int i2, boolean z, float f, float f2, SelectableView selectableView) {
        int i3;
        int i4;
        if (this.movingHandleStart) {
            this.selectionStart = i2;
            if (!z && i2 > (i4 = this.selectionEnd)) {
                this.selectionEnd = i2;
                this.selectionStart = i4;
                this.movingHandleStart = false;
            }
            this.snap = true;
            return;
        }
        this.selectionEnd = i2;
        if (!z && (i3 = this.selectionStart) > i2) {
            this.selectionEnd = i3;
            this.selectionStart = i2;
            this.movingHandleStart = true;
        }
        this.snap = true;
    }

    public final void lambda$new$1() {
        this.textSelectionOverlay.invalidate();
        showActions();
    }

    public final boolean lambda$showActions$2(View view, MotionEvent motionEvent) {
        ActionBarPopupWindow actionBarPopupWindow;
        if (motionEvent.getActionMasked() != 0 || (actionBarPopupWindow = this.popupWindow) == null || !actionBarPopupWindow.isShowing()) {
            return false;
        }
        view.getHitRect(this.popupRect);
        return false;
    }

    public final void lambda$showActions$3(View view) {
        if (isInSelectionMode()) {
            if (!onCopyOverride()) {
                CharSequence selectedText = getSelectedText();
                if (selectedText == null) {
                    return;
                } else {
                    AndroidUtilities.addToClipboard(selectedText);
                }
            }
            hideActions();
            clear(true);
            Callback callback = this.callback;
            if (callback != null) {
                callback.onTextCopied();
            }
        }
    }

    public final void lambda$showActions$4(View view) {
        onCutAction();
        hideActions();
    }

    public final void lambda$showActions$5(View view) {
        onPasteAction();
        hideActions();
    }

    public final void lambda$showHandleViews$0(ValueAnimator valueAnimator) {
        this.handleViewProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.textSelectionOverlay.invalidate();
    }

    public int[] offsetToCord(int i) {
        fillLayoutForOffset(i, this.layoutBlock);
        LayoutBlock layoutBlock = this.layoutBlock;
        Layout layout = layoutBlock.layout;
        int i2 = i - layoutBlock.charOffset;
        if (layout == null || i2 < 0 || i2 > layout.getText().length()) {
            return this.tmpCoord;
        }
        int lineForOffset = layout.getLineForOffset(i2);
        this.tmpCoord[0] = (int) (layout.getPrimaryHorizontal(i2) + this.layoutBlock.xOffset);
        this.tmpCoord[1] = layout.getLineBottom(lineForOffset);
        int[] iArr = this.tmpCoord;
        iArr[1] = (int) (iArr[1] + this.layoutBlock.yOffset);
        return iArr;
    }

    public boolean onCopyOverride() {
        return false;
    }

    public void onCutAction() {
    }

    public void onExitSelectionMode(boolean z) {
    }

    public void onOffsetChanged() {
    }

    public void onParentScrolled() {
        TextSelectionOverlay textSelectionOverlay;
        if (!isInSelectionMode() || (textSelectionOverlay = this.textSelectionOverlay) == null) {
            return;
        }
        this.parentIsScrolling = true;
        textSelectionOverlay.invalidate();
        hideActions();
    }

    public void onPasteAction() {
    }

    public void onQuoteClick(MessageObject messageObject, int i, int i2, CharSequence charSequence) {
    }

    public boolean onSelectAllOverride() {
        return false;
    }

    public void onTapToDismiss(float f, float f2) {
    }

    public abstract void onTextSelected(SelectableView selectableView, SelectableView selectableView2);

    public boolean onTouchEvent(MotionEvent motionEvent) {
        TextSelectionHelper textSelectionHelper;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    int y = (int) motionEvent.getY();
                    int x = (int) motionEvent.getX();
                    int i = this.capturedY - y;
                    int i2 = this.capturedX - x;
                    int i3 = (i2 * i2) + (i * i);
                    int i4 = this.touchSlop;
                    if (i3 > i4 * i4) {
                        AndroidUtilities.cancelRunOnUIThread(this.startSelectionRunnable);
                        this.tryCapture = false;
                    }
                    return this.tryCapture;
                }
                if (action != 3) {
                    return false;
                }
            }
            AndroidUtilities.cancelRunOnUIThread(this.startSelectionRunnable);
            this.tryCapture = false;
            return false;
        }
        this.capturedX = (int) motionEvent.getX();
        this.capturedY = (int) motionEvent.getY();
        this.tryCapture = false;
        this.textArea.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(8.0f));
        if (!this.textArea.contains(this.capturedX, this.capturedY) || this.maybeSelectedView == null) {
            textSelectionHelper = this;
        } else {
            this.textArea.inset(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            int i5 = this.capturedX;
            int i6 = this.capturedY;
            Rect rect = this.textArea;
            int i7 = rect.right;
            if (i5 > i7) {
                i5 = i7 - 1;
            }
            int i8 = rect.left;
            if (i5 < i8) {
                i5 = i8 + 1;
            }
            int i9 = i5;
            int i10 = rect.top;
            if (i6 < i10) {
                i6 = i10 + 1;
            }
            int i11 = rect.bottom;
            if (i6 > i11) {
                i6 = i11 - 1;
            }
            textSelectionHelper = this;
            int charOffsetFromCord = textSelectionHelper.getCharOffsetFromCord(i9, i6, this.maybeTextX, this.maybeTextY, this.maybeSelectedView, true);
            CharSequence text = getText(textSelectionHelper.maybeSelectedView, true);
            if (charOffsetFromCord >= text.length()) {
                fillLayoutForOffset(charOffsetFromCord, textSelectionHelper.layoutBlock, true);
                Layout layout = textSelectionHelper.layoutBlock.layout;
                if (layout == null) {
                    textSelectionHelper.tryCapture = false;
                    return false;
                }
                int lineCount = layout.getLineCount() - 1;
                float f = i9 - textSelectionHelper.maybeTextX;
                if (f < textSelectionHelper.layoutBlock.layout.getLineRight(lineCount) + AndroidUtilities.dp(4.0f) && f > textSelectionHelper.layoutBlock.layout.getLineLeft(lineCount)) {
                    charOffsetFromCord = text.length() - 1;
                }
            }
            if (charOffsetFromCord >= 0 && charOffsetFromCord < text.length() && text.charAt(charOffsetFromCord) != '\n') {
                AndroidUtilities.cancelRunOnUIThread(textSelectionHelper.startSelectionRunnable);
                AndroidUtilities.runOnUIThread(textSelectionHelper.startSelectionRunnable, textSelectionHelper.longpressDelay);
                textSelectionHelper.tryCapture = true;
            }
        }
        return textSelectionHelper.tryCapture;
    }

    public void pickEndView() {
    }

    public void pickStartView() {
    }

    public boolean selectLayout(int i, int i2) {
        return false;
    }

    public void setCallback(Callback callback) {
        this.callback = callback;
    }

    public void setInvalidateParent() {
        this.invalidateParent = true;
    }

    public void setKeyboardSize(int i) {
        this.keyboardSize = i;
        invalidate();
    }

    public void setMaybeTextCord(int i, int i2) {
        this.maybeTextX = i;
        this.maybeTextY = i2;
    }

    public void setOnTranslate(OnTranslateListener onTranslateListener) {
        this.onTranslateListener = onTranslateListener;
    }

    public void setParentView(ViewGroup viewGroup) {
        if (viewGroup instanceof RecyclerListView) {
            this.parentRecyclerView = (RecyclerListView) viewGroup;
        }
        this.parentView = viewGroup;
    }

    public void setScrollingParent(View view) {
        if (view instanceof NestedScrollView) {
            this.parentNestedScrollView = (NestedScrollView) view;
        }
    }

    public void setTopOffset(int i) {
        this.topOffset = i;
    }

    public final void showActions() {
        int iDp;
        if (this.textSelectionOverlay == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            if (!this.movingHandle && isInSelectionMode() && canShowActions()) {
                if (!this.actionsIsShowing) {
                    if (this.actionMode == null) {
                        FloatingActionMode floatingActionMode = new FloatingActionMode(this.textSelectionOverlay.getContext(), Theme$$ExternalSyntheticApiModelOutline1.m(this.textSelectActionCallback), this.textSelectionOverlay, new FloatingToolbar(this.textSelectionOverlay.getContext(), this.textSelectionOverlay, 1, getResourcesProvider(), null));
                        this.actionMode = floatingActionMode;
                        this.textSelectActionCallback.onCreateActionMode(floatingActionMode, floatingActionMode.mMenu);
                    }
                    ActionMode.Callback callback = this.textSelectActionCallback;
                    ActionMode actionMode = this.actionMode;
                    callback.onPrepareActionMode(actionMode, actionMode.getMenu());
                    this.actionMode.hide(1L);
                }
                AndroidUtilities.cancelRunOnUIThread(this.hideActionsRunnable);
                this.actionsIsShowing = true;
                return;
            }
            return;
        }
        if (!this.showActionsAsPopupAlways) {
            if (this.actionMode == null && isInSelectionMode()) {
                this.actionMode = this.textSelectionOverlay.startActionMode(this.textSelectActionCallback);
                return;
            }
            return;
        }
        if (!this.movingHandle && isInSelectionMode() && canShowActions()) {
            if (this.popupLayout == null) {
                this.popupRect = new Rect();
                ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = new ActionBarPopupWindow.ActionBarPopupWindowLayout(this.textSelectionOverlay.getContext());
                this.popupLayout = actionBarPopupWindowLayout;
                actionBarPopupWindowLayout.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
                this.popupLayout.setBackgroundDrawable(this.textSelectionOverlay.getContext().getResources().getDrawable(R.drawable.menu_copy));
                this.popupLayout.setAnimationEnabled(false);
                this.popupLayout.setOnTouchListener(new TextSelectionHelper$$ExternalSyntheticLambda10(this, 0));
                this.popupLayout.setShownFromBottom(false);
                TextView textView = new TextView(this.textSelectionOverlay.getContext());
                this.deleteView = textView;
                int i = Theme.key_listSelector;
                textView.setBackgroundDrawable(Theme.createSelectorDrawable(getThemedColor(i), 2, -1));
                this.deleteView.setGravity(16);
                this.deleteView.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
                this.deleteView.setTextSize(1, 15.0f);
                this.deleteView.setTypeface(AndroidUtilities.bold());
                this.deleteView.setText(this.textSelectionOverlay.getContext().getString(17039361));
                TextView textView2 = this.deleteView;
                int i2 = Theme.key_actionBarDefaultSubmenuItem;
                textView2.setTextColor(getThemedColor(i2));
                final int i3 = 0;
                this.deleteView.setOnClickListener(new View.OnClickListener(this) {
                    public final TextSelectionHelper f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (i3) {
                            case 0:
                                this.f$0.lambda$showActions$3(view);
                                break;
                            case 1:
                                this.f$0.lambda$showActions$4(view);
                                break;
                            default:
                                this.f$0.lambda$showActions$5(view);
                                break;
                        }
                    }
                });
                this.popupLayout.addView(this.deleteView, LayoutHelper.createFrame(-2, 48.0f));
                if (canCut()) {
                    TextView textView3 = new TextView(this.textSelectionOverlay.getContext());
                    textView3.setBackgroundDrawable(Theme.createSelectorDrawable(getThemedColor(i), 2, -1));
                    textView3.setGravity(16);
                    textView3.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
                    zzkb.m(15.0f, 1, textView3);
                    textView3.setText(this.textSelectionOverlay.getContext().getString(17039363));
                    textView3.setTextColor(getThemedColor(i2));
                    final int i4 = 1;
                    textView3.setOnClickListener(new View.OnClickListener(this) {
                        public final TextSelectionHelper f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (i4) {
                                case 0:
                                    this.f$0.lambda$showActions$3(view);
                                    break;
                                case 1:
                                    this.f$0.lambda$showActions$4(view);
                                    break;
                                default:
                                    this.f$0.lambda$showActions$5(view);
                                    break;
                            }
                        }
                    });
                    this.popupLayout.addView(textView3, LayoutHelper.createFrame(-2, 48.0f));
                }
                if (canPaste()) {
                    TextView textView4 = new TextView(this.textSelectionOverlay.getContext());
                    textView4.setBackgroundDrawable(Theme.createSelectorDrawable(getThemedColor(i), 2, -1));
                    textView4.setGravity(16);
                    textView4.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
                    zzkb.m(15.0f, 1, textView4);
                    textView4.setText(this.textSelectionOverlay.getContext().getString(17039371));
                    textView4.setTextColor(getThemedColor(i2));
                    final int i5 = 2;
                    textView4.setOnClickListener(new View.OnClickListener(this) {
                        public final TextSelectionHelper f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (i5) {
                                case 0:
                                    this.f$0.lambda$showActions$3(view);
                                    break;
                                case 1:
                                    this.f$0.lambda$showActions$4(view);
                                    break;
                                default:
                                    this.f$0.lambda$showActions$5(view);
                                    break;
                            }
                        }
                    });
                    this.popupLayout.addView(textView4, LayoutHelper.createFrame(-2, 48.0f));
                }
                ActionBarPopupWindow actionBarPopupWindow = new ActionBarPopupWindow(this.popupLayout, -2, -2);
                this.popupWindow = actionBarPopupWindow;
                actionBarPopupWindow.setAnimationEnabled(false);
                this.popupWindow.setAnimationStyle(R.style.PopupContextAnimation);
                this.popupWindow.setOutsideTouchable(true);
                ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout2 = this.popupLayout;
                if (actionBarPopupWindowLayout2 != null) {
                    actionBarPopupWindowLayout2.setBackgroundColor(getThemedColor(Theme.key_actionBarDefaultSubmenuBackground));
                }
            }
            if (this.selectedView != null) {
                int i6 = -getLineHeight();
                int i7 = i6 / 2;
                iDp = (i7 + ((offsetToCord(this.selectionStart)[1] + this.textY) + getCoordsInParent()[1])) - AndroidUtilities.dp(4.0f);
                if (iDp < 0) {
                    iDp = 0;
                }
            } else {
                iDp = 0;
            }
            this.popupWindow.showAtLocation(this.textSelectionOverlay, 48, 0, iDp - AndroidUtilities.dp(48.0f));
            this.popupWindow.startAnimation();
        }
    }

    public void showHandleViews() {
        if (this.handleViewProgress == 1.0f || this.textSelectionOverlay == null) {
            return;
        }
        ValueAnimator valueAnimator = this.handleViewAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.handleViewProgress, 1.0f);
        this.handleViewAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new BotButton$$ExternalSyntheticLambda0(this, 8));
        this.handleViewAnimator.setDuration((long) (Math.abs(1.0f - this.handleViewProgress) * 250.0f));
        this.handleViewAnimator.start();
    }

    public void stopScrolling() {
        this.parentIsScrolling = false;
        this.textSelectionOverlay.invalidate();
        AndroidUtilities.cancelRunOnUIThread(this.showActionsRunnable);
        AndroidUtilities.runOnUIThread(this.showActionsRunnable);
    }

    public void clear(boolean z) {
        Magnifier magnifier;
        onExitSelectionMode(z);
        this.selectionStart = -1;
        this.selectionEnd = -1;
        int i = Build.VERSION.SDK_INT;
        if (i >= 28 && (magnifier = this.magnifier) != null) {
            magnifier.dismiss();
            this.magnifier = null;
        }
        hideActions();
        invalidate();
        this.selectedView = null;
        this.selectedCellId = 0;
        this.selectedCellEditDate = null;
        AndroidUtilities.cancelRunOnUIThread(this.startSelectionRunnable);
        this.tryCapture = false;
        TextSelectionOverlay textSelectionOverlay = this.textSelectionOverlay;
        if (textSelectionOverlay != null) {
            textSelectionOverlay.setVisibility(8);
            TextSelectionOverlay textSelectionOverlay2 = this.textSelectionOverlay;
            if (i >= 29) {
                ArrayList arrayList = textSelectionOverlay2.gestureExclusionRects;
                if (!arrayList.isEmpty()) {
                    arrayList.clear();
                    textSelectionOverlay2.setSystemGestureExclusionRects(arrayList);
                }
            } else {
                textSelectionOverlay2.getClass();
            }
        }
        this.handleViewProgress = 0.0f;
        Callback callback = this.callback;
        if (callback != null) {
            callback.onStateChanged(false);
        }
        this.capturedX = -1;
        this.capturedY = -1;
        this.maybeTextX = -1;
        this.maybeTextY = -1;
        this.movingOffsetX = 0.0f;
        this.movingOffsetY = 0.0f;
        this.movingHandle = false;
    }
}
