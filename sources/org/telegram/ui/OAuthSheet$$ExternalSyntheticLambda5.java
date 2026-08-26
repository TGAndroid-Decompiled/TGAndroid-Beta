package org.telegram.ui;

import android.text.TextUtils;
import com.google.android.gms.internal.mlkit_vision_common.zzlu;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import org.telegram.messenger.AiTonesController$$ExternalSyntheticLambda0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;
import org.telegram.ui.web.BotWebViewContainer;

public final class OAuthSheet$$ExternalSyntheticLambda5 implements Utilities.Callback {
    public final int $r8$classId = 1;
    public final Object f$0;
    public final Object f$1;
    public final Object f$10;
    public final Object f$2;
    public final boolean f$3;
    public final String f$4;
    public final Object f$5;
    public final Object f$6;
    public final boolean f$7;
    public final Object f$8;
    public final Serializable f$9;

    public OAuthSheet$$ExternalSyntheticLambda5(SelectAnimatedEmojiDialog selectAnimatedEmojiDialog, String str, boolean z, ArrayList arrayList, HashMap map, ArrayList arrayList2, LinkedHashSet linkedHashSet, LinkedHashSet linkedHashSet2, ArrayList arrayList3, ArrayList arrayList4, boolean z2) {
        this.f$0 = selectAnimatedEmojiDialog;
        this.f$4 = str;
        this.f$3 = z;
        this.f$1 = arrayList;
        this.f$2 = map;
        this.f$9 = arrayList2;
        this.f$5 = linkedHashSet;
        this.f$6 = linkedHashSet2;
        this.f$8 = arrayList3;
        this.f$10 = arrayList4;
        this.f$7 = z2;
    }

    @Override
    public final void run(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                int[] iArr = (int[]) this.f$0;
                final TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) this.f$1;
                final BottomSheet bottomSheet = (BottomSheet) this.f$2;
                final boolean z = this.f$3;
                final String str = this.f$4;
                final TLRPC.UrlAuthResult urlAuthResult = (TLRPC.UrlAuthResult) this.f$5;
                final String[] strArr = (String[]) this.f$6;
                final boolean z2 = this.f$7;
                final BotWebViewContainer botWebViewContainer = (BotWebViewContainer) this.f$8;
                final String str2 = (String) this.f$9;
                final Theme.ResourcesProvider resourcesProvider = (Theme.ResourcesProvider) this.f$10;
                final Integer num = (Integer) obj;
                if (iArr[0] != num.intValue()) {
                    final AlertDialog alertDialog = new AlertDialog(ApplicationLoader.applicationContext, 3, null);
                    AndroidUtilities.cancelRunOnUIThread(alertDialog.showRunnable);
                    AndroidUtilities.runOnUIThread(alertDialog.showRunnable, 200L);
                    ConnectionsManager.getInstance(num.intValue()).sendRequestTyped(tL_messages_requestUrlAuth, new AiTonesController$$ExternalSyntheticLambda0(), new Utilities.Callback2() {
                        @Override
                        public final void run(Object obj2, Object obj3) {
                            TLRPC.UrlAuthResult urlAuthResult2 = (TLRPC.UrlAuthResult) obj2;
                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                            alertDialog.dismiss();
                            BottomSheet bottomSheet2 = bottomSheet;
                            if (urlAuthResult2 != null) {
                                bottomSheet2.lambda$showGiftOfferSheet$15();
                                OAuthSheet.handle(z, num.intValue(), tL_messages_requestUrlAuth, urlAuthResult2, str, urlAuthResult, strArr[0], z2, botWebViewContainer);
                                return;
                            }
                            if (tL_error != null) {
                                if (!"URL_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                                    zzlu.m(bottomSheet2.topBulletinContainer, bottomSheet2.getResourcesProvider(), tL_error);
                                    return;
                                }
                                bottomSheet2.lambda$showGiftOfferSheet$15();
                                BulletinFactory bulletinFactory = OAuthSheet.getBulletinFactory();
                                int i = R.raw.error;
                                String string = LocaleController.getString(R.string.BotAuthLoggedInFailTitle);
                                String str3 = str2;
                                bulletinFactory.createSimpleBulletin(string, TextUtils.isEmpty(str3) ? LocaleController.getString(R.string.BotAuthLoggedInFailNoDomain) : AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.BotAuthLoggedInFail, str3), Theme.getColor(Theme.key_undo_cancelColor, resourcesProvider)), i).show();
                            }
                        }
                    });
                    break;
                }
                break;
            default:
                final SelectAnimatedEmojiDialog selectAnimatedEmojiDialog = (SelectAnimatedEmojiDialog) this.f$0;
                selectAnimatedEmojiDialog.getClass();
                final ArrayList arrayList = (ArrayList) this.f$1;
                final ArrayList arrayList2 = (ArrayList) this.f$9;
                final LinkedHashSet linkedHashSet = (LinkedHashSet) this.f$5;
                final LinkedHashSet linkedHashSet2 = (LinkedHashSet) this.f$6;
                final ArrayList arrayList3 = (ArrayList) this.f$8;
                final ArrayList arrayList4 = (ArrayList) this.f$10;
                final boolean z3 = this.f$7;
                final String str3 = this.f$4;
                final boolean z4 = this.f$3;
                final HashMap map = (HashMap) this.f$2;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        SelectAnimatedEmojiDialog selectAnimatedEmojiDialog2 = selectAnimatedEmojiDialog;
                        SelectAnimatedEmojiDialog$$ExternalSyntheticLambda1 selectAnimatedEmojiDialog$$ExternalSyntheticLambda1 = selectAnimatedEmojiDialog2.clearSearchRunnable;
                        if (selectAnimatedEmojiDialog$$ExternalSyntheticLambda1 != null) {
                            AndroidUtilities.cancelRunOnUIThread(selectAnimatedEmojiDialog$$ExternalSyntheticLambda1);
                            selectAnimatedEmojiDialog2.clearSearchRunnable = null;
                        }
                        String str4 = selectAnimatedEmojiDialog2.lastQuery;
                        String str5 = str3;
                        if (str5 != str4) {
                            return;
                        }
                        selectAnimatedEmojiDialog2.searched = true;
                        selectAnimatedEmojiDialog2.switchGrids(true, z4);
                        SelectAnimatedEmojiDialog.AnonymousClass18 anonymousClass18 = selectAnimatedEmojiDialog2.searchBox;
                        if (anonymousClass18 != null) {
                            anonymousClass18.updateButton$4(true);
                        }
                        ArrayList arrayList5 = selectAnimatedEmojiDialog2.searchResult;
                        if (arrayList5 == null) {
                            selectAnimatedEmojiDialog2.searchResult = new ArrayList();
                        } else {
                            arrayList5.clear();
                        }
                        ArrayList arrayList6 = selectAnimatedEmojiDialog2.searchSets;
                        if (arrayList6 == null) {
                            selectAnimatedEmojiDialog2.searchSets = new ArrayList();
                        } else {
                            arrayList6.clear();
                        }
                        ArrayList arrayList7 = selectAnimatedEmojiDialog2.stickersSearchResult;
                        if (arrayList7 == null) {
                            selectAnimatedEmojiDialog2.stickersSearchResult = new ArrayList();
                        } else {
                            arrayList7.clear();
                        }
                        ArrayList arrayList8 = selectAnimatedEmojiDialog2.searchResultStickers;
                        if (arrayList8 == null) {
                            selectAnimatedEmojiDialog2.searchResultStickers = new ArrayList();
                        } else {
                            arrayList8.clear();
                        }
                        int i = 0;
                        selectAnimatedEmojiDialog2.emojiSearchGridView.scrollToPosition(0);
                        int i2 = selectAnimatedEmojiDialog2.type;
                        if (i2 == 1 || i2 == 14 || i2 == 11 || i2 == 2) {
                            ArrayList arrayList9 = arrayList;
                            if (arrayList9.isEmpty()) {
                                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) map.get(str5);
                                if (tL_availableReaction != null) {
                                    ArrayList arrayList10 = selectAnimatedEmojiDialog2.searchResult;
                                    ReactionsLayoutInBubble.VisibleReaction visibleReaction = new ReactionsLayoutInBubble.VisibleReaction();
                                    String str6 = tL_availableReaction.reaction;
                                    visibleReaction.emojicon = str6;
                                    visibleReaction.hash = str6.hashCode();
                                    arrayList10.add(visibleReaction);
                                }
                            } else {
                                selectAnimatedEmojiDialog2.searchResult.addAll(arrayList9);
                            }
                            ArrayList arrayList11 = arrayList2;
                            if (!arrayList11.isEmpty()) {
                                selectAnimatedEmojiDialog2.searchResultStickers.addAll(arrayList11);
                            }
                        }
                        for (Long l : linkedHashSet) {
                            l.getClass();
                            ArrayList arrayList12 = selectAnimatedEmojiDialog2.searchResult;
                            ReactionsLayoutInBubble.VisibleReaction visibleReaction2 = new ReactionsLayoutInBubble.VisibleReaction();
                            long jLongValue = l.longValue();
                            visibleReaction2.documentId = jLongValue;
                            visibleReaction2.hash = jLongValue;
                            arrayList12.add(visibleReaction2);
                        }
                        Iterator it = linkedHashSet2.iterator();
                        while (it.hasNext()) {
                            selectAnimatedEmojiDialog2.searchResult.add(ReactionsLayoutInBubble.VisibleReaction.fromEmojicon((String) it.next()));
                        }
                        selectAnimatedEmojiDialog2.searchSets.addAll(arrayList3);
                        ArrayList arrayList13 = arrayList4;
                        int size = arrayList13.size();
                        while (i < size) {
                            Object obj2 = arrayList13.get(i);
                            i++;
                            selectAnimatedEmojiDialog2.stickersSearchResult.addAll((ArrayList) obj2);
                        }
                        selectAnimatedEmojiDialog2.searchAdapter.updateRows(true ^ z3);
                    }
                });
                break;
        }
    }

    public OAuthSheet$$ExternalSyntheticLambda5(int[] iArr, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, BottomSheet bottomSheet, boolean z, String str, TLRPC.UrlAuthResult urlAuthResult, String[] strArr, boolean z2, BotWebViewContainer botWebViewContainer, String str2, Theme.ResourcesProvider resourcesProvider) {
        this.f$0 = iArr;
        this.f$1 = tL_messages_requestUrlAuth;
        this.f$2 = bottomSheet;
        this.f$3 = z;
        this.f$4 = str;
        this.f$5 = urlAuthResult;
        this.f$6 = strArr;
        this.f$7 = z2;
        this.f$8 = botWebViewContainer;
        this.f$9 = str2;
        this.f$10 = resourcesProvider;
    }
}
