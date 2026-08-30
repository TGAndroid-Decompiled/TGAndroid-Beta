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
    public static TextPaint f37509f0;
    public static volatile pt f37510g0;
    public final ImageReceiver A;
    public final ImageReceiver B;
    public org.telegram.ui.Components.hd0 C;
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
    public pg1 O;
    public org.telegram.ui.Components.rb P;
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
    public int f37511a;
    public TLRPC.InputStickerSet f37512a0;
    public int f37513b;
    public Object f37514b0;
    public float f37515c;
    public org.telegram.ui.ActionBar.f6 f37516c0;
    public float d;
    public VibrationEffect f37517d0;
    public boolean f37518e0;
    public float f37519f;
    public float f37520g;
    public View h;
    public boolean f37521i;
    public ct f37522j;
    public org.telegram.ui.ActionBar.p1 f37523k;
    public nt f37524l;
    public boolean f37525m;
    public boolean f37526n;
    public ArrayList f37527o;
    public boolean f37528p;
    public int f37530r;
    public final sg.b f37531s;
    public final ng.a f37532t;
    public final ColorDrawable f37533u;
    public Bitmap v;
    public Activity f37534w;
    public WindowManager.LayoutParams f37535x;
    public l0 f37536y;
    public ah.d f37537z;
    public float e = 0.0f;
    public i0.b f37529q = i0.b.e;

    public pt() {
        sg.b bVar = new sg.b();
        this.f37531s = bVar;
        this.f37532t = new ng.a(bVar);
        this.f37533u = new ColorDrawable(1895825408);
        this.A = new ImageReceiver();
        this.B = new ImageReceiver();
        this.E = false;
        this.I = AndroidUtilities.dp(200.0f);
        this.N = new Paint(1);
        this.U = new lt(this);
    }

    public static void a(pt ptVar, Bitmap bitmap, Bitmap bitmap2) {
        sg.b bVar = ptVar.f37531s;
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
        tg.c.c(bVar, ptVar.f37536y);
        ptVar.f37532t.d();
        ptVar.f37518e0 = false;
        ah.d dVar = ptVar.f37537z;
        if (dVar != null) {
            dVar.invalidate();
        }
    }

    public static int d(pt ptVar, int i10) {
        return org.telegram.ui.ActionBar.j6.v0(i10, ptVar.f37516c0);
    }

    public static boolean h(pt ptVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        boolean z4;
        boolean z10;
        boolean z11;
        boolean z12;
        float f10;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2;
        dh.u uVar;
        nt ntVar = ptVar.f37524l;
        if (ntVar == null) {
            return false;
        }
        TLRPC.TL_messageMediaPoll e = ntVar.e();
        TLRPC.PollAnswer h = ptVar.f37524l.h();
        if (e == null || e.poll == null || h == null) {
            return false;
        }
        TLRPC.PollAnswerVoters pollResult = MessageObject.getPollResult(e, h.option);
        if (pollResult != null && pollResult.voters > 0 && MessageObject.canShowVotersList(e)) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!MessageObject.isVoted(e) && !e.poll.closed && !ptVar.f37524l.c()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && MessageObject.canUnvote(e)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z4) {
            dh.u uVar2 = new dh.u(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext(), ptVar.f37530r, ptVar.f37516c0);
            org.telegram.ui.Components.o70 o70Var = new org.telegram.ui.Components.o70(actionBarPopupWindow$ActionBarPopupWindowLayout, ptVar.f37516c0);
            int b10 = actionBarPopupWindow$ActionBarPopupWindowLayout.b(o70Var.B);
            int i10 = org.telegram.ui.ActionBar.j6.E8;
            o70Var.T(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(i10, ptVar.f37516c0)));
            ng.a aVar = ptVar.f37532t;
            qg.d j10 = rg.b.j(ptVar.f37516c0);
            org.telegram.ui.ActionBar.p2 p2Var = null;
            View view = o70Var.B;
            if (view != null) {
                pg.b c3 = aVar.c(view, null, true);
                c3.n(j10);
                view.setBackground(c3);
            }
            z12 = true;
            o70Var.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new zi(actionBarPopupWindow$ActionBarPopupWindowLayout, 15), false);
            o70Var.k();
            MessageObject z13 = ptVar.f37524l.z();
            Activity activity = ptVar.f37534w;
            if ((activity instanceof LaunchActivity) && z13 != null) {
                LaunchActivity launchActivity = (LaunchActivity) activity;
                if (launchActivity.O() != null && launchActivity.O().getLastFragment() != null) {
                    p2Var = launchActivity.O().getLastFragment();
                }
                if (p2Var != null) {
                    org.telegram.ui.Components.g61 a2 = uVar2.a(p2Var, z13.getDialogId(), z13.getId(), h.option, pollResult.voters, new org.telegram.ui.Components.vk(10, ptVar, p2Var));
                    uVar = uVar2;
                    o70Var.q(a2);
                    uVar.setText(LocaleController.formatPluralString("PollVotesCount", pollResult.voters, new Object[0]));
                    uVar.f4941a.d(pollResult.recent_voters, false);
                    uVar.setLayoutParams(k7.b6.n(-1, 48));
                    uVar.setBackground(org.telegram.ui.ActionBar.j6.Y(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.I5, ptVar.f37516c0), 12, 0));
                    uVar.setOnClickListener(new lh.y0(actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 14));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(uVar);
                    org.telegram.ui.ActionBar.m1 m1Var = new org.telegram.ui.ActionBar.m1(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext(), ptVar.f37516c0);
                    m1Var.setTag(R.id.fit_width_tag, 1);
                    m1Var.setColor(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(i10, ptVar.f37516c0)));
                    m1Var.setLayoutParams(k7.b6.n(-1, 8));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(m1Var);
                }
            }
            uVar = uVar2;
            uVar.setText(LocaleController.formatPluralString("PollVotesCount", pollResult.voters, new Object[0]));
            uVar.f4941a.d(pollResult.recent_voters, false);
            uVar.setLayoutParams(k7.b6.n(-1, 48));
            uVar.setBackground(org.telegram.ui.ActionBar.j6.Y(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.I5, ptVar.f37516c0), 12, 0));
            uVar.setOnClickListener(new lh.y0(actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 14));
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(uVar);
            org.telegram.ui.ActionBar.m1 m1Var2 = new org.telegram.ui.ActionBar.m1(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext(), ptVar.f37516c0);
            m1Var2.setTag(R.id.fit_width_tag, 1);
            m1Var2.setColor(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(i10, ptVar.f37516c0)));
            m1Var2.setLayoutParams(k7.b6.n(-1, 8));
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(m1Var2);
        } else {
            z12 = true;
        }
        if (z10) {
            f10 = 0.06f;
            org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_select, LocaleController.getString(R.string.PollSubmitVotesNoCaps), false, ptVar.f37516c0).setOnClickListener(new dt(ptVar, 2));
        } else {
            f10 = 0.06f;
        }
        if (z11) {
            actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_unvote, LocaleController.getString(R.string.Unvote), false, ptVar.f37516c0).setOnClickListener(new dt(ptVar, 3));
        } else {
            actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
        }
        if (!z4 && (z10 || z11)) {
            org.telegram.ui.ActionBar.m1 m1Var3 = new org.telegram.ui.ActionBar.m1(actionBarPopupWindow$ActionBarPopupWindowLayout2.getContext(), ptVar.f37516c0);
            m1Var3.setTag(R.id.fit_width_tag, 1);
            m1Var3.setColor(org.telegram.ui.ActionBar.j6.l1(f10, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, ptVar.f37516c0)));
            m1Var3.setLayoutParams(k7.b6.n(-1, 8));
            actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(m1Var3);
        }
        if (!z4 && !z10 && !z11) {
            return false;
        }
        return z12;
    }

    public static pt q() {
        pt ptVar;
        pt ptVar2 = f37510g0;
        if (ptVar2 == null) {
            synchronized (PhotoViewer.class) {
                try {
                    ptVar = f37510g0;
                    if (ptVar == null) {
                        ptVar = new pt();
                        f37510g0 = ptVar;
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
        if (this.f37534w != null && !this.K) {
            AndroidUtilities.cancelRunOnUIThread(this.U);
            this.F = 1.0f;
            this.H = System.currentTimeMillis();
            this.f37537z.invalidate();
            this.W = null;
            this.f37512a0 = null;
            this.Y = null;
            this.f37524l = null;
            this.E = false;
            AndroidUtilities.runOnUIThread(new at(this, 0), 200L);
            pg1 pg1Var = this.O;
            if (pg1Var != null) {
                pg1Var.animate().alpha(0.0f).translationY(AndroidUtilities.dp(56.0f)).setDuration(150L).setInterpolator(org.telegram.ui.Components.nr.f27346f).start();
            }
            FrameLayout frameLayout = this.Q;
            if (frameLayout != null) {
                frameLayout.animate().alpha(0.0f).setDuration(150L).scaleX(0.6f).scaleY(0.6f).setInterpolator(org.telegram.ui.Components.nr.f27346f).start();
            }
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 8);
        }
    }

    public final void o() {
        mg.d0 reactionsWindow;
        org.telegram.ui.Components.rb rbVar = this.P;
        if (rbVar != null && (reactionsWindow = rbVar.getReactionsWindow()) != null && !reactionsWindow.f13985q) {
            reactionsWindow.d();
            return;
        }
        this.K = false;
        p();
        n();
    }

    public final void p() {
        org.telegram.ui.ActionBar.p1 p1Var = this.f37523k;
        if (p1Var != null) {
            p1Var.dismiss();
            this.f37523k = null;
            return;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.L;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            b.p(actionBarPopupWindow$ActionBarPopupWindowLayout.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).translationY(AndroidUtilities.dp(-12.0f)), org.telegram.ui.Components.nr.h, 320L);
            this.L = null;
            this.K = false;
            if (this.R) {
                n();
            }
        }
    }

    public final boolean r(MotionEvent motionEvent, org.telegram.ui.Components.sl0 sl0Var, nt ntVar, org.telegram.ui.ActionBar.f6 f6Var) {
        int i10;
        this.f37524l = ntVar;
        if (ntVar != null) {
            this.f37525m = ntVar.k();
            this.f37526n = this.f37524l.p();
        }
        nt ntVar2 = this.f37524l;
        if ((ntVar2 == null || ntVar2.i()) && motionEvent.getAction() == 0) {
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            int childCount = sl0Var.getChildCount();
            int i11 = 0;
            while (true) {
                if (i11 >= childCount) {
                    break;
                }
                View childAt = sl0Var.getChildAt(i11);
                if (childAt == null) {
                    break;
                }
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                int left = childAt.getLeft();
                int right = childAt.getRight();
                if (top <= y10 && bottom >= y10 && left <= x10 && right >= x10) {
                    boolean z4 = childAt instanceof org.telegram.ui.Cells.d8;
                    ImageReceiver imageReceiver = this.A;
                    if (z4) {
                        if (((org.telegram.ui.Cells.d8) childAt).f20948a.hasNotThumb()) {
                            imageReceiver.setRoundRadius(0);
                            i10 = 0;
                        }
                        i10 = -1;
                    } else if (childAt instanceof org.telegram.ui.Cells.b8) {
                        if (((org.telegram.ui.Cells.b8) childAt).f20881a.getImageReceiver().getBitmap() != null) {
                            imageReceiver.setRoundRadius(0);
                            i10 = 0;
                        }
                        i10 = -1;
                    } else {
                        i10 = 2;
                        if (childAt instanceof org.telegram.ui.Cells.e2) {
                            org.telegram.ui.Cells.e2 e2Var = (org.telegram.ui.Cells.e2) childAt;
                            if (e2Var.f20983a.getBitmap() != null) {
                                int i12 = e2Var.L;
                                if (i12 == 6) {
                                    imageReceiver.setRoundRadius(0);
                                    i10 = 0;
                                } else if (i12 == 2 && e2Var.f20994s) {
                                    imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
                                    i10 = 1;
                                }
                            }
                            i10 = -1;
                        } else if (childAt instanceof org.telegram.ui.Components.dv) {
                            imageReceiver.setRoundRadius(0);
                        } else if ((childAt instanceof org.telegram.ui.Components.sy) && ((org.telegram.ui.Components.sy) childAt).getSpan() != null) {
                            imageReceiver.setRoundRadius(0);
                        } else {
                            if ((childAt instanceof org.telegram.ui.Components.py0) && (((org.telegram.ui.Components.py0) childAt).f28014b instanceof org.telegram.ui.Components.l5)) {
                                imageReceiver.setRoundRadius(0);
                            }
                            i10 = -1;
                        }
                    }
                    if (i10 != -1) {
                        this.f37511a = x10;
                        this.f37513b = y10;
                        this.h = childAt;
                        ct ctVar = new ct(this, sl0Var, i10, f6Var, 0);
                        this.f37522j = ctVar;
                        AndroidUtilities.runOnUIThread(ctVar, 200L);
                        return true;
                    }
                } else {
                    i11++;
                }
            }
        }
        return false;
    }

    public final boolean s(android.view.MotionEvent r17, org.telegram.ui.Components.sl0 r18, java.lang.Object r19, org.telegram.ui.nt r20, org.telegram.ui.ActionBar.f6 r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.pt.s(android.view.MotionEvent, org.telegram.ui.Components.sl0, java.lang.Object, org.telegram.ui.nt, org.telegram.ui.ActionBar.f6):boolean");
    }

    public final void t(TLRPC.Document document, SendMessagesHelper.ImportingSticker importingSticker, String str, String str2, TLRPC.BotInlineResult botInlineResult, int i10, boolean z4, Object obj, org.telegram.ui.ActionBar.f6 f6Var, int i11) {
        int i12;
        ImageReceiver imageReceiver;
        String str3;
        String str4;
        boolean z10;
        long j10;
        TLRPC.InputStickerSet inputStickerSet;
        ImageReceiver imageReceiver2;
        long j11;
        CharSequence charSequence;
        String str5;
        int i13;
        String str6;
        ImageReceiver imageReceiver3;
        lt ltVar;
        if (this.f37534w != null && this.f37536y != null) {
            this.f37516c0 = f6Var;
            this.f37528p = z4;
            this.G = null;
            if (AndroidUtilities.isDarkColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19906d6, f6Var))) {
                i12 = 1895825408;
            } else {
                i12 = 1692853990;
            }
            this.f37533u.setColor(i12);
            this.S = false;
            ImageReceiver imageReceiver4 = this.A;
            imageReceiver4.setColorFilter(null);
            ImageReceiver imageReceiver5 = this.B;
            lt ltVar2 = this.U;
            if (i10 == 0 || i10 == 2 || i10 == 3) {
                ImageReceiver imageReceiver6 = imageReceiver5;
                if (document != null || importingSticker != null) {
                    if (f37509f0 == null) {
                        TextPaint textPaint = new TextPaint(1);
                        f37509f0 = textPaint;
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
                            this.G = new StaticLayout(AndroidUtilities.replaceCharSequence("…", TextUtils.ellipsize(Emoji.replaceEmoji(str, f37509f0.getFontMetricsInt(), false), f37509f0, AndroidUtilities.dp(200.0f), TextUtils.TruncateAt.END), ""), f37509f0, AndroidUtilities.dp(200.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                        } else {
                            imageReceiver2 = imageReceiver4;
                        }
                        if (inputStickerSet != null || i10 == 2) {
                            AndroidUtilities.cancelRunOnUIThread(ltVar2);
                            if (i11 > 0) {
                                j11 = i11;
                            } else {
                                j11 = 1300;
                            }
                            AndroidUtilities.runOnUIThread(ltVar2, j11);
                        }
                        TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(this.f37530r).getStickerSet(inputStickerSet, true);
                        if (stickerSet != null && stickerSet.documents.isEmpty()) {
                            inputStickerSet = null;
                        }
                        this.f37512a0 = inputStickerSet;
                        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                        if (MessageObject.isVideoStickerDocument(document)) {
                            charSequence = "";
                            str5 = "…";
                            imageReceiver4 = imageReceiver2;
                            imageReceiver4.setImage(ImageLocation.getForDocument(document), null, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), null, null, 0L, "webp", this.f37512a0, 1);
                        } else {
                            charSequence = "";
                            str5 = "…";
                            imageReceiver4 = imageReceiver2;
                            imageReceiver4.setImage(ImageLocation.getForDocument(document), (String) null, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), (String) null, "webp", this.f37512a0, 1);
                            if (MessageObject.isPremiumSticker(document)) {
                                this.S = true;
                                imageReceiver.setImage(ImageLocation.getForDocument(MessageObject.getPremiumStickerAnimation(document), document), (String) null, (ImageLocation) null, (String) null, "tgs", this.f37512a0, 1);
                            }
                        }
                        if (MessageObject.isTextColorEmoji(document)) {
                            imageReceiver4.setColorFilter(org.telegram.ui.ActionBar.j6.n0(f6Var));
                        }
                        if (this.G == null) {
                            int i15 = 0;
                            while (true) {
                                if (i15 >= document.attributes.size()) {
                                    break;
                                }
                                TLRPC.DocumentAttribute documentAttribute2 = document.attributes.get(i15);
                                if ((documentAttribute2 instanceof TLRPC.TL_documentAttributeSticker) && !TextUtils.isEmpty(documentAttribute2.alt)) {
                                    this.G = new StaticLayout(AndroidUtilities.replaceCharSequence(str5, TextUtils.ellipsize(Emoji.replaceEmoji(documentAttribute2.alt, f37509f0.getFontMetricsInt(), false), f37509f0, AndroidUtilities.dp(200.0f), TextUtils.TruncateAt.END), charSequence), f37509f0, AndroidUtilities.dp(200.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
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
                                    org.telegram.ui.Components.hd0 hd0Var = new org.telegram.ui.Components.hd0(this.f37537z.getContext());
                                    this.C = hd0Var;
                                    this.f37537z.addView(hd0Var, new FrameLayout.LayoutParams(512, 512));
                                }
                                z10 = false;
                                this.C.b(importingSticker.videoEditedInfo.mediaEntities, true, true, false);
                            } else {
                                z10 = false;
                            }
                            if (str != null) {
                                this.G = new StaticLayout(AndroidUtilities.replaceCharSequence("…", TextUtils.ellipsize(Emoji.replaceEmoji(str, f37509f0.getFontMetricsInt(), z10), f37509f0, AndroidUtilities.dp(200.0f), TextUtils.TruncateAt.END), ""), f37509f0, AndroidUtilities.dp(200.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                            }
                            this.f37524l.getClass();
                            AndroidUtilities.cancelRunOnUIThread(ltVar2);
                            if (i11 > 0) {
                                j10 = i11;
                            } else {
                                j10 = 1300;
                            }
                            AndroidUtilities.runOnUIThread(ltVar2, j10);
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
            this.f37514b0 = obj;
            this.f37516c0 = f6Var;
            this.f37537z.invalidate();
            if (!this.E) {
                AndroidUtilities.lockOrientation(this.f37534w);
                try {
                    if (this.f37536y.getParent() != null) {
                        str6 = str4;
                        try {
                            ((WindowManager) this.f37534w.getSystemService(str6)).removeView(this.f37536y);
                        } catch (Exception e) {
                            e = e;
                            FileLog.e(e);
                            ((WindowManager) this.f37534w.getSystemService(str6)).addView(this.f37536y, this.f37535x);
                            this.E = true;
                            this.F = 0.0f;
                            this.f37515c = -10000.0f;
                            this.f37520g = 0.0f;
                            this.d = 0.0f;
                            this.e = 0.0f;
                            this.H = System.currentTimeMillis();
                            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 8);
                        }
                    } else {
                        str6 = str4;
                    }
                } catch (Exception e6) {
                    e = e6;
                    str6 = str4;
                }
                ((WindowManager) this.f37534w.getSystemService(str6)).addView(this.f37536y, this.f37535x);
                this.E = true;
                this.F = 0.0f;
                this.f37515c = -10000.0f;
                this.f37520g = 0.0f;
                this.d = 0.0f;
                this.e = 0.0f;
                this.H = System.currentTimeMillis();
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 8);
            }
        }
    }

    public final void u() {
        ct ctVar = this.f37522j;
        if (ctVar != null) {
            AndroidUtilities.cancelRunOnUIThread(ctVar);
            this.f37522j = null;
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

    public final void v(nt ntVar) {
        this.f37524l = ntVar;
        if (ntVar != null) {
            this.f37525m = ntVar.k();
            this.f37526n = this.f37524l.p();
        }
    }

    public final void w(Activity activity) {
        int i10 = UserConfig.selectedAccount;
        this.f37530r = i10;
        ImageReceiver imageReceiver = this.A;
        imageReceiver.setCurrentAccount(i10);
        imageReceiver.setLayerNum(Integer.MAX_VALUE);
        int i11 = this.f37530r;
        ImageReceiver imageReceiver2 = this.B;
        imageReceiver2.setCurrentAccount(i11);
        imageReceiver2.setLayerNum(Integer.MAX_VALUE);
        if (this.f37534w == activity) {
            return;
        }
        this.f37534w = activity;
        this.J = activity.getResources().getDrawable(R.drawable.preview_arrow);
        this.f37536y = new l0(this, activity, 5);
        ug.i iVar = new ug.i(this.f37536y);
        l0 l0Var = this.f37536y;
        ng.a aVar = this.f37532t;
        aVar.d = iVar;
        aVar.e = l0Var;
        aVar.f14971c = new be.b(true);
        this.f37536y.setFocusable(true);
        this.f37536y.setFocusableInTouchMode(true);
        this.f37536y.setSystemUiVisibility(1792);
        l0 l0Var2 = this.f37536y;
        bt btVar = new bt(this);
        WeakHashMap weakHashMap = r0.j0.f43118a;
        r0.b0.j(l0Var2, btVar);
        ah.d dVar = new ah.d(this, activity);
        this.f37537z = dVar;
        dVar.setFocusable(false);
        this.f37536y.addView(this.f37537z, k7.b6.e(-1, -1, 51));
        this.f37537z.setOnTouchListener(new f0(this, 1));
        MessagesController.getInstance(this.f37530r);
        this.I = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f37535x = layoutParams;
        layoutParams.height = -1;
        layoutParams.format = -3;
        layoutParams.width = -1;
        layoutParams.gravity = 48;
        layoutParams.type = 99;
        layoutParams.flags = -2147286784;
        AndroidUtilities.applyEdgeToEdgeLayoutParams(layoutParams);
        imageReceiver.setAspectFit(true);
        imageReceiver.setInvalidateAll(true);
        imageReceiver.setParentView(this.f37537z);
        imageReceiver2.setAspectFit(true);
        imageReceiver2.setInvalidateAll(true);
        imageReceiver2.setParentView(this.f37537z);
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
        String findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(d8Var.getSticker(), null, Integer.valueOf(this.f37530r));
        nt ntVar = this.f37524l;
        if (ntVar != null) {
            str = ntVar.G(false);
        }
        t(sticker, stickerPath, findAnimatedEmojiEmoticon, str, null, 0, d8Var.f20957y, d8Var.getParentObject(), this.f37516c0, 0);
        lt ltVar = this.U;
        AndroidUtilities.cancelRunOnUIThread(ltVar);
        AndroidUtilities.runOnUIThread(ltVar, 16L);
        d8Var.setScaled(true);
        return true;
    }
}
