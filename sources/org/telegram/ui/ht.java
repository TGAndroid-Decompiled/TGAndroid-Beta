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
    public static TextPaint f38907f0;
    public static volatile ht f38908g0;
    public final ImageReceiver A;
    public final ImageReceiver B;
    public org.telegram.ui.Components.mc0 C;
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
    public org.telegram.ui.Components.pb P;
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
    public int f38909a;
    public TLRPC.InputStickerSet f38910a0;
    public int f38911b;
    public Object f38912b0;
    public float f38913c;
    public org.telegram.ui.ActionBar.b6 f38914c0;
    public float d;
    public VibrationEffect f38915d0;
    public boolean f38917e0;
    public float f38918f;
    public float f38919g;
    public View h;
    public boolean f38920i;
    public org.telegram.ui.Components.y01 f38921j;
    public org.telegram.ui.ActionBar.o1 f38922k;
    public ft f38923l;
    public boolean f38924m;
    public boolean f38925n;
    public ArrayList f38926o;
    public boolean f38927p;
    public int f38929r;
    public final ng.b f38930s;
    public final ig.a f38931t;
    public final ColorDrawable f38932u;
    public Bitmap v;
    public Activity f38933w;
    public WindowManager.LayoutParams f38934x;
    public m0 f38935y;
    public fh.v f38936z;
    public float f38916e = 0.0f;
    public i0.b f38928q = i0.b.f10847e;

    public ht() {
        ng.b bVar = new ng.b();
        this.f38930s = bVar;
        this.f38931t = new ig.a(bVar);
        this.f38932u = new ColorDrawable(1895825408);
        this.A = new ImageReceiver();
        this.B = new ImageReceiver();
        this.E = false;
        this.I = AndroidUtilities.dp(200.0f);
        this.N = new Paint(1);
        this.U = new dt(this);
    }

    public static void a(ht htVar, Bitmap bitmap, Bitmap bitmap2) {
        ng.b bVar = htVar.f38930s;
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
        og.d.c(bVar, htVar.f38935y);
        htVar.f38931t.d();
        htVar.f38917e0 = false;
        fh.v vVar = htVar.f38936z;
        if (vVar != null) {
            vVar.invalidate();
        }
    }

    public static int d(ht htVar, int i9) {
        return org.telegram.ui.ActionBar.f6.v0(i9, htVar.f38914c0);
    }

    public static boolean h(ht htVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        float f10;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2;
        yg.q qVar;
        ft ftVar = htVar.f38923l;
        if (ftVar == null) {
            return false;
        }
        TLRPC.TL_messageMediaPoll d = ftVar.d();
        TLRPC.PollAnswer g10 = htVar.f38923l.g();
        if (d == null || d.poll == null || g10 == null) {
            return false;
        }
        TLRPC.PollAnswerVoters pollResult = MessageObject.getPollResult(d, g10.option);
        if (pollResult != null && pollResult.voters > 0 && MessageObject.canShowVotersList(d)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!MessageObject.isVoted(d) && !d.poll.closed && !htVar.f38923l.c()) {
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
            yg.q qVar2 = new yg.q(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext(), htVar.f38929r, htVar.f38914c0);
            org.telegram.ui.Components.x60 x60Var = new org.telegram.ui.Components.x60(actionBarPopupWindow$ActionBarPopupWindowLayout, htVar.f38914c0);
            int b10 = actionBarPopupWindow$ActionBarPopupWindowLayout.b(x60Var.B);
            int i9 = org.telegram.ui.ActionBar.f6.E8;
            x60Var.T(org.telegram.ui.ActionBar.f6.l1(0.06f, org.telegram.ui.ActionBar.f6.v0(i9, htVar.f38914c0)));
            ig.a aVar = htVar.f38931t;
            lg.d j10 = mg.c.j(htVar.f38914c0);
            org.telegram.ui.ActionBar.o2 o2Var = null;
            View view = x60Var.B;
            if (view != null) {
                kg.d c10 = aVar.c(view, null, true);
                c10.n(j10);
                view.setBackground(c10);
            }
            z13 = true;
            x60Var.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new ri(actionBarPopupWindow$ActionBarPopupWindowLayout, 15), false);
            x60Var.k();
            MessageObject z14 = htVar.f38923l.z();
            Activity activity = htVar.f38933w;
            if ((activity instanceof LaunchActivity) && z14 != null) {
                LaunchActivity launchActivity = (LaunchActivity) activity;
                if (launchActivity.O() != null && launchActivity.O().getLastFragment() != null) {
                    o2Var = launchActivity.O().getLastFragment();
                }
                if (o2Var != null) {
                    org.telegram.ui.Components.i51 a2 = qVar2.a(o2Var, z14.getDialogId(), z14.getId(), g10.option, pollResult.voters, new df(25, htVar, o2Var));
                    qVar = qVar2;
                    x60Var.q(a2);
                    qVar.setText(LocaleController.formatPluralString("PollVotesCount", pollResult.voters, new Object[0]));
                    qVar.f50259a.d(pollResult.recent_voters, false);
                    qVar.setLayoutParams(g7.e6.n(-1, 48));
                    qVar.setBackground(org.telegram.ui.ActionBar.f6.Y(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.I5, htVar.f38914c0), 12, 0));
                    qVar.setOnClickListener(new gh.z0(actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 16));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(qVar);
                    org.telegram.ui.ActionBar.l1 l1Var = new org.telegram.ui.ActionBar.l1(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext(), htVar.f38914c0);
                    l1Var.setTag(R.id.fit_width_tag, 1);
                    l1Var.setColor(org.telegram.ui.ActionBar.f6.l1(0.06f, org.telegram.ui.ActionBar.f6.v0(i9, htVar.f38914c0)));
                    l1Var.setLayoutParams(g7.e6.n(-1, 8));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(l1Var);
                }
            }
            qVar = qVar2;
            qVar.setText(LocaleController.formatPluralString("PollVotesCount", pollResult.voters, new Object[0]));
            qVar.f50259a.d(pollResult.recent_voters, false);
            qVar.setLayoutParams(g7.e6.n(-1, 48));
            qVar.setBackground(org.telegram.ui.ActionBar.f6.Y(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.I5, htVar.f38914c0), 12, 0));
            qVar.setOnClickListener(new gh.z0(actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 16));
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(qVar);
            org.telegram.ui.ActionBar.l1 l1Var2 = new org.telegram.ui.ActionBar.l1(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext(), htVar.f38914c0);
            l1Var2.setTag(R.id.fit_width_tag, 1);
            l1Var2.setColor(org.telegram.ui.ActionBar.f6.l1(0.06f, org.telegram.ui.ActionBar.f6.v0(i9, htVar.f38914c0)));
            l1Var2.setLayoutParams(g7.e6.n(-1, 8));
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(l1Var2);
        } else {
            z13 = true;
        }
        if (z11) {
            f10 = 0.06f;
            org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_select, LocaleController.getString(R.string.PollSubmitVotesNoCaps), false, htVar.f38914c0).setOnClickListener(new ws(htVar, 2));
        } else {
            f10 = 0.06f;
        }
        if (z12) {
            actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_unvote, LocaleController.getString(R.string.Unvote), false, htVar.f38914c0).setOnClickListener(new ws(htVar, 3));
        } else {
            actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
        }
        if (!z10 && (z11 || z12)) {
            org.telegram.ui.ActionBar.l1 l1Var3 = new org.telegram.ui.ActionBar.l1(actionBarPopupWindow$ActionBarPopupWindowLayout2.getContext(), htVar.f38914c0);
            l1Var3.setTag(R.id.fit_width_tag, 1);
            l1Var3.setColor(org.telegram.ui.ActionBar.f6.l1(f10, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.E8, htVar.f38914c0)));
            l1Var3.setLayoutParams(g7.e6.n(-1, 8));
            actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(l1Var3);
        }
        if (!z10 && !z11 && !z12) {
            return false;
        }
        return z13;
    }

    public static ht q() {
        ht htVar;
        ht htVar2 = f38908g0;
        if (htVar2 == null) {
            synchronized (PhotoViewer.class) {
                try {
                    htVar = f38908g0;
                    if (htVar == null) {
                        htVar = new ht();
                        f38908g0 = htVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return htVar;
        }
        return htVar2;
    }

    public final void n() {
        if (this.f38933w != null && !this.K) {
            AndroidUtilities.cancelRunOnUIThread(this.U);
            this.F = 1.0f;
            this.H = System.currentTimeMillis();
            this.f38936z.invalidate();
            this.W = null;
            this.f38910a0 = null;
            this.Y = null;
            this.f38923l = null;
            this.E = false;
            AndroidUtilities.runOnUIThread(new us(this, 0), 200L);
            bg1 bg1Var = this.O;
            if (bg1Var != null) {
                bg1Var.animate().alpha(0.0f).translationY(AndroidUtilities.dp(56.0f)).setDuration(150L).setInterpolator(org.telegram.ui.Components.gr.f28844f).start();
            }
            FrameLayout frameLayout = this.Q;
            if (frameLayout != null) {
                frameLayout.animate().alpha(0.0f).setDuration(150L).scaleX(0.6f).scaleY(0.6f).setInterpolator(org.telegram.ui.Components.gr.f28844f).start();
            }
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 8);
        }
    }

    public final void o() {
        hg.e0 reactionsWindow;
        org.telegram.ui.Components.pb pbVar = this.P;
        if (pbVar != null && (reactionsWindow = pbVar.getReactionsWindow()) != null && !reactionsWindow.f10588q) {
            reactionsWindow.d();
            return;
        }
        this.K = false;
        p();
        n();
    }

    public final void p() {
        org.telegram.ui.ActionBar.o1 o1Var = this.f38922k;
        if (o1Var != null) {
            o1Var.dismiss();
            this.f38922k = null;
            return;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.L;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            org.telegram.messenger.ll.r(actionBarPopupWindow$ActionBarPopupWindowLayout.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).translationY(AndroidUtilities.dp(-12.0f)), org.telegram.ui.Components.gr.h, 320L);
            this.L = null;
            this.K = false;
            if (this.R) {
                n();
            }
        }
    }

    public final boolean r(MotionEvent motionEvent, org.telegram.ui.Components.wk0 wk0Var, ft ftVar, org.telegram.ui.ActionBar.b6 b6Var) {
        int i9;
        this.f38923l = ftVar;
        if (ftVar != null) {
            this.f38924m = ftVar.j();
            this.f38925n = this.f38923l.o();
        }
        ft ftVar2 = this.f38923l;
        if ((ftVar2 == null || ftVar2.h()) && motionEvent.getAction() == 0) {
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            int childCount = wk0Var.getChildCount();
            int i10 = 0;
            while (true) {
                if (i10 >= childCount) {
                    break;
                }
                View childAt = wk0Var.getChildAt(i10);
                if (childAt == null) {
                    break;
                }
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                int left = childAt.getLeft();
                int right = childAt.getRight();
                if (top <= y10 && bottom >= y10 && left <= x10 && right >= x10) {
                    boolean z10 = childAt instanceof org.telegram.ui.Cells.d8;
                    ImageReceiver imageReceiver = this.A;
                    if (z10) {
                        if (((org.telegram.ui.Cells.d8) childAt).f24229a.hasNotThumb()) {
                            imageReceiver.setRoundRadius(0);
                            i9 = 0;
                        }
                        i9 = -1;
                    } else if (childAt instanceof org.telegram.ui.Cells.b8) {
                        if (((org.telegram.ui.Cells.b8) childAt).f24144a.getImageReceiver().getBitmap() != null) {
                            imageReceiver.setRoundRadius(0);
                            i9 = 0;
                        }
                        i9 = -1;
                    } else {
                        i9 = 2;
                        if (childAt instanceof org.telegram.ui.Cells.e2) {
                            org.telegram.ui.Cells.e2 e2Var = (org.telegram.ui.Cells.e2) childAt;
                            if (e2Var.f24270a.getBitmap() != null) {
                                int i11 = e2Var.K;
                                if (i11 == 6) {
                                    imageReceiver.setRoundRadius(0);
                                    i9 = 0;
                                } else if (i11 == 2 && e2Var.f24281s) {
                                    imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
                                    i9 = 1;
                                }
                            }
                            i9 = -1;
                        } else if (childAt instanceof org.telegram.ui.Components.uu) {
                            imageReceiver.setRoundRadius(0);
                        } else if ((childAt instanceof org.telegram.ui.Components.fy) && ((org.telegram.ui.Components.fy) childAt).getSpan() != null) {
                            imageReceiver.setRoundRadius(0);
                        } else {
                            if ((childAt instanceof org.telegram.ui.Components.tx0) && (((org.telegram.ui.Components.tx0) childAt).f32831b instanceof org.telegram.ui.Components.k5)) {
                                imageReceiver.setRoundRadius(0);
                            }
                            i9 = -1;
                        }
                    }
                    if (i9 != -1) {
                        this.f38909a = x10;
                        this.f38911b = y10;
                        this.h = childAt;
                        org.telegram.ui.Components.y01 y01Var = new org.telegram.ui.Components.y01(this, wk0Var, i9, b6Var, 1);
                        this.f38921j = y01Var;
                        AndroidUtilities.runOnUIThread(y01Var, 200L);
                        return true;
                    }
                } else {
                    i10++;
                }
            }
        }
        return false;
    }

    public final boolean s(android.view.MotionEvent r17, org.telegram.ui.Components.wk0 r18, java.lang.Object r19, org.telegram.ui.ft r20, org.telegram.ui.ActionBar.b6 r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ht.s(android.view.MotionEvent, org.telegram.ui.Components.wk0, java.lang.Object, org.telegram.ui.ft, org.telegram.ui.ActionBar.b6):boolean");
    }

    public final void t(TLRPC.Document document, SendMessagesHelper.ImportingSticker importingSticker, String str, String str2, TLRPC.BotInlineResult botInlineResult, int i9, boolean z10, Object obj, org.telegram.ui.ActionBar.b6 b6Var, int i10) {
        int i11;
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
        int i12;
        String str6;
        ImageReceiver imageReceiver3;
        dt dtVar;
        if (this.f38933w != null && this.f38935y != null) {
            this.f38914c0 = b6Var;
            this.f38927p = z10;
            this.G = null;
            if (AndroidUtilities.isDarkColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23001d6, b6Var))) {
                i11 = 1895825408;
            } else {
                i11 = 1692853990;
            }
            this.f38932u.setColor(i11);
            this.S = false;
            ImageReceiver imageReceiver4 = this.A;
            imageReceiver4.setColorFilter(null);
            ImageReceiver imageReceiver5 = this.B;
            dt dtVar2 = this.U;
            if (i9 == 0 || i9 == 2 || i9 == 3) {
                ImageReceiver imageReceiver6 = imageReceiver5;
                if (document != null || importingSticker != null) {
                    if (f38907f0 == null) {
                        TextPaint textPaint = new TextPaint(1);
                        f38907f0 = textPaint;
                        textPaint.setTextSize(AndroidUtilities.dp(24.0f));
                    }
                    imageReceiver6.clearImage();
                    this.S = false;
                    if (document != null) {
                        int i13 = 0;
                        while (true) {
                            if (i13 < document.attributes.size()) {
                                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i13);
                                imageReceiver = imageReceiver6;
                                if ((documentAttribute instanceof TLRPC.TL_documentAttributeSticker) && (inputStickerSet = documentAttribute.stickerset) != null) {
                                    break;
                                }
                                i13++;
                                imageReceiver6 = imageReceiver;
                            } else {
                                imageReceiver = imageReceiver6;
                                inputStickerSet = null;
                                break;
                            }
                        }
                        if (str != null) {
                            imageReceiver2 = imageReceiver4;
                            this.G = new StaticLayout(AndroidUtilities.replaceCharSequence("…", TextUtils.ellipsize(Emoji.replaceEmoji(str, f38907f0.getFontMetricsInt(), false), f38907f0, AndroidUtilities.dp(200.0f), TextUtils.TruncateAt.END), ""), f38907f0, AndroidUtilities.dp(200.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                        } else {
                            imageReceiver2 = imageReceiver4;
                        }
                        if (inputStickerSet != null || i9 == 2) {
                            AndroidUtilities.cancelRunOnUIThread(dtVar2);
                            if (i10 > 0) {
                                j11 = i10;
                            } else {
                                j11 = 1300;
                            }
                            AndroidUtilities.runOnUIThread(dtVar2, j11);
                        }
                        TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(this.f38929r).getStickerSet(inputStickerSet, true);
                        if (stickerSet != null && stickerSet.documents.isEmpty()) {
                            inputStickerSet = null;
                        }
                        this.f38910a0 = inputStickerSet;
                        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                        if (MessageObject.isVideoStickerDocument(document)) {
                            charSequence = "";
                            str5 = "…";
                            imageReceiver4 = imageReceiver2;
                            imageReceiver4.setImage(ImageLocation.getForDocument(document), null, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), null, null, 0L, "webp", this.f38910a0, 1);
                        } else {
                            charSequence = "";
                            str5 = "…";
                            imageReceiver4 = imageReceiver2;
                            imageReceiver4.setImage(ImageLocation.getForDocument(document), (String) null, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), (String) null, "webp", this.f38910a0, 1);
                            if (MessageObject.isPremiumSticker(document)) {
                                this.S = true;
                                imageReceiver.setImage(ImageLocation.getForDocument(MessageObject.getPremiumStickerAnimation(document), document), (String) null, (ImageLocation) null, (String) null, "tgs", this.f38910a0, 1);
                            }
                        }
                        if (MessageObject.isTextColorEmoji(document)) {
                            imageReceiver4.setColorFilter(org.telegram.ui.ActionBar.f6.n0(b6Var));
                        }
                        if (this.G == null) {
                            int i14 = 0;
                            while (true) {
                                if (i14 >= document.attributes.size()) {
                                    break;
                                }
                                TLRPC.DocumentAttribute documentAttribute2 = document.attributes.get(i14);
                                if ((documentAttribute2 instanceof TLRPC.TL_documentAttributeSticker) && !TextUtils.isEmpty(documentAttribute2.alt)) {
                                    this.G = new StaticLayout(AndroidUtilities.replaceCharSequence(str5, TextUtils.ellipsize(Emoji.replaceEmoji(documentAttribute2.alt, f38907f0.getFontMetricsInt(), false), f38907f0, AndroidUtilities.dp(200.0f), TextUtils.TruncateAt.END), charSequence), f38907f0, AndroidUtilities.dp(200.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                                    break;
                                }
                                i14++;
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
                                    org.telegram.ui.Components.mc0 mc0Var = new org.telegram.ui.Components.mc0(this.f38936z.getContext());
                                    this.C = mc0Var;
                                    this.f38936z.addView(mc0Var, new FrameLayout.LayoutParams(512, 512));
                                }
                                z11 = false;
                                this.C.b(importingSticker.videoEditedInfo.mediaEntities, true, true, false);
                            } else {
                                z11 = false;
                            }
                            if (str != null) {
                                this.G = new StaticLayout(AndroidUtilities.replaceCharSequence("…", TextUtils.ellipsize(Emoji.replaceEmoji(str, f38907f0.getFontMetricsInt(), z11), f38907f0, AndroidUtilities.dp(200.0f), TextUtils.TruncateAt.END), ""), f38907f0, AndroidUtilities.dp(200.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                            }
                            this.f38923l.getClass();
                            AndroidUtilities.cancelRunOnUIThread(dtVar2);
                            if (i10 > 0) {
                                j10 = i10;
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
                i12 = 0;
                imageReceiver4.getLottieAnimation().K(0);
            } else {
                i12 = 0;
            }
            if (this.S && imageReceiver.getLottieAnimation() != null) {
                imageReceiver.getLottieAnimation().K(i12);
            }
            this.V = i9;
            this.W = document;
            this.X = importingSticker;
            this.Y = str2;
            this.Z = botInlineResult;
            this.f38912b0 = obj;
            this.f38914c0 = b6Var;
            this.f38936z.invalidate();
            if (!this.E) {
                AndroidUtilities.lockOrientation(this.f38933w);
                try {
                    if (this.f38935y.getParent() != null) {
                        str6 = str4;
                        try {
                            ((WindowManager) this.f38933w.getSystemService(str6)).removeView(this.f38935y);
                        } catch (Exception e10) {
                            e = e10;
                            FileLog.e(e);
                            ((WindowManager) this.f38933w.getSystemService(str6)).addView(this.f38935y, this.f38934x);
                            this.E = true;
                            this.F = 0.0f;
                            this.f38913c = -10000.0f;
                            this.f38919g = 0.0f;
                            this.d = 0.0f;
                            this.f38916e = 0.0f;
                            this.H = System.currentTimeMillis();
                            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 8);
                        }
                    } else {
                        str6 = str4;
                    }
                } catch (Exception e11) {
                    e = e11;
                    str6 = str4;
                }
                ((WindowManager) this.f38933w.getSystemService(str6)).addView(this.f38935y, this.f38934x);
                this.E = true;
                this.F = 0.0f;
                this.f38913c = -10000.0f;
                this.f38919g = 0.0f;
                this.d = 0.0f;
                this.f38916e = 0.0f;
                this.H = System.currentTimeMillis();
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 8);
            }
        }
    }

    public final void u() {
        org.telegram.ui.Components.y01 y01Var = this.f38921j;
        if (y01Var != null) {
            AndroidUtilities.cancelRunOnUIThread(y01Var);
            this.f38921j = null;
        }
        View view = this.h;
        if (view != null) {
            if (view instanceof org.telegram.ui.Cells.d8) {
                ((org.telegram.ui.Cells.d8) view).setScaled(false);
            } else if (view instanceof org.telegram.ui.Cells.b8) {
                ((org.telegram.ui.Cells.b8) view).setScaled(false);
            } else if (view instanceof org.telegram.ui.Cells.e2) {
                ((org.telegram.ui.Cells.e2) view).setScaled(false);
            }
            this.h = null;
        }
    }

    public final void v(ft ftVar) {
        this.f38923l = ftVar;
        if (ftVar != null) {
            this.f38924m = ftVar.j();
            this.f38925n = this.f38923l.o();
        }
    }

    public final void w(Activity activity) {
        int i9 = UserConfig.selectedAccount;
        this.f38929r = i9;
        ImageReceiver imageReceiver = this.A;
        imageReceiver.setCurrentAccount(i9);
        imageReceiver.setLayerNum(Integer.MAX_VALUE);
        int i10 = this.f38929r;
        ImageReceiver imageReceiver2 = this.B;
        imageReceiver2.setCurrentAccount(i10);
        imageReceiver2.setLayerNum(Integer.MAX_VALUE);
        if (this.f38933w == activity) {
            return;
        }
        this.f38933w = activity;
        this.J = activity.getResources().getDrawable(R.drawable.preview_arrow);
        this.f38935y = new m0(this, activity, 5);
        pg.i iVar = new pg.i(this.f38935y);
        m0 m0Var = this.f38935y;
        ig.a aVar = this.f38931t;
        aVar.d = iVar;
        aVar.f11131e = m0Var;
        aVar.f11130c = new xd.b(true);
        this.f38935y.setFocusable(true);
        this.f38935y.setFocusableInTouchMode(true);
        this.f38935y.setSystemUiVisibility(1792);
        m0 m0Var2 = this.f38935y;
        vs vsVar = new vs(this);
        WeakHashMap weakHashMap = r0.j0.f46915a;
        r0.b0.j(m0Var2, vsVar);
        fh.v vVar = new fh.v(this, activity);
        this.f38936z = vVar;
        vVar.setFocusable(false);
        this.f38935y.addView(this.f38936z, g7.e6.e(-1, -1, 51));
        this.f38936z.setOnTouchListener(new f0(this, 1));
        MessagesController.getInstance(this.f38929r);
        this.I = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f38934x = layoutParams;
        layoutParams.height = -1;
        layoutParams.format = -3;
        layoutParams.width = -1;
        layoutParams.gravity = 48;
        layoutParams.type = 99;
        layoutParams.flags = -2147286784;
        AndroidUtilities.applyEdgeToEdgeLayoutParams(layoutParams);
        imageReceiver.setAspectFit(true);
        imageReceiver.setInvalidateAll(true);
        imageReceiver.setParentView(this.f38936z);
        imageReceiver2.setAspectFit(true);
        imageReceiver2.setInvalidateAll(true);
        imageReceiver2.setParentView(this.f38936z);
    }

    public final void x() {
        this.T = null;
    }

    public final boolean y(View view) {
        if (!(view instanceof org.telegram.ui.Cells.d8)) {
            return false;
        }
        Activity findActivity = AndroidUtilities.findActivity(view.getContext());
        if (findActivity == null) {
            return true;
        }
        w(findActivity);
        org.telegram.ui.Cells.d8 d8Var = (org.telegram.ui.Cells.d8) view;
        View view2 = this.h;
        if (view2 instanceof org.telegram.ui.Cells.d8) {
            ((org.telegram.ui.Cells.d8) view2).setScaled(false);
        } else if (view2 instanceof org.telegram.ui.Cells.b8) {
            ((org.telegram.ui.Cells.b8) view2).setScaled(false);
        } else if (view2 instanceof org.telegram.ui.Cells.e2) {
            ((org.telegram.ui.Cells.e2) view2).setScaled(false);
        }
        this.h = d8Var;
        TLRPC.Document sticker = d8Var.getSticker();
        SendMessagesHelper.ImportingSticker stickerPath = d8Var.getStickerPath();
        String str = null;
        String findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(d8Var.getSticker(), null, Integer.valueOf(this.f38929r));
        ft ftVar = this.f38923l;
        if (ftVar != null) {
            str = ftVar.G(false);
        }
        t(sticker, stickerPath, findAnimatedEmojiEmoticon, str, null, 0, d8Var.f24239y, d8Var.getParentObject(), this.f38914c0, 0);
        dt dtVar = this.U;
        AndroidUtilities.cancelRunOnUIThread(dtVar);
        AndroidUtilities.runOnUIThread(dtVar, 16L);
        d8Var.setScaled(true);
        return true;
    }
}
