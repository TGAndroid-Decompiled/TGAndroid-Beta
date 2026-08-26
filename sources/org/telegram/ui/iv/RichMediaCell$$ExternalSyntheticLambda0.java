package org.telegram.ui.iv;

import android.animation.ValueAnimator;
import android.view.VelocityTracker;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.ItemOptions;

public final class RichMediaCell$$ExternalSyntheticLambda0 implements View.OnClickListener {
    public final int $r8$classId;
    public final RichMediaCell f$0;

    public RichMediaCell$$ExternalSyntheticLambda0(RichMediaCell richMediaCell, int i) {
        this.$r8$classId = i;
        this.f$0 = richMediaCell;
    }

    @Override
    public final void onClick(View view) {
        BlockRow blockRow;
        BlockRow blockRow2;
        TL_iv.PageBlock pageBlock;
        switch (this.$r8$classId) {
            case 0:
                final RichMediaCell richMediaCell = this.f$0;
                ArrayList arrayList = richMediaCell.menuButtons;
                int iIndexOf = arrayList.indexOf(view);
                if (richMediaCell.delegate != null && richMediaCell.currentRow != null) {
                    List listMedias = richMediaCell.medias();
                    if (iIndexOf >= 0 && iIndexOf < listMedias.size() && iIndexOf < arrayList.size()) {
                        final MediaUploadState mediaUploadState = (MediaUploadState) listMedias.get(iIndexOf);
                        ItemOptions itemOptionsMakeMenu = RichEditorListView.this.delegate.makeMenu((View) arrayList.get(iIndexOf));
                        boolean z = mediaUploadState.hasSpoiler;
                        final int i = 0;
                        itemOptionsMakeMenu.add(z ? R.drawable.msg_spoiler_off : R.drawable.msg_spoiler, LocaleController.getString(z ? R.string.DisablePhotoSpoiler : R.string.EnablePhotoSpoiler), new Runnable() {
                            @Override
                            public final void run() {
                                BlockRow blockRow3;
                                BlockRow blockRow4;
                                switch (i) {
                                    case 0:
                                        RichMediaCell richMediaCell2 = richMediaCell;
                                        RichEditorListView.AnonymousClass6 anonymousClass6 = richMediaCell2.delegate;
                                        if (anonymousClass6 != null && (blockRow3 = richMediaCell2.currentRow) != null) {
                                            RichEditorListView richEditorListView = RichEditorListView.this;
                                            richEditorListView.getClass();
                                            MediaUploadState mediaUploadState2 = mediaUploadState;
                                            RichEditorHistory richEditorHistory = richEditorListView.history;
                                            if (richEditorHistory != null) {
                                                AndroidUtilities.cancelRunOnUIThread(richEditorHistory.commitRunnable);
                                                richEditorHistory.commit();
                                            }
                                            mediaUploadState2.hasSpoiler = !mediaUploadState2.hasSpoiler;
                                            TL_iv.PageBlock pageBlockItemBlockFor = RichEditorListView.itemBlockFor(blockRow3, mediaUploadState2);
                                            if (pageBlockItemBlockFor instanceof TL_iv.pageBlockPhoto) {
                                                ((TL_iv.pageBlockPhoto) pageBlockItemBlockFor).spoiler = mediaUploadState2.hasSpoiler;
                                            } else if (pageBlockItemBlockFor instanceof TL_iv.pageBlockVideo) {
                                                ((TL_iv.pageBlockVideo) pageBlockItemBlockFor).spoiler = mediaUploadState2.hasSpoiler;
                                            }
                                            richEditorListView.refreshMediaCell(blockRow3);
                                            RichEditorHistory richEditorHistory2 = richEditorListView.history;
                                            if (richEditorHistory2 != null) {
                                                richEditorHistory2.record();
                                            }
                                            richEditorListView.delegate.onContentChanged();
                                            break;
                                        }
                                        break;
                                    default:
                                        RichMediaCell richMediaCell3 = richMediaCell;
                                        RichEditorListView.AnonymousClass6 anonymousClass7 = richMediaCell3.delegate;
                                        if (anonymousClass7 != null && (blockRow4 = richMediaCell3.currentRow) != null) {
                                            RichEditorListView.access$3500(blockRow4, mediaUploadState, RichEditorListView.this);
                                            break;
                                        }
                                        break;
                                }
                            }
                        }, false);
                        final int i2 = 1;
                        itemOptionsMakeMenu.add(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new Runnable() {
                            @Override
                            public final void run() {
                                BlockRow blockRow3;
                                BlockRow blockRow4;
                                switch (i2) {
                                    case 0:
                                        RichMediaCell richMediaCell2 = richMediaCell;
                                        RichEditorListView.AnonymousClass6 anonymousClass6 = richMediaCell2.delegate;
                                        if (anonymousClass6 != null && (blockRow3 = richMediaCell2.currentRow) != null) {
                                            RichEditorListView richEditorListView = RichEditorListView.this;
                                            richEditorListView.getClass();
                                            MediaUploadState mediaUploadState2 = mediaUploadState;
                                            RichEditorHistory richEditorHistory = richEditorListView.history;
                                            if (richEditorHistory != null) {
                                                AndroidUtilities.cancelRunOnUIThread(richEditorHistory.commitRunnable);
                                                richEditorHistory.commit();
                                            }
                                            mediaUploadState2.hasSpoiler = !mediaUploadState2.hasSpoiler;
                                            TL_iv.PageBlock pageBlockItemBlockFor = RichEditorListView.itemBlockFor(blockRow3, mediaUploadState2);
                                            if (pageBlockItemBlockFor instanceof TL_iv.pageBlockPhoto) {
                                                ((TL_iv.pageBlockPhoto) pageBlockItemBlockFor).spoiler = mediaUploadState2.hasSpoiler;
                                            } else if (pageBlockItemBlockFor instanceof TL_iv.pageBlockVideo) {
                                                ((TL_iv.pageBlockVideo) pageBlockItemBlockFor).spoiler = mediaUploadState2.hasSpoiler;
                                            }
                                            richEditorListView.refreshMediaCell(blockRow3);
                                            RichEditorHistory richEditorHistory2 = richEditorListView.history;
                                            if (richEditorHistory2 != null) {
                                                richEditorHistory2.record();
                                            }
                                            richEditorListView.delegate.onContentChanged();
                                            break;
                                        }
                                        break;
                                    default:
                                        RichMediaCell richMediaCell3 = richMediaCell;
                                        RichEditorListView.AnonymousClass6 anonymousClass7 = richMediaCell3.delegate;
                                        if (anonymousClass7 != null && (blockRow4 = richMediaCell3.currentRow) != null) {
                                            RichEditorListView.access$3500(blockRow4, mediaUploadState, RichEditorListView.this);
                                            break;
                                        }
                                        break;
                                }
                            }
                        }, true);
                        itemOptionsMakeMenu.translate(0.0f, -AndroidUtilities.dp(38.0f));
                        if (richMediaCell.glass) {
                            itemOptionsMakeMenu.blur = false;
                            itemOptionsMakeMenu.blurForMenu = true;
                            itemOptionsMakeMenu.dimAlpha = 0;
                        }
                        itemOptionsMakeMenu.show();
                        break;
                    }
                }
                break;
            case 1:
                RichMediaCell richMediaCell2 = this.f$0;
                RichEditorListView.AnonymousClass6 anonymousClass6 = richMediaCell2.delegate;
                if (anonymousClass6 != null && (blockRow = richMediaCell2.currentRow) != null) {
                    RichEditorListView richEditorListView = RichEditorListView.this;
                    richEditorListView.pendingMediaRow = blockRow;
                    richEditorListView.delegate.onOpenAttachRequest(0);
                    break;
                }
                break;
            default:
                RichMediaCell richMediaCell3 = this.f$0;
                RichEditorListView.AnonymousClass6 anonymousClass7 = richMediaCell3.delegate;
                if (anonymousClass7 != null && (blockRow2 = richMediaCell3.currentRow) != null) {
                    RichEditorListView richEditorListView2 = RichEditorListView.this;
                    richEditorListView2.getClass();
                    if (RichEditorListView.isGallery(blockRow2.block)) {
                        RichEditorHistory richEditorHistory = richEditorListView2.history;
                        if (richEditorHistory != null) {
                            AndroidUtilities.cancelRunOnUIThread(richEditorHistory.commitRunnable);
                            richEditorHistory.commit();
                        }
                        ArrayList<TL_iv.PageBlock> arrayListGalleryItems = RichEditorListView.galleryItems(blockRow2.block);
                        TL_iv.PageBlock pageBlock2 = blockRow2.block;
                        TL_iv.PageCaption pageCaption = pageBlock2.caption;
                        if (pageBlock2 instanceof TL_iv.pageBlockSlideshow) {
                            TL_iv.pageBlockCollage pageblockcollage = new TL_iv.pageBlockCollage();
                            if (arrayListGalleryItems == null) {
                                arrayListGalleryItems = new ArrayList<>();
                            }
                            pageblockcollage.items = arrayListGalleryItems;
                            pageblockcollage.caption = pageCaption;
                            pageBlock = pageblockcollage;
                        } else {
                            TL_iv.pageBlockSlideshow pageblockslideshow = new TL_iv.pageBlockSlideshow();
                            if (arrayListGalleryItems == null) {
                                arrayListGalleryItems = new ArrayList<>();
                            }
                            pageblockslideshow.items = arrayListGalleryItems;
                            pageblockslideshow.caption = pageCaption;
                            pageBlock = pageblockslideshow;
                        }
                        blockRow2.block = pageBlock;
                        RichEditorHistory richEditorHistory2 = richEditorListView2.history;
                        if (richEditorHistory2 != null) {
                            richEditorHistory2.record();
                        }
                        View viewFindViewByItemObject = richEditorListView2.findViewByItemObject(blockRow2);
                        if (viewFindViewByItemObject instanceof RichMediaCell) {
                            RichMediaCell richMediaCell4 = (RichMediaCell) viewFindViewByItemObject;
                            ValueAnimator valueAnimator = richMediaCell4.settleAnimator;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                                richMediaCell4.settleAnimator = null;
                            }
                            if (richMediaCell4.getParent() != null) {
                                richMediaCell4.getParent().requestDisallowInterceptTouchEvent(false);
                            }
                            VelocityTracker velocityTracker = richMediaCell4.velocityTracker;
                            if (velocityTracker != null) {
                                velocityTracker.recycle();
                                richMediaCell4.velocityTracker = null;
                            }
                            richMediaCell4.currentPage = 0;
                            richMediaCell4.pageOffset = 0.0f;
                            richMediaCell4.updateSwitchButton(true);
                            richMediaCell4.requestLayout();
                            richMediaCell4.invalidate();
                        }
                        break;
                    }
                }
                break;
        }
    }
}
