package org.telegram.ui;

import android.view.MotionEvent;
import android.view.View;
import androidx.collection.LongSparseArray;
import java.util.ArrayList;
import org.telegram.messenger.browser.Browser;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.TextSelectionHelper;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.LoadingDrawable;
import org.telegram.ui.Components.TextPaintUrlSpan;

public abstract class IArticleViewer {
    public ArticleViewer.BlockVideoCell currentPlayer;
    public int currentSearchIndex;
    public boolean drawBlockSelection;
    public BottomSheet linkSheet;
    public TLRPC.Chat loadedChannel;
    public boolean loadingChannel;
    public TextPaintUrlSpan loadingLink;
    public LoadingDrawable loadingLinkDrawable;
    public View loadingLinkView;
    public ArticleViewer.DrawingText loadingText;
    public ActionBarPopupWindow popupWindow;
    public int pressedLayoutY;
    public LinkSpanDrawable<TextPaintUrlSpan> pressedLink;
    public ArticleViewer.DrawingText pressedLinkOwnerLayout;
    public View pressedLinkOwnerView;
    public String searchText;
    public VideoPlayerHolderBase videoPlayer;
    public int selectedFont = 0;
    public LinkSpanDrawable.LinkCollector links = new LinkSpanDrawable.LinkCollector();
    public LongSparseArray videoStates = new LongSparseArray();
    public ArrayList<ArticleViewer.SearchResult> searchResults = new ArrayList<>();

    public boolean allowTouches() {
        return true;
    }

    public boolean canStartSelection(View view) {
        return false;
    }

    public void checkLayoutForLinks(MotionEvent motionEvent, View view) {
    }

    public ArticleViewer.WebpageAdapter getAdapter() {
        return null;
    }

    public abstract int getCurrentAccount();

    public abstract int getGrayTextColor();

    public abstract int getLinkTextColor();

    public abstract ArticleViewer.Resources getResources();

    public abstract Theme.ResourcesProvider getResourcesProvider();

    public abstract int getTextColor();

    public abstract TextSelectionHelper.ArticleTextSelectionHelper getTextSelectionHelper(View view);

    public abstract int getThemedColor(int i);

    public void handleLinkClick(ArticleViewer.WebpageAdapter webpageAdapter, TextPaintUrlSpan textPaintUrlSpan) {
    }

    public boolean openPhoto(TL_iv.PageBlock pageBlock, ArticleViewer.WebpageAdapter webpageAdapter) {
        return false;
    }

    public void openWebpageUrl(String str, String str2, Browser.Progress progress) {
    }

    public int padx() {
        return 18;
    }

    public int pady() {
        return 8;
    }

    public void reset() {
        this.loadedChannel = null;
        this.loadingChannel = false;
    }

    public boolean scrollToAnchor(String str, boolean z) {
        return false;
    }
}
