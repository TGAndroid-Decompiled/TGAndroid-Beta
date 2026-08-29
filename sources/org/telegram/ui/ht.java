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
    public static TextPaint f39016f0;
    public static volatile ht f39017g0;
    public final ImageReceiver A;
    public final ImageReceiver B;
    public org.telegram.ui.Components.bd0 C;
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
    public dg1 O;
    public org.telegram.ui.Components.vb P;
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
    public int f39018a;
    public TLRPC.InputStickerSet f39019a0;
    public int f39020b;
    public Object f39021b0;
    public float f39022c;
    public org.telegram.ui.ActionBar.c6 f39023c0;
    public float d;
    public VibrationEffect f39024d0;
    public boolean f39026e0;
    public float f39027f;
    public float f39028g;
    public View h;
    public boolean f39029i;
    public vs f39030j;
    public org.telegram.ui.ActionBar.o1 f39031k;
    public ft f39032l;
    public boolean f39033m;
    public boolean f39034n;
    public ArrayList f39035o;
    public boolean f39036p;
    public int f39038r;
    public final qg.b f39039s;
    public final lg.a f39040t;
    public final ColorDrawable f39041u;
    public Bitmap v;
    public Activity f39042w;
    public WindowManager.LayoutParams f39043x;
    public n0 f39044y;
    public bg.d1 f39045z;
    public float f39025e = 0.0f;
    public i0.b f39037q = i0.b.f8185e;

    public ht() {
        qg.b bVar = new qg.b();
        this.f39039s = bVar;
        this.f39040t = new lg.a(bVar);
        this.f39041u = new ColorDrawable(1895825408);
        this.A = new ImageReceiver();
        this.B = new ImageReceiver();
        this.E = false;
        this.I = AndroidUtilities.dp(200.0f);
        this.N = new Paint(1);
        this.U = new dt(this);
    }

    public static void a(ht htVar, Bitmap bitmap, Bitmap bitmap2) {
        qg.b bVar = htVar.f39039s;
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
        rg.c.c(bVar, htVar.f39044y);
        htVar.f39040t.d();
        htVar.f39026e0 = false;
        bg.d1 d1Var = htVar.f39045z;
        if (d1Var != null) {
            d1Var.invalidate();
        }
    }

    public static int d(ht htVar, int i10) {
        return org.telegram.ui.ActionBar.g6.v0(i10, htVar.f39023c0);
    }

    public static boolean h(ht htVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        float f9;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2;
        bh.u uVar;
        ft ftVar = htVar.f39032l;
        if (ftVar == null) {
            return false;
        }
        TLRPC.TL_messageMediaPoll d = ftVar.d();
        TLRPC.PollAnswer g10 = htVar.f39032l.g();
        if (d == null || d.poll == null || g10 == null) {
            return false;
        }
        TLRPC.PollAnswerVoters pollResult = MessageObject.getPollResult(d, g10.option);
        if (pollResult != null && pollResult.voters > 0 && MessageObject.canShowVotersList(d)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!MessageObject.isVoted(d) && !d.poll.closed && !htVar.f39032l.c()) {
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
            bh.u uVar2 = new bh.u(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext(), htVar.f39038r, htVar.f39023c0);
            org.telegram.ui.Components.j70 j70Var = new org.telegram.ui.Components.j70(actionBarPopupWindow$ActionBarPopupWindowLayout, htVar.f39023c0);
            int b10 = actionBarPopupWindow$ActionBarPopupWindowLayout.b(j70Var.B);
            int i10 = org.telegram.ui.ActionBar.g6.E8;
            j70Var.T(org.telegram.ui.ActionBar.g6.l1(0.06f, org.telegram.ui.ActionBar.g6.v0(i10, htVar.f39023c0)));
            lg.a aVar = htVar.f39040t;
            og.d j10 = pg.a.j(htVar.f39023c0);
            org.telegram.ui.ActionBar.o2 o2Var = null;
            View view = j70Var.B;
            if (view != null) {
                ng.d c3 = aVar.c(view, null, true);
                c3.n(j10);
                view.setBackground(c3);
            }
            z13 = true;
            j70Var.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new ui(actionBarPopupWindow$ActionBarPopupWindowLayout, 15), false);
            j70Var.k();
            MessageObject y8 = htVar.f39032l.y();
            Activity activity = htVar.f39042w;
            if ((activity instanceof LaunchActivity) && y8 != null) {
                LaunchActivity launchActivity = (LaunchActivity) activity;
                if (launchActivity.O() != null && launchActivity.O().getLastFragment() != null) {
                    o2Var = launchActivity.O().getLastFragment();
                }
                if (o2Var != null) {
                    org.telegram.ui.Components.u51 a2 = uVar2.a(o2Var, y8.getDialogId(), y8.getId(), g10.option, pollResult.voters, new tm(18, htVar, o2Var));
                    uVar = uVar2;
                    j70Var.q(a2);
                    uVar.setText(LocaleController.formatPluralString("PollVotesCount", pollResult.voters, new Object[0]));
                    uVar.f2708a.d(pollResult.recent_voters, false);
                    uVar.setLayoutParams(i7.f6.n(-1, 48));
                    uVar.setBackground(org.telegram.ui.ActionBar.g6.Y(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.I5, htVar.f39023c0), 12, 0));
                    uVar.setOnClickListener(new jh.y0(actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 16));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(uVar);
                    org.telegram.ui.ActionBar.l1 l1Var = new org.telegram.ui.ActionBar.l1(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext(), htVar.f39023c0);
                    l1Var.setTag(R.id.fit_width_tag, 1);
                    l1Var.setColor(org.telegram.ui.ActionBar.g6.l1(0.06f, org.telegram.ui.ActionBar.g6.v0(i10, htVar.f39023c0)));
                    l1Var.setLayoutParams(i7.f6.n(-1, 8));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(l1Var);
                }
            }
            uVar = uVar2;
            uVar.setText(LocaleController.formatPluralString("PollVotesCount", pollResult.voters, new Object[0]));
            uVar.f2708a.d(pollResult.recent_voters, false);
            uVar.setLayoutParams(i7.f6.n(-1, 48));
            uVar.setBackground(org.telegram.ui.ActionBar.g6.Y(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.I5, htVar.f39023c0), 12, 0));
            uVar.setOnClickListener(new jh.y0(actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 16));
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(uVar);
            org.telegram.ui.ActionBar.l1 l1Var2 = new org.telegram.ui.ActionBar.l1(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext(), htVar.f39023c0);
            l1Var2.setTag(R.id.fit_width_tag, 1);
            l1Var2.setColor(org.telegram.ui.ActionBar.g6.l1(0.06f, org.telegram.ui.ActionBar.g6.v0(i10, htVar.f39023c0)));
            l1Var2.setLayoutParams(i7.f6.n(-1, 8));
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(l1Var2);
        } else {
            z13 = true;
        }
        if (z11) {
            f9 = 0.06f;
            org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_select, LocaleController.getString(R.string.PollSubmitVotesNoCaps), false, htVar.f39023c0).setOnClickListener(new ws(htVar, 2));
        } else {
            f9 = 0.06f;
        }
        if (z12) {
            actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_unvote, LocaleController.getString(R.string.Unvote), false, htVar.f39023c0).setOnClickListener(new ws(htVar, 3));
        } else {
            actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
        }
        if (!z10 && (z11 || z12)) {
            org.telegram.ui.ActionBar.l1 l1Var3 = new org.telegram.ui.ActionBar.l1(actionBarPopupWindow$ActionBarPopupWindowLayout2.getContext(), htVar.f39023c0);
            l1Var3.setTag(R.id.fit_width_tag, 1);
            l1Var3.setColor(org.telegram.ui.ActionBar.g6.l1(f9, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.E8, htVar.f39023c0)));
            l1Var3.setLayoutParams(i7.f6.n(-1, 8));
            actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(l1Var3);
        }
        if (!z10 && !z11 && !z12) {
            return false;
        }
        return z13;
    }

    public static ht q() {
        ht htVar;
        ht htVar2 = f39017g0;
        if (htVar2 == null) {
            synchronized (PhotoViewer.class) {
                try {
                    htVar = f39017g0;
                    if (htVar == null) {
                        htVar = new ht();
                        f39017g0 = htVar;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return htVar;
        }
        return htVar2;
    }

    public final void n() {
        if (this.f39042w != null && !this.K) {
            AndroidUtilities.cancelRunOnUIThread(this.U);
            this.F = 1.0f;
            this.H = System.currentTimeMillis();
            this.f39045z.invalidate();
            this.W = null;
            this.f39019a0 = null;
            this.Y = null;
            this.f39032l = null;
            this.E = false;
            AndroidUtilities.runOnUIThread(new ts(this, 0), 200L);
            dg1 dg1Var = this.O;
            if (dg1Var != null) {
                dg1Var.animate().alpha(0.0f).translationY(AndroidUtilities.dp(56.0f)).setDuration(150L).setInterpolator(org.telegram.ui.Components.jr.f29800f).start();
            }
            FrameLayout frameLayout = this.Q;
            if (frameLayout != null) {
                frameLayout.animate().alpha(0.0f).setDuration(150L).scaleX(0.6f).scaleY(0.6f).setInterpolator(org.telegram.ui.Components.jr.f29800f).start();
            }
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 8);
        }
    }

    public final void o() {
        kg.d0 reactionsWindow;
        org.telegram.ui.Components.vb vbVar = this.P;
        if (vbVar != null && (reactionsWindow = vbVar.getReactionsWindow()) != null && !reactionsWindow.f13695q) {
            reactionsWindow.d();
            return;
        }
        this.K = false;
        p();
        n();
    }

    public final void p() {
        org.telegram.ui.ActionBar.o1 o1Var = this.f39031k;
        if (o1Var != null) {
            o1Var.dismiss();
            this.f39031k = null;
            return;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.L;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            b.q(actionBarPopupWindow$ActionBarPopupWindowLayout.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).translationY(AndroidUtilities.dp(-12.0f)), org.telegram.ui.Components.jr.h, 320L);
            this.L = null;
            this.K = false;
            if (this.R) {
                n();
            }
        }
    }

    public final boolean r(MotionEvent motionEvent, org.telegram.ui.Components.jl0 jl0Var, ft ftVar, org.telegram.ui.ActionBar.c6 c6Var) {
        int i10;
        this.f39032l = ftVar;
        if (ftVar != null) {
            this.f39033m = ftVar.j();
            this.f39034n = this.f39032l.o();
        }
        ft ftVar2 = this.f39032l;
        if ((ftVar2 == null || ftVar2.h()) && motionEvent.getAction() == 0) {
            int x4 = (int) motionEvent.getX();
            int y8 = (int) motionEvent.getY();
            int childCount = jl0Var.getChildCount();
            int i11 = 0;
            while (true) {
                if (i11 >= childCount) {
                    break;
                }
                View childAt = jl0Var.getChildAt(i11);
                if (childAt == null) {
                    break;
                }
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                int left = childAt.getLeft();
                int right = childAt.getRight();
                if (top <= y8 && bottom >= y8 && left <= x4 && right >= x4) {
                    boolean z10 = childAt instanceof org.telegram.ui.Cells.b8;
                    ImageReceiver imageReceiver = this.A;
                    if (z10) {
                        if (((org.telegram.ui.Cells.b8) childAt).f24124a.hasNotThumb()) {
                            imageReceiver.setRoundRadius(0);
                            i10 = 0;
                        }
                        i10 = -1;
                    } else if (childAt instanceof org.telegram.ui.Cells.z7) {
                        if (((org.telegram.ui.Cells.z7) childAt).f26055a.getImageReceiver().getBitmap() != null) {
                            imageReceiver.setRoundRadius(0);
                            i10 = 0;
                        }
                        i10 = -1;
                    } else {
                        i10 = 2;
                        if (childAt instanceof org.telegram.ui.Cells.d2) {
                            org.telegram.ui.Cells.d2 d2Var = (org.telegram.ui.Cells.d2) childAt;
                            if (d2Var.f24202a.getBitmap() != null) {
                                int i12 = d2Var.K;
                                if (i12 == 6) {
                                    imageReceiver.setRoundRadius(0);
                                    i10 = 0;
                                } else if (i12 == 2 && d2Var.f24213s) {
                                    imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
                                    i10 = 1;
                                }
                            }
                            i10 = -1;
                        } else if (childAt instanceof org.telegram.ui.Components.av) {
                            imageReceiver.setRoundRadius(0);
                        } else if ((childAt instanceof org.telegram.ui.Components.ny) && ((org.telegram.ui.Components.ny) childAt).getSpan() != null) {
                            imageReceiver.setRoundRadius(0);
                        } else {
                            if ((childAt instanceof org.telegram.ui.Components.ey0) && (((org.telegram.ui.Components.ey0) childAt).f28205b instanceof org.telegram.ui.Components.p5)) {
                                imageReceiver.setRoundRadius(0);
                            }
                            i10 = -1;
                        }
                    }
                    if (i10 != -1) {
                        this.f39018a = x4;
                        this.f39020b = y8;
                        this.h = childAt;
                        vs vsVar = new vs(this, jl0Var, i10, c6Var, 0);
                        this.f39030j = vsVar;
                        AndroidUtilities.runOnUIThread(vsVar, 200L);
                        return true;
                    }
                } else {
                    i11++;
                }
            }
        }
        return false;
    }

    public final boolean s(android.view.MotionEvent r17, org.telegram.ui.Components.jl0 r18, java.lang.Object r19, org.telegram.ui.ft r20, org.telegram.ui.ActionBar.c6 r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ht.s(android.view.MotionEvent, org.telegram.ui.Components.jl0, java.lang.Object, org.telegram.ui.ft, org.telegram.ui.ActionBar.c6):boolean");
    }

    public final void t(TLRPC.Document document, SendMessagesHelper.ImportingSticker importingSticker, String str, String str2, TLRPC.BotInlineResult botInlineResult, int i10, boolean z10, Object obj, org.telegram.ui.ActionBar.c6 c6Var, int i11) {
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
        if (this.f39042w != null && this.f39044y != null) {
            this.f39023c0 = c6Var;
            this.f39036p = z10;
            this.G = null;
            if (AndroidUtilities.isDarkColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23062d6, c6Var))) {
                i12 = 1895825408;
            } else {
                i12 = 1692853990;
            }
            this.f39041u.setColor(i12);
            this.S = false;
            ImageReceiver imageReceiver4 = this.A;
            imageReceiver4.setColorFilter(null);
            ImageReceiver imageReceiver5 = this.B;
            dt dtVar2 = this.U;
            if (i10 == 0 || i10 == 2 || i10 == 3) {
                ImageReceiver imageReceiver6 = imageReceiver5;
                if (document != null || importingSticker != null) {
                    if (f39016f0 == null) {
                        TextPaint textPaint = new TextPaint(1);
                        f39016f0 = textPaint;
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
                            this.G = new StaticLayout(AndroidUtilities.replaceCharSequence("…", TextUtils.ellipsize(Emoji.replaceEmoji(str, f39016f0.getFontMetricsInt(), false), f39016f0, AndroidUtilities.dp(200.0f), TextUtils.TruncateAt.END), ""), f39016f0, AndroidUtilities.dp(200.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
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
                        TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(this.f39038r).getStickerSet(inputStickerSet, true);
                        if (stickerSet != null && stickerSet.documents.isEmpty()) {
                            inputStickerSet = null;
                        }
                        this.f39019a0 = inputStickerSet;
                        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                        if (MessageObject.isVideoStickerDocument(document)) {
                            charSequence = "";
                            str5 = "…";
                            imageReceiver4 = imageReceiver2;
                            imageReceiver4.setImage(ImageLocation.getForDocument(document), null, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), null, null, 0L, "webp", this.f39019a0, 1);
                        } else {
                            charSequence = "";
                            str5 = "…";
                            imageReceiver4 = imageReceiver2;
                            imageReceiver4.setImage(ImageLocation.getForDocument(document), (String) null, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), (String) null, "webp", this.f39019a0, 1);
                            if (MessageObject.isPremiumSticker(document)) {
                                this.S = true;
                                imageReceiver.setImage(ImageLocation.getForDocument(MessageObject.getPremiumStickerAnimation(document), document), (String) null, (ImageLocation) null, (String) null, "tgs", this.f39019a0, 1);
                            }
                        }
                        if (MessageObject.isTextColorEmoji(document)) {
                            imageReceiver4.setColorFilter(org.telegram.ui.ActionBar.g6.n0(c6Var));
                        }
                        if (this.G == null) {
                            int i15 = 0;
                            while (true) {
                                if (i15 >= document.attributes.size()) {
                                    break;
                                }
                                TLRPC.DocumentAttribute documentAttribute2 = document.attributes.get(i15);
                                if ((documentAttribute2 instanceof TLRPC.TL_documentAttributeSticker) && !TextUtils.isEmpty(documentAttribute2.alt)) {
                                    this.G = new StaticLayout(AndroidUtilities.replaceCharSequence(str5, TextUtils.ellipsize(Emoji.replaceEmoji(documentAttribute2.alt, f39016f0.getFontMetricsInt(), false), f39016f0, AndroidUtilities.dp(200.0f), TextUtils.TruncateAt.END), charSequence), f39016f0, AndroidUtilities.dp(200.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
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
                                    org.telegram.ui.Components.bd0 bd0Var = new org.telegram.ui.Components.bd0(this.f39045z.getContext());
                                    this.C = bd0Var;
                                    this.f39045z.addView(bd0Var, new FrameLayout.LayoutParams(512, 512));
                                }
                                z11 = false;
                                this.C.b(importingSticker.videoEditedInfo.mediaEntities, true, true, false);
                            } else {
                                z11 = false;
                            }
                            if (str != null) {
                                this.G = new StaticLayout(AndroidUtilities.replaceCharSequence("…", TextUtils.ellipsize(Emoji.replaceEmoji(str, f39016f0.getFontMetricsInt(), z11), f39016f0, AndroidUtilities.dp(200.0f), TextUtils.TruncateAt.END), ""), f39016f0, AndroidUtilities.dp(200.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                            }
                            this.f39032l.getClass();
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
                imageReceiver4.getLottieAnimation().K(0);
            } else {
                i13 = 0;
            }
            if (this.S && imageReceiver.getLottieAnimation() != null) {
                imageReceiver.getLottieAnimation().K(i13);
            }
            this.V = i10;
            this.W = document;
            this.X = importingSticker;
            this.Y = str2;
            this.Z = botInlineResult;
            this.f39021b0 = obj;
            this.f39023c0 = c6Var;
            this.f39045z.invalidate();
            if (!this.E) {
                AndroidUtilities.lockOrientation(this.f39042w);
                try {
                    if (this.f39044y.getParent() != null) {
                        str6 = str4;
                        try {
                            ((WindowManager) this.f39042w.getSystemService(str6)).removeView(this.f39044y);
                        } catch (Exception e10) {
                            e = e10;
                            FileLog.e(e);
                            ((WindowManager) this.f39042w.getSystemService(str6)).addView(this.f39044y, this.f39043x);
                            this.E = true;
                            this.F = 0.0f;
                            this.f39022c = -10000.0f;
                            this.f39028g = 0.0f;
                            this.d = 0.0f;
                            this.f39025e = 0.0f;
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
                ((WindowManager) this.f39042w.getSystemService(str6)).addView(this.f39044y, this.f39043x);
                this.E = true;
                this.F = 0.0f;
                this.f39022c = -10000.0f;
                this.f39028g = 0.0f;
                this.d = 0.0f;
                this.f39025e = 0.0f;
                this.H = System.currentTimeMillis();
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 8);
            }
        }
    }

    public final void u() {
        vs vsVar = this.f39030j;
        if (vsVar != null) {
            AndroidUtilities.cancelRunOnUIThread(vsVar);
            this.f39030j = null;
        }
        View view = this.h;
        if (view != null) {
            if (view instanceof org.telegram.ui.Cells.b8) {
                ((org.telegram.ui.Cells.b8) view).setScaled(false);
            } else if (view instanceof org.telegram.ui.Cells.z7) {
                ((org.telegram.ui.Cells.z7) view).setScaled(false);
            } else if (view instanceof org.telegram.ui.Cells.d2) {
                ((org.telegram.ui.Cells.d2) view).setScaled(false);
            }
            this.h = null;
        }
    }

    public final void v(ft ftVar) {
        this.f39032l = ftVar;
        if (ftVar != null) {
            this.f39033m = ftVar.j();
            this.f39034n = this.f39032l.o();
        }
    }

    public final void w(Activity activity) {
        int i10 = UserConfig.selectedAccount;
        this.f39038r = i10;
        ImageReceiver imageReceiver = this.A;
        imageReceiver.setCurrentAccount(i10);
        imageReceiver.setLayerNum(Integer.MAX_VALUE);
        int i11 = this.f39038r;
        ImageReceiver imageReceiver2 = this.B;
        imageReceiver2.setCurrentAccount(i11);
        imageReceiver2.setLayerNum(Integer.MAX_VALUE);
        if (this.f39042w == activity) {
            return;
        }
        this.f39042w = activity;
        this.J = activity.getResources().getDrawable(R.drawable.preview_arrow);
        this.f39044y = new n0(this, activity, 5);
        sg.i iVar = new sg.i(this.f39044y);
        n0 n0Var = this.f39044y;
        lg.a aVar = this.f39040t;
        aVar.d = iVar;
        aVar.f15224e = n0Var;
        aVar.f15223c = new zd.b(true);
        this.f39044y.setFocusable(true);
        this.f39044y.setFocusableInTouchMode(true);
        this.f39044y.setSystemUiVisibility(1792);
        n0 n0Var2 = this.f39044y;
        us usVar = new us(this);
        WeakHashMap weakHashMap = r0.j0.f46829a;
        r0.b0.j(n0Var2, usVar);
        bg.d1 d1Var = new bg.d1(this, activity);
        this.f39045z = d1Var;
        d1Var.setFocusable(false);
        this.f39044y.addView(this.f39045z, i7.f6.e(-1, -1, 51));
        this.f39045z.setOnTouchListener(new g0(this, 1));
        MessagesController.getInstance(this.f39038r);
        this.I = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f39043x = layoutParams;
        layoutParams.height = -1;
        layoutParams.format = -3;
        layoutParams.width = -1;
        layoutParams.gravity = 48;
        layoutParams.type = 99;
        layoutParams.flags = -2147286784;
        AndroidUtilities.applyEdgeToEdgeLayoutParams(layoutParams);
        imageReceiver.setAspectFit(true);
        imageReceiver.setInvalidateAll(true);
        imageReceiver.setParentView(this.f39045z);
        imageReceiver2.setAspectFit(true);
        imageReceiver2.setInvalidateAll(true);
        imageReceiver2.setParentView(this.f39045z);
    }

    public final void x() {
        this.T = null;
    }

    public final boolean y(View view) {
        if (!(view instanceof org.telegram.ui.Cells.b8)) {
            return false;
        }
        Activity findActivity = AndroidUtilities.findActivity(view.getContext());
        if (findActivity == null) {
            return true;
        }
        w(findActivity);
        org.telegram.ui.Cells.b8 b8Var = (org.telegram.ui.Cells.b8) view;
        View view2 = this.h;
        if (view2 instanceof org.telegram.ui.Cells.b8) {
            ((org.telegram.ui.Cells.b8) view2).setScaled(false);
        } else if (view2 instanceof org.telegram.ui.Cells.z7) {
            ((org.telegram.ui.Cells.z7) view2).setScaled(false);
        } else if (view2 instanceof org.telegram.ui.Cells.d2) {
            ((org.telegram.ui.Cells.d2) view2).setScaled(false);
        }
        this.h = b8Var;
        TLRPC.Document sticker = b8Var.getSticker();
        SendMessagesHelper.ImportingSticker stickerPath = b8Var.getStickerPath();
        String str = null;
        String findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(b8Var.getSticker(), null, Integer.valueOf(this.f39038r));
        ft ftVar = this.f39032l;
        if (ftVar != null) {
            str = ftVar.E(false);
        }
        t(sticker, stickerPath, findAnimatedEmojiEmoticon, str, null, 0, b8Var.f24134y, b8Var.getParentObject(), this.f39023c0, 0);
        dt dtVar = this.U;
        AndroidUtilities.cancelRunOnUIThread(dtVar);
        AndroidUtilities.runOnUIThread(dtVar, 16L);
        b8Var.setScaled(true);
        return true;
    }
}
