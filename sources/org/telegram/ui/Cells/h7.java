package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.bt;
import org.telegram.ui.Components.np;
import org.telegram.ui.Components.u00;
public class h7 extends FrameLayout implements DownloadController.FileDownloadProgressListener, NotificationCenter.NotificationCenterDelegate {
    public org.telegram.ui.Components.q5 B;
    public float C;
    public float D;
    public StaticLayout E;
    public int F;
    public org.telegram.ui.Components.q5 G;
    public float H;
    public float I;
    public StaticLayout J;
    public MessageObject K;
    public boolean L;
    public final int M;
    public final int N;
    public int O;
    public int P;
    public final RadialProgress2 Q;
    public final int R;
    public StaticLayout S;
    public int T;
    public final TextPaint U;
    public final TextPaint V;
    public final org.telegram.ui.ActionBar.g6 W;
    public final SpannableStringBuilder f22923a;
    public boolean f22924a0;
    public final np f22925b;
    public float f22926b0;
    public boolean f22927c;
    public boolean f22928c0;
    public boolean d;
    public float f22929d0;
    public boolean f22930e;
    public final TextPaint f22931e0;
    public int f22932f;
    public Utilities.CallbackReturn f22933f0;
    public float f22934g0;
    public int h;
    public u00 f22935h0;
    public int f22936n;
    public final int f22937r;
    public StaticLayout f22938s;
    public float v;
    public float f22939w;
    public org.telegram.ui.Components.q5 f22940x;
    public int f22941y;

    public h7(Context context) {
        this(context, 0, null);
    }

    private int getIconForCurrentState() {
        int i10 = this.O;
        if (i10 == 1) {
            return 1;
        }
        if (i10 == 2) {
            return 2;
        }
        if (i10 == 4) {
            return 3;
        }
        return 0;
    }

    private int getMiniIconForCurrentState() {
        int i10 = this.P;
        if (i10 < 0) {
            return 4;
        }
        if (i10 == 0) {
            return 2;
        }
        return 3;
    }

    public void a() {
        int i10 = this.O;
        int i11 = this.M;
        RadialProgress2 radialProgress2 = this.Q;
        if (i10 == 0) {
            if (this.P == 0) {
                this.K.putInDownloadsStore = true;
                FileLoader.getInstance(i11).loadFile(this.K.getDocument(), this.K, 1, 0);
            }
            if (d(this.K)) {
                if (this.f22932f == 2 && this.P != 1) {
                    this.P = 1;
                    radialProgress2.o(0.0f, false);
                    radialProgress2.k(getMiniIconForCurrentState(), false, true);
                }
                this.O = 1;
                radialProgress2.setIcon(getIconForCurrentState(), false, true);
                invalidate();
            }
        } else if (i10 == 1) {
            if (MediaController.getInstance().lambda$startAudioAgain$7(this.K)) {
                this.O = 0;
                radialProgress2.setIcon(getIconForCurrentState(), false, true);
                invalidate();
            }
        } else if (i10 == 2) {
            radialProgress2.o(0.0f, false);
            this.K.putInDownloadsStore = true;
            FileLoader.getInstance(i11).loadFile(this.K.getDocument(), this.K, 1, 0);
            this.O = 4;
            radialProgress2.setIcon(getIconForCurrentState(), false, true);
            invalidate();
        } else if (i10 == 4) {
            FileLoader.getInstance(i11).cancelLoadFile(this.K.getDocument());
            this.O = 2;
            radialProgress2.setIcon(getIconForCurrentState(), false, true);
            invalidate();
        }
    }

    public final void b(Canvas canvas) {
        int i10;
        float f10;
        float f11;
        float f12;
        float f13;
        StaticLayout staticLayout;
        float f14;
        float f15;
        int i11;
        org.telegram.ui.ActionBar.g6 g6Var = this.W;
        if (this.R == 1) {
            this.U.setColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.A6, g6Var));
        }
        StaticLayout staticLayout2 = this.S;
        int i12 = this.f22937r;
        int i13 = 0;
        float f16 = 24.0f;
        if (staticLayout2 != null) {
            canvas.save();
            if (LocaleController.isRTL) {
                f15 = 24.0f;
            } else {
                f15 = AndroidUtilities.leftBaseline;
            }
            int dp = AndroidUtilities.dp(f15);
            if (LocaleController.isRTL) {
                i11 = 0;
            } else {
                i11 = this.T;
            }
            canvas.translate(dp + i11, i12);
            this.S.draw(canvas);
            canvas.restore();
        }
        float f17 = 0.0f;
        if (this.f22938s != null) {
            int alpha = org.telegram.ui.ActionBar.k6.f21693f3.getAlpha();
            float f18 = this.f22929d0;
            if (f18 != 1.0f) {
                org.telegram.ui.ActionBar.k6.f21693f3.setAlpha((int) (alpha * f18));
            }
            canvas.save();
            if (LocaleController.isRTL) {
                f12 = 24.0f;
            } else {
                f12 = AndroidUtilities.leftBaseline;
            }
            int dp2 = AndroidUtilities.dp(f12);
            if (LocaleController.isRTL && (staticLayout = this.S) != null) {
                int width = staticLayout.getWidth();
                if (LocaleController.isRTL) {
                    f14 = 12.0f;
                } else {
                    f14 = 4.0f;
                }
                i13 = width + AndroidUtilities.dp(f14);
            }
            float f19 = dp2 + i13;
            if (LocaleController.isRTL) {
                f13 = this.f22938s.getWidth() - this.f22939w;
            } else {
                f13 = 0.0f;
            }
            canvas.translate((f19 + f13) - this.v, i12);
            this.f22938s.draw(canvas);
            org.telegram.ui.Components.u5.drawAnimatedEmojis(canvas, this.f22938s, this.f22940x, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas.restore();
            if (this.f22929d0 != 1.0f) {
                org.telegram.ui.ActionBar.k6.f21693f3.setAlpha(alpha);
            }
        }
        if (this.J != null) {
            this.V.setColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.G6, g6Var));
            canvas.save();
            if (LocaleController.isRTL) {
                f10 = 24.0f;
            } else {
                f10 = AndroidUtilities.leftBaseline;
            }
            float dp3 = AndroidUtilities.dp(f10);
            if (LocaleController.isRTL) {
                f11 = this.J.getWidth() - this.I;
            } else {
                f11 = 0.0f;
            }
            canvas.translate((dp3 + f11) - this.H, this.F);
            this.J.draw(canvas);
            canvas.restore();
        }
        if (this.E != null) {
            org.telegram.ui.ActionBar.k6.f21711g3.setColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f22053z6, g6Var));
            int alpha2 = org.telegram.ui.ActionBar.k6.f21711g3.getAlpha();
            float f20 = this.f22929d0;
            if (f20 != 1.0f) {
                org.telegram.ui.ActionBar.k6.f21711g3.setAlpha((int) (alpha2 * f20));
            }
            canvas.save();
            if (!LocaleController.isRTL) {
                f16 = AndroidUtilities.leftBaseline;
            }
            float dp4 = AndroidUtilities.dp(f16);
            if (LocaleController.isRTL) {
                f17 = this.E.getWidth() - this.D;
            }
            canvas.translate((dp4 + f17) - this.C, this.f22941y);
            this.E.draw(canvas);
            org.telegram.ui.Components.u5.drawAnimatedEmojis(canvas, this.E, this.B, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas.restore();
            if (this.f22929d0 != 1.0f) {
                org.telegram.ui.ActionBar.k6.f21711g3.setAlpha(alpha2);
            }
        }
        if (this.d) {
            i10 = org.telegram.ui.ActionBar.k6.f21773jd;
        } else {
            i10 = org.telegram.ui.ActionBar.k6.f21756id;
        }
        int v02 = org.telegram.ui.ActionBar.k6.v0(i10, g6Var);
        RadialProgress2 radialProgress2 = this.Q;
        radialProgress2.d = v02;
        radialProgress2.H = this.f22929d0;
        radialProgress2.draw(canvas);
        if (this.f22927c) {
            if (LocaleController.isRTL) {
                canvas.drawLine(0.0f, getHeight() - 1, (getWidth() - AndroidUtilities.dp(72.0f)) - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.k6.T0("paintDivider", g6Var));
            } else {
                canvas.drawLine(AndroidUtilities.dp(72.0f), getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.k6.T0("paintDivider", g6Var));
            }
        }
    }

    public final void c(Canvas canvas) {
        boolean z4 = this.f22924a0;
        if (!z4 && this.f22926b0 == 0.0f) {
            return;
        }
        if (z4) {
            float f10 = this.f22926b0;
            if (f10 != 1.0f) {
                this.f22926b0 = f10 + 0.10666667f;
                invalidate();
                this.f22926b0 = Utilities.clamp(this.f22926b0, 1.0f, 0.0f);
                int measuredWidth = (getMeasuredWidth() - AndroidUtilities.dp(12.0f)) - org.telegram.ui.ActionBar.k6.Z0.getIntrinsicWidth();
                int measuredHeight = (getMeasuredHeight() - org.telegram.ui.ActionBar.k6.Z0.getIntrinsicHeight()) >> 1;
                canvas.save();
                float f11 = this.f22926b0;
                canvas.scale(f11, f11, (org.telegram.ui.ActionBar.k6.Z0.getIntrinsicWidth() / 2.0f) + measuredWidth, (org.telegram.ui.ActionBar.k6.Z0.getIntrinsicHeight() / 2.0f) + measuredHeight);
                Drawable drawable = org.telegram.ui.ActionBar.k6.Z0;
                drawable.setBounds(measuredWidth, measuredHeight, drawable.getIntrinsicWidth() + measuredWidth, org.telegram.ui.ActionBar.k6.Z0.getIntrinsicHeight() + measuredHeight);
                org.telegram.ui.ActionBar.k6.Z0.draw(canvas);
                canvas.restore();
            }
        }
        if (!z4) {
            float f12 = this.f22926b0;
            if (f12 != 0.0f) {
                this.f22926b0 = f12 - 0.10666667f;
                invalidate();
            }
        }
        this.f22926b0 = Utilities.clamp(this.f22926b0, 1.0f, 0.0f);
        int measuredWidth2 = (getMeasuredWidth() - AndroidUtilities.dp(12.0f)) - org.telegram.ui.ActionBar.k6.Z0.getIntrinsicWidth();
        int measuredHeight2 = (getMeasuredHeight() - org.telegram.ui.ActionBar.k6.Z0.getIntrinsicHeight()) >> 1;
        canvas.save();
        float f112 = this.f22926b0;
        canvas.scale(f112, f112, (org.telegram.ui.ActionBar.k6.Z0.getIntrinsicWidth() / 2.0f) + measuredWidth2, (org.telegram.ui.ActionBar.k6.Z0.getIntrinsicHeight() / 2.0f) + measuredHeight2);
        Drawable drawable2 = org.telegram.ui.ActionBar.k6.Z0;
        drawable2.setBounds(measuredWidth2, measuredHeight2, drawable2.getIntrinsicWidth() + measuredWidth2, org.telegram.ui.ActionBar.k6.Z0.getIntrinsicHeight() + measuredHeight2);
        org.telegram.ui.ActionBar.k6.Z0.draw(canvas);
        canvas.restore();
    }

    public boolean d(MessageObject messageObject) {
        Utilities.CallbackReturn callbackReturn = this.f22933f0;
        if (callbackReturn != null && ((Boolean) callbackReturn.run(messageObject)).booleanValue()) {
            return true;
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        g(false, true);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z4 = this.f22928c0;
        if (z4) {
            float f10 = this.f22929d0;
            if (f10 != 1.0f) {
                this.f22929d0 = f10 + 0.10666667f;
                invalidate();
                this.f22929d0 = Utilities.clamp(this.f22929d0, 1.0f, 0.0f);
                if (this.f22934g0 == 1.0f && this.f22935h0 != null) {
                    canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) ((1.0f - this.f22934g0) * 255.0f), 31);
                    this.f22935h0.setViewType(4);
                    this.f22935h0.e();
                    this.f22935h0.h();
                    this.f22935h0.draw(canvas);
                    canvas.restore();
                    canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) (this.f22934g0 * 255.0f), 31);
                    b(canvas);
                    super.dispatchDraw(canvas);
                    c(canvas);
                    canvas.restore();
                    return;
                }
                b(canvas);
                c(canvas);
                super.dispatchDraw(canvas);
            }
        }
        if (!z4) {
            float f11 = this.f22929d0;
            if (f11 != 0.0f) {
                this.f22929d0 = f11 - 0.10666667f;
                invalidate();
            }
        }
        this.f22929d0 = Utilities.clamp(this.f22929d0, 1.0f, 0.0f);
        if (this.f22934g0 == 1.0f) {
        }
        b(canvas);
        c(canvas);
        super.dispatchDraw(canvas);
    }

    public final void e(boolean z4, boolean z10) {
        np npVar = this.f22925b;
        if (npVar.getVisibility() != 0) {
            npVar.setVisibility(0);
        }
        npVar.a(z4, z10);
    }

    public final void f(MessageObject messageObject, boolean z4) {
        TLRPC.PhotoSize photoSize;
        this.f22927c = z4;
        this.K = messageObject;
        TLRPC.Document document = messageObject.getDocument();
        if (document != null) {
            photoSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 360);
        } else {
            photoSize = null;
        }
        boolean z10 = photoSize instanceof TLRPC.TL_photoSize;
        RadialProgress2 radialProgress2 = this.Q;
        if (!z10 && !(photoSize instanceof TLRPC.TL_photoSizeProgressive)) {
            Bitmap bitmap = messageObject.audioCover;
            if (bitmap == null) {
                bitmap = null;
            }
            if (bitmap != null) {
                radialProgress2.f24985w.setImageBitmap(bitmap);
            } else {
                String artworkUrl = messageObject.getArtworkUrl(true);
                if (!TextUtils.isEmpty(artworkUrl)) {
                    radialProgress2.h(artworkUrl);
                } else {
                    radialProgress2.i(null, null, null);
                }
            }
        } else {
            radialProgress2.i(photoSize, document, messageObject);
        }
        g(false, false);
        requestLayout();
    }

    public final void g(boolean z4, boolean z10) {
        boolean z11;
        int i10;
        int i11;
        String fileName = this.K.getFileName();
        if (TextUtils.isEmpty(fileName)) {
            return;
        }
        MessageObject messageObject = this.K;
        if (!messageObject.attachPathExists && !messageObject.mediaExists) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (SharedConfig.streamMedia && messageObject.isMusic() && ((int) this.K.getDialogId()) != 0) {
            if (z11) {
                i11 = 1;
            } else {
                i11 = 2;
            }
            this.f22932f = i11;
            z11 = true;
        } else {
            this.f22932f = 0;
            this.P = -1;
        }
        int i12 = this.f22932f;
        int i13 = this.M;
        RadialProgress2 radialProgress2 = this.Q;
        if (i12 != 0) {
            if (this.K.isOutOwner()) {
                i10 = org.telegram.ui.ActionBar.k6.Nb;
            } else {
                i10 = org.telegram.ui.ActionBar.k6.f21757ie;
            }
            radialProgress2.f24969e.setColor(org.telegram.ui.ActionBar.k6.v0(i10, this.W));
            boolean isPlayingMessage = MediaController.getInstance().isPlayingMessage(this.K);
            if (isPlayingMessage && (!isPlayingMessage || !MediaController.getInstance().isMessagePaused())) {
                this.O = 1;
            } else {
                this.O = 0;
            }
            radialProgress2.setIcon(getIconForCurrentState(), z4, z10);
            if (this.f22932f == 1) {
                DownloadController.getInstance(i13).removeLoadingFileObserver(this);
                this.P = -1;
                radialProgress2.k(getMiniIconForCurrentState(), z4, z10);
                return;
            }
            DownloadController.getInstance(i13).addLoadingFileObserver(fileName, this.K, this);
            if (!FileLoader.getInstance(i13).isLoadingFile(fileName)) {
                this.P = 0;
                radialProgress2.k(getMiniIconForCurrentState(), z4, z10);
                return;
            }
            this.P = 1;
            radialProgress2.k(getMiniIconForCurrentState(), z4, z10);
            Float fileProgress = ImageLoader.getInstance().getFileProgress(fileName);
            if (fileProgress != null) {
                radialProgress2.o(fileProgress.floatValue(), z10);
            } else {
                radialProgress2.o(0.0f, z10);
            }
        } else if (z11) {
            DownloadController.getInstance(i13).removeLoadingFileObserver(this);
            boolean isPlayingMessage2 = MediaController.getInstance().isPlayingMessage(this.K);
            if (isPlayingMessage2 && (!isPlayingMessage2 || !MediaController.getInstance().isMessagePaused())) {
                this.O = 1;
            } else {
                this.O = 0;
            }
            radialProgress2.o(1.0f, z10);
            radialProgress2.setIcon(getIconForCurrentState(), z4, z10);
            invalidate();
        } else {
            DownloadController.getInstance(i13).addLoadingFileObserver(fileName, this.K, this);
            if (!FileLoader.getInstance(i13).isLoadingFile(fileName)) {
                this.O = 2;
                radialProgress2.o(0.0f, z10);
            } else {
                this.O = 4;
                Float fileProgress2 = ImageLoader.getInstance().getFileProgress(fileName);
                if (fileProgress2 != null) {
                    radialProgress2.o(fileProgress2.floatValue(), z10);
                } else {
                    radialProgress2.o(0.0f, z10);
                }
            }
            radialProgress2.setIcon(getIconForCurrentState(), z4, z10);
            invalidate();
        }
    }

    public MessageObject getMessage() {
        return this.K;
    }

    @Override
    public int getObserverTag() {
        return this.N;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.Q.e();
        g(false, false);
        int i10 = this.M;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.messagePlayingDidReset);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.messagePlayingDidStart);
        this.f22940x = org.telegram.ui.Components.u5.update(0, this, this.f22940x, this.f22938s);
        this.B = org.telegram.ui.Components.u5.update(0, this, this.B, this.E);
        this.G = org.telegram.ui.Components.u5.update(0, this, this.G, this.J);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = this.M;
        DownloadController.getInstance(i10).removeLoadingFileObserver(this);
        this.Q.f();
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.messagePlayingDidReset);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.messagePlayingDidStart);
        org.telegram.ui.Components.u5.release(this, this.f22940x);
        org.telegram.ui.Components.u5.release(this, this.B);
        org.telegram.ui.Components.u5.release(this, this.G);
    }

    @Override
    public final void onFailedDownload(String str, boolean z4) {
        g(true, z4);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        String string;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        if (this.K.isMusic()) {
            accessibilityNodeInfo.setText(LocaleController.formatString("AccDescrMusicInfo", R.string.AccDescrMusicInfo, this.K.getMusicAuthor(), this.K.getMusicTitle()));
        } else if (this.f22938s != null && this.E != null) {
            accessibilityNodeInfo.setText(((Object) this.f22938s.getText()) + ", " + ((Object) this.E.getText()));
        }
        if (this.f22925b.f29606a.f24809q) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(true);
        }
        int iconForCurrentState = getIconForCurrentState();
        if (iconForCurrentState != 1) {
            if (iconForCurrentState != 2) {
                if (iconForCurrentState != 3) {
                    string = LocaleController.getString("AccActionPlay", R.string.AccActionPlay);
                } else {
                    string = LocaleController.getString("AccActionCancelDownload", R.string.AccActionCancelDownload);
                }
            } else {
                string = LocaleController.getString("AccActionDownload", R.string.AccActionDownload);
            }
        } else {
            string = LocaleController.getString("AccActionPause", R.string.AccActionPause);
        }
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, string));
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return onTouchEvent(motionEvent);
    }

    @Override
    public final void onMeasure(int r26, int r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.h7.onMeasure(int, int):void");
    }

    @Override
    public final void onProgressDownload(String str, long j10, long j11) {
        this.Q.o(Math.min(1.0f, ((float) j10) / ((float) j11)), true);
        if (this.f22932f != 0) {
            if (this.P != 1) {
                g(false, true);
            }
        } else if (this.O != 4) {
            g(false, true);
        }
    }

    @Override
    public final void onSuccessDownload(String str) {
        this.Q.o(1.0f, true);
        g(false, true);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.h7.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        if (i10 == 16) {
            a();
            return true;
        }
        return super.performAccessibilityAction(i10, bundle);
    }

    public void setCheckForButtonPress(boolean z4) {
        this.L = z4;
    }

    public void setEnterAnimationAlpha(float f10) {
        if (this.f22934g0 != f10) {
            this.f22934g0 = f10;
            invalidate();
        }
    }

    public void setGlobalGradientView(u00 u00Var) {
        this.f22935h0 = u00Var;
    }

    public void setNeedPlayMessageListener(Utilities.CallbackReturn<MessageObject, Boolean> callbackReturn) {
        this.f22933f0 = callbackReturn;
    }

    public h7(Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f22937r = AndroidUtilities.dp(9.0f);
        this.f22941y = AndroidUtilities.dp(29.0f);
        this.F = AndroidUtilities.dp(29.0f);
        int i11 = UserConfig.selectedAccount;
        this.M = i11;
        this.f22928c0 = true;
        this.f22929d0 = 0.0f;
        this.f22934g0 = 1.0f;
        this.W = g6Var;
        this.R = i10;
        setFocusable(true);
        setImportantForAccessibility(1);
        RadialProgress2 radialProgress2 = new RadialProgress2(this, g6Var);
        this.Q = radialProgress2;
        radialProgress2.g(org.telegram.ui.ActionBar.k6.f21757ie, org.telegram.ui.ActionBar.k6.f21774je, org.telegram.ui.ActionBar.k6.f21967uc, org.telegram.ui.ActionBar.k6.f21985vc);
        this.N = DownloadController.getInstance(i11).generateObserverTag();
        setWillNotDraw(false);
        np npVar = new np(context, 22, g6Var);
        this.f22925b = npVar;
        npVar.setVisibility(4);
        npVar.b(-1, org.telegram.ui.ActionBar.k6.f21659d6, org.telegram.ui.ActionBar.k6.f21786k7);
        npVar.setDrawUnchecked(false);
        npVar.setDrawBackgroundAsArc(3);
        boolean z4 = LocaleController.isRTL;
        addView(npVar, k7.c6.d(24, 24.0f, (z4 ? 5 : 3) | 48, z4 ? 0.0f : 38.1f, 32.1f, z4 ? 6.0f : 0.0f, 0.0f));
        if (i10 == 1) {
            TextPaint textPaint = new TextPaint(1);
            this.U = textPaint;
            textPaint.setTextSize(AndroidUtilities.dp(13.0f));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(".");
            this.f22923a = spannableStringBuilder;
            spannableStringBuilder.setSpan(new bt(), 0, 1, 0);
        }
        TextPaint textPaint2 = new TextPaint(1);
        this.V = textPaint2;
        textPaint2.setTextSize(AndroidUtilities.dp(13.0f));
        if (g6Var != null) {
            TextPaint textPaint3 = new TextPaint(1);
            this.f22931e0 = textPaint3;
            textPaint3.setTypeface(AndroidUtilities.bold());
            textPaint3.setTextSize(AndroidUtilities.dp(15.0f));
            textPaint3.setColor(g6Var.B0(org.telegram.ui.ActionBar.k6.G6));
        }
    }

    @Override
    public final void onProgressUpload(String str, long j10, long j11, boolean z4) {
    }
}
