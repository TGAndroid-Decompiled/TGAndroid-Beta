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
import org.telegram.ui.Components.hp;
import org.telegram.ui.Components.p00;
import org.telegram.ui.Components.vs;
public class f7 extends FrameLayout implements DownloadController.FileDownloadProgressListener, NotificationCenter.NotificationCenterDelegate {
    public org.telegram.ui.Components.u5 A;
    public float B;
    public float C;
    public StaticLayout D;
    public int E;
    public org.telegram.ui.Components.u5 F;
    public float G;
    public float H;
    public StaticLayout I;
    public MessageObject J;
    public boolean K;
    public final int L;
    public final int M;
    public int N;
    public int O;
    public final RadialProgress2 P;
    public final int Q;
    public StaticLayout R;
    public int S;
    public final TextPaint T;
    public final TextPaint U;
    public final org.telegram.ui.ActionBar.c6 V;
    public boolean W;
    public final SpannableStringBuilder f24351a;
    public float f24352a0;
    public final hp f24353b;
    public boolean f24354b0;
    public boolean f24355c;
    public float f24356c0;
    public boolean d;
    public final TextPaint f24357d0;
    public boolean f24358e;
    public Utilities.CallbackReturn f24359e0;
    public int f24360f;
    public float f24361f0;
    public p00 f24362g0;
    public int h;
    public int f24363n;
    public final int f24364r;
    public StaticLayout f24365s;
    public float v;
    public float f24366w;
    public org.telegram.ui.Components.u5 f24367x;
    public int f24368y;

    public f7(Context context) {
        this(context, 0, null);
    }

    private int getIconForCurrentState() {
        int i10 = this.N;
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
        int i10 = this.O;
        if (i10 < 0) {
            return 4;
        }
        if (i10 == 0) {
            return 2;
        }
        return 3;
    }

    public void a() {
        int i10 = this.N;
        int i11 = this.L;
        RadialProgress2 radialProgress2 = this.P;
        if (i10 == 0) {
            if (this.O == 0) {
                this.J.putInDownloadsStore = true;
                FileLoader.getInstance(i11).loadFile(this.J.getDocument(), this.J, 1, 0);
            }
            if (d(this.J)) {
                if (this.f24360f == 2 && this.O != 1) {
                    this.O = 1;
                    radialProgress2.o(0.0f, false);
                    radialProgress2.k(getMiniIconForCurrentState(), false, true);
                }
                this.N = 1;
                radialProgress2.setIcon(getIconForCurrentState(), false, true);
                invalidate();
            }
        } else if (i10 == 1) {
            if (MediaController.getInstance().lambda$startAudioAgain$7(this.J)) {
                this.N = 0;
                radialProgress2.setIcon(getIconForCurrentState(), false, true);
                invalidate();
            }
        } else if (i10 == 2) {
            radialProgress2.o(0.0f, false);
            this.J.putInDownloadsStore = true;
            FileLoader.getInstance(i11).loadFile(this.J.getDocument(), this.J, 1, 0);
            this.N = 4;
            radialProgress2.setIcon(getIconForCurrentState(), false, true);
            invalidate();
        } else if (i10 == 4) {
            FileLoader.getInstance(i11).cancelLoadFile(this.J.getDocument());
            this.N = 2;
            radialProgress2.setIcon(getIconForCurrentState(), false, true);
            invalidate();
        }
    }

    public final void b(Canvas canvas) {
        int i10;
        float f9;
        float f10;
        float f11;
        float f12;
        StaticLayout staticLayout;
        float f13;
        float f14;
        int i11;
        org.telegram.ui.ActionBar.c6 c6Var = this.V;
        if (this.Q == 1) {
            this.T.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.A6, c6Var));
        }
        StaticLayout staticLayout2 = this.R;
        int i12 = this.f24364r;
        int i13 = 0;
        float f15 = 24.0f;
        if (staticLayout2 != null) {
            canvas.save();
            if (LocaleController.isRTL) {
                f14 = 24.0f;
            } else {
                f14 = AndroidUtilities.leftBaseline;
            }
            int dp = AndroidUtilities.dp(f14);
            if (LocaleController.isRTL) {
                i11 = 0;
            } else {
                i11 = this.S;
            }
            canvas.translate(dp + i11, i12);
            this.R.draw(canvas);
            canvas.restore();
        }
        float f16 = 0.0f;
        if (this.f24365s != null) {
            int alpha = org.telegram.ui.ActionBar.g6.f23096f3.getAlpha();
            float f17 = this.f24356c0;
            if (f17 != 1.0f) {
                org.telegram.ui.ActionBar.g6.f23096f3.setAlpha((int) (alpha * f17));
            }
            canvas.save();
            if (LocaleController.isRTL) {
                f11 = 24.0f;
            } else {
                f11 = AndroidUtilities.leftBaseline;
            }
            int dp2 = AndroidUtilities.dp(f11);
            if (LocaleController.isRTL && (staticLayout = this.R) != null) {
                int width = staticLayout.getWidth();
                if (LocaleController.isRTL) {
                    f13 = 12.0f;
                } else {
                    f13 = 4.0f;
                }
                i13 = width + AndroidUtilities.dp(f13);
            }
            float f18 = dp2 + i13;
            if (LocaleController.isRTL) {
                f12 = this.f24365s.getWidth() - this.f24366w;
            } else {
                f12 = 0.0f;
            }
            canvas.translate((f18 + f12) - this.v, i12);
            this.f24365s.draw(canvas);
            org.telegram.ui.Components.y5.drawAnimatedEmojis(canvas, this.f24365s, this.f24367x, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas.restore();
            if (this.f24356c0 != 1.0f) {
                org.telegram.ui.ActionBar.g6.f23096f3.setAlpha(alpha);
            }
        }
        if (this.I != null) {
            this.U.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var));
            canvas.save();
            if (LocaleController.isRTL) {
                f9 = 24.0f;
            } else {
                f9 = AndroidUtilities.leftBaseline;
            }
            float dp3 = AndroidUtilities.dp(f9);
            if (LocaleController.isRTL) {
                f10 = this.I.getWidth() - this.H;
            } else {
                f10 = 0.0f;
            }
            canvas.translate((dp3 + f10) - this.G, this.E);
            this.I.draw(canvas);
            canvas.restore();
        }
        if (this.D != null) {
            org.telegram.ui.ActionBar.g6.f23114g3.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23450z6, c6Var));
            int alpha2 = org.telegram.ui.ActionBar.g6.f23114g3.getAlpha();
            float f19 = this.f24356c0;
            if (f19 != 1.0f) {
                org.telegram.ui.ActionBar.g6.f23114g3.setAlpha((int) (alpha2 * f19));
            }
            canvas.save();
            if (!LocaleController.isRTL) {
                f15 = AndroidUtilities.leftBaseline;
            }
            float dp4 = AndroidUtilities.dp(f15);
            if (LocaleController.isRTL) {
                f16 = this.D.getWidth() - this.C;
            }
            canvas.translate((dp4 + f16) - this.B, this.f24368y);
            this.D.draw(canvas);
            org.telegram.ui.Components.y5.drawAnimatedEmojis(canvas, this.D, this.A, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas.restore();
            if (this.f24356c0 != 1.0f) {
                org.telegram.ui.ActionBar.g6.f23114g3.setAlpha(alpha2);
            }
        }
        if (this.d) {
            i10 = org.telegram.ui.ActionBar.g6.f23177jd;
        } else {
            i10 = org.telegram.ui.ActionBar.g6.f23159id;
        }
        int v02 = org.telegram.ui.ActionBar.g6.v0(i10, c6Var);
        RadialProgress2 radialProgress2 = this.P;
        radialProgress2.d = v02;
        radialProgress2.H = this.f24356c0;
        radialProgress2.draw(canvas);
        if (this.f24355c) {
            if (LocaleController.isRTL) {
                canvas.drawLine(0.0f, getHeight() - 1, (getWidth() - AndroidUtilities.dp(72.0f)) - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.g6.T0("paintDivider", c6Var));
            } else {
                canvas.drawLine(AndroidUtilities.dp(72.0f), getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.g6.T0("paintDivider", c6Var));
            }
        }
    }

    public final void c(Canvas canvas) {
        boolean z10 = this.W;
        if (!z10 && this.f24352a0 == 0.0f) {
            return;
        }
        if (z10) {
            float f9 = this.f24352a0;
            if (f9 != 1.0f) {
                this.f24352a0 = f9 + 0.10666667f;
                invalidate();
                this.f24352a0 = Utilities.clamp(this.f24352a0, 1.0f, 0.0f);
                int measuredWidth = (getMeasuredWidth() - AndroidUtilities.dp(12.0f)) - org.telegram.ui.ActionBar.g6.Z0.getIntrinsicWidth();
                int measuredHeight = (getMeasuredHeight() - org.telegram.ui.ActionBar.g6.Z0.getIntrinsicHeight()) >> 1;
                canvas.save();
                float f10 = this.f24352a0;
                canvas.scale(f10, f10, (org.telegram.ui.ActionBar.g6.Z0.getIntrinsicWidth() / 2.0f) + measuredWidth, (org.telegram.ui.ActionBar.g6.Z0.getIntrinsicHeight() / 2.0f) + measuredHeight);
                Drawable drawable = org.telegram.ui.ActionBar.g6.Z0;
                drawable.setBounds(measuredWidth, measuredHeight, drawable.getIntrinsicWidth() + measuredWidth, org.telegram.ui.ActionBar.g6.Z0.getIntrinsicHeight() + measuredHeight);
                org.telegram.ui.ActionBar.g6.Z0.draw(canvas);
                canvas.restore();
            }
        }
        if (!z10) {
            float f11 = this.f24352a0;
            if (f11 != 0.0f) {
                this.f24352a0 = f11 - 0.10666667f;
                invalidate();
            }
        }
        this.f24352a0 = Utilities.clamp(this.f24352a0, 1.0f, 0.0f);
        int measuredWidth2 = (getMeasuredWidth() - AndroidUtilities.dp(12.0f)) - org.telegram.ui.ActionBar.g6.Z0.getIntrinsicWidth();
        int measuredHeight2 = (getMeasuredHeight() - org.telegram.ui.ActionBar.g6.Z0.getIntrinsicHeight()) >> 1;
        canvas.save();
        float f102 = this.f24352a0;
        canvas.scale(f102, f102, (org.telegram.ui.ActionBar.g6.Z0.getIntrinsicWidth() / 2.0f) + measuredWidth2, (org.telegram.ui.ActionBar.g6.Z0.getIntrinsicHeight() / 2.0f) + measuredHeight2);
        Drawable drawable2 = org.telegram.ui.ActionBar.g6.Z0;
        drawable2.setBounds(measuredWidth2, measuredHeight2, drawable2.getIntrinsicWidth() + measuredWidth2, org.telegram.ui.ActionBar.g6.Z0.getIntrinsicHeight() + measuredHeight2);
        org.telegram.ui.ActionBar.g6.Z0.draw(canvas);
        canvas.restore();
    }

    public boolean d(MessageObject messageObject) {
        Utilities.CallbackReturn callbackReturn = this.f24359e0;
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
        boolean z10 = this.f24354b0;
        if (z10) {
            float f9 = this.f24356c0;
            if (f9 != 1.0f) {
                this.f24356c0 = f9 + 0.10666667f;
                invalidate();
                this.f24356c0 = Utilities.clamp(this.f24356c0, 1.0f, 0.0f);
                if (this.f24361f0 == 1.0f && this.f24362g0 != null) {
                    canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) ((1.0f - this.f24361f0) * 255.0f), 31);
                    this.f24362g0.setViewType(4);
                    this.f24362g0.e();
                    this.f24362g0.h();
                    this.f24362g0.draw(canvas);
                    canvas.restore();
                    canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) (this.f24361f0 * 255.0f), 31);
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
        if (!z10) {
            float f10 = this.f24356c0;
            if (f10 != 0.0f) {
                this.f24356c0 = f10 - 0.10666667f;
                invalidate();
            }
        }
        this.f24356c0 = Utilities.clamp(this.f24356c0, 1.0f, 0.0f);
        if (this.f24361f0 == 1.0f) {
        }
        b(canvas);
        c(canvas);
        super.dispatchDraw(canvas);
    }

    public final void e(boolean z10, boolean z11) {
        hp hpVar = this.f24353b;
        if (hpVar.getVisibility() != 0) {
            hpVar.setVisibility(0);
        }
        hpVar.a(z10, z11);
    }

    public final void f(MessageObject messageObject, boolean z10) {
        TLRPC.PhotoSize photoSize;
        this.f24355c = z10;
        this.J = messageObject;
        TLRPC.Document document = messageObject.getDocument();
        if (document != null) {
            photoSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 360);
        } else {
            photoSize = null;
        }
        boolean z11 = photoSize instanceof TLRPC.TL_photoSize;
        RadialProgress2 radialProgress2 = this.P;
        if (!z11 && !(photoSize instanceof TLRPC.TL_photoSizeProgressive)) {
            Bitmap bitmap = messageObject.audioCover;
            if (bitmap == null) {
                bitmap = null;
            }
            if (bitmap != null) {
                radialProgress2.f26498w.setImageBitmap(bitmap);
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

    public final void g(boolean z10, boolean z11) {
        boolean z12;
        int i10;
        int i11;
        String fileName = this.J.getFileName();
        if (TextUtils.isEmpty(fileName)) {
            return;
        }
        MessageObject messageObject = this.J;
        if (!messageObject.attachPathExists && !messageObject.mediaExists) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (SharedConfig.streamMedia && messageObject.isMusic() && ((int) this.J.getDialogId()) != 0) {
            if (z12) {
                i11 = 1;
            } else {
                i11 = 2;
            }
            this.f24360f = i11;
            z12 = true;
        } else {
            this.f24360f = 0;
            this.O = -1;
        }
        int i12 = this.f24360f;
        int i13 = this.L;
        RadialProgress2 radialProgress2 = this.P;
        if (i12 != 0) {
            if (this.J.isOutOwner()) {
                i10 = org.telegram.ui.ActionBar.g6.Nb;
            } else {
                i10 = org.telegram.ui.ActionBar.g6.f23160ie;
            }
            radialProgress2.f26482e.setColor(org.telegram.ui.ActionBar.g6.v0(i10, this.V));
            boolean isPlayingMessage = MediaController.getInstance().isPlayingMessage(this.J);
            if (isPlayingMessage && (!isPlayingMessage || !MediaController.getInstance().isMessagePaused())) {
                this.N = 1;
            } else {
                this.N = 0;
            }
            radialProgress2.setIcon(getIconForCurrentState(), z10, z11);
            if (this.f24360f == 1) {
                DownloadController.getInstance(i13).removeLoadingFileObserver(this);
                this.O = -1;
                radialProgress2.k(getMiniIconForCurrentState(), z10, z11);
                return;
            }
            DownloadController.getInstance(i13).addLoadingFileObserver(fileName, this.J, this);
            if (!FileLoader.getInstance(i13).isLoadingFile(fileName)) {
                this.O = 0;
                radialProgress2.k(getMiniIconForCurrentState(), z10, z11);
                return;
            }
            this.O = 1;
            radialProgress2.k(getMiniIconForCurrentState(), z10, z11);
            Float fileProgress = ImageLoader.getInstance().getFileProgress(fileName);
            if (fileProgress != null) {
                radialProgress2.o(fileProgress.floatValue(), z11);
            } else {
                radialProgress2.o(0.0f, z11);
            }
        } else if (z12) {
            DownloadController.getInstance(i13).removeLoadingFileObserver(this);
            boolean isPlayingMessage2 = MediaController.getInstance().isPlayingMessage(this.J);
            if (isPlayingMessage2 && (!isPlayingMessage2 || !MediaController.getInstance().isMessagePaused())) {
                this.N = 1;
            } else {
                this.N = 0;
            }
            radialProgress2.o(1.0f, z11);
            radialProgress2.setIcon(getIconForCurrentState(), z10, z11);
            invalidate();
        } else {
            DownloadController.getInstance(i13).addLoadingFileObserver(fileName, this.J, this);
            if (!FileLoader.getInstance(i13).isLoadingFile(fileName)) {
                this.N = 2;
                radialProgress2.o(0.0f, z11);
            } else {
                this.N = 4;
                Float fileProgress2 = ImageLoader.getInstance().getFileProgress(fileName);
                if (fileProgress2 != null) {
                    radialProgress2.o(fileProgress2.floatValue(), z11);
                } else {
                    radialProgress2.o(0.0f, z11);
                }
            }
            radialProgress2.setIcon(getIconForCurrentState(), z10, z11);
            invalidate();
        }
    }

    public MessageObject getMessage() {
        return this.J;
    }

    @Override
    public int getObserverTag() {
        return this.M;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.P.e();
        g(false, false);
        int i10 = this.L;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.messagePlayingDidReset);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.messagePlayingDidStart);
        this.f24367x = org.telegram.ui.Components.y5.update(0, this, this.f24367x, this.f24365s);
        this.A = org.telegram.ui.Components.y5.update(0, this, this.A, this.D);
        this.F = org.telegram.ui.Components.y5.update(0, this, this.F, this.I);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = this.L;
        DownloadController.getInstance(i10).removeLoadingFileObserver(this);
        this.P.f();
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.messagePlayingDidReset);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.messagePlayingDidStart);
        org.telegram.ui.Components.y5.release(this, this.f24367x);
        org.telegram.ui.Components.y5.release(this, this.A);
        org.telegram.ui.Components.y5.release(this, this.F);
    }

    @Override
    public final void onFailedDownload(String str, boolean z10) {
        g(true, z10);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        String string;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        if (this.J.isMusic()) {
            accessibilityNodeInfo.setText(LocaleController.formatString("AccDescrMusicInfo", R.string.AccDescrMusicInfo, this.J.getMusicAuthor(), this.J.getMusicTitle()));
        } else if (this.f24365s != null && this.D != null) {
            accessibilityNodeInfo.setText(((Object) this.f24365s.getText()) + ", " + ((Object) this.D.getText()));
        }
        if (this.f24353b.f29211a.f26324q) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.f7.onMeasure(int, int):void");
    }

    @Override
    public final void onProgressDownload(String str, long j10, long j11) {
        this.P.o(Math.min(1.0f, ((float) j10) / ((float) j11)), true);
        if (this.f24360f != 0) {
            if (this.O != 1) {
                g(false, true);
            }
        } else if (this.N != 4) {
            g(false, true);
        }
    }

    @Override
    public final void onSuccessDownload(String str) {
        this.P.o(1.0f, true);
        g(false, true);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.f7.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        if (i10 == 16) {
            a();
            return true;
        }
        return super.performAccessibilityAction(i10, bundle);
    }

    public void setCheckForButtonPress(boolean z10) {
        this.K = z10;
    }

    public void setEnterAnimationAlpha(float f9) {
        if (this.f24361f0 != f9) {
            this.f24361f0 = f9;
            invalidate();
        }
    }

    public void setGlobalGradientView(p00 p00Var) {
        this.f24362g0 = p00Var;
    }

    public void setNeedPlayMessageListener(Utilities.CallbackReturn<MessageObject, Boolean> callbackReturn) {
        this.f24359e0 = callbackReturn;
    }

    public f7(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f24364r = AndroidUtilities.dp(9.0f);
        this.f24368y = AndroidUtilities.dp(29.0f);
        this.E = AndroidUtilities.dp(29.0f);
        int i11 = UserConfig.selectedAccount;
        this.L = i11;
        this.f24354b0 = true;
        this.f24356c0 = 0.0f;
        this.f24361f0 = 1.0f;
        this.V = c6Var;
        this.Q = i10;
        setFocusable(true);
        setImportantForAccessibility(1);
        RadialProgress2 radialProgress2 = new RadialProgress2(this, c6Var);
        this.P = radialProgress2;
        radialProgress2.g(org.telegram.ui.ActionBar.g6.f23160ie, org.telegram.ui.ActionBar.g6.f23178je, org.telegram.ui.ActionBar.g6.f23371uc, org.telegram.ui.ActionBar.g6.f23389vc);
        this.M = DownloadController.getInstance(i11).generateObserverTag();
        setWillNotDraw(false);
        hp hpVar = new hp(context, 22, c6Var);
        this.f24353b = hpVar;
        hpVar.setVisibility(4);
        hpVar.b(-1, org.telegram.ui.ActionBar.g6.f23062d6, org.telegram.ui.ActionBar.g6.f23190k7);
        hpVar.setDrawUnchecked(false);
        hpVar.setDrawBackgroundAsArc(3);
        boolean z10 = LocaleController.isRTL;
        addView(hpVar, i7.f6.d(24, 24.0f, (z10 ? 5 : 3) | 48, z10 ? 0.0f : 38.1f, 32.1f, z10 ? 6.0f : 0.0f, 0.0f));
        if (i10 == 1) {
            TextPaint textPaint = new TextPaint(1);
            this.T = textPaint;
            textPaint.setTextSize(AndroidUtilities.dp(13.0f));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(".");
            this.f24351a = spannableStringBuilder;
            spannableStringBuilder.setSpan(new vs(), 0, 1, 0);
        }
        TextPaint textPaint2 = new TextPaint(1);
        this.U = textPaint2;
        textPaint2.setTextSize(AndroidUtilities.dp(13.0f));
        if (c6Var != null) {
            TextPaint textPaint3 = new TextPaint(1);
            this.f24357d0 = textPaint3;
            textPaint3.setTypeface(AndroidUtilities.bold());
            textPaint3.setTextSize(AndroidUtilities.dp(15.0f));
            textPaint3.setColor(c6Var.C0(org.telegram.ui.ActionBar.g6.G6));
        }
    }

    @Override
    public final void onProgressUpload(String str, long j10, long j11, boolean z10) {
    }
}
