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
public final class et {
    public static TextPaint f36765f0;
    public static volatile et f36766g0;
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
    public wf1 O;
    public org.telegram.ui.Components.zb P;
    public FrameLayout Q;
    public boolean R;
    public boolean S;
    public TLRPC.TL_messages_stickerSet T;
    public final at U;
    public int V;
    public TLRPC.Document W;
    public SendMessagesHelper.ImportingSticker X;
    public String Y;
    public TLRPC.BotInlineResult Z;
    public int f36767a;
    public TLRPC.InputStickerSet f36768a0;
    public int f36769b;
    public Object f36770b0;
    public float f36771c;
    public org.telegram.ui.ActionBar.d6 f36772c0;
    public float d;
    public VibrationEffect f36773d0;
    public boolean f36774e0;
    public float f36775f;
    public float f36776g;
    public View h;
    public boolean f36777i;
    public org.telegram.ui.Components.bz0 f36778j;
    public org.telegram.ui.ActionBar.m1 f36779k;
    public ct f36780l;
    public boolean f36781m;
    public boolean f36782n;
    public ArrayList f36783o;
    public boolean f36784p;
    public int f36786r;
    public final gh.b f36787s;
    public final bh.b f36788t;
    public final ColorDrawable f36789u;
    public Bitmap v;
    public Activity f36790w;
    public WindowManager.LayoutParams f36791x;
    public m0 f36792y;
    public ah.v f36793z;
    public float e = 0.0f;
    public i0.b f36785q = i0.b.e;

    public et() {
        gh.b bVar = new gh.b();
        this.f36787s = bVar;
        this.f36788t = new bh.b(bVar);
        this.f36789u = new ColorDrawable(1895825408);
        this.A = new ImageReceiver();
        this.B = new ImageReceiver();
        this.E = false;
        this.I = AndroidUtilities.dp(200.0f);
        this.N = new Paint(1);
        this.U = new at(this);
    }

    public static void a(et etVar, Bitmap bitmap, Bitmap bitmap2) {
        gh.b bVar = etVar.f36787s;
        Paint paint = etVar.N;
        etVar.A.setVisible(true, false);
        etVar.v = bitmap;
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
        hh.d.c(bVar, etVar.f36792y);
        etVar.f36788t.d();
        etVar.f36774e0 = false;
        ah.v vVar = etVar.f36793z;
        if (vVar != null) {
            vVar.invalidate();
        }
    }

    public static int d(et etVar, int i10) {
        return org.telegram.ui.ActionBar.h6.w0(i10, etVar.f36772c0);
    }

    public static boolean h(et etVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        boolean z10;
        boolean z11;
        boolean z12;
        float f7;
        boolean z13;
        float f10;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2;
        rh.q qVar;
        ct ctVar = etVar.f36780l;
        if (ctVar == null) {
            return false;
        }
        TLRPC.TL_messageMediaPoll d = ctVar.d();
        TLRPC.PollAnswer g10 = etVar.f36780l.g();
        if (d == null || d.poll == null || g10 == null) {
            return false;
        }
        TLRPC.PollAnswerVoters pollResult = MessageObject.getPollResult(d, g10.option);
        if (pollResult != null && pollResult.voters > 0 && MessageObject.canShowVotersList(d)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!MessageObject.isVoted(d) && !d.poll.closed && !etVar.f36780l.c()) {
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
            rh.q qVar2 = new rh.q(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext(), etVar.f36786r, etVar.f36772c0);
            org.telegram.ui.Components.i80 i80Var = new org.telegram.ui.Components.i80(actionBarPopupWindow$ActionBarPopupWindowLayout, etVar.f36772c0);
            int b10 = actionBarPopupWindow$ActionBarPopupWindowLayout.b(i80Var.B);
            int i10 = org.telegram.ui.ActionBar.h6.E8;
            i80Var.T(org.telegram.ui.ActionBar.h6.m1(0.06f, org.telegram.ui.ActionBar.h6.w0(i10, etVar.f36772c0)));
            bh.b bVar = etVar.f36788t;
            eh.e k10 = fh.c.k(etVar.f36772c0);
            org.telegram.ui.ActionBar.n2 n2Var = null;
            View view = i80Var.B;
            if (view != null) {
                dh.d c10 = bVar.c(view, null, true);
                c10.o(k10);
                view.setBackground(c10);
            }
            z13 = true;
            i80Var.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new ti(actionBarPopupWindow$ActionBarPopupWindowLayout, 16), false);
            i80Var.k();
            MessageObject A = etVar.f36780l.A();
            Activity activity = etVar.f36790w;
            if ((activity instanceof LaunchActivity) && A != null) {
                LaunchActivity launchActivity = (LaunchActivity) activity;
                if (launchActivity.O() != null && launchActivity.O().getLastFragment() != null) {
                    n2Var = launchActivity.O().getLastFragment();
                }
                if (n2Var != null) {
                    org.telegram.ui.Components.b71 a2 = qVar2.a(n2Var, A.getDialogId(), A.getId(), g10.option, pollResult.voters, new org.telegram.ui.Components.qy(6, etVar, n2Var));
                    qVar = qVar2;
                    i80Var.q(a2);
                    qVar.setText(LocaleController.formatPluralString("PollVotesCount", pollResult.voters, new Object[0]));
                    qVar.f45785a.d(pollResult.recent_voters, false);
                    qVar.setLayoutParams(w7.z5.n(-1, 48));
                    qVar.setBackground(org.telegram.ui.ActionBar.h6.Z(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.I5, etVar.f36772c0), 12, 0));
                    qVar.setOnClickListener(new ai.n1(actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 19));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(qVar);
                    org.telegram.ui.ActionBar.j1 j1Var = new org.telegram.ui.ActionBar.j1(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext(), etVar.f36772c0);
                    j1Var.setTag(R.id.fit_width_tag, 1);
                    f7 = 0.06f;
                    j1Var.setColor(org.telegram.ui.ActionBar.h6.m1(0.06f, org.telegram.ui.ActionBar.h6.w0(i10, etVar.f36772c0)));
                    j1Var.setLayoutParams(w7.z5.n(-1, 8));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(j1Var);
                }
            }
            qVar = qVar2;
            qVar.setText(LocaleController.formatPluralString("PollVotesCount", pollResult.voters, new Object[0]));
            qVar.f45785a.d(pollResult.recent_voters, false);
            qVar.setLayoutParams(w7.z5.n(-1, 48));
            qVar.setBackground(org.telegram.ui.ActionBar.h6.Z(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.I5, etVar.f36772c0), 12, 0));
            qVar.setOnClickListener(new ai.n1(actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 19));
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(qVar);
            org.telegram.ui.ActionBar.j1 j1Var2 = new org.telegram.ui.ActionBar.j1(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext(), etVar.f36772c0);
            j1Var2.setTag(R.id.fit_width_tag, 1);
            f7 = 0.06f;
            j1Var2.setColor(org.telegram.ui.ActionBar.h6.m1(0.06f, org.telegram.ui.ActionBar.h6.w0(i10, etVar.f36772c0)));
            j1Var2.setLayoutParams(w7.z5.n(-1, 8));
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(j1Var2);
        } else {
            f7 = 0.06f;
            z13 = true;
        }
        if (z11) {
            f10 = f7;
            org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_select, LocaleController.getString(R.string.PollSubmitVotesNoCaps), false, etVar.f36772c0).setOnClickListener(new ts(etVar, 2));
        } else {
            f10 = f7;
        }
        if (z12) {
            actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_unvote, LocaleController.getString(R.string.Unvote), false, etVar.f36772c0).setOnClickListener(new ts(etVar, 3));
        } else {
            actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
        }
        if (!z10 && (z11 || z12)) {
            org.telegram.ui.ActionBar.j1 j1Var3 = new org.telegram.ui.ActionBar.j1(actionBarPopupWindow$ActionBarPopupWindowLayout2.getContext(), etVar.f36772c0);
            j1Var3.setTag(R.id.fit_width_tag, 1);
            j1Var3.setColor(org.telegram.ui.ActionBar.h6.m1(f10, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.E8, etVar.f36772c0)));
            j1Var3.setLayoutParams(w7.z5.n(-1, 8));
            actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(j1Var3);
        }
        if (!z10 && !z11 && !z12) {
            return false;
        }
        return z13;
    }

    public static et q() {
        et etVar;
        et etVar2 = f36766g0;
        if (etVar2 == null) {
            synchronized (PhotoViewer.class) {
                try {
                    etVar = f36766g0;
                    if (etVar == null) {
                        etVar = new et();
                        f36766g0 = etVar;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return etVar;
        }
        return etVar2;
    }

    public final void n() {
        if (this.f36790w != null && !this.K) {
            AndroidUtilities.cancelRunOnUIThread(this.U);
            this.F = 1.0f;
            this.H = System.currentTimeMillis();
            this.f36793z.invalidate();
            this.W = null;
            this.f36768a0 = null;
            this.Y = null;
            this.f36780l = null;
            this.E = false;
            AndroidUtilities.runOnUIThread(new rs(this, 0), 200L);
            wf1 wf1Var = this.O;
            if (wf1Var != null) {
                wf1Var.animate().alpha(0.0f).translationY(AndroidUtilities.dp(56.0f)).setDuration(150L).setInterpolator(org.telegram.ui.Components.bs.f25012f).start();
            }
            FrameLayout frameLayout = this.Q;
            if (frameLayout != null) {
                frameLayout.animate().alpha(0.0f).setDuration(150L).scaleX(0.6f).scaleY(0.6f).setInterpolator(org.telegram.ui.Components.bs.f25012f).start();
            }
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 8);
        }
    }

    public final void o() {
        ah.t0 reactionsWindow;
        org.telegram.ui.Components.zb zbVar = this.P;
        if (zbVar != null && (reactionsWindow = zbVar.getReactionsWindow()) != null && !reactionsWindow.f881q) {
            reactionsWindow.d();
            return;
        }
        this.K = false;
        p();
        n();
    }

    public final void p() {
        org.telegram.ui.ActionBar.m1 m1Var = this.f36779k;
        if (m1Var != null) {
            m1Var.dismiss();
            this.f36779k = null;
            return;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.L;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            org.telegram.messenger.kk.t(actionBarPopupWindow$ActionBarPopupWindowLayout.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).translationY(AndroidUtilities.dp(-12.0f)), org.telegram.ui.Components.bs.h, 320L);
            this.L = null;
            this.K = false;
            if (this.R) {
                n();
            }
        }
    }

    public final boolean r(MotionEvent motionEvent, org.telegram.ui.Components.im0 im0Var, ct ctVar, org.telegram.ui.ActionBar.d6 d6Var) {
        int i10;
        this.f36780l = ctVar;
        if (ctVar != null) {
            this.f36781m = ctVar.j();
            this.f36782n = this.f36780l.o();
        }
        ct ctVar2 = this.f36780l;
        if ((ctVar2 == null || ctVar2.h()) && motionEvent.getAction() == 0) {
            int x10 = (int) motionEvent.getX();
            int y3 = (int) motionEvent.getY();
            int childCount = im0Var.getChildCount();
            int i11 = 0;
            while (true) {
                if (i11 >= childCount) {
                    break;
                }
                View childAt = im0Var.getChildAt(i11);
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
                        if (((org.telegram.ui.Cells.e8) childAt).f22194a.hasNotThumb()) {
                            imageReceiver.setRoundRadius(0);
                            i10 = 0;
                        }
                        i10 = -1;
                    } else if (childAt instanceof org.telegram.ui.Cells.c8) {
                        if (((org.telegram.ui.Cells.c8) childAt).f22098a.getImageReceiver().getBitmap() != null) {
                            imageReceiver.setRoundRadius(0);
                            i10 = 0;
                        }
                        i10 = -1;
                    } else {
                        i10 = 2;
                        if (childAt instanceof org.telegram.ui.Cells.f2) {
                            org.telegram.ui.Cells.f2 f2Var = (org.telegram.ui.Cells.f2) childAt;
                            if (f2Var.f22207a.getBitmap() != null) {
                                int i12 = f2Var.O;
                                if (i12 == 6) {
                                    imageReceiver.setRoundRadius(0);
                                    i10 = 0;
                                } else if (i12 == 2 && f2Var.f22221s) {
                                    imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
                                    i10 = 1;
                                }
                            }
                            i10 = -1;
                        } else if (childAt instanceof org.telegram.ui.Components.rv) {
                            imageReceiver.setRoundRadius(0);
                        } else if ((childAt instanceof org.telegram.ui.Components.cz) && ((org.telegram.ui.Components.cz) childAt).getSpan() != null) {
                            imageReceiver.setRoundRadius(0);
                        } else {
                            if ((childAt instanceof org.telegram.ui.Components.gz0) && (((org.telegram.ui.Components.gz0) childAt).f26725b instanceof org.telegram.ui.Components.r5)) {
                                imageReceiver.setRoundRadius(0);
                            }
                            i10 = -1;
                        }
                    }
                    if (i10 != -1) {
                        this.f36767a = x10;
                        this.f36769b = y3;
                        this.h = childAt;
                        org.telegram.ui.Components.bz0 bz0Var = new org.telegram.ui.Components.bz0(this, im0Var, i10, d6Var, 3);
                        this.f36778j = bz0Var;
                        AndroidUtilities.runOnUIThread(bz0Var, 200L);
                        return true;
                    }
                } else {
                    i11++;
                }
            }
        }
        return false;
    }

    public final boolean s(android.view.MotionEvent r17, org.telegram.ui.Components.im0 r18, java.lang.Object r19, org.telegram.ui.ct r20, org.telegram.ui.ActionBar.d6 r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.et.s(android.view.MotionEvent, org.telegram.ui.Components.im0, java.lang.Object, org.telegram.ui.ct, org.telegram.ui.ActionBar.d6):boolean");
    }

    public final void t(TLRPC.Document document, SendMessagesHelper.ImportingSticker importingSticker, String str, String str2, TLRPC.BotInlineResult botInlineResult, int i10, boolean z10, Object obj, org.telegram.ui.ActionBar.d6 d6Var, int i11) {
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
        at atVar;
        if (this.f36790w != null && this.f36792y != null) {
            this.f36772c0 = d6Var;
            this.f36784p = z10;
            this.G = null;
            if (AndroidUtilities.isDarkColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20987d6, d6Var))) {
                i12 = 1895825408;
            } else {
                i12 = 1692853990;
            }
            this.f36789u.setColor(i12);
            this.S = false;
            ImageReceiver imageReceiver4 = this.A;
            imageReceiver4.setColorFilter(null);
            ImageReceiver imageReceiver5 = this.B;
            at atVar2 = this.U;
            if (i10 == 0 || i10 == 2 || i10 == 3) {
                ImageReceiver imageReceiver6 = imageReceiver5;
                if (document != null || importingSticker != null) {
                    if (f36765f0 == null) {
                        TextPaint textPaint = new TextPaint(1);
                        f36765f0 = textPaint;
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
                            this.G = new StaticLayout(AndroidUtilities.replaceCharSequence("…", TextUtils.ellipsize(Emoji.replaceEmoji(str, f36765f0.getFontMetricsInt(), false), f36765f0, AndroidUtilities.dp(200.0f), TextUtils.TruncateAt.END), ""), f36765f0, AndroidUtilities.dp(200.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                        } else {
                            imageReceiver2 = imageReceiver4;
                        }
                        if (inputStickerSet != null || i10 == 2) {
                            AndroidUtilities.cancelRunOnUIThread(atVar2);
                            if (i11 > 0) {
                                j11 = i11;
                            } else {
                                j11 = 1300;
                            }
                            AndroidUtilities.runOnUIThread(atVar2, j11);
                        }
                        TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(this.f36786r).getStickerSet(inputStickerSet, true);
                        if (stickerSet != null && stickerSet.documents.isEmpty()) {
                            inputStickerSet = null;
                        }
                        this.f36768a0 = inputStickerSet;
                        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                        if (MessageObject.isVideoStickerDocument(document)) {
                            charSequence = "";
                            str5 = "…";
                            imageReceiver4 = imageReceiver2;
                            imageReceiver4.setImage(ImageLocation.getForDocument(document), null, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), null, null, 0L, "webp", this.f36768a0, 1);
                        } else {
                            charSequence = "";
                            str5 = "…";
                            imageReceiver4 = imageReceiver2;
                            imageReceiver4.setImage(ImageLocation.getForDocument(document), (String) null, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), (String) null, "webp", this.f36768a0, 1);
                            if (MessageObject.isPremiumSticker(document)) {
                                this.S = true;
                                imageReceiver.setImage(ImageLocation.getForDocument(MessageObject.getPremiumStickerAnimation(document), document), (String) null, (ImageLocation) null, (String) null, "tgs", this.f36768a0, 1);
                            }
                        }
                        if (MessageObject.isTextColorEmoji(document)) {
                            imageReceiver4.setColorFilter(org.telegram.ui.ActionBar.h6.o0(d6Var));
                        }
                        if (this.G == null) {
                            int i15 = 0;
                            while (true) {
                                if (i15 >= document.attributes.size()) {
                                    break;
                                }
                                TLRPC.DocumentAttribute documentAttribute2 = document.attributes.get(i15);
                                if ((documentAttribute2 instanceof TLRPC.TL_documentAttributeSticker) && !TextUtils.isEmpty(documentAttribute2.alt)) {
                                    this.G = new StaticLayout(AndroidUtilities.replaceCharSequence(str5, TextUtils.ellipsize(Emoji.replaceEmoji(documentAttribute2.alt, f36765f0.getFontMetricsInt(), false), f36765f0, AndroidUtilities.dp(200.0f), TextUtils.TruncateAt.END), charSequence), f36765f0, AndroidUtilities.dp(200.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
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
                                    org.telegram.ui.Components.zd0 zd0Var = new org.telegram.ui.Components.zd0(this.f36793z.getContext());
                                    this.C = zd0Var;
                                    this.f36793z.addView(zd0Var, new FrameLayout.LayoutParams(512, 512));
                                }
                                z11 = false;
                                this.C.b(importingSticker.videoEditedInfo.mediaEntities, true, true, false);
                            } else {
                                z11 = false;
                            }
                            if (str != null) {
                                this.G = new StaticLayout(AndroidUtilities.replaceCharSequence("…", TextUtils.ellipsize(Emoji.replaceEmoji(str, f36765f0.getFontMetricsInt(), z11), f36765f0, AndroidUtilities.dp(200.0f), TextUtils.TruncateAt.END), ""), f36765f0, AndroidUtilities.dp(200.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                            }
                            this.f36780l.getClass();
                            AndroidUtilities.cancelRunOnUIThread(atVar2);
                            if (i11 > 0) {
                                j10 = i11;
                            } else {
                                j10 = 1300;
                            }
                            AndroidUtilities.runOnUIThread(atVar2, j10);
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
                        atVar = atVar2;
                        imageReceiver4.setImage(forDocument, null, ImageLocation.getForDocument(documentVideoThumb, document), null, ImageLocation.getForDocument(closestPhotoSizeWithSize2, document), "90_90_b", null, document.size, null, "gif" + document, 0);
                    } else {
                        imageReceiver3 = imageReceiver5;
                        atVar = atVar2;
                        imageReceiver4 = imageReceiver4;
                        imageReceiver4.setImage(forDocument, null, ImageLocation.getForDocument(closestPhotoSizeWithSize2, document), "90_90_b", document.size, null, "gif" + document, 0);
                    }
                } else {
                    imageReceiver3 = imageReceiver5;
                    atVar = atVar2;
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
                AndroidUtilities.cancelRunOnUIThread(atVar);
                AndroidUtilities.runOnUIThread(atVar, 2000L);
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
            this.f36770b0 = obj;
            this.f36772c0 = d6Var;
            this.f36793z.invalidate();
            if (!this.E) {
                AndroidUtilities.lockOrientation(this.f36790w);
                try {
                    if (this.f36792y.getParent() != null) {
                        str6 = str4;
                        try {
                            ((WindowManager) this.f36790w.getSystemService(str6)).removeView(this.f36792y);
                        } catch (Exception e) {
                            e = e;
                            FileLog.e(e);
                            ((WindowManager) this.f36790w.getSystemService(str6)).addView(this.f36792y, this.f36791x);
                            this.E = true;
                            this.F = 0.0f;
                            this.f36771c = -10000.0f;
                            this.f36776g = 0.0f;
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
                ((WindowManager) this.f36790w.getSystemService(str6)).addView(this.f36792y, this.f36791x);
                this.E = true;
                this.F = 0.0f;
                this.f36771c = -10000.0f;
                this.f36776g = 0.0f;
                this.d = 0.0f;
                this.e = 0.0f;
                this.H = System.currentTimeMillis();
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 8);
            }
        }
    }

    public final void u() {
        org.telegram.ui.Components.bz0 bz0Var = this.f36778j;
        if (bz0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(bz0Var);
            this.f36778j = null;
        }
        View view = this.h;
        if (view != null) {
            if (view instanceof org.telegram.ui.Cells.e8) {
                ((org.telegram.ui.Cells.e8) view).setScaled(false);
            } else if (view instanceof org.telegram.ui.Cells.c8) {
                ((org.telegram.ui.Cells.c8) view).setScaled(false);
            } else if (view instanceof org.telegram.ui.Cells.f2) {
                ((org.telegram.ui.Cells.f2) view).setScaled(false);
            }
            this.h = null;
        }
    }

    public final void v(ct ctVar) {
        this.f36780l = ctVar;
        if (ctVar != null) {
            this.f36781m = ctVar.j();
            this.f36782n = this.f36780l.o();
        }
    }

    public final void w(Activity activity) {
        int i10 = UserConfig.selectedAccount;
        this.f36786r = i10;
        ImageReceiver imageReceiver = this.A;
        imageReceiver.setCurrentAccount(i10);
        imageReceiver.setLayerNum(Integer.MAX_VALUE);
        int i11 = this.f36786r;
        ImageReceiver imageReceiver2 = this.B;
        imageReceiver2.setCurrentAccount(i11);
        imageReceiver2.setLayerNum(Integer.MAX_VALUE);
        if (this.f36790w == activity) {
            return;
        }
        this.f36790w = activity;
        this.J = activity.getResources().getDrawable(R.drawable.preview_arrow);
        this.f36792y = new m0(this, activity, 5);
        ih.j jVar = new ih.j(this.f36792y);
        m0 m0Var = this.f36792y;
        bh.b bVar = this.f36788t;
        bVar.f4358f = jVar;
        bVar.f4359g = m0Var;
        bVar.e = new re.b();
        this.f36792y.setFocusable(true);
        this.f36792y.setFocusableInTouchMode(true);
        this.f36792y.setSystemUiVisibility(1792);
        m0 m0Var2 = this.f36792y;
        ss ssVar = new ss(this);
        WeakHashMap weakHashMap = r0.i0.f44818a;
        r0.a0.i(m0Var2, ssVar);
        ah.v vVar = new ah.v(this, activity);
        this.f36793z = vVar;
        vVar.setFocusable(false);
        this.f36792y.addView(this.f36793z, w7.z5.e(-1, -1, 51));
        this.f36793z.setOnTouchListener(new e0(this, 1));
        MessagesController.getInstance(this.f36786r);
        this.I = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f36791x = layoutParams;
        layoutParams.height = -1;
        layoutParams.format = -3;
        layoutParams.width = -1;
        layoutParams.gravity = 48;
        layoutParams.type = 99;
        layoutParams.flags = -2147286784;
        AndroidUtilities.applyEdgeToEdgeLayoutParams(layoutParams);
        imageReceiver.setAspectFit(true);
        imageReceiver.setInvalidateAll(true);
        imageReceiver.setParentView(this.f36793z);
        imageReceiver2.setAspectFit(true);
        imageReceiver2.setInvalidateAll(true);
        imageReceiver2.setParentView(this.f36793z);
    }

    public final void x() {
        this.T = null;
    }

    public final boolean y(View view) {
        if (!(view instanceof org.telegram.ui.Cells.e8)) {
            return false;
        }
        Activity findActivity = AndroidUtilities.findActivity(view.getContext());
        if (findActivity == null) {
            return true;
        }
        w(findActivity);
        org.telegram.ui.Cells.e8 e8Var = (org.telegram.ui.Cells.e8) view;
        View view2 = this.h;
        if (view2 instanceof org.telegram.ui.Cells.e8) {
            ((org.telegram.ui.Cells.e8) view2).setScaled(false);
        } else if (view2 instanceof org.telegram.ui.Cells.c8) {
            ((org.telegram.ui.Cells.c8) view2).setScaled(false);
        } else if (view2 instanceof org.telegram.ui.Cells.f2) {
            ((org.telegram.ui.Cells.f2) view2).setScaled(false);
        }
        this.h = e8Var;
        TLRPC.Document sticker = e8Var.getSticker();
        SendMessagesHelper.ImportingSticker stickerPath = e8Var.getStickerPath();
        String str = null;
        String findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(e8Var.getSticker(), null, Integer.valueOf(this.f36786r));
        ct ctVar = this.f36780l;
        if (ctVar != null) {
            str = ctVar.G(false);
        }
        t(sticker, stickerPath, findAnimatedEmojiEmoticon, str, null, 0, e8Var.f22203y, e8Var.getParentObject(), this.f36772c0, 0);
        at atVar = this.U;
        AndroidUtilities.cancelRunOnUIThread(atVar);
        AndroidUtilities.runOnUIThread(atVar, 16L);
        e8Var.setScaled(true);
        return true;
    }
}
