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
    public static TextPaint f36771f0;
    public static volatile et f36772g0;
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
    public int f36773a;
    public TLRPC.InputStickerSet f36774a0;
    public int f36775b;
    public Object f36776b0;
    public float f36777c;
    public org.telegram.ui.ActionBar.d6 f36778c0;
    public float d;
    public VibrationEffect f36779d0;
    public boolean f36780e0;
    public float f36781f;
    public float f36782g;
    public View h;
    public boolean f36783i;
    public org.telegram.ui.Components.bz0 f36784j;
    public org.telegram.ui.ActionBar.m1 f36785k;
    public ct f36786l;
    public boolean f36787m;
    public boolean f36788n;
    public ArrayList f36789o;
    public boolean f36790p;
    public int f36792r;
    public final gh.b f36793s;
    public final bh.b f36794t;
    public final ColorDrawable f36795u;
    public Bitmap v;
    public Activity f36796w;
    public WindowManager.LayoutParams f36797x;
    public m0 f36798y;
    public ah.v f36799z;
    public float e = 0.0f;
    public i0.b f36791q = i0.b.e;

    public et() {
        gh.b bVar = new gh.b();
        this.f36793s = bVar;
        this.f36794t = new bh.b(bVar);
        this.f36795u = new ColorDrawable(1895825408);
        this.A = new ImageReceiver();
        this.B = new ImageReceiver();
        this.E = false;
        this.I = AndroidUtilities.dp(200.0f);
        this.N = new Paint(1);
        this.U = new at(this);
    }

    public static void a(et etVar, Bitmap bitmap, Bitmap bitmap2) {
        gh.b bVar = etVar.f36793s;
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
        hh.d.c(bVar, etVar.f36798y);
        etVar.f36794t.d();
        etVar.f36780e0 = false;
        ah.v vVar = etVar.f36799z;
        if (vVar != null) {
            vVar.invalidate();
        }
    }

    public static int d(et etVar, int i10) {
        return org.telegram.ui.ActionBar.h6.w0(i10, etVar.f36778c0);
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
        ct ctVar = etVar.f36786l;
        if (ctVar == null) {
            return false;
        }
        TLRPC.TL_messageMediaPoll d = ctVar.d();
        TLRPC.PollAnswer g10 = etVar.f36786l.g();
        if (d == null || d.poll == null || g10 == null) {
            return false;
        }
        TLRPC.PollAnswerVoters pollResult = MessageObject.getPollResult(d, g10.option);
        if (pollResult != null && pollResult.voters > 0 && MessageObject.canShowVotersList(d)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!MessageObject.isVoted(d) && !d.poll.closed && !etVar.f36786l.c()) {
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
            rh.q qVar2 = new rh.q(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext(), etVar.f36792r, etVar.f36778c0);
            org.telegram.ui.Components.i80 i80Var = new org.telegram.ui.Components.i80(actionBarPopupWindow$ActionBarPopupWindowLayout, etVar.f36778c0);
            int b10 = actionBarPopupWindow$ActionBarPopupWindowLayout.b(i80Var.B);
            int i10 = org.telegram.ui.ActionBar.h6.E8;
            i80Var.T(org.telegram.ui.ActionBar.h6.m1(0.06f, org.telegram.ui.ActionBar.h6.w0(i10, etVar.f36778c0)));
            bh.b bVar = etVar.f36794t;
            eh.e k10 = fh.c.k(etVar.f36778c0);
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
            MessageObject A = etVar.f36786l.A();
            Activity activity = etVar.f36796w;
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
                    qVar.f45783a.d(pollResult.recent_voters, false);
                    qVar.setLayoutParams(w7.z5.n(-1, 48));
                    qVar.setBackground(org.telegram.ui.ActionBar.h6.Z(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.I5, etVar.f36778c0), 12, 0));
                    qVar.setOnClickListener(new ai.n1(actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 19));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(qVar);
                    org.telegram.ui.ActionBar.j1 j1Var = new org.telegram.ui.ActionBar.j1(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext(), etVar.f36778c0);
                    j1Var.setTag(R.id.fit_width_tag, 1);
                    f7 = 0.06f;
                    j1Var.setColor(org.telegram.ui.ActionBar.h6.m1(0.06f, org.telegram.ui.ActionBar.h6.w0(i10, etVar.f36778c0)));
                    j1Var.setLayoutParams(w7.z5.n(-1, 8));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(j1Var);
                }
            }
            qVar = qVar2;
            qVar.setText(LocaleController.formatPluralString("PollVotesCount", pollResult.voters, new Object[0]));
            qVar.f45783a.d(pollResult.recent_voters, false);
            qVar.setLayoutParams(w7.z5.n(-1, 48));
            qVar.setBackground(org.telegram.ui.ActionBar.h6.Z(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.I5, etVar.f36778c0), 12, 0));
            qVar.setOnClickListener(new ai.n1(actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 19));
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(qVar);
            org.telegram.ui.ActionBar.j1 j1Var2 = new org.telegram.ui.ActionBar.j1(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext(), etVar.f36778c0);
            j1Var2.setTag(R.id.fit_width_tag, 1);
            f7 = 0.06f;
            j1Var2.setColor(org.telegram.ui.ActionBar.h6.m1(0.06f, org.telegram.ui.ActionBar.h6.w0(i10, etVar.f36778c0)));
            j1Var2.setLayoutParams(w7.z5.n(-1, 8));
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(j1Var2);
        } else {
            f7 = 0.06f;
            z13 = true;
        }
        if (z11) {
            f10 = f7;
            org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_select, LocaleController.getString(R.string.PollSubmitVotesNoCaps), false, etVar.f36778c0).setOnClickListener(new ts(etVar, 2));
        } else {
            f10 = f7;
        }
        if (z12) {
            actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_unvote, LocaleController.getString(R.string.Unvote), false, etVar.f36778c0).setOnClickListener(new ts(etVar, 3));
        } else {
            actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
        }
        if (!z10 && (z11 || z12)) {
            org.telegram.ui.ActionBar.j1 j1Var3 = new org.telegram.ui.ActionBar.j1(actionBarPopupWindow$ActionBarPopupWindowLayout2.getContext(), etVar.f36778c0);
            j1Var3.setTag(R.id.fit_width_tag, 1);
            j1Var3.setColor(org.telegram.ui.ActionBar.h6.m1(f10, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.E8, etVar.f36778c0)));
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
        et etVar2 = f36772g0;
        if (etVar2 == null) {
            synchronized (PhotoViewer.class) {
                try {
                    etVar = f36772g0;
                    if (etVar == null) {
                        etVar = new et();
                        f36772g0 = etVar;
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
        if (this.f36796w != null && !this.K) {
            AndroidUtilities.cancelRunOnUIThread(this.U);
            this.F = 1.0f;
            this.H = System.currentTimeMillis();
            this.f36799z.invalidate();
            this.W = null;
            this.f36774a0 = null;
            this.Y = null;
            this.f36786l = null;
            this.E = false;
            AndroidUtilities.runOnUIThread(new rs(this, 0), 200L);
            wf1 wf1Var = this.O;
            if (wf1Var != null) {
                wf1Var.animate().alpha(0.0f).translationY(AndroidUtilities.dp(56.0f)).setDuration(150L).setInterpolator(org.telegram.ui.Components.bs.f25014f).start();
            }
            FrameLayout frameLayout = this.Q;
            if (frameLayout != null) {
                frameLayout.animate().alpha(0.0f).setDuration(150L).scaleX(0.6f).scaleY(0.6f).setInterpolator(org.telegram.ui.Components.bs.f25014f).start();
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
        org.telegram.ui.ActionBar.m1 m1Var = this.f36785k;
        if (m1Var != null) {
            m1Var.dismiss();
            this.f36785k = null;
            return;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.L;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            org.telegram.messenger.lk.t(actionBarPopupWindow$ActionBarPopupWindowLayout.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).translationY(AndroidUtilities.dp(-12.0f)), org.telegram.ui.Components.bs.h, 320L);
            this.L = null;
            this.K = false;
            if (this.R) {
                n();
            }
        }
    }

    public final boolean r(MotionEvent motionEvent, org.telegram.ui.Components.im0 im0Var, ct ctVar, org.telegram.ui.ActionBar.d6 d6Var) {
        int i10;
        this.f36786l = ctVar;
        if (ctVar != null) {
            this.f36787m = ctVar.j();
            this.f36788n = this.f36786l.o();
        }
        ct ctVar2 = this.f36786l;
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
                        if (((org.telegram.ui.Cells.e8) childAt).f22196a.hasNotThumb()) {
                            imageReceiver.setRoundRadius(0);
                            i10 = 0;
                        }
                        i10 = -1;
                    } else if (childAt instanceof org.telegram.ui.Cells.c8) {
                        if (((org.telegram.ui.Cells.c8) childAt).f22100a.getImageReceiver().getBitmap() != null) {
                            imageReceiver.setRoundRadius(0);
                            i10 = 0;
                        }
                        i10 = -1;
                    } else {
                        i10 = 2;
                        if (childAt instanceof org.telegram.ui.Cells.f2) {
                            org.telegram.ui.Cells.f2 f2Var = (org.telegram.ui.Cells.f2) childAt;
                            if (f2Var.f22209a.getBitmap() != null) {
                                int i12 = f2Var.O;
                                if (i12 == 6) {
                                    imageReceiver.setRoundRadius(0);
                                    i10 = 0;
                                } else if (i12 == 2 && f2Var.f22223s) {
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
                            if ((childAt instanceof org.telegram.ui.Components.gz0) && (((org.telegram.ui.Components.gz0) childAt).f26727b instanceof org.telegram.ui.Components.r5)) {
                                imageReceiver.setRoundRadius(0);
                            }
                            i10 = -1;
                        }
                    }
                    if (i10 != -1) {
                        this.f36773a = x10;
                        this.f36775b = y3;
                        this.h = childAt;
                        org.telegram.ui.Components.bz0 bz0Var = new org.telegram.ui.Components.bz0(this, im0Var, i10, d6Var, 3);
                        this.f36784j = bz0Var;
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
        if (this.f36796w != null && this.f36798y != null) {
            this.f36778c0 = d6Var;
            this.f36790p = z10;
            this.G = null;
            if (AndroidUtilities.isDarkColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20989d6, d6Var))) {
                i12 = 1895825408;
            } else {
                i12 = 1692853990;
            }
            this.f36795u.setColor(i12);
            this.S = false;
            ImageReceiver imageReceiver4 = this.A;
            imageReceiver4.setColorFilter(null);
            ImageReceiver imageReceiver5 = this.B;
            at atVar2 = this.U;
            if (i10 == 0 || i10 == 2 || i10 == 3) {
                ImageReceiver imageReceiver6 = imageReceiver5;
                if (document != null || importingSticker != null) {
                    if (f36771f0 == null) {
                        TextPaint textPaint = new TextPaint(1);
                        f36771f0 = textPaint;
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
                            this.G = new StaticLayout(AndroidUtilities.replaceCharSequence("…", TextUtils.ellipsize(Emoji.replaceEmoji(str, f36771f0.getFontMetricsInt(), false), f36771f0, AndroidUtilities.dp(200.0f), TextUtils.TruncateAt.END), ""), f36771f0, AndroidUtilities.dp(200.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
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
                        TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(this.f36792r).getStickerSet(inputStickerSet, true);
                        if (stickerSet != null && stickerSet.documents.isEmpty()) {
                            inputStickerSet = null;
                        }
                        this.f36774a0 = inputStickerSet;
                        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                        if (MessageObject.isVideoStickerDocument(document)) {
                            charSequence = "";
                            str5 = "…";
                            imageReceiver4 = imageReceiver2;
                            imageReceiver4.setImage(ImageLocation.getForDocument(document), null, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), null, null, 0L, "webp", this.f36774a0, 1);
                        } else {
                            charSequence = "";
                            str5 = "…";
                            imageReceiver4 = imageReceiver2;
                            imageReceiver4.setImage(ImageLocation.getForDocument(document), (String) null, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), (String) null, "webp", this.f36774a0, 1);
                            if (MessageObject.isPremiumSticker(document)) {
                                this.S = true;
                                imageReceiver.setImage(ImageLocation.getForDocument(MessageObject.getPremiumStickerAnimation(document), document), (String) null, (ImageLocation) null, (String) null, "tgs", this.f36774a0, 1);
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
                                    this.G = new StaticLayout(AndroidUtilities.replaceCharSequence(str5, TextUtils.ellipsize(Emoji.replaceEmoji(documentAttribute2.alt, f36771f0.getFontMetricsInt(), false), f36771f0, AndroidUtilities.dp(200.0f), TextUtils.TruncateAt.END), charSequence), f36771f0, AndroidUtilities.dp(200.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
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
                                    org.telegram.ui.Components.zd0 zd0Var = new org.telegram.ui.Components.zd0(this.f36799z.getContext());
                                    this.C = zd0Var;
                                    this.f36799z.addView(zd0Var, new FrameLayout.LayoutParams(512, 512));
                                }
                                z11 = false;
                                this.C.b(importingSticker.videoEditedInfo.mediaEntities, true, true, false);
                            } else {
                                z11 = false;
                            }
                            if (str != null) {
                                this.G = new StaticLayout(AndroidUtilities.replaceCharSequence("…", TextUtils.ellipsize(Emoji.replaceEmoji(str, f36771f0.getFontMetricsInt(), z11), f36771f0, AndroidUtilities.dp(200.0f), TextUtils.TruncateAt.END), ""), f36771f0, AndroidUtilities.dp(200.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                            }
                            this.f36786l.getClass();
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
            this.f36776b0 = obj;
            this.f36778c0 = d6Var;
            this.f36799z.invalidate();
            if (!this.E) {
                AndroidUtilities.lockOrientation(this.f36796w);
                try {
                    if (this.f36798y.getParent() != null) {
                        str6 = str4;
                        try {
                            ((WindowManager) this.f36796w.getSystemService(str6)).removeView(this.f36798y);
                        } catch (Exception e) {
                            e = e;
                            FileLog.e(e);
                            ((WindowManager) this.f36796w.getSystemService(str6)).addView(this.f36798y, this.f36797x);
                            this.E = true;
                            this.F = 0.0f;
                            this.f36777c = -10000.0f;
                            this.f36782g = 0.0f;
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
                ((WindowManager) this.f36796w.getSystemService(str6)).addView(this.f36798y, this.f36797x);
                this.E = true;
                this.F = 0.0f;
                this.f36777c = -10000.0f;
                this.f36782g = 0.0f;
                this.d = 0.0f;
                this.e = 0.0f;
                this.H = System.currentTimeMillis();
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 8);
            }
        }
    }

    public final void u() {
        org.telegram.ui.Components.bz0 bz0Var = this.f36784j;
        if (bz0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(bz0Var);
            this.f36784j = null;
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
        this.f36786l = ctVar;
        if (ctVar != null) {
            this.f36787m = ctVar.j();
            this.f36788n = this.f36786l.o();
        }
    }

    public final void w(Activity activity) {
        int i10 = UserConfig.selectedAccount;
        this.f36792r = i10;
        ImageReceiver imageReceiver = this.A;
        imageReceiver.setCurrentAccount(i10);
        imageReceiver.setLayerNum(Integer.MAX_VALUE);
        int i11 = this.f36792r;
        ImageReceiver imageReceiver2 = this.B;
        imageReceiver2.setCurrentAccount(i11);
        imageReceiver2.setLayerNum(Integer.MAX_VALUE);
        if (this.f36796w == activity) {
            return;
        }
        this.f36796w = activity;
        this.J = activity.getResources().getDrawable(R.drawable.preview_arrow);
        this.f36798y = new m0(this, activity, 5);
        ih.j jVar = new ih.j(this.f36798y);
        m0 m0Var = this.f36798y;
        bh.b bVar = this.f36794t;
        bVar.f4360f = jVar;
        bVar.f4361g = m0Var;
        bVar.e = new re.b();
        this.f36798y.setFocusable(true);
        this.f36798y.setFocusableInTouchMode(true);
        this.f36798y.setSystemUiVisibility(1792);
        m0 m0Var2 = this.f36798y;
        ss ssVar = new ss(this);
        WeakHashMap weakHashMap = r0.i0.f44816a;
        r0.a0.i(m0Var2, ssVar);
        ah.v vVar = new ah.v(this, activity);
        this.f36799z = vVar;
        vVar.setFocusable(false);
        this.f36798y.addView(this.f36799z, w7.z5.e(-1, -1, 51));
        this.f36799z.setOnTouchListener(new e0(this, 1));
        MessagesController.getInstance(this.f36792r);
        this.I = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f36797x = layoutParams;
        layoutParams.height = -1;
        layoutParams.format = -3;
        layoutParams.width = -1;
        layoutParams.gravity = 48;
        layoutParams.type = 99;
        layoutParams.flags = -2147286784;
        AndroidUtilities.applyEdgeToEdgeLayoutParams(layoutParams);
        imageReceiver.setAspectFit(true);
        imageReceiver.setInvalidateAll(true);
        imageReceiver.setParentView(this.f36799z);
        imageReceiver2.setAspectFit(true);
        imageReceiver2.setInvalidateAll(true);
        imageReceiver2.setParentView(this.f36799z);
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
        String findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(e8Var.getSticker(), null, Integer.valueOf(this.f36792r));
        ct ctVar = this.f36786l;
        if (ctVar != null) {
            str = ctVar.G(false);
        }
        t(sticker, stickerPath, findAnimatedEmojiEmoticon, str, null, 0, e8Var.f22205y, e8Var.getParentObject(), this.f36778c0, 0);
        at atVar = this.U;
        AndroidUtilities.cancelRunOnUIThread(atVar);
        AndroidUtilities.runOnUIThread(atVar, 16L);
        e8Var.setScaled(true);
        return true;
    }
}
