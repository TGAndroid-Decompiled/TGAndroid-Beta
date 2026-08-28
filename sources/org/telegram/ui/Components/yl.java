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
public final class yl extends gk0 {
    public final Context f34998c;
    public final boolean d;
    public boolean f34999e;
    public boolean f35000f;
    public final ArrayList h = new ArrayList(8);
    public int f35001n;
    public int f35002r;
    public boolean f35003s;
    public final ChatAttachAlertPhotoLayout v;

    public yl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, Context context, boolean z10) {
        this.v = chatAttachAlertPhotoLayout;
        this.f34998c = context;
        this.d = z10;
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        return false;
    }

    @Override
    public final boolean E(wk0 wk0Var) {
        MediaController.AlbumEntry albumEntry;
        boolean isEmpty = ChatAttachAlertPhotoLayout.f26242n1.isEmpty();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        if ((!isEmpty || ((albumEntry = chatAttachAlertPhotoLayout.P0) != null && !albumEntry.photos.isEmpty())) && chatAttachAlertPhotoLayout.f27493b.N && h() > 30) {
            return true;
        }
        return false;
    }

    @Override
    public final String F(int i9) {
        ArrayList<MediaController.PhotoEntry> arrayList;
        MediaController.PhotoEntry M = M(i9);
        if (M == null) {
            int i10 = this.f35002r;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
            if (i9 <= i10) {
                ArrayList arrayList2 = ChatAttachAlertPhotoLayout.f26242n1;
                if (!arrayList2.isEmpty()) {
                    M = (MediaController.PhotoEntry) arrayList2.get(0);
                } else {
                    MediaController.AlbumEntry albumEntry = chatAttachAlertPhotoLayout.P0;
                    if (albumEntry != null && (arrayList = albumEntry.photos) != null) {
                        M = arrayList.get(0);
                    }
                }
            } else if (!chatAttachAlertPhotoLayout.P0.photos.isEmpty()) {
                M = (MediaController.PhotoEntry) j3.r0.j(1, chatAttachAlertPhotoLayout.P0.photos);
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
    public final void G(wk0 wk0Var, float f10, int[] iArr) {
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        int measuredHeight = wk0Var.getChildAt(0).getMeasuredHeight();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        float ceil = (((int) (Math.ceil(h() / chatAttachAlertPhotoLayout.I0) * measuredHeight)) - (wk0Var.getMeasuredHeight() - currentActionBarHeight)) * f10;
        float f11 = measuredHeight;
        iArr[0] = ((int) (ceil / f11)) * chatAttachAlertPhotoLayout.I0;
        int paddingTop = wk0Var.getPaddingTop() + ((int) (ceil % f11)) + ((int) ((1.0f - f10) * currentActionBarHeight));
        iArr[1] = paddingTop;
        if (iArr[0] == 0 && paddingTop < chatAttachAlertPhotoLayout.getListTopPadding()) {
            iArr[1] = chatAttachAlertPhotoLayout.getListTopPadding() + currentActionBarHeight;
        }
    }

    @Override
    public final float H(wk0 wk0Var) {
        int i9 = this.v.I0;
        int ceil = (int) Math.ceil(this.f35001n / i9);
        if (wk0Var.getChildCount() != 0) {
            int measuredHeight = wk0Var.getChildAt(0).getMeasuredHeight();
            View childAt = wk0Var.getChildAt(0);
            int R = RecyclerView.R(childAt);
            if (R >= 0) {
                return Utilities.clamp((((R / i9) * measuredHeight) - childAt.getTop()) / ((ceil * measuredHeight) - (wk0Var.getMeasuredHeight() - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())), 1.0f, 0.0f);
            }
        }
        return 0.0f;
    }

    @Override
    public final void J(wk0 wk0Var) {
        this.f35003s = false;
        int childCount = wk0Var.getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            wk0Var.getChildAt(i9).invalidate();
        }
    }

    @Override
    public final void K() {
        this.f35003s = true;
    }

    public final ik0 L() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        org.telegram.ui.Cells.t5 t5Var = new org.telegram.ui.Cells.t5(this.f34998c, chatAttachAlertPhotoLayout.f27492a);
        if (this == chatAttachAlertPhotoLayout.C) {
            t5Var.setOutlineProvider(new wl(this));
            t5Var.setClipToOutline(true);
        }
        t5Var.setFastScrollDelegate(new s(this, 22));
        t5Var.setDelegate(new g1(14, this, t5Var));
        return new f2.q1(t5Var);
    }

    public final MediaController.PhotoEntry M(int i9) {
        boolean z10 = this.f35000f;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        if (z10 && i9 > chatAttachAlertPhotoLayout.I0) {
            i9--;
        }
        if (this.d && chatAttachAlertPhotoLayout.P0 == chatAttachAlertPhotoLayout.Q0) {
            i9--;
        }
        boolean z11 = ChatAttachAlertPhotoLayout.f26241m1;
        return chatAttachAlertPhotoLayout.a0(i9);
    }

    @Override
    public final int h() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        yl ylVar = chatAttachAlertPhotoLayout.C;
        if (!chatAttachAlertPhotoLayout.f26275r0) {
            return 1;
        }
        int i9 = 0;
        this.f34999e = false;
        this.f35000f = false;
        boolean z10 = chatAttachAlertPhotoLayout.L0;
        if (z10 && this == ylVar) {
            return 2;
        }
        if (this.d && chatAttachAlertPhotoLayout.P0 == chatAttachAlertPhotoLayout.Q0) {
            this.f34999e = true;
            i9 = 1;
        }
        if (chatAttachAlertPhotoLayout.f26251c1) {
            i9++;
        }
        if (z10 && this == ylVar) {
            i9++;
        }
        this.f35002r = i9;
        if (!z10) {
            i9 += ChatAttachAlertPhotoLayout.f26242n1.size();
            MediaController.AlbumEntry albumEntry = chatAttachAlertPhotoLayout.P0;
            if (albumEntry != null) {
                i9 += albumEntry.photos.size();
            }
        }
        if (this.f34999e && i9 > chatAttachAlertPhotoLayout.I0 && !chatAttachAlertPhotoLayout.K0) {
            this.f35000f = true;
            i9++;
        }
        if (this == ylVar) {
            i9++;
        }
        this.f35001n = i9;
        return i9;
    }

    @Override
    public final int j(int i9) {
        int i10;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        yl ylVar = chatAttachAlertPhotoLayout.C;
        if (chatAttachAlertPhotoLayout.f26275r0) {
            boolean z10 = chatAttachAlertPhotoLayout.L0;
            if (z10 && this == ylVar) {
                if (i9 == 0) {
                    return 7;
                }
                return 2;
            }
            boolean z11 = this.d;
            if (z11 && i9 == 0 && chatAttachAlertPhotoLayout.P0 == chatAttachAlertPhotoLayout.Q0) {
                if (!chatAttachAlertPhotoLayout.K0) {
                    return 1;
                }
                return 8;
            }
            boolean z12 = this.f35000f;
            if (z12 && i9 == chatAttachAlertPhotoLayout.I0) {
                return 5;
            }
            if (z12 && i9 > chatAttachAlertPhotoLayout.I0) {
                i10 = i9 - 1;
            } else {
                i10 = i9;
            }
            if (z11) {
                i10--;
            }
            if (chatAttachAlertPhotoLayout.f26251c1 && i10 == 0) {
                return 4;
            }
            if (this == ylVar && i9 == this.f35001n - 1) {
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
        int i9;
        super.l();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        if (this == chatAttachAlertPhotoLayout.C) {
            yy yyVar = chatAttachAlertPhotoLayout.D;
            if ((h() == 1 && !chatAttachAlertPhotoLayout.L0 && chatAttachAlertPhotoLayout.P0 == null) || !chatAttachAlertPhotoLayout.f26275r0) {
                i9 = 0;
            } else {
                i9 = 4;
            }
            yyVar.setVisibility(i9);
        }
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        ki kiVar = chatAttachAlertPhotoLayout.f27493b;
        int i10 = q1Var.f5505f;
        View view = q1Var.f5501a;
        boolean z15 = this.d;
        int i11 = 0;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 3) {
                    if (i10 == 7) {
                        ((r10) view).setUseAnEmojiVisible(chatAttachAlertPhotoLayout.f26251c1);
                        return;
                    }
                    return;
                }
                org.telegram.ui.Cells.n5 n5Var = (org.telegram.ui.Cells.n5) view;
                n5Var.setItemSize(chatAttachAlertPhotoLayout.G0);
                n5Var.setType((z15 && chatAttachAlertPhotoLayout.K0 && i9 == 0) ? 1 : 1);
                return;
            }
            ((org.telegram.ui.Cells.m5) view).setItemSize(chatAttachAlertPhotoLayout.G0);
            return;
        }
        if (this.f35000f && i9 > chatAttachAlertPhotoLayout.I0) {
            i9--;
        }
        if (z15 && chatAttachAlertPhotoLayout.P0 == chatAttachAlertPhotoLayout.Q0) {
            i9--;
        }
        if (chatAttachAlertPhotoLayout.f26251c1) {
            i9--;
        }
        org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) view;
        if (this == chatAttachAlertPhotoLayout.C) {
            t5Var.setItemSize(chatAttachAlertPhotoLayout.G0);
        } else {
            if (chatAttachAlertPhotoLayout.f26276s.f5432o == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            t5Var.setIsVertical(z10);
        }
        if (kiVar.M0 == 0 && !kiVar.P0 && !kiVar.D) {
            t5Var.getCheckBox().setVisibility(0);
        } else {
            t5Var.getCheckBox().setVisibility(8);
        }
        MediaController.PhotoEntry a02 = chatAttachAlertPhotoLayout.a0(i9);
        if (a02 == null) {
            return;
        }
        HashMap hashMap = ChatAttachAlertPhotoLayout.f26243o1;
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
        if (i9 == h() - 1) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (kiVar != null && kiVar.f30110e0) {
            z14 = true;
        } else {
            z14 = false;
        }
        t5Var.d(a02, z11, z12, z13, z14);
        if ((kiVar.f30099b0 instanceof org.telegram.ui.qn) && kiVar.P1) {
            t5Var.b(ChatAttachAlertPhotoLayout.f26244p1.indexOf(Integer.valueOf(a02.imageId)), hashMap.containsKey(Integer.valueOf(a02.imageId)), false);
        } else {
            t5Var.b(-1, hashMap.containsKey(Integer.valueOf(a02.imageId)), false);
        }
        if (!chatAttachAlertPhotoLayout.f26277s0 && a02.isVideo) {
            t5Var.setAlpha(0.3f);
        } else if (!chatAttachAlertPhotoLayout.f26278t0 && !a02.isVideo) {
            t5Var.setAlpha(0.3f);
        } else {
            t5Var.setAlpha(1.0f);
        }
        t5Var.getImageView().setTag(Integer.valueOf(i9));
        t5Var.setTag(Integer.valueOf(i9));
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        ki kiVar = chatAttachAlertPhotoLayout.f27493b;
        org.telegram.ui.ActionBar.b6 b6Var = chatAttachAlertPhotoLayout.f27492a;
        if (i9 != 0) {
            Context context = this.f34998c;
            if (i9 != 1) {
                if (i9 != 2) {
                    if (i9 != 4) {
                        if (i9 != 5) {
                            if (i9 != 7) {
                                if (i9 != 8) {
                                    ?? frameLayout = new FrameLayout(context);
                                    ImageView imageView = new ImageView(context);
                                    frameLayout.f24758a = imageView;
                                    ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
                                    imageView.setScaleType(scaleType);
                                    int v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f22950aa, b6Var);
                                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                                    imageView.setColorFilter(new PorterDuffColorFilter(v02, mode));
                                    frameLayout.addView(imageView, g7.e6.d(44, 44.0f, 17, 5.0f, 0.0f, 0.0f, 27.0f));
                                    ImageView imageView2 = new ImageView(context);
                                    frameLayout.f24759b = imageView2;
                                    imageView2.setScaleType(scaleType);
                                    imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.ba, b6Var), mode));
                                    frameLayout.addView(imageView2, g7.e6.d(44, 44.0f, 17, 5.0f, 0.0f, 0.0f, 27.0f));
                                    TextView textView = new TextView(context);
                                    frameLayout.f24760c = textView;
                                    org.telegram.messenger.ll.n(org.telegram.ui.ActionBar.f6.f22987ca, b6Var, textView, 1, 12.0f);
                                    textView.setGravity(17);
                                    frameLayout.addView(textView, g7.e6.d(-2, -2.0f, 17, 5.0f, 13.0f, 5.0f, 0.0f));
                                    frameLayout.d = AndroidUtilities.dp(80.0f);
                                    return new f2.q1(frameLayout);
                                }
                                FrameLayout frameLayout2 = new FrameLayout(context);
                                frameLayout2.setLayoutParams(new f2.a1(-1, AndroidUtilities.dp(56.0f)));
                                kh.d dVar = new kh.d(context, b6Var, true);
                                dVar.setUseWrapContent(true);
                                dVar.e();
                                dVar.setPadding(AndroidUtilities.dp(28.0f), 0, AndroidUtilities.dp(28.0f), 0);
                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("c");
                                spannableStringBuilder.setSpan(new eq(R.drawable.camera, 0), 0, 1, 33);
                                spannableStringBuilder.append((CharSequence) "  ").append((CharSequence) LocaleController.getString(R.string.GalleryAccessAllowAccessCamera));
                                dVar.g(spannableStringBuilder, false, true);
                                frameLayout2.addView(dVar, g7.e6.d(-2, 44.0f, 81, 10.0f, 0.0f, 10.0f, 12.0f));
                                return new f2.q1(frameLayout2);
                            }
                            r10 r10Var = new r10(context, kiVar.F1);
                            r10Var.setLayoutParams(new f2.a1(-1, AndroidUtilities.dp(400.0f)));
                            r10Var.setGravity(17);
                            r10Var.isClickable();
                            r10Var.f32055b.setOnClickListener(new f0(new cl(chatAttachAlertPhotoLayout, 5), 18));
                            r10Var.f32054a.setOnClickListener(new f0(new cl(chatAttachAlertPhotoLayout, 6), 19));
                            r10Var.f32056c.setOnClickListener(new s2(22, r10Var, new v2(this, 2)));
                            return new f2.q1(r10Var);
                        }
                        return new f2.q1(new View(context));
                    }
                    kiVar.getClass();
                    return new f2.q1(new xl(this, context));
                }
                return new f2.q1(new fh.l2(this, context, 12));
            }
            ?? view = new View(context);
            view.setFocusable(true);
            view.f24710a = AndroidUtilities.dp(0.0f);
            return new f2.q1(view);
        }
        ArrayList arrayList = this.h;
        if (!arrayList.isEmpty()) {
            ik0 ik0Var = (ik0) arrayList.get(0);
            arrayList.remove(0);
            return ik0Var;
        }
        return L();
    }

    @Override
    public final void y(f2.q1 q1Var) {
        if (q1Var.f5501a instanceof org.telegram.ui.Cells.m5) {
            this.v.M.f();
        }
    }
}
