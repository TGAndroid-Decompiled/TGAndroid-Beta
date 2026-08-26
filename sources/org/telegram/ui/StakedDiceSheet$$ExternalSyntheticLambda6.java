package org.telegram.ui;

import android.content.Context;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda189;
import org.telegram.ui.Components.AIEditorAlert;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.Paint.Views.LinkView;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.poll.attached.PollAttachedMediaFile;
import org.telegram.ui.Components.poll.attached.PollAttachedMediaMusic;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.Stories.DarkThemeResourceProvider;
import org.telegram.ui.Stories.recorder.KeyboardNotifier;
import org.telegram.ui.Stories.recorder.PaintView;
import org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda2;
import org.telegram.ui.Stories.recorder.SelectAudioAlert;
import org.telegram.ui.Stories.recorder.StoryRecorder;
import org.telegram.ui.Stories.recorder.Weather;

public final class StakedDiceSheet$$ExternalSyntheticLambda6 implements Utilities.CallbackReturn {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;

    public StakedDiceSheet$$ExternalSyntheticLambda6(Object obj, Object obj2, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    @Override
    public final Object run(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                Long l = (Long) obj;
                TextView textView = new TextView((Context) this.f$0);
                textView.setGravity(17);
                textView.setTextSize(1, 13.0f);
                textView.setTypeface(AndroidUtilities.bold());
                int i = Theme.key_featuredStickers_addButton;
                Theme.ResourcesProvider resourcesProvider = (Theme.ResourcesProvider) this.f$1;
                textView.setTextColor(Theme.getColor(i, resourcesProvider));
                textView.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(13.0f), Theme.multAlpha(0.15f, Theme.getColor(i, resourcesProvider))));
                textView.setText(StarsIntroActivity.replaceDiamond(StarsIntroActivity.formatTON(l.longValue()) + " 💎", 0.75f, 0.0f, 1.0f));
                ScaleStateListAnimator.apply(textView, 0.1f, 1.5f);
                textView.setOnClickListener(new PhotoViewer$$ExternalSyntheticLambda52(11, (EditTextBoldCursor) this.f$2, l));
                return textView;
            case 1:
                AIEditorAlert.Tabs.Tab tab = (AIEditorAlert.Tabs.Tab) obj;
                final AIEditorAlert aIEditorAlert = (AIEditorAlert) this.f$2;
                aIEditorAlert.getClass();
                TL_aicompose.AiComposeTone aiComposeTone = tab.tone;
                if (!(aiComposeTone instanceof TL_aicompose.TL_aiComposeTone)) {
                    return Boolean.FALSE;
                }
                final TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) aiComposeTone;
                BottomSheet.ContainerView containerView = aIEditorAlert.container;
                final Theme.ResourcesProvider resourcesProvider2 = (Theme.ResourcesProvider) this.f$1;
                ItemOptions itemOptionsMakeOptions = ItemOptions.makeOptions(containerView, resourcesProvider2, tab);
                itemOptionsMakeOptions.setScrimViewBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(12.0f), Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider2)));
                final int i2 = 0;
                itemOptionsMakeOptions.addIf(R.drawable.msg_edit, LocaleController.getString(R.string.AIEditorEditStyle), new Runnable() {
                    @Override
                    public final void run() {
                        switch (i2) {
                            case 0:
                                AIEditorAlert aIEditorAlert2 = aIEditorAlert;
                                AIEditorAlert.CreateAiStyleAlert createAiStyleAlert = new AIEditorAlert.CreateAiStyleAlert(aIEditorAlert2.getContext(), resourcesProvider2);
                                TL_aicompose.TL_aiComposeTone tL_aiComposeTone2 = tL_aiComposeTone;
                                createAiStyleAlert.editing = tL_aiComposeTone2;
                                createAiStyleAlert.emoji_id = Long.valueOf(tL_aiComposeTone2.emoji_id);
                                createAiStyleAlert.updateIcon();
                                createAiStyleAlert.titleCell.setText(createAiStyleAlert.editing.title);
                                createAiStyleAlert.promptCell.setText(createAiStyleAlert.editing.prompt);
                                createAiStyleAlert.checkbox.checkBoxBase.setChecked(-1, createAiStyleAlert.editing.author_id != 0, false);
                                createAiStyleAlert.actionBar.setTitle(LocaleController.getString(R.string.AIEditorEditStyle));
                                createAiStyleAlert.button.setText(LocaleController.getString(R.string.AIEditorStyleEdit));
                                createAiStyleAlert.updateButton$4();
                                createAiStyleAlert.adapter.update(false);
                                createAiStyleAlert.onToneEdited = new AIEditorAlert$$ExternalSyntheticLambda7(aIEditorAlert2, 2);
                                createAiStyleAlert.show();
                                break;
                            default:
                                AIEditorAlert aIEditorAlert3 = aIEditorAlert;
                                AlertDialog.Builder builder = new AlertDialog.Builder(aIEditorAlert3.getContext(), 0, resourcesProvider2);
                                String string = LocaleController.getString(R.string.AIEditorDeleteStyle);
                                AlertDialog alertDialog = builder.alertDialog;
                                alertDialog.title = string;
                                alertDialog.message = LocaleController.getString(R.string.AIEditorDeleteStyleText);
                                builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                                builder.setPositiveButton(LocaleController.getString(R.string.Delete), new ChatActivity$$ExternalSyntheticLambda189(11, aIEditorAlert3, tL_aiComposeTone));
                                builder.makeRed(-1);
                                builder.show();
                                break;
                        }
                    }
                }, tL_aiComposeTone.creator);
                itemOptionsMakeOptions.add(R.drawable.msg_share, LocaleController.getString(R.string.AIEditorShareStyle), new ChatUsersActivity$$ExternalSyntheticLambda13(aIEditorAlert, tL_aiComposeTone, (Context) this.f$0, resourcesProvider2, 3), false);
                boolean z = tL_aiComposeTone.creator;
                int i3 = R.drawable.msg_delete;
                String string = LocaleController.getString(R.string.AIEditorRemoveStyle);
                ChatLinkActivity$$ExternalSyntheticLambda9 chatLinkActivity$$ExternalSyntheticLambda9 = new ChatLinkActivity$$ExternalSyntheticLambda9(14, aIEditorAlert, tL_aiComposeTone);
                if (!z) {
                    itemOptionsMakeOptions.add(i3, string, chatLinkActivity$$ExternalSyntheticLambda9, true);
                }
                boolean z2 = tL_aiComposeTone.creator;
                String string2 = LocaleController.getString(R.string.AIEditorDeleteStyle);
                final int i4 = 1;
                Runnable runnable = new Runnable() {
                    @Override
                    public final void run() {
                        switch (i4) {
                            case 0:
                                AIEditorAlert aIEditorAlert2 = aIEditorAlert;
                                AIEditorAlert.CreateAiStyleAlert createAiStyleAlert = new AIEditorAlert.CreateAiStyleAlert(aIEditorAlert2.getContext(), resourcesProvider2);
                                TL_aicompose.TL_aiComposeTone tL_aiComposeTone2 = tL_aiComposeTone;
                                createAiStyleAlert.editing = tL_aiComposeTone2;
                                createAiStyleAlert.emoji_id = Long.valueOf(tL_aiComposeTone2.emoji_id);
                                createAiStyleAlert.updateIcon();
                                createAiStyleAlert.titleCell.setText(createAiStyleAlert.editing.title);
                                createAiStyleAlert.promptCell.setText(createAiStyleAlert.editing.prompt);
                                createAiStyleAlert.checkbox.checkBoxBase.setChecked(-1, createAiStyleAlert.editing.author_id != 0, false);
                                createAiStyleAlert.actionBar.setTitle(LocaleController.getString(R.string.AIEditorEditStyle));
                                createAiStyleAlert.button.setText(LocaleController.getString(R.string.AIEditorStyleEdit));
                                createAiStyleAlert.updateButton$4();
                                createAiStyleAlert.adapter.update(false);
                                createAiStyleAlert.onToneEdited = new AIEditorAlert$$ExternalSyntheticLambda7(aIEditorAlert2, 2);
                                createAiStyleAlert.show();
                                break;
                            default:
                                AIEditorAlert aIEditorAlert3 = aIEditorAlert;
                                AlertDialog.Builder builder = new AlertDialog.Builder(aIEditorAlert3.getContext(), 0, resourcesProvider2);
                                String string3 = LocaleController.getString(R.string.AIEditorDeleteStyle);
                                AlertDialog alertDialog = builder.alertDialog;
                                alertDialog.title = string3;
                                alertDialog.message = LocaleController.getString(R.string.AIEditorDeleteStyleText);
                                builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                                builder.setPositiveButton(LocaleController.getString(R.string.Delete), new ChatActivity$$ExternalSyntheticLambda189(11, aIEditorAlert3, tL_aiComposeTone));
                                builder.makeRed(-1);
                                builder.show();
                                break;
                        }
                    }
                };
                if (z2) {
                    itemOptionsMakeOptions.add(i3, string2, runnable, true);
                }
                itemOptionsMakeOptions.show();
                return Boolean.TRUE;
            case 2:
                PollAttachedMediaMusic pollAttachedMediaMusic = (PollAttachedMediaMusic) this.f$2;
                return PollAttachedMediaFile.createMessagePreviewDrawable((View) obj, (String) this.f$0, (String) this.f$1, pollAttachedMediaMusic.messageObject.getDocument(), pollAttachedMediaMusic.messageObject);
            case 3:
                Utilities.CallbackReturn callbackReturn = (Utilities.CallbackReturn) this.f$1;
                SparseIntArray sparseIntArray = (SparseIntArray) this.f$2;
                View view = (View) obj;
                try {
                    ViewParent parent = view.getParent();
                    RecyclerListView recyclerListView = (RecyclerListView) this.f$0;
                    if (parent != recyclerListView) {
                        return Boolean.FALSE;
                    }
                    Boolean bool = (Boolean) callbackReturn.run(view);
                    boolean zBooleanValue = bool.booleanValue();
                    RecyclerView.ViewHolder childViewHolder = recyclerListView.getChildViewHolder(view);
                    if (childViewHolder != null) {
                        sparseIntArray.put(childViewHolder.mItemViewType, zBooleanValue ? 1 : 0);
                    }
                    return bool;
                } catch (Exception unused) {
                    return Boolean.FALSE;
                }
            default:
                Integer num = (Integer) obj;
                PaintView paintView = (PaintView) this.f$0;
                paintView.getClass();
                int iIntValue = num.intValue();
                boolean[] zArr = (boolean[]) this.f$1;
                if (iIntValue == 0) {
                    zArr[0] = false;
                    paintView.showLocationAlert(null, new TodoItemMenu$$ExternalSyntheticLambda17(paintView, 2));
                    return Boolean.TRUE;
                }
                int iIntValue2 = num.intValue();
                PaintView.AnonymousClass22 anonymousClass22 = (PaintView.AnonymousClass22) this.f$2;
                if (iIntValue2 == 5) {
                    zArr[0] = false;
                    Weather.fetch(true, new ThemeActivity$$ExternalSyntheticLambda19(3, paintView, anonymousClass22));
                    return Boolean.FALSE;
                }
                if (num.intValue() == 2) {
                    anonymousClass22.lambda$showGiftOfferSheet$15();
                    StoryRecorder storyRecorder = StoryRecorder.this;
                    KeyboardNotifier keyboardNotifier = storyRecorder.captionEdit.keyboardNotifier;
                    keyboardNotifier.ignoring = true;
                    keyboardNotifier.update();
                    storyRecorder.destroyGalleryListView();
                    storyRecorder.createGalleryListView(true);
                    storyRecorder.animateGalleryListView(true);
                    return Boolean.TRUE;
                }
                if (num.intValue() == 1) {
                    zArr[0] = false;
                    SelectAudioAlert selectAudioAlert = new SelectAudioAlert(paintView.getContext(), false, null, new VoIPFragment$$ExternalSyntheticLambda7(paintView, 16), new DarkThemeResourceProvider());
                    selectAudioAlert.setOnDismissListener(new PaintView$$ExternalSyntheticLambda2(paintView, 3));
                    selectAudioAlert.show();
                    return Boolean.TRUE;
                }
                if (num.intValue() == 3) {
                    paintView.forceChanges = true;
                    paintView.appearAnimation(paintView.createReactionWidget(true));
                    return Boolean.TRUE;
                }
                if (num.intValue() != 4) {
                    return Boolean.FALSE;
                }
                boolean zIsPremium = UserConfig.getInstance(paintView.currentAccount).isPremium();
                PaintView.AnonymousClass2 anonymousClass2 = paintView.resourcesProvider;
                if (!zIsPremium) {
                    try {
                        anonymousClass22.container.performHapticFeedback(3);
                        break;
                    } catch (Exception unused2) {
                    }
                    new BulletinFactory(anonymousClass22.container, anonymousClass2).createSimpleBulletinWithIconSize(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.StoryLinkPremium), new PaintView$$ExternalSyntheticLambda2(paintView, 2))).show(true);
                    return Boolean.FALSE;
                }
                int i5 = 0;
                int i6 = 0;
                while (true) {
                    PaintView.AnonymousClass7 anonymousClass7 = paintView.entitiesView;
                    if (i5 >= anonymousClass7.getChildCount()) {
                        if (i6 >= 3) {
                            new BulletinFactory(anonymousClass22.container, anonymousClass2).createSimpleBulletin(LocaleController.getString(R.string.StoryLinkLimitTitle), LocaleController.formatPluralString("StoryLinkLimitMessage", 3, new Object[0]), R.raw.linkbroken).show(true);
                            return Boolean.FALSE;
                        }
                        zArr[0] = false;
                        paintView.showLinkAlert(null);
                        anonymousClass22.lambda$showGiftOfferSheet$15();
                        return Boolean.TRUE;
                    }
                    if (anonymousClass7.getChildAt(i5) instanceof LinkView) {
                        i6++;
                    }
                    i5++;
                }
                break;
        }
    }

    public StakedDiceSheet$$ExternalSyntheticLambda6(AIEditorAlert aIEditorAlert, Theme.ResourcesProvider resourcesProvider, Context context) {
        this.$r8$classId = 1;
        this.f$2 = aIEditorAlert;
        this.f$1 = resourcesProvider;
        this.f$0 = context;
    }
}
