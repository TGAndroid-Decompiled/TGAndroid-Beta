package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
public final class vm extends ul0 {
    public final Context f30084c;
    public final boolean d;
    public boolean e;
    public boolean f30085f;
    public final ArrayList h = new ArrayList(8);
    public int f30086n;
    public int f30087r;
    public boolean f30088s;
    public final ChatAttachAlertPhotoLayout v;

    public vm(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, Context context, boolean z10) {
        this.v = chatAttachAlertPhotoLayout;
        this.f30084c = context;
        this.d = z10;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        return false;
    }

    @Override
    public final boolean E(mm0 mm0Var) {
        MediaController.AlbumEntry albumEntry;
        boolean isEmpty = ChatAttachAlertPhotoLayout.f23019r1.isEmpty();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        if ((!isEmpty || ((albumEntry = chatAttachAlertPhotoLayout.T0) != null && !albumEntry.photos.isEmpty())) && chatAttachAlertPhotoLayout.f27671b.R && h() > 30) {
            return true;
        }
        return false;
    }

    @Override
    public final String F(int i10) {
        ArrayList<MediaController.PhotoEntry> arrayList;
        MediaController.PhotoEntry M = M(i10);
        if (M == null) {
            int i11 = this.f30087r;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
            if (i10 <= i11) {
                ArrayList arrayList2 = ChatAttachAlertPhotoLayout.f23019r1;
                if (!arrayList2.isEmpty()) {
                    M = (MediaController.PhotoEntry) arrayList2.get(0);
                } else {
                    MediaController.AlbumEntry albumEntry = chatAttachAlertPhotoLayout.T0;
                    if (albumEntry != null && (arrayList = albumEntry.photos) != null) {
                        M = arrayList.get(0);
                    }
                }
            } else if (!chatAttachAlertPhotoLayout.T0.photos.isEmpty()) {
                M = (MediaController.PhotoEntry) i2.d.g(1, chatAttachAlertPhotoLayout.T0.photos);
            }
        }
        if (M != null) {
            long j10 = M.dateTaken;
            if (Build.VERSION.SDK_INT <= 28) {
                j10 /= 1000;
            }
            return LocaleController.formatYearMont(j10, true);
        }
        return "";
    }

    @Override
    public final void G(mm0 mm0Var, float f7, int[] iArr) {
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        int measuredHeight = mm0Var.getChildAt(0).getMeasuredHeight();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        float ceil = (((int) (Math.ceil(h() / chatAttachAlertPhotoLayout.M0) * measuredHeight)) - (mm0Var.getMeasuredHeight() - currentActionBarHeight)) * f7;
        float f10 = measuredHeight;
        iArr[0] = ((int) (ceil / f10)) * chatAttachAlertPhotoLayout.M0;
        int paddingTop = mm0Var.getPaddingTop() + ((int) (ceil % f10)) + ((int) ((1.0f - f7) * currentActionBarHeight));
        iArr[1] = paddingTop;
        if (iArr[0] == 0 && paddingTop < chatAttachAlertPhotoLayout.getListTopPadding()) {
            iArr[1] = chatAttachAlertPhotoLayout.getListTopPadding() + currentActionBarHeight;
        }
    }

    @Override
    public final float H(mm0 mm0Var) {
        int i10 = this.v.M0;
        int ceil = (int) Math.ceil(this.f30086n / i10);
        if (mm0Var.getChildCount() != 0) {
            int measuredHeight = mm0Var.getChildAt(0).getMeasuredHeight();
            View childAt = mm0Var.getChildAt(0);
            int R = RecyclerView.R(childAt);
            if (R >= 0) {
                return Utilities.clamp((((R / i10) * measuredHeight) - childAt.getTop()) / ((ceil * measuredHeight) - (mm0Var.getMeasuredHeight() - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())), 1.0f, 0.0f);
            }
        }
        return 0.0f;
    }

    @Override
    public final void J(mm0 mm0Var) {
        this.f30088s = false;
        int childCount = mm0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            mm0Var.getChildAt(i10).invalidate();
        }
    }

    @Override
    public final void K() {
        this.f30088s = true;
    }

    public final wl0 L() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        org.telegram.ui.Cells.t5 t5Var = new org.telegram.ui.Cells.t5(this.f30084c, chatAttachAlertPhotoLayout.f27670a);
        if (this == chatAttachAlertPhotoLayout.G) {
            t5Var.setOutlineProvider(new tm(this));
            t5Var.setClipToOutline(true);
        }
        t5Var.setFastScrollDelegate(new s(this, 22));
        t5Var.setDelegate(new t2(9, this, t5Var));
        return new s4.b1(t5Var);
    }

    public final MediaController.PhotoEntry M(int i10) {
        boolean z10 = this.f30085f;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        if (z10 && i10 > chatAttachAlertPhotoLayout.M0) {
            i10--;
        }
        if (this.d && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
            i10--;
        }
        boolean z11 = ChatAttachAlertPhotoLayout.f23018q1;
        return chatAttachAlertPhotoLayout.b0(i10);
    }

    @Override
    public final int h() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        vm vmVar = chatAttachAlertPhotoLayout.G;
        if (!chatAttachAlertPhotoLayout.f23061v0) {
            return 1;
        }
        int i10 = 0;
        this.e = false;
        this.f30085f = false;
        boolean z10 = chatAttachAlertPhotoLayout.P0;
        if (z10 && this == vmVar) {
            return 2;
        }
        if (this.d && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
            this.e = true;
            i10 = 1;
        }
        if (chatAttachAlertPhotoLayout.f23036g1) {
            i10++;
        }
        if (z10 && this == vmVar) {
            i10++;
        }
        this.f30087r = i10;
        if (!z10) {
            i10 += ChatAttachAlertPhotoLayout.f23019r1.size();
            MediaController.AlbumEntry albumEntry = chatAttachAlertPhotoLayout.T0;
            if (albumEntry != null) {
                i10 += albumEntry.photos.size();
            }
        }
        if (this.e && i10 > chatAttachAlertPhotoLayout.M0 && !chatAttachAlertPhotoLayout.O0) {
            this.f30085f = true;
            i10++;
        }
        if (this == vmVar) {
            i10++;
        }
        this.f30086n = i10;
        return i10;
    }

    @Override
    public final int j(int i10) {
        int i11;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        vm vmVar = chatAttachAlertPhotoLayout.G;
        if (chatAttachAlertPhotoLayout.f23061v0) {
            boolean z10 = chatAttachAlertPhotoLayout.P0;
            if (z10 && this == vmVar) {
                if (i10 == 0) {
                    return 7;
                }
                return 2;
            }
            boolean z11 = this.d;
            if (z11 && i10 == 0 && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
                if (!chatAttachAlertPhotoLayout.O0) {
                    return 1;
                }
                return 8;
            }
            boolean z12 = this.f30085f;
            if (z12 && i10 == chatAttachAlertPhotoLayout.M0) {
                return 5;
            }
            if (z12 && i10 > chatAttachAlertPhotoLayout.M0) {
                i11 = i10 - 1;
            } else {
                i11 = i10;
            }
            if (z11) {
                i11--;
            }
            if (chatAttachAlertPhotoLayout.f23036g1 && i11 == 0) {
                return 4;
            }
            if (this == vmVar && i10 == this.f30086n - 1) {
                return 2;
            }
            if (z10) {
                return 3;
            }
            return 0;
        }
        return 2;
    }

    @Override
    public final void l() {
        int i10;
        super.l();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        if (this == chatAttachAlertPhotoLayout.G) {
            yz yzVar = chatAttachAlertPhotoLayout.H;
            if ((h() == 1 && !chatAttachAlertPhotoLayout.P0 && chatAttachAlertPhotoLayout.T0 == null) || !chatAttachAlertPhotoLayout.f23061v0) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            yzVar.setVisibility(i10);
        }
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        vi viVar = chatAttachAlertPhotoLayout.f27671b;
        int i11 = b1Var.f44841f;
        View view = b1Var.f44838a;
        boolean z15 = this.d;
        int i12 = 0;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 3) {
                    if (i11 == 7) {
                        ((t20) view).setUseAnEmojiVisible(chatAttachAlertPhotoLayout.f23036g1);
                        return;
                    }
                    return;
                }
                org.telegram.ui.Cells.n5 n5Var = (org.telegram.ui.Cells.n5) view;
                n5Var.setItemSize(chatAttachAlertPhotoLayout.K0);
                if (!z15 || !chatAttachAlertPhotoLayout.O0 || i10 != 0) {
                    i12 = 1;
                }
                n5Var.setType(i12);
                return;
            }
            ((org.telegram.ui.Cells.m5) view).setItemSize(chatAttachAlertPhotoLayout.K0);
            return;
        }
        if (this.f30085f && i10 > chatAttachAlertPhotoLayout.M0) {
            i10--;
        }
        if (z15 && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
            i10--;
        }
        if (chatAttachAlertPhotoLayout.f23036g1) {
            i10--;
        }
        org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) view;
        if (this == chatAttachAlertPhotoLayout.G) {
            t5Var.setItemSize(chatAttachAlertPhotoLayout.K0);
        } else {
            if (chatAttachAlertPhotoLayout.f23057s.f44826o == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            t5Var.setIsVertical(z10);
        }
        if (viVar.T0 == 0 && !viVar.W0 && !viVar.H) {
            t5Var.getCheckBox().setVisibility(0);
        } else {
            t5Var.getCheckBox().setVisibility(8);
        }
        MediaController.PhotoEntry b02 = chatAttachAlertPhotoLayout.b0(i10);
        if (b02 == null) {
            return;
        }
        HashMap hashMap = ChatAttachAlertPhotoLayout.f23020s1;
        if (hashMap.size() > 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z15 && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (i10 == h() - 1) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (viVar != null && viVar.f30010i0) {
            z14 = true;
        } else {
            z14 = false;
        }
        t5Var.d(b02, z11, z12, z13, z14);
        if ((viVar.f30001f0 instanceof org.telegram.ui.fo) && viVar.W1) {
            t5Var.b(ChatAttachAlertPhotoLayout.f23021t1.indexOf(Integer.valueOf(b02.imageId)), hashMap.containsKey(Integer.valueOf(b02.imageId)), false);
        } else {
            t5Var.b(-1, hashMap.containsKey(Integer.valueOf(b02.imageId)), false);
        }
        if (!chatAttachAlertPhotoLayout.f23063w0 && b02.isVideo) {
            t5Var.setAlpha(0.3f);
        } else if (!chatAttachAlertPhotoLayout.f23065x0 && !b02.isVideo) {
            t5Var.setAlpha(0.3f);
        } else {
            t5Var.setAlpha(1.0f);
        }
        t5Var.getImageView().setTag(Integer.valueOf(i10));
        t5Var.setTag(Integer.valueOf(i10));
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        vi viVar = chatAttachAlertPhotoLayout.f27671b;
        org.telegram.ui.ActionBar.c6 c6Var = chatAttachAlertPhotoLayout.f27670a;
        if (i10 != 0) {
            Context context = this.f30084c;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            if (i10 != 7) {
                                if (i10 != 8) {
                                    ?? frameLayout = new FrameLayout(context);
                                    ImageView imageView = new ImageView(context);
                                    frameLayout.f21564a = imageView;
                                    ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
                                    imageView.setScaleType(scaleType);
                                    int w02 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19846aa, c6Var);
                                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                                    imageView.setColorFilter(new PorterDuffColorFilter(w02, mode));
                                    frameLayout.addView(imageView, w7.a6.a(44.0f, 5.0f, 0.0f, 0.0f, 27.0f, 44, 17));
                                    ImageView imageView2 = new ImageView(context);
                                    frameLayout.f21565b = imageView2;
                                    imageView2.setScaleType(scaleType);
                                    imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19866ba, c6Var), mode));
                                    frameLayout.addView(imageView2, w7.a6.a(44.0f, 5.0f, 0.0f, 0.0f, 27.0f, 44, 17));
                                    TextView textView = new TextView(context);
                                    frameLayout.f21566c = textView;
                                    org.telegram.messenger.yh.n(org.telegram.ui.ActionBar.g6.f19886ca, c6Var, textView, 1, 12.0f);
                                    textView.setGravity(17);
                                    frameLayout.addView(textView, w7.a6.a(-2.0f, 5.0f, 13.0f, 5.0f, 0.0f, -2, 17));
                                    frameLayout.d = AndroidUtilities.dp(80.0f);
                                    return new s4.b1(frameLayout);
                                }
                                FrameLayout frameLayout2 = new FrameLayout(context);
                                frameLayout2.setLayoutParams(new s4.o0(-1, AndroidUtilities.dp(56.0f)));
                                di.d dVar = new di.d(context, c6Var, true);
                                dVar.setUseWrapContent(true);
                                dVar.e();
                                dVar.setPadding(AndroidUtilities.dp(28.0f), 0, AndroidUtilities.dp(28.0f), 0);
                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("c");
                                spannableStringBuilder.setSpan(new br(R.drawable.camera, 0), 0, 1, 33);
                                spannableStringBuilder.append((CharSequence) "  ").append((CharSequence) LocaleController.getString(R.string.GalleryAccessAllowAccessCamera));
                                dVar.g(spannableStringBuilder, false, true);
                                frameLayout2.addView(dVar, w7.a6.a(44.0f, 10.0f, 0.0f, 10.0f, 12.0f, -2, 81));
                                return new s4.b1(frameLayout2);
                            }
                            t20 t20Var = new t20(context, viVar.M1);
                            t20Var.setLayoutParams(new s4.o0(-1, AndroidUtilities.dp(400.0f)));
                            t20Var.setGravity(17);
                            t20Var.isClickable();
                            t20Var.f29256b.setOnClickListener(new f0(new zl(chatAttachAlertPhotoLayout, 5), 17));
                            t20Var.f29255a.setOnClickListener(new f0(new zl(chatAttachAlertPhotoLayout, 6), 18));
                            t20Var.f29257c.setOnClickListener(new rt(5, t20Var, new a3(this, 2)));
                            return new s4.b1(t20Var);
                        }
                        return new s4.b1(new View(context));
                    }
                    viVar.getClass();
                    return new s4.b1(new um(this, context));
                }
                return new s4.b1(new di.ab(this, context, 13));
            }
            ?? view = new View(context);
            view.setFocusable(true);
            view.f21519a = AndroidUtilities.dp(0.0f);
            return new s4.b1(view);
        }
        ArrayList arrayList = this.h;
        if (!arrayList.isEmpty()) {
            wl0 wl0Var = (wl0) arrayList.get(0);
            arrayList.remove(0);
            return wl0Var;
        }
        return L();
    }

    @Override
    public final void y(s4.b1 b1Var) {
        if (b1Var.f44838a instanceof org.telegram.ui.Cells.m5) {
            this.v.Q.g();
        }
    }
}
