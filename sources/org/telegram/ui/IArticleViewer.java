package org.telegram.ui;

import android.view.MotionEvent;
import android.view.View;
import androidx.collection.LongSparseArray;
import java.util.ArrayList;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer;
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
    public LinkSpanDrawable pressedLink;
    public ArticleViewer.DrawingText pressedLinkOwnerLayout;
    public View pressedLinkOwnerView;
    public String searchText;
    public VideoPlayerHolderBase videoPlayer;
    public int selectedFont = 0;
    public LinkSpanDrawable.LinkCollector links = new LinkSpanDrawable.LinkCollector();
    public LongSparseArray videoStates = new LongSparseArray();
    public ArrayList searchResults = new ArrayList();

    public abstract boolean allowTouches();

    public boolean canStartSelection(View view) {
        return false;
    }

    public abstract void checkLayoutForLinks(MotionEvent motionEvent, View view);

    public abstract ArticleViewer.WebpageAdapter getAdapter();

    public abstract int getCurrentAccount();

    public abstract int getGrayTextColor();

    public abstract int getLinkTextColor();

    public abstract ArticleViewer.Resources getResources();

    public abstract Theme.ResourcesProvider getResourcesProvider();

    public abstract int getTextColor();

    public abstract TextSelectionHelper.ArticleTextSelectionHelper getTextSelectionHelper(View view);

    public abstract int getThemedColor(int i);

    public abstract void handleLinkClick(ArticleViewer.WebpageAdapter webpageAdapter, TextPaintUrlSpan textPaintUrlSpan);

    public abstract boolean openPhoto(TL_iv.PageBlock pageBlock, ArticleViewer.WebpageAdapter webpageAdapter);

    public int padx() {
        return 18;
    }

    public int pady() {
        return 8;
    }
}
