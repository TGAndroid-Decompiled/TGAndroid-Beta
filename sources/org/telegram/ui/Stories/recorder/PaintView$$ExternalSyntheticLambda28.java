package org.telegram.ui.Stories.recorder;

import android.graphics.PointF;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Paint.Views.EntityView;
import org.telegram.ui.Components.Paint.Views.LinkView;
import org.telegram.ui.Components.Paint.Views.LocationView;
import org.telegram.ui.Components.Paint.Views.MessageEntityView;
import org.telegram.ui.Components.Paint.Views.PhotoView;
import org.telegram.ui.Components.Paint.Views.ReactionWidgetEntityView;
import org.telegram.ui.Components.Paint.Views.RoundView;
import org.telegram.ui.Components.Paint.Views.StickerView;
import org.telegram.ui.Components.Paint.Views.TextPaintView;
import org.telegram.ui.Components.Paint.Views.WeatherView;
import org.telegram.ui.OAuthSheet$$ExternalSyntheticLambda18;

public final class PaintView$$ExternalSyntheticLambda28 implements Runnable {
    public final int $r8$classId;
    public final PaintView f$0;
    public final EntityView f$1;

    public PaintView$$ExternalSyntheticLambda28(PaintView paintView, EntityView entityView, int i) {
        this.$r8$classId = i;
        this.f$0 = paintView;
        this.f$1 = entityView;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                final PaintView paintView = this.f$0;
                paintView.getClass();
                LinearLayout linearLayout = new LinearLayout(paintView.getContext());
                linearLayout.setOrientation(0);
                final EntityView entityView = this.f$1;
                boolean z = entityView instanceof MessageEntityView;
                PaintView.AnonymousClass2 anonymousClass2 = paintView.resourcesProvider;
                if (!z) {
                    TextView textView = new TextView(paintView.getContext());
                    textView.setTextColor(Theme.getColor(Theme.key_actionBarDefaultSubmenuItem, anonymousClass2));
                    textView.setGravity(16);
                    textView.setLines(1);
                    textView.setSingleLine();
                    textView.setEllipsize(TextUtils.TruncateAt.END);
                    textView.setTypeface(AndroidUtilities.bold());
                    textView.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
                    textView.setTextSize(1, 14.0f);
                    textView.setTag(0);
                    textView.setText(LocaleController.getString("PaintDelete", R.string.PaintDelete));
                    final int i = 0;
                    textView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            EntityView entityView2;
                            switch (i) {
                                case 0:
                                    PaintView paintView2 = paintView;
                                    paintView2.getClass();
                                    EntityView entityView3 = entityView;
                                    if (entityView3 instanceof RoundView) {
                                        StoryRecorder.AnonymousClass8 anonymousClass8 = StoryRecorder.this.captionEdit;
                                        if (anonymousClass8 != null) {
                                            anonymousClass8.showRemoveRoundAlert();
                                        }
                                    } else {
                                        paintView2.removeEntity$1(entityView3);
                                    }
                                    ActionBarPopupWindow actionBarPopupWindow = paintView2.popupWindow;
                                    if (actionBarPopupWindow != null && actionBarPopupWindow.isShowing()) {
                                        paintView2.popupWindow.dismiss(true);
                                        break;
                                    }
                                    break;
                                case 1:
                                    EntityView entityView4 = entityView;
                                    PaintView paintView3 = paintView;
                                    paintView3.getClass();
                                    try {
                                        ((TextPaintView) entityView4).getEditText().onTextContextMenuItem(16908337);
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                    ActionBarPopupWindow actionBarPopupWindow2 = paintView3.popupWindow;
                                    if (actionBarPopupWindow2 != null && actionBarPopupWindow2.isShowing()) {
                                        paintView3.popupWindow.dismiss(true);
                                        break;
                                    }
                                    break;
                                case 2:
                                    PaintView paintView4 = paintView;
                                    paintView4.selectEntity$1(entityView, true);
                                    paintView4.editSelectedTextEntity$1();
                                    ActionBarPopupWindow actionBarPopupWindow3 = paintView4.popupWindow;
                                    if (actionBarPopupWindow3 != null && actionBarPopupWindow3.isShowing()) {
                                        paintView4.popupWindow.dismiss(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    PaintView paintView5 = paintView;
                                    paintView5.selectEntity$1(null, true);
                                    EntityView entityView5 = entityView;
                                    paintView5.showLocationAlert((LocationView) entityView5, new OAuthSheet$$ExternalSyntheticLambda18(26, paintView5, entityView5));
                                    ActionBarPopupWindow actionBarPopupWindow4 = paintView5.popupWindow;
                                    if (actionBarPopupWindow4 != null && actionBarPopupWindow4.isShowing()) {
                                        paintView5.popupWindow.dismiss(true);
                                        break;
                                    }
                                    break;
                                case 4:
                                    PaintView paintView6 = paintView;
                                    paintView6.selectEntity$1(null, true);
                                    paintView6.showLinkAlert((LinkView) entityView);
                                    ActionBarPopupWindow actionBarPopupWindow5 = paintView6.popupWindow;
                                    if (actionBarPopupWindow5 != null && actionBarPopupWindow5.isShowing()) {
                                        paintView6.popupWindow.dismiss(true);
                                        break;
                                    }
                                    break;
                                case 5:
                                    PaintView paintView7 = paintView;
                                    paintView7.getClass();
                                    EntityView entityView6 = entityView;
                                    if (entityView6 instanceof StickerView) {
                                        ((StickerView) entityView6).mirror(true);
                                    } else if (entityView6 instanceof ReactionWidgetEntityView) {
                                        ((ReactionWidgetEntityView) entityView6).mirror(true);
                                    } else if (entityView6 instanceof RoundView) {
                                        RoundView roundView = (RoundView) entityView6;
                                        roundView.mirrored = !roundView.mirrored;
                                        roundView.invalidate();
                                    } else {
                                        ((PhotoView) entityView6).mirror(true);
                                    }
                                    ActionBarPopupWindow actionBarPopupWindow6 = paintView7.popupWindow;
                                    if (actionBarPopupWindow6 != null && actionBarPopupWindow6.isShowing()) {
                                        paintView7.popupWindow.dismiss(true);
                                        break;
                                    }
                                    break;
                                case 6:
                                    PaintView paintView8 = paintView;
                                    paintView8.getClass();
                                    entityView.bringToFront();
                                    ActionBarPopupWindow actionBarPopupWindow7 = paintView8.popupWindow;
                                    if (actionBarPopupWindow7 != null && actionBarPopupWindow7.isShowing()) {
                                        paintView8.popupWindow.dismiss(true);
                                        break;
                                    }
                                    break;
                                default:
                                    PaintView paintView9 = paintView;
                                    EntityView entityView7 = entityView;
                                    if (entityView7 != null) {
                                        PointF pointFStartPositionRelativeToEntity$1 = paintView9.startPositionRelativeToEntity$1(entityView7);
                                        boolean z2 = entityView7 instanceof StickerView;
                                        PaintView.AnonymousClass7 anonymousClass7 = paintView9.entitiesView;
                                        if (z2) {
                                            EntityView stickerView = new StickerView(paintView9.getContext(), (StickerView) entityView7, pointFStartPositionRelativeToEntity$1);
                                            stickerView.setDelegate(paintView9);
                                            anonymousClass7.addView(stickerView);
                                            paintView9.checkEntitiesIsVideo();
                                            entityView2 = stickerView;
                                        } else if (entityView7 instanceof TextPaintView) {
                                            TextPaintView textPaintView = new TextPaintView(paintView9.getContext(), (TextPaintView) entityView7, pointFStartPositionRelativeToEntity$1);
                                            textPaintView.setDelegate(paintView9);
                                            textPaintView.setMaxWidth(paintView9.w - AndroidUtilities.dp(32.0f));
                                            anonymousClass7.addView(textPaintView, LayoutHelper.createFrame(-2.0f, -2));
                                            paintView9.checkEntitiesIsVideo();
                                            entityView2 = textPaintView;
                                        }
                                        paintView9.registerRemovalUndo$1(entityView2);
                                        paintView9.selectEntity$1(null, true);
                                        paintView9.appearAnimation(entityView2);
                                    }
                                    ActionBarPopupWindow actionBarPopupWindow8 = paintView9.popupWindow;
                                    if (actionBarPopupWindow8 != null && actionBarPopupWindow8.isShowing()) {
                                        paintView9.popupWindow.dismiss(true);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    linearLayout.addView(textView, LayoutHelper.createLinear(-2, 44));
                }
                if (entityView instanceof TextPaintView) {
                    TextView textView2 = new TextView(paintView.getContext());
                    textView2.setTextColor(Theme.getColor(Theme.key_actionBarDefaultSubmenuItem, anonymousClass2));
                    textView2.setGravity(16);
                    textView2.setLines(1);
                    textView2.setSingleLine();
                    textView2.setEllipsize(TextUtils.TruncateAt.END);
                    textView2.setTypeface(AndroidUtilities.bold());
                    textView2.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
                    textView2.setTextSize(1, 14.0f);
                    PaintView.AnonymousClass13 anonymousClass13 = paintView.keyboardNotifier;
                    if ((!anonymousClass13.keyboardVisible() || anonymousClass13.ignoring) && paintView.emojiPadding <= 0) {
                        textView2.setTag(1);
                        textView2.setText(LocaleController.getString(R.string.PaintEdit));
                        final int i2 = 2;
                        textView2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public final void onClick(View view) {
                                EntityView entityView2;
                                switch (i2) {
                                    case 0:
                                        PaintView paintView2 = paintView;
                                        paintView2.getClass();
                                        EntityView entityView3 = entityView;
                                        if (entityView3 instanceof RoundView) {
                                            StoryRecorder.AnonymousClass8 anonymousClass8 = StoryRecorder.this.captionEdit;
                                            if (anonymousClass8 != null) {
                                                anonymousClass8.showRemoveRoundAlert();
                                            }
                                        } else {
                                            paintView2.removeEntity$1(entityView3);
                                        }
                                        ActionBarPopupWindow actionBarPopupWindow = paintView2.popupWindow;
                                        if (actionBarPopupWindow != null && actionBarPopupWindow.isShowing()) {
                                            paintView2.popupWindow.dismiss(true);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        EntityView entityView4 = entityView;
                                        PaintView paintView3 = paintView;
                                        paintView3.getClass();
                                        try {
                                            ((TextPaintView) entityView4).getEditText().onTextContextMenuItem(16908337);
                                        } catch (Exception e) {
                                            FileLog.e(e);
                                        }
                                        ActionBarPopupWindow actionBarPopupWindow2 = paintView3.popupWindow;
                                        if (actionBarPopupWindow2 != null && actionBarPopupWindow2.isShowing()) {
                                            paintView3.popupWindow.dismiss(true);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        PaintView paintView4 = paintView;
                                        paintView4.selectEntity$1(entityView, true);
                                        paintView4.editSelectedTextEntity$1();
                                        ActionBarPopupWindow actionBarPopupWindow3 = paintView4.popupWindow;
                                        if (actionBarPopupWindow3 != null && actionBarPopupWindow3.isShowing()) {
                                            paintView4.popupWindow.dismiss(true);
                                            break;
                                        }
                                        break;
                                    case 3:
                                        PaintView paintView5 = paintView;
                                        paintView5.selectEntity$1(null, true);
                                        EntityView entityView5 = entityView;
                                        paintView5.showLocationAlert((LocationView) entityView5, new OAuthSheet$$ExternalSyntheticLambda18(26, paintView5, entityView5));
                                        ActionBarPopupWindow actionBarPopupWindow4 = paintView5.popupWindow;
                                        if (actionBarPopupWindow4 != null && actionBarPopupWindow4.isShowing()) {
                                            paintView5.popupWindow.dismiss(true);
                                            break;
                                        }
                                        break;
                                    case 4:
                                        PaintView paintView6 = paintView;
                                        paintView6.selectEntity$1(null, true);
                                        paintView6.showLinkAlert((LinkView) entityView);
                                        ActionBarPopupWindow actionBarPopupWindow5 = paintView6.popupWindow;
                                        if (actionBarPopupWindow5 != null && actionBarPopupWindow5.isShowing()) {
                                            paintView6.popupWindow.dismiss(true);
                                            break;
                                        }
                                        break;
                                    case 5:
                                        PaintView paintView7 = paintView;
                                        paintView7.getClass();
                                        EntityView entityView6 = entityView;
                                        if (entityView6 instanceof StickerView) {
                                            ((StickerView) entityView6).mirror(true);
                                        } else if (entityView6 instanceof ReactionWidgetEntityView) {
                                            ((ReactionWidgetEntityView) entityView6).mirror(true);
                                        } else if (entityView6 instanceof RoundView) {
                                            RoundView roundView = (RoundView) entityView6;
                                            roundView.mirrored = !roundView.mirrored;
                                            roundView.invalidate();
                                        } else {
                                            ((PhotoView) entityView6).mirror(true);
                                        }
                                        ActionBarPopupWindow actionBarPopupWindow6 = paintView7.popupWindow;
                                        if (actionBarPopupWindow6 != null && actionBarPopupWindow6.isShowing()) {
                                            paintView7.popupWindow.dismiss(true);
                                            break;
                                        }
                                        break;
                                    case 6:
                                        PaintView paintView8 = paintView;
                                        paintView8.getClass();
                                        entityView.bringToFront();
                                        ActionBarPopupWindow actionBarPopupWindow7 = paintView8.popupWindow;
                                        if (actionBarPopupWindow7 != null && actionBarPopupWindow7.isShowing()) {
                                            paintView8.popupWindow.dismiss(true);
                                            break;
                                        }
                                        break;
                                    default:
                                        PaintView paintView9 = paintView;
                                        EntityView entityView7 = entityView;
                                        if (entityView7 != null) {
                                            PointF pointFStartPositionRelativeToEntity$1 = paintView9.startPositionRelativeToEntity$1(entityView7);
                                            boolean z2 = entityView7 instanceof StickerView;
                                            PaintView.AnonymousClass7 anonymousClass7 = paintView9.entitiesView;
                                            if (z2) {
                                                EntityView stickerView = new StickerView(paintView9.getContext(), (StickerView) entityView7, pointFStartPositionRelativeToEntity$1);
                                                stickerView.setDelegate(paintView9);
                                                anonymousClass7.addView(stickerView);
                                                paintView9.checkEntitiesIsVideo();
                                                entityView2 = stickerView;
                                            } else if (entityView7 instanceof TextPaintView) {
                                                TextPaintView textPaintView = new TextPaintView(paintView9.getContext(), (TextPaintView) entityView7, pointFStartPositionRelativeToEntity$1);
                                                textPaintView.setDelegate(paintView9);
                                                textPaintView.setMaxWidth(paintView9.w - AndroidUtilities.dp(32.0f));
                                                anonymousClass7.addView(textPaintView, LayoutHelper.createFrame(-2.0f, -2));
                                                paintView9.checkEntitiesIsVideo();
                                                entityView2 = textPaintView;
                                            }
                                            paintView9.registerRemovalUndo$1(entityView2);
                                            paintView9.selectEntity$1(null, true);
                                            paintView9.appearAnimation(entityView2);
                                        }
                                        ActionBarPopupWindow actionBarPopupWindow8 = paintView9.popupWindow;
                                        if (actionBarPopupWindow8 != null && actionBarPopupWindow8.isShowing()) {
                                            paintView9.popupWindow.dismiss(true);
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                    } else {
                        textView2.setTag(3);
                        textView2.setText(LocaleController.getString(R.string.Paste));
                        final int i3 = 1;
                        textView2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public final void onClick(View view) {
                                EntityView entityView2;
                                switch (i3) {
                                    case 0:
                                        PaintView paintView2 = paintView;
                                        paintView2.getClass();
                                        EntityView entityView3 = entityView;
                                        if (entityView3 instanceof RoundView) {
                                            StoryRecorder.AnonymousClass8 anonymousClass8 = StoryRecorder.this.captionEdit;
                                            if (anonymousClass8 != null) {
                                                anonymousClass8.showRemoveRoundAlert();
                                            }
                                        } else {
                                            paintView2.removeEntity$1(entityView3);
                                        }
                                        ActionBarPopupWindow actionBarPopupWindow = paintView2.popupWindow;
                                        if (actionBarPopupWindow != null && actionBarPopupWindow.isShowing()) {
                                            paintView2.popupWindow.dismiss(true);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        EntityView entityView4 = entityView;
                                        PaintView paintView3 = paintView;
                                        paintView3.getClass();
                                        try {
                                            ((TextPaintView) entityView4).getEditText().onTextContextMenuItem(16908337);
                                        } catch (Exception e) {
                                            FileLog.e(e);
                                        }
                                        ActionBarPopupWindow actionBarPopupWindow2 = paintView3.popupWindow;
                                        if (actionBarPopupWindow2 != null && actionBarPopupWindow2.isShowing()) {
                                            paintView3.popupWindow.dismiss(true);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        PaintView paintView4 = paintView;
                                        paintView4.selectEntity$1(entityView, true);
                                        paintView4.editSelectedTextEntity$1();
                                        ActionBarPopupWindow actionBarPopupWindow3 = paintView4.popupWindow;
                                        if (actionBarPopupWindow3 != null && actionBarPopupWindow3.isShowing()) {
                                            paintView4.popupWindow.dismiss(true);
                                            break;
                                        }
                                        break;
                                    case 3:
                                        PaintView paintView5 = paintView;
                                        paintView5.selectEntity$1(null, true);
                                        EntityView entityView5 = entityView;
                                        paintView5.showLocationAlert((LocationView) entityView5, new OAuthSheet$$ExternalSyntheticLambda18(26, paintView5, entityView5));
                                        ActionBarPopupWindow actionBarPopupWindow4 = paintView5.popupWindow;
                                        if (actionBarPopupWindow4 != null && actionBarPopupWindow4.isShowing()) {
                                            paintView5.popupWindow.dismiss(true);
                                            break;
                                        }
                                        break;
                                    case 4:
                                        PaintView paintView6 = paintView;
                                        paintView6.selectEntity$1(null, true);
                                        paintView6.showLinkAlert((LinkView) entityView);
                                        ActionBarPopupWindow actionBarPopupWindow5 = paintView6.popupWindow;
                                        if (actionBarPopupWindow5 != null && actionBarPopupWindow5.isShowing()) {
                                            paintView6.popupWindow.dismiss(true);
                                            break;
                                        }
                                        break;
                                    case 5:
                                        PaintView paintView7 = paintView;
                                        paintView7.getClass();
                                        EntityView entityView6 = entityView;
                                        if (entityView6 instanceof StickerView) {
                                            ((StickerView) entityView6).mirror(true);
                                        } else if (entityView6 instanceof ReactionWidgetEntityView) {
                                            ((ReactionWidgetEntityView) entityView6).mirror(true);
                                        } else if (entityView6 instanceof RoundView) {
                                            RoundView roundView = (RoundView) entityView6;
                                            roundView.mirrored = !roundView.mirrored;
                                            roundView.invalidate();
                                        } else {
                                            ((PhotoView) entityView6).mirror(true);
                                        }
                                        ActionBarPopupWindow actionBarPopupWindow6 = paintView7.popupWindow;
                                        if (actionBarPopupWindow6 != null && actionBarPopupWindow6.isShowing()) {
                                            paintView7.popupWindow.dismiss(true);
                                            break;
                                        }
                                        break;
                                    case 6:
                                        PaintView paintView8 = paintView;
                                        paintView8.getClass();
                                        entityView.bringToFront();
                                        ActionBarPopupWindow actionBarPopupWindow7 = paintView8.popupWindow;
                                        if (actionBarPopupWindow7 != null && actionBarPopupWindow7.isShowing()) {
                                            paintView8.popupWindow.dismiss(true);
                                            break;
                                        }
                                        break;
                                    default:
                                        PaintView paintView9 = paintView;
                                        EntityView entityView7 = entityView;
                                        if (entityView7 != null) {
                                            PointF pointFStartPositionRelativeToEntity$1 = paintView9.startPositionRelativeToEntity$1(entityView7);
                                            boolean z2 = entityView7 instanceof StickerView;
                                            PaintView.AnonymousClass7 anonymousClass7 = paintView9.entitiesView;
                                            if (z2) {
                                                EntityView stickerView = new StickerView(paintView9.getContext(), (StickerView) entityView7, pointFStartPositionRelativeToEntity$1);
                                                stickerView.setDelegate(paintView9);
                                                anonymousClass7.addView(stickerView);
                                                paintView9.checkEntitiesIsVideo();
                                                entityView2 = stickerView;
                                            } else if (entityView7 instanceof TextPaintView) {
                                                TextPaintView textPaintView = new TextPaintView(paintView9.getContext(), (TextPaintView) entityView7, pointFStartPositionRelativeToEntity$1);
                                                textPaintView.setDelegate(paintView9);
                                                textPaintView.setMaxWidth(paintView9.w - AndroidUtilities.dp(32.0f));
                                                anonymousClass7.addView(textPaintView, LayoutHelper.createFrame(-2.0f, -2));
                                                paintView9.checkEntitiesIsVideo();
                                                entityView2 = textPaintView;
                                            }
                                            paintView9.registerRemovalUndo$1(entityView2);
                                            paintView9.selectEntity$1(null, true);
                                            paintView9.appearAnimation(entityView2);
                                        }
                                        ActionBarPopupWindow actionBarPopupWindow8 = paintView9.popupWindow;
                                        if (actionBarPopupWindow8 != null && actionBarPopupWindow8.isShowing()) {
                                            paintView9.popupWindow.dismiss(true);
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                    }
                    linearLayout.addView(textView2, LayoutHelper.createLinear(-2, 44));
                } else if (entityView instanceof LocationView) {
                    TextView textViewCreateActionLayoutButton = paintView.createActionLayoutButton(1, LocaleController.getString(R.string.PaintEdit));
                    final int i4 = 3;
                    textViewCreateActionLayoutButton.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            EntityView entityView2;
                            switch (i4) {
                                case 0:
                                    PaintView paintView2 = paintView;
                                    paintView2.getClass();
                                    EntityView entityView3 = entityView;
                                    if (entityView3 instanceof RoundView) {
                                        StoryRecorder.AnonymousClass8 anonymousClass8 = StoryRecorder.this.captionEdit;
                                        if (anonymousClass8 != null) {
                                            anonymousClass8.showRemoveRoundAlert();
                                        }
                                    } else {
                                        paintView2.removeEntity$1(entityView3);
                                    }
                                    ActionBarPopupWindow actionBarPopupWindow = paintView2.popupWindow;
                                    if (actionBarPopupWindow != null && actionBarPopupWindow.isShowing()) {
                                        paintView2.popupWindow.dismiss(true);
                                        break;
                                    }
                                    break;
                                case 1:
                                    EntityView entityView4 = entityView;
                                    PaintView paintView3 = paintView;
                                    paintView3.getClass();
                                    try {
                                        ((TextPaintView) entityView4).getEditText().onTextContextMenuItem(16908337);
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                    ActionBarPopupWindow actionBarPopupWindow2 = paintView3.popupWindow;
                                    if (actionBarPopupWindow2 != null && actionBarPopupWindow2.isShowing()) {
                                        paintView3.popupWindow.dismiss(true);
                                        break;
                                    }
                                    break;
                                case 2:
                                    PaintView paintView4 = paintView;
                                    paintView4.selectEntity$1(entityView, true);
                                    paintView4.editSelectedTextEntity$1();
                                    ActionBarPopupWindow actionBarPopupWindow3 = paintView4.popupWindow;
                                    if (actionBarPopupWindow3 != null && actionBarPopupWindow3.isShowing()) {
                                        paintView4.popupWindow.dismiss(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    PaintView paintView5 = paintView;
                                    paintView5.selectEntity$1(null, true);
                                    EntityView entityView5 = entityView;
                                    paintView5.showLocationAlert((LocationView) entityView5, new OAuthSheet$$ExternalSyntheticLambda18(26, paintView5, entityView5));
                                    ActionBarPopupWindow actionBarPopupWindow4 = paintView5.popupWindow;
                                    if (actionBarPopupWindow4 != null && actionBarPopupWindow4.isShowing()) {
                                        paintView5.popupWindow.dismiss(true);
                                        break;
                                    }
                                    break;
                                case 4:
                                    PaintView paintView6 = paintView;
                                    paintView6.selectEntity$1(null, true);
                                    paintView6.showLinkAlert((LinkView) entityView);
                                    ActionBarPopupWindow actionBarPopupWindow5 = paintView6.popupWindow;
                                    if (actionBarPopupWindow5 != null && actionBarPopupWindow5.isShowing()) {
                                        paintView6.popupWindow.dismiss(true);
                                        break;
                                    }
                                    break;
                                case 5:
                                    PaintView paintView7 = paintView;
                                    paintView7.getClass();
                                    EntityView entityView6 = entityView;
                                    if (entityView6 instanceof StickerView) {
                                        ((StickerView) entityView6).mirror(true);
                                    } else if (entityView6 instanceof ReactionWidgetEntityView) {
                                        ((ReactionWidgetEntityView) entityView6).mirror(true);
                                    } else if (entityView6 instanceof RoundView) {
                                        RoundView roundView = (RoundView) entityView6;
                                        roundView.mirrored = !roundView.mirrored;
                                        roundView.invalidate();
                                    } else {
                                        ((PhotoView) entityView6).mirror(true);
                                    }
                                    ActionBarPopupWindow actionBarPopupWindow6 = paintView7.popupWindow;
                                    if (actionBarPopupWindow6 != null && actionBarPopupWindow6.isShowing()) {
                                        paintView7.popupWindow.dismiss(true);
                                        break;
                                    }
                                    break;
                                case 6:
                                    PaintView paintView8 = paintView;
                                    paintView8.getClass();
                                    entityView.bringToFront();
                                    ActionBarPopupWindow actionBarPopupWindow7 = paintView8.popupWindow;
                                    if (actionBarPopupWindow7 != null && actionBarPopupWindow7.isShowing()) {
                                        paintView8.popupWindow.dismiss(true);
                                        break;
                                    }
                                    break;
                                default:
                                    PaintView paintView9 = paintView;
                                    EntityView entityView7 = entityView;
                                    if (entityView7 != null) {
                                        PointF pointFStartPositionRelativeToEntity$1 = paintView9.startPositionRelativeToEntity$1(entityView7);
                                        boolean z2 = entityView7 instanceof StickerView;
                                        PaintView.AnonymousClass7 anonymousClass7 = paintView9.entitiesView;
                                        if (z2) {
                                            EntityView stickerView = new StickerView(paintView9.getContext(), (StickerView) entityView7, pointFStartPositionRelativeToEntity$1);
                                            stickerView.setDelegate(paintView9);
                                            anonymousClass7.addView(stickerView);
                                            paintView9.checkEntitiesIsVideo();
                                            entityView2 = stickerView;
                                        } else if (entityView7 instanceof TextPaintView) {
                                            TextPaintView textPaintView = new TextPaintView(paintView9.getContext(), (TextPaintView) entityView7, pointFStartPositionRelativeToEntity$1);
                                            textPaintView.setDelegate(paintView9);
                                            textPaintView.setMaxWidth(paintView9.w - AndroidUtilities.dp(32.0f));
                                            anonymousClass7.addView(textPaintView, LayoutHelper.createFrame(-2.0f, -2));
                                            paintView9.checkEntitiesIsVideo();
                                            entityView2 = textPaintView;
                                        }
                                        paintView9.registerRemovalUndo$1(entityView2);
                                        paintView9.selectEntity$1(null, true);
                                        paintView9.appearAnimation(entityView2);
                                    }
                                    ActionBarPopupWindow actionBarPopupWindow8 = paintView9.popupWindow;
                                    if (actionBarPopupWindow8 != null && actionBarPopupWindow8.isShowing()) {
                                        paintView9.popupWindow.dismiss(true);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    linearLayout.addView(textViewCreateActionLayoutButton, LayoutHelper.createLinear(-2, 44));
                } else if (entityView instanceof LinkView) {
                    TextView textViewCreateActionLayoutButton2 = paintView.createActionLayoutButton(1, LocaleController.getString(R.string.PaintEdit));
                    final int i5 = 4;
                    textViewCreateActionLayoutButton2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            EntityView entityView2;
                            switch (i5) {
                                case 0:
                                    PaintView paintView2 = paintView;
                                    paintView2.getClass();
                                    EntityView entityView3 = entityView;
                                    if (entityView3 instanceof RoundView) {
                                        StoryRecorder.AnonymousClass8 anonymousClass8 = StoryRecorder.this.captionEdit;
                                        if (anonymousClass8 != null) {
                                            anonymousClass8.showRemoveRoundAlert();
                                        }
                                    } else {
                                        paintView2.removeEntity$1(entityView3);
                                    }
                                    ActionBarPopupWindow actionBarPopupWindow = paintView2.popupWindow;
                                    if (actionBarPopupWindow != null && actionBarPopupWindow.isShowing()) {
                                        paintView2.popupWindow.dismiss(true);
                                        break;
                                    }
                                    break;
                                case 1:
                                    EntityView entityView4 = entityView;
                                    PaintView paintView3 = paintView;
                                    paintView3.getClass();
                                    try {
                                        ((TextPaintView) entityView4).getEditText().onTextContextMenuItem(16908337);
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                    ActionBarPopupWindow actionBarPopupWindow2 = paintView3.popupWindow;
                                    if (actionBarPopupWindow2 != null && actionBarPopupWindow2.isShowing()) {
                                        paintView3.popupWindow.dismiss(true);
                                        break;
                                    }
                                    break;
                                case 2:
                                    PaintView paintView4 = paintView;
                                    paintView4.selectEntity$1(entityView, true);
                                    paintView4.editSelectedTextEntity$1();
                                    ActionBarPopupWindow actionBarPopupWindow3 = paintView4.popupWindow;
                                    if (actionBarPopupWindow3 != null && actionBarPopupWindow3.isShowing()) {
                                        paintView4.popupWindow.dismiss(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    PaintView paintView5 = paintView;
                                    paintView5.selectEntity$1(null, true);
                                    EntityView entityView5 = entityView;
                                    paintView5.showLocationAlert((LocationView) entityView5, new OAuthSheet$$ExternalSyntheticLambda18(26, paintView5, entityView5));
                                    ActionBarPopupWindow actionBarPopupWindow4 = paintView5.popupWindow;
                                    if (actionBarPopupWindow4 != null && actionBarPopupWindow4.isShowing()) {
                                        paintView5.popupWindow.dismiss(true);
                                        break;
                                    }
                                    break;
                                case 4:
                                    PaintView paintView6 = paintView;
                                    paintView6.selectEntity$1(null, true);
                                    paintView6.showLinkAlert((LinkView) entityView);
                                    ActionBarPopupWindow actionBarPopupWindow5 = paintView6.popupWindow;
                                    if (actionBarPopupWindow5 != null && actionBarPopupWindow5.isShowing()) {
                                        paintView6.popupWindow.dismiss(true);
                                        break;
                                    }
                                    break;
                                case 5:
                                    PaintView paintView7 = paintView;
                                    paintView7.getClass();
                                    EntityView entityView6 = entityView;
                                    if (entityView6 instanceof StickerView) {
                                        ((StickerView) entityView6).mirror(true);
                                    } else if (entityView6 instanceof ReactionWidgetEntityView) {
                                        ((ReactionWidgetEntityView) entityView6).mirror(true);
                                    } else if (entityView6 instanceof RoundView) {
                                        RoundView roundView = (RoundView) entityView6;
                                        roundView.mirrored = !roundView.mirrored;
                                        roundView.invalidate();
                                    } else {
                                        ((PhotoView) entityView6).mirror(true);
                                    }
                                    ActionBarPopupWindow actionBarPopupWindow6 = paintView7.popupWindow;
                                    if (actionBarPopupWindow6 != null && actionBarPopupWindow6.isShowing()) {
                                        paintView7.popupWindow.dismiss(true);
                                        break;
                                    }
                                    break;
                                case 6:
                                    PaintView paintView8 = paintView;
                                    paintView8.getClass();
                                    entityView.bringToFront();
                                    ActionBarPopupWindow actionBarPopupWindow7 = paintView8.popupWindow;
                                    if (actionBarPopupWindow7 != null && actionBarPopupWindow7.isShowing()) {
                                        paintView8.popupWindow.dismiss(true);
                                        break;
                                    }
                                    break;
                                default:
                                    PaintView paintView9 = paintView;
                                    EntityView entityView7 = entityView;
                                    if (entityView7 != null) {
                                        PointF pointFStartPositionRelativeToEntity$1 = paintView9.startPositionRelativeToEntity$1(entityView7);
                                        boolean z2 = entityView7 instanceof StickerView;
                                        PaintView.AnonymousClass7 anonymousClass7 = paintView9.entitiesView;
                                        if (z2) {
                                            EntityView stickerView = new StickerView(paintView9.getContext(), (StickerView) entityView7, pointFStartPositionRelativeToEntity$1);
                                            stickerView.setDelegate(paintView9);
                                            anonymousClass7.addView(stickerView);
                                            paintView9.checkEntitiesIsVideo();
                                            entityView2 = stickerView;
                                        } else if (entityView7 instanceof TextPaintView) {
                                            TextPaintView textPaintView = new TextPaintView(paintView9.getContext(), (TextPaintView) entityView7, pointFStartPositionRelativeToEntity$1);
                                            textPaintView.setDelegate(paintView9);
                                            textPaintView.setMaxWidth(paintView9.w - AndroidUtilities.dp(32.0f));
                                            anonymousClass7.addView(textPaintView, LayoutHelper.createFrame(-2.0f, -2));
                                            paintView9.checkEntitiesIsVideo();
                                            entityView2 = textPaintView;
                                        }
                                        paintView9.registerRemovalUndo$1(entityView2);
                                        paintView9.selectEntity$1(null, true);
                                        paintView9.appearAnimation(entityView2);
                                    }
                                    ActionBarPopupWindow actionBarPopupWindow8 = paintView9.popupWindow;
                                    if (actionBarPopupWindow8 != null && actionBarPopupWindow8.isShowing()) {
                                        paintView9.popupWindow.dismiss(true);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    linearLayout.addView(textViewCreateActionLayoutButton2, LayoutHelper.createLinear(-2, 44));
                }
                if ((entityView instanceof StickerView) || (entityView instanceof RoundView) || (entityView instanceof PhotoView) || (entityView instanceof ReactionWidgetEntityView)) {
                    TextView textViewCreateActionLayoutButton3 = paintView.createActionLayoutButton(4, LocaleController.getString(R.string.Flip));
                    final int i6 = 5;
                    textViewCreateActionLayoutButton3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            EntityView entityView2;
                            switch (i6) {
                                case 0:
                                    PaintView paintView2 = paintView;
                                    paintView2.getClass();
                                    EntityView entityView3 = entityView;
                                    if (entityView3 instanceof RoundView) {
                                        StoryRecorder.AnonymousClass8 anonymousClass8 = StoryRecorder.this.captionEdit;
                                        if (anonymousClass8 != null) {
                                            anonymousClass8.showRemoveRoundAlert();
                                        }
                                    } else {
                                        paintView2.removeEntity$1(entityView3);
                                    }
                                    ActionBarPopupWindow actionBarPopupWindow = paintView2.popupWindow;
                                    if (actionBarPopupWindow != null && actionBarPopupWindow.isShowing()) {
                                        paintView2.popupWindow.dismiss(true);
                                        break;
                                    }
                                    break;
                                case 1:
                                    EntityView entityView4 = entityView;
                                    PaintView paintView3 = paintView;
                                    paintView3.getClass();
                                    try {
                                        ((TextPaintView) entityView4).getEditText().onTextContextMenuItem(16908337);
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                    ActionBarPopupWindow actionBarPopupWindow2 = paintView3.popupWindow;
                                    if (actionBarPopupWindow2 != null && actionBarPopupWindow2.isShowing()) {
                                        paintView3.popupWindow.dismiss(true);
                                        break;
                                    }
                                    break;
                                case 2:
                                    PaintView paintView4 = paintView;
                                    paintView4.selectEntity$1(entityView, true);
                                    paintView4.editSelectedTextEntity$1();
                                    ActionBarPopupWindow actionBarPopupWindow3 = paintView4.popupWindow;
                                    if (actionBarPopupWindow3 != null && actionBarPopupWindow3.isShowing()) {
                                        paintView4.popupWindow.dismiss(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    PaintView paintView5 = paintView;
                                    paintView5.selectEntity$1(null, true);
                                    EntityView entityView5 = entityView;
                                    paintView5.showLocationAlert((LocationView) entityView5, new OAuthSheet$$ExternalSyntheticLambda18(26, paintView5, entityView5));
                                    ActionBarPopupWindow actionBarPopupWindow4 = paintView5.popupWindow;
                                    if (actionBarPopupWindow4 != null && actionBarPopupWindow4.isShowing()) {
                                        paintView5.popupWindow.dismiss(true);
                                        break;
                                    }
                                    break;
                                case 4:
                                    PaintView paintView6 = paintView;
                                    paintView6.selectEntity$1(null, true);
                                    paintView6.showLinkAlert((LinkView) entityView);
                                    ActionBarPopupWindow actionBarPopupWindow5 = paintView6.popupWindow;
                                    if (actionBarPopupWindow5 != null && actionBarPopupWindow5.isShowing()) {
                                        paintView6.popupWindow.dismiss(true);
                                        break;
                                    }
                                    break;
                                case 5:
                                    PaintView paintView7 = paintView;
                                    paintView7.getClass();
                                    EntityView entityView6 = entityView;
                                    if (entityView6 instanceof StickerView) {
                                        ((StickerView) entityView6).mirror(true);
                                    } else if (entityView6 instanceof ReactionWidgetEntityView) {
                                        ((ReactionWidgetEntityView) entityView6).mirror(true);
                                    } else if (entityView6 instanceof RoundView) {
                                        RoundView roundView = (RoundView) entityView6;
                                        roundView.mirrored = !roundView.mirrored;
                                        roundView.invalidate();
                                    } else {
                                        ((PhotoView) entityView6).mirror(true);
                                    }
                                    ActionBarPopupWindow actionBarPopupWindow6 = paintView7.popupWindow;
                                    if (actionBarPopupWindow6 != null && actionBarPopupWindow6.isShowing()) {
                                        paintView7.popupWindow.dismiss(true);
                                        break;
                                    }
                                    break;
                                case 6:
                                    PaintView paintView8 = paintView;
                                    paintView8.getClass();
                                    entityView.bringToFront();
                                    ActionBarPopupWindow actionBarPopupWindow7 = paintView8.popupWindow;
                                    if (actionBarPopupWindow7 != null && actionBarPopupWindow7.isShowing()) {
                                        paintView8.popupWindow.dismiss(true);
                                        break;
                                    }
                                    break;
                                default:
                                    PaintView paintView9 = paintView;
                                    EntityView entityView7 = entityView;
                                    if (entityView7 != null) {
                                        PointF pointFStartPositionRelativeToEntity$1 = paintView9.startPositionRelativeToEntity$1(entityView7);
                                        boolean z2 = entityView7 instanceof StickerView;
                                        PaintView.AnonymousClass7 anonymousClass7 = paintView9.entitiesView;
                                        if (z2) {
                                            EntityView stickerView = new StickerView(paintView9.getContext(), (StickerView) entityView7, pointFStartPositionRelativeToEntity$1);
                                            stickerView.setDelegate(paintView9);
                                            anonymousClass7.addView(stickerView);
                                            paintView9.checkEntitiesIsVideo();
                                            entityView2 = stickerView;
                                        } else if (entityView7 instanceof TextPaintView) {
                                            TextPaintView textPaintView = new TextPaintView(paintView9.getContext(), (TextPaintView) entityView7, pointFStartPositionRelativeToEntity$1);
                                            textPaintView.setDelegate(paintView9);
                                            textPaintView.setMaxWidth(paintView9.w - AndroidUtilities.dp(32.0f));
                                            anonymousClass7.addView(textPaintView, LayoutHelper.createFrame(-2.0f, -2));
                                            paintView9.checkEntitiesIsVideo();
                                            entityView2 = textPaintView;
                                        }
                                        paintView9.registerRemovalUndo$1(entityView2);
                                        paintView9.selectEntity$1(null, true);
                                        paintView9.appearAnimation(entityView2);
                                    }
                                    ActionBarPopupWindow actionBarPopupWindow8 = paintView9.popupWindow;
                                    if (actionBarPopupWindow8 != null && actionBarPopupWindow8.isShowing()) {
                                        paintView9.popupWindow.dismiss(true);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    linearLayout.addView(textViewCreateActionLayoutButton3, LayoutHelper.createLinear(-2, 44));
                }
                boolean z2 = entityView instanceof PhotoView;
                if (z2) {
                    ((PhotoView) entityView).getClass();
                }
                PaintView.AnonymousClass7 anonymousClass7 = paintView.entitiesView;
                if (anonymousClass7.indexOfChild(entityView) != anonymousClass7.getChildCount() - 1 && !(entityView instanceof ReactionWidgetEntityView)) {
                    TextView textView3 = new TextView(paintView.getContext());
                    textView3.setTextColor(Theme.getColor(Theme.key_actionBarDefaultSubmenuItem, anonymousClass2));
                    textView3.setLines(1);
                    textView3.setSingleLine();
                    textView3.setEllipsize(TextUtils.TruncateAt.END);
                    textView3.setGravity(16);
                    textView3.setTypeface(AndroidUtilities.bold());
                    textView3.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
                    textView3.setTextSize(1, 14.0f);
                    textView3.setTag(2);
                    textView3.setText(LocaleController.getString(R.string.PaintBringToFront));
                    final int i7 = 6;
                    textView3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            EntityView entityView2;
                            switch (i7) {
                                case 0:
                                    PaintView paintView2 = paintView;
                                    paintView2.getClass();
                                    EntityView entityView3 = entityView;
                                    if (entityView3 instanceof RoundView) {
                                        StoryRecorder.AnonymousClass8 anonymousClass8 = StoryRecorder.this.captionEdit;
                                        if (anonymousClass8 != null) {
                                            anonymousClass8.showRemoveRoundAlert();
                                        }
                                    } else {
                                        paintView2.removeEntity$1(entityView3);
                                    }
                                    ActionBarPopupWindow actionBarPopupWindow = paintView2.popupWindow;
                                    if (actionBarPopupWindow != null && actionBarPopupWindow.isShowing()) {
                                        paintView2.popupWindow.dismiss(true);
                                        break;
                                    }
                                    break;
                                case 1:
                                    EntityView entityView4 = entityView;
                                    PaintView paintView3 = paintView;
                                    paintView3.getClass();
                                    try {
                                        ((TextPaintView) entityView4).getEditText().onTextContextMenuItem(16908337);
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                    ActionBarPopupWindow actionBarPopupWindow2 = paintView3.popupWindow;
                                    if (actionBarPopupWindow2 != null && actionBarPopupWindow2.isShowing()) {
                                        paintView3.popupWindow.dismiss(true);
                                        break;
                                    }
                                    break;
                                case 2:
                                    PaintView paintView4 = paintView;
                                    paintView4.selectEntity$1(entityView, true);
                                    paintView4.editSelectedTextEntity$1();
                                    ActionBarPopupWindow actionBarPopupWindow3 = paintView4.popupWindow;
                                    if (actionBarPopupWindow3 != null && actionBarPopupWindow3.isShowing()) {
                                        paintView4.popupWindow.dismiss(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    PaintView paintView5 = paintView;
                                    paintView5.selectEntity$1(null, true);
                                    EntityView entityView5 = entityView;
                                    paintView5.showLocationAlert((LocationView) entityView5, new OAuthSheet$$ExternalSyntheticLambda18(26, paintView5, entityView5));
                                    ActionBarPopupWindow actionBarPopupWindow4 = paintView5.popupWindow;
                                    if (actionBarPopupWindow4 != null && actionBarPopupWindow4.isShowing()) {
                                        paintView5.popupWindow.dismiss(true);
                                        break;
                                    }
                                    break;
                                case 4:
                                    PaintView paintView6 = paintView;
                                    paintView6.selectEntity$1(null, true);
                                    paintView6.showLinkAlert((LinkView) entityView);
                                    ActionBarPopupWindow actionBarPopupWindow5 = paintView6.popupWindow;
                                    if (actionBarPopupWindow5 != null && actionBarPopupWindow5.isShowing()) {
                                        paintView6.popupWindow.dismiss(true);
                                        break;
                                    }
                                    break;
                                case 5:
                                    PaintView paintView7 = paintView;
                                    paintView7.getClass();
                                    EntityView entityView6 = entityView;
                                    if (entityView6 instanceof StickerView) {
                                        ((StickerView) entityView6).mirror(true);
                                    } else if (entityView6 instanceof ReactionWidgetEntityView) {
                                        ((ReactionWidgetEntityView) entityView6).mirror(true);
                                    } else if (entityView6 instanceof RoundView) {
                                        RoundView roundView = (RoundView) entityView6;
                                        roundView.mirrored = !roundView.mirrored;
                                        roundView.invalidate();
                                    } else {
                                        ((PhotoView) entityView6).mirror(true);
                                    }
                                    ActionBarPopupWindow actionBarPopupWindow6 = paintView7.popupWindow;
                                    if (actionBarPopupWindow6 != null && actionBarPopupWindow6.isShowing()) {
                                        paintView7.popupWindow.dismiss(true);
                                        break;
                                    }
                                    break;
                                case 6:
                                    PaintView paintView8 = paintView;
                                    paintView8.getClass();
                                    entityView.bringToFront();
                                    ActionBarPopupWindow actionBarPopupWindow7 = paintView8.popupWindow;
                                    if (actionBarPopupWindow7 != null && actionBarPopupWindow7.isShowing()) {
                                        paintView8.popupWindow.dismiss(true);
                                        break;
                                    }
                                    break;
                                default:
                                    PaintView paintView9 = paintView;
                                    EntityView entityView7 = entityView;
                                    if (entityView7 != null) {
                                        PointF pointFStartPositionRelativeToEntity$1 = paintView9.startPositionRelativeToEntity$1(entityView7);
                                        boolean z3 = entityView7 instanceof StickerView;
                                        PaintView.AnonymousClass7 anonymousClass9 = paintView9.entitiesView;
                                        if (z3) {
                                            EntityView stickerView = new StickerView(paintView9.getContext(), (StickerView) entityView7, pointFStartPositionRelativeToEntity$1);
                                            stickerView.setDelegate(paintView9);
                                            anonymousClass9.addView(stickerView);
                                            paintView9.checkEntitiesIsVideo();
                                            entityView2 = stickerView;
                                        } else if (entityView7 instanceof TextPaintView) {
                                            TextPaintView textPaintView = new TextPaintView(paintView9.getContext(), (TextPaintView) entityView7, pointFStartPositionRelativeToEntity$1);
                                            textPaintView.setDelegate(paintView9);
                                            textPaintView.setMaxWidth(paintView9.w - AndroidUtilities.dp(32.0f));
                                            anonymousClass9.addView(textPaintView, LayoutHelper.createFrame(-2.0f, -2));
                                            paintView9.checkEntitiesIsVideo();
                                            entityView2 = textPaintView;
                                        }
                                        paintView9.registerRemovalUndo$1(entityView2);
                                        paintView9.selectEntity$1(null, true);
                                        paintView9.appearAnimation(entityView2);
                                    }
                                    ActionBarPopupWindow actionBarPopupWindow8 = paintView9.popupWindow;
                                    if (actionBarPopupWindow8 != null && actionBarPopupWindow8.isShowing()) {
                                        paintView9.popupWindow.dismiss(true);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    linearLayout.addView(textView3, LayoutHelper.createLinear(-2, 44));
                } else if (!z2 && !z && !(entityView instanceof RoundView) && !(entityView instanceof LocationView) && !(entityView instanceof WeatherView) && !(entityView instanceof LinkView) && !(entityView instanceof ReactionWidgetEntityView)) {
                    TextView textView4 = new TextView(paintView.getContext());
                    textView4.setTextColor(Theme.getColor(Theme.key_actionBarDefaultSubmenuItem, anonymousClass2));
                    textView4.setLines(1);
                    textView4.setSingleLine();
                    textView4.setEllipsize(TextUtils.TruncateAt.END);
                    textView4.setGravity(16);
                    textView4.setTypeface(AndroidUtilities.bold());
                    textView4.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
                    textView4.setTextSize(1, 14.0f);
                    textView4.setTag(2);
                    textView4.setText(LocaleController.getString("PaintDuplicate", R.string.PaintDuplicate));
                    final int i8 = 7;
                    textView4.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            EntityView entityView2;
                            switch (i8) {
                                case 0:
                                    PaintView paintView2 = paintView;
                                    paintView2.getClass();
                                    EntityView entityView3 = entityView;
                                    if (entityView3 instanceof RoundView) {
                                        StoryRecorder.AnonymousClass8 anonymousClass8 = StoryRecorder.this.captionEdit;
                                        if (anonymousClass8 != null) {
                                            anonymousClass8.showRemoveRoundAlert();
                                        }
                                    } else {
                                        paintView2.removeEntity$1(entityView3);
                                    }
                                    ActionBarPopupWindow actionBarPopupWindow = paintView2.popupWindow;
                                    if (actionBarPopupWindow != null && actionBarPopupWindow.isShowing()) {
                                        paintView2.popupWindow.dismiss(true);
                                        break;
                                    }
                                    break;
                                case 1:
                                    EntityView entityView4 = entityView;
                                    PaintView paintView3 = paintView;
                                    paintView3.getClass();
                                    try {
                                        ((TextPaintView) entityView4).getEditText().onTextContextMenuItem(16908337);
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                    ActionBarPopupWindow actionBarPopupWindow2 = paintView3.popupWindow;
                                    if (actionBarPopupWindow2 != null && actionBarPopupWindow2.isShowing()) {
                                        paintView3.popupWindow.dismiss(true);
                                        break;
                                    }
                                    break;
                                case 2:
                                    PaintView paintView4 = paintView;
                                    paintView4.selectEntity$1(entityView, true);
                                    paintView4.editSelectedTextEntity$1();
                                    ActionBarPopupWindow actionBarPopupWindow3 = paintView4.popupWindow;
                                    if (actionBarPopupWindow3 != null && actionBarPopupWindow3.isShowing()) {
                                        paintView4.popupWindow.dismiss(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    PaintView paintView5 = paintView;
                                    paintView5.selectEntity$1(null, true);
                                    EntityView entityView5 = entityView;
                                    paintView5.showLocationAlert((LocationView) entityView5, new OAuthSheet$$ExternalSyntheticLambda18(26, paintView5, entityView5));
                                    ActionBarPopupWindow actionBarPopupWindow4 = paintView5.popupWindow;
                                    if (actionBarPopupWindow4 != null && actionBarPopupWindow4.isShowing()) {
                                        paintView5.popupWindow.dismiss(true);
                                        break;
                                    }
                                    break;
                                case 4:
                                    PaintView paintView6 = paintView;
                                    paintView6.selectEntity$1(null, true);
                                    paintView6.showLinkAlert((LinkView) entityView);
                                    ActionBarPopupWindow actionBarPopupWindow5 = paintView6.popupWindow;
                                    if (actionBarPopupWindow5 != null && actionBarPopupWindow5.isShowing()) {
                                        paintView6.popupWindow.dismiss(true);
                                        break;
                                    }
                                    break;
                                case 5:
                                    PaintView paintView7 = paintView;
                                    paintView7.getClass();
                                    EntityView entityView6 = entityView;
                                    if (entityView6 instanceof StickerView) {
                                        ((StickerView) entityView6).mirror(true);
                                    } else if (entityView6 instanceof ReactionWidgetEntityView) {
                                        ((ReactionWidgetEntityView) entityView6).mirror(true);
                                    } else if (entityView6 instanceof RoundView) {
                                        RoundView roundView = (RoundView) entityView6;
                                        roundView.mirrored = !roundView.mirrored;
                                        roundView.invalidate();
                                    } else {
                                        ((PhotoView) entityView6).mirror(true);
                                    }
                                    ActionBarPopupWindow actionBarPopupWindow6 = paintView7.popupWindow;
                                    if (actionBarPopupWindow6 != null && actionBarPopupWindow6.isShowing()) {
                                        paintView7.popupWindow.dismiss(true);
                                        break;
                                    }
                                    break;
                                case 6:
                                    PaintView paintView8 = paintView;
                                    paintView8.getClass();
                                    entityView.bringToFront();
                                    ActionBarPopupWindow actionBarPopupWindow7 = paintView8.popupWindow;
                                    if (actionBarPopupWindow7 != null && actionBarPopupWindow7.isShowing()) {
                                        paintView8.popupWindow.dismiss(true);
                                        break;
                                    }
                                    break;
                                default:
                                    PaintView paintView9 = paintView;
                                    EntityView entityView7 = entityView;
                                    if (entityView7 != null) {
                                        PointF pointFStartPositionRelativeToEntity$1 = paintView9.startPositionRelativeToEntity$1(entityView7);
                                        boolean z3 = entityView7 instanceof StickerView;
                                        PaintView.AnonymousClass7 anonymousClass9 = paintView9.entitiesView;
                                        if (z3) {
                                            EntityView stickerView = new StickerView(paintView9.getContext(), (StickerView) entityView7, pointFStartPositionRelativeToEntity$1);
                                            stickerView.setDelegate(paintView9);
                                            anonymousClass9.addView(stickerView);
                                            paintView9.checkEntitiesIsVideo();
                                            entityView2 = stickerView;
                                        } else if (entityView7 instanceof TextPaintView) {
                                            TextPaintView textPaintView = new TextPaintView(paintView9.getContext(), (TextPaintView) entityView7, pointFStartPositionRelativeToEntity$1);
                                            textPaintView.setDelegate(paintView9);
                                            textPaintView.setMaxWidth(paintView9.w - AndroidUtilities.dp(32.0f));
                                            anonymousClass9.addView(textPaintView, LayoutHelper.createFrame(-2.0f, -2));
                                            paintView9.checkEntitiesIsVideo();
                                            entityView2 = textPaintView;
                                        }
                                        paintView9.registerRemovalUndo$1(entityView2);
                                        paintView9.selectEntity$1(null, true);
                                        paintView9.appearAnimation(entityView2);
                                    }
                                    ActionBarPopupWindow actionBarPopupWindow8 = paintView9.popupWindow;
                                    if (actionBarPopupWindow8 != null && actionBarPopupWindow8.isShowing()) {
                                        paintView9.popupWindow.dismiss(true);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    linearLayout.addView(textView4, LayoutHelper.createLinear(-2, 44));
                }
                int i9 = 0;
                while (i9 < linearLayout.getChildCount()) {
                    View childAt = linearLayout.getChildAt(i9);
                    int color = Theme.getColor(Theme.key_listSelector, anonymousClass2);
                    int i10 = 8;
                    int i11 = i9 == 0 ? 8 : 0;
                    int i12 = i9 == linearLayout.getChildCount() - 1 ? 8 : 0;
                    int i13 = i9 == linearLayout.getChildCount() - 1 ? 8 : 0;
                    if (i9 != 0) {
                        i10 = 0;
                    }
                    childAt.setBackground(Theme.createRadSelectorDrawable(color, i11, i12, i13, i10));
                    i9++;
                }
                paintView.popupLayout.linearLayout.addView(linearLayout);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
                layoutParams.width = -2;
                layoutParams.height = -2;
                linearLayout.setLayoutParams(layoutParams);
                break;
            default:
                this.f$0.removeEntity$1(this.f$1);
                break;
        }
    }
}
