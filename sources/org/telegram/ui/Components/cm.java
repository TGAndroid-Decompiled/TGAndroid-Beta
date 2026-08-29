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
public final class cm extends tk0 {
    public final Context f27503c;
    public final boolean d;
    public boolean f27504e;
    public boolean f27505f;
    public final ArrayList h = new ArrayList(8);
    public int f27506n;
    public int f27507r;
    public boolean f27508s;
    public final ChatAttachAlertPhotoLayout v;

    public cm(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, Context context, boolean z10) {
        this.v = chatAttachAlertPhotoLayout;
        this.f27503c = context;
        this.d = z10;
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        return false;
    }

    @Override
    public final boolean E(jl0 jl0Var) {
        MediaController.AlbumEntry albumEntry;
        boolean isEmpty = ChatAttachAlertPhotoLayout.f26253n1.isEmpty();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        if ((!isEmpty || ((albumEntry = chatAttachAlertPhotoLayout.P0) != null && !albumEntry.photos.isEmpty())) && chatAttachAlertPhotoLayout.f28403b.N && h() > 30) {
            return true;
        }
        return false;
    }

    @Override
    public final String F(int i10) {
        ArrayList<MediaController.PhotoEntry> arrayList;
        MediaController.PhotoEntry M = M(i10);
        if (M == null) {
            int i11 = this.f27507r;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
            if (i10 <= i11) {
                ArrayList arrayList2 = ChatAttachAlertPhotoLayout.f26253n1;
                if (!arrayList2.isEmpty()) {
                    M = (MediaController.PhotoEntry) arrayList2.get(0);
                } else {
                    MediaController.AlbumEntry albumEntry = chatAttachAlertPhotoLayout.P0;
                    if (albumEntry != null && (arrayList = albumEntry.photos) != null) {
                        M = arrayList.get(0);
                    }
                }
            } else if (!chatAttachAlertPhotoLayout.P0.photos.isEmpty()) {
                M = (MediaController.PhotoEntry) j7.l1.i(1, chatAttachAlertPhotoLayout.P0.photos);
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
    public final void G(jl0 jl0Var, float f9, int[] iArr) {
        int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        int measuredHeight = jl0Var.getChildAt(0).getMeasuredHeight();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        float ceil = (((int) (Math.ceil(h() / chatAttachAlertPhotoLayout.I0) * measuredHeight)) - (jl0Var.getMeasuredHeight() - currentActionBarHeight)) * f9;
        float f10 = measuredHeight;
        iArr[0] = ((int) (ceil / f10)) * chatAttachAlertPhotoLayout.I0;
        int paddingTop = jl0Var.getPaddingTop() + ((int) (ceil % f10)) + ((int) ((1.0f - f9) * currentActionBarHeight));
        iArr[1] = paddingTop;
        if (iArr[0] == 0 && paddingTop < chatAttachAlertPhotoLayout.getListTopPadding()) {
            iArr[1] = chatAttachAlertPhotoLayout.getListTopPadding() + currentActionBarHeight;
        }
    }

    @Override
    public final float H(jl0 jl0Var) {
        int i10 = this.v.I0;
        int ceil = (int) Math.ceil(this.f27506n / i10);
        if (jl0Var.getChildCount() != 0) {
            int measuredHeight = jl0Var.getChildAt(0).getMeasuredHeight();
            View childAt = jl0Var.getChildAt(0);
            int R = RecyclerView.R(childAt);
            if (R >= 0) {
                return Utilities.clamp((((R / i10) * measuredHeight) - childAt.getTop()) / ((ceil * measuredHeight) - (jl0Var.getMeasuredHeight() - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight())), 1.0f, 0.0f);
            }
        }
        return 0.0f;
    }

    @Override
    public final void J(jl0 jl0Var) {
        this.f27508s = false;
        int childCount = jl0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            jl0Var.getChildAt(i10).invalidate();
        }
    }

    @Override
    public final void K() {
        this.f27508s = true;
    }

    public final vk0 L() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        org.telegram.ui.Cells.r5 r5Var = new org.telegram.ui.Cells.r5(this.f27503c, chatAttachAlertPhotoLayout.f28402a);
        if (this == chatAttachAlertPhotoLayout.C) {
            r5Var.setOutlineProvider(new am(this));
            r5Var.setClipToOutline(true);
        }
        r5Var.setFastScrollDelegate(new u(this, 22));
        r5Var.setDelegate(new j1(14, this, r5Var));
        return new f2.n1(r5Var);
    }

    public final MediaController.PhotoEntry M(int i10) {
        boolean z10 = this.f27505f;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        if (z10 && i10 > chatAttachAlertPhotoLayout.I0) {
            i10--;
        }
        if (this.d && chatAttachAlertPhotoLayout.P0 == chatAttachAlertPhotoLayout.Q0) {
            i10--;
        }
        boolean z11 = ChatAttachAlertPhotoLayout.f26252m1;
        return chatAttachAlertPhotoLayout.b0(i10);
    }

    @Override
    public final int h() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        cm cmVar = chatAttachAlertPhotoLayout.C;
        if (!chatAttachAlertPhotoLayout.f26286r0) {
            return 1;
        }
        int i10 = 0;
        this.f27504e = false;
        this.f27505f = false;
        boolean z10 = chatAttachAlertPhotoLayout.L0;
        if (z10 && this == cmVar) {
            return 2;
        }
        if (this.d && chatAttachAlertPhotoLayout.P0 == chatAttachAlertPhotoLayout.Q0) {
            this.f27504e = true;
            i10 = 1;
        }
        if (chatAttachAlertPhotoLayout.f26262c1) {
            i10++;
        }
        if (z10 && this == cmVar) {
            i10++;
        }
        this.f27507r = i10;
        if (!z10) {
            i10 += ChatAttachAlertPhotoLayout.f26253n1.size();
            MediaController.AlbumEntry albumEntry = chatAttachAlertPhotoLayout.P0;
            if (albumEntry != null) {
                i10 += albumEntry.photos.size();
            }
        }
        if (this.f27504e && i10 > chatAttachAlertPhotoLayout.I0 && !chatAttachAlertPhotoLayout.K0) {
            this.f27505f = true;
            i10++;
        }
        if (this == cmVar) {
            i10++;
        }
        this.f27506n = i10;
        return i10;
    }

    @Override
    public final int j(int i10) {
        int i11;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        cm cmVar = chatAttachAlertPhotoLayout.C;
        if (chatAttachAlertPhotoLayout.f26286r0) {
            boolean z10 = chatAttachAlertPhotoLayout.L0;
            if (z10 && this == cmVar) {
                if (i10 == 0) {
                    return 7;
                }
                return 2;
            }
            boolean z11 = this.d;
            if (z11 && i10 == 0 && chatAttachAlertPhotoLayout.P0 == chatAttachAlertPhotoLayout.Q0) {
                if (!chatAttachAlertPhotoLayout.K0) {
                    return 1;
                }
                return 8;
            }
            boolean z12 = this.f27505f;
            if (z12 && i10 == chatAttachAlertPhotoLayout.I0) {
                return 5;
            }
            if (z12 && i10 > chatAttachAlertPhotoLayout.I0) {
                i11 = i10 - 1;
            } else {
                i11 = i10;
            }
            if (z11) {
                i11--;
            }
            if (chatAttachAlertPhotoLayout.f26262c1 && i11 == 0) {
                return 4;
            }
            if (this == cmVar && i10 == this.f27506n - 1) {
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
        if (this == chatAttachAlertPhotoLayout.C) {
            hz hzVar = chatAttachAlertPhotoLayout.D;
            if ((h() == 1 && !chatAttachAlertPhotoLayout.L0 && chatAttachAlertPhotoLayout.P0 == null) || !chatAttachAlertPhotoLayout.f26286r0) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            hzVar.setVisibility(i10);
        }
    }

    @Override
    public final void v(f2.n1 n1Var, int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        ni niVar = chatAttachAlertPhotoLayout.f28403b;
        int i11 = n1Var.f6436f;
        View view = n1Var.f6432a;
        boolean z15 = this.d;
        int i12 = 0;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 3) {
                    if (i11 == 7) {
                        ((c20) view).setUseAnEmojiVisible(chatAttachAlertPhotoLayout.f26262c1);
                        return;
                    }
                    return;
                }
                org.telegram.ui.Cells.l5 l5Var = (org.telegram.ui.Cells.l5) view;
                l5Var.setItemSize(chatAttachAlertPhotoLayout.G0);
                l5Var.setType((z15 && chatAttachAlertPhotoLayout.K0 && i10 == 0) ? 1 : 1);
                return;
            }
            ((org.telegram.ui.Cells.k5) view).setItemSize(chatAttachAlertPhotoLayout.G0);
            return;
        }
        if (this.f27505f && i10 > chatAttachAlertPhotoLayout.I0) {
            i10--;
        }
        if (z15 && chatAttachAlertPhotoLayout.P0 == chatAttachAlertPhotoLayout.Q0) {
            i10--;
        }
        if (chatAttachAlertPhotoLayout.f26262c1) {
            i10--;
        }
        org.telegram.ui.Cells.r5 r5Var = (org.telegram.ui.Cells.r5) view;
        if (this == chatAttachAlertPhotoLayout.C) {
            r5Var.setItemSize(chatAttachAlertPhotoLayout.G0);
        } else {
            if (chatAttachAlertPhotoLayout.f26287s.f6362o == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            r5Var.setIsVertical(z10);
        }
        if (niVar.M0 == 0 && !niVar.P0 && !niVar.D) {
            r5Var.getCheckBox().setVisibility(0);
        } else {
            r5Var.getCheckBox().setVisibility(8);
        }
        MediaController.PhotoEntry b02 = chatAttachAlertPhotoLayout.b0(i10);
        if (b02 == null) {
            return;
        }
        HashMap hashMap = ChatAttachAlertPhotoLayout.f26254o1;
        if (hashMap.size() > 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z15 && chatAttachAlertPhotoLayout.P0 == chatAttachAlertPhotoLayout.Q0) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (i10 == h() - 1) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (niVar != null && niVar.f31001e0) {
            z14 = true;
        } else {
            z14 = false;
        }
        r5Var.d(b02, z11, z12, z13, z14);
        if ((niVar.f30990b0 instanceof org.telegram.ui.tn) && niVar.P1) {
            r5Var.b(ChatAttachAlertPhotoLayout.f26255p1.indexOf(Integer.valueOf(b02.imageId)), hashMap.containsKey(Integer.valueOf(b02.imageId)), false);
        } else {
            r5Var.b(-1, hashMap.containsKey(Integer.valueOf(b02.imageId)), false);
        }
        if (!chatAttachAlertPhotoLayout.f26288s0 && b02.isVideo) {
            r5Var.setAlpha(0.3f);
        } else if (!chatAttachAlertPhotoLayout.f26289t0 && !b02.isVideo) {
            r5Var.setAlpha(0.3f);
        } else {
            r5Var.setAlpha(1.0f);
        }
        r5Var.getImageView().setTag(Integer.valueOf(i10));
        r5Var.setTag(Integer.valueOf(i10));
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        ni niVar = chatAttachAlertPhotoLayout.f28403b;
        org.telegram.ui.ActionBar.c6 c6Var = chatAttachAlertPhotoLayout.f28402a;
        if (i10 != 0) {
            Context context = this.f27503c;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            if (i10 != 7) {
                                if (i10 != 8) {
                                    ?? frameLayout = new FrameLayout(context);
                                    ImageView imageView = new ImageView(context);
                                    frameLayout.f24635a = imageView;
                                    ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
                                    imageView.setScaleType(scaleType);
                                    int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23012aa, c6Var);
                                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                                    imageView.setColorFilter(new PorterDuffColorFilter(v02, mode));
                                    frameLayout.addView(imageView, i7.f6.d(44, 44.0f, 17, 5.0f, 0.0f, 0.0f, 27.0f));
                                    ImageView imageView2 = new ImageView(context);
                                    frameLayout.f24636b = imageView2;
                                    imageView2.setScaleType(scaleType);
                                    imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23031ba, c6Var), mode));
                                    frameLayout.addView(imageView2, i7.f6.d(44, 44.0f, 17, 5.0f, 0.0f, 0.0f, 27.0f));
                                    TextView textView = new TextView(context);
                                    frameLayout.f24637c = textView;
                                    org.telegram.ui.b.m(org.telegram.ui.ActionBar.g6.f23048ca, c6Var, textView, 1, 12.0f);
                                    textView.setGravity(17);
                                    frameLayout.addView(textView, i7.f6.d(-2, -2.0f, 17, 5.0f, 13.0f, 5.0f, 0.0f));
                                    frameLayout.d = AndroidUtilities.dp(80.0f);
                                    return new f2.n1(frameLayout);
                                }
                                FrameLayout frameLayout2 = new FrameLayout(context);
                                frameLayout2.setLayoutParams(new f2.x0(-1, AndroidUtilities.dp(56.0f)));
                                nh.d dVar = new nh.d(context, c6Var, true);
                                dVar.setUseWrapContent(true);
                                dVar.e();
                                dVar.setPadding(AndroidUtilities.dp(28.0f), 0, AndroidUtilities.dp(28.0f), 0);
                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("c");
                                spannableStringBuilder.setSpan(new iq(R.drawable.camera, 0), 0, 1, 33);
                                spannableStringBuilder.append((CharSequence) "  ").append((CharSequence) LocaleController.getString(R.string.GalleryAccessAllowAccessCamera));
                                dVar.g(spannableStringBuilder, false, true);
                                frameLayout2.addView(dVar, i7.f6.d(-2, 44.0f, 81, 10.0f, 0.0f, 10.0f, 12.0f));
                                return new f2.n1(frameLayout2);
                            }
                            c20 c20Var = new c20(context, niVar.F1);
                            c20Var.setLayoutParams(new f2.x0(-1, AndroidUtilities.dp(400.0f)));
                            c20Var.setGravity(17);
                            c20Var.isClickable();
                            c20Var.f27285b.setOnClickListener(new h0(new gl(chatAttachAlertPhotoLayout, 5), 18));
                            c20Var.f27284a.setOnClickListener(new h0(new gl(chatAttachAlertPhotoLayout, 6), 19));
                            c20Var.f27286c.setOnClickListener(new t2(23, c20Var, new y2(this, 2)));
                            return new f2.n1(c20Var);
                        }
                        return new f2.n1(new View(context));
                    }
                    niVar.getClass();
                    return new f2.n1(new bm(this, context));
                }
                return new f2.n1(new cg.h0(this, context, 10));
            }
            ?? view = new View(context);
            view.setFocusable(true);
            view.f24598a = AndroidUtilities.dp(0.0f);
            return new f2.n1(view);
        }
        ArrayList arrayList = this.h;
        if (!arrayList.isEmpty()) {
            vk0 vk0Var = (vk0) arrayList.get(0);
            arrayList.remove(0);
            return vk0Var;
        }
        return L();
    }

    @Override
    public final void y(f2.n1 n1Var) {
        if (n1Var.f6432a instanceof org.telegram.ui.Cells.k5) {
            this.v.M.f();
        }
    }
}
