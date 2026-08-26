package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import com.google.android.exoplayer2.AudioFocusManager;
import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.android.exoplayer2.util.Log;
import com.google.android.gms.internal.mlkit_language_id_common.zzhp;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Adapters.DialogsSearchAdapter;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.Paint.Views.EntityView;
import org.telegram.ui.Components.Paint.Views.EntityView$$ExternalSyntheticLambda2;
import org.telegram.ui.Components.Paint.Views.LPhotoPaintView;
import org.telegram.ui.Components.Paint.Views.StickerMakerView;
import org.telegram.ui.Components.Premium.boosts.ReassignBoostBottomSheet;
import org.telegram.ui.Components.Reactions.BackSpaceButtonView;
import org.telegram.ui.Components.chat.ChatListViewPaddingsAnimator;
import org.telegram.ui.Components.emojiview.FoundEmojiPacksRecyclerView;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Stars.BotStarsActivity;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stories.StoriesController;
import org.telegram.ui.Stories.recorder.CaptionStory$$ExternalSyntheticLambda4;
import org.telegram.ui.Stories.recorder.EmojiBottomSheet;
import org.telegram.ui.Stories.recorder.StoryEntry;
import org.telegram.ui.Stories.recorder.StoryRecorder;
import org.telegram.ui.iv.BlockRow;
import org.telegram.ui.iv.RichButtonRowCell;
import org.telegram.ui.iv.RichEditorListView;
import org.telegram.ui.iv.RichEditorListView.BlockButtonEdit;
import org.telegram.ui.iv.TableModel$$ExternalSyntheticLambda0;

public final class Theme$$ExternalSyntheticLambda19 implements Runnable {
    public final int $r8$classId;
    public final int f$0;
    public final Object f$1;

    public Theme$$ExternalSyntheticLambda19(int i, Object obj, int i2) {
        this.$r8$classId = i2;
        this.f$0 = i;
        this.f$1 = obj;
    }

    @Override
    public final void run() {
        int i;
        boolean z;
        Theme.ThemeInfo themeInfo;
        int i2;
        int i3;
        String baseThemeKey;
        Theme.ThemeInfo themeInfo2;
        TLRPC.WallPaperSettings wallPaperSettings;
        Object obj;
        AudioAttributes audioAttributes;
        Object obj2 = null;
        int i4 = 2;
        final int i5 = this.f$0;
        Object obj3 = this.f$1;
        switch (this.$r8$classId) {
            case 0:
                Theme.loadingRemoteThemes[i5] = false;
                TLObject tLObject = (TLObject) obj3;
                if (tLObject instanceof TL_account.TL_themes) {
                    TL_account.TL_themes tL_themes = (TL_account.TL_themes) tLObject;
                    Theme.remoteThemesHash[i5] = tL_themes.hash;
                    Theme.lastLoadingThemesTime[i5] = (int) (System.currentTimeMillis() / 1000);
                    ArrayList<TLRPC.TL_theme> arrayList = new ArrayList<>();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = Theme.themes;
                    int size = arrayList3.size();
                    int i6 = 0;
                    while (i6 < size) {
                        Theme.ThemeInfo themeInfo3 = (Theme.ThemeInfo) arrayList3.get(i6);
                        if (themeInfo3.info == null || themeInfo3.account != i5) {
                            obj = obj2;
                            if (themeInfo3.themeAccents != null) {
                                for (int i7 = 0; i7 < themeInfo3.themeAccents.size(); i7++) {
                                    Theme.ThemeAccent themeAccent = (Theme.ThemeAccent) themeInfo3.themeAccents.get(i7);
                                    if (themeAccent.info != null && themeAccent.account == i5) {
                                        arrayList2.add(themeAccent);
                                    }
                                }
                            }
                        } else {
                            arrayList2.add(themeInfo3);
                            obj = obj2;
                        }
                        i6++;
                        obj2 = obj;
                    }
                    Object obj4 = obj2;
                    int size2 = tL_themes.themes.size();
                    int i8 = 0;
                    boolean z2 = false;
                    boolean z3 = false;
                    while (true) {
                        ArrayList arrayList4 = Theme.otherThemes;
                        HashMap map = Theme.themesDict;
                        if (i8 >= size2) {
                            int i9 = 0;
                            for (int size3 = arrayList2.size(); i9 < size3; size3 = size3) {
                                Object obj5 = arrayList2.get(i9);
                                if (obj5 instanceof Theme.ThemeInfo) {
                                    Theme.ThemeInfo themeInfo4 = (Theme.ThemeInfo) obj5;
                                    NotificationCenter.getInstance(themeInfo4.account).removeObserver(themeInfo4, NotificationCenter.fileLoaded);
                                    NotificationCenter.getInstance(themeInfo4.account).removeObserver(themeInfo4, NotificationCenter.fileLoadFailed);
                                    arrayList4.remove(themeInfo4);
                                    map.remove(themeInfo4.name);
                                    Theme.OverrideWallpaperInfo overrideWallpaperInfo = themeInfo4.overrideWallpaper;
                                    if (overrideWallpaperInfo != null) {
                                        Theme.OverrideWallpaperInfo.access$1300(overrideWallpaperInfo);
                                    }
                                    arrayList3.remove(themeInfo4);
                                    new File(themeInfo4.pathToFile).delete();
                                    if (Theme.currentDayTheme == themeInfo4) {
                                        Theme.currentDayTheme = Theme.defaultTheme;
                                    } else {
                                        if (Theme.currentNightTheme == themeInfo4) {
                                            Theme.currentNightTheme = (Theme.ThemeInfo) map.get("Dark Blue");
                                            z = true;
                                        }
                                        if (Theme.currentTheme == themeInfo4) {
                                            if (z) {
                                                themeInfo = Theme.currentNightTheme;
                                            } else {
                                                themeInfo = Theme.currentDayTheme;
                                            }
                                            Theme.applyTheme(themeInfo, true, z);
                                        }
                                    }
                                    z = false;
                                    if (Theme.currentTheme == themeInfo4) {
                                        if (z) {
                                            themeInfo = Theme.currentNightTheme;
                                        } else {
                                            themeInfo = Theme.currentDayTheme;
                                        }
                                        Theme.applyTheme(themeInfo, true, z);
                                    }
                                } else {
                                    if (obj5 instanceof Theme.ThemeAccent) {
                                        Theme.ThemeAccent themeAccent2 = (Theme.ThemeAccent) obj5;
                                        if (Theme.deleteThemeAccent(themeAccent2, themeAccent2.parentTheme, false) && Theme.currentTheme == themeAccent2.parentTheme) {
                                            Theme.refreshThemeColors(false, false);
                                            NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                                            int i10 = NotificationCenter.needSetDayNightTheme;
                                            Theme.ThemeInfo themeInfo5 = Theme.currentTheme;
                                            boolean z4 = Theme.currentNightTheme == themeInfo5;
                                            i = 1;
                                            globalInstance.lambda$postNotificationNameOnUIThread$1(i10, themeInfo5, Boolean.valueOf(z4), obj4, -1);
                                        }
                                    }
                                    i9 += i;
                                }
                                i = 1;
                                i9 += i;
                            }
                            Theme.saveOtherThemes(true, false);
                            Collections.sort(Theme.themes, new Theme$$ExternalSyntheticLambda5(0));
                            if (z3) {
                                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeListUpdated, new Object[0]);
                            }
                            if (z2) {
                                Theme.PatternsLoader.createLoader(true);
                            }
                            MediaDataController.getInstance(i5).generateEmojiPreviewThemes(arrayList, i5);
                        } else {
                            TLRPC.TL_theme tL_theme = tL_themes.themes.get(i8);
                            if (tL_theme != null) {
                                if (tL_theme.isDefault) {
                                    arrayList.add(tL_theme);
                                }
                                ArrayList<TLRPC.ThemeSettings> arrayList5 = tL_theme.settings;
                                if (arrayList5 == null || arrayList5.size() <= 0) {
                                    i2 = size2;
                                    i3 = i8;
                                    String str = "remote" + tL_theme.id;
                                    Theme.ThemeInfo themeInfo6 = (Theme.ThemeInfo) map.get(str);
                                    if (themeInfo6 == null) {
                                        themeInfo6 = new Theme.ThemeInfo();
                                        themeInfo6.account = i5;
                                        themeInfo6.pathToFile = new File(ApplicationLoader.getFilesDirFixed(), zzhp.m(str, ".attheme")).getAbsolutePath();
                                        arrayList3.add(themeInfo6);
                                        arrayList4.add(themeInfo6);
                                        z3 = true;
                                    } else {
                                        arrayList2.remove(themeInfo6);
                                    }
                                    themeInfo6.name = tL_theme.title;
                                    themeInfo6.info = tL_theme;
                                    map.put(themeInfo6.getKey(), themeInfo6);
                                } else {
                                    int i11 = 0;
                                    while (i11 < tL_theme.settings.size()) {
                                        TLRPC.ThemeSettings themeSettings = tL_theme.settings.get(i11);
                                        if (themeSettings == null || (baseThemeKey = Theme.getBaseThemeKey(themeSettings)) == null || (themeInfo2 = (Theme.ThemeInfo) map.get(baseThemeKey)) == null || themeInfo2.themeAccents == null) {
                                            i8 = i8;
                                        } else {
                                            Theme.ThemeAccent themeAccentCreateNewAccent = (Theme.ThemeAccent) themeInfo2.accentsByThemeId.get(tL_theme.id);
                                            if (themeAccentCreateNewAccent != null) {
                                                if (Theme.ThemeInfo.accentEquals(themeAccentCreateNewAccent, themeSettings)) {
                                                    i8 = i8;
                                                } else {
                                                    File pathToWallpaper = themeAccentCreateNewAccent.getPathToWallpaper();
                                                    if (pathToWallpaper != null) {
                                                        pathToWallpaper.delete();
                                                    }
                                                    Theme.ThemeInfo.fillAccentValues(themeAccentCreateNewAccent, themeSettings);
                                                    Theme.ThemeInfo themeInfo7 = Theme.currentTheme;
                                                    if (themeInfo7 == themeInfo2 && themeInfo7.currentAccentId == themeAccentCreateNewAccent.id) {
                                                        Theme.refreshThemeColors(false, false);
                                                        NotificationCenter globalInstance2 = NotificationCenter.getGlobalInstance();
                                                        int i12 = NotificationCenter.needSetDayNightTheme;
                                                        Theme.ThemeInfo themeInfo8 = Theme.currentTheme;
                                                        globalInstance2.lambda$postNotificationNameOnUIThread$1(i12, themeInfo8, Boolean.valueOf(Theme.currentNightTheme == themeInfo8), obj4, -1);
                                                    }
                                                    z2 = true;
                                                    z3 = true;
                                                }
                                                TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
                                                themeAccentCreateNewAccent.patternMotion = (wallPaper == null || (wallPaperSettings = wallPaper.settings) == null || !wallPaperSettings.motion) ? false : true;
                                                arrayList2.remove(themeAccentCreateNewAccent);
                                            } else {
                                                i8 = i8;
                                                themeAccentCreateNewAccent = themeInfo2.createNewAccent(tL_theme, i5, i11);
                                                if (!TextUtils.isEmpty(themeAccentCreateNewAccent.patternSlug)) {
                                                    z2 = true;
                                                }
                                            }
                                            themeAccentCreateNewAccent.isDefault = tL_theme.isDefault;
                                        }
                                        i11++;
                                        size2 = size2;
                                        i8 = i8;
                                    }
                                    i2 = size2;
                                    i3 = i8;
                                }
                            } else {
                                i2 = size2;
                                i3 = i8;
                            }
                            i8 = i3 + 1;
                            size2 = i2;
                        }
                    }
                }
                break;
            case 1:
                AudioFocusManager audioFocusManager = AudioFocusManager.this;
                if (i5 == -3 || i5 == -2) {
                    if (i5 == -2 || ((audioAttributes = audioFocusManager.audioAttributes) != null && audioAttributes.contentType == 1)) {
                        audioFocusManager.executePlayerCommand(0);
                        audioFocusManager.setAudioFocusState(2);
                    } else {
                        audioFocusManager.setAudioFocusState(3);
                    }
                } else if (i5 == -1) {
                    audioFocusManager.executePlayerCommand(-1);
                    audioFocusManager.abandonAudioFocusIfHeld();
                } else if (i5 != 1) {
                    audioFocusManager.getClass();
                    Log.w("AudioFocusManager", "Unknown focus change type: " + i5);
                } else {
                    audioFocusManager.setAudioFocusState(1);
                    audioFocusManager.executePlayerCommand(1);
                }
                break;
            case 2:
                AlertDialog[] alertDialogArr = (AlertDialog[]) obj3;
                AlertDialog alertDialog = alertDialogArr[0];
                if (alertDialog != null) {
                    try {
                        alertDialog.setOnCancelListener(new DialogInterface.OnCancelListener() {
                            @Override
                            public final void onCancel(DialogInterface dialogInterface) {
                                ConnectionsManager.getInstance(UserConfig.selectedAccount).cancelRequest(i5, true);
                            }
                        });
                        alertDialogArr[0].show();
                    } catch (Exception unused) {
                        return;
                    }
                    break;
                }
                break;
            case 3:
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", UserConfig.getInstance(i5).clientUserId);
                ((ActionBarLayout) ((INavigationLayout) obj3)).getLastFragment().presentFragment(new ProfileActivity(bundle));
                break;
            case 4:
                ConnectionsManager.lambda$onUpdateConfig$21(i5, (TLRPC.TL_config) obj3);
                break;
            case 5:
                ConnectionsManager.lambda$onUnparsedMessageReceived$12(i5, (TLRPC.Updates) obj3);
                break;
            case 6:
                ((DialogsSearchAdapter) obj3).lambda$onBindViewHolder$31(i5);
                break;
            case 7:
                try {
                    SQLiteDatabase database = ((MessagesStorage) obj3).getDatabase();
                    database.executeFast("DELETE FROM business_replies WHERE topic_id = " + i5).stepThis().dispose();
                    database.executeFast("DELETE FROM quick_replies_messages WHERE topic_id = " + i5).stepThis().dispose();
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
                break;
            case 8:
                ((ChatMessageCell) obj3).lambda$checkBotButtonMotionEvent$4(i5);
                break;
            case 9:
                EntityView entityView = (EntityView) obj3;
                entityView.currentStickyAngle = i5;
                entityView.hasStickyAngle = true;
                try {
                    entityView.performHapticFeedback(3, 2);
                    break;
                } catch (Exception unused2) {
                }
                ValueAnimator valueAnimator = entityView.angleAnimator;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator valueAnimator2 = entityView.fromStickyAngleAnimator;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                entityView.angleAnimator = duration;
                duration.setInterpolator(CubicBezierInterpolator.DEFAULT);
                entityView.angleAnimator.addUpdateListener(new EntityView$$ExternalSyntheticLambda2(entityView, i4));
                entityView.angleAnimator.addListener(new EntityView.AnonymousClass1(entityView, i4));
                entityView.angleAnimator.start();
                break;
            case 10:
                ((LPhotoPaintView) obj3).lambda$new$11(i5);
                break;
            case 11:
                StickerMakerView stickerMakerView = (StickerMakerView) obj3;
                stickerMakerView.getClass();
                NotificationCenter.getInstance(i5).lambda$postNotificationNameOnUIThread$1(NotificationCenter.customStickerCreated, Boolean.FALSE);
                stickerMakerView.hideLoadingDialog();
                break;
            case 12:
                LinkSpanDrawable.LinksTextView linksTextView = ((ReassignBoostBottomSheet.TopCell) obj3).description;
                try {
                    if (linksTextView.getLayout().getLineForOffset(i5) == 0) {
                        linksTextView.getEditableText().insert(i5, "\n");
                    }
                } catch (Exception e2) {
                    FileLog.e(e2);
                    return;
                }
                break;
            case 13:
                BackSpaceButtonView backSpaceButtonView = (BackSpaceButtonView) obj3;
                if (backSpaceButtonView.backspacePressed) {
                    Utilities.Callback callback = backSpaceButtonView.onBackspace;
                    if (callback != null) {
                        callback.run(Boolean.valueOf(i5 < 300));
                        try {
                            backSpaceButtonView.backspaceButton.performHapticFeedback(3);
                            break;
                        } catch (Exception unused3) {
                        }
                    }
                    backSpaceButtonView.backspaceOnce = true;
                    int iMax = Math.max(50, i5 - 100);
                    AndroidUtilities.runOnUIThread(new Theme$$ExternalSyntheticLambda19(backSpaceButtonView, iMax, 13), iMax);
                    break;
                }
                break;
            case 14:
                ChatListViewPaddingsAnimator chatListViewPaddingsAnimator = (ChatListViewPaddingsAnimator) obj3;
                chatListViewPaddingsAnimator.getClass();
                try {
                    chatListViewPaddingsAnimator.recyclerView.scrollBy(0, i5);
                } catch (Throwable th) {
                    FileLog.e(th);
                    return;
                }
                break;
            case 15:
                ((FoundEmojiPacksRecyclerView) obj3).lambda$scrollOnSelect$0(i5);
                break;
            case 16:
                Browser.openUrl(((BotStarsActivity) obj3).getContext(), LocaleController.getString(i5));
                break;
            case 17:
                ConnectionsManager.getInstance(((StarsController) obj3).currentAccount).cancelRequest(i5, true);
                break;
            case 18:
                StoriesController storiesController = (StoriesController) obj3;
                ArrayList arrayList6 = storiesController.dialogListStories;
                storiesController.fixDeletedAndNonContactsStories(arrayList6);
                TableModel$$ExternalSyntheticLambda0 tableModel$$ExternalSyntheticLambda0 = storiesController.peerStoriesComparator;
                Collections.sort(arrayList6, tableModel$$ExternalSyntheticLambda0);
                ArrayList arrayList7 = storiesController.hiddenListStories;
                storiesController.fixDeletedAndNonContactsStories(arrayList7);
                Collections.sort(arrayList7, tableModel$$ExternalSyntheticLambda0);
                NotificationCenter.getInstance(i5).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                break;
            case 19:
                ((CaptionStory$$ExternalSyntheticLambda4) obj3).run(Integer.valueOf(i5));
                break;
            case 20:
                ((CaptionStory$$ExternalSyntheticLambda4) obj3).run(Integer.valueOf(i5));
                break;
            case 21:
                ((EmojiBottomSheet) obj3).onWidgetClick(i5);
                break;
            case 22:
                MessagesController.getInstance(i5).putUsers((ArrayList) obj3, true);
                break;
            case 23:
                StoryRecorder storyRecorder = (StoryRecorder) obj3;
                storyRecorder.applyPaintMessage();
                storyRecorder.switchingStory = false;
                File file = storyRecorder.outputEntry.draftThumbFile;
                if (file != null) {
                    file.delete();
                    storyRecorder.outputEntry.draftThumbFile = null;
                }
                storyRecorder.prepareThumb(true, storyRecorder.outputEntry);
                CharSequence[] charSequenceArr = {storyRecorder.captionEdit.getText()};
                int i13 = storyRecorder.currentAccount;
                ArrayList<TLRPC.MessageEntity> entities = MessagesController.getInstance(i13).storyEntitiesAllowed() ? MediaDataController.getInstance(i13).getEntities(charSequenceArr, true) : new ArrayList<>();
                ArrayList<TLRPC.MessageEntity> entities2 = MessagesController.getInstance(i13).storyEntitiesAllowed() ? MediaDataController.getInstance(i13).getEntities(new CharSequence[]{storyRecorder.outputEntry.caption}, true) : new ArrayList<>();
                StoryEntry storyEntry = storyRecorder.outputEntry;
                storyEntry.editedCaption = (TextUtils.equals(storyEntry.caption, charSequenceArr[0]) && MediaDataController.entitiesEqual(entities, entities2)) ? false : true;
                storyRecorder.outputEntry.caption = new SpannableString(storyRecorder.captionEdit.getText());
                storyRecorder.destroyPhotoPaintView();
                storyRecorder.destroyPhotoFilterView();
                StoryEntry storyEntry2 = storyRecorder.outputEntry;
                storyRecorder.mode = (storyEntry2 == null || !storyEntry2.isVideo) ? 0 : 1;
                storyRecorder.outputEntry = (StoryEntry) storyRecorder.entries.get(i5);
                storyRecorder.onNavigateStart(0, 1);
                storyRecorder.onNavigateEnd(0, 1);
                storyRecorder.storiesSelector.listView.adapter.update(false);
                storyRecorder.captionEdit.setText(storyRecorder.outputEntry.caption);
                break;
            default:
                RichButtonRowCell.ButtonView buttonView = (RichButtonRowCell.ButtonView) obj3;
                if (buttonView.pressed) {
                    RichButtonRowCell richButtonRowCell = RichButtonRowCell.this;
                    if (richButtonRowCell.delegate != null && richButtonRowCell.currentRow != null) {
                        buttonView.longPressed = true;
                        buttonView.button.setPressed(false);
                        try {
                            buttonView.performHapticFeedback(0);
                            break;
                        } catch (Exception unused4) {
                        }
                        RichButtonRowCell.Delegate delegate = richButtonRowCell.delegate;
                        BlockRow blockRow = richButtonRowCell.currentRow;
                        RichEditorListView.AnonymousClass5 anonymousClass5 = (RichEditorListView.AnonymousClass5) delegate;
                        RichEditorListView.this.hideTextSelectionUi(false);
                        RichEditorListView richEditorListView = RichEditorListView.this;
                        richEditorListView.delegate.onBlockButtonEditRequested(richEditorListView.new BlockButtonEdit(blockRow, i5), buttonView);
                        break;
                    }
                }
                break;
        }
    }

    public Theme$$ExternalSyntheticLambda19(Object obj, int i, int i2) {
        this.$r8$classId = i2;
        this.f$1 = obj;
        this.f$0 = i;
    }
}
