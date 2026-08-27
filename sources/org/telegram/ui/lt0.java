package org.telegram.ui;

import android.animation.AnimatorSet;
import android.os.StatFs;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraView;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

public final class lt0 implements Runnable {

    public final int f40248a;

    public final Object f40249b;

    public lt0(Object obj, int i10) {
        this.f40248a = i10;
        this.f40249b = obj;
    }

    @Override
    public final void run() {
        lh.w wVar;
        ArrayList arrayList;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        TL_iv.PageBlock pageBlock = null;
        int i15 = 0;
        switch (this.f40248a) {
            case 0:
                PhotoViewer.BackgroundDrawable backgroundDrawable = (PhotoViewer.BackgroundDrawable) this.f40249b;
                int i16 = PhotoViewer.BackgroundDrawable.f35819g;
                backgroundDrawable.a();
                break;
            case 1:
                bu0 bu0Var = (bu0) this.f40249b;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) bu0Var.f36886a.J0.getLayoutParams();
                ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation();
                int iX = org.telegram.messenger.rl.x(34.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 2);
                PhotoViewer photoViewer = bu0Var.f36886a;
                int i17 = iX + (!photoViewer.f35745s ? AndroidUtilities.statusBarHeight : 0);
                if (i17 != layoutParams.topMargin) {
                    layoutParams.topMargin = i17;
                    photoViewer.J0.setLayoutParams(layoutParams);
                }
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) bu0Var.f36886a.K0.getLayoutParams();
                int iX2 = org.telegram.messenger.rl.x(40.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 2);
                PhotoViewer photoViewer2 = bu0Var.f36886a;
                int i18 = iX2 + (!photoViewer2.f35745s ? AndroidUtilities.statusBarHeight : 0);
                if (layoutParams2.topMargin != i18) {
                    layoutParams2.topMargin = i18;
                    photoViewer2.K0.setLayoutParams(layoutParams2);
                }
                break;
            case 2:
                ((d5.i) this.f40249b).run();
                break;
            case 3:
                m mVar = (m) this.f40249b;
                mVar.getClass();
                mVar.presentFragment(new PremiumPreviewFragment(0, "settings"));
                break;
            case 4:
                ((AnimatorSet) this.f40249b).start();
                break;
            case 5:
                ((g1) this.f40249b).a(2, false);
                break;
            case 6:
                m4 m4Var = ((v0) this.f40249b).f43317a;
                m4Var.N0.unlock();
                Runnable runnable = m4Var.W;
                if (runnable != null) {
                    runnable.run();
                    m4Var.W = null;
                }
                break;
            case 7:
                w1 w1Var = (w1) ((s1) this.f40249b).f42391b;
                m4 m4Var2 = w1Var.f43570x;
                View view = m4Var2.K;
                if (view != null) {
                    m4Var2.L.addView(view, h7.z5.c(-1.0f, -1));
                    w1Var.f43570x.L.setVisibility(0);
                }
                break;
            case 8:
                we.e.s(((t1) this.f40249b).f42750a.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                break;
            case 9:
                ((g2) this.f40249b).requestLayout();
                break;
            case 10:
                z3 z3Var = (z3) this.f40249b;
                z3Var.release();
                z3Var.G.s();
                break;
            case 11:
                k4 k4Var = (k4) this.f40249b;
                ArrayList arrayList2 = new ArrayList(k4Var.d);
                int size = arrayList2.size();
                m4 m4Var3 = k4Var.H;
                int i19 = size + (m4Var3.G == null ? 0 : 1);
                int[] iArr = new int[i19];
                int[] iArr2 = new int[i19];
                q3 q3Var = m4Var3.f40347q0[0];
                if (q3Var != null && (wVar = q3Var.f41496b) != null) {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, Integer.MIN_VALUE);
                    int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE);
                    int i20 = 0;
                    int i21 = 0;
                    while (i20 < i19) {
                        boolean z10 = k4Var.D;
                        if (z10 && i20 == 0) {
                            iArr[i15] = i15;
                        } else {
                            int i22 = z10 ? i20 - 1 : i20;
                            TL_iv.PageBlock pageBlock2 = (i22 < 0 || i22 >= arrayList2.size()) ? pageBlock : (TL_iv.PageBlock) arrayList2.get(i22);
                            if (pageBlock2 == null || pageBlock2.cachedHeight == 0 || pageBlock2.cachedWidth != View.MeasureSpec.getSize(iMakeMeasureSpec)) {
                                f2.o1 o1VarG = k4Var.g(wVar, k4.I(pageBlock2));
                                View view2 = o1VarG.f5789a;
                                int i23 = i21;
                                TL_iv.PageBlock pageBlock3 = pageBlock2;
                                arrayList = arrayList2;
                                i10 = iMakeMeasureSpec2;
                                i11 = i20;
                                i12 = i23;
                                k4Var.H(o1VarG.f5793f, o1VarG, pageBlock3, i22, arrayList2.size(), true);
                                view2.measure(iMakeMeasureSpec, i10);
                                int measuredHeight = view2.getMeasuredHeight();
                                iArr[i11] = measuredHeight;
                                if (pageBlock3 != null) {
                                    pageBlock3.cachedHeight = measuredHeight;
                                    pageBlock3.cachedWidth = View.MeasureSpec.getSize(iMakeMeasureSpec);
                                }
                            } else {
                                iArr[i20] = pageBlock2.cachedHeight;
                            }
                            i13 = i11 - 1;
                            if (i13 < 0) {
                                i14 = 0;
                            } else {
                                i14 = iArr2[i13];
                            }
                            iArr2[i11] = i14 + iArr[i11];
                            i21 = i12 + iArr[i11];
                            i20 = i11 + 1;
                            iMakeMeasureSpec2 = i10;
                            arrayList2 = arrayList;
                            pageBlock = null;
                            i15 = 0;
                        }
                        arrayList = arrayList2;
                        i10 = iMakeMeasureSpec2;
                        i11 = i20;
                        i12 = i21;
                        i13 = i11 - 1;
                        if (i13 < 0) {
                            i14 = 0;
                        } else {
                            i14 = iArr2[i13];
                        }
                        iArr2[i11] = i14 + iArr[i11];
                        i21 = i12 + iArr[i11];
                        i20 = i11 + 1;
                        iMakeMeasureSpec2 = i10;
                        arrayList2 = arrayList;
                        pageBlock = null;
                        i15 = 0;
                    }
                    AndroidUtilities.runOnUIThread(new d5.i(k4Var, i21, iArr, iArr2));
                }
                break;
            case 12:
                c5 c5Var = (c5) this.f40249b;
                if (!c5Var.f36956w) {
                    c5Var.f36956w = true;
                    org.telegram.ui.Components.ol0.d(new b5(c5Var, i15));
                    break;
                }
                break;
            case 13:
                a6 a6Var = (a6) this.f40249b;
                a6Var.d.clear();
                a6Var.getMessagesController().getCacheByChatsController().saveKeepMediaExceptions(a6Var.f36382e, a6Var.d);
                a6Var.U();
                a6Var.finishFragment();
                break;
            case 14:
                b5 b5Var = (b5) this.f40249b;
                ArrayList<File> rootDirs = AndroidUtilities.getRootDirs();
                File file = rootDirs.get(0);
                file.getAbsolutePath();
                if (!TextUtils.isEmpty(SharedConfig.storageCacheDir)) {
                    int size2 = rootDirs.size();
                    while (i15 < size2) {
                        File file2 = rootDirs.get(i15);
                        if (file2.getAbsolutePath().startsWith(SharedConfig.storageCacheDir) && file2.canWrite()) {
                            file = file2;
                        } else {
                            i15++;
                        }
                    }
                }
                try {
                    StatFs statFs = new StatFs(file.getPath());
                    AndroidUtilities.runOnUIThread(new org.telegram.messenger.l0(statFs.getBlockCountLong(), statFs.getBlockSizeLong(), statFs.getAvailableBlocksLong(), b5Var));
                } catch (Exception e9) {
                    FileLog.e(e9);
                    return;
                }
                break;
            case 15:
                Utilities.Callback callback = (Utilities.Callback) this.f40249b;
                z6.f45032g0 = false;
                long jQ0 = z6.q0(5, FileLoader.checkDirectory(4));
                long jQ1 = z6.q0(4, FileLoader.checkDirectory(4));
                long jQ2 = z6.q0(0, FileLoader.checkDirectory(100)) + z6.q0(0, FileLoader.checkDirectory(0));
                long jQ3 = z6.q0(0, FileLoader.checkDirectory(101)) + z6.q0(0, FileLoader.checkDirectory(2));
                long jQ4 = z6.q0(1, FileLoader.checkDirectory(5)) + z6.q0(1, FileLoader.checkDirectory(3));
                long jQ5 = z6.q0(2, FileLoader.checkDirectory(5)) + z6.q0(2, FileLoader.checkDirectory(3));
                long jQ6 = z6.q0(3, FileLoader.checkDirectory(4)) + z6.q0(0, new File(FileLoader.checkDirectory(4), "acache"));
                long jQ7 = z6.q0(0, FileLoader.checkDirectory(1));
                long jQ8 = z6.q0(0, FileLoader.checkDirectory(6));
                long jQ9 = z6.q0(1, AndroidUtilities.getLogsDir());
                if (!BuildVars.DEBUG_VERSION && jQ9 < 268435456) {
                    jQ9 = 0;
                }
                long j10 = jQ0 + jQ1 + jQ3 + jQ7 + jQ2 + jQ4 + jQ5 + jQ6 + jQ8 + jQ9;
                z6.f45034i0 = Long.valueOf(j10);
                z6.f45033h0 = System.currentTimeMillis();
                if (!z6.f45032g0) {
                    AndroidUtilities.runOnUIThread(new f6(j10, 0, callback));
                }
                break;
            case 16:
                ((o6) this.f40249b).dismiss();
                break;
            case 17:
                t9 t9Var = (t9) ((w5) this.f40249b).f43609b;
                try {
                    CameraView cameraView = t9Var.f42821c;
                    cameraView.focusToPoint(cameraView.getWidth() / 2, t9Var.f42821c.getHeight() / 2, false);
                    break;
                } catch (Exception unused) {
                }
                CameraView cameraView2 = t9Var.f42821c;
                if (cameraView2 != null) {
                    t9Var.c0(cameraView2.getTextureView().getBitmap());
                }
                break;
            case 18:
                y9 y9Var = (y9) this.f40249b;
                x9 x9Var = y9Var.f44740a;
                if (x9Var != null) {
                    x9Var.requestFocus();
                    AndroidUtilities.showKeyboard(y9Var.f44740a);
                }
                break;
            case 19:
                na naVar = (na) this.f40249b;
                String str = naVar.f40706r;
                if (str == null || str.length() > 0) {
                    naVar.f40705n = true;
                    naVar.e0(naVar.v.size() <= 0);
                    naVar.f40705n = false;
                }
                break;
            case 20:
                gb gbVar = (gb) this.f40249b;
                if (gbVar.W != -1) {
                    gbVar.Y.getNotificationCenter().onAnimationFinish(gbVar.W);
                    gbVar.W = -1;
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("admin logs chatItemAnimator enable notifications");
                }
                break;
            case 21:
                qb qbVar = ((pb) this.f40249b).f41318f;
                qbVar.getNotificationCenter().onAnimationFinish(qbVar.K0);
                break;
            case 22:
                org.telegram.ui.Components.mc.b0((TLRPC.TL_error) this.f40249b);
                break;
            case 23:
                AtomicReference atomicReference = (AtomicReference) this.f40249b;
                if (atomicReference.get() != null) {
                    ((Runnable) atomicReference.getAndSet(null)).run();
                }
                break;
            case 24:
                ((org.telegram.ui.ActionBar.k) this.f40249b).invalidate();
                break;
            case 25:
                ((org.telegram.ui.Components.b70) this.f40249b).s();
                break;
            case 26:
                ((b0) this.f40249b).run(Boolean.FALSE);
                break;
            case 27:
                ((org.telegram.ui.ActionBar.n1) this.f40249b).dismiss();
                break;
            case 28:
                ((m6) this.f40249b).run(Boolean.FALSE, null);
                break;
            default:
                lh.n5 n5Var = (lh.n5) this.f40249b;
                NotificationCenter.getInstance(((org.telegram.ui.ActionBar.n2) ((rn) n5Var.f16433e)).currentAccount).onAnimationFinish(n5Var.f16431b);
                break;
        }
    }
}
