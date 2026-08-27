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
import android.os.Vibrator;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
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

public final class kt {

    public static TextPaint f39852f0;

    public static volatile kt f39853g0;
    public final ImageReceiver A;
    public final ImageReceiver B;
    public org.telegram.ui.Components.rc0 C;
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
    public ag1 O;
    public org.telegram.ui.Components.nb P;
    public FrameLayout Q;
    public boolean R;
    public boolean S;
    public TLRPC.TL_messages_stickerSet T;
    public final ft U;
    public int V;
    public TLRPC.Document W;
    public SendMessagesHelper.ImportingSticker X;
    public String Y;
    public TLRPC.BotInlineResult Z;

    public int f39854a;

    public TLRPC.InputStickerSet f39855a0;

    public int f39856b;

    public Object f39857b0;

    public float f39858c;

    public org.telegram.ui.ActionBar.c6 f39859c0;
    public float d;

    public VibrationEffect f39860d0;

    public boolean f39862e0;

    public float f39863f;

    public float f39864g;
    public View h;

    public boolean f39865i;

    public xs f39866j;

    public org.telegram.ui.ActionBar.n1 f39867k;

    public ht f39868l;

    public boolean f39869m;

    public boolean f39870n;

    public ArrayList f39871o;

    public boolean f39872p;

    public int f39874r;

    public final og.b f39875s;

    public final jg.a f39876t;

    public final ColorDrawable f39877u;
    public Bitmap v;

    public Activity f39878w;

    public WindowManager.LayoutParams f39879x;

    public n0 f39880y;

    public ag.y1 f39881z;

    public float f39861e = 0.0f;

    public i0.c f39873q = i0.c.f10488e;

    public kt() {
        og.b bVar = new og.b();
        this.f39875s = bVar;
        this.f39876t = new jg.a(bVar);
        this.f39877u = new ColorDrawable(1895825408);
        this.A = new ImageReceiver();
        this.B = new ImageReceiver();
        this.E = false;
        this.I = AndroidUtilities.dp(200.0f);
        this.N = new Paint(1);
        this.U = new ft(this);
    }

    public static void a(kt ktVar, Bitmap bitmap, Bitmap bitmap2) {
        og.b bVar = ktVar.f39875s;
        Paint paint = ktVar.N;
        ktVar.A.setVisible(true, false);
        ktVar.v = bitmap;
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
        pg.c.c(bVar, ktVar.f39880y);
        ktVar.f39876t.d();
        ktVar.f39862e0 = false;
        ag.y1 y1Var = ktVar.f39881z;
        if (y1Var != null) {
            y1Var.invalidate();
        }
    }

    public static int d(kt ktVar, int i10) {
        return org.telegram.ui.ActionBar.g6.v0(i10, ktVar.f39859c0);
    }

    public static boolean h(kt ktVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        boolean z10;
        float f10;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ht htVar = ktVar.f39868l;
        if (htVar == null) {
            return false;
        }
        TLRPC.TL_messageMediaPoll tL_messageMediaPollD = htVar.d();
        TLRPC.PollAnswer pollAnswerG = ktVar.f39868l.g();
        if (tL_messageMediaPollD == null || tL_messageMediaPollD.poll == null || pollAnswerG == null) {
            return false;
        }
        TLRPC.PollAnswerVoters pollResult = MessageObject.getPollResult(tL_messageMediaPollD, pollAnswerG.option);
        boolean z11 = pollResult != null && pollResult.voters > 0 && MessageObject.canShowVotersList(tL_messageMediaPollD);
        boolean z12 = (MessageObject.isVoted(tL_messageMediaPollD) || tL_messageMediaPollD.poll.closed || ktVar.f39868l.c()) ? false : true;
        boolean z13 = !z12 && MessageObject.canUnvote(tL_messageMediaPollD);
        if (z11) {
            zg.r rVar = new zg.r(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext(), ktVar.f39874r, ktVar.f39859c0);
            org.telegram.ui.Components.b70 b70Var = new org.telegram.ui.Components.b70(actionBarPopupWindow$ActionBarPopupWindowLayout, ktVar.f39859c0);
            int iB = actionBarPopupWindow$ActionBarPopupWindowLayout.b(b70Var.B);
            int i10 = org.telegram.ui.ActionBar.g6.E8;
            b70Var.T(org.telegram.ui.ActionBar.g6.l1(0.06f, org.telegram.ui.ActionBar.g6.v0(i10, ktVar.f39859c0)));
            jg.a aVar = ktVar.f39876t;
            mg.d dVarJ = ng.c.j(ktVar.f39859c0);
            org.telegram.ui.ActionBar.n2 lastFragment = null;
            LinearLayout linearLayout = b70Var.B;
            if (linearLayout != null) {
                lg.d dVarC = aVar.c(linearLayout, null, true);
                dVarC.n(dVarJ);
                linearLayout.setBackground(dVarC);
            }
            z10 = true;
            b70Var.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new ti(actionBarPopupWindow$ActionBarPopupWindowLayout, 15), false);
            b70Var.k();
            MessageObject messageObjectY = ktVar.f39868l.y();
            Activity activity = ktVar.f39878w;
            if ((activity instanceof LaunchActivity) && messageObjectY != null) {
                LaunchActivity launchActivity = (LaunchActivity) activity;
                if (launchActivity.O() != null && launchActivity.O().getLastFragment() != null) {
                    lastFragment = launchActivity.O().getLastFragment();
                }
                if (lastFragment != null) {
                    b70Var.q(rVar.a(lastFragment, messageObjectY.getDialogId(), messageObjectY.getId(), pollAnswerG.option, pollResult.voters, new df(25, ktVar, lastFragment)));
                }
            }
            r16.setText(LocaleController.formatPluralString("PollVotesCount", pollResult.voters, new Object[0]));
            r16.f50857a.d(pollResult.recent_voters, false);
            r16.setLayoutParams(h7.z5.n(-1, 48));
            r16.setBackground(org.telegram.ui.ActionBar.g6.Y(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.I5, ktVar.f39859c0), 12, 0));
            r16.setOnClickListener(new hh.z0(actionBarPopupWindow$ActionBarPopupWindowLayout, iB, 16));
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(rVar);
            org.telegram.ui.ActionBar.k1 k1Var = new org.telegram.ui.ActionBar.k1(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext(), ktVar.f39859c0);
            k1Var.setTag(R.id.fit_width_tag, 1);
            k1Var.setColor(org.telegram.ui.ActionBar.g6.l1(0.06f, org.telegram.ui.ActionBar.g6.v0(i10, ktVar.f39859c0)));
            k1Var.setLayoutParams(h7.z5.n(-1, 8));
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(k1Var);
        } else {
            z10 = true;
        }
        if (z12) {
            f10 = 0.06f;
            org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_select, LocaleController.getString(R.string.PollSubmitVotesNoCaps), false, ktVar.f39859c0).setOnClickListener(new ys(ktVar, 2));
        } else {
            f10 = 0.06f;
        }
        if (z13) {
            viewGroup2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            org.telegram.ui.ActionBar.v0.c(false, false, viewGroup2, R.drawable.msg_unvote, LocaleController.getString(R.string.Unvote), false, ktVar.f39859c0).setOnClickListener(new ys(ktVar, 3));
        } else {
            viewGroup = actionBarPopupWindow$ActionBarPopupWindowLayout;
        }
        if (!z11 && (z12 || z13)) {
            org.telegram.ui.ActionBar.k1 k1Var2 = new org.telegram.ui.ActionBar.k1(viewGroup.getContext(), ktVar.f39859c0);
            k1Var2.setTag(R.id.fit_width_tag, 1);
            k1Var2.setColor(org.telegram.ui.ActionBar.g6.l1(f10, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.E8, ktVar.f39859c0)));
            k1Var2.setLayoutParams(h7.z5.n(-1, 8));
            viewGroup.addView(k1Var2);
        }
        if (z11 || z12 || z13) {
            return z10;
        }
        return false;
    }

    public static kt q() {
        kt ktVar;
        kt ktVar2 = f39853g0;
        if (ktVar2 != null) {
            return ktVar2;
        }
        synchronized (PhotoViewer.class) {
            try {
                ktVar = f39853g0;
                if (ktVar == null) {
                    ktVar = new kt();
                    f39853g0 = ktVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return ktVar;
    }

    public final void n() {
        if (this.f39878w == null || this.K) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(this.U);
        this.F = 1.0f;
        this.H = System.currentTimeMillis();
        this.f39881z.invalidate();
        this.W = null;
        this.f39855a0 = null;
        this.Y = null;
        this.f39868l = null;
        this.E = false;
        AndroidUtilities.runOnUIThread(new vs(this, 0), 200L);
        ag1 ag1Var = this.O;
        if (ag1Var != null) {
            ag1Var.animate().alpha(0.0f).translationY(AndroidUtilities.dp(56.0f)).setDuration(150L).setInterpolator(org.telegram.ui.Components.er.f28122f).start();
        }
        FrameLayout frameLayout = this.Q;
        if (frameLayout != null) {
            frameLayout.animate().alpha(0.0f).setDuration(150L).scaleX(0.6f).scaleY(0.6f).setInterpolator(org.telegram.ui.Components.er.f28122f).start();
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 8);
    }

    public final void o() {
        ig.d0 reactionsWindow;
        org.telegram.ui.Components.nb nbVar = this.P;
        if (nbVar != null && (reactionsWindow = nbVar.getReactionsWindow()) != null && !reactionsWindow.f11282q) {
            reactionsWindow.d();
            return;
        }
        this.K = false;
        p();
        n();
    }

    public final void p() {
        org.telegram.ui.ActionBar.n1 n1Var = this.f39867k;
        if (n1Var != null) {
            n1Var.dismiss();
            this.f39867k = null;
            return;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.L;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            org.telegram.messenger.rl.o(actionBarPopupWindow$ActionBarPopupWindowLayout.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).translationY(AndroidUtilities.dp(-12.0f)), org.telegram.ui.Components.er.h, 320L);
            this.L = null;
            this.K = false;
            if (this.R) {
                n();
            }
        }
    }

    public final boolean r(MotionEvent motionEvent, org.telegram.ui.Components.zk0 zk0Var, ht htVar, org.telegram.ui.ActionBar.c6 c6Var) {
        int i10;
        this.f39868l = htVar;
        if (htVar != null) {
            this.f39869m = htVar.j();
            this.f39870n = this.f39868l.o();
        }
        ht htVar2 = this.f39868l;
        if ((htVar2 == null || htVar2.h()) && motionEvent.getAction() == 0) {
            int x8 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            int childCount = zk0Var.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = zk0Var.getChildAt(i11);
                if (childAt == null) {
                    break;
                }
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                int left = childAt.getLeft();
                int right = childAt.getRight();
                if (top <= y10 && bottom >= y10 && left <= x8 && right >= x8) {
                    boolean z10 = childAt instanceof org.telegram.ui.Cells.a8;
                    ImageReceiver imageReceiver = this.A;
                    if (z10) {
                        if (((org.telegram.ui.Cells.a8) childAt).f24069a.hasNotThumb()) {
                            imageReceiver.setRoundRadius(0);
                            i10 = 0;
                        } else {
                            i10 = -1;
                        }
                    } else if (!(childAt instanceof org.telegram.ui.Cells.y7)) {
                        i10 = 2;
                        if (childAt instanceof org.telegram.ui.Cells.d2) {
                            org.telegram.ui.Cells.d2 d2Var = (org.telegram.ui.Cells.d2) childAt;
                            if (d2Var.f24180a.getBitmap() == null) {
                                i10 = -1;
                            } else {
                                int i12 = d2Var.K;
                                if (i12 == 6) {
                                    imageReceiver.setRoundRadius(0);
                                    i10 = 0;
                                } else if (i12 == 2 && d2Var.f24191s) {
                                    imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
                                    i10 = 1;
                                } else {
                                    i10 = -1;
                                }
                            }
                        } else if (childAt instanceof org.telegram.ui.Components.tu) {
                            imageReceiver.setRoundRadius(0);
                        } else if ((childAt instanceof org.telegram.ui.Components.gy) && ((org.telegram.ui.Components.gy) childAt).getSpan() != null) {
                            imageReceiver.setRoundRadius(0);
                        } else if ((childAt instanceof org.telegram.ui.Components.vx0) && (((org.telegram.ui.Components.vx0) childAt).f34064b instanceof org.telegram.ui.Components.k5)) {
                            imageReceiver.setRoundRadius(0);
                        } else {
                            i10 = -1;
                        }
                    } else if (((org.telegram.ui.Cells.y7) childAt).f26002a.getImageReceiver().getBitmap() != null) {
                        imageReceiver.setRoundRadius(0);
                        i10 = 0;
                    } else {
                        i10 = -1;
                    }
                    if (i10 == -1) {
                        break;
                    }
                    this.f39854a = x8;
                    this.f39856b = y10;
                    this.h = childAt;
                    xs xsVar = new xs(this, zk0Var, i10, c6Var, 0);
                    this.f39866j = xsVar;
                    AndroidUtilities.runOnUIThread(xsVar, 200L);
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean s(MotionEvent motionEvent, org.telegram.ui.Components.zk0 zk0Var, Object obj, ht htVar, org.telegram.ui.ActionBar.c6 c6Var) {
        int i10;
        int i11;
        TLRPC.Document document;
        this.f39868l = htVar;
        if (htVar != null) {
            this.f39869m = htVar.j();
            this.f39870n = this.f39868l.o();
        }
        ht htVar2 = this.f39868l;
        if ((htVar2 == null || htVar2.h()) && (this.f39866j != null || this.E)) {
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3 || motionEvent.getAction() == 6) {
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.r61(5, zk0Var, obj), 150L);
                xs xsVar = this.f39866j;
                if (xsVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(xsVar);
                    this.f39866j = null;
                    return false;
                }
                if (this.E) {
                    n();
                    View view = this.h;
                    if (view != null) {
                        if (view instanceof org.telegram.ui.Cells.a8) {
                            ((org.telegram.ui.Cells.a8) view).setScaled(false);
                        } else if (view instanceof org.telegram.ui.Cells.y7) {
                            ((org.telegram.ui.Cells.y7) view).setScaled(false);
                        } else if (view instanceof org.telegram.ui.Cells.d2) {
                            ((org.telegram.ui.Cells.d2) view).setScaled(false);
                        }
                        this.h = null;
                    }
                }
            } else if (motionEvent.getAction() != 0) {
                if (this.E) {
                    if (motionEvent.getAction() == 2) {
                        if (this.V != 1 || this.f39869m) {
                            int x8 = (int) motionEvent.getX();
                            int y10 = (int) motionEvent.getY();
                            int childCount = zk0Var.getChildCount();
                            for (int i12 = 0; i12 < childCount; i12++) {
                                View childAt = zk0Var.getChildAt(i12);
                                if (childAt != null) {
                                    int top = childAt.getTop();
                                    int bottom = childAt.getBottom();
                                    int left = childAt.getLeft();
                                    int right = childAt.getRight();
                                    if (top <= y10 && bottom >= y10 && left <= x8 && right >= x8) {
                                        boolean z10 = childAt instanceof org.telegram.ui.Cells.a8;
                                        ImageReceiver imageReceiver = this.A;
                                        if (z10 || (childAt instanceof org.telegram.ui.Cells.y7)) {
                                            imageReceiver.setRoundRadius(0);
                                            i10 = 0;
                                        } else if (childAt instanceof org.telegram.ui.Cells.d2) {
                                            org.telegram.ui.Cells.d2 d2Var = (org.telegram.ui.Cells.d2) childAt;
                                            int i13 = d2Var.K;
                                            if (i13 == 6) {
                                                imageReceiver.setRoundRadius(0);
                                                i11 = 0;
                                            } else if (i13 == 2 && d2Var.f24191s) {
                                                imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
                                                i11 = 1;
                                            } else {
                                                i11 = -1;
                                            }
                                            i10 = i11;
                                        } else {
                                            if (childAt instanceof org.telegram.ui.Components.tu) {
                                                imageReceiver.setRoundRadius(0);
                                            } else if (!(childAt instanceof org.telegram.ui.Components.gy) || ((org.telegram.ui.Components.gy) childAt).getSpan() == null) {
                                                i10 = -1;
                                            } else {
                                                imageReceiver.setRoundRadius(0);
                                            }
                                            i10 = 2;
                                        }
                                        if (i10 != -1 && childAt != this.h) {
                                            ht htVar3 = this.f39868l;
                                            if (htVar3 != null) {
                                                htVar3.s();
                                            }
                                            View view2 = this.h;
                                            if (view2 instanceof org.telegram.ui.Cells.a8) {
                                                ((org.telegram.ui.Cells.a8) view2).setScaled(false);
                                            } else if (view2 instanceof org.telegram.ui.Cells.y7) {
                                                ((org.telegram.ui.Cells.y7) view2).setScaled(false);
                                            } else if (view2 instanceof org.telegram.ui.Cells.d2) {
                                                ((org.telegram.ui.Cells.d2) view2).setScaled(false);
                                            }
                                            this.h = childAt;
                                            this.f39865i = false;
                                            this.K = false;
                                            this.R = false;
                                            p();
                                            AndroidUtilities.updateViewVisibilityAnimated(this.O, false);
                                            View view3 = this.h;
                                            if (view3 instanceof org.telegram.ui.Cells.a8) {
                                                org.telegram.ui.Cells.a8 a8Var = (org.telegram.ui.Cells.a8) view3;
                                                TLRPC.Document sticker = a8Var.getSticker();
                                                SendMessagesHelper.ImportingSticker stickerPath = a8Var.getStickerPath();
                                                String strFindAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(a8Var.getSticker(), null, Integer.valueOf(this.f39874r));
                                                ht htVar4 = this.f39868l;
                                                t(sticker, stickerPath, strFindAnimatedEmojiEmoticon, htVar4 != null ? htVar4.F(false) : null, null, i10, a8Var.f24079y, a8Var.getParentObject(), c6Var, 0);
                                                a8Var.setScaled(true);
                                            } else if (view3 instanceof org.telegram.ui.Cells.y7) {
                                                org.telegram.ui.Cells.y7 y7Var = (org.telegram.ui.Cells.y7) view3;
                                                TLRPC.Document sticker2 = y7Var.getSticker();
                                                String strFindAnimatedEmojiEmoticon2 = MessageObject.findAnimatedEmojiEmoticon(y7Var.getSticker(), null, Integer.valueOf(this.f39874r));
                                                ht htVar5 = this.f39868l;
                                                t(sticker2, null, strFindAnimatedEmojiEmoticon2, htVar5 != null ? htVar5.F(false) : null, null, i10, false, y7Var.getParentObject(), c6Var, 0);
                                                y7Var.setScaled(true);
                                                this.f39865i = y7Var.h;
                                            } else if (view3 instanceof org.telegram.ui.Cells.d2) {
                                                org.telegram.ui.Cells.d2 d2Var2 = (org.telegram.ui.Cells.d2) view3;
                                                TLRPC.Document document2 = d2Var2.getDocument();
                                                ht htVar6 = this.f39868l;
                                                t(document2, null, null, htVar6 != null ? htVar6.F(true) : null, d2Var2.getBotInlineResult(), i10, false, d2Var2.getBotInlineResult() != null ? d2Var2.getInlineBot() : d2Var2.getParentObject(), c6Var, 0);
                                                if (i10 != 1 || this.f39869m) {
                                                    d2Var2.setScaled(true);
                                                }
                                            } else if (view3 instanceof org.telegram.ui.Components.tu) {
                                                TLRPC.Document document3 = ((org.telegram.ui.Components.tu) view3).getDocument();
                                                if (document3 != null) {
                                                    t(document3, null, MessageObject.findAnimatedEmojiEmoticon(document3, null, Integer.valueOf(this.f39874r)), null, null, i10, false, null, c6Var, 0);
                                                }
                                            } else if (view3 instanceof org.telegram.ui.Components.gy) {
                                                org.telegram.ui.Components.t5 span = ((org.telegram.ui.Components.gy) view3).getSpan();
                                                if (span != null) {
                                                    TLRPC.Document documentF = span.document;
                                                    if (documentF == null) {
                                                        documentF = org.telegram.ui.Components.k5.f(this.f39874r, span.getDocumentId());
                                                    }
                                                    document = documentF;
                                                } else {
                                                    document = null;
                                                }
                                                if (document != null) {
                                                    t(document, null, MessageObject.findAnimatedEmojiEmoticon(document, null, Integer.valueOf(this.f39874r)), null, null, i10, false, null, c6Var, 0);
                                                }
                                            } else if (view3 instanceof org.telegram.ui.Components.vx0) {
                                                Drawable drawable = ((org.telegram.ui.Components.vx0) view3).f34064b;
                                                TLRPC.Document document4 = drawable instanceof org.telegram.ui.Components.k5 ? ((org.telegram.ui.Components.k5) drawable).f29956e : null;
                                                if (document4 != null) {
                                                    t(document4, null, MessageObject.findAnimatedEmojiEmoticon(document4, null, Integer.valueOf(this.f39874r)), null, null, i10, false, null, c6Var, 0);
                                                }
                                            }
                                            if (Build.VERSION.SDK_INT < 26) {
                                                break;
                                            }
                                            Vibrator vibrator = (Vibrator) this.f39881z.getContext().getSystemService("vibrator");
                                            if (this.f39860d0 == null) {
                                                this.f39860d0 = VibrationEffect.createWaveform(new long[]{0, 2}, -1);
                                            }
                                            vibrator.cancel();
                                            vibrator.vibrate(this.f39860d0);
                                            return true;
                                        }
                                        break;
                                        break;
                                    }
                                }
                            }
                        } else if (!this.K) {
                            if (this.F == 1.0f) {
                                if (this.f39858c == -10000.0f) {
                                    this.f39858c = motionEvent.getY();
                                    this.d = 0.0f;
                                    this.f39861e = 0.0f;
                                    return true;
                                }
                                float y11 = motionEvent.getY();
                                float f10 = (y11 - this.f39858c) + this.d;
                                this.d = f10;
                                this.f39858c = y11;
                                if (f10 > 0.0f) {
                                    this.d = 0.0f;
                                } else if (f10 < (-AndroidUtilities.dp(60.0f))) {
                                    this.d = -AndroidUtilities.dp(60.0f);
                                }
                                float f11 = this.d;
                                float fDp = AndroidUtilities.dp(200.0f);
                                this.f39861e = (-((1.0f - (1.0f / (((Math.abs(f11) * 0.55f) / fDp) + 1.0f))) * fDp)) * (f11 >= 0.0f ? -1.0f : 1.0f);
                                this.f39881z.invalidate();
                                if (this.d <= (-AndroidUtilities.dp(55.0f))) {
                                    ft ftVar = this.U;
                                    AndroidUtilities.cancelRunOnUIThread(ftVar);
                                    ftVar.run();
                                    return true;
                                }
                            }
                        }
                    }
                    return true;
                }
                if (this.f39866j != null) {
                    if (motionEvent.getAction() != 2) {
                        AndroidUtilities.cancelRunOnUIThread(this.f39866j);
                        this.f39866j = null;
                        return false;
                    }
                    if (Math.hypot(this.f39854a - motionEvent.getX(), this.f39856b - motionEvent.getY()) > AndroidUtilities.dp(10.0f)) {
                        AndroidUtilities.cancelRunOnUIThread(this.f39866j);
                        this.f39866j = null;
                        return false;
                    }
                }
            }
        }
        return false;
    }

    public final void t(TLRPC.Document document, SendMessagesHelper.ImportingSticker importingSticker, String str, String str2, TLRPC.BotInlineResult botInlineResult, int i10, boolean z10, Object obj, org.telegram.ui.ActionBar.c6 c6Var, int i11) {
        ImageReceiver imageReceiver;
        boolean z11;
        TLRPC.InputStickerSet inputStickerSet;
        CharSequence charSequence;
        String str3;
        int i12;
        String str4;
        ImageReceiver imageReceiver2;
        ft ftVar;
        if (this.f39878w == null || this.f39880y == null) {
            return;
        }
        this.f39859c0 = c6Var;
        this.f39872p = z10;
        this.G = null;
        this.f39877u.setColor(AndroidUtilities.isDarkColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23053d6, c6Var)) ? 1895825408 : 1692853990);
        this.S = false;
        ImageReceiver imageReceiver3 = this.A;
        imageReceiver3.setColorFilter(null);
        ImageReceiver imageReceiver4 = this.B;
        ft ftVar2 = this.U;
        if (i10 == 0 || i10 == 2 || i10 == 3) {
            ImageReceiver imageReceiver5 = imageReceiver4;
            if (document == null && importingSticker == null) {
                return;
            }
            if (f39852f0 == null) {
                TextPaint textPaint = new TextPaint(1);
                f39852f0 = textPaint;
                textPaint.setTextSize(AndroidUtilities.dp(24.0f));
            }
            imageReceiver5.clearImage();
            this.S = false;
            if (document != null) {
                int i13 = 0;
                while (true) {
                    if (i13 >= document.attributes.size()) {
                        imageReceiver = imageReceiver5;
                        inputStickerSet = null;
                        break;
                    }
                    TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i13);
                    imageReceiver = imageReceiver5;
                    if ((documentAttribute instanceof TLRPC.TL_documentAttributeSticker) && (inputStickerSet = documentAttribute.stickerset) != null) {
                        break;
                    }
                    i13++;
                    imageReceiver5 = imageReceiver;
                }
                if (str != null) {
                    this.G = new StaticLayout(AndroidUtilities.replaceCharSequence("…", TextUtils.ellipsize(Emoji.replaceEmoji(str, f39852f0.getFontMetricsInt(), false), f39852f0, AndroidUtilities.dp(200.0f), TextUtils.TruncateAt.END), ""), f39852f0, AndroidUtilities.dp(200.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                }
                if (inputStickerSet != null || i10 == 2) {
                    AndroidUtilities.cancelRunOnUIThread(ftVar2);
                    AndroidUtilities.runOnUIThread(ftVar2, i11 > 0 ? i11 : 1300L);
                }
                TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(this.f39874r).getStickerSet(inputStickerSet, true);
                if (stickerSet != null && stickerSet.documents.isEmpty()) {
                    inputStickerSet = null;
                }
                this.f39855a0 = inputStickerSet;
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                if (MessageObject.isVideoStickerDocument(document)) {
                    charSequence = "";
                    str3 = "…";
                    imageReceiver3 = imageReceiver3;
                    imageReceiver3.setImage(ImageLocation.getForDocument(document), null, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), null, null, 0L, "webp", this.f39855a0, 1);
                } else {
                    charSequence = "";
                    str3 = "…";
                    imageReceiver3.setImage(ImageLocation.getForDocument(document), (String) null, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), (String) null, "webp", this.f39855a0, 1);
                    if (MessageObject.isPremiumSticker(document)) {
                        imageReceiver3 = imageReceiver3;
                        this.S = true;
                        imageReceiver.setImage(ImageLocation.getForDocument(MessageObject.getPremiumStickerAnimation(document), document), (String) null, (ImageLocation) null, (String) null, "tgs", this.f39855a0, 1);
                    }
                }
                imageReceiver3 = imageReceiver3;
                if (MessageObject.isTextColorEmoji(document)) {
                    imageReceiver3.setColorFilter(org.telegram.ui.ActionBar.g6.n0(c6Var));
                }
                if (this.G == null) {
                    for (int i14 = 0; i14 < document.attributes.size(); i14++) {
                        TLRPC.DocumentAttribute documentAttribute2 = document.attributes.get(i14);
                        if ((documentAttribute2 instanceof TLRPC.TL_documentAttributeSticker) && !TextUtils.isEmpty(documentAttribute2.alt)) {
                            this.G = new StaticLayout(AndroidUtilities.replaceCharSequence(str3, TextUtils.ellipsize(Emoji.replaceEmoji(documentAttribute2.alt, f39852f0.getFontMetricsInt(), false), f39852f0, AndroidUtilities.dp(200.0f), TextUtils.TruncateAt.END), charSequence), f39852f0, AndroidUtilities.dp(200.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                            break;
                        }
                    }
                }
            } else {
                imageReceiver = imageReceiver5;
                if (importingSticker != null) {
                    imageReceiver3.setImage(importingSticker.path, null, null, importingSticker.animated ? "tgs" : null, 0L);
                    if (importingSticker.videoEditedInfo != null) {
                        if (this.C == null) {
                            org.telegram.ui.Components.rc0 rc0Var = new org.telegram.ui.Components.rc0(this.f39881z.getContext());
                            this.C = rc0Var;
                            this.f39881z.addView(rc0Var, new FrameLayout.LayoutParams(512, 512));
                        }
                        z11 = false;
                        this.C.b(importingSticker.videoEditedInfo.mediaEntities, true, true, false);
                    } else {
                        z11 = false;
                    }
                    if (str != null) {
                        this.G = new StaticLayout(AndroidUtilities.replaceCharSequence("…", TextUtils.ellipsize(Emoji.replaceEmoji(str, f39852f0.getFontMetricsInt(), z11), f39852f0, AndroidUtilities.dp(200.0f), TextUtils.TruncateAt.END), ""), f39852f0, AndroidUtilities.dp(200.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                    }
                    this.f39868l.getClass();
                    AndroidUtilities.cancelRunOnUIThread(ftVar2);
                    AndroidUtilities.runOnUIThread(ftVar2, i11 > 0 ? i11 : 1300L);
                }
            }
        } else {
            if (document != null) {
                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                TLRPC.VideoSize documentVideoThumb = MessageObject.getDocumentVideoThumb(document);
                ImageLocation forDocument = ImageLocation.getForDocument(document);
                forDocument.imageType = 2;
                if (documentVideoThumb != null) {
                    imageReceiver2 = imageReceiver4;
                    ftVar = ftVar2;
                    imageReceiver3.setImage(forDocument, null, ImageLocation.getForDocument(documentVideoThumb, document), null, ImageLocation.getForDocument(closestPhotoSizeWithSize2, document), "90_90_b", null, document.size, null, "gif" + document, 0);
                } else {
                    imageReceiver2 = imageReceiver4;
                    ftVar = ftVar2;
                    imageReceiver3 = imageReceiver3;
                    imageReceiver3.setImage(forDocument, null, ImageLocation.getForDocument(closestPhotoSizeWithSize2, document), "90_90_b", document.size, null, "gif" + document, 0);
                }
            } else {
                imageReceiver2 = imageReceiver4;
                ftVar = ftVar2;
                if (botInlineResult == null || botInlineResult.content == null) {
                    return;
                }
                TLRPC.WebDocument webDocument = botInlineResult.thumb;
                if ((webDocument instanceof TLRPC.TL_webDocument) && "video/mp4".equals(webDocument.mime_type)) {
                    imageReceiver3 = imageReceiver3;
                    imageReceiver3.setImage(ImageLocation.getForWebFile(WebFile.createWithWebDocument(botInlineResult.content)), null, ImageLocation.getForWebFile(WebFile.createWithWebDocument(botInlineResult.thumb)), null, ImageLocation.getForWebFile(WebFile.createWithWebDocument(botInlineResult.thumb)), "90_90_b", null, botInlineResult.content.size, null, "gif" + botInlineResult, 1);
                } else {
                    imageReceiver3 = imageReceiver3;
                    imageReceiver3.setImage(ImageLocation.getForWebFile(WebFile.createWithWebDocument(botInlineResult.content)), null, ImageLocation.getForWebFile(WebFile.createWithWebDocument(botInlineResult.thumb)), "90_90_b", botInlineResult.content.size, null, "gif" + botInlineResult, 1);
                }
            }
            AndroidUtilities.cancelRunOnUIThread(ftVar);
            AndroidUtilities.runOnUIThread(ftVar, 2000L);
            imageReceiver = imageReceiver2;
        }
        if (imageReceiver3.getLottieAnimation() != null) {
            i12 = 0;
            imageReceiver3.getLottieAnimation().K(0);
        } else {
            i12 = 0;
        }
        if (this.S && imageReceiver.getLottieAnimation() != null) {
            imageReceiver.getLottieAnimation().K(i12);
        }
        this.V = i10;
        this.W = document;
        this.X = importingSticker;
        this.Y = str2;
        this.Z = botInlineResult;
        this.f39857b0 = obj;
        this.f39859c0 = c6Var;
        this.f39881z.invalidate();
        if (this.E) {
            return;
        }
        AndroidUtilities.lockOrientation(this.f39878w);
        try {
            if (this.f39880y.getParent() != null) {
                str4 = "window";
                try {
                    ((WindowManager) this.f39878w.getSystemService(str4)).removeView(this.f39880y);
                } catch (Exception e9) {
                    e = e9;
                    FileLog.e(e);
                }
            } else {
                str4 = r8;
            }
        } catch (Exception e10) {
            e = e10;
            str4 = r8;
        }
        ((WindowManager) this.f39878w.getSystemService(str4)).addView(this.f39880y, this.f39879x);
        this.E = true;
        this.F = 0.0f;
        this.f39858c = -10000.0f;
        this.f39864g = 0.0f;
        this.d = 0.0f;
        this.f39861e = 0.0f;
        this.H = System.currentTimeMillis();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 8);
    }

    public final void u() {
        xs xsVar = this.f39866j;
        if (xsVar != null) {
            AndroidUtilities.cancelRunOnUIThread(xsVar);
            this.f39866j = null;
        }
        View view = this.h;
        if (view != null) {
            if (view instanceof org.telegram.ui.Cells.a8) {
                ((org.telegram.ui.Cells.a8) view).setScaled(false);
            } else if (view instanceof org.telegram.ui.Cells.y7) {
                ((org.telegram.ui.Cells.y7) view).setScaled(false);
            } else if (view instanceof org.telegram.ui.Cells.d2) {
                ((org.telegram.ui.Cells.d2) view).setScaled(false);
            }
            this.h = null;
        }
    }

    public final void v(ht htVar) {
        this.f39868l = htVar;
        if (htVar != null) {
            this.f39869m = htVar.j();
            this.f39870n = this.f39868l.o();
        }
    }

    public final void w(Activity activity) {
        int i10 = UserConfig.selectedAccount;
        this.f39874r = i10;
        ImageReceiver imageReceiver = this.A;
        imageReceiver.setCurrentAccount(i10);
        imageReceiver.setLayerNum(Integer.MAX_VALUE);
        int i11 = this.f39874r;
        ImageReceiver imageReceiver2 = this.B;
        imageReceiver2.setCurrentAccount(i11);
        imageReceiver2.setLayerNum(Integer.MAX_VALUE);
        if (this.f39878w == activity) {
            return;
        }
        this.f39878w = activity;
        this.J = activity.getResources().getDrawable(R.drawable.preview_arrow);
        this.f39880y = new n0(this, activity, 5);
        qg.j jVar = new qg.j(this.f39880y);
        n0 n0Var = this.f39880y;
        jg.a aVar = this.f39876t;
        aVar.d = jVar;
        aVar.f12943e = n0Var;
        aVar.f12942c = new yd.b(true);
        this.f39880y.setFocusable(true);
        this.f39880y.setFocusableInTouchMode(true);
        this.f39880y.setSystemUiVisibility(1792);
        n0 n0Var2 = this.f39880y;
        ws wsVar = new ws(this);
        WeakHashMap weakHashMap = r0.j0.f46605a;
        r0.b0.j(n0Var2, wsVar);
        ag.y1 y1Var = new ag.y1(this, activity);
        this.f39881z = y1Var;
        y1Var.setFocusable(false);
        this.f39880y.addView(this.f39881z, h7.z5.e(-1, -1, 51));
        this.f39881z.setOnTouchListener(new g0(this, 1));
        MessagesController.getInstance(this.f39874r);
        this.I = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f39879x = layoutParams;
        layoutParams.height = -1;
        layoutParams.format = -3;
        layoutParams.width = -1;
        layoutParams.gravity = 48;
        layoutParams.type = 99;
        layoutParams.flags = -2147286784;
        AndroidUtilities.applyEdgeToEdgeLayoutParams(layoutParams);
        imageReceiver.setAspectFit(true);
        imageReceiver.setInvalidateAll(true);
        imageReceiver.setParentView(this.f39881z);
        imageReceiver2.setAspectFit(true);
        imageReceiver2.setInvalidateAll(true);
        imageReceiver2.setParentView(this.f39881z);
    }

    public final void x() {
        this.T = null;
    }

    public final boolean y(View view) {
        if (!(view instanceof org.telegram.ui.Cells.a8)) {
            return false;
        }
        Activity activityFindActivity = AndroidUtilities.findActivity(view.getContext());
        if (activityFindActivity == null) {
            return true;
        }
        w(activityFindActivity);
        org.telegram.ui.Cells.a8 a8Var = (org.telegram.ui.Cells.a8) view;
        View view2 = this.h;
        if (view2 instanceof org.telegram.ui.Cells.a8) {
            ((org.telegram.ui.Cells.a8) view2).setScaled(false);
        } else if (view2 instanceof org.telegram.ui.Cells.y7) {
            ((org.telegram.ui.Cells.y7) view2).setScaled(false);
        } else if (view2 instanceof org.telegram.ui.Cells.d2) {
            ((org.telegram.ui.Cells.d2) view2).setScaled(false);
        }
        this.h = a8Var;
        TLRPC.Document sticker = a8Var.getSticker();
        SendMessagesHelper.ImportingSticker stickerPath = a8Var.getStickerPath();
        String strFindAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(a8Var.getSticker(), null, Integer.valueOf(this.f39874r));
        ht htVar = this.f39868l;
        t(sticker, stickerPath, strFindAnimatedEmojiEmoticon, htVar != null ? htVar.F(false) : null, null, 0, a8Var.f24079y, a8Var.getParentObject(), this.f39859c0, 0);
        ft ftVar = this.U;
        AndroidUtilities.cancelRunOnUIThread(ftVar);
        AndroidUtilities.runOnUIThread(ftVar, 16L);
        a8Var.setScaled(true);
        return true;
    }
}
