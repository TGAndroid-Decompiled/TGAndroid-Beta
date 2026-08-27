package org.telegram.ui.Cells;

import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import android.text.TextUtils;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.nb0;
import org.telegram.ui.kc1;
import org.telegram.ui.nc1;

public final class h5 extends org.telegram.ui.Components.n9 implements DownloadController.FileDownloadProgressListener {
    public RectF C;
    public RadialProgress2 D;
    public TLRPC.TL_wallPaper E;
    public int F;
    public LinearGradient G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public Paint M;
    public nb0 N;
    public int O;
    public kc1 P;
    public int Q;

    @Override
    public int getObserverTag() {
        return this.O;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        u(false);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        int i11;
        nc1 nc1Var;
        int iB0;
        int i12;
        int i13;
        nc1 nc1Var2;
        int iB1;
        int i14;
        int i15;
        nc1 nc1Var3;
        int iB2;
        int i16;
        nc1 nc1Var4;
        int i17;
        int i18;
        nb0 nb0Var;
        nb0 nb0Var2;
        RadialProgress2 radialProgress2 = this.D;
        RectF rectF = this.C;
        Paint paint = this.M;
        kc1 kc1Var = this.P;
        float f10 = kc1Var.f39696a.d.f40760h1;
        this.f30898a.setBlendMode(null);
        nc1 nc1Var5 = kc1Var.f39696a.d;
        if (nc1Var5.f40738b != 2) {
            int iB3 = org.telegram.ui.ActionBar.g6.B0(org.telegram.ui.ActionBar.g6.Nd);
            i10 = (int) nc1Var5.f40781s.f22890j;
            if (i10 == 0) {
                i11 = iB3;
            }
            nc1Var = kc1Var.f39696a.d;
            if (nc1Var.f40738b == 2) {
                iB0 = org.telegram.ui.ActionBar.g6.B0(org.telegram.ui.ActionBar.g6.Od);
                i12 = (int) nc1Var.f40781s.f22891k;
                if (i12 != 0) {
                    i13 = iB0;
                }
                nc1Var2 = kc1Var.f39696a.d;
                if (nc1Var2.f40738b == 2) {
                    iB1 = org.telegram.ui.ActionBar.g6.B0(org.telegram.ui.ActionBar.g6.Pd);
                    i14 = (int) nc1Var2.f40781s.f22892l;
                    if (i14 != 0) {
                        i15 = iB1;
                    }
                    nc1Var3 = kc1Var.f39696a.d;
                    if (nc1Var3.f40738b == 2) {
                        i16 = nc1Var3.Z0;
                    } else {
                        iB2 = org.telegram.ui.ActionBar.g6.B0(org.telegram.ui.ActionBar.g6.Qd);
                        i16 = (int) nc1Var3.f40781s.f22893m;
                        if (i16 == 0) {
                            i16 = iB2;
                        }
                    }
                    nc1Var4 = kc1Var.f39696a.d;
                    if (nc1Var4.f40738b == 2) {
                        i17 = nc1Var4.f40747d1;
                    } else {
                        i17 = nc1Var4.f40781s.f22894n;
                    }
                    i18 = nc1Var4.f40758g1;
                    if (i13 != 0) {
                        this.G = null;
                        this.N = null;
                        this.f30898a.setGradientBitmap(null);
                    } else if (this.G != null || i11 != this.H || i13 != this.I || i15 != this.J || i16 != this.K || i17 != this.L) {
                        this.H = i11;
                        this.I = i13;
                        this.J = i15;
                        this.K = i16;
                        this.L = i17;
                        if (i15 != 0) {
                            this.G = null;
                            nb0Var2 = this.N;
                            if (nb0Var2 != null) {
                                nb0Var2.o(i11, i13, i15, i16, 0, false);
                            } else {
                                int i19 = i11;
                                nb0 nb0Var3 = new nb0(true, i19, i13, i15, i16);
                                i11 = i19;
                                this.N = nb0Var3;
                                nb0Var3.w(AndroidUtilities.dp(6.0f));
                                this.N.r(this);
                            }
                            if (f10 < 0.0f) {
                                this.f30898a.setGradientBitmap(this.N.f30929k);
                            } else {
                                this.f30898a.setGradientBitmap(null);
                                if (Build.VERSION.SDK_INT >= 29) {
                                    this.f30898a.setBlendMode(BlendMode.SOFT_LIGHT);
                                } else {
                                    this.f30898a.setColorFilter(new PorterDuffColorFilter(kc1Var.f39696a.d.f40755f1, PorterDuff.Mode.SRC_IN));
                                }
                            }
                        } else {
                            Rect rectE = org.telegram.ui.Components.m9.e(org.telegram.ui.Components.m9.d(i17), getMeasuredWidth(), getMeasuredHeight());
                            this.G = new LinearGradient(rectE.left, rectE.top, rectE.right, rectE.bottom, new int[]{i11, i13}, (float[]) null, Shader.TileMode.CLAMP);
                            this.N = null;
                            this.f30898a.setGradientBitmap(null);
                        }
                    }
                    nb0Var = this.N;
                    if (nb0Var != null) {
                        nb0Var.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                        this.N.draw(canvas);
                    } else {
                        paint.setShader(this.G);
                        if (this.G == null) {
                            paint.setColor(i11);
                        }
                        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                        canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
                    }
                    super.onDraw(canvas);
                    if (radialProgress2.f26470i.f28309q != 4) {
                        radialProgress2.setColors(i18, i18, -1, -1);
                        radialProgress2.draw(canvas);
                    }
                }
                i14 = nc1Var2.Y0;
                i15 = i14;
                nc1Var3 = kc1Var.f39696a.d;
                if (nc1Var3.f40738b == 2) {
                    i16 = nc1Var3.Z0;
                } else {
                    iB2 = org.telegram.ui.ActionBar.g6.B0(org.telegram.ui.ActionBar.g6.Qd);
                    i16 = (int) nc1Var3.f40781s.f22893m;
                    if (i16 == 0) {
                        i16 = iB2;
                    }
                }
                nc1Var4 = kc1Var.f39696a.d;
                if (nc1Var4.f40738b == 2) {
                    i17 = nc1Var4.f40747d1;
                } else {
                    i17 = nc1Var4.f40781s.f22894n;
                }
                i18 = nc1Var4.f40758g1;
                if (i13 != 0) {
                    this.G = null;
                    this.N = null;
                    this.f30898a.setGradientBitmap(null);
                } else if (this.G != null) {
                    this.H = i11;
                    this.I = i13;
                    this.J = i15;
                    this.K = i16;
                    this.L = i17;
                    if (i15 != 0) {
                        this.G = null;
                        nb0Var2 = this.N;
                        if (nb0Var2 != null) {
                            nb0Var2.o(i11, i13, i15, i16, 0, false);
                        } else {
                            int i110 = i11;
                            nb0 nb0Var4 = new nb0(true, i110, i13, i15, i16);
                            i11 = i110;
                            this.N = nb0Var4;
                            nb0Var4.w(AndroidUtilities.dp(6.0f));
                            this.N.r(this);
                        }
                        if (f10 < 0.0f) {
                            this.f30898a.setGradientBitmap(this.N.f30929k);
                        } else {
                            this.f30898a.setGradientBitmap(null);
                            if (Build.VERSION.SDK_INT >= 29) {
                                this.f30898a.setBlendMode(BlendMode.SOFT_LIGHT);
                            } else {
                                this.f30898a.setColorFilter(new PorterDuffColorFilter(kc1Var.f39696a.d.f40755f1, PorterDuff.Mode.SRC_IN));
                            }
                        }
                    } else {
                        Rect rectE2 = org.telegram.ui.Components.m9.e(org.telegram.ui.Components.m9.d(i17), getMeasuredWidth(), getMeasuredHeight());
                        this.G = new LinearGradient(rectE2.left, rectE2.top, rectE2.right, rectE2.bottom, new int[]{i11, i13}, (float[]) null, Shader.TileMode.CLAMP);
                        this.N = null;
                        this.f30898a.setGradientBitmap(null);
                    }
                } else {
                    this.H = i11;
                    this.I = i13;
                    this.J = i15;
                    this.K = i16;
                    this.L = i17;
                    if (i15 != 0) {
                        this.G = null;
                        nb0Var2 = this.N;
                        if (nb0Var2 != null) {
                            nb0Var2.o(i11, i13, i15, i16, 0, false);
                        } else {
                            int i111 = i11;
                            nb0 nb0Var5 = new nb0(true, i111, i13, i15, i16);
                            i11 = i111;
                            this.N = nb0Var5;
                            nb0Var5.w(AndroidUtilities.dp(6.0f));
                            this.N.r(this);
                        }
                        if (f10 < 0.0f) {
                            this.f30898a.setGradientBitmap(this.N.f30929k);
                        } else {
                            this.f30898a.setGradientBitmap(null);
                            if (Build.VERSION.SDK_INT >= 29) {
                                this.f30898a.setBlendMode(BlendMode.SOFT_LIGHT);
                            } else {
                                this.f30898a.setColorFilter(new PorterDuffColorFilter(kc1Var.f39696a.d.f40755f1, PorterDuff.Mode.SRC_IN));
                            }
                        }
                    } else {
                        Rect rectE3 = org.telegram.ui.Components.m9.e(org.telegram.ui.Components.m9.d(i17), getMeasuredWidth(), getMeasuredHeight());
                        this.G = new LinearGradient(rectE3.left, rectE3.top, rectE3.right, rectE3.bottom, new int[]{i11, i13}, (float[]) null, Shader.TileMode.CLAMP);
                        this.N = null;
                        this.f30898a.setGradientBitmap(null);
                    }
                }
                nb0Var = this.N;
                if (nb0Var != null) {
                    nb0Var.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                    this.N.draw(canvas);
                } else {
                    paint.setShader(this.G);
                    if (this.G == null) {
                        paint.setColor(i11);
                    }
                    rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
                }
                super.onDraw(canvas);
                if (radialProgress2.f26470i.f28309q != 4) {
                    radialProgress2.setColors(i18, i18, -1, -1);
                    radialProgress2.draw(canvas);
                }
            }
            i12 = nc1Var.X0;
            i13 = i12;
            nc1Var2 = kc1Var.f39696a.d;
            if (nc1Var2.f40738b == 2) {
                iB1 = org.telegram.ui.ActionBar.g6.B0(org.telegram.ui.ActionBar.g6.Pd);
                i14 = (int) nc1Var2.f40781s.f22892l;
                if (i14 != 0) {
                    i15 = iB1;
                }
                nc1Var3 = kc1Var.f39696a.d;
                if (nc1Var3.f40738b == 2) {
                    i16 = nc1Var3.Z0;
                } else {
                    iB2 = org.telegram.ui.ActionBar.g6.B0(org.telegram.ui.ActionBar.g6.Qd);
                    i16 = (int) nc1Var3.f40781s.f22893m;
                    if (i16 == 0) {
                        i16 = iB2;
                    }
                }
                nc1Var4 = kc1Var.f39696a.d;
                if (nc1Var4.f40738b == 2) {
                    i17 = nc1Var4.f40747d1;
                } else {
                    i17 = nc1Var4.f40781s.f22894n;
                }
                i18 = nc1Var4.f40758g1;
                if (i13 != 0) {
                    this.G = null;
                    this.N = null;
                    this.f30898a.setGradientBitmap(null);
                } else if (this.G != null) {
                    this.H = i11;
                    this.I = i13;
                    this.J = i15;
                    this.K = i16;
                    this.L = i17;
                    if (i15 != 0) {
                        this.G = null;
                        nb0Var2 = this.N;
                        if (nb0Var2 != null) {
                            nb0Var2.o(i11, i13, i15, i16, 0, false);
                        } else {
                            int i112 = i11;
                            nb0 nb0Var6 = new nb0(true, i112, i13, i15, i16);
                            i11 = i112;
                            this.N = nb0Var6;
                            nb0Var6.w(AndroidUtilities.dp(6.0f));
                            this.N.r(this);
                        }
                        if (f10 < 0.0f) {
                            this.f30898a.setGradientBitmap(this.N.f30929k);
                        } else {
                            this.f30898a.setGradientBitmap(null);
                            if (Build.VERSION.SDK_INT >= 29) {
                                this.f30898a.setBlendMode(BlendMode.SOFT_LIGHT);
                            } else {
                                this.f30898a.setColorFilter(new PorterDuffColorFilter(kc1Var.f39696a.d.f40755f1, PorterDuff.Mode.SRC_IN));
                            }
                        }
                    } else {
                        Rect rectE4 = org.telegram.ui.Components.m9.e(org.telegram.ui.Components.m9.d(i17), getMeasuredWidth(), getMeasuredHeight());
                        this.G = new LinearGradient(rectE4.left, rectE4.top, rectE4.right, rectE4.bottom, new int[]{i11, i13}, (float[]) null, Shader.TileMode.CLAMP);
                        this.N = null;
                        this.f30898a.setGradientBitmap(null);
                    }
                } else {
                    this.H = i11;
                    this.I = i13;
                    this.J = i15;
                    this.K = i16;
                    this.L = i17;
                    if (i15 != 0) {
                        this.G = null;
                        nb0Var2 = this.N;
                        if (nb0Var2 != null) {
                            nb0Var2.o(i11, i13, i15, i16, 0, false);
                        } else {
                            int i113 = i11;
                            nb0 nb0Var7 = new nb0(true, i113, i13, i15, i16);
                            i11 = i113;
                            this.N = nb0Var7;
                            nb0Var7.w(AndroidUtilities.dp(6.0f));
                            this.N.r(this);
                        }
                        if (f10 < 0.0f) {
                            this.f30898a.setGradientBitmap(this.N.f30929k);
                        } else {
                            this.f30898a.setGradientBitmap(null);
                            if (Build.VERSION.SDK_INT >= 29) {
                                this.f30898a.setBlendMode(BlendMode.SOFT_LIGHT);
                            } else {
                                this.f30898a.setColorFilter(new PorterDuffColorFilter(kc1Var.f39696a.d.f40755f1, PorterDuff.Mode.SRC_IN));
                            }
                        }
                    } else {
                        Rect rectE5 = org.telegram.ui.Components.m9.e(org.telegram.ui.Components.m9.d(i17), getMeasuredWidth(), getMeasuredHeight());
                        this.G = new LinearGradient(rectE5.left, rectE5.top, rectE5.right, rectE5.bottom, new int[]{i11, i13}, (float[]) null, Shader.TileMode.CLAMP);
                        this.N = null;
                        this.f30898a.setGradientBitmap(null);
                    }
                }
                nb0Var = this.N;
                if (nb0Var != null) {
                    nb0Var.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                    this.N.draw(canvas);
                } else {
                    paint.setShader(this.G);
                    if (this.G == null) {
                        paint.setColor(i11);
                    }
                    rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
                }
                super.onDraw(canvas);
                if (radialProgress2.f26470i.f28309q != 4) {
                    radialProgress2.setColors(i18, i18, -1, -1);
                    radialProgress2.draw(canvas);
                }
            }
            i14 = nc1Var2.Y0;
            i15 = i14;
            nc1Var3 = kc1Var.f39696a.d;
            if (nc1Var3.f40738b == 2) {
                i16 = nc1Var3.Z0;
            } else {
                iB2 = org.telegram.ui.ActionBar.g6.B0(org.telegram.ui.ActionBar.g6.Qd);
                i16 = (int) nc1Var3.f40781s.f22893m;
                if (i16 == 0) {
                    i16 = iB2;
                }
            }
            nc1Var4 = kc1Var.f39696a.d;
            if (nc1Var4.f40738b == 2) {
                i17 = nc1Var4.f40747d1;
            } else {
                i17 = nc1Var4.f40781s.f22894n;
            }
            i18 = nc1Var4.f40758g1;
            if (i13 != 0) {
                this.G = null;
                this.N = null;
                this.f30898a.setGradientBitmap(null);
            } else if (this.G != null) {
                this.H = i11;
                this.I = i13;
                this.J = i15;
                this.K = i16;
                this.L = i17;
                if (i15 != 0) {
                    this.G = null;
                    nb0Var2 = this.N;
                    if (nb0Var2 != null) {
                        nb0Var2.o(i11, i13, i15, i16, 0, false);
                    } else {
                        int i114 = i11;
                        nb0 nb0Var8 = new nb0(true, i114, i13, i15, i16);
                        i11 = i114;
                        this.N = nb0Var8;
                        nb0Var8.w(AndroidUtilities.dp(6.0f));
                        this.N.r(this);
                    }
                    if (f10 < 0.0f) {
                        this.f30898a.setGradientBitmap(this.N.f30929k);
                    } else {
                        this.f30898a.setGradientBitmap(null);
                        if (Build.VERSION.SDK_INT >= 29) {
                            this.f30898a.setBlendMode(BlendMode.SOFT_LIGHT);
                        } else {
                            this.f30898a.setColorFilter(new PorterDuffColorFilter(kc1Var.f39696a.d.f40755f1, PorterDuff.Mode.SRC_IN));
                        }
                    }
                } else {
                    Rect rectE6 = org.telegram.ui.Components.m9.e(org.telegram.ui.Components.m9.d(i17), getMeasuredWidth(), getMeasuredHeight());
                    this.G = new LinearGradient(rectE6.left, rectE6.top, rectE6.right, rectE6.bottom, new int[]{i11, i13}, (float[]) null, Shader.TileMode.CLAMP);
                    this.N = null;
                    this.f30898a.setGradientBitmap(null);
                }
            } else {
                this.H = i11;
                this.I = i13;
                this.J = i15;
                this.K = i16;
                this.L = i17;
                if (i15 != 0) {
                    this.G = null;
                    nb0Var2 = this.N;
                    if (nb0Var2 != null) {
                        nb0Var2.o(i11, i13, i15, i16, 0, false);
                    } else {
                        int i115 = i11;
                        nb0 nb0Var9 = new nb0(true, i115, i13, i15, i16);
                        i11 = i115;
                        this.N = nb0Var9;
                        nb0Var9.w(AndroidUtilities.dp(6.0f));
                        this.N.r(this);
                    }
                    if (f10 < 0.0f) {
                        this.f30898a.setGradientBitmap(this.N.f30929k);
                    } else {
                        this.f30898a.setGradientBitmap(null);
                        if (Build.VERSION.SDK_INT >= 29) {
                            this.f30898a.setBlendMode(BlendMode.SOFT_LIGHT);
                        } else {
                            this.f30898a.setColorFilter(new PorterDuffColorFilter(kc1Var.f39696a.d.f40755f1, PorterDuff.Mode.SRC_IN));
                        }
                    }
                } else {
                    Rect rectE7 = org.telegram.ui.Components.m9.e(org.telegram.ui.Components.m9.d(i17), getMeasuredWidth(), getMeasuredHeight());
                    this.G = new LinearGradient(rectE7.left, rectE7.top, rectE7.right, rectE7.bottom, new int[]{i11, i13}, (float[]) null, Shader.TileMode.CLAMP);
                    this.N = null;
                    this.f30898a.setGradientBitmap(null);
                }
            }
            nb0Var = this.N;
            if (nb0Var != null) {
                nb0Var.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                this.N.draw(canvas);
            } else {
                paint.setShader(this.G);
                if (this.G == null) {
                    paint.setColor(i11);
                }
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
            }
            super.onDraw(canvas);
            if (radialProgress2.f26470i.f28309q != 4) {
                radialProgress2.setColors(i18, i18, -1, -1);
                radialProgress2.draw(canvas);
            }
        }
        i10 = nc1Var5.V0;
        i11 = i10;
        nc1Var = kc1Var.f39696a.d;
        if (nc1Var.f40738b == 2) {
            iB0 = org.telegram.ui.ActionBar.g6.B0(org.telegram.ui.ActionBar.g6.Od);
            i12 = (int) nc1Var.f40781s.f22891k;
            if (i12 != 0) {
                i13 = iB0;
            }
            nc1Var2 = kc1Var.f39696a.d;
            if (nc1Var2.f40738b == 2) {
                iB1 = org.telegram.ui.ActionBar.g6.B0(org.telegram.ui.ActionBar.g6.Pd);
                i14 = (int) nc1Var2.f40781s.f22892l;
                if (i14 != 0) {
                    i15 = iB1;
                }
                nc1Var3 = kc1Var.f39696a.d;
                if (nc1Var3.f40738b == 2) {
                    i16 = nc1Var3.Z0;
                } else {
                    iB2 = org.telegram.ui.ActionBar.g6.B0(org.telegram.ui.ActionBar.g6.Qd);
                    i16 = (int) nc1Var3.f40781s.f22893m;
                    if (i16 == 0) {
                        i16 = iB2;
                    }
                }
                nc1Var4 = kc1Var.f39696a.d;
                if (nc1Var4.f40738b == 2) {
                    i17 = nc1Var4.f40747d1;
                } else {
                    i17 = nc1Var4.f40781s.f22894n;
                }
                i18 = nc1Var4.f40758g1;
                if (i13 != 0) {
                    this.G = null;
                    this.N = null;
                    this.f30898a.setGradientBitmap(null);
                } else if (this.G != null) {
                    this.H = i11;
                    this.I = i13;
                    this.J = i15;
                    this.K = i16;
                    this.L = i17;
                    if (i15 != 0) {
                        this.G = null;
                        nb0Var2 = this.N;
                        if (nb0Var2 != null) {
                            nb0Var2.o(i11, i13, i15, i16, 0, false);
                        } else {
                            int i116 = i11;
                            nb0 nb0Var10 = new nb0(true, i116, i13, i15, i16);
                            i11 = i116;
                            this.N = nb0Var10;
                            nb0Var10.w(AndroidUtilities.dp(6.0f));
                            this.N.r(this);
                        }
                        if (f10 < 0.0f) {
                            this.f30898a.setGradientBitmap(this.N.f30929k);
                        } else {
                            this.f30898a.setGradientBitmap(null);
                            if (Build.VERSION.SDK_INT >= 29) {
                                this.f30898a.setBlendMode(BlendMode.SOFT_LIGHT);
                            } else {
                                this.f30898a.setColorFilter(new PorterDuffColorFilter(kc1Var.f39696a.d.f40755f1, PorterDuff.Mode.SRC_IN));
                            }
                        }
                    } else {
                        Rect rectE8 = org.telegram.ui.Components.m9.e(org.telegram.ui.Components.m9.d(i17), getMeasuredWidth(), getMeasuredHeight());
                        this.G = new LinearGradient(rectE8.left, rectE8.top, rectE8.right, rectE8.bottom, new int[]{i11, i13}, (float[]) null, Shader.TileMode.CLAMP);
                        this.N = null;
                        this.f30898a.setGradientBitmap(null);
                    }
                } else {
                    this.H = i11;
                    this.I = i13;
                    this.J = i15;
                    this.K = i16;
                    this.L = i17;
                    if (i15 != 0) {
                        this.G = null;
                        nb0Var2 = this.N;
                        if (nb0Var2 != null) {
                            nb0Var2.o(i11, i13, i15, i16, 0, false);
                        } else {
                            int i117 = i11;
                            nb0 nb0Var11 = new nb0(true, i117, i13, i15, i16);
                            i11 = i117;
                            this.N = nb0Var11;
                            nb0Var11.w(AndroidUtilities.dp(6.0f));
                            this.N.r(this);
                        }
                        if (f10 < 0.0f) {
                            this.f30898a.setGradientBitmap(this.N.f30929k);
                        } else {
                            this.f30898a.setGradientBitmap(null);
                            if (Build.VERSION.SDK_INT >= 29) {
                                this.f30898a.setBlendMode(BlendMode.SOFT_LIGHT);
                            } else {
                                this.f30898a.setColorFilter(new PorterDuffColorFilter(kc1Var.f39696a.d.f40755f1, PorterDuff.Mode.SRC_IN));
                            }
                        }
                    } else {
                        Rect rectE9 = org.telegram.ui.Components.m9.e(org.telegram.ui.Components.m9.d(i17), getMeasuredWidth(), getMeasuredHeight());
                        this.G = new LinearGradient(rectE9.left, rectE9.top, rectE9.right, rectE9.bottom, new int[]{i11, i13}, (float[]) null, Shader.TileMode.CLAMP);
                        this.N = null;
                        this.f30898a.setGradientBitmap(null);
                    }
                }
                nb0Var = this.N;
                if (nb0Var != null) {
                    nb0Var.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                    this.N.draw(canvas);
                } else {
                    paint.setShader(this.G);
                    if (this.G == null) {
                        paint.setColor(i11);
                    }
                    rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
                }
                super.onDraw(canvas);
                if (radialProgress2.f26470i.f28309q != 4) {
                    radialProgress2.setColors(i18, i18, -1, -1);
                    radialProgress2.draw(canvas);
                }
            }
            i14 = nc1Var2.Y0;
            i15 = i14;
            nc1Var3 = kc1Var.f39696a.d;
            if (nc1Var3.f40738b == 2) {
                i16 = nc1Var3.Z0;
            } else {
                iB2 = org.telegram.ui.ActionBar.g6.B0(org.telegram.ui.ActionBar.g6.Qd);
                i16 = (int) nc1Var3.f40781s.f22893m;
                if (i16 == 0) {
                    i16 = iB2;
                }
            }
            nc1Var4 = kc1Var.f39696a.d;
            if (nc1Var4.f40738b == 2) {
                i17 = nc1Var4.f40747d1;
            } else {
                i17 = nc1Var4.f40781s.f22894n;
            }
            i18 = nc1Var4.f40758g1;
            if (i13 != 0) {
                this.G = null;
                this.N = null;
                this.f30898a.setGradientBitmap(null);
            } else if (this.G != null) {
                this.H = i11;
                this.I = i13;
                this.J = i15;
                this.K = i16;
                this.L = i17;
                if (i15 != 0) {
                    this.G = null;
                    nb0Var2 = this.N;
                    if (nb0Var2 != null) {
                        nb0Var2.o(i11, i13, i15, i16, 0, false);
                    } else {
                        int i118 = i11;
                        nb0 nb0Var12 = new nb0(true, i118, i13, i15, i16);
                        i11 = i118;
                        this.N = nb0Var12;
                        nb0Var12.w(AndroidUtilities.dp(6.0f));
                        this.N.r(this);
                    }
                    if (f10 < 0.0f) {
                        this.f30898a.setGradientBitmap(this.N.f30929k);
                    } else {
                        this.f30898a.setGradientBitmap(null);
                        if (Build.VERSION.SDK_INT >= 29) {
                            this.f30898a.setBlendMode(BlendMode.SOFT_LIGHT);
                        } else {
                            this.f30898a.setColorFilter(new PorterDuffColorFilter(kc1Var.f39696a.d.f40755f1, PorterDuff.Mode.SRC_IN));
                        }
                    }
                } else {
                    Rect rectE10 = org.telegram.ui.Components.m9.e(org.telegram.ui.Components.m9.d(i17), getMeasuredWidth(), getMeasuredHeight());
                    this.G = new LinearGradient(rectE10.left, rectE10.top, rectE10.right, rectE10.bottom, new int[]{i11, i13}, (float[]) null, Shader.TileMode.CLAMP);
                    this.N = null;
                    this.f30898a.setGradientBitmap(null);
                }
            } else {
                this.H = i11;
                this.I = i13;
                this.J = i15;
                this.K = i16;
                this.L = i17;
                if (i15 != 0) {
                    this.G = null;
                    nb0Var2 = this.N;
                    if (nb0Var2 != null) {
                        nb0Var2.o(i11, i13, i15, i16, 0, false);
                    } else {
                        int i119 = i11;
                        nb0 nb0Var13 = new nb0(true, i119, i13, i15, i16);
                        i11 = i119;
                        this.N = nb0Var13;
                        nb0Var13.w(AndroidUtilities.dp(6.0f));
                        this.N.r(this);
                    }
                    if (f10 < 0.0f) {
                        this.f30898a.setGradientBitmap(this.N.f30929k);
                    } else {
                        this.f30898a.setGradientBitmap(null);
                        if (Build.VERSION.SDK_INT >= 29) {
                            this.f30898a.setBlendMode(BlendMode.SOFT_LIGHT);
                        } else {
                            this.f30898a.setColorFilter(new PorterDuffColorFilter(kc1Var.f39696a.d.f40755f1, PorterDuff.Mode.SRC_IN));
                        }
                    }
                } else {
                    Rect rectE11 = org.telegram.ui.Components.m9.e(org.telegram.ui.Components.m9.d(i17), getMeasuredWidth(), getMeasuredHeight());
                    this.G = new LinearGradient(rectE11.left, rectE11.top, rectE11.right, rectE11.bottom, new int[]{i11, i13}, (float[]) null, Shader.TileMode.CLAMP);
                    this.N = null;
                    this.f30898a.setGradientBitmap(null);
                }
            }
            nb0Var = this.N;
            if (nb0Var != null) {
                nb0Var.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                this.N.draw(canvas);
            } else {
                paint.setShader(this.G);
                if (this.G == null) {
                    paint.setColor(i11);
                }
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
            }
            super.onDraw(canvas);
            if (radialProgress2.f26470i.f28309q != 4) {
                radialProgress2.setColors(i18, i18, -1, -1);
                radialProgress2.draw(canvas);
            }
        }
        i12 = nc1Var.X0;
        i13 = i12;
        nc1Var2 = kc1Var.f39696a.d;
        if (nc1Var2.f40738b == 2) {
            iB1 = org.telegram.ui.ActionBar.g6.B0(org.telegram.ui.ActionBar.g6.Pd);
            i14 = (int) nc1Var2.f40781s.f22892l;
            if (i14 != 0) {
                i15 = iB1;
            }
            nc1Var3 = kc1Var.f39696a.d;
            if (nc1Var3.f40738b == 2) {
                i16 = nc1Var3.Z0;
            } else {
                iB2 = org.telegram.ui.ActionBar.g6.B0(org.telegram.ui.ActionBar.g6.Qd);
                i16 = (int) nc1Var3.f40781s.f22893m;
                if (i16 == 0) {
                    i16 = iB2;
                }
            }
            nc1Var4 = kc1Var.f39696a.d;
            if (nc1Var4.f40738b == 2) {
                i17 = nc1Var4.f40747d1;
            } else {
                i17 = nc1Var4.f40781s.f22894n;
            }
            i18 = nc1Var4.f40758g1;
            if (i13 != 0) {
                this.G = null;
                this.N = null;
                this.f30898a.setGradientBitmap(null);
            } else if (this.G != null) {
                this.H = i11;
                this.I = i13;
                this.J = i15;
                this.K = i16;
                this.L = i17;
                if (i15 != 0) {
                    this.G = null;
                    nb0Var2 = this.N;
                    if (nb0Var2 != null) {
                        nb0Var2.o(i11, i13, i15, i16, 0, false);
                    } else {
                        int i1110 = i11;
                        nb0 nb0Var14 = new nb0(true, i1110, i13, i15, i16);
                        i11 = i1110;
                        this.N = nb0Var14;
                        nb0Var14.w(AndroidUtilities.dp(6.0f));
                        this.N.r(this);
                    }
                    if (f10 < 0.0f) {
                        this.f30898a.setGradientBitmap(this.N.f30929k);
                    } else {
                        this.f30898a.setGradientBitmap(null);
                        if (Build.VERSION.SDK_INT >= 29) {
                            this.f30898a.setBlendMode(BlendMode.SOFT_LIGHT);
                        } else {
                            this.f30898a.setColorFilter(new PorterDuffColorFilter(kc1Var.f39696a.d.f40755f1, PorterDuff.Mode.SRC_IN));
                        }
                    }
                } else {
                    Rect rectE12 = org.telegram.ui.Components.m9.e(org.telegram.ui.Components.m9.d(i17), getMeasuredWidth(), getMeasuredHeight());
                    this.G = new LinearGradient(rectE12.left, rectE12.top, rectE12.right, rectE12.bottom, new int[]{i11, i13}, (float[]) null, Shader.TileMode.CLAMP);
                    this.N = null;
                    this.f30898a.setGradientBitmap(null);
                }
            } else {
                this.H = i11;
                this.I = i13;
                this.J = i15;
                this.K = i16;
                this.L = i17;
                if (i15 != 0) {
                    this.G = null;
                    nb0Var2 = this.N;
                    if (nb0Var2 != null) {
                        nb0Var2.o(i11, i13, i15, i16, 0, false);
                    } else {
                        int i1111 = i11;
                        nb0 nb0Var15 = new nb0(true, i1111, i13, i15, i16);
                        i11 = i1111;
                        this.N = nb0Var15;
                        nb0Var15.w(AndroidUtilities.dp(6.0f));
                        this.N.r(this);
                    }
                    if (f10 < 0.0f) {
                        this.f30898a.setGradientBitmap(this.N.f30929k);
                    } else {
                        this.f30898a.setGradientBitmap(null);
                        if (Build.VERSION.SDK_INT >= 29) {
                            this.f30898a.setBlendMode(BlendMode.SOFT_LIGHT);
                        } else {
                            this.f30898a.setColorFilter(new PorterDuffColorFilter(kc1Var.f39696a.d.f40755f1, PorterDuff.Mode.SRC_IN));
                        }
                    }
                } else {
                    Rect rectE13 = org.telegram.ui.Components.m9.e(org.telegram.ui.Components.m9.d(i17), getMeasuredWidth(), getMeasuredHeight());
                    this.G = new LinearGradient(rectE13.left, rectE13.top, rectE13.right, rectE13.bottom, new int[]{i11, i13}, (float[]) null, Shader.TileMode.CLAMP);
                    this.N = null;
                    this.f30898a.setGradientBitmap(null);
                }
            }
            nb0Var = this.N;
            if (nb0Var != null) {
                nb0Var.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                this.N.draw(canvas);
            } else {
                paint.setShader(this.G);
                if (this.G == null) {
                    paint.setColor(i11);
                }
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
            }
            super.onDraw(canvas);
            if (radialProgress2.f26470i.f28309q != 4) {
                radialProgress2.setColors(i18, i18, -1, -1);
                radialProgress2.draw(canvas);
            }
        }
        i14 = nc1Var2.Y0;
        i15 = i14;
        nc1Var3 = kc1Var.f39696a.d;
        if (nc1Var3.f40738b == 2) {
            i16 = nc1Var3.Z0;
        } else {
            iB2 = org.telegram.ui.ActionBar.g6.B0(org.telegram.ui.ActionBar.g6.Qd);
            i16 = (int) nc1Var3.f40781s.f22893m;
            if (i16 == 0) {
                i16 = iB2;
            }
        }
        nc1Var4 = kc1Var.f39696a.d;
        if (nc1Var4.f40738b == 2) {
            i17 = nc1Var4.f40747d1;
        } else {
            i17 = nc1Var4.f40781s.f22894n;
        }
        i18 = nc1Var4.f40758g1;
        if (i13 != 0) {
            this.G = null;
            this.N = null;
            this.f30898a.setGradientBitmap(null);
        } else if (this.G != null) {
            this.H = i11;
            this.I = i13;
            this.J = i15;
            this.K = i16;
            this.L = i17;
            if (i15 != 0) {
                this.G = null;
                nb0Var2 = this.N;
                if (nb0Var2 != null) {
                    nb0Var2.o(i11, i13, i15, i16, 0, false);
                } else {
                    int i1112 = i11;
                    nb0 nb0Var16 = new nb0(true, i1112, i13, i15, i16);
                    i11 = i1112;
                    this.N = nb0Var16;
                    nb0Var16.w(AndroidUtilities.dp(6.0f));
                    this.N.r(this);
                }
                if (f10 < 0.0f) {
                    this.f30898a.setGradientBitmap(this.N.f30929k);
                } else {
                    this.f30898a.setGradientBitmap(null);
                    if (Build.VERSION.SDK_INT >= 29) {
                        this.f30898a.setBlendMode(BlendMode.SOFT_LIGHT);
                    } else {
                        this.f30898a.setColorFilter(new PorterDuffColorFilter(kc1Var.f39696a.d.f40755f1, PorterDuff.Mode.SRC_IN));
                    }
                }
            } else {
                Rect rectE14 = org.telegram.ui.Components.m9.e(org.telegram.ui.Components.m9.d(i17), getMeasuredWidth(), getMeasuredHeight());
                this.G = new LinearGradient(rectE14.left, rectE14.top, rectE14.right, rectE14.bottom, new int[]{i11, i13}, (float[]) null, Shader.TileMode.CLAMP);
                this.N = null;
                this.f30898a.setGradientBitmap(null);
            }
        } else {
            this.H = i11;
            this.I = i13;
            this.J = i15;
            this.K = i16;
            this.L = i17;
            if (i15 != 0) {
                this.G = null;
                nb0Var2 = this.N;
                if (nb0Var2 != null) {
                    nb0Var2.o(i11, i13, i15, i16, 0, false);
                } else {
                    int i1113 = i11;
                    nb0 nb0Var17 = new nb0(true, i1113, i13, i15, i16);
                    i11 = i1113;
                    this.N = nb0Var17;
                    nb0Var17.w(AndroidUtilities.dp(6.0f));
                    this.N.r(this);
                }
                if (f10 < 0.0f) {
                    this.f30898a.setGradientBitmap(this.N.f30929k);
                } else {
                    this.f30898a.setGradientBitmap(null);
                    if (Build.VERSION.SDK_INT >= 29) {
                        this.f30898a.setBlendMode(BlendMode.SOFT_LIGHT);
                    } else {
                        this.f30898a.setColorFilter(new PorterDuffColorFilter(kc1Var.f39696a.d.f40755f1, PorterDuff.Mode.SRC_IN));
                    }
                }
            } else {
                Rect rectE15 = org.telegram.ui.Components.m9.e(org.telegram.ui.Components.m9.d(i17), getMeasuredWidth(), getMeasuredHeight());
                this.G = new LinearGradient(rectE15.left, rectE15.top, rectE15.right, rectE15.bottom, new int[]{i11, i13}, (float[]) null, Shader.TileMode.CLAMP);
                this.N = null;
                this.f30898a.setGradientBitmap(null);
            }
        }
        nb0Var = this.N;
        if (nb0Var != null) {
            nb0Var.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            this.N.draw(canvas);
        } else {
            paint.setShader(this.G);
            if (this.G == null) {
                paint.setColor(i11);
            }
            rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
        }
        super.onDraw(canvas);
        if (radialProgress2.f26470i.f28309q != 4) {
            radialProgress2.setColors(i18, i18, -1, -1);
            radialProgress2.draw(canvas);
        }
    }

    @Override
    public final void onFailedDownload(String str, boolean z10) {
        TLRPC.TL_wallPaper tL_wallPaper = this.P.f39696a.d.S0;
        TLRPC.TL_wallPaper tL_wallPaper2 = this.E;
        if (!(tL_wallPaper2 == null && tL_wallPaper == null) && (tL_wallPaper == null || tL_wallPaper2 == null || tL_wallPaper2.f22532id != tL_wallPaper.f22532id)) {
            return;
        }
        if (z10) {
            this.D.setIcon(4, false, true);
        } else {
            t(tL_wallPaper2, true, z10);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(AndroidUtilities.dp(100.0f), AndroidUtilities.dp(100.0f));
    }

    @Override
    public final void onProgressDownload(String str, long j10, long j11) {
        RadialProgress2 radialProgress2 = this.D;
        radialProgress2.o(Math.min(1.0f, j10 / j11), true);
        TLRPC.TL_wallPaper tL_wallPaper = this.P.f39696a.d.S0;
        TLRPC.TL_wallPaper tL_wallPaper2 = this.E;
        if ((!(tL_wallPaper2 == null && tL_wallPaper == null) && (tL_wallPaper == null || tL_wallPaper2 == null || tL_wallPaper2.f22532id != tL_wallPaper.f22532id)) || radialProgress2.f26470i.f28309q == 10) {
            return;
        }
        t(tL_wallPaper2, false, true);
    }

    @Override
    public final void onSuccessDownload(String str) {
        this.D.o(1.0f, true);
        TLRPC.TL_wallPaper tL_wallPaper = this.P.f39696a.d.S0;
        TLRPC.TL_wallPaper tL_wallPaper2 = this.E;
        if (!(tL_wallPaper2 == null && tL_wallPaper == null) && (tL_wallPaper == null || tL_wallPaper2 == null || tL_wallPaper2.f22532id != tL_wallPaper.f22532id)) {
            return;
        }
        t(tL_wallPaper2, false, true);
    }

    public void setPattern(TLRPC.TL_wallPaper tL_wallPaper) {
        this.E = tL_wallPaper;
        if (tL_wallPaper != null) {
            k(ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(tL_wallPaper.document.thumbs, AndroidUtilities.dp(100.0f)), tL_wallPaper.document), "100_100", null, null, 0L, "png", tL_wallPaper, 1);
        } else {
            setImageDrawable(null);
        }
        u(false);
    }

    public final void t(Object obj, boolean z10, boolean z11) {
        File httpFilePath;
        String name;
        int i10 = this.F;
        RadialProgress2 radialProgress2 = this.D;
        boolean z12 = obj instanceof TLRPC.TL_wallPaper;
        if (!z12 && !(obj instanceof MediaController.SearchImage)) {
            radialProgress2.setIcon(6, z10, z11);
            return;
        }
        if (z12) {
            TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj;
            name = FileLoader.getAttachFileName(tL_wallPaper.document);
            if (TextUtils.isEmpty(name)) {
                return;
            } else {
                httpFilePath = FileLoader.getInstance(i10).getPathToAttach(tL_wallPaper.document, true);
            }
        } else {
            MediaController.SearchImage searchImage = (MediaController.SearchImage) obj;
            TLRPC.Photo photo = searchImage.photo;
            if (photo != null) {
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, this.Q, true);
                File pathToAttach = FileLoader.getInstance(i10).getPathToAttach(closestPhotoSizeWithSize, true);
                name = FileLoader.getAttachFileName(closestPhotoSizeWithSize);
                httpFilePath = pathToAttach;
            } else {
                httpFilePath = ImageLoader.getHttpFilePath(searchImage.imageUrl, "jpg");
                name = httpFilePath.getName();
            }
            if (TextUtils.isEmpty(name)) {
                return;
            }
        }
        if (httpFilePath.exists()) {
            DownloadController.getInstance(i10).removeLoadingFileObserver(this);
            radialProgress2.o(1.0f, z11);
            radialProgress2.setIcon(6, z10, z11);
            return;
        }
        DownloadController.getInstance(i10).addLoadingFileObserver(name, null, this);
        FileLoader.getInstance(i10).isLoadingFile(name);
        Float fileProgress = ImageLoader.getInstance().getFileProgress(name);
        if (fileProgress != null) {
            radialProgress2.o(fileProgress.floatValue(), z11);
        } else {
            radialProgress2.o(0.0f, z11);
        }
        radialProgress2.setIcon(10, z10, z11);
    }

    public final void u(boolean z10) {
        TLRPC.TL_wallPaper tL_wallPaper = this.P.f39696a.d.S0;
        TLRPC.TL_wallPaper tL_wallPaper2 = this.E;
        if (!(tL_wallPaper2 == null && tL_wallPaper == null) && (tL_wallPaper == null || tL_wallPaper2 == null || tL_wallPaper2.f22532id != tL_wallPaper.f22532id)) {
            this.D.setIcon(4, false, z10);
        } else {
            t(tL_wallPaper, false, z10);
        }
        super.invalidate();
    }

    @Override
    public final void onProgressUpload(String str, long j10, long j11, boolean z10) {
    }
}
