package org.telegram.ui;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.VibrationEffect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.WebFile;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class ft {
    public static TextPaint f39441f0;
    public static volatile ft f39442g0;
    public final ImageReceiver A;
    public final ImageReceiver B;
    public org.telegram.ui.Components.yd0 C;
    public Path D;
    public boolean E;
    public float F;
    public StaticLayout G;
    public long H;
    public int I;
    public Drawable J;
    public boolean K;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout L;
    public float M;
    public final Paint N;
    public eg1 O;
    public org.telegram.ui.Components.zb P;
    public FrameLayout Q;
    public boolean R;
    public boolean S;
    public TLRPC.TL_messages_stickerSet T;
    public final bt U;
    public int V;
    public TLRPC.Document W;
    public SendMessagesHelper.ImportingSticker X;
    public String Y;
    public TLRPC.BotInlineResult Z;
    public int f39443a;
    public TLRPC.InputStickerSet f39444a0;
    public int f39445b;
    public Object f39446b0;
    public float f39447c;
    public org.telegram.ui.ActionBar.u6 f39448c0;
    public float d;
    public VibrationEffect f39449d0;
    public boolean f39450e0;
    public float f39451f;
    public float f39452g;
    public View h;
    public boolean f39453i;
    public org.telegram.ui.Components.zr0 f39454j;
    public org.telegram.ui.ActionBar.o1 f39455k;
    public dt f39456l;
    public boolean f39457m;
    public boolean f39458n;
    public ArrayList f39459o;
    public boolean f39460p;
    public int f39462r;
    public final hh.b f39463s;
    public final ch.b f39464t;
    public final ColorDrawable f39465u;
    public Bitmap v;
    public Activity f39466w;
    public WindowManager.LayoutParams f39467x;
    public k0 f39468y;
    public bh.p f39469z;
    public float e = 0.0f;
    public i0.b f39461q = i0.b.e;

    public ft() {
        hh.b bVar = new hh.b();
        this.f39463s = bVar;
        this.f39464t = new ch.b(bVar);
        this.f39465u = new ColorDrawable(1895825408);
        this.A = new ImageReceiver();
        this.B = new ImageReceiver();
        this.E = false;
        this.I = AndroidUtilities.dp(200.0f);
        this.N = new Paint(1);
        this.U = new bt(this);
    }

    public static void a(ft ftVar, Bitmap bitmap, Bitmap bitmap2) {
        hh.b bVar = ftVar.f39463s;
        Paint paint = ftVar.N;
        ftVar.A.setVisible(true, false);
        ftVar.v = bitmap;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setScale(15.0f, 15.0f);
        bitmapShader.setLocalMatrix(matrix);
        if (Build.VERSION.SDK_INT >= 33) {
            bitmapShader.setFilterMode(2);
        }
        paint.setFilterBitmap(true);
        paint.setShader(bitmapShader);
        bVar.a(bitmap2);
        ih.d.c(bVar, ftVar.f39468y);
        ftVar.f39464t.d();
        ftVar.f39450e0 = false;
        bh.p pVar = ftVar.f39469z;
        if (pVar != null) {
            pVar.invalidate();
        }
    }

    public static boolean f(ft ftVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        boolean z10;
        boolean z11;
        boolean z12;
        float f7;
        boolean z13;
        float f10;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2;
        sh.q qVar;
        org.telegram.ui.ActionBar.r2 r2Var;
        dt dtVar = ftVar.f39456l;
        if (dtVar == null) {
            return false;
        }
        TLRPC.TL_messageMediaPoll d = dtVar.d();
        TLRPC.PollAnswer g7 = ftVar.f39456l.g();
        if (d == null || d.poll == null || g7 == null) {
            return false;
        }
        TLRPC.PollAnswerVoters pollResult = MessageObject.getPollResult(d, g7.option);
        if (pollResult != null && pollResult.voters > 0 && MessageObject.canShowVotersList(d)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!MessageObject.isVoted(d) && !d.poll.closed && !ftVar.f39456l.c()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11 && MessageObject.canUnvote(d)) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z10) {
            sh.q qVar2 = new sh.q(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext(), ftVar.f39462r, ftVar.f39448c0);
            org.telegram.ui.Components.k80 k80Var = new org.telegram.ui.Components.k80(actionBarPopupWindow$ActionBarPopupWindowLayout, ftVar.f39448c0);
            int b10 = actionBarPopupWindow$ActionBarPopupWindowLayout.b(k80Var.B);
            int i10 = org.telegram.ui.ActionBar.y6.E8;
            k80Var.T(org.telegram.ui.ActionBar.y6.o1(0.06f, org.telegram.ui.ActionBar.y6.w0(i10, ftVar.f39448c0)));
            ch.b bVar = ftVar.f39464t;
            fh.e k10 = gh.c.k(ftVar.f39448c0);
            View view = k80Var.B;
            if (view != null) {
                eh.d c10 = bVar.c(view, null, true);
                c10.v(k10);
                view.setBackground(c10);
            }
            z13 = true;
            k80Var.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new ui(actionBarPopupWindow$ActionBarPopupWindowLayout, 15), false);
            k80Var.k();
            MessageObject z14 = ftVar.f39456l.z();
            Activity activity = ftVar.f39466w;
            if ((activity instanceof LaunchActivity) && z14 != null) {
                LaunchActivity launchActivity = (LaunchActivity) activity;
                if (launchActivity.O() != null && launchActivity.O().getLastFragment() != null) {
                    r2Var = launchActivity.O().getLastFragment();
                } else {
                    r2Var = null;
                }
                if (r2Var != null) {
                    org.telegram.ui.Components.r71 a2 = qVar2.a(r2Var, z14.getDialogId(), z14.getId(), g7.option, pollResult.voters, new org.telegram.ui.Components.oy(8, ftVar, r2Var));
                    qVar = qVar2;
                    k80Var.q(a2);
                    qVar.setText(LocaleController.formatPluralString("PollVotesCount", pollResult.voters, new Object[0]));
                    qVar.f48666a.d(pollResult.recent_voters, false);
                    qVar.setLayoutParams(org.telegram.ui.Components.gb1.r(-1, 48));
                    int i11 = org.telegram.ui.ActionBar.y6.I5;
                    org.telegram.ui.Cells.y Z = org.telegram.ui.ActionBar.y6.Z(org.telegram.ui.ActionBar.y6.w0(i11, ftVar.f39448c0), 12, 0);
                    org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i11);
                    org.telegram.ui.ActionBar.u6 u6Var = ftVar.f39448c0;
                    qVar.setBackground(Z);
                    org.telegram.ui.ActionBar.f7.k(qVar, Z, null, N, u6Var);
                    qVar.setOnClickListener(new ai.w(actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 23));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(qVar);
                    View l1Var = new org.telegram.ui.ActionBar.l1(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext(), ftVar.f39448c0);
                    l1Var.setTag(R.id.fit_width_tag, 1);
                    f7 = 0.06f;
                    org.telegram.ui.ActionBar.f7.j(l1Var, org.telegram.ui.ActionBar.f7.L(0.06f, i10), ftVar.f39448c0);
                    l1Var.setLayoutParams(org.telegram.ui.Components.gb1.r(-1, 8));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(l1Var);
                }
            }
            qVar = qVar2;
            qVar.setText(LocaleController.formatPluralString("PollVotesCount", pollResult.voters, new Object[0]));
            qVar.f48666a.d(pollResult.recent_voters, false);
            qVar.setLayoutParams(org.telegram.ui.Components.gb1.r(-1, 48));
            int i112 = org.telegram.ui.ActionBar.y6.I5;
            org.telegram.ui.Cells.y Z2 = org.telegram.ui.ActionBar.y6.Z(org.telegram.ui.ActionBar.y6.w0(i112, ftVar.f39448c0), 12, 0);
            org.telegram.ui.ActionBar.b7 N2 = org.telegram.ui.ActionBar.f7.N(i112);
            org.telegram.ui.ActionBar.u6 u6Var2 = ftVar.f39448c0;
            qVar.setBackground(Z2);
            org.telegram.ui.ActionBar.f7.k(qVar, Z2, null, N2, u6Var2);
            qVar.setOnClickListener(new ai.w(actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 23));
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(qVar);
            View l1Var2 = new org.telegram.ui.ActionBar.l1(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext(), ftVar.f39448c0);
            l1Var2.setTag(R.id.fit_width_tag, 1);
            f7 = 0.06f;
            org.telegram.ui.ActionBar.f7.j(l1Var2, org.telegram.ui.ActionBar.f7.L(0.06f, i10), ftVar.f39448c0);
            l1Var2.setLayoutParams(org.telegram.ui.Components.gb1.r(-1, 8));
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(l1Var2);
        } else {
            f7 = 0.06f;
            z13 = true;
        }
        if (z11) {
            f10 = f7;
            org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_select, LocaleController.getString(R.string.PollSubmitVotesNoCaps), false, ftVar.f39448c0).setOnClickListener(new us(ftVar, 2));
        } else {
            f10 = f7;
        }
        if (z12) {
            actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_unvote, LocaleController.getString(R.string.Unvote), false, ftVar.f39448c0).setOnClickListener(new us(ftVar, 3));
        } else {
            actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
        }
        if (!z10 && (z11 || z12)) {
            View l1Var3 = new org.telegram.ui.ActionBar.l1(actionBarPopupWindow$ActionBarPopupWindowLayout2.getContext(), ftVar.f39448c0);
            l1Var3.setTag(R.id.fit_width_tag, 1);
            org.telegram.ui.ActionBar.f7.j(l1Var3, org.telegram.ui.ActionBar.f7.L(f10, org.telegram.ui.ActionBar.y6.E8), ftVar.f39448c0);
            l1Var3.setLayoutParams(org.telegram.ui.Components.gb1.r(-1, 8));
            actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(l1Var3);
        }
        if (!z10 && !z11 && !z12) {
            return false;
        }
        return z13;
    }

    public static ft o() {
        ft ftVar;
        ft ftVar2 = f39442g0;
        if (ftVar2 == null) {
            synchronized (PhotoViewer.class) {
                try {
                    ftVar = f39442g0;
                    if (ftVar == null) {
                        ftVar = new ft();
                        f39442g0 = ftVar;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return ftVar;
        }
        return ftVar2;
    }

    public final void l() {
        if (this.f39466w != null && !this.K) {
            AndroidUtilities.cancelRunOnUIThread(this.U);
            this.F = 1.0f;
            this.H = System.currentTimeMillis();
            this.f39469z.invalidate();
            this.W = null;
            this.f39444a0 = null;
            this.Y = null;
            this.f39456l = null;
            this.E = false;
            AndroidUtilities.runOnUIThread(new ss(this, 0), 200L);
            eg1 eg1Var = this.O;
            if (eg1Var != null) {
                eg1Var.animate().alpha(0.0f).translationY(AndroidUtilities.dp(56.0f)).setDuration(150L).setInterpolator(org.telegram.ui.Components.ds.f27584f).start();
            }
            FrameLayout frameLayout = this.Q;
            if (frameLayout != null) {
                frameLayout.animate().alpha(0.0f).setDuration(150L).scaleX(0.6f).scaleY(0.6f).setInterpolator(org.telegram.ui.Components.ds.f27584f).start();
            }
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 8);
        }
    }

    public final void m() {
        bh.i0 reactionsWindow;
        org.telegram.ui.Components.zb zbVar = this.P;
        if (zbVar != null && (reactionsWindow = zbVar.getReactionsWindow()) != null && !reactionsWindow.f4060q) {
            reactionsWindow.d();
            return;
        }
        this.K = false;
        n();
        l();
    }

    public final void n() {
        org.telegram.ui.ActionBar.o1 o1Var = this.f39455k;
        if (o1Var != null) {
            o1Var.dismiss();
            this.f39455k = null;
            return;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.L;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            org.telegram.messenger.vh.q(actionBarPopupWindow$ActionBarPopupWindowLayout.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).translationY(AndroidUtilities.dp(-12.0f)), org.telegram.ui.Components.ds.h, 320L);
            this.L = null;
            this.K = false;
            if (this.R) {
                l();
            }
        }
    }

    public final boolean p(MotionEvent motionEvent, org.telegram.ui.Components.mm0 mm0Var, dt dtVar, org.telegram.ui.ActionBar.u6 u6Var) {
        int i10;
        this.f39456l = dtVar;
        if (dtVar != null) {
            this.f39457m = dtVar.k();
            this.f39458n = this.f39456l.p();
        }
        dt dtVar2 = this.f39456l;
        if ((dtVar2 == null || dtVar2.h()) && motionEvent.getAction() == 0) {
            int x9 = (int) motionEvent.getX();
            int y3 = (int) motionEvent.getY();
            int childCount = mm0Var.getChildCount();
            int i11 = 0;
            while (true) {
                if (i11 >= childCount) {
                    break;
                }
                View childAt = mm0Var.getChildAt(i11);
                if (childAt == null) {
                    break;
                }
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                int left = childAt.getLeft();
                int right = childAt.getRight();
                if (top <= y3 && bottom >= y3 && left <= x9 && right >= x9) {
                    boolean z10 = childAt instanceof org.telegram.ui.Cells.i8;
                    ImageReceiver imageReceiver = this.A;
                    if (z10) {
                        if (((org.telegram.ui.Cells.i8) childAt).f24241a.hasNotThumb()) {
                            imageReceiver.setRoundRadius(0);
                            i10 = 0;
                        }
                        i10 = -1;
                    } else if (childAt instanceof org.telegram.ui.Cells.g8) {
                        if (((org.telegram.ui.Cells.g8) childAt).f24163a.getImageReceiver().getBitmap() != null) {
                            imageReceiver.setRoundRadius(0);
                            i10 = 0;
                        }
                        i10 = -1;
                    } else {
                        i10 = 2;
                        if (childAt instanceof org.telegram.ui.Cells.d2) {
                            org.telegram.ui.Cells.d2 d2Var = (org.telegram.ui.Cells.d2) childAt;
                            if (d2Var.f23980a.getBitmap() != null) {
                                int i12 = d2Var.O;
                                if (i12 == 6) {
                                    imageReceiver.setRoundRadius(0);
                                    i10 = 0;
                                } else if (i12 == 2 && d2Var.f23994s) {
                                    imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
                                    i10 = 1;
                                }
                            }
                            i10 = -1;
                        } else if (childAt instanceof org.telegram.ui.Components.rv) {
                            imageReceiver.setRoundRadius(0);
                        } else if ((childAt instanceof org.telegram.ui.Components.bz) && ((org.telegram.ui.Components.bz) childAt).getSpan() != null) {
                            imageReceiver.setRoundRadius(0);
                        } else {
                            if ((childAt instanceof org.telegram.ui.Components.sz0) && (((org.telegram.ui.Components.sz0) childAt).f32793b instanceof org.telegram.ui.Components.t5)) {
                                imageReceiver.setRoundRadius(0);
                            }
                            i10 = -1;
                        }
                    }
                    if (i10 != -1) {
                        this.f39443a = x9;
                        this.f39445b = y3;
                        this.h = childAt;
                        org.telegram.ui.Components.zr0 zr0Var = new org.telegram.ui.Components.zr0(this, mm0Var, i10, u6Var, 6);
                        this.f39454j = zr0Var;
                        AndroidUtilities.runOnUIThread(zr0Var, 200L);
                        return true;
                    }
                } else {
                    i11++;
                }
            }
        }
        return false;
    }

    public final boolean q(android.view.MotionEvent r17, org.telegram.ui.Components.mm0 r18, java.lang.Object r19, org.telegram.ui.dt r20, org.telegram.ui.ActionBar.u6 r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ft.q(android.view.MotionEvent, org.telegram.ui.Components.mm0, java.lang.Object, org.telegram.ui.dt, org.telegram.ui.ActionBar.u6):boolean");
    }

    public final void r(TLRPC.Document document, SendMessagesHelper.ImportingSticker importingSticker, String str, String str2, TLRPC.BotInlineResult botInlineResult, int i10, boolean z10, Object obj, org.telegram.ui.ActionBar.u6 u6Var, int i11) {
        int i12;
        ImageReceiver imageReceiver;
        String str3;
        String str4;
        boolean z11;
        long j10;
        TLRPC.InputStickerSet inputStickerSet;
        ImageReceiver imageReceiver2;
        long j11;
        CharSequence charSequence;
        String str5;
        int i13;
        String str6;
        ImageReceiver imageReceiver3;
        bt btVar;
        if (this.f39466w != null && this.f39468y != null) {
            this.f39448c0 = u6Var;
            this.f39460p = z10;
            this.G = null;
            if (AndroidUtilities.isDarkColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23354d6, u6Var))) {
                i12 = 1895825408;
            } else {
                i12 = 1692853990;
            }
            this.f39465u.setColor(i12);
            this.S = false;
            ImageReceiver imageReceiver4 = this.A;
            imageReceiver4.setColorFilter(null);
            ImageReceiver imageReceiver5 = this.B;
            bt btVar2 = this.U;
            if (i10 == 0 || i10 == 2 || i10 == 3) {
                ImageReceiver imageReceiver6 = imageReceiver5;
                if (document != null || importingSticker != null) {
                    if (f39441f0 == null) {
                        TextPaint textPaint = new TextPaint(1);
                        f39441f0 = textPaint;
                        textPaint.setTextSize(AndroidUtilities.dp(24.0f));
                    }
                    imageReceiver6.clearImage();
                    this.S = false;
                    if (document != null) {
                        int i14 = 0;
                        while (true) {
                            if (i14 < document.attributes.size()) {
                                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i14);
                                imageReceiver = imageReceiver6;
                                if ((documentAttribute instanceof TLRPC.TL_documentAttributeSticker) && (inputStickerSet = documentAttribute.stickerset) != null) {
                                    break;
                                }
                                i14++;
                                imageReceiver6 = imageReceiver;
                            } else {
                                imageReceiver = imageReceiver6;
                                inputStickerSet = null;
                                break;
                            }
                        }
                        if (str != null) {
                            imageReceiver2 = imageReceiver4;
                            this.G = new StaticLayout(AndroidUtilities.replaceCharSequence("…", TextUtils.ellipsize(Emoji.replaceEmoji(str, f39441f0.getFontMetricsInt(), false), f39441f0, AndroidUtilities.dp(200.0f), TextUtils.TruncateAt.END), ""), f39441f0, AndroidUtilities.dp(200.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                        } else {
                            imageReceiver2 = imageReceiver4;
                        }
                        if (inputStickerSet != null || i10 == 2) {
                            AndroidUtilities.cancelRunOnUIThread(btVar2);
                            if (i11 > 0) {
                                j11 = i11;
                            } else {
                                j11 = 1300;
                            }
                            AndroidUtilities.runOnUIThread(btVar2, j11);
                        }
                        TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(this.f39462r).getStickerSet(inputStickerSet, true);
                        if (stickerSet != null && stickerSet.documents.isEmpty()) {
                            inputStickerSet = null;
                        }
                        this.f39444a0 = inputStickerSet;
                        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                        if (MessageObject.isVideoStickerDocument(document)) {
                            charSequence = "";
                            str5 = "…";
                            imageReceiver4 = imageReceiver2;
                            imageReceiver4.setImage(ImageLocation.getForDocument(document), null, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), null, null, 0L, "webp", this.f39444a0, 1);
                        } else {
                            charSequence = "";
                            str5 = "…";
                            imageReceiver4 = imageReceiver2;
                            imageReceiver4.setImage(ImageLocation.getForDocument(document), (String) null, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), (String) null, "webp", this.f39444a0, 1);
                            if (MessageObject.isPremiumSticker(document)) {
                                this.S = true;
                                imageReceiver.setImage(ImageLocation.getForDocument(MessageObject.getPremiumStickerAnimation(document), document), (String) null, (ImageLocation) null, (String) null, "tgs", this.f39444a0, 1);
                            }
                        }
                        if (MessageObject.isTextColorEmoji(document)) {
                            imageReceiver4.setColorFilter(org.telegram.ui.ActionBar.y6.o0(u6Var));
                        }
                        if (this.G == null) {
                            int i15 = 0;
                            while (true) {
                                if (i15 >= document.attributes.size()) {
                                    break;
                                }
                                TLRPC.DocumentAttribute documentAttribute2 = document.attributes.get(i15);
                                if ((documentAttribute2 instanceof TLRPC.TL_documentAttributeSticker) && !TextUtils.isEmpty(documentAttribute2.alt)) {
                                    this.G = new StaticLayout(AndroidUtilities.replaceCharSequence(str5, TextUtils.ellipsize(Emoji.replaceEmoji(documentAttribute2.alt, f39441f0.getFontMetricsInt(), false), f39441f0, AndroidUtilities.dp(200.0f), TextUtils.TruncateAt.END), charSequence), f39441f0, AndroidUtilities.dp(200.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                                    break;
                                }
                                i15++;
                            }
                        }
                    } else {
                        imageReceiver = imageReceiver6;
                        if (importingSticker != null) {
                            String str7 = importingSticker.path;
                            if (importingSticker.animated) {
                                str3 = "tgs";
                            } else {
                                str3 = null;
                            }
                            str4 = "window";
                            imageReceiver4.setImage(str7, null, null, str3, 0L);
                            if (importingSticker.videoEditedInfo != null) {
                                if (this.C == null) {
                                    org.telegram.ui.Components.yd0 yd0Var = new org.telegram.ui.Components.yd0(this.f39469z.getContext());
                                    this.C = yd0Var;
                                    this.f39469z.addView(yd0Var, new FrameLayout.LayoutParams(512, 512));
                                }
                                z11 = false;
                                this.C.b(importingSticker.videoEditedInfo.mediaEntities, true, true, false);
                            } else {
                                z11 = false;
                            }
                            if (str != null) {
                                this.G = new StaticLayout(AndroidUtilities.replaceCharSequence("…", TextUtils.ellipsize(Emoji.replaceEmoji(str, f39441f0.getFontMetricsInt(), z11), f39441f0, AndroidUtilities.dp(200.0f), TextUtils.TruncateAt.END), ""), f39441f0, AndroidUtilities.dp(200.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                            }
                            this.f39456l.getClass();
                            AndroidUtilities.cancelRunOnUIThread(btVar2);
                            if (i11 > 0) {
                                j10 = i11;
                            } else {
                                j10 = 1300;
                            }
                            AndroidUtilities.runOnUIThread(btVar2, j10);
                        }
                    }
                    str4 = "window";
                } else {
                    return;
                }
            } else {
                if (document != null) {
                    TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                    TLRPC.VideoSize documentVideoThumb = MessageObject.getDocumentVideoThumb(document);
                    ImageLocation forDocument = ImageLocation.getForDocument(document);
                    forDocument.imageType = 2;
                    if (documentVideoThumb != null) {
                        imageReceiver3 = imageReceiver5;
                        btVar = btVar2;
                        imageReceiver4.setImage(forDocument, null, ImageLocation.getForDocument(documentVideoThumb, document), null, ImageLocation.getForDocument(closestPhotoSizeWithSize2, document), "90_90_b", null, document.size, null, "gif" + document, 0);
                    } else {
                        imageReceiver3 = imageReceiver5;
                        btVar = btVar2;
                        imageReceiver4 = imageReceiver4;
                        imageReceiver4.setImage(forDocument, null, ImageLocation.getForDocument(closestPhotoSizeWithSize2, document), "90_90_b", document.size, null, "gif" + document, 0);
                    }
                } else {
                    imageReceiver3 = imageReceiver5;
                    btVar = btVar2;
                    if (botInlineResult != null && botInlineResult.content != null) {
                        TLRPC.WebDocument webDocument = botInlineResult.thumb;
                        if ((webDocument instanceof TLRPC.TL_webDocument) && "video/mp4".equals(webDocument.mime_type)) {
                            imageReceiver4 = imageReceiver4;
                            imageReceiver4.setImage(ImageLocation.getForWebFile(WebFile.createWithWebDocument(botInlineResult.content)), null, ImageLocation.getForWebFile(WebFile.createWithWebDocument(botInlineResult.thumb)), null, ImageLocation.getForWebFile(WebFile.createWithWebDocument(botInlineResult.thumb)), "90_90_b", null, botInlineResult.content.size, null, "gif" + botInlineResult, 1);
                        } else {
                            imageReceiver4 = imageReceiver4;
                            imageReceiver4.setImage(ImageLocation.getForWebFile(WebFile.createWithWebDocument(botInlineResult.content)), null, ImageLocation.getForWebFile(WebFile.createWithWebDocument(botInlineResult.thumb)), "90_90_b", botInlineResult.content.size, null, "gif" + botInlineResult, 1);
                        }
                    } else {
                        return;
                    }
                }
                AndroidUtilities.cancelRunOnUIThread(btVar);
                AndroidUtilities.runOnUIThread(btVar, 2000L);
                str4 = "window";
                imageReceiver = imageReceiver3;
            }
            if (imageReceiver4.getLottieAnimation() != null) {
                i13 = 0;
                imageReceiver4.getLottieAnimation().M(0);
            } else {
                i13 = 0;
            }
            if (this.S && imageReceiver.getLottieAnimation() != null) {
                imageReceiver.getLottieAnimation().M(i13);
            }
            this.V = i10;
            this.W = document;
            this.X = importingSticker;
            this.Y = str2;
            this.Z = botInlineResult;
            this.f39446b0 = obj;
            this.f39448c0 = u6Var;
            this.f39469z.invalidate();
            if (!this.E) {
                AndroidUtilities.lockOrientation(this.f39466w);
                try {
                    if (this.f39468y.getParent() != null) {
                        str6 = str4;
                        try {
                            ((WindowManager) this.f39466w.getSystemService(str6)).removeView(this.f39468y);
                        } catch (Exception e) {
                            e = e;
                            FileLog.e(e);
                            ((WindowManager) this.f39466w.getSystemService(str6)).addView(this.f39468y, this.f39467x);
                            this.E = true;
                            this.F = 0.0f;
                            this.f39447c = -10000.0f;
                            this.f39452g = 0.0f;
                            this.d = 0.0f;
                            this.e = 0.0f;
                            this.H = System.currentTimeMillis();
                            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 8);
                        }
                    } else {
                        str6 = str4;
                    }
                } catch (Exception e10) {
                    e = e10;
                    str6 = str4;
                }
                ((WindowManager) this.f39466w.getSystemService(str6)).addView(this.f39468y, this.f39467x);
                this.E = true;
                this.F = 0.0f;
                this.f39447c = -10000.0f;
                this.f39452g = 0.0f;
                this.d = 0.0f;
                this.e = 0.0f;
                this.H = System.currentTimeMillis();
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 8);
            }
        }
    }

    public final void s() {
        org.telegram.ui.Components.zr0 zr0Var = this.f39454j;
        if (zr0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(zr0Var);
            this.f39454j = null;
        }
        View view = this.h;
        if (view != null) {
            if (view instanceof org.telegram.ui.Cells.i8) {
                ((org.telegram.ui.Cells.i8) view).setScaled(false);
            } else if (view instanceof org.telegram.ui.Cells.g8) {
                ((org.telegram.ui.Cells.g8) view).setScaled(false);
            } else if (view instanceof org.telegram.ui.Cells.d2) {
                ((org.telegram.ui.Cells.d2) view).setScaled(false);
            }
            this.h = null;
        }
    }

    public final void t(dt dtVar) {
        this.f39456l = dtVar;
        if (dtVar != null) {
            this.f39457m = dtVar.k();
            this.f39458n = this.f39456l.p();
        }
    }

    public final void u(Activity activity) {
        int i10 = UserConfig.selectedAccount;
        this.f39462r = i10;
        ImageReceiver imageReceiver = this.A;
        imageReceiver.setCurrentAccount(i10);
        imageReceiver.setLayerNum(Integer.MAX_VALUE);
        int i11 = this.f39462r;
        ImageReceiver imageReceiver2 = this.B;
        imageReceiver2.setCurrentAccount(i11);
        imageReceiver2.setLayerNum(Integer.MAX_VALUE);
        if (this.f39466w == activity) {
            return;
        }
        this.f39466w = activity;
        this.J = activity.getResources().getDrawable(R.drawable.preview_arrow);
        this.f39468y = new k0(this, activity, 6);
        jh.k kVar = new jh.k(this.f39468y);
        k0 k0Var = this.f39468y;
        ch.b bVar = this.f39464t;
        bVar.f6301f = kVar;
        bVar.f6302g = k0Var;
        bVar.e = new se.b();
        this.f39468y.setFocusable(true);
        this.f39468y.setFocusableInTouchMode(true);
        this.f39468y.setSystemUiVisibility(1792);
        k0 k0Var2 = this.f39468y;
        ts tsVar = new ts(this);
        WeakHashMap weakHashMap = r0.i0.f47105a;
        r0.a0.i(k0Var2, tsVar);
        bh.p pVar = new bh.p(this, activity);
        this.f39469z = pVar;
        pVar.setFocusable(false);
        this.f39468y.addView(this.f39469z, org.telegram.ui.Components.gb1.i(-1, -1, 51));
        this.f39469z.setOnTouchListener(new d0(this, 1));
        MessagesController.getInstance(this.f39462r);
        this.I = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f39467x = layoutParams;
        layoutParams.height = -1;
        layoutParams.format = -3;
        layoutParams.width = -1;
        layoutParams.gravity = 48;
        layoutParams.type = 99;
        layoutParams.flags = -2147286784;
        AndroidUtilities.applyEdgeToEdgeLayoutParams(layoutParams);
        imageReceiver.setAspectFit(true);
        imageReceiver.setInvalidateAll(true);
        imageReceiver.setParentView(this.f39469z);
        imageReceiver2.setAspectFit(true);
        imageReceiver2.setInvalidateAll(true);
        imageReceiver2.setParentView(this.f39469z);
    }

    public final void v() {
        this.T = null;
    }

    public final boolean w(View view) {
        if (!(view instanceof org.telegram.ui.Cells.i8)) {
            return false;
        }
        Activity findActivity = AndroidUtilities.findActivity(view.getContext());
        if (findActivity == null) {
            return true;
        }
        u(findActivity);
        org.telegram.ui.Cells.i8 i8Var = (org.telegram.ui.Cells.i8) view;
        View view2 = this.h;
        if (view2 instanceof org.telegram.ui.Cells.i8) {
            ((org.telegram.ui.Cells.i8) view2).setScaled(false);
        } else if (view2 instanceof org.telegram.ui.Cells.g8) {
            ((org.telegram.ui.Cells.g8) view2).setScaled(false);
        } else if (view2 instanceof org.telegram.ui.Cells.d2) {
            ((org.telegram.ui.Cells.d2) view2).setScaled(false);
        }
        this.h = i8Var;
        TLRPC.Document sticker = i8Var.getSticker();
        SendMessagesHelper.ImportingSticker stickerPath = i8Var.getStickerPath();
        String str = null;
        String findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(i8Var.getSticker(), null, Integer.valueOf(this.f39462r));
        dt dtVar = this.f39456l;
        if (dtVar != null) {
            str = dtVar.F(false);
        }
        r(sticker, stickerPath, findAnimatedEmojiEmoticon, str, null, 0, i8Var.f24250y, i8Var.getParentObject(), this.f39448c0, 0);
        bt btVar = this.U;
        AndroidUtilities.cancelRunOnUIThread(btVar);
        AndroidUtilities.runOnUIThread(btVar, 16L);
        i8Var.setScaled(true);
        return true;
    }
}
