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
public final class pt {
    public static TextPaint f36178f0;
    public static volatile pt f36179g0;
    public final ImageReceiver A;
    public final ImageReceiver B;
    public org.telegram.ui.Components.fd0 C;
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
    public ah1 O;
    public org.telegram.ui.Components.zb P;
    public FrameLayout Q;
    public boolean R;
    public boolean S;
    public TLRPC.TL_messages_stickerSet T;
    public final lt U;
    public int V;
    public TLRPC.Document W;
    public SendMessagesHelper.ImportingSticker X;
    public String Y;
    public TLRPC.BotInlineResult Z;
    public int f36180a;
    public TLRPC.InputStickerSet f36181a0;
    public int f36182b;
    public Object f36183b0;
    public float f36184c;
    public org.telegram.ui.ActionBar.d6 f36185c0;
    public float d;
    public VibrationEffect f36186d0;
    public boolean f36187e0;
    public float f36188f;
    public float f36189g;
    public View h;
    public boolean f36190i;
    public org.telegram.ui.Components.r11 f36191j;
    public org.telegram.ui.ActionBar.n1 f36192k;
    public nt f36193l;
    public boolean f36194m;
    public boolean f36195n;
    public ArrayList f36196o;
    public boolean f36197p;
    public int f36199r;
    public final fh.b f36200s;
    public final ah.c f36201t;
    public final ColorDrawable f36202u;
    public Bitmap v;
    public Activity f36203w;
    public WindowManager.LayoutParams f36204x;
    public k0 f36205y;
    public ci.m6 f36206z;
    public float e = 0.0f;
    public i0.b f36198q = i0.b.e;

    public pt() {
        fh.b bVar = new fh.b();
        this.f36200s = bVar;
        this.f36201t = new ah.c(bVar);
        this.f36202u = new ColorDrawable(1895825408);
        this.A = new ImageReceiver();
        this.B = new ImageReceiver();
        this.E = false;
        this.I = AndroidUtilities.dp(200.0f);
        this.N = new Paint(1);
        this.U = new lt(this);
    }

    public static void a(pt ptVar, Bitmap bitmap, Bitmap bitmap2) {
        fh.b bVar = ptVar.f36200s;
        Paint paint = ptVar.N;
        ptVar.A.setVisible(true, false);
        ptVar.v = bitmap;
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
        gh.d.c(bVar, ptVar.f36205y);
        ptVar.f36201t.d();
        ptVar.f36187e0 = false;
        ci.m6 m6Var = ptVar.f36206z;
        if (m6Var != null) {
            m6Var.invalidate();
        }
    }

    public static int d(pt ptVar, int i10) {
        return org.telegram.ui.ActionBar.h6.v0(i10, ptVar.f36185c0);
    }

    public static boolean h(pt ptVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        float f7;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2;
        qh.q qVar;
        nt ntVar = ptVar.f36193l;
        if (ntVar == null) {
            return false;
        }
        TLRPC.TL_messageMediaPoll d = ntVar.d();
        TLRPC.PollAnswer h = ptVar.f36193l.h();
        if (d == null || d.poll == null || h == null) {
            return false;
        }
        TLRPC.PollAnswerVoters pollResult = MessageObject.getPollResult(d, h.option);
        if (pollResult != null && pollResult.voters > 0 && MessageObject.canShowVotersList(d)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!MessageObject.isVoted(d) && !d.poll.closed && !ptVar.f36193l.c()) {
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
            qh.q qVar2 = new qh.q(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext(), ptVar.f36199r, ptVar.f36185c0);
            org.telegram.ui.Components.o70 o70Var = new org.telegram.ui.Components.o70(actionBarPopupWindow$ActionBarPopupWindowLayout, ptVar.f36185c0);
            int b10 = actionBarPopupWindow$ActionBarPopupWindowLayout.b(o70Var.B);
            int i10 = org.telegram.ui.ActionBar.h6.E8;
            o70Var.T(org.telegram.ui.ActionBar.h6.l1(0.06f, org.telegram.ui.ActionBar.h6.v0(i10, ptVar.f36185c0)));
            ah.c cVar = ptVar.f36201t;
            dh.e k10 = eh.b.k(ptVar.f36185c0);
            org.telegram.ui.ActionBar.n2 n2Var = null;
            View view = o70Var.B;
            if (view != null) {
                ch.d c10 = cVar.c(view, null, true);
                c10.o(k10);
                view.setBackground(c10);
            }
            z13 = true;
            o70Var.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new aj(actionBarPopupWindow$ActionBarPopupWindowLayout, 15), false);
            o70Var.k();
            MessageObject A = ptVar.f36193l.A();
            Activity activity = ptVar.f36203w;
            if ((activity instanceof LaunchActivity) && A != null) {
                LaunchActivity launchActivity = (LaunchActivity) activity;
                if (launchActivity.O() != null && launchActivity.O().getLastFragment() != null) {
                    n2Var = launchActivity.O().getLastFragment();
                }
                if (n2Var != null) {
                    org.telegram.ui.Components.d61 a2 = qVar2.a(n2Var, A.getDialogId(), A.getId(), h.option, pollResult.voters, new dt(0, ptVar, n2Var));
                    qVar = qVar2;
                    o70Var.q(a2);
                    qVar.setText(LocaleController.formatPluralString("PollVotesCount", pollResult.voters, new Object[0]));
                    qVar.f41755a.d(pollResult.recent_voters, false);
                    qVar.setLayoutParams(w7.x5.n(-1, 48));
                    qVar.setBackground(org.telegram.ui.ActionBar.h6.Y(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.I5, ptVar.f36185c0), 12, 0));
                    qVar.setOnClickListener(new ci.n4(actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 17));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(qVar);
                    org.telegram.ui.ActionBar.k1 k1Var = new org.telegram.ui.ActionBar.k1(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext(), ptVar.f36185c0);
                    k1Var.setTag(R.id.fit_width_tag, 1);
                    k1Var.setColor(org.telegram.ui.ActionBar.h6.l1(0.06f, org.telegram.ui.ActionBar.h6.v0(i10, ptVar.f36185c0)));
                    k1Var.setLayoutParams(w7.x5.n(-1, 8));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(k1Var);
                }
            }
            qVar = qVar2;
            qVar.setText(LocaleController.formatPluralString("PollVotesCount", pollResult.voters, new Object[0]));
            qVar.f41755a.d(pollResult.recent_voters, false);
            qVar.setLayoutParams(w7.x5.n(-1, 48));
            qVar.setBackground(org.telegram.ui.ActionBar.h6.Y(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.I5, ptVar.f36185c0), 12, 0));
            qVar.setOnClickListener(new ci.n4(actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 17));
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(qVar);
            org.telegram.ui.ActionBar.k1 k1Var2 = new org.telegram.ui.ActionBar.k1(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext(), ptVar.f36185c0);
            k1Var2.setTag(R.id.fit_width_tag, 1);
            k1Var2.setColor(org.telegram.ui.ActionBar.h6.l1(0.06f, org.telegram.ui.ActionBar.h6.v0(i10, ptVar.f36185c0)));
            k1Var2.setLayoutParams(w7.x5.n(-1, 8));
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(k1Var2);
        } else {
            z13 = true;
        }
        if (z11) {
            f7 = 0.06f;
            org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_select, LocaleController.getString(R.string.PollSubmitVotesNoCaps), false, ptVar.f36185c0).setOnClickListener(new ct(ptVar, 2));
        } else {
            f7 = 0.06f;
        }
        if (z12) {
            actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_unvote, LocaleController.getString(R.string.Unvote), false, ptVar.f36185c0).setOnClickListener(new ct(ptVar, 3));
        } else {
            actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
        }
        if (!z10 && (z11 || z12)) {
            org.telegram.ui.ActionBar.k1 k1Var3 = new org.telegram.ui.ActionBar.k1(actionBarPopupWindow$ActionBarPopupWindowLayout2.getContext(), ptVar.f36185c0);
            k1Var3.setTag(R.id.fit_width_tag, 1);
            k1Var3.setColor(org.telegram.ui.ActionBar.h6.l1(f7, org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.E8, ptVar.f36185c0)));
            k1Var3.setLayoutParams(w7.x5.n(-1, 8));
            actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(k1Var3);
        }
        if (!z10 && !z11 && !z12) {
            return false;
        }
        return z13;
    }

    public static pt q() {
        pt ptVar;
        pt ptVar2 = f36179g0;
        if (ptVar2 == null) {
            synchronized (PhotoViewer.class) {
                try {
                    ptVar = f36179g0;
                    if (ptVar == null) {
                        ptVar = new pt();
                        f36179g0 = ptVar;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return ptVar;
        }
        return ptVar2;
    }

    public final void n() {
        if (this.f36203w != null && !this.K) {
            AndroidUtilities.cancelRunOnUIThread(this.U);
            this.F = 1.0f;
            this.H = System.currentTimeMillis();
            this.f36206z.invalidate();
            this.W = null;
            this.f36181a0 = null;
            this.Y = null;
            this.f36193l = null;
            this.E = false;
            AndroidUtilities.runOnUIThread(new at(this, 0), 200L);
            ah1 ah1Var = this.O;
            if (ah1Var != null) {
                ah1Var.animate().alpha(0.0f).translationY(AndroidUtilities.dp(56.0f)).setDuration(150L).setInterpolator(org.telegram.ui.Components.rr.f27701f).start();
            }
            FrameLayout frameLayout = this.Q;
            if (frameLayout != null) {
                frameLayout.animate().alpha(0.0f).setDuration(150L).scaleX(0.6f).scaleY(0.6f).setInterpolator(org.telegram.ui.Components.rr.f27701f).start();
            }
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 8);
        }
    }

    public final void o() {
        zg.c0 reactionsWindow;
        org.telegram.ui.Components.zb zbVar = this.P;
        if (zbVar != null && (reactionsWindow = zbVar.getReactionsWindow()) != null && !reactionsWindow.f48940q) {
            reactionsWindow.d();
            return;
        }
        this.K = false;
        p();
        n();
    }

    public final void p() {
        org.telegram.ui.ActionBar.n1 n1Var = this.f36192k;
        if (n1Var != null) {
            n1Var.dismiss();
            this.f36192k = null;
            return;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.L;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            org.telegram.messenger.ul.r(actionBarPopupWindow$ActionBarPopupWindowLayout.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).translationY(AndroidUtilities.dp(-12.0f)), org.telegram.ui.Components.rr.h, 320L);
            this.L = null;
            this.K = false;
            if (this.R) {
                n();
            }
        }
    }

    public final boolean r(MotionEvent motionEvent, org.telegram.ui.Components.ml0 ml0Var, nt ntVar, org.telegram.ui.ActionBar.d6 d6Var) {
        int i10;
        this.f36193l = ntVar;
        if (ntVar != null) {
            this.f36194m = ntVar.l();
            this.f36195n = this.f36193l.q();
        }
        nt ntVar2 = this.f36193l;
        if ((ntVar2 == null || ntVar2.i()) && motionEvent.getAction() == 0) {
            int x10 = (int) motionEvent.getX();
            int y3 = (int) motionEvent.getY();
            int childCount = ml0Var.getChildCount();
            int i11 = 0;
            while (true) {
                if (i11 >= childCount) {
                    break;
                }
                View childAt = ml0Var.getChildAt(i11);
                if (childAt == null) {
                    break;
                }
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                int left = childAt.getLeft();
                int right = childAt.getRight();
                if (top <= y3 && bottom >= y3 && left <= x10 && right >= x10) {
                    boolean z10 = childAt instanceof org.telegram.ui.Cells.g8;
                    ImageReceiver imageReceiver = this.A;
                    if (z10) {
                        if (((org.telegram.ui.Cells.g8) childAt).f20109a.hasNotThumb()) {
                            imageReceiver.setRoundRadius(0);
                            i10 = 0;
                        }
                        i10 = -1;
                    } else if (childAt instanceof org.telegram.ui.Cells.e8) {
                        if (((org.telegram.ui.Cells.e8) childAt).f19967a.getImageReceiver().getBitmap() != null) {
                            imageReceiver.setRoundRadius(0);
                            i10 = 0;
                        }
                        i10 = -1;
                    } else {
                        i10 = 2;
                        if (childAt instanceof org.telegram.ui.Cells.e2) {
                            org.telegram.ui.Cells.e2 e2Var = (org.telegram.ui.Cells.e2) childAt;
                            if (e2Var.f19922a.getBitmap() != null) {
                                int i12 = e2Var.O;
                                if (i12 == 6) {
                                    imageReceiver.setRoundRadius(0);
                                    i10 = 0;
                                } else if (i12 == 2 && e2Var.f19936s) {
                                    imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
                                    i10 = 1;
                                }
                            }
                            i10 = -1;
                        } else if (childAt instanceof org.telegram.ui.Components.kv) {
                            imageReceiver.setRoundRadius(0);
                        } else if ((childAt instanceof org.telegram.ui.Components.uy) && ((org.telegram.ui.Components.uy) childAt).getSpan() != null) {
                            imageReceiver.setRoundRadius(0);
                        } else {
                            if ((childAt instanceof org.telegram.ui.Components.ly0) && (((org.telegram.ui.Components.ly0) childAt).f25956b instanceof org.telegram.ui.Components.q5)) {
                                imageReceiver.setRoundRadius(0);
                            }
                            i10 = -1;
                        }
                    }
                    if (i10 != -1) {
                        this.f36180a = x10;
                        this.f36182b = y3;
                        this.h = childAt;
                        org.telegram.ui.Components.r11 r11Var = new org.telegram.ui.Components.r11(this, ml0Var, i10, d6Var, 1);
                        this.f36191j = r11Var;
                        AndroidUtilities.runOnUIThread(r11Var, 200L);
                        return true;
                    }
                } else {
                    i11++;
                }
            }
        }
        return false;
    }

    public final boolean s(android.view.MotionEvent r17, org.telegram.ui.Components.ml0 r18, java.lang.Object r19, org.telegram.ui.nt r20, org.telegram.ui.ActionBar.d6 r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.pt.s(android.view.MotionEvent, org.telegram.ui.Components.ml0, java.lang.Object, org.telegram.ui.nt, org.telegram.ui.ActionBar.d6):boolean");
    }

    public final void t(TLRPC.Document document, SendMessagesHelper.ImportingSticker importingSticker, String str, String str2, TLRPC.BotInlineResult botInlineResult, int i10, boolean z10, Object obj, org.telegram.ui.ActionBar.d6 d6Var, int i11) {
        int i12;
        ImageReceiver imageReceiver;
        String str3;
        String str4;
        boolean z11;
        long j3;
        TLRPC.InputStickerSet inputStickerSet;
        ImageReceiver imageReceiver2;
        long j10;
        CharSequence charSequence;
        String str5;
        int i13;
        String str6;
        ImageReceiver imageReceiver3;
        lt ltVar;
        if (this.f36203w != null && this.f36205y != null) {
            this.f36185c0 = d6Var;
            this.f36197p = z10;
            this.G = null;
            if (AndroidUtilities.isDarkColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f18789d6, d6Var))) {
                i12 = 1895825408;
            } else {
                i12 = 1692853990;
            }
            this.f36202u.setColor(i12);
            this.S = false;
            ImageReceiver imageReceiver4 = this.A;
            imageReceiver4.setColorFilter(null);
            ImageReceiver imageReceiver5 = this.B;
            lt ltVar2 = this.U;
            if (i10 == 0 || i10 == 2 || i10 == 3) {
                ImageReceiver imageReceiver6 = imageReceiver5;
                if (document != null || importingSticker != null) {
                    if (f36178f0 == null) {
                        TextPaint textPaint = new TextPaint(1);
                        f36178f0 = textPaint;
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
                            this.G = new StaticLayout(AndroidUtilities.replaceCharSequence("…", TextUtils.ellipsize(Emoji.replaceEmoji(str, f36178f0.getFontMetricsInt(), false), f36178f0, AndroidUtilities.dp(200.0f), TextUtils.TruncateAt.END), ""), f36178f0, AndroidUtilities.dp(200.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                        } else {
                            imageReceiver2 = imageReceiver4;
                        }
                        if (inputStickerSet != null || i10 == 2) {
                            AndroidUtilities.cancelRunOnUIThread(ltVar2);
                            if (i11 > 0) {
                                j10 = i11;
                            } else {
                                j10 = 1300;
                            }
                            AndroidUtilities.runOnUIThread(ltVar2, j10);
                        }
                        TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(this.f36199r).getStickerSet(inputStickerSet, true);
                        if (stickerSet != null && stickerSet.documents.isEmpty()) {
                            inputStickerSet = null;
                        }
                        this.f36181a0 = inputStickerSet;
                        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                        if (MessageObject.isVideoStickerDocument(document)) {
                            charSequence = "";
                            str5 = "…";
                            imageReceiver4 = imageReceiver2;
                            imageReceiver4.setImage(ImageLocation.getForDocument(document), null, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), null, null, 0L, "webp", this.f36181a0, 1);
                        } else {
                            charSequence = "";
                            str5 = "…";
                            imageReceiver4 = imageReceiver2;
                            imageReceiver4.setImage(ImageLocation.getForDocument(document), (String) null, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), (String) null, "webp", this.f36181a0, 1);
                            if (MessageObject.isPremiumSticker(document)) {
                                this.S = true;
                                imageReceiver.setImage(ImageLocation.getForDocument(MessageObject.getPremiumStickerAnimation(document), document), (String) null, (ImageLocation) null, (String) null, "tgs", this.f36181a0, 1);
                            }
                        }
                        if (MessageObject.isTextColorEmoji(document)) {
                            imageReceiver4.setColorFilter(org.telegram.ui.ActionBar.h6.n0(d6Var));
                        }
                        if (this.G == null) {
                            int i15 = 0;
                            while (true) {
                                if (i15 >= document.attributes.size()) {
                                    break;
                                }
                                TLRPC.DocumentAttribute documentAttribute2 = document.attributes.get(i15);
                                if ((documentAttribute2 instanceof TLRPC.TL_documentAttributeSticker) && !TextUtils.isEmpty(documentAttribute2.alt)) {
                                    this.G = new StaticLayout(AndroidUtilities.replaceCharSequence(str5, TextUtils.ellipsize(Emoji.replaceEmoji(documentAttribute2.alt, f36178f0.getFontMetricsInt(), false), f36178f0, AndroidUtilities.dp(200.0f), TextUtils.TruncateAt.END), charSequence), f36178f0, AndroidUtilities.dp(200.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
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
                                    org.telegram.ui.Components.fd0 fd0Var = new org.telegram.ui.Components.fd0(this.f36206z.getContext());
                                    this.C = fd0Var;
                                    this.f36206z.addView(fd0Var, new FrameLayout.LayoutParams(512, 512));
                                }
                                z11 = false;
                                this.C.b(importingSticker.videoEditedInfo.mediaEntities, true, true, false);
                            } else {
                                z11 = false;
                            }
                            if (str != null) {
                                this.G = new StaticLayout(AndroidUtilities.replaceCharSequence("…", TextUtils.ellipsize(Emoji.replaceEmoji(str, f36178f0.getFontMetricsInt(), z11), f36178f0, AndroidUtilities.dp(200.0f), TextUtils.TruncateAt.END), ""), f36178f0, AndroidUtilities.dp(200.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                            }
                            this.f36193l.getClass();
                            AndroidUtilities.cancelRunOnUIThread(ltVar2);
                            if (i11 > 0) {
                                j3 = i11;
                            } else {
                                j3 = 1300;
                            }
                            AndroidUtilities.runOnUIThread(ltVar2, j3);
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
                        ltVar = ltVar2;
                        imageReceiver4.setImage(forDocument, null, ImageLocation.getForDocument(documentVideoThumb, document), null, ImageLocation.getForDocument(closestPhotoSizeWithSize2, document), "90_90_b", null, document.size, null, "gif" + document, 0);
                    } else {
                        imageReceiver3 = imageReceiver5;
                        ltVar = ltVar2;
                        imageReceiver4 = imageReceiver4;
                        imageReceiver4.setImage(forDocument, null, ImageLocation.getForDocument(closestPhotoSizeWithSize2, document), "90_90_b", document.size, null, "gif" + document, 0);
                    }
                } else {
                    imageReceiver3 = imageReceiver5;
                    ltVar = ltVar2;
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
                AndroidUtilities.cancelRunOnUIThread(ltVar);
                AndroidUtilities.runOnUIThread(ltVar, 2000L);
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
            this.f36183b0 = obj;
            this.f36185c0 = d6Var;
            this.f36206z.invalidate();
            if (!this.E) {
                AndroidUtilities.lockOrientation(this.f36203w);
                try {
                    if (this.f36205y.getParent() != null) {
                        str6 = str4;
                        try {
                            ((WindowManager) this.f36203w.getSystemService(str6)).removeView(this.f36205y);
                        } catch (Exception e) {
                            e = e;
                            FileLog.e(e);
                            ((WindowManager) this.f36203w.getSystemService(str6)).addView(this.f36205y, this.f36204x);
                            this.E = true;
                            this.F = 0.0f;
                            this.f36184c = -10000.0f;
                            this.f36189g = 0.0f;
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
                ((WindowManager) this.f36203w.getSystemService(str6)).addView(this.f36205y, this.f36204x);
                this.E = true;
                this.F = 0.0f;
                this.f36184c = -10000.0f;
                this.f36189g = 0.0f;
                this.d = 0.0f;
                this.e = 0.0f;
                this.H = System.currentTimeMillis();
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 8);
            }
        }
    }

    public final void u() {
        org.telegram.ui.Components.r11 r11Var = this.f36191j;
        if (r11Var != null) {
            AndroidUtilities.cancelRunOnUIThread(r11Var);
            this.f36191j = null;
        }
        View view = this.h;
        if (view != null) {
            if (view instanceof org.telegram.ui.Cells.g8) {
                ((org.telegram.ui.Cells.g8) view).setScaled(false);
            } else if (view instanceof org.telegram.ui.Cells.e8) {
                ((org.telegram.ui.Cells.e8) view).setScaled(false);
            } else if (view instanceof org.telegram.ui.Cells.e2) {
                ((org.telegram.ui.Cells.e2) view).setScaled(false);
            }
            this.h = null;
        }
    }

    public final void v(nt ntVar) {
        this.f36193l = ntVar;
        if (ntVar != null) {
            this.f36194m = ntVar.l();
            this.f36195n = this.f36193l.q();
        }
    }

    public final void w(Activity activity) {
        int i10 = UserConfig.selectedAccount;
        this.f36199r = i10;
        ImageReceiver imageReceiver = this.A;
        imageReceiver.setCurrentAccount(i10);
        imageReceiver.setLayerNum(Integer.MAX_VALUE);
        int i11 = this.f36199r;
        ImageReceiver imageReceiver2 = this.B;
        imageReceiver2.setCurrentAccount(i11);
        imageReceiver2.setLayerNum(Integer.MAX_VALUE);
        if (this.f36203w == activity) {
            return;
        }
        this.f36203w = activity;
        this.J = activity.getResources().getDrawable(R.drawable.preview_arrow);
        this.f36205y = new k0(this, activity, 5);
        hh.k kVar = new hh.k(this.f36205y);
        k0 k0Var = this.f36205y;
        ah.c cVar = this.f36201t;
        cVar.f425f = kVar;
        cVar.f426g = k0Var;
        cVar.e = new pe.b(true);
        this.f36205y.setFocusable(true);
        this.f36205y.setFocusableInTouchMode(true);
        this.f36205y.setSystemUiVisibility(1792);
        k0 k0Var2 = this.f36205y;
        bt btVar = new bt(this);
        WeakHashMap weakHashMap = r0.i0.f41795a;
        r0.a0.j(k0Var2, btVar);
        ci.m6 m6Var = new ci.m6(this, activity);
        this.f36206z = m6Var;
        m6Var.setFocusable(false);
        this.f36205y.addView(this.f36206z, w7.x5.e(-1, -1, 51));
        this.f36206z.setOnTouchListener(new e0(this, 1));
        MessagesController.getInstance(this.f36199r);
        this.I = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f36204x = layoutParams;
        layoutParams.height = -1;
        layoutParams.format = -3;
        layoutParams.width = -1;
        layoutParams.gravity = 48;
        layoutParams.type = 99;
        layoutParams.flags = -2147286784;
        AndroidUtilities.applyEdgeToEdgeLayoutParams(layoutParams);
        imageReceiver.setAspectFit(true);
        imageReceiver.setInvalidateAll(true);
        imageReceiver.setParentView(this.f36206z);
        imageReceiver2.setAspectFit(true);
        imageReceiver2.setInvalidateAll(true);
        imageReceiver2.setParentView(this.f36206z);
    }

    public final void x() {
        this.T = null;
    }

    public final boolean y(View view) {
        if (!(view instanceof org.telegram.ui.Cells.g8)) {
            return false;
        }
        Activity findActivity = AndroidUtilities.findActivity(view.getContext());
        if (findActivity == null) {
            return true;
        }
        w(findActivity);
        org.telegram.ui.Cells.g8 g8Var = (org.telegram.ui.Cells.g8) view;
        View view2 = this.h;
        if (view2 instanceof org.telegram.ui.Cells.g8) {
            ((org.telegram.ui.Cells.g8) view2).setScaled(false);
        } else if (view2 instanceof org.telegram.ui.Cells.e8) {
            ((org.telegram.ui.Cells.e8) view2).setScaled(false);
        } else if (view2 instanceof org.telegram.ui.Cells.e2) {
            ((org.telegram.ui.Cells.e2) view2).setScaled(false);
        }
        this.h = g8Var;
        TLRPC.Document sticker = g8Var.getSticker();
        SendMessagesHelper.ImportingSticker stickerPath = g8Var.getStickerPath();
        String str = null;
        String findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(g8Var.getSticker(), null, Integer.valueOf(this.f36199r));
        nt ntVar = this.f36193l;
        if (ntVar != null) {
            str = ntVar.G(false);
        }
        t(sticker, stickerPath, findAnimatedEmojiEmoticon, str, null, 0, g8Var.f20118y, g8Var.getParentObject(), this.f36185c0, 0);
        lt ltVar = this.U;
        AndroidUtilities.cancelRunOnUIThread(ltVar);
        AndroidUtilities.runOnUIThread(ltVar, 16L);
        g8Var.setScaled(true);
        return true;
    }
}
