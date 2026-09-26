package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class c8 extends GestureDetector.SimpleOnGestureListener {
    public final Context f32592a;
    public final e8 f32593b;

    public c8(e8 e8Var, Context context) {
        this.f32593b = e8Var;
        this.f32592a = context;
    }

    public final f8 a(float f7, float f10) {
        f8 f8Var;
        e8 e8Var = this.f32593b;
        if (e8Var.f33291n == null) {
            return null;
        }
        int i10 = e8Var.e;
        float measuredWidth = e8Var.getMeasuredWidth() / 7.0f;
        float dp = AndroidUtilities.dp(52.0f);
        int dp2 = AndroidUtilities.dp(44.0f) / 2;
        int i11 = 0;
        for (int i12 = 0; i12 < e8Var.d; i12++) {
            float f11 = (measuredWidth / 2.0f) + (i10 * measuredWidth);
            float dp3 = (dp / 2.0f) + (i11 * dp) + AndroidUtilities.dp(44.0f);
            float f12 = dp2;
            if (f7 >= f11 - f12 && f7 <= f11 + f12 && f10 >= dp3 - f12 && f10 <= dp3 + f12 && (f8Var = (f8) e8Var.f33291n.get(i12, null)) != null) {
                return f8Var;
            }
            i10++;
            if (i10 >= 7) {
                i11++;
                i10 = 0;
            }
        }
        return null;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
        final f8 a2;
        super.onLongPress(motionEvent);
        e8 e8Var = this.f32593b;
        h8 h8Var = e8Var.f33295x;
        if (h8Var.f34144e0 == 0 && !AndroidUtilities.isTablet() && (a2 = a(motionEvent.getX(), motionEvent.getY())) != null) {
            try {
                e8Var.performHapticFeedback(0);
            } catch (Exception unused) {
            }
            Bundle bundle = new Bundle();
            long j3 = h8Var.f34157x;
            if (j3 > 0) {
                bundle.putLong("user_id", j3);
            } else {
                bundle.putLong("chat_id", -j3);
            }
            bundle.putInt("start_from_date", a2.h);
            bundle.putBoolean("need_remove_previous_same_chat_activity", false);
            wn wnVar = new wn(bundle);
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 0, h8Var.getParentActivity(), h8Var.getResourceProvider());
            actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(h8Var.getThemedColor(org.telegram.ui.ActionBar.h6.G8));
            org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(h8Var.getParentActivity(), true, false);
            e1Var.g(LocaleController.getString(R.string.JumpToDate), R.drawable.msg_message, null);
            e1Var.setMinimumWidth(160);
            e1Var.setOnClickListener(new View.OnClickListener(this) {
                public final c8 f40397b;

                {
                    this.f40397b = this;
                }

                @Override
                public final void onClick(View view) {
                    org.telegram.ui.ActionBar.b5 b5Var;
                    org.telegram.ui.ActionBar.b5 b5Var2;
                    org.telegram.ui.ActionBar.b5 b5Var3;
                    org.telegram.ui.ActionBar.b5 b5Var4;
                    switch (r3) {
                        case 0:
                            c8 c8Var = this.f40397b;
                            h8 h8Var2 = c8Var.f32593b.f33295x;
                            b5Var = ((org.telegram.ui.ActionBar.m2) h8Var2).parentLayout;
                            if (b5Var != null) {
                                b5Var2 = ((org.telegram.ui.ActionBar.m2) h8Var2).parentLayout;
                                if (b5Var2.getFragmentStack().size() >= 3) {
                                    b5Var3 = ((org.telegram.ui.ActionBar.m2) h8Var2).parentLayout;
                                    List fragmentStack = b5Var3.getFragmentStack();
                                    b5Var4 = ((org.telegram.ui.ActionBar.m2) h8Var2).parentLayout;
                                    org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) fragmentStack.get(b5Var4.getFragmentStack().size() - 3);
                                    if (m2Var instanceof wn) {
                                        AndroidUtilities.runOnUIThread(new r1(c8Var, (wn) m2Var, a2, 5), 300L);
                                    }
                                }
                            }
                            h8Var2.finishPreviewFragment();
                            return;
                        default:
                            e8 e8Var2 = this.f40397b.f32593b;
                            h8 h8Var3 = e8Var2.f33295x;
                            int i10 = a2.h;
                            h8Var3.Q = i10;
                            h8Var3.P = i10;
                            h8Var3.G = true;
                            h8Var3.t0();
                            h8 h8Var4 = e8Var2.f33295x;
                            h8Var4.o0();
                            h8Var4.finishPreviewFragment();
                            return;
                    }
                }
            });
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(e1Var);
            if (h8Var.f34143d0) {
                org.telegram.ui.ActionBar.e1 e1Var2 = new org.telegram.ui.ActionBar.e1(h8Var.getParentActivity(), false, false);
                e1Var2.g(LocaleController.getString(R.string.SelectThisDay), R.drawable.msg_select, null);
                e1Var2.setMinimumWidth(160);
                e1Var2.setOnClickListener(new View.OnClickListener(this) {
                    public final c8 f40397b;

                    {
                        this.f40397b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        org.telegram.ui.ActionBar.b5 b5Var;
                        org.telegram.ui.ActionBar.b5 b5Var2;
                        org.telegram.ui.ActionBar.b5 b5Var3;
                        org.telegram.ui.ActionBar.b5 b5Var4;
                        switch (r3) {
                            case 0:
                                c8 c8Var = this.f40397b;
                                h8 h8Var2 = c8Var.f32593b.f33295x;
                                b5Var = ((org.telegram.ui.ActionBar.m2) h8Var2).parentLayout;
                                if (b5Var != null) {
                                    b5Var2 = ((org.telegram.ui.ActionBar.m2) h8Var2).parentLayout;
                                    if (b5Var2.getFragmentStack().size() >= 3) {
                                        b5Var3 = ((org.telegram.ui.ActionBar.m2) h8Var2).parentLayout;
                                        List fragmentStack = b5Var3.getFragmentStack();
                                        b5Var4 = ((org.telegram.ui.ActionBar.m2) h8Var2).parentLayout;
                                        org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) fragmentStack.get(b5Var4.getFragmentStack().size() - 3);
                                        if (m2Var instanceof wn) {
                                            AndroidUtilities.runOnUIThread(new r1(c8Var, (wn) m2Var, a2, 5), 300L);
                                        }
                                    }
                                }
                                h8Var2.finishPreviewFragment();
                                return;
                            default:
                                e8 e8Var2 = this.f40397b.f32593b;
                                h8 h8Var3 = e8Var2.f33295x;
                                int i10 = a2.h;
                                h8Var3.Q = i10;
                                h8Var3.P = i10;
                                h8Var3.G = true;
                                h8Var3.t0();
                                h8 h8Var4 = e8Var2.f33295x;
                                h8Var4.o0();
                                h8Var4.finishPreviewFragment();
                                return;
                        }
                    }
                });
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(e1Var2);
                org.telegram.ui.ActionBar.e1 e1Var3 = new org.telegram.ui.ActionBar.e1(h8Var.getParentActivity(), false, true);
                e1Var3.g(LocaleController.getString(R.string.ClearHistory), R.drawable.msg_delete, null);
                e1Var3.setMinimumWidth(160);
                e1Var3.setOnClickListener(new View.OnClickListener(this) {
                    public final c8 f32070b;

                    {
                        this.f32070b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        org.telegram.ui.ActionBar.b5 b5Var;
                        org.telegram.ui.ActionBar.b5 b5Var2;
                        org.telegram.ui.ActionBar.b5 b5Var3;
                        switch (r2) {
                            case 0:
                                c8 c8Var = this.f32070b;
                                h8 h8Var2 = c8Var.f32593b.f33295x;
                                b5Var = ((org.telegram.ui.ActionBar.m2) h8Var2).parentLayout;
                                if (b5Var.getFragmentStack().size() >= 3) {
                                    b5Var2 = ((org.telegram.ui.ActionBar.m2) h8Var2).parentLayout;
                                    List fragmentStack = b5Var2.getFragmentStack();
                                    b5Var3 = ((org.telegram.ui.ActionBar.m2) h8Var2).parentLayout;
                                    org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) fragmentStack.get(b5Var3.getFragmentStack().size() - 3);
                                    if (m2Var instanceof wn) {
                                        org.telegram.ui.Components.e5.r(h8Var2, 1, h8Var2.getMessagesController().getUser(Long.valueOf(h8Var2.f34157x)), null, false, new b8(c8Var, (wn) m2Var), null);
                                    }
                                }
                                h8Var2.finishPreviewFragment();
                                return;
                            default:
                                this.f32070b.f32593b.f33295x.finishPreviewFragment();
                                return;
                        }
                    }
                });
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(e1Var3);
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
            h8Var.v = new ci.bb(this, this.f32592a, 10);
            h8Var.v.setOnClickListener(new View.OnClickListener(this) {
                public final c8 f32070b;

                {
                    this.f32070b = this;
                }

                @Override
                public final void onClick(View view) {
                    org.telegram.ui.ActionBar.b5 b5Var;
                    org.telegram.ui.ActionBar.b5 b5Var2;
                    org.telegram.ui.ActionBar.b5 b5Var3;
                    switch (r2) {
                        case 0:
                            c8 c8Var = this.f32070b;
                            h8 h8Var2 = c8Var.f32593b.f33295x;
                            b5Var = ((org.telegram.ui.ActionBar.m2) h8Var2).parentLayout;
                            if (b5Var.getFragmentStack().size() >= 3) {
                                b5Var2 = ((org.telegram.ui.ActionBar.m2) h8Var2).parentLayout;
                                List fragmentStack = b5Var2.getFragmentStack();
                                b5Var3 = ((org.telegram.ui.ActionBar.m2) h8Var2).parentLayout;
                                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) fragmentStack.get(b5Var3.getFragmentStack().size() - 3);
                                if (m2Var instanceof wn) {
                                    org.telegram.ui.Components.e5.r(h8Var2, 1, h8Var2.getMessagesController().getUser(Long.valueOf(h8Var2.f34157x)), null, false, new b8(c8Var, (wn) m2Var), null);
                                }
                            }
                            h8Var2.finishPreviewFragment();
                            return;
                        default:
                            this.f32070b.f32593b.f33295x.finishPreviewFragment();
                            return;
                    }
                }
            });
            h8Var.v.setVisibility(8);
            h8Var.v.setFitsSystemWindows(true);
            h8.a0(h8Var).getOverlayContainerView().addView(h8Var.v, w7.y5.c(-1.0f, -1));
            h8.b0(h8Var);
            h8Var.presentFragmentAsPreviewWithMenu(wnVar, actionBarPopupWindow$ActionBarPopupWindowLayout);
        }
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        f8 a2;
        MessageObject messageObject;
        ka.c cVar;
        e8 e8Var = this.f32593b;
        h8 h8Var = e8Var.f33295x;
        if (h8.V(h8Var) != null) {
            if (((h8Var.f34144e0 == 1 && e8Var.f33291n != null) || h8Var.f34146f0 != null) && (a2 = a(motionEvent.getX(), motionEvent.getY())) != null && (messageObject = a2.f33564a) != null && (cVar = h8Var.M) != null) {
                if (h8Var.f34146f0 != null) {
                    ai.jc orCreateStoryViewer = h8Var.getOrCreateStoryViewer();
                    Context context = e8Var.getContext();
                    MessageObject messageObject2 = a2.f33564a;
                    TL_stories.StoryItem storyItem = messageObject2.storyItem;
                    int id2 = messageObject2.getId();
                    ai.d9 d9Var = h8Var.f34146f0;
                    g gVar = h8Var.f34147g0;
                    orCreateStoryViewer.h = UserConfig.selectedAccount;
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Long.valueOf(d9Var.d));
                    orCreateStoryViewer.P0 = id2;
                    orCreateStoryViewer.G(context, storyItem, arrayList, 0, d9Var, null, gVar, true);
                } else {
                    int id3 = messageObject.getId();
                    int i10 = a2.f33566c;
                    org.telegram.ui.Components.jv0 jv0Var = (org.telegram.ui.Components.jv0) cVar.f13552b;
                    int i11 = -1;
                    for (int i12 = 0; i12 < jv0Var.f25555t1[0].f30692a.size(); i12++) {
                        if (((MessageObject) jv0Var.f25555t1[0].f30692a.get(i12)).getId() == id3) {
                            i11 = i12;
                        }
                    }
                    org.telegram.ui.Components.cu0 W = jv0Var.W(0);
                    if (i11 >= 0 && W != null) {
                        W.f23402x.h1(i11, 0);
                    } else {
                        jv0Var.y0(0, id3, i10, true);
                    }
                    if (W != null) {
                        W.J = id3;
                        W.K = false;
                    }
                    h8Var.finishFragment();
                }
            }
            if (e8Var.f33291n != null) {
                if (h8Var.G) {
                    f8 a10 = a(motionEvent.getX(), motionEvent.getY());
                    if (a10 != null) {
                        ValueAnimator valueAnimator = h8Var.R;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            h8Var.R = null;
                        }
                        int i13 = h8Var.P;
                        if (i13 == 0 && h8Var.Q == 0) {
                            int i14 = a10.h;
                            h8Var.Q = i14;
                            h8Var.P = i14;
                        } else {
                            int i15 = a10.h;
                            if (i13 == i15 && h8Var.Q == i15) {
                                h8Var.Q = 0;
                                h8Var.P = 0;
                            } else if (i13 == i15) {
                                h8Var.P = h8Var.Q;
                            } else {
                                int i16 = h8Var.Q;
                                if (i16 == i15) {
                                    h8Var.Q = i13;
                                } else if (i13 == i16) {
                                    if (i15 > i16) {
                                        h8Var.Q = i15;
                                    } else {
                                        h8Var.P = i15;
                                    }
                                } else {
                                    h8Var.Q = i15;
                                    h8Var.P = i15;
                                }
                            }
                        }
                        h8Var.t0();
                        h8Var.o0();
                        return false;
                    }
                } else {
                    f8 a11 = a(motionEvent.getX(), motionEvent.getY());
                    if (a11 != null && h8.W(h8Var) != null && h8.X(h8Var).getFragmentStack().size() >= 2) {
                        org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) h8.Z(h8Var).getFragmentStack().get(h8.Y(h8Var).getFragmentStack().size() - 2);
                        if (m2Var instanceof wn) {
                            h8Var.finishFragment();
                            ((wn) m2Var).G9(a11.h);
                            return false;
                        }
                    } else if (a11 != null && h8Var.N != null) {
                        h8Var.finishFragment();
                        h8Var.N.G9(a11.h);
                    }
                }
            }
        }
        return false;
    }
}
