package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ra1;

public final class v8 extends org.telegram.ui.ActionBar.n2 {
    public static final int[][] Y = {new int[]{-11302949, -11562789, -10430789, -11480359}, new int[]{-11229725, -12014137, -10234219, -10819908}, new int[]{-12927610, -11158198, -3355566, -5191850}, new int[]{-8164117, -5281560, -2200166, -2525971}, new int[]{-1287263, -1350281, -1337532, -885148}, new int[]{-1419145, -1936819, -742839, -1014448}, new int[]{-1017772, -1212871, -998847, -1003446}};
    public static final int[][] Z = {new int[]{-7035984, -9667705}, new int[]{-1334949, -6199504}, new int[]{-1525432, -4686800}, new int[]{-11117215, -12893369}, new int[]{-15000805, -16777216}, new int[]{-10588271, -12496267}, new int[]{-5344541, -7842635}, new int[]{-5278276, -7777898}, new int[]{-4036162, -7650428}, new int[]{-2459992, -5351279}, new int[]{-1678221, -5814951}, new int[]{-9659148, -10720532}, new int[]{-12149549, -13731672}, new int[]{-12350279, -13802877}, new int[]{-10046854, -13404051}, new int[]{-8276302, -11822442}, new int[]{-10760507, -13200754}, new int[]{-10496401, -13525130}, new int[]{-1668548, -2862189}, new int[]{-9706766, -10062345}, new int[]{-3838476, -10456076}, new int[]{-1324753, -11225016}, new int[]{-10046854, -13404051}, new int[]{-3492512, -7569348}, new int[]{-5394320, -9732780}, new int[]{-7039865, -9408414}, new int[]{-5202023, -7373198}, new int[]{-3701922, -6397115}, new int[]{-4427695, -6859449}, new int[]{-7379371, -9944001}};
    public float A;
    public boolean B;
    public ValueAnimator C;
    public org.telegram.ui.ActionBar.k D;
    public g1 E;
    public s8 F;
    public tc G;
    public boolean H;
    public ValueAnimator I;
    public float J;
    public final Paint K;
    public int L;
    public boolean M;
    public org.telegram.ui.ActionBar.v0 N;
    public j8 O;
    public final h40 P;
    public boolean Q;
    public TextView R;
    public TextView S;
    public final j40 T;
    public r8 U;
    public boolean V;
    public float W;
    public ValueAnimator X;

    public o8 f33295a;

    public p8 f33296b;

    public int f33297c;
    public int d;

    public View f33298e;

    public boolean f33299f;
    public boolean h;

    public boolean f33300n;

    public ra1 f33301r;

    public CharSequence f33302s;
    public SpannableStringBuilder v;

    public boolean f33303w;

    public lh.d f33304x;

    public FrameLayout f33305y;

    public v8(j40 j40Var, h40 h40Var) {
        super(null);
        this.K = new Paint();
        this.M = true;
        this.V = false;
        this.W = 0.0f;
        this.T = j40Var;
        this.P = h40Var;
    }

    public static void U(v8 v8Var) {
        if (v8Var.getParentActivity() == null) {
            return;
        }
        if (!v8Var.f33300n) {
            v8Var.finishFragment();
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(v8Var.getParentActivity());
        alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.PhotoEditorDiscardAlert);
        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.DiscardChanges);
        alertDialog$Builder.k(LocaleController.getString(R.string.PassportDiscard), new i8(v8Var, 1));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
        v8Var.showDialog(b2Var);
        b2Var.h();
    }

    @Override
    public final View createView(Context context) {
        this.hasOwnBackground = true;
        this.actionBar.setBackgroundDrawable(null);
        this.actionBar.setCastShadows(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setOccupyStatusBar(true);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        kVar.setTitleColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        this.actionBar.D(org.telegram.ui.ActionBar.g6.w0(null, i10, false), false);
        this.actionBar.C(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23144i6, false), false);
        org.telegram.ui.Cells.pa.x(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setTitle(LocaleController.getString(R.string.PhotoEditor));
        this.actionBar.setActionBarMenuOnItemClick(new m8(this, 0));
        this.actionBar.getTitleTextView().setAlpha(0.0f);
        org.telegram.ui.ActionBar.k kVar2 = new org.telegram.ui.ActionBar.k(getParentActivity(), null);
        this.D = kVar2;
        kVar2.setCastShadows(false);
        this.D.setAddToContainer(false);
        this.D.setOccupyStatusBar(true);
        this.D.setClipChildren(false);
        int iK = i0.b.k(-1, 60);
        this.D.D(-1, false);
        org.telegram.ui.Cells.pa.x(false, this.D);
        this.D.setAllowOverlayTitle(false);
        this.D.C(iK, false);
        org.telegram.ui.ActionBar.z zVarN = this.D.n();
        zVarN.setClipChildren(false);
        h40 h40Var = this.P;
        org.telegram.ui.ActionBar.v0 v0VarE = zVarN.e(1, (h40Var == null || h40Var.f28926c != 2) ? LocaleController.getString(R.string.SetPhoto) : LocaleController.getString(R.string.SuggestPhoto));
        this.N = v0VarE;
        v0VarE.setBackground(org.telegram.ui.ActionBar.g6.f0(iK, 3, -1));
        this.D.setActionBarMenuOnItemClick(new m8(this, 1));
        this.f33301r = new ra1(this, getParentActivity(), 7);
        n8 n8Var = new n8(this, context);
        n8Var.setFitsSystemWindows(true);
        n8Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f22999a7, false));
        this.f33301r.setClipChildren(false);
        this.f33301r.setClipToPadding(false);
        this.f33301r.setPadding(0, AndroidUtilities.statusBarHeight, 0, 0);
        this.f33301r.setOrientation(1);
        ra1 ra1Var = this.f33301r;
        o8 o8Var = new o8(this, getParentActivity(), n8Var);
        this.f33295a = o8Var;
        ra1Var.addView(o8Var);
        TextView textView = new TextView(getParentActivity());
        this.S = textView;
        textView.setText(LocaleController.getString(R.string.ChooseBackground));
        TextView textView2 = this.S;
        int i11 = org.telegram.ui.ActionBar.g6.f23423y6;
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        this.S.setTextSize(1, 14.0f);
        this.S.setGravity(17);
        this.f33301r.addView(this.S, h7.z5.t(-1, -2, 0, 21, 10, 21, 10));
        hh.h1 h1Var = new hh.h1(this, getParentActivity());
        s8 s8Var = new s8(this, getParentActivity());
        this.F = s8Var;
        h1Var.addView(s8Var);
        this.f33301r.addView(h1Var, h7.z5.t(-1, 48, 0, 12, 0, 12, 0));
        TextView textView3 = new TextView(getParentActivity());
        this.R = textView3;
        textView3.setText(LocaleController.getString(R.string.ChooseEmojiOrSticker));
        this.R.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        this.R.setTextSize(1, 14.0f);
        this.R.setGravity(17);
        this.f33301r.addView(this.R, h7.z5.t(-1, -2, 0, 21, 18, 21, 10));
        p8 p8Var = new p8(this, this, getParentActivity(), getThemedColor(i10));
        this.f33296b = p8Var;
        p8Var.N = true;
        p8Var.setAnimationsEnabled(this.fragmentBeginToShow);
        this.f33296b.setClipChildren(false);
        this.f33301r.addView(this.f33296b, h7.z5.t(-1, -1, 0, 12, 0, 12, 12));
        this.f33301r.setClipChildren(false);
        n8Var.addView(this.f33301r, h7.z5.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 64.0f));
        View view = new View(getParentActivity());
        this.f33298e = view;
        view.setVisibility(8);
        lh.d dVar = new lh.d(context, this.resourceProvider, true);
        this.f33304x = dVar;
        dVar.e();
        this.f33304x.d.o(false, false, false);
        int i12 = this.T.R;
        if (i12 == 1) {
            this.f33302s = LocaleController.getString(R.string.SetChannelPhoto);
        } else if (i12 == 3) {
            this.f33302s = LocaleController.getString(R.string.SetCommunityPhoto);
        } else if (i12 == 2) {
            this.f33302s = LocaleController.getString(R.string.SetGroupPhoto);
        } else if (h40Var == null || h40Var.f28926c != 2) {
            this.f33302s = LocaleController.getString(R.string.SetMyProfilePhotoAvatarConstructor);
        } else {
            this.f33302s = LocaleController.getString(R.string.SuggestPhoto);
        }
        this.f33302s = new SpannableStringBuilder(this.f33302s);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f33302s);
        spannableStringBuilder.append((CharSequence) " l");
        spannableStringBuilder.setSpan(new cq(R.drawable.msg_mini_lock2, 0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        this.v = spannableStringBuilder;
        this.f33303w = false;
        this.f33304x.g(this.f33302s, false, true);
        this.f33304x.setOnClickListener(new f0(this, 3));
        this.f33305y = new FrameLayout(context);
        n8Var.addView(this.f33304x, h7.z5.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f));
        n8Var.addView(this.f33305y, h7.z5.d(-1, 80.0f, 80, 8.0f, 16.0f, 8.0f, 64.0f));
        n8Var.addView(this.actionBar);
        n8Var.addView(this.D);
        n8Var.addView(this.f33298e, h7.z5.c(-1.0f, -1));
        tc tcVar = new tc(n8Var);
        this.G = tcVar;
        tcVar.h = new h8(this, 0);
        this.fragmentView = n8Var;
        return n8Var;
    }

    public final void d0() {
        ValueAnimator valueAnimator = this.C;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.C.cancel();
            this.C = null;
        }
    }

    public final boolean e0() {
        if (UserConfig.getInstance(this.currentAccount).isPremium()) {
            return false;
        }
        o8 o8Var = this.f33295a;
        r8 r8Var = o8Var.h;
        return (r8Var != null && r8Var.f32100b) || o8Var.f33007n;
    }

    public final void f0() {
        TLRPC.Document document;
        int i10;
        MediaController.PhotoEntry photoEntry;
        TLRPC.Document documentF;
        if (this.f33295a.getImageReceiver() == null || !this.f33295a.getImageReceiver().hasImageLoaded()) {
            return;
        }
        int i11 = 1;
        if (e0()) {
            new mc(this.f33305y, this.resourceProvider).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.PremiumAvatarToast), new h8(this, i11))).j();
            return;
        }
        g1 g1Var = this.E;
        if (g1Var != null) {
            o8 o8Var = this.f33295a;
            r8 r8Var = o8Var.h;
            long j10 = o8Var.f33002a;
            document = o8Var.f33003b;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) g1Var.f28496b;
            v8 v8Var = (v8) g1Var.f28497c;
            boolean z10 = ChatAttachAlertPhotoLayout.f26237m1;
            gi giVar = chatAttachAlertPhotoLayout.f34900b;
            HashMap map = ChatAttachAlertPhotoLayout.f26239o1;
            map.clear();
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(800, 800, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            c20 c20Var = new c20();
            if (r8Var != null) {
                c20Var.d(r8Var.f32101c, r8Var.d, r8Var.f32102e, r8Var.f32103f);
            } else {
                int[] iArr = Y[0];
                c20Var.d(iArr[0], iArr[1], iArr[2], iArr[3]);
            }
            c20Var.b(0.0f, 0.0f, 800.0f, 800.0f);
            canvas.drawRect(0.0f, 0.0f, 800.0f, 800.0f, c20Var.f27292c);
            File file = new File(FileLoader.getDirectory(4), SharedConfig.getLastLocalId() + "avatar_background.png");
            try {
                file.createNewFile();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                i10 = 4;
                try {
                    bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    fileOutputStream.write(byteArray);
                    fileOutputStream.flush();
                    fileOutputStream.close();
                } catch (IOException e9) {
                    e = e9;
                    e.printStackTrace();
                }
            } catch (IOException e10) {
                e = e10;
                i10 = 4;
            }
            int i12 = (int) 120.00001f;
            int i13 = (int) 560.0f;
            ImageReceiver imageReceiver = o8Var.getImageReceiver();
            if (imageReceiver.getAnimation() != null) {
                Bitmap bitmapP = imageReceiver.getAnimation().p();
                ImageReceiver imageReceiver2 = new ImageReceiver();
                imageReceiver2.setImageBitmap(bitmapP);
                float f10 = i12;
                float f11 = i13;
                imageReceiver2.setImageCoords(f10, f10, f11, f11);
                imageReceiver2.setRoundRadius((int) (f11 * 0.13f));
                imageReceiver2.draw(canvas);
                imageReceiver2.clearImage();
                bitmapP.recycle();
            } else {
                if (imageReceiver.getLottieAnimation() != null) {
                    imageReceiver.getLottieAnimation().L(0, false, true);
                }
                float f12 = i12;
                float f13 = i13;
                imageReceiver.setImageCoords(f12, f12, f13, f13);
                imageReceiver.setRoundRadius((int) (f13 * 0.13f));
                imageReceiver.draw(canvas);
            }
            File file2 = new File(FileLoader.getDirectory(i10), SharedConfig.getLastLocalId() + "avatar_background.png");
            try {
                file2.createNewFile();
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream2);
                byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
                FileOutputStream fileOutputStream2 = new FileOutputStream(file2);
                fileOutputStream2.write(byteArray2);
                fileOutputStream2.flush();
                fileOutputStream2.close();
            } catch (IOException e11) {
                e11.printStackTrace();
            }
            if (o8Var.getImageReceiver().getAnimation() == null && o8Var.getImageReceiver().getLottieAnimation() == null) {
                photoEntry = new MediaController.PhotoEntry(0, 0, 0L, file2.getPath(), 0, false, 0, 0, 0L);
            } else {
                photoEntry = new MediaController.PhotoEntry(0, 0, 0L, file.getPath(), 0, false, 0, 0, 0L);
                photoEntry.thumbPath = file2.getPath();
                if (o8Var.f33002a != 0) {
                    TLRPC.TL_videoSizeEmojiMarkup tL_videoSizeEmojiMarkup = new TLRPC.TL_videoSizeEmojiMarkup();
                    tL_videoSizeEmojiMarkup.emoji_id = o8Var.f33002a;
                    tL_videoSizeEmojiMarkup.background_colors.add(Integer.valueOf(o8Var.h.f32101c));
                    int i14 = o8Var.h.d;
                    if (i14 != 0) {
                        tL_videoSizeEmojiMarkup.background_colors.add(Integer.valueOf(i14));
                    }
                    int i15 = o8Var.h.f32102e;
                    if (i15 != 0) {
                        tL_videoSizeEmojiMarkup.background_colors.add(Integer.valueOf(i15));
                    }
                    int i16 = o8Var.h.f32103f;
                    if (i16 != 0) {
                        tL_videoSizeEmojiMarkup.background_colors.add(Integer.valueOf(i16));
                    }
                    photoEntry.emojiMarkup = tL_videoSizeEmojiMarkup;
                } else if (o8Var.f33003b != null) {
                    TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup = new TLRPC.TL_videoSizeStickerMarkup();
                    TLRPC.Document document2 = o8Var.f33003b;
                    tL_videoSizeStickerMarkup.sticker_id = document2.f22386id;
                    tL_videoSizeStickerMarkup.stickerset = MessageObject.getInputStickerSet(document2);
                    tL_videoSizeStickerMarkup.background_colors.add(Integer.valueOf(o8Var.h.f32101c));
                    int i17 = o8Var.h.d;
                    if (i17 != 0) {
                        tL_videoSizeStickerMarkup.background_colors.add(Integer.valueOf(i17));
                    }
                    int i18 = o8Var.h.f32102e;
                    if (i18 != 0) {
                        tL_videoSizeStickerMarkup.background_colors.add(Integer.valueOf(i18));
                    }
                    int i19 = o8Var.h.f32103f;
                    if (i19 != 0) {
                        tL_videoSizeStickerMarkup.background_colors.add(Integer.valueOf(i19));
                    }
                    photoEntry.emojiMarkup = tL_videoSizeStickerMarkup;
                }
                VideoEditedInfo videoEditedInfo = new VideoEditedInfo();
                photoEntry.editedInfo = videoEditedInfo;
                videoEditedInfo.originalPath = file.getPath();
                VideoEditedInfo videoEditedInfo2 = photoEntry.editedInfo;
                videoEditedInfo2.resultWidth = 800;
                videoEditedInfo2.resultHeight = 800;
                videoEditedInfo2.originalWidth = 800;
                videoEditedInfo2.originalHeight = 800;
                videoEditedInfo2.isPhoto = true;
                videoEditedInfo2.bitrate = -1;
                videoEditedInfo2.muted = true;
                videoEditedInfo2.startTime = 0L;
                videoEditedInfo2.start = 0L;
                videoEditedInfo2.endTime = o8Var.getDuration();
                VideoEditedInfo videoEditedInfo3 = photoEntry.editedInfo;
                videoEditedInfo3.framerate = 30;
                videoEditedInfo3.avatarStartTime = 0L;
                long j11 = videoEditedInfo3.endTime;
                videoEditedInfo3.estimatedSize = (int) ((j11 / 1000.0f) * 115200.0f);
                videoEditedInfo3.estimatedDuration = j11;
                VideoEditedInfo.MediaEntity mediaEntity = new VideoEditedInfo.MediaEntity();
                mediaEntity.type = (byte) 0;
                if (document == 0) {
                    documentF = k5.f(UserConfig.selectedAccount, j10);
                }
                if (documentF != null) {
                    documentF = document;
                    mediaEntity.viewWidth = i13;
                    mediaEntity.viewHeight = i13;
                    mediaEntity.width = 0.7f;
                    mediaEntity.height = 0.7f;
                    mediaEntity.f19646x = 0.15f;
                    mediaEntity.f19647y = 0.15f;
                    mediaEntity.document = documentF;
                    mediaEntity.parentObject = null;
                    mediaEntity.text = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(documentF, true).getAbsolutePath();
                    mediaEntity.roundRadius = 0.13f;
                    if (MessageObject.isAnimatedStickerDocument(documentF, true) || MessageObject.isVideoStickerDocument(documentF)) {
                        mediaEntity.subType = (byte) ((MessageObject.isAnimatedStickerDocument(documentF, true) ? (byte) 1 : (byte) 4) | mediaEntity.subType);
                    }
                    if (MessageObject.isTextColorEmoji(documentF)) {
                        mediaEntity.color = -1;
                        mediaEntity.subType = (byte) (mediaEntity.subType | 8);
                    }
                    photoEntry.editedInfo.mediaEntities = new ArrayList<>();
                    photoEntry.editedInfo.mediaEntities.add(mediaEntity);
                }
            }
            map.put(-1, photoEntry);
            ChatAttachAlertPhotoLayout.f26240p1.add(-1);
            giVar.V1.n0(7, true, false, 0, 0, 0L, giVar.s1(), false, 0L);
            if (!v8Var.M) {
                org.telegram.ui.ActionBar.n2 n2Var = giVar.f28635b0;
                if (n2Var != null) {
                    n2Var.removeSelfFromStack();
                }
                v8Var.finishFragment();
            }
        }
        documentF = document;
        if (this.M) {
            finishFragment();
        }
    }

    public final void g0(boolean z10, boolean z11, boolean z12) {
        if (this.Q) {
            return;
        }
        d0();
        int i10 = 2;
        this.C = ValueAnimator.ofFloat(this.A, z10 ? 1.0f : 0.0f);
        if (z11) {
            this.f33295a.f33010w = this.A;
            if (Build.VERSION.SDK_INT >= 23) {
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
            }
        }
        this.C.addUpdateListener(new ig.y(6, this, z11));
        this.C.addListener(new org.telegram.ui.ActionBar.g(this, z10, z11, i10));
        if (z12) {
            this.C.setInterpolator(er.h);
            this.C.setDuration(350L);
            this.C.setStartDelay(150L);
        } else {
            this.C.setInterpolator(er.f28122f);
            this.C.setDuration(250L);
        }
        this.C.start();
    }

    public final void h0(boolean z10, long j10, TLRPC.Document document) {
        o8 o8Var = this.f33295a;
        o8Var.f33002a = j10;
        jh.z3 z3Var = o8Var.f33004c;
        o8Var.f33003b = document;
        if (j10 == 0) {
            z3Var.setAnimatedEmojiDrawable(null);
            this.f33295a.f33004c.getImageReceiver().setImage(ImageLocation.getForDocument(document), "100_100", null, null, DocumentObject.getSvgThumb(document, org.telegram.ui.ActionBar.g6.f23215m6, 0.2f), 0L, "tgs", document, 0);
        } else {
            z3Var.setAnimatedEmojiDrawable(new k5(14, this.currentAccount, j10));
            this.f33295a.f33004c.getImageReceiver().clearImage();
        }
        if (this.f33295a.getImageReceiver() != null && this.f33295a.getImageReceiver().getAnimation() != null) {
            this.f33295a.getImageReceiver().getAnimation().y(0L, true, false);
        }
        if (this.f33295a.getImageReceiver() != null && this.f33295a.getImageReceiver().getLottieAnimation() != null) {
            this.f33295a.getImageReceiver().getLottieAnimation().L(0, false, true);
        }
        this.f33300n = true;
        n0();
    }

    public final void i0(float f10, boolean z10) {
        this.A = f10;
        float f11 = ((this.d - this.f33297c) - AndroidUtilities.statusBarHeight) * f10;
        if (this.J == 0.0f) {
            this.f33301r.setTranslationY(f11);
            this.f33304x.setTranslationY(f11);
        }
        this.f33295a.setTranslationY(((-(this.d - this.f33297c)) / 2.0f) * f10);
        this.fragmentView.invalidate();
        if (z10) {
            this.f33295a.setExpanded(f10 > 0.5f);
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        boolean z10;
        o8 o8Var = this.f33295a;
        if (o8Var != null && (o8Var.v || (o8Var.f33010w >= 0.0f && o8Var.h != null))) {
            r8 r8Var = o8Var.h;
            int iD = r8Var.f32101c;
            int i10 = r8Var.d;
            if (i10 != 0) {
                iD = i0.b.d(0.5f, iD, i10);
            }
            int i11 = r8Var.f32102e;
            if (i11 != 0) {
                iD = i0.b.d(0.5f, iD, i11);
            }
            int i12 = r8Var.f32103f;
            if (i12 != 0) {
                iD = i0.b.d(0.5f, iD, i12);
            }
            if (AndroidUtilities.computePerceivedBrightness(iD) > 0.721f) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f22999a7, false)) > 0.721f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.V != z10) {
            this.V = z10;
            if (this.actionBar.getAlpha() == 0.0f) {
                j0(z10 ? 0.0f : 1.0f);
            } else {
                ValueAnimator valueAnimator = this.X;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    this.X.cancel();
                }
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.W, z10 ? 0.0f : 1.0f);
                this.X = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new e6(this, 3));
                this.X.setDuration(150L).start();
            }
        }
        j8 j8Var = this.O;
        if (j8Var != null) {
            AndroidUtilities.setLightStatusBar(j8Var, z10);
        }
        return z10;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return false;
    }

    public final void j0(float f10) {
        if (this.W != f10) {
            this.W = f10;
            int iD = i0.b.d(f10, -16777216, -1);
            int iK = i0.b.k(iD, 60);
            this.D.D(iD, false);
            this.N.setBackground(org.telegram.ui.ActionBar.g6.f0(iK, 3, -1));
        }
    }

    public final void k0(long j10) {
        o8 o8Var = this.f33295a;
        if (o8Var == null) {
            return;
        }
        r8 r8Var = new r8();
        int[] iArr = Y[0];
        r8Var.f32101c = iArr[0];
        r8Var.d = iArr[1];
        r8Var.f32102e = iArr[2];
        r8Var.f32103f = iArr[3];
        o8Var.b(r8Var, false);
        n0();
        o8 o8Var2 = this.f33295a;
        o8Var2.f33002a = j10;
        o8Var2.f33004c.setAnimatedEmojiDrawable(new k5(14, this.currentAccount, j10));
        this.F.w1(r8Var);
        this.f33296b.setForUser(false);
    }

    public final void l0(TLRPC.VideoSize videoSize) {
        r8 r8Var = new r8();
        r8Var.f32101c = i0.b.k(videoSize.background_colors.get(0).intValue(), 255);
        r8Var.d = videoSize.background_colors.size() > 1 ? i0.b.k(videoSize.background_colors.get(1).intValue(), 255) : 0;
        r8Var.f32102e = videoSize.background_colors.size() > 2 ? i0.b.k(videoSize.background_colors.get(2).intValue(), 255) : 0;
        r8Var.f32103f = videoSize.background_colors.size() > 3 ? i0.b.k(videoSize.background_colors.get(3).intValue(), 255) : 0;
        this.f33295a.b(r8Var, false);
        n0();
        TLRPC.Document document = null;
        if (videoSize instanceof TLRPC.TL_videoSizeEmojiMarkup) {
            h0(false, ((TLRPC.TL_videoSizeEmojiMarkup) videoSize).emoji_id, null);
        } else {
            TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup = new TLRPC.TL_videoSizeStickerMarkup();
            TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(this.currentAccount).getStickerSet(tL_videoSizeStickerMarkup.stickerset, false);
            if (stickerSet != null) {
                for (int i10 = 0; i10 < stickerSet.documents.size(); i10++) {
                    if (stickerSet.documents.get(i10).f22386id == tL_videoSizeStickerMarkup.sticker_id) {
                        document = stickerSet.documents.get(i10);
                    }
                }
            }
            h0(false, 0L, document);
        }
        this.F.w1(r8Var);
        this.f33296b.setForUser(true);
    }

    public final void m0(x8 x8Var) {
        r8 backgroundGradient = x8Var.getBackgroundGradient();
        o8 o8Var = this.f33295a;
        if (o8Var == null) {
            return;
        }
        o8Var.b(backgroundGradient, false);
        n0();
        if (x8Var.getAnimatedEmoji() != null) {
            long jI = x8Var.getAnimatedEmoji().i();
            o8 o8Var2 = this.f33295a;
            o8Var2.f33002a = jI;
            o8Var2.f33004c.setAnimatedEmojiDrawable(new k5(14, this.currentAccount, jI));
        }
        this.F.w1(backgroundGradient);
        this.f33296b.setForUser(false);
    }

    public final void n0() {
        boolean zE0 = e0();
        if (this.f33303w != zE0) {
            lh.d dVar = this.f33304x;
            this.f33303w = zE0;
            dVar.g(zE0 ? this.v : this.f33302s, true, true);
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (!this.f33300n) {
            return super.onBackPressed(z10);
        }
        if (!z10) {
            return false;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.PhotoEditorDiscardAlert);
        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.DiscardChanges);
        alertDialog$Builder.k(LocaleController.getString(R.string.PassportDiscard), new i8(this, 0));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
        showDialog(b2Var);
        b2Var.h();
        return false;
    }

    @Override
    public final void onResume() {
        super.onResume();
        AndroidUtilities.requestAdjustResize(getParentActivity(), getClassGuid());
    }
}
