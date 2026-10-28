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
public final class ht {
    public static TextPaint f39959f0;
    public static volatile ht f39960g0;
    public final ImageReceiver A;
    public final ImageReceiver B;
    public org.telegram.ui.Components.zd0 C;
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
    public gg1 O;
    public org.telegram.ui.Components.zb P;
    public FrameLayout Q;
    public boolean R;
    public boolean S;
    public TLRPC.TL_messages_stickerSet T;
    public final dt U;
    public int V;
    public TLRPC.Document W;
    public SendMessagesHelper.ImportingSticker X;
    public String Y;
    public TLRPC.BotInlineResult Z;
    public int f39961a;
    public TLRPC.InputStickerSet f39962a0;
    public int f39963b;
    public Object f39964b0;
    public float f39965c;
    public org.telegram.ui.ActionBar.u6 f39966c0;
    public float d;
    public VibrationEffect f39967d0;
    public boolean f39968e0;
    public float f39969f;
    public float f39970g;
    public View h;
    public boolean f39971i;
    public org.telegram.ui.Components.as0 f39972j;
    public org.telegram.ui.ActionBar.o1 f39973k;
    public ft f39974l;
    public boolean f39975m;
    public boolean f39976n;
    public ArrayList f39977o;
    public boolean f39978p;
    public int f39980r;
    public final hh.b f39981s;
    public final ch.b f39982t;
    public final ColorDrawable f39983u;
    public Bitmap v;
    public Activity f39984w;
    public WindowManager.LayoutParams f39985x;
    public k0 f39986y;
    public bh.p f39987z;
    public float e = 0.0f;
    public i0.b f39979q = i0.b.e;

    public ht() {
        hh.b bVar = new hh.b();
        this.f39981s = bVar;
        this.f39982t = new ch.b(bVar);
        this.f39983u = new ColorDrawable(1895825408);
        this.A = new ImageReceiver();
        this.B = new ImageReceiver();
        this.E = false;
        this.I = AndroidUtilities.dp(200.0f);
        this.N = new Paint(1);
        this.U = new dt(this);
    }

    public static void a(ht htVar, Bitmap bitmap, Bitmap bitmap2) {
        hh.b bVar = htVar.f39981s;
        Paint paint = htVar.N;
        htVar.A.setVisible(true, false);
        htVar.v = bitmap;
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
        ih.d.c(bVar, htVar.f39986y);
        htVar.f39982t.d();
        htVar.f39968e0 = false;
        bh.p pVar = htVar.f39987z;
        if (pVar != null) {
            pVar.invalidate();
        }
    }

    public static boolean f(ht htVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        boolean z10;
        boolean z11;
        boolean z12;
        float f7;
        boolean z13;
        float f10;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2;
        sh.q qVar;
        org.telegram.ui.ActionBar.r2 r2Var;
        ft ftVar = htVar.f39974l;
        if (ftVar == null) {
            return false;
        }
        TLRPC.TL_messageMediaPoll d = ftVar.d();
        TLRPC.PollAnswer g7 = htVar.f39974l.g();
        if (d == null || d.poll == null || g7 == null) {
            return false;
        }
        TLRPC.PollAnswerVoters pollResult = MessageObject.getPollResult(d, g7.option);
        if (pollResult != null && pollResult.voters > 0 && MessageObject.canShowVotersList(d)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!MessageObject.isVoted(d) && !d.poll.closed && !htVar.f39974l.c()) {
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
            sh.q qVar2 = new sh.q(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext(), htVar.f39980r, htVar.f39966c0);
            org.telegram.ui.Components.l80 l80Var = new org.telegram.ui.Components.l80(actionBarPopupWindow$ActionBarPopupWindowLayout, htVar.f39966c0);
            int b10 = actionBarPopupWindow$ActionBarPopupWindowLayout.b(l80Var.B);
            int i10 = org.telegram.ui.ActionBar.y6.E8;
            l80Var.T(org.telegram.ui.ActionBar.y6.o1(0.06f, org.telegram.ui.ActionBar.y6.w0(i10, htVar.f39966c0)));
            ch.b bVar = htVar.f39982t;
            fh.e k10 = gh.c.k(htVar.f39966c0);
            View view = l80Var.B;
            if (view != null) {
                eh.d c10 = bVar.c(view, null, true);
                c10.v(k10);
                view.setBackground(c10);
            }
            z13 = true;
            l80Var.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new xi(actionBarPopupWindow$ActionBarPopupWindowLayout, 15), false);
            l80Var.k();
            MessageObject z14 = htVar.f39974l.z();
            Activity activity = htVar.f39984w;
            if ((activity instanceof LaunchActivity) && z14 != null) {
                LaunchActivity launchActivity = (LaunchActivity) activity;
                if (launchActivity.O() != null && launchActivity.O().getLastFragment() != null) {
                    r2Var = launchActivity.O().getLastFragment();
                } else {
                    r2Var = null;
                }
                if (r2Var != null) {
                    org.telegram.ui.Components.s71 a2 = qVar2.a(r2Var, z14.getDialogId(), z14.getId(), g7.option, pollResult.voters, new org.telegram.ui.Components.oy(8, htVar, r2Var));
                    qVar = qVar2;
                    l80Var.q(a2);
                    qVar.setText(LocaleController.formatPluralString("PollVotesCount", pollResult.voters, new Object[0]));
                    qVar.f48704a.d(pollResult.recent_voters, false);
                    qVar.setLayoutParams(org.telegram.ui.Components.kb1.r(-1, 48));
                    int i11 = org.telegram.ui.ActionBar.y6.I5;
                    org.telegram.ui.Cells.y Z = org.telegram.ui.ActionBar.y6.Z(org.telegram.ui.ActionBar.y6.w0(i11, htVar.f39966c0), 12, 0);
                    org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i11);
                    org.telegram.ui.ActionBar.u6 u6Var = htVar.f39966c0;
                    qVar.setBackground(Z);
                    org.telegram.ui.ActionBar.f7.k(qVar, Z, null, N, u6Var);
                    qVar.setOnClickListener(new ai.w(actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 23));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(qVar);
                    View l1Var = new org.telegram.ui.ActionBar.l1(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext(), htVar.f39966c0);
                    l1Var.setTag(R.id.fit_width_tag, 1);
                    f7 = 0.06f;
                    org.telegram.ui.ActionBar.f7.j(l1Var, org.telegram.ui.ActionBar.f7.L(0.06f, i10), htVar.f39966c0);
                    l1Var.setLayoutParams(org.telegram.ui.Components.kb1.r(-1, 8));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(l1Var);
                }
            }
            qVar = qVar2;
            qVar.setText(LocaleController.formatPluralString("PollVotesCount", pollResult.voters, new Object[0]));
            qVar.f48704a.d(pollResult.recent_voters, false);
            qVar.setLayoutParams(org.telegram.ui.Components.kb1.r(-1, 48));
            int i112 = org.telegram.ui.ActionBar.y6.I5;
            org.telegram.ui.Cells.y Z2 = org.telegram.ui.ActionBar.y6.Z(org.telegram.ui.ActionBar.y6.w0(i112, htVar.f39966c0), 12, 0);
            org.telegram.ui.ActionBar.b7 N2 = org.telegram.ui.ActionBar.f7.N(i112);
            org.telegram.ui.ActionBar.u6 u6Var2 = htVar.f39966c0;
            qVar.setBackground(Z2);
            org.telegram.ui.ActionBar.f7.k(qVar, Z2, null, N2, u6Var2);
            qVar.setOnClickListener(new ai.w(actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 23));
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(qVar);
            View l1Var2 = new org.telegram.ui.ActionBar.l1(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext(), htVar.f39966c0);
            l1Var2.setTag(R.id.fit_width_tag, 1);
            f7 = 0.06f;
            org.telegram.ui.ActionBar.f7.j(l1Var2, org.telegram.ui.ActionBar.f7.L(0.06f, i10), htVar.f39966c0);
            l1Var2.setLayoutParams(org.telegram.ui.Components.kb1.r(-1, 8));
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(l1Var2);
        } else {
            f7 = 0.06f;
            z13 = true;
        }
        if (z11) {
            f10 = f7;
            org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_select, LocaleController.getString(R.string.PollSubmitVotesNoCaps), false, htVar.f39966c0).setOnClickListener(new ws(htVar, 2));
        } else {
            f10 = f7;
        }
        if (z12) {
            actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_unvote, LocaleController.getString(R.string.Unvote), false, htVar.f39966c0).setOnClickListener(new ws(htVar, 3));
        } else {
            actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
        }
        if (!z10 && (z11 || z12)) {
            View l1Var3 = new org.telegram.ui.ActionBar.l1(actionBarPopupWindow$ActionBarPopupWindowLayout2.getContext(), htVar.f39966c0);
            l1Var3.setTag(R.id.fit_width_tag, 1);
            org.telegram.ui.ActionBar.f7.j(l1Var3, org.telegram.ui.ActionBar.f7.L(f10, org.telegram.ui.ActionBar.y6.E8), htVar.f39966c0);
            l1Var3.setLayoutParams(org.telegram.ui.Components.kb1.r(-1, 8));
            actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(l1Var3);
        }
        if (!z10 && !z11 && !z12) {
            return false;
        }
        return z13;
    }

    public static ht o() {
        ht htVar;
        ht htVar2 = f39960g0;
        if (htVar2 == null) {
            synchronized (PhotoViewer.class) {
                try {
                    htVar = f39960g0;
                    if (htVar == null) {
                        htVar = new ht();
                        f39960g0 = htVar;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return htVar;
        }
        return htVar2;
    }

    public final void l() {
        if (this.f39984w != null && !this.K) {
            AndroidUtilities.cancelRunOnUIThread(this.U);
            this.F = 1.0f;
            this.H = System.currentTimeMillis();
            this.f39987z.invalidate();
            this.W = null;
            this.f39962a0 = null;
            this.Y = null;
            this.f39974l = null;
            this.E = false;
            AndroidUtilities.runOnUIThread(new us(this, 0), 200L);
            gg1 gg1Var = this.O;
            if (gg1Var != null) {
                gg1Var.animate().alpha(0.0f).translationY(AndroidUtilities.dp(56.0f)).setDuration(150L).setInterpolator(org.telegram.ui.Components.ds.f27530f).start();
            }
            FrameLayout frameLayout = this.Q;
            if (frameLayout != null) {
                frameLayout.animate().alpha(0.0f).setDuration(150L).scaleX(0.6f).scaleY(0.6f).setInterpolator(org.telegram.ui.Components.ds.f27530f).start();
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
        org.telegram.ui.ActionBar.o1 o1Var = this.f39973k;
        if (o1Var != null) {
            o1Var.dismiss();
            this.f39973k = null;
            return;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.L;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            org.telegram.messenger.wh.q(actionBarPopupWindow$ActionBarPopupWindowLayout.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).translationY(AndroidUtilities.dp(-12.0f)), org.telegram.ui.Components.ds.h, 320L);
            this.L = null;
            this.K = false;
            if (this.R) {
                l();
            }
        }
    }

    public final boolean p(MotionEvent motionEvent, org.telegram.ui.Components.nm0 nm0Var, ft ftVar, org.telegram.ui.ActionBar.u6 u6Var) {
        int i10;
        this.f39974l = ftVar;
        if (ftVar != null) {
            this.f39975m = ftVar.k();
            this.f39976n = this.f39974l.p();
        }
        ft ftVar2 = this.f39974l;
        if ((ftVar2 == null || ftVar2.h()) && motionEvent.getAction() == 0) {
            int x9 = (int) motionEvent.getX();
            int y3 = (int) motionEvent.getY();
            int childCount = nm0Var.getChildCount();
            int i11 = 0;
            while (true) {
                if (i11 >= childCount) {
                    break;
                }
                View childAt = nm0Var.getChildAt(i11);
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
                        if (((org.telegram.ui.Cells.i8) childAt).f24245a.hasNotThumb()) {
                            imageReceiver.setRoundRadius(0);
                            i10 = 0;
                        }
                        i10 = -1;
                    } else if (childAt instanceof org.telegram.ui.Cells.g8) {
                        if (((org.telegram.ui.Cells.g8) childAt).f24167a.getImageReceiver().getBitmap() != null) {
                            imageReceiver.setRoundRadius(0);
                            i10 = 0;
                        }
                        i10 = -1;
                    } else {
                        i10 = 2;
                        if (childAt instanceof org.telegram.ui.Cells.d2) {
                            org.telegram.ui.Cells.d2 d2Var = (org.telegram.ui.Cells.d2) childAt;
                            if (d2Var.f23983a.getBitmap() != null) {
                                int i12 = d2Var.P;
                                if (i12 == 6) {
                                    imageReceiver.setRoundRadius(0);
                                    i10 = 0;
                                } else if (i12 == 2 && d2Var.v) {
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
                            if ((childAt instanceof org.telegram.ui.Components.tz0) && (((org.telegram.ui.Components.tz0) childAt).f33171b instanceof org.telegram.ui.Components.t5)) {
                                imageReceiver.setRoundRadius(0);
                            }
                            i10 = -1;
                        }
                    }
                    if (i10 != -1) {
                        this.f39961a = x9;
                        this.f39963b = y3;
                        this.h = childAt;
                        org.telegram.ui.Components.as0 as0Var = new org.telegram.ui.Components.as0(this, nm0Var, i10, u6Var, 6);
                        this.f39972j = as0Var;
                        AndroidUtilities.runOnUIThread(as0Var, 200L);
                        return true;
                    }
                } else {
                    i11++;
                }
            }
        }
        return false;
    }

    public final boolean q(android.view.MotionEvent r17, org.telegram.ui.Components.nm0 r18, java.lang.Object r19, org.telegram.ui.ft r20, org.telegram.ui.ActionBar.u6 r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ht.q(android.view.MotionEvent, org.telegram.ui.Components.nm0, java.lang.Object, org.telegram.ui.ft, org.telegram.ui.ActionBar.u6):boolean");
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
        dt dtVar;
        if (this.f39984w != null && this.f39986y != null) {
            this.f39966c0 = u6Var;
            this.f39978p = z10;
            this.G = null;
            if (AndroidUtilities.isDarkColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23357d6, u6Var))) {
                i12 = 1895825408;
            } else {
                i12 = 1692853990;
            }
            this.f39983u.setColor(i12);
            this.S = false;
            ImageReceiver imageReceiver4 = this.A;
            imageReceiver4.setColorFilter(null);
            ImageReceiver imageReceiver5 = this.B;
            dt dtVar2 = this.U;
            if (i10 == 0 || i10 == 2 || i10 == 3) {
                ImageReceiver imageReceiver6 = imageReceiver5;
                if (document != null || importingSticker != null) {
                    if (f39959f0 == null) {
                        TextPaint textPaint = new TextPaint(1);
                        f39959f0 = textPaint;
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
                            this.G = new StaticLayout(AndroidUtilities.replaceCharSequence("…", TextUtils.ellipsize(Emoji.replaceEmoji(str, f39959f0.getFontMetricsInt(), false), f39959f0, AndroidUtilities.dp(200.0f), TextUtils.TruncateAt.END), ""), f39959f0, AndroidUtilities.dp(200.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                        } else {
                            imageReceiver2 = imageReceiver4;
                        }
                        if (inputStickerSet != null || i10 == 2) {
                            AndroidUtilities.cancelRunOnUIThread(dtVar2);
                            if (i11 > 0) {
                                j11 = i11;
                            } else {
                                j11 = 1300;
                            }
                            AndroidUtilities.runOnUIThread(dtVar2, j11);
                        }
                        TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(this.f39980r).getStickerSet(inputStickerSet, true);
                        if (stickerSet != null && stickerSet.documents.isEmpty()) {
                            inputStickerSet = null;
                        }
                        this.f39962a0 = inputStickerSet;
                        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                        if (MessageObject.isVideoStickerDocument(document)) {
                            charSequence = "";
                            str5 = "…";
                            imageReceiver4 = imageReceiver2;
                            imageReceiver4.setImage(ImageLocation.getForDocument(document), null, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), null, null, 0L, "webp", this.f39962a0, 1);
                        } else {
                            charSequence = "";
                            str5 = "…";
                            imageReceiver4 = imageReceiver2;
                            imageReceiver4.setImage(ImageLocation.getForDocument(document), (String) null, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), (String) null, "webp", this.f39962a0, 1);
                            if (MessageObject.isPremiumSticker(document)) {
                                this.S = true;
                                imageReceiver.setImage(ImageLocation.getForDocument(MessageObject.getPremiumStickerAnimation(document), document), (String) null, (ImageLocation) null, (String) null, "tgs", this.f39962a0, 1);
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
                                    this.G = new StaticLayout(AndroidUtilities.replaceCharSequence(str5, TextUtils.ellipsize(Emoji.replaceEmoji(documentAttribute2.alt, f39959f0.getFontMetricsInt(), false), f39959f0, AndroidUtilities.dp(200.0f), TextUtils.TruncateAt.END), charSequence), f39959f0, AndroidUtilities.dp(200.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
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
                                    org.telegram.ui.Components.zd0 zd0Var = new org.telegram.ui.Components.zd0(this.f39987z.getContext());
                                    this.C = zd0Var;
                                    this.f39987z.addView(zd0Var, new FrameLayout.LayoutParams(512, 512));
                                }
                                z11 = false;
                                this.C.b(importingSticker.videoEditedInfo.mediaEntities, true, true, false);
                            } else {
                                z11 = false;
                            }
                            if (str != null) {
                                this.G = new StaticLayout(AndroidUtilities.replaceCharSequence("…", TextUtils.ellipsize(Emoji.replaceEmoji(str, f39959f0.getFontMetricsInt(), z11), f39959f0, AndroidUtilities.dp(200.0f), TextUtils.TruncateAt.END), ""), f39959f0, AndroidUtilities.dp(200.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                            }
                            this.f39974l.getClass();
                            AndroidUtilities.cancelRunOnUIThread(dtVar2);
                            if (i11 > 0) {
                                j10 = i11;
                            } else {
                                j10 = 1300;
                            }
                            AndroidUtilities.runOnUIThread(dtVar2, j10);
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
                        dtVar = dtVar2;
                        imageReceiver4.setImage(forDocument, null, ImageLocation.getForDocument(documentVideoThumb, document), null, ImageLocation.getForDocument(closestPhotoSizeWithSize2, document), "90_90_b", null, document.size, null, "gif" + document, 0);
                    } else {
                        imageReceiver3 = imageReceiver5;
                        dtVar = dtVar2;
                        imageReceiver4 = imageReceiver4;
                        imageReceiver4.setImage(forDocument, null, ImageLocation.getForDocument(closestPhotoSizeWithSize2, document), "90_90_b", document.size, null, "gif" + document, 0);
                    }
                } else {
                    imageReceiver3 = imageReceiver5;
                    dtVar = dtVar2;
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
                AndroidUtilities.cancelRunOnUIThread(dtVar);
                AndroidUtilities.runOnUIThread(dtVar, 2000L);
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
            this.f39964b0 = obj;
            this.f39966c0 = u6Var;
            this.f39987z.invalidate();
            if (!this.E) {
                AndroidUtilities.lockOrientation(this.f39984w);
                try {
                    if (this.f39986y.getParent() != null) {
                        str6 = str4;
                        try {
                            ((WindowManager) this.f39984w.getSystemService(str6)).removeView(this.f39986y);
                        } catch (Exception e) {
                            e = e;
                            FileLog.e(e);
                            ((WindowManager) this.f39984w.getSystemService(str6)).addView(this.f39986y, this.f39985x);
                            this.E = true;
                            this.F = 0.0f;
                            this.f39965c = -10000.0f;
                            this.f39970g = 0.0f;
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
                ((WindowManager) this.f39984w.getSystemService(str6)).addView(this.f39986y, this.f39985x);
                this.E = true;
                this.F = 0.0f;
                this.f39965c = -10000.0f;
                this.f39970g = 0.0f;
                this.d = 0.0f;
                this.e = 0.0f;
                this.H = System.currentTimeMillis();
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 8);
            }
        }
    }

    public final void s() {
        org.telegram.ui.Components.as0 as0Var = this.f39972j;
        if (as0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(as0Var);
            this.f39972j = null;
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

    public final void t(ft ftVar) {
        this.f39974l = ftVar;
        if (ftVar != null) {
            this.f39975m = ftVar.k();
            this.f39976n = this.f39974l.p();
        }
    }

    public final void u(Activity activity) {
        int i10 = UserConfig.selectedAccount;
        this.f39980r = i10;
        ImageReceiver imageReceiver = this.A;
        imageReceiver.setCurrentAccount(i10);
        imageReceiver.setLayerNum(Integer.MAX_VALUE);
        int i11 = this.f39980r;
        ImageReceiver imageReceiver2 = this.B;
        imageReceiver2.setCurrentAccount(i11);
        imageReceiver2.setLayerNum(Integer.MAX_VALUE);
        if (this.f39984w == activity) {
            return;
        }
        this.f39984w = activity;
        this.J = activity.getResources().getDrawable(R.drawable.preview_arrow);
        this.f39986y = new k0(this, activity, 6);
        jh.k kVar = new jh.k(this.f39986y);
        k0 k0Var = this.f39986y;
        ch.b bVar = this.f39982t;
        bVar.f6301f = kVar;
        bVar.f6302g = k0Var;
        bVar.e = new se.b();
        this.f39986y.setFocusable(true);
        this.f39986y.setFocusableInTouchMode(true);
        this.f39986y.setSystemUiVisibility(1792);
        k0 k0Var2 = this.f39986y;
        vs vsVar = new vs(this);
        WeakHashMap weakHashMap = r0.i0.f47143a;
        r0.a0.i(k0Var2, vsVar);
        bh.p pVar = new bh.p(this, activity);
        this.f39987z = pVar;
        pVar.setFocusable(false);
        this.f39986y.addView(this.f39987z, org.telegram.ui.Components.kb1.i(-1, -1, 51));
        this.f39987z.setOnTouchListener(new d0(this, 1));
        MessagesController.getInstance(this.f39980r);
        this.I = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f39985x = layoutParams;
        layoutParams.height = -1;
        layoutParams.format = -3;
        layoutParams.width = -1;
        layoutParams.gravity = 48;
        layoutParams.type = 99;
        layoutParams.flags = -2147286784;
        AndroidUtilities.applyEdgeToEdgeLayoutParams(layoutParams);
        imageReceiver.setAspectFit(true);
        imageReceiver.setInvalidateAll(true);
        imageReceiver.setParentView(this.f39987z);
        imageReceiver2.setAspectFit(true);
        imageReceiver2.setInvalidateAll(true);
        imageReceiver2.setParentView(this.f39987z);
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
        String findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(i8Var.getSticker(), null, Integer.valueOf(this.f39980r));
        ft ftVar = this.f39974l;
        if (ftVar != null) {
            str = ftVar.F(false);
        }
        r(sticker, stickerPath, findAnimatedEmojiEmoticon, str, null, 0, i8Var.f24254y, i8Var.getParentObject(), this.f39966c0, 0);
        dt dtVar = this.U;
        AndroidUtilities.cancelRunOnUIThread(dtVar);
        AndroidUtilities.runOnUIThread(dtVar, 16L);
        i8Var.setScaled(true);
        return true;
    }
}
