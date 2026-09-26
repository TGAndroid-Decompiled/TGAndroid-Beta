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
public final class nt {
    public static TextPaint f35969f0;
    public static volatile nt f35970g0;
    public final ImageReceiver A;
    public final ImageReceiver B;
    public org.telegram.ui.Components.rd0 C;
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
    public final jt U;
    public int V;
    public TLRPC.Document W;
    public SendMessagesHelper.ImportingSticker X;
    public String Y;
    public TLRPC.BotInlineResult Z;
    public int f35971a;
    public TLRPC.InputStickerSet f35972a0;
    public int f35973b;
    public Object f35974b0;
    public float f35975c;
    public org.telegram.ui.ActionBar.d6 f35976c0;
    public float d;
    public VibrationEffect f35977d0;
    public boolean f35978e0;
    public float f35979f;
    public float f35980g;
    public View h;
    public boolean f35981i;
    public org.telegram.ui.Components.g21 f35982j;
    public org.telegram.ui.ActionBar.m1 f35983k;
    public lt f35984l;
    public boolean f35985m;
    public boolean f35986n;
    public ArrayList f35987o;
    public boolean f35988p;
    public int f35990r;
    public final fh.b f35991s;
    public final ah.c f35992t;
    public final ColorDrawable f35993u;
    public Bitmap v;
    public Activity f35994w;
    public WindowManager.LayoutParams f35995x;
    public k0 f35996y;
    public ci.m6 f35997z;
    public float e = 0.0f;
    public i0.b f35989q = i0.b.e;

    public nt() {
        fh.b bVar = new fh.b();
        this.f35991s = bVar;
        this.f35992t = new ah.c(bVar);
        this.f35993u = new ColorDrawable(1895825408);
        this.A = new ImageReceiver();
        this.B = new ImageReceiver();
        this.E = false;
        this.I = AndroidUtilities.dp(200.0f);
        this.N = new Paint(1);
        this.U = new jt(this);
    }

    public static void a(nt ntVar, Bitmap bitmap, Bitmap bitmap2) {
        fh.b bVar = ntVar.f35991s;
        Paint paint = ntVar.N;
        ntVar.A.setVisible(true, false);
        ntVar.v = bitmap;
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
        gh.d.c(bVar, ntVar.f35996y);
        ntVar.f35992t.d();
        ntVar.f35978e0 = false;
        ci.m6 m6Var = ntVar.f35997z;
        if (m6Var != null) {
            m6Var.invalidate();
        }
    }

    public static int d(nt ntVar, int i10) {
        return org.telegram.ui.ActionBar.h6.v0(i10, ntVar.f35976c0);
    }

    public static boolean h(nt ntVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        float f7;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2;
        qh.q qVar;
        lt ltVar = ntVar.f35984l;
        if (ltVar == null) {
            return false;
        }
        TLRPC.TL_messageMediaPoll d = ltVar.d();
        TLRPC.PollAnswer h = ntVar.f35984l.h();
        if (d == null || d.poll == null || h == null) {
            return false;
        }
        TLRPC.PollAnswerVoters pollResult = MessageObject.getPollResult(d, h.option);
        if (pollResult != null && pollResult.voters > 0 && MessageObject.canShowVotersList(d)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!MessageObject.isVoted(d) && !d.poll.closed && !ntVar.f35984l.c()) {
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
            qh.q qVar2 = new qh.q(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext(), ntVar.f35990r, ntVar.f35976c0);
            org.telegram.ui.Components.z70 z70Var = new org.telegram.ui.Components.z70(actionBarPopupWindow$ActionBarPopupWindowLayout, ntVar.f35976c0);
            int b10 = actionBarPopupWindow$ActionBarPopupWindowLayout.b(z70Var.B);
            int i10 = org.telegram.ui.ActionBar.h6.E8;
            z70Var.T(org.telegram.ui.ActionBar.h6.l1(0.06f, org.telegram.ui.ActionBar.h6.v0(i10, ntVar.f35976c0)));
            ah.c cVar = ntVar.f35992t;
            dh.e k10 = eh.b.k(ntVar.f35976c0);
            org.telegram.ui.ActionBar.m2 m2Var = null;
            View view = z70Var.B;
            if (view != null) {
                ch.d c10 = cVar.c(view, null, true);
                c10.o(k10);
                view.setBackground(c10);
            }
            z13 = true;
            z70Var.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new aj(actionBarPopupWindow$ActionBarPopupWindowLayout, 15), false);
            z70Var.k();
            MessageObject A = ntVar.f35984l.A();
            Activity activity = ntVar.f35994w;
            if ((activity instanceof LaunchActivity) && A != null) {
                LaunchActivity launchActivity = (LaunchActivity) activity;
                if (launchActivity.O() != null && launchActivity.O().getLastFragment() != null) {
                    m2Var = launchActivity.O().getLastFragment();
                }
                if (m2Var != null) {
                    org.telegram.ui.Components.s61 a2 = qVar2.a(m2Var, A.getDialogId(), A.getId(), h.option, pollResult.voters, new bt(0, ntVar, m2Var));
                    qVar = qVar2;
                    z70Var.q(a2);
                    qVar.setText(LocaleController.formatPluralString("PollVotesCount", pollResult.voters, new Object[0]));
                    qVar.f42087a.d(pollResult.recent_voters, false);
                    qVar.setLayoutParams(w7.y5.n(-1, 48));
                    qVar.setBackground(org.telegram.ui.ActionBar.h6.Y(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.I5, ntVar.f35976c0), 12, 0));
                    qVar.setOnClickListener(new ci.n4(actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 17));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(qVar);
                    org.telegram.ui.ActionBar.j1 j1Var = new org.telegram.ui.ActionBar.j1(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext(), ntVar.f35976c0);
                    j1Var.setTag(R.id.fit_width_tag, 1);
                    j1Var.setColor(org.telegram.ui.ActionBar.h6.l1(0.06f, org.telegram.ui.ActionBar.h6.v0(i10, ntVar.f35976c0)));
                    j1Var.setLayoutParams(w7.y5.n(-1, 8));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(j1Var);
                }
            }
            qVar = qVar2;
            qVar.setText(LocaleController.formatPluralString("PollVotesCount", pollResult.voters, new Object[0]));
            qVar.f42087a.d(pollResult.recent_voters, false);
            qVar.setLayoutParams(w7.y5.n(-1, 48));
            qVar.setBackground(org.telegram.ui.ActionBar.h6.Y(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.I5, ntVar.f35976c0), 12, 0));
            qVar.setOnClickListener(new ci.n4(actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 17));
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(qVar);
            org.telegram.ui.ActionBar.j1 j1Var2 = new org.telegram.ui.ActionBar.j1(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext(), ntVar.f35976c0);
            j1Var2.setTag(R.id.fit_width_tag, 1);
            j1Var2.setColor(org.telegram.ui.ActionBar.h6.l1(0.06f, org.telegram.ui.ActionBar.h6.v0(i10, ntVar.f35976c0)));
            j1Var2.setLayoutParams(w7.y5.n(-1, 8));
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(j1Var2);
        } else {
            z13 = true;
        }
        if (z11) {
            f7 = 0.06f;
            org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_select, LocaleController.getString(R.string.PollSubmitVotesNoCaps), false, ntVar.f35976c0).setOnClickListener(new at(ntVar, 2));
        } else {
            f7 = 0.06f;
        }
        if (z12) {
            actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_unvote, LocaleController.getString(R.string.Unvote), false, ntVar.f35976c0).setOnClickListener(new at(ntVar, 3));
        } else {
            actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
        }
        if (!z10 && (z11 || z12)) {
            org.telegram.ui.ActionBar.j1 j1Var3 = new org.telegram.ui.ActionBar.j1(actionBarPopupWindow$ActionBarPopupWindowLayout2.getContext(), ntVar.f35976c0);
            j1Var3.setTag(R.id.fit_width_tag, 1);
            j1Var3.setColor(org.telegram.ui.ActionBar.h6.l1(f7, org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.E8, ntVar.f35976c0)));
            j1Var3.setLayoutParams(w7.y5.n(-1, 8));
            actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(j1Var3);
        }
        if (!z10 && !z11 && !z12) {
            return false;
        }
        return z13;
    }

    public static nt q() {
        nt ntVar;
        nt ntVar2 = f35970g0;
        if (ntVar2 == null) {
            synchronized (PhotoViewer.class) {
                try {
                    ntVar = f35970g0;
                    if (ntVar == null) {
                        ntVar = new nt();
                        f35970g0 = ntVar;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return ntVar;
        }
        return ntVar2;
    }

    public final void n() {
        if (this.f35994w != null && !this.K) {
            AndroidUtilities.cancelRunOnUIThread(this.U);
            this.F = 1.0f;
            this.H = System.currentTimeMillis();
            this.f35997z.invalidate();
            this.W = null;
            this.f35972a0 = null;
            this.Y = null;
            this.f35984l = null;
            this.E = false;
            AndroidUtilities.runOnUIThread(new ys(this, 0), 200L);
            ah1 ah1Var = this.O;
            if (ah1Var != null) {
                ah1Var.animate().alpha(0.0f).translationY(AndroidUtilities.dp(56.0f)).setDuration(150L).setInterpolator(org.telegram.ui.Components.sr.f28339f).start();
            }
            FrameLayout frameLayout = this.Q;
            if (frameLayout != null) {
                frameLayout.animate().alpha(0.0f).setDuration(150L).scaleX(0.6f).scaleY(0.6f).setInterpolator(org.telegram.ui.Components.sr.f28339f).start();
            }
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 8);
        }
    }

    public final void o() {
        zg.b0 reactionsWindow;
        org.telegram.ui.Components.zb zbVar = this.P;
        if (zbVar != null && (reactionsWindow = zbVar.getReactionsWindow()) != null && !reactionsWindow.f49257q) {
            reactionsWindow.d();
            return;
        }
        this.K = false;
        p();
        n();
    }

    public final void p() {
        org.telegram.ui.ActionBar.m1 m1Var = this.f35983k;
        if (m1Var != null) {
            m1Var.dismiss();
            this.f35983k = null;
            return;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.L;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            org.telegram.messenger.ok.s(actionBarPopupWindow$ActionBarPopupWindowLayout.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).translationY(AndroidUtilities.dp(-12.0f)), org.telegram.ui.Components.sr.h, 320L);
            this.L = null;
            this.K = false;
            if (this.R) {
                n();
            }
        }
    }

    public final boolean r(MotionEvent motionEvent, org.telegram.ui.Components.xl0 xl0Var, lt ltVar, org.telegram.ui.ActionBar.d6 d6Var) {
        int i10;
        this.f35984l = ltVar;
        if (ltVar != null) {
            this.f35985m = ltVar.l();
            this.f35986n = this.f35984l.q();
        }
        lt ltVar2 = this.f35984l;
        if ((ltVar2 == null || ltVar2.i()) && motionEvent.getAction() == 0) {
            int x10 = (int) motionEvent.getX();
            int y3 = (int) motionEvent.getY();
            int childCount = xl0Var.getChildCount();
            int i11 = 0;
            while (true) {
                if (i11 >= childCount) {
                    break;
                }
                View childAt = xl0Var.getChildAt(i11);
                if (childAt == null) {
                    break;
                }
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                int left = childAt.getLeft();
                int right = childAt.getRight();
                if (top <= y3 && bottom >= y3 && left <= x10 && right >= x10) {
                    boolean z10 = childAt instanceof org.telegram.ui.Cells.f8;
                    ImageReceiver imageReceiver = this.A;
                    if (z10) {
                        if (((org.telegram.ui.Cells.f8) childAt).f20303a.hasNotThumb()) {
                            imageReceiver.setRoundRadius(0);
                            i10 = 0;
                        }
                        i10 = -1;
                    } else if (childAt instanceof org.telegram.ui.Cells.d8) {
                        if (((org.telegram.ui.Cells.d8) childAt).f20145a.getImageReceiver().getBitmap() != null) {
                            imageReceiver.setRoundRadius(0);
                            i10 = 0;
                        }
                        i10 = -1;
                    } else {
                        i10 = 2;
                        if (childAt instanceof org.telegram.ui.Cells.f2) {
                            org.telegram.ui.Cells.f2 f2Var = (org.telegram.ui.Cells.f2) childAt;
                            if (f2Var.f20273a.getBitmap() != null) {
                                int i12 = f2Var.O;
                                if (i12 == 6) {
                                    imageReceiver.setRoundRadius(0);
                                    i10 = 0;
                                } else if (i12 == 2 && f2Var.f20287s) {
                                    imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
                                    i10 = 1;
                                }
                            }
                            i10 = -1;
                        } else if (childAt instanceof org.telegram.ui.Components.lv) {
                            imageReceiver.setRoundRadius(0);
                        } else if ((childAt instanceof org.telegram.ui.Components.vy) && ((org.telegram.ui.Components.vy) childAt).getSpan() != null) {
                            imageReceiver.setRoundRadius(0);
                        } else {
                            if ((childAt instanceof org.telegram.ui.Components.xy0) && (((org.telegram.ui.Components.xy0) childAt).f30489b instanceof org.telegram.ui.Components.q5)) {
                                imageReceiver.setRoundRadius(0);
                            }
                            i10 = -1;
                        }
                    }
                    if (i10 != -1) {
                        this.f35971a = x10;
                        this.f35973b = y3;
                        this.h = childAt;
                        org.telegram.ui.Components.g21 g21Var = new org.telegram.ui.Components.g21(this, xl0Var, i10, d6Var, 1);
                        this.f35982j = g21Var;
                        AndroidUtilities.runOnUIThread(g21Var, 200L);
                        return true;
                    }
                } else {
                    i11++;
                }
            }
        }
        return false;
    }

    public final boolean s(android.view.MotionEvent r17, org.telegram.ui.Components.xl0 r18, java.lang.Object r19, org.telegram.ui.lt r20, org.telegram.ui.ActionBar.d6 r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.nt.s(android.view.MotionEvent, org.telegram.ui.Components.xl0, java.lang.Object, org.telegram.ui.lt, org.telegram.ui.ActionBar.d6):boolean");
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
        jt jtVar;
        if (this.f35994w != null && this.f35996y != null) {
            this.f35976c0 = d6Var;
            this.f35988p = z10;
            this.G = null;
            if (AndroidUtilities.isDarkColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19059d6, d6Var))) {
                i12 = 1895825408;
            } else {
                i12 = 1692853990;
            }
            this.f35993u.setColor(i12);
            this.S = false;
            ImageReceiver imageReceiver4 = this.A;
            imageReceiver4.setColorFilter(null);
            ImageReceiver imageReceiver5 = this.B;
            jt jtVar2 = this.U;
            if (i10 == 0 || i10 == 2 || i10 == 3) {
                ImageReceiver imageReceiver6 = imageReceiver5;
                if (document != null || importingSticker != null) {
                    if (f35969f0 == null) {
                        TextPaint textPaint = new TextPaint(1);
                        f35969f0 = textPaint;
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
                            this.G = new StaticLayout(AndroidUtilities.replaceCharSequence("…", TextUtils.ellipsize(Emoji.replaceEmoji(str, f35969f0.getFontMetricsInt(), false), f35969f0, AndroidUtilities.dp(200.0f), TextUtils.TruncateAt.END), ""), f35969f0, AndroidUtilities.dp(200.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                        } else {
                            imageReceiver2 = imageReceiver4;
                        }
                        if (inputStickerSet != null || i10 == 2) {
                            AndroidUtilities.cancelRunOnUIThread(jtVar2);
                            if (i11 > 0) {
                                j10 = i11;
                            } else {
                                j10 = 1300;
                            }
                            AndroidUtilities.runOnUIThread(jtVar2, j10);
                        }
                        TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(this.f35990r).getStickerSet(inputStickerSet, true);
                        if (stickerSet != null && stickerSet.documents.isEmpty()) {
                            inputStickerSet = null;
                        }
                        this.f35972a0 = inputStickerSet;
                        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                        if (MessageObject.isVideoStickerDocument(document)) {
                            charSequence = "";
                            str5 = "…";
                            imageReceiver4 = imageReceiver2;
                            imageReceiver4.setImage(ImageLocation.getForDocument(document), null, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), null, null, 0L, "webp", this.f35972a0, 1);
                        } else {
                            charSequence = "";
                            str5 = "…";
                            imageReceiver4 = imageReceiver2;
                            imageReceiver4.setImage(ImageLocation.getForDocument(document), (String) null, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), (String) null, "webp", this.f35972a0, 1);
                            if (MessageObject.isPremiumSticker(document)) {
                                this.S = true;
                                imageReceiver.setImage(ImageLocation.getForDocument(MessageObject.getPremiumStickerAnimation(document), document), (String) null, (ImageLocation) null, (String) null, "tgs", this.f35972a0, 1);
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
                                    this.G = new StaticLayout(AndroidUtilities.replaceCharSequence(str5, TextUtils.ellipsize(Emoji.replaceEmoji(documentAttribute2.alt, f35969f0.getFontMetricsInt(), false), f35969f0, AndroidUtilities.dp(200.0f), TextUtils.TruncateAt.END), charSequence), f35969f0, AndroidUtilities.dp(200.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
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
                                    org.telegram.ui.Components.rd0 rd0Var = new org.telegram.ui.Components.rd0(this.f35997z.getContext());
                                    this.C = rd0Var;
                                    this.f35997z.addView(rd0Var, new FrameLayout.LayoutParams(512, 512));
                                }
                                z11 = false;
                                this.C.b(importingSticker.videoEditedInfo.mediaEntities, true, true, false);
                            } else {
                                z11 = false;
                            }
                            if (str != null) {
                                this.G = new StaticLayout(AndroidUtilities.replaceCharSequence("…", TextUtils.ellipsize(Emoji.replaceEmoji(str, f35969f0.getFontMetricsInt(), z11), f35969f0, AndroidUtilities.dp(200.0f), TextUtils.TruncateAt.END), ""), f35969f0, AndroidUtilities.dp(200.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                            }
                            this.f35984l.getClass();
                            AndroidUtilities.cancelRunOnUIThread(jtVar2);
                            if (i11 > 0) {
                                j3 = i11;
                            } else {
                                j3 = 1300;
                            }
                            AndroidUtilities.runOnUIThread(jtVar2, j3);
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
                        jtVar = jtVar2;
                        imageReceiver4.setImage(forDocument, null, ImageLocation.getForDocument(documentVideoThumb, document), null, ImageLocation.getForDocument(closestPhotoSizeWithSize2, document), "90_90_b", null, document.size, null, "gif" + document, 0);
                    } else {
                        imageReceiver3 = imageReceiver5;
                        jtVar = jtVar2;
                        imageReceiver4 = imageReceiver4;
                        imageReceiver4.setImage(forDocument, null, ImageLocation.getForDocument(closestPhotoSizeWithSize2, document), "90_90_b", document.size, null, "gif" + document, 0);
                    }
                } else {
                    imageReceiver3 = imageReceiver5;
                    jtVar = jtVar2;
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
                AndroidUtilities.cancelRunOnUIThread(jtVar);
                AndroidUtilities.runOnUIThread(jtVar, 2000L);
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
            this.f35974b0 = obj;
            this.f35976c0 = d6Var;
            this.f35997z.invalidate();
            if (!this.E) {
                AndroidUtilities.lockOrientation(this.f35994w);
                try {
                    if (this.f35996y.getParent() != null) {
                        str6 = str4;
                        try {
                            ((WindowManager) this.f35994w.getSystemService(str6)).removeView(this.f35996y);
                        } catch (Exception e) {
                            e = e;
                            FileLog.e(e);
                            ((WindowManager) this.f35994w.getSystemService(str6)).addView(this.f35996y, this.f35995x);
                            this.E = true;
                            this.F = 0.0f;
                            this.f35975c = -10000.0f;
                            this.f35980g = 0.0f;
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
                ((WindowManager) this.f35994w.getSystemService(str6)).addView(this.f35996y, this.f35995x);
                this.E = true;
                this.F = 0.0f;
                this.f35975c = -10000.0f;
                this.f35980g = 0.0f;
                this.d = 0.0f;
                this.e = 0.0f;
                this.H = System.currentTimeMillis();
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 8);
            }
        }
    }

    public final void u() {
        org.telegram.ui.Components.g21 g21Var = this.f35982j;
        if (g21Var != null) {
            AndroidUtilities.cancelRunOnUIThread(g21Var);
            this.f35982j = null;
        }
        View view = this.h;
        if (view != null) {
            if (view instanceof org.telegram.ui.Cells.f8) {
                ((org.telegram.ui.Cells.f8) view).setScaled(false);
            } else if (view instanceof org.telegram.ui.Cells.d8) {
                ((org.telegram.ui.Cells.d8) view).setScaled(false);
            } else if (view instanceof org.telegram.ui.Cells.f2) {
                ((org.telegram.ui.Cells.f2) view).setScaled(false);
            }
            this.h = null;
        }
    }

    public final void v(lt ltVar) {
        this.f35984l = ltVar;
        if (ltVar != null) {
            this.f35985m = ltVar.l();
            this.f35986n = this.f35984l.q();
        }
    }

    public final void w(Activity activity) {
        int i10 = UserConfig.selectedAccount;
        this.f35990r = i10;
        ImageReceiver imageReceiver = this.A;
        imageReceiver.setCurrentAccount(i10);
        imageReceiver.setLayerNum(Integer.MAX_VALUE);
        int i11 = this.f35990r;
        ImageReceiver imageReceiver2 = this.B;
        imageReceiver2.setCurrentAccount(i11);
        imageReceiver2.setLayerNum(Integer.MAX_VALUE);
        if (this.f35994w == activity) {
            return;
        }
        this.f35994w = activity;
        this.J = activity.getResources().getDrawable(R.drawable.preview_arrow);
        this.f35996y = new k0(this, activity, 5);
        hh.k kVar = new hh.k(this.f35996y);
        k0 k0Var = this.f35996y;
        ah.c cVar = this.f35992t;
        cVar.f425f = kVar;
        cVar.f426g = k0Var;
        cVar.e = new pe.b();
        this.f35996y.setFocusable(true);
        this.f35996y.setFocusableInTouchMode(true);
        this.f35996y.setSystemUiVisibility(1792);
        k0 k0Var2 = this.f35996y;
        zs zsVar = new zs(this);
        WeakHashMap weakHashMap = r0.i0.f42127a;
        r0.a0.j(k0Var2, zsVar);
        ci.m6 m6Var = new ci.m6(this, activity);
        this.f35997z = m6Var;
        m6Var.setFocusable(false);
        this.f35996y.addView(this.f35997z, w7.y5.e(-1, -1, 51));
        this.f35997z.setOnTouchListener(new e0(this, 1));
        MessagesController.getInstance(this.f35990r);
        this.I = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f35995x = layoutParams;
        layoutParams.height = -1;
        layoutParams.format = -3;
        layoutParams.width = -1;
        layoutParams.gravity = 48;
        layoutParams.type = 99;
        layoutParams.flags = -2147286784;
        AndroidUtilities.applyEdgeToEdgeLayoutParams(layoutParams);
        imageReceiver.setAspectFit(true);
        imageReceiver.setInvalidateAll(true);
        imageReceiver.setParentView(this.f35997z);
        imageReceiver2.setAspectFit(true);
        imageReceiver2.setInvalidateAll(true);
        imageReceiver2.setParentView(this.f35997z);
    }

    public final void x() {
        this.T = null;
    }

    public final boolean y(View view) {
        if (!(view instanceof org.telegram.ui.Cells.f8)) {
            return false;
        }
        Activity findActivity = AndroidUtilities.findActivity(view.getContext());
        if (findActivity == null) {
            return true;
        }
        w(findActivity);
        org.telegram.ui.Cells.f8 f8Var = (org.telegram.ui.Cells.f8) view;
        View view2 = this.h;
        if (view2 instanceof org.telegram.ui.Cells.f8) {
            ((org.telegram.ui.Cells.f8) view2).setScaled(false);
        } else if (view2 instanceof org.telegram.ui.Cells.d8) {
            ((org.telegram.ui.Cells.d8) view2).setScaled(false);
        } else if (view2 instanceof org.telegram.ui.Cells.f2) {
            ((org.telegram.ui.Cells.f2) view2).setScaled(false);
        }
        this.h = f8Var;
        TLRPC.Document sticker = f8Var.getSticker();
        SendMessagesHelper.ImportingSticker stickerPath = f8Var.getStickerPath();
        String str = null;
        String findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(f8Var.getSticker(), null, Integer.valueOf(this.f35990r));
        lt ltVar = this.f35984l;
        if (ltVar != null) {
            str = ltVar.G(false);
        }
        t(sticker, stickerPath, findAnimatedEmojiEmoticon, str, null, 0, f8Var.f20312y, f8Var.getParentObject(), this.f35976c0, 0);
        jt jtVar = this.U;
        AndroidUtilities.cancelRunOnUIThread(jtVar);
        AndroidUtilities.runOnUIThread(jtVar, 16L);
        f8Var.setScaled(true);
        return true;
    }
}
