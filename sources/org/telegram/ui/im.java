package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.RadialProgress2;
public final class im implements org.telegram.ui.Cells.t0 {
    public final rm f36836a;

    public im(rm rmVar) {
        this.f36836a = rmVar;
    }

    @Override
    public final void D1(org.telegram.ui.Cells.w0 w0Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
        int i10;
        fo foVar = this.f36836a.Q;
        if (str == null) {
            i10 = ((org.telegram.ui.ActionBar.m2) foVar).currentAccount;
            sg.m1 m1Var = new sg.m1(foVar, i10, foVar.i(), new sg.k(tL_premiumGiftOption), null, foVar.f35633ea);
            m1Var.J0 = false;
            m1Var.f45254c0 = w0Var.getMessageObject().isOut();
            foVar.showDialog(m1Var);
            return;
        }
        b(w0Var);
        pf.c cVar = foVar.Ab;
        ug.g0 g0Var = ug.g0.S0;
        ug.c0.U(LaunchActivity.R(), str, cVar);
    }

    @Override
    public final org.telegram.ui.ActionBar.m2 M0() {
        return this.f36836a.Q;
    }

    @Override
    public final void W(org.telegram.ui.Cells.w0 w0Var, int i10) {
        gm gmVar = new gm(this, w0Var, i10, 0);
        fo foVar = this.f36836a.Q;
        if (foVar.A0.N) {
            foVar.pb(false, true, true);
            AndroidUtilities.runOnUIThread(gmVar, 80L);
            return;
        }
        gmVar.run();
    }

    @Override
    public final long a() {
        return 0L;
    }

    @Override
    public final void a2(org.telegram.ui.Cells.w0 w0Var, String str) {
        b(w0Var);
        fo foVar = this.f36836a.Q;
        ug.c0.U(foVar, str, foVar.Ab);
    }

    public final void b(org.telegram.ui.Cells.w0 w0Var) {
        jn jnVar;
        fo foVar = this.f36836a.Q;
        pf.c cVar = foVar.Ab;
        if (cVar != null) {
            cVar.a(true);
        }
        if (w0Var.getMessageObject() == null) {
            jnVar = null;
        } else {
            jnVar = new jn(this, w0Var, 6);
        }
        foVar.Ab = jnVar;
    }

    @Override
    public final void b0(org.telegram.ui.Cells.w0 w0Var) {
        dk dkVar;
        fo foVar = this.f36836a.Q;
        MessageObject messageObject = w0Var.getMessageObject();
        if (messageObject == null) {
            return;
        }
        messageObject.forceUpdate = true;
        ak akVar = foVar.f35861x0;
        if (akVar != null && (dkVar = foVar.f35886z0) != null && dkVar.f44835y < 0) {
            int childCount = akVar.getChildCount() - 1;
            while (true) {
                if (childCount < 0) {
                    break;
                }
                View childAt = foVar.f35861x0.getChildAt(childCount);
                foVar.f35861x0.getClass();
                if (RecyclerView.R(childAt) >= 0) {
                    if (childAt instanceof org.telegram.ui.Cells.u1) {
                        if (((org.telegram.ui.Cells.u1) childAt).getCurrentMessagesGroup() == null) {
                            foVar.Q8(childAt);
                            break;
                        }
                    } else if (childAt instanceof org.telegram.ui.Cells.w0) {
                        foVar.Q8(childAt);
                        break;
                    }
                }
                childCount--;
            }
        }
        foVar.vc(messageObject, false);
    }

    @Override
    public final long d() {
        return this.f36836a.Q.d();
    }

    @Override
    public final void d1(org.telegram.ui.Cells.w0 w0Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
        int intValue;
        int i10;
        cl clVar = this.f36836a.Q.f35871xa;
        FrameLayout frameLayout = clVar.G;
        HashMap hashMap = clVar.f37552f;
        Random random = clVar.h;
        ArrayList arrayList = clVar.F;
        if (arrayList.size() <= 12 && w0Var.getPhotoImage().hasNotThumb()) {
            float imageHeight = w0Var.getPhotoImage().getImageHeight();
            float imageWidth = w0Var.getPhotoImage().getImageWidth();
            if (imageHeight > 0.0f && imageWidth > 0.0f) {
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                while (i11 < arrayList.size()) {
                    if (((jz) arrayList.get(i11)).f37185p == w0Var.getMessageObject().getId()) {
                        i12++;
                        if (((jz) arrayList.get(i11)).f37187r.getLottieAnimation() == null || ((jz) arrayList.get(i11)).f37187r.getLottieAnimation().y()) {
                            return;
                        }
                    }
                    if (((jz) arrayList.get(i11)).f37186q != null && document != null) {
                        i10 = i11;
                        if (((jz) arrayList.get(i11)).f37186q.f18922id == document.f18922id) {
                            i13++;
                        }
                    } else {
                        i10 = i11;
                    }
                    i11 = i10 + 1;
                }
                if (i12 < 4) {
                    jz jzVar = new jz();
                    jzVar.h = true;
                    if (!jzVar.f37178i) {
                        jzVar.f37176f = ((random.nextInt() % 101) / 100.0f) * (imageWidth / 4.0f);
                        jzVar.f37177g = ((random.nextInt() % 101) / 100.0f) * (imageHeight / 4.0f);
                    }
                    jzVar.f37185p = w0Var.getMessageObject().getId();
                    jzVar.f37182m = true;
                    jzVar.f37187r.setAllowStartAnimation(true);
                    int f7 = kz.f();
                    if (i13 > 0) {
                        Integer num = (Integer) hashMap.get(Long.valueOf(document.f18922id));
                        if (num == null) {
                            intValue = 0;
                        } else {
                            intValue = num.intValue();
                        }
                        hashMap.put(Long.valueOf(document.f18922id), Integer.valueOf((intValue + 1) % 4));
                        jzVar.f37187r.setUniqKeyPrefix(intValue + "_" + jzVar.f37185p + "_");
                    }
                    jzVar.f37186q = document;
                    jzVar.f37187r.setImage(ImageLocation.getForDocument(videoSize, document), a1.g.k(f7, f7, "_"), null, "tgs", clVar.f37551c, 1);
                    jzVar.f37187r.setLayerNum(Integer.MAX_VALUE);
                    jzVar.f37187r.setAutoRepeat(0);
                    if (jzVar.f37187r.getLottieAnimation() != null) {
                        if (jzVar.h) {
                            jzVar.f37187r.getLottieAnimation().N(0, false, true);
                        }
                        jzVar.f37187r.getLottieAnimation().start();
                    }
                    arrayList.add(jzVar);
                    if (clVar.f37553n) {
                        jzVar.f37187r.onAttachedToWindow();
                        jzVar.f37187r.setParentView(frameLayout);
                    }
                    frameLayout.invalidate();
                }
            }
        }
    }

    @Override
    public final boolean e() {
        return false;
    }

    @Override
    public final void g0(org.telegram.ui.Cells.w0 w0Var, int i10, int i11) {
        i2.z zVar = new i2.z(this, w0Var, i10, i11, 3);
        fo foVar = this.f36836a.Q;
        if (foVar.A0.N) {
            foVar.pb(false, true, true);
            AndroidUtilities.runOnUIThread(zVar, 80L);
            return;
        }
        zVar.run();
    }

    @Override
    public final void k0(org.telegram.ui.Cells.w0 w0Var) {
        TLRPC.VideoSize videoSize;
        TLRPC.VideoSize videoSize2;
        File pathToAttach;
        boolean z10;
        int i10;
        TLRPC.WallPaperSettings wallPaperSettings;
        TLRPC.WallPaper wallPaper;
        String str;
        MessageObject messageObject = w0Var.getMessageObject();
        PhotoViewer t12 = PhotoViewer.t1();
        fo foVar = this.f36836a.Q;
        t12.K2(null, foVar, foVar.f35633ea);
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 640);
        if (w0Var.getMessageObject().type == 24) {
            bi.sb orCreateStoryViewer = foVar.getOrCreateStoryViewer();
            ak akVar = foVar.f35861x0;
            orCreateStoryViewer.getClass();
            MessageObject messageObject2 = w0Var.getMessageObject();
            if (foVar.getParentActivity() != null && messageObject2.type == 24) {
                TLRPC.MessageMedia messageMedia = messageObject2.messageOwner.media;
                TL_stories.StoryItem storyItem = messageMedia.storyItem;
                storyItem.dialogId = DialogObject.getPeerDialogId(messageMedia.peer);
                storyItem.messageId = messageObject2.getId();
                orCreateStoryViewer.F(foVar.getParentActivity(), messageObject2.messageOwner.media.storyItem, bi.g9.a(akVar));
                return;
            }
            return;
        }
        boolean z11 = false;
        if (w0Var.getMessageObject().type == 22) {
            i10 = ((org.telegram.ui.ActionBar.m2) foVar).currentAccount;
            MessagesController messagesController = MessagesController.getInstance(i10);
            RadialProgress2 radialProgress2 = w0Var.J1;
            if (radialProgress2 != null && radialProgress2.f22950i.f29023q == 3 && messageObject.getId() < 0 && (str = messagesController.uploadingWallpaper) != null && TextUtils.equals(messageObject.messageOwner.action.wallpaper.uploadingImage, str)) {
                messagesController.cancelUploadWallpaper();
                foVar.Ka(messageObject);
                return;
            }
            MessageObject messageObject3 = w0Var.P0;
            if (messageObject3 != null && w0Var.O(messageObject3) && w0Var.f22365x1 != null) {
                TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
                if (messageAction instanceof TLRPC.TL_messageActionSetChatWallPaper) {
                    TLRPC.WallPaper wallPaper2 = ((TLRPC.TL_messageActionSetChatWallPaper) messageAction).wallpaper;
                    if (!wallPaper2.pattern && wallPaper2.document != null) {
                        wallPaper = wallPaper2;
                    } else {
                        String str2 = wallPaper2.slug;
                        TLRPC.WallPaperSettings wallPaperSettings2 = wallPaper2.settings;
                        oj1 oj1Var = new oj1(str2, wallPaperSettings2.background_color, wallPaperSettings2.second_background_color, wallPaperSettings2.third_background_color, wallPaperSettings2.fourth_background_color, AndroidUtilities.getWallpaperRotation(wallPaperSettings2.rotation, false), wallPaperSettings.intensity / 100.0f, wallPaper2.settings.motion, null);
                        wallPaper = oj1Var;
                        if (wallPaper2 instanceof TLRPC.TL_wallPaper) {
                            oj1Var.f38691g = (TLRPC.TL_wallPaper) wallPaper2;
                            wallPaper = oj1Var;
                        }
                    }
                    boolean q6 = org.telegram.ui.ActionBar.g6.I.q();
                    ld1 ld1Var = new ld1(wallPaper, foVar, q6);
                    TLRPC.WallPaperSettings wallPaperSettings3 = wallPaper2.settings;
                    if (wallPaperSettings3 != null) {
                        boolean z12 = wallPaperSettings3.blur;
                        boolean z13 = wallPaperSettings3.motion;
                        ld1Var.F1 = z12;
                        ld1Var.E1 = z13;
                        ld1Var.f34616n1 = wallPaperSettings3.intensity / 100.0f;
                    }
                    ld1Var.f34621q0 = messageObject;
                    ld1Var.c1(messageObject.getDialogId());
                    ld1Var.f34577a.f34563a = foVar.f35633ea;
                    ld1Var.f34620p1 = new md1(foVar, q6);
                    foVar.presentFragment(ld1Var);
                    return;
                }
                return;
            }
            foVar.Bb();
            return;
        }
        ArrayList<TLRPC.VideoSize> arrayList = messageObject.messageOwner.action.photo.video_sizes;
        if (arrayList != null && !arrayList.isEmpty()) {
            videoSize = FileLoader.getClosestVideoSizeWithSize(messageObject.messageOwner.action.photo.video_sizes, 1000);
            videoSize2 = FileLoader.getEmojiMarkup(messageObject.messageOwner.action.photo.video_sizes);
        } else {
            videoSize = null;
            videoSize2 = null;
        }
        if (w0Var.getMessageObject().type == 21 && !messageObject.isOutOwner()) {
            if (!messageObject.settingAvatar) {
                if (videoSize2 != null) {
                    org.telegram.ui.Components.i50 i50Var = new org.telegram.ui.Components.i50(0, true, true);
                    i50Var.f25498a = foVar;
                    i50Var.e();
                    i50Var.f25500c.f29684j0.r0(null, videoSize2, 0L);
                    i50Var.f25499b = new di.w6(foVar, new TLRPC.FileLocation[1], new TLRPC.FileLocation[1], foVar.getUserConfig().getClientUserId(), 7);
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                ImageLocation.getForPhoto(videoSize, messageObject.messageOwner.action.photo);
                FileLoader fileLoader = foVar.getFileLoader();
                if (videoSize == null) {
                    pathToAttach = fileLoader.getPathToAttach(messageObject.messageOwner.action.photo);
                } else {
                    pathToAttach = fileLoader.getPathToAttach(videoSize);
                }
                File file = new File(FileLoader.getDirectory(4), pathToAttach.getName());
                if (!pathToAttach.exists()) {
                    if (file.exists()) {
                        pathToAttach = file;
                    } else {
                        return;
                    }
                }
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, pathToAttach.getAbsolutePath(), 0, false, 0, 0, 0L);
                photoEntry.caption = foVar.Y.getFieldText();
                if (videoSize != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                photoEntry.isVideo = z10;
                arrayList2.add(photoEntry);
                PhotoViewer.t1().g2(arrayList2, 0, 1, false, new hm(this, messageObject, photoEntry), null);
                if (photoEntry.isVideo) {
                    PhotoViewer.t1().O2(LocaleController.getString(R.string.SuggestedVideo));
                } else {
                    PhotoViewer.t1().O2(LocaleController.getString(R.string.SuggestedPhoto));
                }
                org.telegram.ui.Components.g50 g50Var = new org.telegram.ui.Components.g50(1, foVar.getUserConfig().getCurrentUser());
                if (videoSize != null) {
                    z11 = true;
                }
                g50Var.e = z11;
                g50Var.f24881b = foVar.getMessagesController().getUser(Long.valueOf(foVar.T5));
                PhotoViewer.t1().x2(g50Var);
            }
        } else if (videoSize != null) {
            PhotoViewer.t1().e2(videoSize.location, ImageLocation.getForPhoto(videoSize, messageObject.messageOwner.action.photo), foVar.Ga);
            if (w0Var.getMessageObject().type == 21) {
                PhotoViewer.t1().O2(LocaleController.getString(R.string.SuggestedVideo));
            }
        } else if (closestPhotoSizeWithSize != null) {
            PhotoViewer.t1().e2(closestPhotoSizeWithSize.location, ImageLocation.getForPhoto(closestPhotoSizeWithSize, messageObject.messageOwner.action.photo), foVar.Ga);
            if (w0Var.getMessageObject().type == 21) {
                PhotoViewer.t1().O2(LocaleController.getString(R.string.SuggestedPhoto));
            }
        } else {
            PhotoViewer.t1().d2(messageObject, null, 0L, 0L, 0L, foVar.Ga);
        }
    }

    @Override
    public final boolean k2(org.telegram.ui.Cells.w0 w0Var, float f7, float f10) {
        boolean z10;
        fo foVar = this.f36836a.Q;
        z10 = ((org.telegram.ui.ActionBar.m2) foVar).inPreviewMode;
        if (z10) {
            return false;
        }
        return foVar.L7(w0Var, false, false, f7, f10, true, true, false);
    }

    @Override
    public final void o2(org.telegram.ui.Cells.w0 w0Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
        this.f36836a.Q.Z7(w0Var, reactionCount, z10, f7, f10);
    }

    @Override
    public final void r0(org.telegram.ui.Cells.w0 w0Var) {
        fo foVar = this.f36836a.Q;
        MessageObject messageObject = w0Var.getMessageObject();
        if (messageObject != null && messageObject.type == 22 && !w0Var.getMessageObject().isOutOwner() && w0Var.getMessageObject().isWallpaperForBoth() && w0Var.getMessageObject().isCurrentWallpaper()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(foVar.getParentActivity(), 0, foVar.getResourceProvider());
            alertDialog$Builder.f19248a.R = LocaleController.getString(R.string.RemoveWallpaperTitle);
            alertDialog$Builder.f19248a.T = LocaleController.getString(R.string.RemoveWallpaperMessage);
            alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new b1(this, 21));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19248a;
            foVar.showDialog(a2Var);
            TextView textView = (TextView) a2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(foVar.getThemedColor(org.telegram.ui.ActionBar.g6.f19839q7));
            }
        }
    }

    @Override
    public final void t1(long j10) {
        fo foVar = this.f36836a.Q;
        int i10 = fo.Hc;
        foVar.sa(j10);
    }

    @Override
    public final void u1(org.telegram.ui.Cells.w0 w0Var) {
        fo foVar = this.f36836a.Q;
        MessageObject messageObject = w0Var.getMessageObject();
        if (messageObject == null || foVar.R1 == null) {
            return;
        }
        if (ChatObject.isMonoForum(foVar.e)) {
            foVar.R1.m(messageObject.getMonoForumTopicId(), true);
        } else {
            foVar.R1.m(messageObject.getTopicId(), true);
        }
    }

    @Override
    public final void O0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
    }
}
