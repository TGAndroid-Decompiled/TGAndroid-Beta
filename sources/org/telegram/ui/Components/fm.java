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
public final class fm extends cl0 {
    public final Context f26941c;
    public final boolean d;
    public boolean f26942e;
    public boolean f26943f;
    public final ArrayList h = new ArrayList(8);
    public int f26944n;
    public int f26945r;
    public boolean f26946s;
    public final ChatAttachAlertPhotoLayout v;

    public fm(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, Context context, boolean z4) {
        this.v = chatAttachAlertPhotoLayout;
        this.f26941c = context;
        this.d = z4;
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        return false;
    }

    @Override
    public final boolean E(sl0 sl0Var) {
        MediaController.AlbumEntry albumEntry;
        boolean isEmpty = ChatAttachAlertPhotoLayout.f24739o1.isEmpty();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        if ((!isEmpty || ((albumEntry = chatAttachAlertPhotoLayout.Q0) != null && !albumEntry.photos.isEmpty())) && chatAttachAlertPhotoLayout.f26590b.O && h() > 30) {
            return true;
        }
        return false;
    }

    @Override
    public final String F(int i10) {
        ArrayList<MediaController.PhotoEntry> arrayList;
        MediaController.PhotoEntry M = M(i10);
        if (M == null) {
            int i11 = this.f26945r;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
            if (i10 <= i11) {
                ArrayList arrayList2 = ChatAttachAlertPhotoLayout.f24739o1;
                if (!arrayList2.isEmpty()) {
                    M = (MediaController.PhotoEntry) arrayList2.get(0);
                } else {
                    MediaController.AlbumEntry albumEntry = chatAttachAlertPhotoLayout.Q0;
                    if (albumEntry != null && (arrayList = albumEntry.photos) != null) {
                        M = arrayList.get(0);
                    }
                }
            } else if (!chatAttachAlertPhotoLayout.Q0.photos.isEmpty()) {
                M = (MediaController.PhotoEntry) l.d.i(1, chatAttachAlertPhotoLayout.Q0.photos);
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
    public final void G(sl0 sl0Var, float f10, int[] iArr) {
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        int measuredHeight = sl0Var.getChildAt(0).getMeasuredHeight();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        float ceil = (((int) (Math.ceil(h() / chatAttachAlertPhotoLayout.J0) * measuredHeight)) - (sl0Var.getMeasuredHeight() - currentActionBarHeight)) * f10;
        float f11 = measuredHeight;
        iArr[0] = ((int) (ceil / f11)) * chatAttachAlertPhotoLayout.J0;
        int paddingTop = sl0Var.getPaddingTop() + ((int) (ceil % f11)) + ((int) ((1.0f - f10) * currentActionBarHeight));
        iArr[1] = paddingTop;
        if (iArr[0] == 0 && paddingTop < chatAttachAlertPhotoLayout.getListTopPadding()) {
            iArr[1] = chatAttachAlertPhotoLayout.getListTopPadding() + currentActionBarHeight;
        }
    }

    @Override
    public final float H(sl0 sl0Var) {
        int i10 = this.v.J0;
        int ceil = (int) Math.ceil(this.f26944n / i10);
        if (sl0Var.getChildCount() != 0) {
            int measuredHeight = sl0Var.getChildAt(0).getMeasuredHeight();
            View childAt = sl0Var.getChildAt(0);
            int R = RecyclerView.R(childAt);
            if (R >= 0) {
                return Utilities.clamp((((R / i10) * measuredHeight) - childAt.getTop()) / ((ceil * measuredHeight) - (sl0Var.getMeasuredHeight() - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())), 1.0f, 0.0f);
            }
        }
        return 0.0f;
    }

    @Override
    public final void J(sl0 sl0Var) {
        this.f26946s = false;
        int childCount = sl0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            sl0Var.getChildAt(i10).invalidate();
        }
    }

    @Override
    public final void K() {
        this.f26946s = true;
    }

    public final el0 L() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        org.telegram.ui.Cells.t5 t5Var = new org.telegram.ui.Cells.t5(this.f26941c, chatAttachAlertPhotoLayout.f26589a);
        if (this == chatAttachAlertPhotoLayout.D) {
            t5Var.setOutlineProvider(new dm(this));
            t5Var.setClipToOutline(true);
        }
        t5Var.setFastScrollDelegate(new t(this, 22));
        t5Var.setDelegate(new o1(13, this, t5Var));
        return new f2.m1(t5Var);
    }

    public final MediaController.PhotoEntry M(int i10) {
        boolean z4 = this.f26943f;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        if (z4 && i10 > chatAttachAlertPhotoLayout.J0) {
            i10--;
        }
        if (this.d && chatAttachAlertPhotoLayout.Q0 == chatAttachAlertPhotoLayout.R0) {
            i10--;
        }
        boolean z10 = ChatAttachAlertPhotoLayout.f24738n1;
        return chatAttachAlertPhotoLayout.b0(i10);
    }

    @Override
    public final int h() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        fm fmVar = chatAttachAlertPhotoLayout.D;
        if (!chatAttachAlertPhotoLayout.f24775s0) {
            return 1;
        }
        int i10 = 0;
        this.f26942e = false;
        this.f26943f = false;
        boolean z4 = chatAttachAlertPhotoLayout.M0;
        if (z4 && this == fmVar) {
            return 2;
        }
        if (this.d && chatAttachAlertPhotoLayout.Q0 == chatAttachAlertPhotoLayout.R0) {
            this.f26942e = true;
            i10 = 1;
        }
        if (chatAttachAlertPhotoLayout.f24750d1) {
            i10++;
        }
        if (z4 && this == fmVar) {
            i10++;
        }
        this.f26945r = i10;
        if (!z4) {
            i10 += ChatAttachAlertPhotoLayout.f24739o1.size();
            MediaController.AlbumEntry albumEntry = chatAttachAlertPhotoLayout.Q0;
            if (albumEntry != null) {
                i10 += albumEntry.photos.size();
            }
        }
        if (this.f26942e && i10 > chatAttachAlertPhotoLayout.J0 && !chatAttachAlertPhotoLayout.L0) {
            this.f26943f = true;
            i10++;
        }
        if (this == fmVar) {
            i10++;
        }
        this.f26944n = i10;
        return i10;
    }

    @Override
    public final int j(int i10) {
        int i11;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        fm fmVar = chatAttachAlertPhotoLayout.D;
        if (chatAttachAlertPhotoLayout.f24775s0) {
            boolean z4 = chatAttachAlertPhotoLayout.M0;
            if (z4 && this == fmVar) {
                if (i10 == 0) {
                    return 7;
                }
                return 2;
            }
            boolean z10 = this.d;
            if (z10 && i10 == 0 && chatAttachAlertPhotoLayout.Q0 == chatAttachAlertPhotoLayout.R0) {
                if (!chatAttachAlertPhotoLayout.L0) {
                    return 1;
                }
                return 8;
            }
            boolean z11 = this.f26943f;
            if (z11 && i10 == chatAttachAlertPhotoLayout.J0) {
                return 5;
            }
            if (z11 && i10 > chatAttachAlertPhotoLayout.J0) {
                i11 = i10 - 1;
            } else {
                i11 = i10;
            }
            if (z10) {
                i11--;
            }
            if (chatAttachAlertPhotoLayout.f24750d1 && i11 == 0) {
                return 4;
            }
            if (this == fmVar && i10 == this.f26944n - 1) {
                return 2;
            }
            if (z4) {
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
        if (this == chatAttachAlertPhotoLayout.D) {
            oz ozVar = chatAttachAlertPhotoLayout.E;
            if ((h() == 1 && !chatAttachAlertPhotoLayout.M0 && chatAttachAlertPhotoLayout.Q0 == null) || !chatAttachAlertPhotoLayout.f24775s0) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            ozVar.setVisibility(i10);
        }
    }

    @Override
    public final void v(f2.m1 m1Var, int i10) {
        boolean z4;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        mi miVar = chatAttachAlertPhotoLayout.f26590b;
        int i11 = m1Var.f5879f;
        View view = m1Var.f5875a;
        boolean z14 = this.d;
        int i12 = 0;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 3) {
                    if (i11 == 7) {
                        ((i20) view).setUseAnEmojiVisible(chatAttachAlertPhotoLayout.f24750d1);
                        return;
                    }
                    return;
                }
                org.telegram.ui.Cells.n5 n5Var = (org.telegram.ui.Cells.n5) view;
                n5Var.setItemSize(chatAttachAlertPhotoLayout.H0);
                n5Var.setType((z14 && chatAttachAlertPhotoLayout.L0 && i10 == 0) ? 1 : 1);
                return;
            }
            ((org.telegram.ui.Cells.m5) view).setItemSize(chatAttachAlertPhotoLayout.H0);
            return;
        }
        if (this.f26943f && i10 > chatAttachAlertPhotoLayout.J0) {
            i10--;
        }
        if (z14 && chatAttachAlertPhotoLayout.Q0 == chatAttachAlertPhotoLayout.R0) {
            i10--;
        }
        if (chatAttachAlertPhotoLayout.f24750d1) {
            i10--;
        }
        org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) view;
        if (this == chatAttachAlertPhotoLayout.D) {
            t5Var.setItemSize(chatAttachAlertPhotoLayout.H0);
        } else {
            if (chatAttachAlertPhotoLayout.f24774s.f5816o == 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            t5Var.setIsVertical(z4);
        }
        if (miVar.N0 == 0 && !miVar.Q0 && !miVar.E) {
            t5Var.getCheckBox().setVisibility(0);
        } else {
            t5Var.getCheckBox().setVisibility(8);
        }
        MediaController.PhotoEntry b02 = chatAttachAlertPhotoLayout.b0(i10);
        if (b02 == null) {
            return;
        }
        HashMap hashMap = ChatAttachAlertPhotoLayout.f24740p1;
        if (hashMap.size() > 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z14 && chatAttachAlertPhotoLayout.Q0 == chatAttachAlertPhotoLayout.R0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (i10 == h() - 1) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (miVar != null && miVar.f29069f0) {
            z13 = true;
        } else {
            z13 = false;
        }
        t5Var.d(b02, z10, z11, z12, z13);
        if ((miVar.f29058c0 instanceof org.telegram.ui.xn) && miVar.Q1) {
            t5Var.b(ChatAttachAlertPhotoLayout.f24741q1.indexOf(Integer.valueOf(b02.imageId)), hashMap.containsKey(Integer.valueOf(b02.imageId)), false);
        } else {
            t5Var.b(-1, hashMap.containsKey(Integer.valueOf(b02.imageId)), false);
        }
        if (!chatAttachAlertPhotoLayout.f24776t0 && b02.isVideo) {
            t5Var.setAlpha(0.3f);
        } else if (!chatAttachAlertPhotoLayout.f24777u0 && !b02.isVideo) {
            t5Var.setAlpha(0.3f);
        } else {
            t5Var.setAlpha(1.0f);
        }
        t5Var.getImageView().setTag(Integer.valueOf(i10));
        t5Var.setTag(Integer.valueOf(i10));
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        mi miVar = chatAttachAlertPhotoLayout.f26590b;
        org.telegram.ui.ActionBar.g6 g6Var = chatAttachAlertPhotoLayout.f26589a;
        if (i10 != 0) {
            Context context = this.f26941c;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            if (i10 != 7) {
                                if (i10 != 8) {
                                    ?? frameLayout = new FrameLayout(context);
                                    ImageView imageView = new ImageView(context);
                                    frameLayout.f23219a = imageView;
                                    ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
                                    imageView.setScaleType(scaleType);
                                    int v02 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21610aa, g6Var);
                                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                                    imageView.setColorFilter(new PorterDuffColorFilter(v02, mode));
                                    frameLayout.addView(imageView, k7.c6.d(44, 44.0f, 17, 5.0f, 0.0f, 0.0f, 27.0f));
                                    ImageView imageView2 = new ImageView(context);
                                    frameLayout.f23220b = imageView2;
                                    imageView2.setScaleType(scaleType);
                                    imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21629ba, g6Var), mode));
                                    frameLayout.addView(imageView2, k7.c6.d(44, 44.0f, 17, 5.0f, 0.0f, 0.0f, 27.0f));
                                    TextView textView = new TextView(context);
                                    frameLayout.f23221c = textView;
                                    org.telegram.ui.b.l(org.telegram.ui.ActionBar.k6.f21647ca, g6Var, textView, 1, 12.0f);
                                    textView.setGravity(17);
                                    frameLayout.addView(textView, k7.c6.d(-2, -2.0f, 17, 5.0f, 13.0f, 5.0f, 0.0f));
                                    frameLayout.d = AndroidUtilities.dp(80.0f);
                                    return new f2.m1(frameLayout);
                                }
                                FrameLayout frameLayout2 = new FrameLayout(context);
                                frameLayout2.setLayoutParams(new f2.x0(-1, AndroidUtilities.dp(56.0f)));
                                qh.d dVar = new qh.d(context, g6Var, true);
                                dVar.setUseWrapContent(true);
                                dVar.e();
                                dVar.setPadding(AndroidUtilities.dp(28.0f), 0, AndroidUtilities.dp(28.0f), 0);
                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("c");
                                spannableStringBuilder.setSpan(new oq(R.drawable.camera, 0), 0, 1, 33);
                                spannableStringBuilder.append((CharSequence) "  ").append((CharSequence) LocaleController.getString(R.string.GalleryAccessAllowAccessCamera));
                                dVar.g(spannableStringBuilder, false, true);
                                frameLayout2.addView(dVar, k7.c6.d(-2, 44.0f, 81, 10.0f, 0.0f, 10.0f, 12.0f));
                                return new f2.m1(frameLayout2);
                            }
                            i20 i20Var = new i20(context, miVar.G1);
                            i20Var.setLayoutParams(new f2.x0(-1, AndroidUtilities.dp(400.0f)));
                            i20Var.setGravity(17);
                            i20Var.isClickable();
                            i20Var.f27693b.setOnClickListener(new g0(new hl(chatAttachAlertPhotoLayout, 5), 18));
                            i20Var.f27692a.setOnClickListener(new g0(new hl(chatAttachAlertPhotoLayout, 6), 19));
                            i20Var.f27694c.setOnClickListener(new w2(20, i20Var, new v2(this, 2)));
                            return new f2.m1(i20Var);
                        }
                        return new f2.m1(new View(context));
                    }
                    miVar.getClass();
                    return new f2.m1(new em(this, context));
                }
                return new f2.m1(new fg.h0(this, context, 8));
            }
            ?? view = new View(context);
            view.setFocusable(true);
            view.f23168a = AndroidUtilities.dp(0.0f);
            return new f2.m1(view);
        }
        ArrayList arrayList = this.h;
        if (!arrayList.isEmpty()) {
            el0 el0Var = (el0) arrayList.get(0);
            arrayList.remove(0);
            return el0Var;
        }
        return L();
    }

    @Override
    public final void y(f2.m1 m1Var) {
        if (m1Var.f5875a instanceof org.telegram.ui.Cells.m5) {
            this.v.N.f();
        }
    }
}
