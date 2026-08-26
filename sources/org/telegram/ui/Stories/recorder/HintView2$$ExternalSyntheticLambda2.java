package org.telegram.ui.Stories.recorder;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Pair;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.Components.AnimatedFileNative;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.bots.BotVerifySheet$$ExternalSyntheticLambda7;

public final class HintView2$$ExternalSyntheticLambda2 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;

    public HintView2$$ExternalSyntheticLambda2(Object obj, Object obj2, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    @Override
    public final void run() {
        int[] iArr;
        File file;
        int i;
        boolean zContains;
        Pair pair = null;
        colorsSync = null;
        colorsSync = null;
        colorsSync = null;
        int[] colorsSync = null;
        Bitmap bitmapDecodeFile = null;
        int i2 = 0;
        Object obj = this.f$2;
        Object obj2 = this.f$1;
        Object obj3 = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                ((HintView2) obj3).lambda$checkTouchLinks$1((LinkSpanDrawable) obj2, (ClickableSpan) obj);
                return;
            case 1:
                EmojiBottomSheet.Page.Adapter adapter = (EmojiBottomSheet.Page.Adapter) obj3;
                if (TextUtils.equals((String) obj2, adapter.query)) {
                    adapter.itemsCount = 0;
                    ArrayList arrayList = adapter.documents;
                    arrayList.clear();
                    ArrayList arrayList2 = adapter.documentIds;
                    arrayList2.clear();
                    adapter.positionToSection.clear();
                    adapter.stickerSets.clear();
                    adapter.itemsCount++;
                    arrayList.add(null);
                    arrayList2.add(0L);
                    TLObject tLObject = (TLObject) obj;
                    if (tLObject instanceof TLRPC.TL_messages_stickers) {
                        TLRPC.TL_messages_stickers tL_messages_stickers = (TLRPC.TL_messages_stickers) tLObject;
                        arrayList.addAll(tL_messages_stickers.stickers);
                        adapter.itemsCount = tL_messages_stickers.stickers.size() + adapter.itemsCount;
                    }
                    adapter.activeQuery = adapter.query;
                    adapter.notifyDataSetChanged();
                    EmojiBottomSheet.Page page = EmojiBottomSheet.Page.this;
                    EmojiBottomSheet.EmojiListView.access$4100(page.listView, 0, 0);
                    page.searchField.showProgress(false);
                    page.tabsStrip.showSelected(false);
                    return;
                }
                return;
            case 2:
                GalleryListView.Cell cell = (GalleryListView.Cell) obj3;
                cell.getClass();
                if (obj2 != null) {
                    int iMin = (int) Math.min(AndroidUtilities.displaySize.x / 3.0f, AndroidUtilities.dp(330.0f));
                    if (obj2 instanceof MediaController.PhotoEntry) {
                        MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj2;
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        String str = photoEntry.thumbPath;
                        if (str != null) {
                            BitmapFactory.decodeFile(str, options);
                        } else if (!photoEntry.isVideo || photoEntry.isLivePhoto()) {
                            MediaStore.Images.Thumbnails.getThumbnail(cell.getContext().getContentResolver(), photoEntry.imageId, 1, options);
                        } else {
                            MediaStore.Video.Thumbnails.getThumbnail(cell.getContext().getContentResolver(), photoEntry.imageId, 1, options);
                        }
                        StoryEntry.setupScale(options, iMin);
                        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                        options.inDither = true;
                        options.inJustDecodeBounds = false;
                        String str2 = photoEntry.thumbPath;
                        Bitmap bitmapDecodeFile2 = str2 != null ? BitmapFactory.decodeFile(str2, options) : (!photoEntry.isVideo || photoEntry.isLivePhoto()) ? MediaStore.Images.Thumbnails.getThumbnail(cell.getContext().getContentResolver(), photoEntry.imageId, 1, options) : MediaStore.Video.Thumbnails.getThumbnail(cell.getContext().getContentResolver(), photoEntry.imageId, 1, options);
                        if (bitmapDecodeFile2 != null && bitmapDecodeFile2.getHeight() / bitmapDecodeFile2.getWidth() < cell.aspectRatio) {
                            if (photoEntry.gradientTopColor == 0 && photoEntry.gradientBottomColor == 0 && !bitmapDecodeFile2.isRecycled()) {
                                colorsSync = DominantColors.getColorsSync(bitmapDecodeFile2, true);
                                photoEntry.gradientTopColor = colorsSync[0];
                                photoEntry.gradientBottomColor = colorsSync[1];
                            } else {
                                int i3 = photoEntry.gradientTopColor;
                                if (i3 != 0 && (i = photoEntry.gradientBottomColor) != 0) {
                                    colorsSync = new int[]{i3, i};
                                }
                            }
                        }
                        iArr = colorsSync;
                        bitmapDecodeFile = bitmapDecodeFile2;
                    } else if (!(obj2 instanceof StoryEntry) || (file = ((StoryEntry) obj2).draftThumbFile) == null) {
                        iArr = null;
                    } else {
                        BitmapFactory.Options options2 = new BitmapFactory.Options();
                        options2.inJustDecodeBounds = true;
                        BitmapFactory.decodeFile(file.getPath(), options2);
                        StoryEntry.setupScale(options2, iMin);
                        options2.inPreferredConfig = Bitmap.Config.ARGB_8888;
                        options2.inDither = true;
                        options2.inJustDecodeBounds = false;
                        bitmapDecodeFile = BitmapFactory.decodeFile(file.getPath(), options2);
                        iArr = null;
                    }
                    pair = new Pair(bitmapDecodeFile, iArr);
                }
                AndroidUtilities.runOnUIThread(new HintView2$$ExternalSyntheticLambda2(cell, (String) obj, pair, 3));
                return;
            case 3:
                GalleryListView.Cell cell2 = (GalleryListView.Cell) obj3;
                cell2.getClass();
                Pair pair2 = (Pair) obj;
                Bitmap bitmap = (Bitmap) pair2.first;
                int[] iArr2 = (int[]) pair2.second;
                if (bitmap == null) {
                    return;
                }
                String str3 = (String) obj2;
                if (str3 != null) {
                    GalleryListView.Cell.bitmapsCache.put(str3, bitmap);
                    HashMap map = GalleryListView.Cell.bitmapsUseCounts;
                    Integer num = (Integer) map.get(str3);
                    if (num != null) {
                        map.put(str3, Integer.valueOf(num.intValue() + 1));
                    } else {
                        map.put(str3, 1);
                    }
                }
                if (!TextUtils.equals(str3, cell2.currentKey)) {
                    GalleryListView.Cell.releaseBitmap(str3);
                    return;
                }
                cell2.bitmap = bitmap;
                Paint paint = cell2.gradientPaint;
                if (iArr2 == null) {
                    paint.setShader(null);
                    cell2.gradient = null;
                } else {
                    LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, iArr2, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    cell2.gradient = linearGradient;
                    paint.setShader(linearGradient);
                }
                cell2.updateMatrix();
                cell2.invalidate();
                return;
            case 4:
                GalleryListView.SearchAdapter searchAdapter = (GalleryListView.SearchAdapter) obj3;
                searchAdapter.triedResolvingBot = true;
                searchAdapter.loading = false;
                TLObject tLObject2 = (TLObject) obj2;
                if (tLObject2 instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject2;
                    MessagesController messagesController = (MessagesController) obj;
                    messagesController.putUsers(tL_contacts_resolvedPeer.users, false);
                    messagesController.putChats(tL_contacts_resolvedPeer.chats, false);
                    MessagesStorage.getInstance(GalleryListView.this.currentAccount).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                    searchAdapter.loadInternal();
                    return;
                }
                return;
            case 5:
                break;
            case 6:
                AnimatedFileNative.getVideoInfo((String) obj3, ((int[][]) obj2)[0], 0L);
                AndroidUtilities.runOnUIThread((BotVerifySheet$$ExternalSyntheticLambda7) obj);
                return;
            case 7:
                StoryPrivacyBottomSheet.Page page2 = (StoryPrivacyBottomSheet.Page) obj3;
                page2.button.setLoading(false);
                TLObject tLObject3 = (TLObject) obj2;
                StoryPrivacyBottomSheet storyPrivacyBottomSheet = StoryPrivacyBottomSheet.this;
                if (tLObject3 != null) {
                    int i4 = StoryPrivacyBottomSheet.$r8$clinit;
                    ArrayList contacts = storyPrivacyBottomSheet.getContacts();
                    for (int i5 = 0; i5 < contacts.size(); i5++) {
                        TLRPC.User user = (TLRPC.User) contacts.get(i5);
                        if (user != null && (zContains = page2.selectedUsers.contains(Long.valueOf(user.id))) != user.close_friend) {
                            user.close_friend = zContains;
                            user.flags2 = zContains ? user.flags2 | 4 : user.flags2 & (-5);
                            ((MessagesController) obj).putUser(user, false);
                        }
                    }
                }
                storyPrivacyBottomSheet.closeKeyboard();
                if (storyPrivacyBottomSheet.isEdit) {
                    storyPrivacyBottomSheet.done(new StoryPrivacyBottomSheet.StoryPrivacy(1, ((BottomSheet) storyPrivacyBottomSheet).currentAccount, (ArrayList) null), new StoryPrivacyBottomSheet$Page$$ExternalSyntheticLambda8(storyPrivacyBottomSheet, 1), false);
                    return;
                } else {
                    storyPrivacyBottomSheet.closeKeyboard();
                    storyPrivacyBottomSheet.viewPager.scrollToPosition(0);
                    return;
                }
            case 8:
                StoryRecorder storyRecorder = (StoryRecorder) obj3;
                storyRecorder.getClass();
                Bitmap bitmap2 = (Bitmap) obj2;
                Runnable runnable = (Runnable) obj;
                if (bitmap2 != null) {
                    try {
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap2, 0, 0, bitmap2.getWidth(), bitmap2.getHeight(), storyRecorder.cameraView.getMatrix(), true);
                        bitmap2.recycle();
                        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateBitmap, 80, (int) (bitmapCreateBitmap.getHeight() / (bitmapCreateBitmap.getWidth() / 80.0f)), true);
                        if (bitmapCreateScaledBitmap != null) {
                            if (bitmapCreateScaledBitmap != bitmapCreateBitmap) {
                                bitmapCreateBitmap.recycle();
                            }
                            Utilities.blurBitmap(bitmapCreateScaledBitmap, 7);
                            FileOutputStream fileOutputStream = new FileOutputStream(new File(ApplicationLoader.getFilesDirFixed(), "cthumb.jpg"));
                            bitmapCreateScaledBitmap.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream);
                            bitmapCreateScaledBitmap.recycle();
                            fileOutputStream.close();
                        }
                    } catch (Throwable unused) {
                        AndroidUtilities.runOnUIThread(runnable);
                        return;
                    }
                    break;
                }
                AndroidUtilities.runOnUIThread(runnable);
                return;
            default:
                StoryRecorder storyRecorder2 = (StoryRecorder) obj3;
                storyRecorder2.getClass();
                ((StoryEntry) obj2).draftThumbFile = (File) obj;
                StoryRecorder.AnonymousClass11 anonymousClass11 = storyRecorder2.storiesSelector;
                if (anonymousClass11 != null) {
                    anonymousClass11.listView.adapter.update(false);
                    return;
                }
                return;
        }
        while (true) {
            String[] strArr = (String[]) obj3;
            if (i2 >= strArr.length) {
                AndroidUtilities.runOnUIThread((BotVerifySheet$$ExternalSyntheticLambda7) obj);
                return;
            }
            String str4 = strArr[i2];
            if (str4 != null) {
                AnimatedFileNative.getVideoInfo(str4, ((int[][]) obj2)[i2], 0L);
            }
            i2++;
        }
    }
}
