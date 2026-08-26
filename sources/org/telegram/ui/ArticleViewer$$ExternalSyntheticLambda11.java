package org.telegram.ui;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.view.View;
import android.widget.Toast;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.Components.RadioButton;

public final class ArticleViewer$$ExternalSyntheticLambda11 implements View.OnClickListener {
    public final int $r8$classId;
    public final ArticleViewer f$0;

    public ArticleViewer$$ExternalSyntheticLambda11(ArticleViewer articleViewer, int i) {
        this.$r8$classId = i;
        this.f$0 = articleViewer;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                ArticleViewer articleViewer = this.f$0;
                if (!articleViewer.pages[0].isWeb()) {
                    articleViewer.scrollToSearchIndex(articleViewer.currentSearchIndex - 1);
                } else if (articleViewer.pages[0].getWebView() != null) {
                    articleViewer.pages[0].getWebView().findNext(false);
                }
                break;
            case 1:
                ArticleViewer articleViewer2 = this.f$0;
                if (!articleViewer2.pages[0].isWeb()) {
                    articleViewer2.scrollToSearchIndex(articleViewer2.currentSearchIndex + 1);
                } else if (articleViewer2.pages[0].getWebView() != null) {
                    articleViewer2.pages[0].getWebView().findNext(true);
                }
                break;
            case 2:
                ArticleViewer articleViewer3 = this.f$0;
                ArticleViewer.AnonymousClass15 anonymousClass15 = articleViewer3.actionBar;
                if (anonymousClass15.searching) {
                    anonymousClass15.showSearch(false);
                } else if (anonymousClass15.addressing) {
                    anonymousClass15.showAddress(false);
                } else {
                    if (articleViewer3.isFirstArticle()) {
                        ArticleViewer.PageLayout pageLayout = articleViewer3.pages[0];
                        if (pageLayout.backButton) {
                            if (pageLayout.isWeb() && pageLayout.getWebView() != null) {
                                pageLayout.getWebView().goBack();
                                break;
                            }
                        }
                    }
                    if (articleViewer3.pagesStack.size() > 1) {
                        articleViewer3.goBack();
                    } else {
                        ArticleViewer.Sheet sheet = articleViewer3.sheet;
                        if (sheet != null) {
                            sheet.dismiss(false);
                        } else {
                            articleViewer3.close(true, true);
                        }
                    }
                }
                break;
            case 3:
                ArticleViewer.Sheet sheet2 = this.f$0.sheet;
                if (sheet2 != null) {
                    sheet2.dismiss(true);
                }
                break;
            case 4:
                ArticleViewer articleViewer4 = this.f$0;
                articleViewer4.getClass();
                int iIntValue = ((Integer) view.getTag()).intValue();
                articleViewer4.selectedFont = iIntValue;
                int i = 0;
                int i2 = 0;
                while (i2 < 2) {
                    ((RadioButton) articleViewer4.fontCells[i2].this$0).setChecked(i2 == iIntValue, true);
                    i2++;
                }
                ArticleViewer.Resources resources = ArticleViewer.resources;
                int i3 = articleViewer4.selectedFont;
                resources.getClass();
                ApplicationLoader.applicationContext.getSharedPreferences("articles", 0).edit().putInt("font_type", i3).commit();
                Typeface typeface = i3 == 0 ? Typeface.DEFAULT : Typeface.SERIF;
                Typeface typeface2 = i3 == 0 ? AndroidUtilities.getTypeface("fonts/ritalic.ttf") : Typeface.create("serif", 2);
                Typeface typefaceBold = i3 == 0 ? AndroidUtilities.bold() : Typeface.create("serif", 1);
                Typeface typeface3 = i3 == 0 ? AndroidUtilities.getTypeface("fonts/rmediumitalic.ttf") : Typeface.create("serif", 3);
                for (int i4 = 0; i4 < resources.quoteTextPaints.size(); i4++) {
                    ArticleViewer.Resources.updateFontEntry(resources.quoteTextPaints.keyAt(i4), (TextPaint) resources.quoteTextPaints.valueAt(i4), typeface, typeface3, typefaceBold, typeface2);
                }
                for (int i5 = 0; i5 < resources.preformattedTextPaints.size(); i5++) {
                    ArticleViewer.Resources.updateFontEntry(resources.preformattedTextPaints.keyAt(i5), (TextPaint) resources.preformattedTextPaints.valueAt(i5), typeface, typeface3, typefaceBold, typeface2);
                }
                for (int i6 = 0; i6 < resources.paragraphTextPaints.size(); i6++) {
                    ArticleViewer.Resources.updateFontEntry(resources.paragraphTextPaints.keyAt(i6), (TextPaint) resources.paragraphTextPaints.valueAt(i6), typeface, typeface3, typefaceBold, typeface2);
                }
                for (int i7 = 0; i7 < resources.listTextPaints.size(); i7++) {
                    ArticleViewer.Resources.updateFontEntry(resources.listTextPaints.keyAt(i7), (TextPaint) resources.listTextPaints.valueAt(i7), typeface, typeface3, typefaceBold, typeface2);
                }
                for (int i8 = 0; i8 < resources.embedPostTextPaints.size(); i8++) {
                    ArticleViewer.Resources.updateFontEntry(resources.embedPostTextPaints.keyAt(i8), (TextPaint) resources.embedPostTextPaints.valueAt(i8), typeface, typeface3, typefaceBold, typeface2);
                }
                for (int i9 = 0; i9 < resources.mediaCaptionTextPaints.size(); i9++) {
                    ArticleViewer.Resources.updateFontEntry(resources.mediaCaptionTextPaints.keyAt(i9), (TextPaint) resources.mediaCaptionTextPaints.valueAt(i9), typeface, typeface3, typefaceBold, typeface2);
                }
                for (int i10 = 0; i10 < resources.mediaCreditTextPaints.size(); i10++) {
                    ArticleViewer.Resources.updateFontEntry(resources.mediaCreditTextPaints.keyAt(i10), (TextPaint) resources.mediaCreditTextPaints.valueAt(i10), typeface, typeface3, typefaceBold, typeface2);
                }
                for (int i11 = 0; i11 < resources.photoCaptionTextPaints.size(); i11++) {
                    ArticleViewer.Resources.updateFontEntry(resources.photoCaptionTextPaints.keyAt(i11), (TextPaint) resources.photoCaptionTextPaints.valueAt(i11), typeface, typeface3, typefaceBold, typeface2);
                }
                for (int i12 = 0; i12 < resources.photoCreditTextPaints.size(); i12++) {
                    ArticleViewer.Resources.updateFontEntry(resources.photoCreditTextPaints.keyAt(i12), (TextPaint) resources.photoCreditTextPaints.valueAt(i12), typeface, typeface3, typefaceBold, typeface2);
                }
                for (int i13 = 0; i13 < resources.authorTextPaints.size(); i13++) {
                    ArticleViewer.Resources.updateFontEntry(resources.authorTextPaints.keyAt(i13), (TextPaint) resources.authorTextPaints.valueAt(i13), typeface, typeface3, typefaceBold, typeface2);
                }
                for (int i14 = 0; i14 < resources.footerTextPaints.size(); i14++) {
                    ArticleViewer.Resources.updateFontEntry(resources.footerTextPaints.keyAt(i14), (TextPaint) resources.footerTextPaints.valueAt(i14), typeface, typeface3, typefaceBold, typeface2);
                }
                for (int i15 = 0; i15 < resources.embedPostCaptionTextPaints.size(); i15++) {
                    ArticleViewer.Resources.updateFontEntry(resources.embedPostCaptionTextPaints.keyAt(i15), (TextPaint) resources.embedPostCaptionTextPaints.valueAt(i15), typeface, typeface3, typefaceBold, typeface2);
                }
                for (int i16 = 0; i16 < resources.relatedArticleTextPaints.size(); i16++) {
                    ArticleViewer.Resources.updateFontEntry(resources.relatedArticleTextPaints.keyAt(i16), (TextPaint) resources.relatedArticleTextPaints.valueAt(i16), typeface, typeface3, typefaceBold, typeface2);
                }
                for (int i17 = 0; i17 < resources.detailsTextPaints.size(); i17++) {
                    ArticleViewer.Resources.updateFontEntry(resources.detailsTextPaints.keyAt(i17), (TextPaint) resources.detailsTextPaints.valueAt(i17), typeface, typeface3, typefaceBold, typeface2);
                }
                for (int i18 = 0; i18 < resources.tableTextPaints.size(); i18++) {
                    ArticleViewer.Resources.updateFontEntry(resources.tableTextPaints.keyAt(i18), (TextPaint) resources.tableTextPaints.valueAt(i18), typeface, typeface3, typefaceBold, typeface2);
                }
                while (true) {
                    ArticleViewer.PageLayout[] pageLayoutArr = articleViewer4.pages;
                    if (i < pageLayoutArr.length) {
                        ArticleViewer.WebpageAdapter webpageAdapter = pageLayoutArr[i].adapter;
                        webpageAdapter.updateRows$30();
                        webpageAdapter.mObservable.notifyChanged();
                        i++;
                    }
                    break;
                }
                break;
            default:
                ArticleViewer articleViewer5 = this.f$0;
                ArticleViewer.DrawingText drawingText = articleViewer5.pressedLinkOwnerLayout;
                if (drawingText != null) {
                    AndroidUtilities.addToClipboard(drawingText.textLayout.getText());
                    if (AndroidUtilities.shouldShowClipboardToast()) {
                        Toast.makeText(articleViewer5.parentActivity, LocaleController.getString(R.string.TextCopied), 0).show();
                    }
                }
                ActionBarPopupWindow actionBarPopupWindow = articleViewer5.popupWindow;
                if (actionBarPopupWindow != null && actionBarPopupWindow.isShowing()) {
                    articleViewer5.popupWindow.dismiss(true);
                    break;
                }
                break;
        }
    }
}
