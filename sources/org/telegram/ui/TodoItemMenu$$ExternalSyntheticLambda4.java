package org.telegram.ui;

import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import java.lang.ref.WeakReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.Cells.TextSelectionHelper;
import org.telegram.ui.Components.CustomPopupMenu;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.MentionsContainerView;
import org.telegram.ui.Components.MessagePreviewView;
import org.telegram.ui.Components.Paint.Views.LPhotoPaintView;
import org.telegram.ui.Components.StickersAlert;
import org.telegram.ui.Stories.recorder.PaintView;

public final class TodoItemMenu$$ExternalSyntheticLambda4 implements View.OnTouchListener {
    public final int $r8$classId;
    public final Object f$0;

    public TodoItemMenu$$ExternalSyntheticLambda4(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        ActionBarPopupWindow actionBarPopupWindow;
        ActionBarPopupWindow actionBarPopupWindow2;
        ActionBarPopupWindow actionBarPopupWindow3;
        ItemOptions.AnonymousClass4 anonymousClass4;
        ActionBarPopupWindow actionBarPopupWindow4;
        int i;
        float f;
        SelectAnimatedEmojiDialog$SelectAnimatedEmojiDialogWindow$$ExternalSyntheticLambda1 selectAnimatedEmojiDialog$SelectAnimatedEmojiDialogWindow$$ExternalSyntheticLambda1;
        ActionBarPopupWindow actionBarPopupWindow5;
        switch (this.$r8$classId) {
            case 0:
                TodoItemMenu todoItemMenu = (TodoItemMenu) this.f$0;
                if (todoItemMenu.messageOptionsView != null && motionEvent.getAction() == 0) {
                    Drawable backgroundDrawable = ((ActionBarPopupWindow.ActionBarPopupWindowLayout) todoItemMenu.messageOptionsView).getBackgroundDrawable();
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(backgroundDrawable.getBounds());
                    rectF.offset(todoItemMenu.messageOptionsView.getX(), todoItemMenu.messageOptionsView.getY());
                    if (!rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                        todoItemMenu.dismiss(true);
                        return true;
                    }
                }
                return false;
            case 1:
                ArticleViewer articleViewer = (ArticleViewer) this.f$0;
                articleViewer.getClass();
                if (motionEvent.getActionMasked() != 0 || (actionBarPopupWindow = articleViewer.popupWindow) == null || !actionBarPopupWindow.isShowing()) {
                    return false;
                }
                view.getHitRect(articleViewer.popupRect);
                if (articleViewer.popupRect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                    return false;
                }
                articleViewer.popupWindow.dismiss(true);
                return false;
            case 2:
                TextSelectionHelper textSelectionHelper = (TextSelectionHelper) this.f$0;
                textSelectionHelper.getClass();
                if (motionEvent.getActionMasked() != 0 || (actionBarPopupWindow2 = textSelectionHelper.popupWindow) == null || !actionBarPopupWindow2.isShowing()) {
                    return false;
                }
                view.getHitRect(textSelectionHelper.popupRect);
                return false;
            case 3:
                CustomPopupMenu customPopupMenu = (CustomPopupMenu) this.f$0;
                customPopupMenu.getClass();
                if (motionEvent.getActionMasked() != 1 || (actionBarPopupWindow3 = customPopupMenu.popupWindow) == null || !actionBarPopupWindow3.isShowing()) {
                    return false;
                }
                Rect rect = AndroidUtilities.rectTmp2;
                view.getHitRect(rect);
                if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                    return false;
                }
                actionBarPopupWindow3.dismiss(true);
                return false;
            case 4:
                ItemOptions itemOptions = (ItemOptions) ((WeakReference) this.f$0).get();
                if (itemOptions == null || (anonymousClass4 = itemOptions.actionBarPopupWindow) == null || !anonymousClass4.isShowing()) {
                    view.setOnTouchListener(null);
                    return false;
                }
                if (view.getParent() != null) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                }
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 2) {
                    itemOptions.updateHover((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                } else if (actionMasked == 1) {
                    itemOptions.updateHover((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                    View view2 = itemOptions.hoveredItem;
                    if (view2 != null) {
                        itemOptions.hoveredItem = null;
                        view2.setPressed(false);
                        view2.performClick();
                    }
                    view.setOnTouchListener(null);
                    itemOptions.hoverReleaseListener = null;
                } else if (actionMasked == 3) {
                    View view3 = itemOptions.hoveredItem;
                    if (view3 != null) {
                        view3.setPressed(false);
                        itemOptions.hoveredItem = null;
                    }
                    view.setOnTouchListener(null);
                    itemOptions.hoverReleaseListener = null;
                }
                return true;
            case 5:
                MentionsContainerView mentionsContainerView = (MentionsContainerView) this.f$0;
                mentionsContainerView.getClass();
                return ContentPreviewViewer.getInstance().onTouch(motionEvent, mentionsContainerView.getListView(), mentionsContainerView.mentionsOnItemClickListener, null, mentionsContainerView.resourcesProvider);
            case 6:
                MessagePreviewView.Page page = (MessagePreviewView.Page) this.f$0;
                page.getClass();
                if (motionEvent.getAction() == 1) {
                    page.this$0.dismiss(true);
                }
                return true;
            case 7:
                LPhotoPaintView lPhotoPaintView = (LPhotoPaintView) this.f$0;
                lPhotoPaintView.getClass();
                if (motionEvent.getActionMasked() != 0 || (actionBarPopupWindow4 = lPhotoPaintView.popupWindow) == null || !actionBarPopupWindow4.isShowing()) {
                    return false;
                }
                view.getHitRect(lPhotoPaintView.popupRect);
                if (lPhotoPaintView.popupRect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                    return false;
                }
                lPhotoPaintView.popupWindow.dismiss(true);
                return false;
            case 8:
                return ((StickersAlert) this.f$0).lambda$init$9(motionEvent);
            case 9:
                ContentPreviewViewer contentPreviewViewer = (ContentPreviewViewer) this.f$0;
                contentPreviewViewer.getClass();
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 6 || motionEvent.getAction() == 3) {
                    if (contentPreviewViewer.isStickerEditor) {
                        contentPreviewViewer.closeWithMenu();
                    } else {
                        contentPreviewViewer.close();
                    }
                }
                return true;
            case 10:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) this.f$0;
                if (externalActionActivity.actionBarLayout.getFragmentStack().isEmpty() || motionEvent.getAction() != 1) {
                    return false;
                }
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                int[] iArr = new int[2];
                externalActionActivity.layersActionBarLayout.getView().getLocationOnScreen(iArr);
                int i2 = iArr[0];
                int i3 = iArr[1];
                if (externalActionActivity.layersActionBarLayout.checkTransitionAnimation()) {
                    return false;
                }
                if (x > i2 && x < externalActionActivity.layersActionBarLayout.getView().getWidth() + i2 && y > i3 && y < externalActionActivity.layersActionBarLayout.getView().getHeight() + i3) {
                    return false;
                }
                if (!externalActionActivity.layersActionBarLayout.getFragmentStack().isEmpty()) {
                    while (ArticleViewer.IBlock.CC.m(externalActionActivity.layersActionBarLayout, 1) > 0) {
                        ActionBarLayout actionBarLayout = externalActionActivity.layersActionBarLayout;
                        actionBarLayout.removeFragmentFromStack(actionBarLayout.getFragmentStack().get(0), false);
                    }
                    externalActionActivity.layersActionBarLayout.closeLastFragment(true, false);
                }
                return true;
            case 11:
                LaunchActivity launchActivity = (LaunchActivity) this.f$0;
                if (launchActivity.actionBarLayout.getFragmentStack().isEmpty() || motionEvent.getAction() != 1) {
                    return false;
                }
                float x2 = motionEvent.getX();
                float y2 = motionEvent.getY();
                int[] iArr2 = new int[2];
                launchActivity.layersActionBarLayout.getView().getLocationOnScreen(iArr2);
                int i4 = iArr2[0];
                int i5 = iArr2[1];
                if (launchActivity.layersActionBarLayout.checkTransitionAnimation()) {
                    return false;
                }
                if (x2 > i4 && x2 < launchActivity.layersActionBarLayout.getView().getWidth() + i4 && y2 > i5 && y2 < launchActivity.layersActionBarLayout.getView().getHeight() + i5) {
                    return false;
                }
                if (!launchActivity.layersActionBarLayout.getFragmentStack().isEmpty()) {
                    while (ArticleViewer.IBlock.CC.m(launchActivity.layersActionBarLayout, 1) > 0) {
                        ActionBarLayout actionBarLayout2 = launchActivity.layersActionBarLayout;
                        actionBarLayout2.removeFragmentFromStack(actionBarLayout2.getFragmentStack().get(0), false);
                    }
                    launchActivity.layersActionBarLayout.closeLastFragment(true, false);
                }
                return true;
            case 12:
                PhotoCropActivity.PhotoCropView photoCropView = (PhotoCropActivity.PhotoCropView) this.f$0;
                photoCropView.getClass();
                float x3 = motionEvent.getX();
                float y3 = motionEvent.getY();
                int iDp = AndroidUtilities.dp(14.0f);
                if (motionEvent.getAction() == 0) {
                    float f2 = photoCropView.rectX;
                    float f3 = iDp;
                    float f4 = f2 - f3;
                    if (f4 >= x3 || f2 + f3 <= x3) {
                        float f5 = photoCropView.rectSizeX;
                        f = f4 + f5;
                        if (f >= x3 && f2 + f3 + f5 > x3) {
                            float f6 = photoCropView.rectY;
                            if (f6 - f3 < y3 && f6 + f3 > y3) {
                                photoCropView.draggingState = 2;
                            } else if (f4 >= x3) {
                                if (f >= x3) {
                                    if (f2 < x3) {
                                        photoCropView.draggingState = 0;
                                    } else {
                                        photoCropView.draggingState = 0;
                                    }
                                } else if (f2 < x3) {
                                    photoCropView.draggingState = 0;
                                } else {
                                    photoCropView.draggingState = 0;
                                }
                            } else if (f >= x3) {
                                if (f2 < x3) {
                                    photoCropView.draggingState = 0;
                                } else {
                                    photoCropView.draggingState = 0;
                                }
                            } else if (f2 < x3) {
                                photoCropView.draggingState = 0;
                            } else {
                                photoCropView.draggingState = 0;
                            }
                        } else if (f4 >= x3 && f2 + f3 > x3) {
                            float f7 = photoCropView.rectY;
                            float f8 = photoCropView.rectSizeY;
                            if ((f7 - f3) + f8 < y3 && f7 + f3 + f8 > y3) {
                                photoCropView.draggingState = 3;
                            } else if (f >= x3) {
                                if (f2 < x3) {
                                    photoCropView.draggingState = 0;
                                } else {
                                    photoCropView.draggingState = 0;
                                }
                            } else if (f2 < x3) {
                                photoCropView.draggingState = 0;
                            } else {
                                photoCropView.draggingState = 0;
                            }
                        } else if (f >= x3 && f2 + f3 + f5 > x3) {
                            float f9 = photoCropView.rectY;
                            float f10 = photoCropView.rectSizeY;
                            if ((f9 - f3) + f10 < y3 && f9 + f3 + f10 > y3) {
                                photoCropView.draggingState = 4;
                            } else if (f2 < x3) {
                                photoCropView.draggingState = 0;
                            } else {
                                photoCropView.draggingState = 0;
                            }
                        } else if (f2 < x3 || f2 + f5 <= x3) {
                            photoCropView.draggingState = 0;
                        } else {
                            float f11 = photoCropView.rectY;
                            if (f11 >= y3 || f11 + photoCropView.rectSizeY <= y3) {
                                photoCropView.draggingState = 0;
                            } else {
                                photoCropView.draggingState = 5;
                            }
                        }
                    } else {
                        float f12 = photoCropView.rectY;
                        if (f12 - f3 >= y3 || f12 + f3 <= y3) {
                            float f13 = photoCropView.rectSizeX;
                            f = f4 + f13;
                            if (f >= x3) {
                                if (f4 >= x3) {
                                    if (f >= x3) {
                                        if (f2 < x3) {
                                            photoCropView.draggingState = 0;
                                        } else {
                                            photoCropView.draggingState = 0;
                                        }
                                    } else if (f2 < x3) {
                                        photoCropView.draggingState = 0;
                                    } else {
                                        photoCropView.draggingState = 0;
                                    }
                                } else if (f >= x3) {
                                    if (f2 < x3) {
                                        photoCropView.draggingState = 0;
                                    } else {
                                        photoCropView.draggingState = 0;
                                    }
                                } else if (f2 < x3) {
                                    photoCropView.draggingState = 0;
                                } else {
                                    photoCropView.draggingState = 0;
                                }
                            } else if (f4 >= x3) {
                                if (f >= x3) {
                                    if (f2 < x3) {
                                        photoCropView.draggingState = 0;
                                    } else {
                                        photoCropView.draggingState = 0;
                                    }
                                } else if (f2 < x3) {
                                    photoCropView.draggingState = 0;
                                } else {
                                    photoCropView.draggingState = 0;
                                }
                            } else if (f >= x3) {
                                if (f2 < x3) {
                                    photoCropView.draggingState = 0;
                                } else {
                                    photoCropView.draggingState = 0;
                                }
                            } else if (f2 < x3) {
                                photoCropView.draggingState = 0;
                            } else {
                                photoCropView.draggingState = 0;
                            }
                        } else {
                            photoCropView.draggingState = 1;
                        }
                    }
                    if (photoCropView.draggingState != 0) {
                        photoCropView.requestDisallowInterceptTouchEvent(true);
                    }
                    photoCropView.oldX = x3;
                    photoCropView.oldY = y3;
                } else if (motionEvent.getAction() == 1) {
                    photoCropView.draggingState = 0;
                } else if (motionEvent.getAction() == 2 && (i = photoCropView.draggingState) != 0) {
                    float f14 = x3 - photoCropView.oldX;
                    float f15 = y3 - photoCropView.oldY;
                    if (i == 5) {
                        float f16 = photoCropView.rectX + f14;
                        photoCropView.rectX = f16;
                        float f17 = photoCropView.rectY + f15;
                        photoCropView.rectY = f17;
                        int i6 = photoCropView.bitmapX;
                        float f18 = i6;
                        if (f16 < f18) {
                            photoCropView.rectX = f18;
                        } else {
                            float f19 = photoCropView.rectSizeX;
                            float f20 = f16 + f19;
                            float f21 = i6 + photoCropView.bitmapWidth;
                            if (f20 > f21) {
                                photoCropView.rectX = f21 - f19;
                            }
                        }
                        int i7 = photoCropView.bitmapY;
                        float f22 = i7;
                        if (f17 < f22) {
                            photoCropView.rectY = f22;
                        } else {
                            float f23 = photoCropView.rectSizeY;
                            float f24 = f17 + f23;
                            float f25 = i7 + photoCropView.bitmapHeight;
                            if (f24 > f25) {
                                photoCropView.rectY = f25 - f23;
                            }
                        }
                    } else if (i == 1) {
                        float f26 = photoCropView.rectSizeX;
                        if (f26 - f14 < 160.0f) {
                            f14 = f26 - 160.0f;
                        }
                        float f27 = photoCropView.rectX;
                        float f28 = f27 + f14;
                        float f29 = photoCropView.bitmapX;
                        if (f28 < f29) {
                            f14 = f29 - f27;
                        }
                        if (photoCropView.freeform) {
                            float f30 = photoCropView.rectSizeY;
                            if (f30 - f15 < 160.0f) {
                                f15 = f30 - 160.0f;
                            }
                            float f31 = photoCropView.rectY;
                            float f32 = f31 + f15;
                            float f33 = photoCropView.bitmapY;
                            if (f32 < f33) {
                                f15 = f33 - f31;
                            }
                            photoCropView.rectX = f27 + f14;
                            photoCropView.rectY = f31 + f15;
                            photoCropView.rectSizeX = f26 - f14;
                            photoCropView.rectSizeY = f30 - f15;
                        } else {
                            float f34 = photoCropView.rectY;
                            float f35 = f34 + f14;
                            float f36 = photoCropView.bitmapY;
                            if (f35 < f36) {
                                f14 = f36 - f34;
                            }
                            photoCropView.rectX = f27 + f14;
                            photoCropView.rectY = f34 + f14;
                            photoCropView.rectSizeX = f26 - f14;
                            photoCropView.rectSizeY -= f14;
                        }
                    } else if (i == 2) {
                        float f37 = photoCropView.rectSizeX;
                        if (f37 + f14 < 160.0f) {
                            f14 = -(f37 - 160.0f);
                        }
                        float f38 = photoCropView.rectX;
                        float f39 = f38 + f37 + f14;
                        float f40 = photoCropView.bitmapX + photoCropView.bitmapWidth;
                        if (f39 > f40) {
                            f14 = (f40 - f38) - f37;
                        }
                        if (photoCropView.freeform) {
                            float f41 = photoCropView.rectSizeY;
                            if (f41 - f15 < 160.0f) {
                                f15 = f41 - 160.0f;
                            }
                            float f42 = photoCropView.rectY;
                            float f43 = f42 + f15;
                            float f44 = photoCropView.bitmapY;
                            if (f43 < f44) {
                                f15 = f44 - f42;
                            }
                            photoCropView.rectY = f42 + f15;
                            photoCropView.rectSizeX = f37 + f14;
                            photoCropView.rectSizeY = f41 - f15;
                        } else {
                            float f45 = photoCropView.rectY;
                            float f46 = f45 - f14;
                            float f47 = photoCropView.bitmapY;
                            if (f46 < f47) {
                                f14 = f45 - f47;
                            }
                            photoCropView.rectY = f45 - f14;
                            photoCropView.rectSizeX = f37 + f14;
                            photoCropView.rectSizeY += f14;
                        }
                    } else if (i == 3) {
                        float f48 = photoCropView.rectSizeX;
                        if (f48 - f14 < 160.0f) {
                            f14 = f48 - 160.0f;
                        }
                        float f49 = photoCropView.rectX;
                        float f50 = f49 + f14;
                        float f51 = photoCropView.bitmapX;
                        if (f50 < f51) {
                            f14 = f51 - f49;
                        }
                        if (photoCropView.freeform) {
                            float f52 = photoCropView.rectY;
                            float f53 = photoCropView.rectSizeY;
                            float f54 = f52 + f53 + f15;
                            float f55 = photoCropView.bitmapY + photoCropView.bitmapHeight;
                            if (f54 > f55) {
                                f15 = (f55 - f52) - f53;
                            }
                            photoCropView.rectX = f49 + f14;
                            photoCropView.rectSizeX = f48 - f14;
                            float f56 = f53 + f15;
                            photoCropView.rectSizeY = f56;
                            if (f56 < 160.0f) {
                                photoCropView.rectSizeY = 160.0f;
                            }
                        } else {
                            float f57 = photoCropView.rectY + f48;
                            float f58 = f57 - f14;
                            int i8 = photoCropView.bitmapY;
                            int i9 = photoCropView.bitmapHeight;
                            if (f58 > i8 + i9) {
                                f14 = (f57 - i8) - i9;
                            }
                            photoCropView.rectX = f49 + f14;
                            photoCropView.rectSizeX = f48 - f14;
                            photoCropView.rectSizeY -= f14;
                        }
                    } else if (i == 4) {
                        float f59 = photoCropView.rectX;
                        float f60 = photoCropView.rectSizeX;
                        float f61 = f59 + f60 + f14;
                        float f62 = photoCropView.bitmapX + photoCropView.bitmapWidth;
                        if (f61 > f62) {
                            f14 = (f62 - f59) - f60;
                        }
                        if (photoCropView.freeform) {
                            float f63 = photoCropView.rectY;
                            float f64 = photoCropView.rectSizeY;
                            float f65 = f63 + f64 + f15;
                            float f66 = photoCropView.bitmapY + photoCropView.bitmapHeight;
                            if (f65 > f66) {
                                f15 = (f66 - f63) - f64;
                            }
                            photoCropView.rectSizeX = f60 + f14;
                            photoCropView.rectSizeY = f64 + f15;
                        } else {
                            float f67 = photoCropView.rectY;
                            float f68 = f67 + f60 + f14;
                            float f69 = photoCropView.bitmapY + photoCropView.bitmapHeight;
                            if (f68 > f69) {
                                f14 = (f69 - f67) - f60;
                            }
                            photoCropView.rectSizeX = f60 + f14;
                            photoCropView.rectSizeY += f14;
                        }
                        if (photoCropView.rectSizeX < 160.0f) {
                            photoCropView.rectSizeX = 160.0f;
                        }
                        if (photoCropView.rectSizeY < 160.0f) {
                            photoCropView.rectSizeY = 160.0f;
                        }
                    }
                    photoCropView.oldX = x3;
                    photoCropView.oldY = y3;
                    photoCropView.invalidate();
                }
                return true;
            case 13:
                PollItemMenu pollItemMenu = (PollItemMenu) this.f$0;
                if (pollItemMenu.messageOptionsView != null && motionEvent.getAction() == 0) {
                    Drawable backgroundDrawable2 = ((ActionBarPopupWindow.ActionBarPopupWindowLayout) pollItemMenu.messageOptionsView).getBackgroundDrawable();
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    rectF2.set(backgroundDrawable2.getBounds());
                    rectF2.offset(pollItemMenu.messageOptionsView.getX(), pollItemMenu.messageOptionsView.getY());
                    if (!rectF2.contains(motionEvent.getX(), motionEvent.getY())) {
                        pollItemMenu.dismiss(true);
                        return true;
                    }
                }
                return false;
            case 14:
                SelectAnimatedEmojiDialog selectAnimatedEmojiDialog = (SelectAnimatedEmojiDialog) this.f$0;
                selectAnimatedEmojiDialog.getClass();
                if (motionEvent.getAction() != 0 || (selectAnimatedEmojiDialog$SelectAnimatedEmojiDialogWindow$$ExternalSyntheticLambda1 = selectAnimatedEmojiDialog.dismiss) == null) {
                    return false;
                }
                selectAnimatedEmojiDialog$SelectAnimatedEmojiDialogWindow$$ExternalSyntheticLambda1.run();
                return true;
            default:
                PaintView paintView = (PaintView) this.f$0;
                paintView.getClass();
                if (motionEvent.getActionMasked() != 0 || (actionBarPopupWindow5 = paintView.popupWindow) == null || !actionBarPopupWindow5.isShowing()) {
                    return false;
                }
                view.getHitRect(paintView.popupRect);
                if (paintView.popupRect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                    return false;
                }
                paintView.popupWindow.dismiss(true);
                return false;
        }
    }
}
