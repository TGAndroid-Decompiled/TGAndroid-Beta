package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class a5 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public boolean E;
    public boolean F;
    public boolean G;
    public int H;
    public int I;
    public final int J;
    public int K;
    public z4 L;
    public final int M;
    public final ci.x7 N;
    public boolean O;
    public final y4 f22083a;
    public final org.telegram.ui.ActionBar.n5 f22084b;
    public final org.telegram.ui.ActionBar.n5 f22085c;
    public final org.telegram.ui.ActionBar.g6 d;
    public final org.telegram.ui.Components.f9 e;
    public final ImageView f22086f;
    public ImageView h;
    public Object f22087n;
    public TL_stories.StoryItem f22088r;
    public CharSequence f22089s;
    public CharSequence v;
    public String f22090w;
    public int f22091x;
    public TLRPC.FileLocation f22092y;

    public a5(int i10, int i11, Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z10) {
        super(context);
        int i12;
        float f7;
        int i13;
        int i14;
        float f10;
        int i15;
        int i16;
        float f11;
        this.K = -1;
        this.M = UserConfig.selectedAccount;
        this.N = new ci.x7(null, false);
        this.d = g6Var;
        this.H = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21572y6, g6Var);
        this.I = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21367n6, g6Var);
        this.J = i11;
        this.e = new org.telegram.ui.Components.f9((org.telegram.ui.ActionBar.g6) null);
        y4 y4Var = new y4(this, context, g6Var);
        this.f22083a = y4Var;
        y4Var.setRoundRadius(AndroidUtilities.dp(23.0f));
        boolean z11 = LocaleController.isRTL;
        if (z11) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        int i17 = i12 | 48;
        if (z11) {
            f7 = 0.0f;
        } else {
            f7 = i10 + 7;
        }
        addView(y4Var, w7.z5.d(46, 46.0f, i17, f7, 8.0f, z11 ? i10 + 7 : 0.0f, 0.0f));
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(context);
        this.f22084b = n5Var;
        org.telegram.ui.ActionBar.r6.Z(n5Var, org.telegram.ui.ActionBar.k6.G6, g6Var);
        n5Var.setTextSize(17);
        n5Var.setTypeface(AndroidUtilities.bold());
        if (LocaleController.isRTL) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        n5Var.setGravity(i13 | 48);
        boolean z12 = LocaleController.isRTL;
        if (z12) {
            i14 = 5;
        } else {
            i14 = 3;
        }
        int i18 = i14 | 48;
        if (z12) {
            f10 = 46.0f;
        } else {
            f10 = i11 + 68;
        }
        addView(n5Var, w7.z5.d(-1, 20.0f, i18, f10, 11.5f, z12 ? i11 + 68 : 46.0f, 0.0f));
        NotificationCenter.listenEmojiLoading(n5Var);
        org.telegram.ui.ActionBar.n5 n5Var2 = new org.telegram.ui.ActionBar.n5(context);
        this.f22085c = n5Var2;
        n5Var2.setTextSize(14);
        if (LocaleController.isRTL) {
            i15 = 5;
        } else {
            i15 = 3;
        }
        n5Var2.setGravity(i15 | 48);
        boolean z13 = LocaleController.isRTL;
        if (z13) {
            i16 = 5;
        } else {
            i16 = 3;
        }
        int i19 = i16 | 48;
        if (z13) {
            f11 = 28.0f;
        } else {
            f11 = i11 + 68;
        }
        addView(n5Var2, w7.z5.d(-1, 20.0f, i19, f11, 34.5f, z13 ? i11 + 68 : 28.0f, 0.0f));
        if (z10) {
            ImageView imageView = new ImageView(context);
            this.f22086f = imageView;
            imageView.setFocusable(false);
            int i20 = org.telegram.ui.ActionBar.k6.Vh;
            y g02 = org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.w0(i20, g6Var), 1, -1);
            org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i20);
            imageView.setBackground(g02);
            org.telegram.ui.ActionBar.r6.k(imageView, g02, null, O, g6Var);
            imageView.setImageResource(R.drawable.ic_ab_other);
            org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.Uh, g6Var, PorterDuff.Mode.MULTIPLY);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            addView(imageView, w7.z5.e(60, 64, (LocaleController.isRTL ? 3 : 5) | 48));
            imageView.setOnClickListener(new a(this, 7));
            imageView.setContentDescription(LocaleController.getString(R.string.AccDescrUserOptions));
        }
    }

    public final void a() {
        this.f22083a.getImageReceiver().cancelLoadImage();
    }

    public final void b() {
        if (!this.O) {
            int i10 = org.telegram.ui.ActionBar.k6.f21572y6;
            org.telegram.ui.ActionBar.g6 g6Var = this.d;
            int w02 = org.telegram.ui.ActionBar.k6.w0(i10, g6Var);
            int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21367n6, g6Var);
            if (w02 == this.H && w03 == this.I) {
                return;
            }
            org.telegram.ui.ActionBar.n5 n5Var = this.f22085c;
            if (n5Var != null) {
                int textColor = n5Var.getTextColor();
                if (textColor == this.H) {
                    n5Var.setTextColor(w02);
                } else if (textColor == this.I) {
                    n5Var.setTextColor(w03);
                }
            }
            this.H = w02;
            this.I = w03;
        }
    }

    public final void c(TLObject tLObject, CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        boolean z11;
        int i10;
        int i11;
        float f7;
        int i12;
        int i13;
        float f10;
        int i14;
        int i15;
        int i16;
        float f11;
        int i17;
        int i18;
        float f12;
        org.telegram.ui.ActionBar.n5 n5Var = this.f22085c;
        org.telegram.ui.ActionBar.n5 n5Var2 = this.f22084b;
        if (tLObject == null) {
            this.v = null;
            this.f22089s = null;
            this.f22087n = null;
            n5Var2.l("", false);
            n5Var.l("", false);
            this.f22083a.setImageDrawable(null);
            return;
        }
        this.v = charSequence2;
        this.f22089s = charSequence;
        this.f22087n = tLObject;
        ImageView imageView = this.f22086f;
        int i19 = 3;
        int i20 = this.J;
        int i21 = 28;
        if (imageView != null) {
            boolean c10 = this.L.c(this, false);
            if (c10) {
                i14 = 0;
            } else {
                i14 = 4;
            }
            imageView.setVisibility(i14);
            boolean z12 = LocaleController.isRTL;
            if (z12) {
                i15 = 5;
            } else {
                i15 = 3;
            }
            int i22 = i15 | 48;
            if (z12) {
                if (c10) {
                    i16 = 46;
                } else {
                    i16 = 28;
                }
            } else {
                i16 = i20 + 68;
            }
            float f13 = i16;
            if (charSequence2 != null && charSequence2.length() <= 0) {
                f11 = 20.5f;
            } else {
                f11 = 11.5f;
            }
            if (LocaleController.isRTL) {
                i17 = i20 + 68;
            } else if (c10) {
                i17 = 46;
            } else {
                i17 = 28;
            }
            n5Var2.setLayoutParams(w7.z5.d(-1, 20.0f, i22, f13, f11, i17, 0.0f));
            boolean z13 = LocaleController.isRTL;
            if (z13) {
                i19 = 5;
            }
            int i23 = i19 | 48;
            if (z13) {
                if (c10) {
                    i18 = 46;
                } else {
                    i18 = 28;
                }
            } else {
                i18 = i20 + 68;
            }
            float f14 = i18;
            if (z13) {
                f12 = i20 + 68;
            } else {
                if (c10) {
                    i21 = 46;
                }
                f12 = i21;
            }
            n5Var.setLayoutParams(w7.z5.d(-1, 20.0f, i23, f14, 34.5f, f12, 0.0f));
        } else {
            ImageView imageView2 = this.h;
            if (imageView2 != null) {
                if (imageView2.getVisibility() == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                boolean z14 = LocaleController.isRTL;
                if (z14) {
                    i10 = 5;
                } else {
                    i10 = 3;
                }
                int i24 = i10 | 48;
                if (z14) {
                    if (z11) {
                        i11 = 54;
                    } else {
                        i11 = 28;
                    }
                } else {
                    i11 = i20 + 68;
                }
                float f15 = i11;
                if (charSequence2 != null && charSequence2.length() <= 0) {
                    f7 = 20.5f;
                } else {
                    f7 = 11.5f;
                }
                if (LocaleController.isRTL) {
                    i12 = i20 + 68;
                } else if (z11) {
                    i12 = 54;
                } else {
                    i12 = 28;
                }
                n5Var2.setLayoutParams(w7.z5.d(-1, 20.0f, i24, f15, f7, i12, 0.0f));
                boolean z15 = LocaleController.isRTL;
                if (z15) {
                    i19 = 5;
                }
                int i25 = i19 | 48;
                if (z15) {
                    if (z11) {
                        i13 = 54;
                    } else {
                        i13 = 28;
                    }
                } else {
                    i13 = i20 + 68;
                }
                float f16 = i13;
                if (z15) {
                    f10 = i20 + 68;
                } else {
                    if (z11) {
                        i21 = 54;
                    }
                    f10 = i21;
                }
                n5Var.setLayoutParams(w7.z5.d(-1, 20.0f, i25, f16, 34.5f, f10, 0.0f));
            }
        }
        this.F = z10;
        setWillNotDraw(true ^ z10);
        d(0);
    }

    public final void d(int r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.a5.d(int):void");
    }

    public org.telegram.ui.Components.u9 getAvatarImageView() {
        return this.f22083a;
    }

    public Object getCurrentObject() {
        return this.f22087n;
    }

    public ci.x7 getStoryAvatarParams() {
        return this.N;
    }

    public TL_stories.StoryItem getStoryItem() {
        return this.f22088r;
    }

    public long getUserId() {
        Object obj = this.f22087n;
        if (obj instanceof TLRPC.User) {
            return ((TLRPC.User) obj).f20491id;
        }
        return 0L;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float dp;
        int i10;
        Paint paint;
        if (this.F) {
            int i11 = this.K;
            if (i11 >= 0) {
                org.telegram.ui.ActionBar.k6.f21324l0.setColor(org.telegram.ui.ActionBar.k6.w0(i11, this.d));
            }
            if (LocaleController.isRTL) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(68.0f);
            }
            float f7 = dp;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (LocaleController.isRTL) {
                i10 = AndroidUtilities.dp(68.0f);
            } else {
                i10 = 0;
            }
            float f10 = measuredWidth - i10;
            float measuredHeight2 = getMeasuredHeight() - 1;
            if (this.K >= 0) {
                paint = org.telegram.ui.ActionBar.k6.f21324l0;
            } else {
                paint = org.telegram.ui.ActionBar.k6.f21305k0;
            }
            canvas.drawLine(f7, measuredHeight, f10, measuredHeight2, paint);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(64.0f) + (this.F ? 1 : 0), 1073741824));
    }

    public void setCustomImageVisible(boolean z10) {
        int i10;
        ImageView imageView = this.h;
        if (imageView == null) {
            return;
        }
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        imageView.setVisibility(i10);
    }

    public void setCustomRightImage(int i10) {
        int i11;
        ImageView imageView = new ImageView(getContext());
        this.h = imageView;
        imageView.setImageResource(i10);
        this.h.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.r6.t(this.h, org.telegram.ui.ActionBar.k6.f21357mg, this.d, PorterDuff.Mode.MULTIPLY);
        ImageView imageView2 = this.h;
        if (LocaleController.isRTL) {
            i11 = 3;
        } else {
            i11 = 5;
        }
        addView(imageView2, w7.z5.e(52, 64, i11 | 48));
    }

    public void setDelegate(z4 z4Var) {
        this.L = z4Var;
    }

    public void setDividerColor(int i10) {
        this.K = i10;
    }

    public void setIsAdmin(boolean z10) {
        this.E = z10;
    }

    public void setNameColor(int i10) {
        org.telegram.ui.ActionBar.n5 n5Var = this.f22084b;
        org.telegram.ui.ActionBar.r6.r(n5Var);
        n5Var.setTextColor(i10);
    }

    @Override
    public final void updateColors() {
        try {
            b();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
