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
    public static TextPaint f37981f0;
    public static volatile ht f37982g0;
    public final ImageReceiver A;
    public final ImageReceiver B;
    public org.telegram.ui.Components.ae0 C;
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
    public bg1 O;
    public org.telegram.ui.Components.xb P;
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
    public int f37983a;
    public TLRPC.InputStickerSet f37984a0;
    public int f37985b;
    public Object f37986b0;
    public float f37987c;
    public org.telegram.ui.ActionBar.g6 f37988c0;
    public float d;
    public VibrationEffect f37989d0;
    public boolean f37990e0;
    public float f37991f;
    public float f37992g;
    public View h;
    public boolean f37993i;
    public org.telegram.ui.Components.ez0 f37994j;
    public org.telegram.ui.ActionBar.m1 f37995k;
    public ft f37996l;
    public boolean f37997m;
    public boolean f37998n;
    public ArrayList f37999o;
    public boolean f38000p;
    public int f38002r;
    public final gh.b f38003s;
    public final bh.b f38004t;
    public final ColorDrawable f38005u;
    public Bitmap v;
    public Activity f38006w;
    public WindowManager.LayoutParams f38007x;
    public l0 f38008y;
    public ah.v f38009z;
    public float e = 0.0f;
    public i0.b f38001q = i0.b.e;

    public ht() {
        gh.b bVar = new gh.b();
        this.f38003s = bVar;
        this.f38004t = new bh.b(bVar);
        this.f38005u = new ColorDrawable(1895825408);
        this.A = new ImageReceiver();
        this.B = new ImageReceiver();
        this.E = false;
        this.I = AndroidUtilities.dp(200.0f);
        this.N = new Paint(1);
        this.U = new dt(this);
    }

    public static void a(ht htVar, Bitmap bitmap, Bitmap bitmap2) {
        gh.b bVar = htVar.f38003s;
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
        hh.d.c(bVar, htVar.f38008y);
        htVar.f38004t.d();
        htVar.f37990e0 = false;
        ah.v vVar = htVar.f38009z;
        if (vVar != null) {
            vVar.invalidate();
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
        rh.q qVar;
        org.telegram.ui.ActionBar.o2 o2Var;
        ft ftVar = htVar.f37996l;
        if (ftVar == null) {
            return false;
        }
        TLRPC.TL_messageMediaPoll d = ftVar.d();
        TLRPC.PollAnswer g10 = htVar.f37996l.g();
        if (d == null || d.poll == null || g10 == null) {
            return false;
        }
        TLRPC.PollAnswerVoters pollResult = MessageObject.getPollResult(d, g10.option);
        if (pollResult != null && pollResult.voters > 0 && MessageObject.canShowVotersList(d)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!MessageObject.isVoted(d) && !d.poll.closed && !htVar.f37996l.c()) {
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
            rh.q qVar2 = new rh.q(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext(), htVar.f38002r, htVar.f37988c0);
            org.telegram.ui.Components.h80 h80Var = new org.telegram.ui.Components.h80(actionBarPopupWindow$ActionBarPopupWindowLayout, htVar.f37988c0);
            int b10 = actionBarPopupWindow$ActionBarPopupWindowLayout.b(h80Var.B);
            int i10 = org.telegram.ui.ActionBar.k6.E8;
            h80Var.T(org.telegram.ui.ActionBar.k6.o1(0.06f, org.telegram.ui.ActionBar.k6.w0(i10, htVar.f37988c0)));
            bh.b bVar = htVar.f38004t;
            eh.e k10 = fh.c.k(htVar.f37988c0);
            View view = h80Var.B;
            if (view != null) {
                dh.d c10 = bVar.c(view, null, true);
                c10.o(k10);
                view.setBackground(c10);
            }
            z13 = true;
            h80Var.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new ti(actionBarPopupWindow$ActionBarPopupWindowLayout, 16), false);
            h80Var.k();
            MessageObject A = htVar.f37996l.A();
            Activity activity = htVar.f38006w;
            if ((activity instanceof LaunchActivity) && A != null) {
                LaunchActivity launchActivity = (LaunchActivity) activity;
                if (launchActivity.O() != null && launchActivity.O().getLastFragment() != null) {
                    o2Var = launchActivity.O().getLastFragment();
                } else {
                    o2Var = null;
                }
                if (o2Var != null) {
                    org.telegram.ui.Components.i71 a2 = qVar2.a(o2Var, A.getDialogId(), A.getId(), g10.option, pollResult.voters, new org.telegram.ui.Components.oy(6, htVar, o2Var));
                    qVar = qVar2;
                    h80Var.q(a2);
                    qVar.setText(LocaleController.formatPluralString("PollVotesCount", pollResult.voters, new Object[0]));
                    qVar.f46217a.d(pollResult.recent_voters, false);
                    qVar.setLayoutParams(w7.z5.n(-1, 48));
                    int i11 = org.telegram.ui.ActionBar.k6.I5;
                    org.telegram.ui.Cells.y Z = org.telegram.ui.ActionBar.k6.Z(org.telegram.ui.ActionBar.k6.w0(i11, htVar.f37988c0), 12, 0);
                    org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i11);
                    org.telegram.ui.ActionBar.g6 g6Var = htVar.f37988c0;
                    qVar.setBackground(Z);
                    org.telegram.ui.ActionBar.r6.k(qVar, Z, null, O, g6Var);
                    qVar.setOnClickListener(new ai.n1(actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 19));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(qVar);
                    View j1Var = new org.telegram.ui.ActionBar.j1(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext(), htVar.f37988c0);
                    j1Var.setTag(R.id.fit_width_tag, 1);
                    f7 = 0.06f;
                    org.telegram.ui.ActionBar.r6.j(j1Var, org.telegram.ui.ActionBar.r6.M(0.06f, i10), htVar.f37988c0);
                    j1Var.setLayoutParams(w7.z5.n(-1, 8));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(j1Var);
                }
            }
            qVar = qVar2;
            qVar.setText(LocaleController.formatPluralString("PollVotesCount", pollResult.voters, new Object[0]));
            qVar.f46217a.d(pollResult.recent_voters, false);
            qVar.setLayoutParams(w7.z5.n(-1, 48));
            int i112 = org.telegram.ui.ActionBar.k6.I5;
            org.telegram.ui.Cells.y Z2 = org.telegram.ui.ActionBar.k6.Z(org.telegram.ui.ActionBar.k6.w0(i112, htVar.f37988c0), 12, 0);
            org.telegram.ui.ActionBar.n6 O2 = org.telegram.ui.ActionBar.r6.O(i112);
            org.telegram.ui.ActionBar.g6 g6Var2 = htVar.f37988c0;
            qVar.setBackground(Z2);
            org.telegram.ui.ActionBar.r6.k(qVar, Z2, null, O2, g6Var2);
            qVar.setOnClickListener(new ai.n1(actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 19));
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(qVar);
            View j1Var2 = new org.telegram.ui.ActionBar.j1(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext(), htVar.f37988c0);
            j1Var2.setTag(R.id.fit_width_tag, 1);
            f7 = 0.06f;
            org.telegram.ui.ActionBar.r6.j(j1Var2, org.telegram.ui.ActionBar.r6.M(0.06f, i10), htVar.f37988c0);
            j1Var2.setLayoutParams(w7.z5.n(-1, 8));
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(j1Var2);
        } else {
            f7 = 0.06f;
            z13 = true;
        }
        if (z11) {
            f10 = f7;
            org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_select, LocaleController.getString(R.string.PollSubmitVotesNoCaps), false, htVar.f37988c0).setOnClickListener(new ws(htVar, 2));
        } else {
            f10 = f7;
        }
        if (z12) {
            actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_unvote, LocaleController.getString(R.string.Unvote), false, htVar.f37988c0).setOnClickListener(new ws(htVar, 3));
        } else {
            actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
        }
        if (!z10 && (z11 || z12)) {
            View j1Var3 = new org.telegram.ui.ActionBar.j1(actionBarPopupWindow$ActionBarPopupWindowLayout2.getContext(), htVar.f37988c0);
            j1Var3.setTag(R.id.fit_width_tag, 1);
            org.telegram.ui.ActionBar.r6.j(j1Var3, org.telegram.ui.ActionBar.r6.M(f10, org.telegram.ui.ActionBar.k6.E8), htVar.f37988c0);
            j1Var3.setLayoutParams(w7.z5.n(-1, 8));
            actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(j1Var3);
        }
        if (!z10 && !z11 && !z12) {
            return false;
        }
        return z13;
    }

    public static ht o() {
        ht htVar;
        ht htVar2 = f37982g0;
        if (htVar2 == null) {
            synchronized (PhotoViewer.class) {
                try {
                    htVar = f37982g0;
                    if (htVar == null) {
                        htVar = new ht();
                        f37982g0 = htVar;
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
        if (this.f38006w != null && !this.K) {
            AndroidUtilities.cancelRunOnUIThread(this.U);
            this.F = 1.0f;
            this.H = System.currentTimeMillis();
            this.f38009z.invalidate();
            this.W = null;
            this.f37984a0 = null;
            this.Y = null;
            this.f37996l = null;
            this.E = false;
            AndroidUtilities.runOnUIThread(new us(this, 0), 200L);
            bg1 bg1Var = this.O;
            if (bg1Var != null) {
                bg1Var.animate().alpha(0.0f).translationY(AndroidUtilities.dp(56.0f)).setDuration(150L).setInterpolator(org.telegram.ui.Components.zr.f33337f).start();
            }
            FrameLayout frameLayout = this.Q;
            if (frameLayout != null) {
                frameLayout.animate().alpha(0.0f).setDuration(150L).scaleX(0.6f).scaleY(0.6f).setInterpolator(org.telegram.ui.Components.zr.f33337f).start();
            }
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 8);
        }
    }

    public final void m() {
        ah.t0 reactionsWindow;
        org.telegram.ui.Components.xb xbVar = this.P;
        if (xbVar != null && (reactionsWindow = xbVar.getReactionsWindow()) != null && !reactionsWindow.f882q) {
            reactionsWindow.d();
            return;
        }
        this.K = false;
        n();
        l();
    }

    public final void n() {
        org.telegram.ui.ActionBar.m1 m1Var = this.f37995k;
        if (m1Var != null) {
            m1Var.dismiss();
            this.f37995k = null;
            return;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.L;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            org.telegram.messenger.tl.t(actionBarPopupWindow$ActionBarPopupWindowLayout.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).translationY(AndroidUtilities.dp(-12.0f)), org.telegram.ui.Components.zr.h, 320L);
            this.L = null;
            this.K = false;
            if (this.R) {
                l();
            }
        }
    }

    public final boolean p(MotionEvent motionEvent, org.telegram.ui.Components.lm0 lm0Var, ft ftVar, org.telegram.ui.ActionBar.g6 g6Var) {
        int i10;
        this.f37996l = ftVar;
        if (ftVar != null) {
            this.f37997m = ftVar.j();
            this.f37998n = this.f37996l.o();
        }
        ft ftVar2 = this.f37996l;
        if ((ftVar2 == null || ftVar2.h()) && motionEvent.getAction() == 0) {
            int x10 = (int) motionEvent.getX();
            int y3 = (int) motionEvent.getY();
            int childCount = lm0Var.getChildCount();
            int i11 = 0;
            while (true) {
                if (i11 >= childCount) {
                    break;
                }
                View childAt = lm0Var.getChildAt(i11);
                if (childAt == null) {
                    break;
                }
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                int left = childAt.getLeft();
                int right = childAt.getRight();
                if (top <= y3 && bottom >= y3 && left <= x10 && right >= x10) {
                    boolean z10 = childAt instanceof org.telegram.ui.Cells.e8;
                    ImageReceiver imageReceiver = this.A;
                    if (z10) {
                        if (((org.telegram.ui.Cells.e8) childAt).f22329a.hasNotThumb()) {
                            imageReceiver.setRoundRadius(0);
                            i10 = 0;
                        }
                        i10 = -1;
                    } else if (childAt instanceof org.telegram.ui.Cells.c8) {
                        if (((org.telegram.ui.Cells.c8) childAt).f22209a.getImageReceiver().getBitmap() != null) {
                            imageReceiver.setRoundRadius(0);
                            i10 = 0;
                        }
                        i10 = -1;
                    } else {
                        i10 = 2;
                        if (childAt instanceof org.telegram.ui.Cells.e2) {
                            org.telegram.ui.Cells.e2 e2Var = (org.telegram.ui.Cells.e2) childAt;
                            if (e2Var.f22297a.getBitmap() != null) {
                                int i12 = e2Var.O;
                                if (i12 == 6) {
                                    imageReceiver.setRoundRadius(0);
                                    i10 = 0;
                                } else if (i12 == 2 && e2Var.f22311s) {
                                    imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
                                    i10 = 1;
                                }
                            }
                            i10 = -1;
                        } else if (childAt instanceof org.telegram.ui.Components.pv) {
                            imageReceiver.setRoundRadius(0);
                        } else if ((childAt instanceof org.telegram.ui.Components.az) && ((org.telegram.ui.Components.az) childAt).getSpan() != null) {
                            imageReceiver.setRoundRadius(0);
                        } else {
                            if ((childAt instanceof org.telegram.ui.Components.jz0) && (((org.telegram.ui.Components.jz0) childAt).f27814b instanceof org.telegram.ui.Components.p5)) {
                                imageReceiver.setRoundRadius(0);
                            }
                            i10 = -1;
                        }
                    }
                    if (i10 != -1) {
                        this.f37983a = x10;
                        this.f37985b = y3;
                        this.h = childAt;
                        org.telegram.ui.Components.ez0 ez0Var = new org.telegram.ui.Components.ez0(this, lm0Var, i10, g6Var, 4);
                        this.f37994j = ez0Var;
                        AndroidUtilities.runOnUIThread(ez0Var, 200L);
                        return true;
                    }
                } else {
                    i11++;
                }
            }
        }
        return false;
    }

    public final boolean q(android.view.MotionEvent r17, org.telegram.ui.Components.lm0 r18, java.lang.Object r19, org.telegram.ui.ft r20, org.telegram.ui.ActionBar.g6 r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ht.q(android.view.MotionEvent, org.telegram.ui.Components.lm0, java.lang.Object, org.telegram.ui.ft, org.telegram.ui.ActionBar.g6):boolean");
    }

    public final void r(TLRPC.Document document, SendMessagesHelper.ImportingSticker importingSticker, String str, String str2, TLRPC.BotInlineResult botInlineResult, int i10, boolean z10, Object obj, org.telegram.ui.ActionBar.g6 g6Var, int i11) {
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
        if (this.f38006w != null && this.f38008y != null) {
            this.f37988c0 = g6Var;
            this.f38000p = z10;
            this.G = null;
            if (AndroidUtilities.isDarkColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21184d6, g6Var))) {
                i12 = 1895825408;
            } else {
                i12 = 1692853990;
            }
            this.f38005u.setColor(i12);
            this.S = false;
            ImageReceiver imageReceiver4 = this.A;
            imageReceiver4.setColorFilter(null);
            ImageReceiver imageReceiver5 = this.B;
            dt dtVar2 = this.U;
            if (i10 == 0 || i10 == 2 || i10 == 3) {
                ImageReceiver imageReceiver6 = imageReceiver5;
                if (document != null || importingSticker != null) {
                    if (f37981f0 == null) {
                        TextPaint textPaint = new TextPaint(1);
                        f37981f0 = textPaint;
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
                            this.G = new StaticLayout(AndroidUtilities.replaceCharSequence("…", TextUtils.ellipsize(Emoji.replaceEmoji(str, f37981f0.getFontMetricsInt(), false), f37981f0, AndroidUtilities.dp(200.0f), TextUtils.TruncateAt.END), ""), f37981f0, AndroidUtilities.dp(200.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
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
                        TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(this.f38002r).getStickerSet(inputStickerSet, true);
                        if (stickerSet != null && stickerSet.documents.isEmpty()) {
                            inputStickerSet = null;
                        }
                        this.f37984a0 = inputStickerSet;
                        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                        if (MessageObject.isVideoStickerDocument(document)) {
                            charSequence = "";
                            str5 = "…";
                            imageReceiver4 = imageReceiver2;
                            imageReceiver4.setImage(ImageLocation.getForDocument(document), null, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), null, null, 0L, "webp", this.f37984a0, 1);
                        } else {
                            charSequence = "";
                            str5 = "…";
                            imageReceiver4 = imageReceiver2;
                            imageReceiver4.setImage(ImageLocation.getForDocument(document), (String) null, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), (String) null, "webp", this.f37984a0, 1);
                            if (MessageObject.isPremiumSticker(document)) {
                                this.S = true;
                                imageReceiver.setImage(ImageLocation.getForDocument(MessageObject.getPremiumStickerAnimation(document), document), (String) null, (ImageLocation) null, (String) null, "tgs", this.f37984a0, 1);
                            }
                        }
                        if (MessageObject.isTextColorEmoji(document)) {
                            imageReceiver4.setColorFilter(org.telegram.ui.ActionBar.k6.o0(g6Var));
                        }
                        if (this.G == null) {
                            int i15 = 0;
                            while (true) {
                                if (i15 >= document.attributes.size()) {
                                    break;
                                }
                                TLRPC.DocumentAttribute documentAttribute2 = document.attributes.get(i15);
                                if ((documentAttribute2 instanceof TLRPC.TL_documentAttributeSticker) && !TextUtils.isEmpty(documentAttribute2.alt)) {
                                    this.G = new StaticLayout(AndroidUtilities.replaceCharSequence(str5, TextUtils.ellipsize(Emoji.replaceEmoji(documentAttribute2.alt, f37981f0.getFontMetricsInt(), false), f37981f0, AndroidUtilities.dp(200.0f), TextUtils.TruncateAt.END), charSequence), f37981f0, AndroidUtilities.dp(200.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
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
                                    org.telegram.ui.Components.ae0 ae0Var = new org.telegram.ui.Components.ae0(this.f38009z.getContext());
                                    this.C = ae0Var;
                                    this.f38009z.addView(ae0Var, new FrameLayout.LayoutParams(512, 512));
                                }
                                z11 = false;
                                this.C.b(importingSticker.videoEditedInfo.mediaEntities, true, true, false);
                            } else {
                                z11 = false;
                            }
                            if (str != null) {
                                this.G = new StaticLayout(AndroidUtilities.replaceCharSequence("…", TextUtils.ellipsize(Emoji.replaceEmoji(str, f37981f0.getFontMetricsInt(), z11), f37981f0, AndroidUtilities.dp(200.0f), TextUtils.TruncateAt.END), ""), f37981f0, AndroidUtilities.dp(200.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                            }
                            this.f37996l.getClass();
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
            this.f37986b0 = obj;
            this.f37988c0 = g6Var;
            this.f38009z.invalidate();
            if (!this.E) {
                AndroidUtilities.lockOrientation(this.f38006w);
                try {
                    if (this.f38008y.getParent() != null) {
                        str6 = str4;
                        try {
                            ((WindowManager) this.f38006w.getSystemService(str6)).removeView(this.f38008y);
                        } catch (Exception e) {
                            e = e;
                            FileLog.e(e);
                            ((WindowManager) this.f38006w.getSystemService(str6)).addView(this.f38008y, this.f38007x);
                            this.E = true;
                            this.F = 0.0f;
                            this.f37987c = -10000.0f;
                            this.f37992g = 0.0f;
                            this.d = 0.0f;
                            this.e = 0.0f;
                            this.H = System.currentTimeMillis();
                            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 8);
                        }
                    } else {
                        str6 = str4;
                    }
                } catch (Exception e7) {
                    e = e7;
                    str6 = str4;
                }
                ((WindowManager) this.f38006w.getSystemService(str6)).addView(this.f38008y, this.f38007x);
                this.E = true;
                this.F = 0.0f;
                this.f37987c = -10000.0f;
                this.f37992g = 0.0f;
                this.d = 0.0f;
                this.e = 0.0f;
                this.H = System.currentTimeMillis();
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 8);
            }
        }
    }

    public final void s() {
        org.telegram.ui.Components.ez0 ez0Var = this.f37994j;
        if (ez0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(ez0Var);
            this.f37994j = null;
        }
        View view = this.h;
        if (view != null) {
            if (view instanceof org.telegram.ui.Cells.e8) {
                ((org.telegram.ui.Cells.e8) view).setScaled(false);
            } else if (view instanceof org.telegram.ui.Cells.c8) {
                ((org.telegram.ui.Cells.c8) view).setScaled(false);
            } else if (view instanceof org.telegram.ui.Cells.e2) {
                ((org.telegram.ui.Cells.e2) view).setScaled(false);
            }
            this.h = null;
        }
    }

    public final void t(ft ftVar) {
        this.f37996l = ftVar;
        if (ftVar != null) {
            this.f37997m = ftVar.j();
            this.f37998n = this.f37996l.o();
        }
    }

    public final void u(Activity activity) {
        int i10 = UserConfig.selectedAccount;
        this.f38002r = i10;
        ImageReceiver imageReceiver = this.A;
        imageReceiver.setCurrentAccount(i10);
        imageReceiver.setLayerNum(Integer.MAX_VALUE);
        int i11 = this.f38002r;
        ImageReceiver imageReceiver2 = this.B;
        imageReceiver2.setCurrentAccount(i11);
        imageReceiver2.setLayerNum(Integer.MAX_VALUE);
        if (this.f38006w == activity) {
            return;
        }
        this.f38006w = activity;
        this.J = activity.getResources().getDrawable(R.drawable.preview_arrow);
        this.f38008y = new l0(this, activity, 5);
        ih.k kVar = new ih.k(this.f38008y);
        l0 l0Var = this.f38008y;
        bh.b bVar = this.f38004t;
        bVar.f4365f = kVar;
        bVar.f4366g = l0Var;
        bVar.e = new re.b();
        this.f38008y.setFocusable(true);
        this.f38008y.setFocusableInTouchMode(true);
        this.f38008y.setSystemUiVisibility(1792);
        l0 l0Var2 = this.f38008y;
        vs vsVar = new vs(this);
        WeakHashMap weakHashMap = r0.i0.f45241a;
        r0.a0.i(l0Var2, vsVar);
        ah.v vVar = new ah.v(this, activity);
        this.f38009z = vVar;
        vVar.setFocusable(false);
        this.f38008y.addView(this.f38009z, w7.z5.e(-1, -1, 51));
        this.f38009z.setOnTouchListener(new d0(this, 1));
        MessagesController.getInstance(this.f38002r);
        this.I = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f38007x = layoutParams;
        layoutParams.height = -1;
        layoutParams.format = -3;
        layoutParams.width = -1;
        layoutParams.gravity = 48;
        layoutParams.type = 99;
        layoutParams.flags = -2147286784;
        AndroidUtilities.applyEdgeToEdgeLayoutParams(layoutParams);
        imageReceiver.setAspectFit(true);
        imageReceiver.setInvalidateAll(true);
        imageReceiver.setParentView(this.f38009z);
        imageReceiver2.setAspectFit(true);
        imageReceiver2.setInvalidateAll(true);
        imageReceiver2.setParentView(this.f38009z);
    }

    public final void v() {
        this.T = null;
    }

    public final boolean w(View view) {
        if (!(view instanceof org.telegram.ui.Cells.e8)) {
            return false;
        }
        Activity findActivity = AndroidUtilities.findActivity(view.getContext());
        if (findActivity == null) {
            return true;
        }
        u(findActivity);
        org.telegram.ui.Cells.e8 e8Var = (org.telegram.ui.Cells.e8) view;
        View view2 = this.h;
        if (view2 instanceof org.telegram.ui.Cells.e8) {
            ((org.telegram.ui.Cells.e8) view2).setScaled(false);
        } else if (view2 instanceof org.telegram.ui.Cells.c8) {
            ((org.telegram.ui.Cells.c8) view2).setScaled(false);
        } else if (view2 instanceof org.telegram.ui.Cells.e2) {
            ((org.telegram.ui.Cells.e2) view2).setScaled(false);
        }
        this.h = e8Var;
        TLRPC.Document sticker = e8Var.getSticker();
        SendMessagesHelper.ImportingSticker stickerPath = e8Var.getStickerPath();
        String str = null;
        String findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(e8Var.getSticker(), null, Integer.valueOf(this.f38002r));
        ft ftVar = this.f37996l;
        if (ftVar != null) {
            str = ftVar.G(false);
        }
        r(sticker, stickerPath, findAnimatedEmojiEmoticon, str, null, 0, e8Var.f22338y, e8Var.getParentObject(), this.f37988c0, 0);
        dt dtVar = this.U;
        AndroidUtilities.cancelRunOnUIThread(dtVar);
        AndroidUtilities.runOnUIThread(dtVar, 16L);
        e8Var.setScaled(true);
        return true;
    }
}
