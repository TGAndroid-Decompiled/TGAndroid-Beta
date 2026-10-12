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
public final class an extends em0 {
    public final Context f24438c;
    public final boolean d;
    public boolean f24439e;
    public boolean f24440f;
    public final ArrayList h = new ArrayList(8);
    public int f24441n;
    public int f24442r;
    public boolean f24443s;
    public final ChatAttachAlertPhotoLayout v;

    public an(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, Context context, boolean z10) {
        this.v = chatAttachAlertPhotoLayout;
        this.f24438c = context;
        this.d = z10;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        return false;
    }

    @Override
    public final boolean E(wm0 wm0Var) {
        MediaController.AlbumEntry albumEntry;
        boolean isEmpty = ChatAttachAlertPhotoLayout.f23799r1.isEmpty();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        if ((!isEmpty || ((albumEntry = chatAttachAlertPhotoLayout.T0) != null && !albumEntry.photos.isEmpty())) && chatAttachAlertPhotoLayout.f30574b.R && h() > 30) {
            return true;
        }
        return false;
    }

    @Override
    public final String F(int i10) {
        ArrayList<MediaController.PhotoEntry> arrayList;
        MediaController.PhotoEntry M = M(i10);
        if (M == null) {
            int i11 = this.f24442r;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
            if (i10 <= i11) {
                ArrayList arrayList2 = ChatAttachAlertPhotoLayout.f23799r1;
                if (!arrayList2.isEmpty()) {
                    M = (MediaController.PhotoEntry) arrayList2.get(0);
                } else {
                    MediaController.AlbumEntry albumEntry = chatAttachAlertPhotoLayout.T0;
                    if (albumEntry != null && (arrayList = albumEntry.photos) != null) {
                        M = arrayList.get(0);
                    }
                }
            } else if (!chatAttachAlertPhotoLayout.T0.photos.isEmpty()) {
                M = (MediaController.PhotoEntry) hg.c.h(1, chatAttachAlertPhotoLayout.T0.photos);
            }
        }
        if (M != null) {
            long j3 = M.dateTaken;
            if (Build.VERSION.SDK_INT <= 28) {
                j3 /= 1000;
            }
            return LocaleController.formatYearMont(j3, true);
        }
        return "";
    }

    @Override
    public final void G(wm0 wm0Var, float f7, int[] iArr) {
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        int measuredHeight = wm0Var.getChildAt(0).getMeasuredHeight();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        float ceil = (((int) (Math.ceil(h() / chatAttachAlertPhotoLayout.M0) * measuredHeight)) - (wm0Var.getMeasuredHeight() - currentActionBarHeight)) * f7;
        float f10 = measuredHeight;
        iArr[0] = ((int) (ceil / f10)) * chatAttachAlertPhotoLayout.M0;
        int paddingTop = wm0Var.getPaddingTop() + ((int) (ceil % f10)) + ((int) ((1.0f - f7) * currentActionBarHeight));
        iArr[1] = paddingTop;
        if (iArr[0] == 0 && paddingTop < chatAttachAlertPhotoLayout.getListTopPadding()) {
            iArr[1] = chatAttachAlertPhotoLayout.getListTopPadding() + currentActionBarHeight;
        }
    }

    @Override
    public final float H(wm0 wm0Var) {
        int i10 = this.v.M0;
        int ceil = (int) Math.ceil(this.f24441n / i10);
        if (wm0Var.getChildCount() != 0) {
            int measuredHeight = wm0Var.getChildAt(0).getMeasuredHeight();
            View childAt = wm0Var.getChildAt(0);
            int R = RecyclerView.R(childAt);
            if (R >= 0) {
                return Utilities.clamp((((R / i10) * measuredHeight) - childAt.getTop()) / ((ceil * measuredHeight) - (wm0Var.getMeasuredHeight() - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())), 1.0f, 0.0f);
            }
        }
        return 0.0f;
    }

    @Override
    public final void J(wm0 wm0Var) {
        this.f24443s = false;
        int childCount = wm0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            wm0Var.getChildAt(i10).invalidate();
        }
    }

    @Override
    public final void K() {
        this.f24443s = true;
    }

    public final gm0 L() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        org.telegram.ui.Cells.t5 t5Var = new org.telegram.ui.Cells.t5(this.f24438c, chatAttachAlertPhotoLayout.f30573a);
        if (this == chatAttachAlertPhotoLayout.G) {
            t5Var.setOutlineProvider(new ym(this));
            t5Var.setClipToOutline(true);
        }
        t5Var.setFastScrollDelegate(new s(this, 22));
        t5Var.setDelegate(new y2(6, this, t5Var));
        return new s4.d1(t5Var);
    }

    public final MediaController.PhotoEntry M(int i10) {
        boolean z10 = this.f24440f;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        if (z10 && i10 > chatAttachAlertPhotoLayout.M0) {
            i10--;
        }
        if (this.d && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
            i10--;
        }
        boolean z11 = ChatAttachAlertPhotoLayout.f23798q1;
        return chatAttachAlertPhotoLayout.b0(i10);
    }

    @Override
    public final int h() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        an anVar = chatAttachAlertPhotoLayout.G;
        if (!chatAttachAlertPhotoLayout.f23841v0) {
            return 1;
        }
        int i10 = 0;
        this.f24439e = false;
        this.f24440f = false;
        boolean z10 = chatAttachAlertPhotoLayout.P0;
        if (z10 && this == anVar) {
            return 2;
        }
        if (this.d && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
            this.f24439e = true;
            i10 = 1;
        }
        if (chatAttachAlertPhotoLayout.f23816g1) {
            i10++;
        }
        if (z10 && this == anVar) {
            i10++;
        }
        this.f24442r = i10;
        if (!z10) {
            i10 += ChatAttachAlertPhotoLayout.f23799r1.size();
            MediaController.AlbumEntry albumEntry = chatAttachAlertPhotoLayout.T0;
            if (albumEntry != null) {
                i10 += albumEntry.photos.size();
            }
        }
        if (this.f24439e && i10 > chatAttachAlertPhotoLayout.M0 && !chatAttachAlertPhotoLayout.O0) {
            this.f24440f = true;
            i10++;
        }
        if (this == anVar) {
            i10++;
        }
        this.f24441n = i10;
        return i10;
    }

    @Override
    public final int j(int i10) {
        int i11;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        an anVar = chatAttachAlertPhotoLayout.G;
        if (chatAttachAlertPhotoLayout.f23841v0) {
            boolean z10 = chatAttachAlertPhotoLayout.P0;
            if (z10 && this == anVar) {
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
            boolean z12 = this.f24440f;
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
            if (chatAttachAlertPhotoLayout.f23816g1 && i11 == 0) {
                return 4;
            }
            if (this == anVar && i10 == this.f24441n - 1) {
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
            f00 f00Var = chatAttachAlertPhotoLayout.H;
            if ((h() == 1 && !chatAttachAlertPhotoLayout.P0 && chatAttachAlertPhotoLayout.T0 == null) || !chatAttachAlertPhotoLayout.f23841v0) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            f00Var.setVisibility(i10);
        }
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        aj ajVar = chatAttachAlertPhotoLayout.f30574b;
        int i11 = d1Var.f47893f;
        View view = d1Var.f47889a;
        boolean z15 = this.d;
        int i12 = 0;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 3) {
                    if (i11 == 7) {
                        ((a30) view).setUseAnEmojiVisible(chatAttachAlertPhotoLayout.f23816g1);
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
        if (this.f24440f && i10 > chatAttachAlertPhotoLayout.M0) {
            i10--;
        }
        if (z15 && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
            i10--;
        }
        if (chatAttachAlertPhotoLayout.f23816g1) {
            i10--;
        }
        org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) view;
        if (this == chatAttachAlertPhotoLayout.G) {
            t5Var.setItemSize(chatAttachAlertPhotoLayout.K0);
        } else {
            if (chatAttachAlertPhotoLayout.f23837s.f47877o == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            t5Var.setIsVertical(z10);
        }
        if (ajVar.T0 == 0 && !ajVar.W0 && !ajVar.H) {
            t5Var.getCheckBox().setVisibility(0);
        } else {
            t5Var.getCheckBox().setVisibility(8);
        }
        MediaController.PhotoEntry b02 = chatAttachAlertPhotoLayout.b0(i10);
        if (b02 == null) {
            return;
        }
        HashMap hashMap = ChatAttachAlertPhotoLayout.f23800s1;
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
        if (ajVar != null && ajVar.f24351i0) {
            z14 = true;
        } else {
            z14 = false;
        }
        t5Var.d(b02, z11, z12, z13, z14);
        if ((ajVar.f24342f0 instanceof org.telegram.ui.eo) && ajVar.W1) {
            t5Var.b(ChatAttachAlertPhotoLayout.f23801t1.indexOf(Integer.valueOf(b02.imageId)), hashMap.containsKey(Integer.valueOf(b02.imageId)), false);
        } else {
            t5Var.b(-1, hashMap.containsKey(Integer.valueOf(b02.imageId)), false);
        }
        if (!chatAttachAlertPhotoLayout.f23843w0 && b02.isVideo) {
            t5Var.setAlpha(0.3f);
        } else if (!chatAttachAlertPhotoLayout.f23845x0 && !b02.isVideo) {
            t5Var.setAlpha(0.3f);
        } else {
            t5Var.setAlpha(1.0f);
        }
        t5Var.getImageView().setTag(Integer.valueOf(i10));
        t5Var.setTag(Integer.valueOf(i10));
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        aj ajVar = chatAttachAlertPhotoLayout.f30574b;
        org.telegram.ui.ActionBar.c6 c6Var = chatAttachAlertPhotoLayout.f30573a;
        if (i10 != 0) {
            Context context = this.f24438c;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            if (i10 != 7) {
                                if (i10 != 8) {
                                    ?? frameLayout = new FrameLayout(context);
                                    ImageView imageView = new ImageView(context);
                                    frameLayout.f22284a = imageView;
                                    ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
                                    imageView.setScaleType(scaleType);
                                    int w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20506aa, c6Var);
                                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                                    imageView.setColorFilter(new PorterDuffColorFilter(w02, mode));
                                    frameLayout.addView(imageView, w7.w5.a(44.0f, 5.0f, 0.0f, 0.0f, 27.0f, 44, 17));
                                    ImageView imageView2 = new ImageView(context);
                                    frameLayout.f22285b = imageView2;
                                    imageView2.setScaleType(scaleType);
                                    imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20526ba, c6Var), mode));
                                    frameLayout.addView(imageView2, w7.w5.a(44.0f, 5.0f, 0.0f, 0.0f, 27.0f, 44, 17));
                                    TextView textView = new TextView(context);
                                    frameLayout.f22286c = textView;
                                    org.telegram.messenger.am.o(org.telegram.ui.ActionBar.h6.f20546ca, c6Var, textView, 1, 12.0f);
                                    textView.setGravity(17);
                                    frameLayout.addView(textView, w7.w5.a(-2.0f, 5.0f, 13.0f, 5.0f, 0.0f, -2, 17));
                                    frameLayout.d = AndroidUtilities.dp(80.0f);
                                    return new s4.d1(frameLayout);
                                }
                                FrameLayout frameLayout2 = new FrameLayout(context);
                                frameLayout2.setLayoutParams(new s4.q0(-1, AndroidUtilities.dp(56.0f)));
                                ci.d dVar = new ci.d(context, c6Var, true);
                                dVar.setUseWrapContent(true);
                                dVar.e();
                                dVar.setPadding(AndroidUtilities.dp(28.0f), 0, AndroidUtilities.dp(28.0f), 0);
                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("c");
                                spannableStringBuilder.setSpan(new gr(R.drawable.camera, 0), 0, 1, 33);
                                spannableStringBuilder.append((CharSequence) "  ").append((CharSequence) LocaleController.getString(R.string.GalleryAccessAllowAccessCamera));
                                dVar.g(spannableStringBuilder, false, true);
                                frameLayout2.addView(dVar, w7.w5.a(44.0f, 10.0f, 0.0f, 10.0f, 12.0f, -2, 81));
                                return new s4.d1(frameLayout2);
                            }
                            a30 a30Var = new a30(context, ajVar.M1);
                            a30Var.setLayoutParams(new s4.q0(-1, AndroidUtilities.dp(400.0f)));
                            a30Var.setGravity(17);
                            a30Var.isClickable();
                            a30Var.f24225b.setOnClickListener(new f0(new em(chatAttachAlertPhotoLayout, 5), 17));
                            a30Var.f24224a.setOnClickListener(new f0(new em(chatAttachAlertPhotoLayout, 6), 18));
                            a30Var.f24226c.setOnClickListener(new wt(5, a30Var, new a3(this, 2)));
                            return new s4.d1(a30Var);
                        }
                        return new s4.d1(new View(context));
                    }
                    ajVar.getClass();
                    return new s4.d1(new zm(this, context));
                }
                return new s4.d1(new ci.bb(this, context, 13));
            }
            ?? view = new View(context);
            view.setFocusable(true);
            view.f22225a = AndroidUtilities.dp(0.0f);
            return new s4.d1(view);
        }
        ArrayList arrayList = this.h;
        if (!arrayList.isEmpty()) {
            gm0 gm0Var = (gm0) arrayList.get(0);
            arrayList.remove(0);
            return gm0Var;
        }
        return L();
    }

    @Override
    public final void y(s4.d1 d1Var) {
        if (d1Var.f47889a instanceof org.telegram.ui.Cells.m5) {
            this.v.Q.g();
        }
    }
}
