package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
public abstract class q7 extends FrameLayout implements org.telegram.ui.Components.hc0 {
    public final ArrayList f41547a;
    public final org.telegram.ui.Components.y71 f41548b;
    public final View f41549c;
    public final org.telegram.ui.ActionBar.o2 d;
    public final ArrayList f41550e;
    public kh.b f41551f;
    public final org.telegram.ui.Components.z71 h;
    public final p7[] f41552n;
    public f7 f41553r;
    public int f41554s;
    public g7 v;

    public q7(Context context, org.telegram.ui.ActionBar.o2 o2Var) {
        super(context);
        this.f41547a = new ArrayList();
        this.f41550e = new ArrayList();
        p7[] p7VarArr = new p7[5];
        this.f41552n = p7VarArr;
        this.d = o2Var;
        p7VarArr[0] = new p7(LocaleController.getString(R.string.FilterChats), 0, new h7(this));
        p7VarArr[1] = new p7(LocaleController.getString(R.string.MediaTab), 1, new m7(this));
        p7VarArr[2] = new p7(LocaleController.getString(R.string.SharedFilesTab2), 2, new j7(this));
        p7VarArr[3] = new p7(LocaleController.getString(R.string.Music), 3, new o7(this));
        int i10 = 0;
        while (true) {
            p7[] p7VarArr2 = this.f41552n;
            if (i10 < p7VarArr2.length) {
                p7 p7Var = p7VarArr2[i10];
                if (p7Var != null) {
                    this.f41550e.add(i10, p7Var);
                }
                i10++;
            } else {
                org.telegram.ui.Components.z71 z71Var = new org.telegram.ui.Components.z71(getContext(), null);
                this.h = z71Var;
                z71Var.setAllowDisallowInterceptTouch(false);
                addView(z71Var, i7.f6.d(-1, -1.0f, 0, 0.0f, 48.0f, 0.0f, 0.0f));
                org.telegram.ui.Components.y71 n10 = z71Var.n(3, true);
                this.f41548b = n10;
                addView(n10, i7.f6.c(48.0f, -1));
                View view = new View(getContext());
                this.f41549c = view;
                view.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23063d7, false));
                addView(view, i7.f6.d(-1, 1.0f, 0, 0.0f, 48.0f, 0.0f, 0.0f));
                view.getLayoutParams().height = 1;
                z71Var.setAdapter(new c7(this, context, o2Var));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23062d6, false));
                linearLayout.setAlpha(0.0f);
                linearLayout.setClickable(true);
                addView(linearLayout, i7.f6.c(48.0f, -1));
                AndroidUtilities.updateViewVisibilityAnimated(linearLayout, false, 1.0f, false);
                ImageView imageView = new ImageView(context);
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                org.telegram.ui.ActionBar.h2 h2Var = new org.telegram.ui.ActionBar.h2(true);
                imageView.setImageDrawable(h2Var);
                int i11 = org.telegram.ui.ActionBar.g6.y8;
                h2Var.a(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
                int i12 = org.telegram.ui.ActionBar.g6.f23452z8;
                imageView.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.w0(null, i12, false), 1, -1));
                imageView.setContentDescription(LocaleController.getString(R.string.Close));
                linearLayout.addView(imageView, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
                this.f41547a.add(imageView);
                imageView.setOnClickListener(new View.OnClickListener(this) {
                    public final q7 f44754b;

                    {
                        this.f44754b = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (r2) {
                            case 0:
                                this.f44754b.v.o1();
                                return;
                            default:
                                this.f44754b.v.clear();
                                return;
                        }
                    }
                });
                org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(context, true, true, true);
                o6Var.setTextSize(AndroidUtilities.dp(18.0f));
                o6Var.setTypeface(AndroidUtilities.bold());
                o6Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
                linearLayout.addView(o6Var, i7.f6.m(1.0f, 0, -1, 18, 0, 0));
                this.f41547a.add(o6Var);
                org.telegram.ui.ActionBar.w0 w0Var = new org.telegram.ui.ActionBar.w0(context, null, org.telegram.ui.ActionBar.g6.w0(null, i12, false), org.telegram.ui.ActionBar.g6.w0(null, i11, false), false, null);
                w0Var.setIcon(R.drawable.msg_clear);
                w0Var.setContentDescription(LocaleController.getString(R.string.Delete));
                w0Var.setDuplicateParentStateEnabled(false);
                linearLayout.addView(w0Var, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
                this.f41547a.add(w0Var);
                w0Var.setOnClickListener(new View.OnClickListener(this) {
                    public final q7 f44754b;

                    {
                        this.f44754b = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (r2) {
                            case 0:
                                this.f44754b.v.o1();
                                return;
                            default:
                                this.f44754b.v.clear();
                                return;
                        }
                    }
                });
                return;
            }
        }
    }

    public static void a(q7 q7Var, k7 k7Var, m7 m7Var, org.telegram.ui.Components.jl0 jl0Var) {
        ArrayList arrayList = m7Var.f37378e;
        PhotoViewer.t1().K2(null, q7Var.d, null);
        if (q7Var.f41553r == null) {
            q7Var.f41553r = new f7(q7Var);
        }
        q7Var.f41553r.f38008a = jl0Var;
        if (arrayList.indexOf(k7Var) >= 0) {
            PhotoViewer.t1().f2(m7Var.f40477r, arrayList.indexOf(k7Var), -1, false, q7Var.f41553r, null);
        }
    }

    public static void b(q7 q7Var, kh.a aVar, i7 i7Var) {
        boolean z10;
        org.telegram.ui.ActionBar.o2 o2Var = q7Var.d;
        org.telegram.ui.Components.jl0 jl0Var = (org.telegram.ui.Components.jl0) q7Var.h.getCurrentView();
        if (i7Var.f39139e == 2) {
            if (jl0Var.getAdapter() instanceof j7) {
                j7 j7Var = (j7) jl0Var.getAdapter();
                PhotoViewer.t1().K2(null, o2Var, null);
                if (q7Var.f41553r == null) {
                    q7Var.f41553r = new f7(q7Var);
                }
                q7Var.f41553r.f38008a = jl0Var;
                File file = aVar.f13889a;
                String lowerCase = file.getName().toLowerCase();
                if (!file.getName().endsWith("mp4") && !file.getName().endsWith(".jpg") && !lowerCase.endsWith(".jpeg") && !lowerCase.endsWith(".png") && !lowerCase.endsWith(".gif")) {
                    AndroidUtilities.openForView(file, file.getName(), null, o2Var.getParentActivity(), null, false);
                } else {
                    ArrayList arrayList = new ArrayList();
                    String path = file.getPath();
                    if (aVar.d == 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    arrayList.add(new MediaController.PhotoEntry(0, 0, 0L, path, 0, z10, 0, 0, 0L));
                    PhotoViewer.t1().f2(arrayList, 0, -1, false, q7Var.f41553r, null);
                }
            } else {
                return;
            }
        }
        if (i7Var.f39139e == 3) {
            if (MediaController.getInstance().isPlayingMessage(aVar.f13893f)) {
                if (!MediaController.getInstance().isMessagePaused()) {
                    MediaController.getInstance().lambda$startAudioAgain$7(aVar.f13893f);
                    return;
                } else {
                    MediaController.getInstance().playMessage(aVar.f13893f);
                    return;
                }
            }
            MediaController.getInstance().playMessage(aVar.f13893f);
        }
    }

    public final void c() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.q7.c():void");
    }

    public final void d() {
        int i10 = 0;
        while (true) {
            org.telegram.ui.Components.z71 z71Var = this.h;
            if (i10 < z71Var.getViewPages().length) {
                AndroidUtilities.updateVisibleRows((org.telegram.ui.Components.jl0) z71Var.getViewPages()[i10]);
                i10++;
            } else {
                return;
            }
        }
    }

    public org.telegram.ui.Components.jl0 getListView() {
        org.telegram.ui.Components.z71 z71Var = this.h;
        if (z71Var.getCurrentView() == null) {
            return null;
        }
        return (org.telegram.ui.Components.jl0) z71Var.getCurrentView();
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824));
    }

    public void setBottomPadding(int i10) {
        this.f41554s = i10;
        int i11 = 0;
        while (true) {
            org.telegram.ui.Components.z71 z71Var = this.h;
            if (i11 < z71Var.getViewPages().length) {
                org.telegram.ui.Components.jl0 jl0Var = (org.telegram.ui.Components.jl0) z71Var.getViewPages()[i11];
                if (jl0Var != null) {
                    jl0Var.setPadding(0, 0, 0, i10);
                }
                i11++;
            } else {
                return;
            }
        }
    }

    public void setCacheModel(kh.b bVar) {
        this.f41551f = bVar;
        c();
    }

    public void setDelegate(g7 g7Var) {
        this.v = g7Var;
    }
}
