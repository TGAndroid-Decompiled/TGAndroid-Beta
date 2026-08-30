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
public final class e8 extends GestureDetector.SimpleOnGestureListener {
    public final Context f33926a;
    public final g8 f33927b;

    public e8(g8 g8Var, Context context) {
        this.f33927b = g8Var;
        this.f33926a = context;
    }

    public final h8 a(float f10, float f11) {
        h8 h8Var;
        g8 g8Var = this.f33927b;
        if (g8Var.f34474n == null) {
            return null;
        }
        int i10 = g8Var.e;
        float measuredWidth = g8Var.getMeasuredWidth() / 7.0f;
        float dp = AndroidUtilities.dp(52.0f);
        int dp2 = AndroidUtilities.dp(44.0f) / 2;
        int i11 = 0;
        for (int i12 = 0; i12 < g8Var.d; i12++) {
            float f12 = (measuredWidth / 2.0f) + (i10 * measuredWidth);
            float dp3 = (dp / 2.0f) + (i11 * dp) + AndroidUtilities.dp(44.0f);
            float f13 = dp2;
            if (f10 >= f12 - f13 && f10 <= f12 + f13 && f11 >= dp3 - f13 && f11 <= dp3 + f13 && (h8Var = (h8) g8Var.f34474n.get(i12, null)) != null) {
                return h8Var;
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
        final h8 a2;
        super.onLongPress(motionEvent);
        g8 g8Var = this.f33927b;
        j8 j8Var = g8Var.f34478x;
        if (j8Var.f35258b0 == 0 && !AndroidUtilities.isTablet() && (a2 = a(motionEvent.getX(), motionEvent.getY())) != null) {
            try {
                g8Var.performHapticFeedback(0);
            } catch (Exception unused) {
            }
            Bundle bundle = new Bundle();
            long j10 = j8Var.f35273x;
            if (j10 > 0) {
                bundle.putLong("user_id", j10);
            } else {
                bundle.putLong("chat_id", -j10);
            }
            bundle.putInt("start_from_date", a2.h);
            bundle.putBoolean("need_remove_previous_same_chat_activity", false);
            xn xnVar = new xn(bundle);
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 0, j8Var.getParentActivity(), j8Var.getResourceProvider());
            actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(j8Var.getThemedColor(org.telegram.ui.ActionBar.j6.G8));
            org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(j8Var.getParentActivity(), true, false);
            g1Var.g(LocaleController.getString(R.string.JumpToDate), R.drawable.msg_message, null);
            g1Var.setMinimumWidth(160);
            g1Var.setOnClickListener(new View.OnClickListener(this) {
                public final e8 f32837b;

                {
                    this.f32837b = this;
                }

                @Override
                public final void onClick(View view) {
                    org.telegram.ui.ActionBar.e5 e5Var;
                    org.telegram.ui.ActionBar.e5 e5Var2;
                    org.telegram.ui.ActionBar.e5 e5Var3;
                    org.telegram.ui.ActionBar.e5 e5Var4;
                    switch (r3) {
                        case 0:
                            e8 e8Var = this.f32837b;
                            j8 j8Var2 = e8Var.f33927b.f34478x;
                            e5Var = ((org.telegram.ui.ActionBar.p2) j8Var2).parentLayout;
                            if (e5Var != null) {
                                e5Var2 = ((org.telegram.ui.ActionBar.p2) j8Var2).parentLayout;
                                if (e5Var2.getFragmentStack().size() >= 3) {
                                    e5Var3 = ((org.telegram.ui.ActionBar.p2) j8Var2).parentLayout;
                                    List fragmentStack = e5Var3.getFragmentStack();
                                    e5Var4 = ((org.telegram.ui.ActionBar.p2) j8Var2).parentLayout;
                                    org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) fragmentStack.get(e5Var4.getFragmentStack().size() - 3);
                                    if (p2Var instanceof xn) {
                                        AndroidUtilities.runOnUIThread(new s1(e8Var, (xn) p2Var, a2, 5), 300L);
                                    }
                                }
                            }
                            j8Var2.finishPreviewFragment();
                            return;
                        default:
                            g8 g8Var2 = this.f32837b.f33927b;
                            j8 j8Var3 = g8Var2.f34478x;
                            int i10 = a2.h;
                            j8Var3.N = i10;
                            j8Var3.M = i10;
                            j8Var3.D = true;
                            j8Var3.t0();
                            j8 j8Var4 = g8Var2.f34478x;
                            j8Var4.o0();
                            j8Var4.finishPreviewFragment();
                            return;
                    }
                }
            });
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var);
            if (j8Var.f35256a0) {
                org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(j8Var.getParentActivity(), false, false);
                g1Var2.g(LocaleController.getString(R.string.SelectThisDay), R.drawable.msg_select, null);
                g1Var2.setMinimumWidth(160);
                g1Var2.setOnClickListener(new View.OnClickListener(this) {
                    public final e8 f32837b;

                    {
                        this.f32837b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        org.telegram.ui.ActionBar.e5 e5Var;
                        org.telegram.ui.ActionBar.e5 e5Var2;
                        org.telegram.ui.ActionBar.e5 e5Var3;
                        org.telegram.ui.ActionBar.e5 e5Var4;
                        switch (r3) {
                            case 0:
                                e8 e8Var = this.f32837b;
                                j8 j8Var2 = e8Var.f33927b.f34478x;
                                e5Var = ((org.telegram.ui.ActionBar.p2) j8Var2).parentLayout;
                                if (e5Var != null) {
                                    e5Var2 = ((org.telegram.ui.ActionBar.p2) j8Var2).parentLayout;
                                    if (e5Var2.getFragmentStack().size() >= 3) {
                                        e5Var3 = ((org.telegram.ui.ActionBar.p2) j8Var2).parentLayout;
                                        List fragmentStack = e5Var3.getFragmentStack();
                                        e5Var4 = ((org.telegram.ui.ActionBar.p2) j8Var2).parentLayout;
                                        org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) fragmentStack.get(e5Var4.getFragmentStack().size() - 3);
                                        if (p2Var instanceof xn) {
                                            AndroidUtilities.runOnUIThread(new s1(e8Var, (xn) p2Var, a2, 5), 300L);
                                        }
                                    }
                                }
                                j8Var2.finishPreviewFragment();
                                return;
                            default:
                                g8 g8Var2 = this.f32837b.f33927b;
                                j8 j8Var3 = g8Var2.f34478x;
                                int i10 = a2.h;
                                j8Var3.N = i10;
                                j8Var3.M = i10;
                                j8Var3.D = true;
                                j8Var3.t0();
                                j8 j8Var4 = g8Var2.f34478x;
                                j8Var4.o0();
                                j8Var4.finishPreviewFragment();
                                return;
                        }
                    }
                });
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var2);
                org.telegram.ui.ActionBar.g1 g1Var3 = new org.telegram.ui.ActionBar.g1(j8Var.getParentActivity(), false, true);
                g1Var3.g(LocaleController.getString(R.string.ClearHistory), R.drawable.msg_delete, null);
                g1Var3.setMinimumWidth(160);
                g1Var3.setOnClickListener(new View.OnClickListener(this) {
                    public final e8 f33215b;

                    {
                        this.f33215b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        org.telegram.ui.ActionBar.e5 e5Var;
                        org.telegram.ui.ActionBar.e5 e5Var2;
                        org.telegram.ui.ActionBar.e5 e5Var3;
                        switch (r2) {
                            case 0:
                                e8 e8Var = this.f33215b;
                                j8 j8Var2 = e8Var.f33927b.f34478x;
                                e5Var = ((org.telegram.ui.ActionBar.p2) j8Var2).parentLayout;
                                if (e5Var.getFragmentStack().size() >= 3) {
                                    e5Var2 = ((org.telegram.ui.ActionBar.p2) j8Var2).parentLayout;
                                    List fragmentStack = e5Var2.getFragmentStack();
                                    e5Var3 = ((org.telegram.ui.ActionBar.p2) j8Var2).parentLayout;
                                    org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) fragmentStack.get(e5Var3.getFragmentStack().size() - 3);
                                    if (p2Var instanceof xn) {
                                        org.telegram.ui.Components.z4.r(j8Var2, 1, j8Var2.getMessagesController().getUser(Long.valueOf(j8Var2.f35273x)), null, false, new d8(e8Var, (xn) p2Var), null);
                                    }
                                }
                                j8Var2.finishPreviewFragment();
                                return;
                            default:
                                this.f33215b.f33927b.f34478x.finishPreviewFragment();
                                return;
                        }
                    }
                });
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var3);
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
            j8Var.v = new eg.h0(this, this.f33926a, 5);
            j8Var.v.setOnClickListener(new View.OnClickListener(this) {
                public final e8 f33215b;

                {
                    this.f33215b = this;
                }

                @Override
                public final void onClick(View view) {
                    org.telegram.ui.ActionBar.e5 e5Var;
                    org.telegram.ui.ActionBar.e5 e5Var2;
                    org.telegram.ui.ActionBar.e5 e5Var3;
                    switch (r2) {
                        case 0:
                            e8 e8Var = this.f33215b;
                            j8 j8Var2 = e8Var.f33927b.f34478x;
                            e5Var = ((org.telegram.ui.ActionBar.p2) j8Var2).parentLayout;
                            if (e5Var.getFragmentStack().size() >= 3) {
                                e5Var2 = ((org.telegram.ui.ActionBar.p2) j8Var2).parentLayout;
                                List fragmentStack = e5Var2.getFragmentStack();
                                e5Var3 = ((org.telegram.ui.ActionBar.p2) j8Var2).parentLayout;
                                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) fragmentStack.get(e5Var3.getFragmentStack().size() - 3);
                                if (p2Var instanceof xn) {
                                    org.telegram.ui.Components.z4.r(j8Var2, 1, j8Var2.getMessagesController().getUser(Long.valueOf(j8Var2.f35273x)), null, false, new d8(e8Var, (xn) p2Var), null);
                                }
                            }
                            j8Var2.finishPreviewFragment();
                            return;
                        default:
                            this.f33215b.f33927b.f34478x.finishPreviewFragment();
                            return;
                    }
                }
            });
            j8Var.v.setVisibility(8);
            j8Var.v.setFitsSystemWindows(true);
            j8.a0(j8Var).getOverlayContainerView().addView(j8Var.v, k7.b6.c(-1.0f, -1));
            j8.b0(j8Var);
            j8Var.presentFragmentAsPreviewWithMenu(xnVar, actionBarPopupWindow$ActionBarPopupWindowLayout);
        }
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        h8 a2;
        MessageObject messageObject;
        org.telegram.ui.Cells.f1 f1Var;
        g8 g8Var = this.f33927b;
        j8 j8Var = g8Var.f34478x;
        if (j8.V(j8Var) != null) {
            if (((j8Var.f35258b0 == 1 && g8Var.f34474n != null) || j8Var.f35260c0 != null) && (a2 = a(motionEvent.getX(), motionEvent.getY())) != null && (messageObject = a2.f34779a) != null && (f1Var = j8Var.J) != null) {
                if (j8Var.f35260c0 != null) {
                    nh.i9 orCreateStoryViewer = j8Var.getOrCreateStoryViewer();
                    Context context = g8Var.getContext();
                    MessageObject messageObject2 = a2.f34779a;
                    TL_stories.StoryItem storyItem = messageObject2.storyItem;
                    int id2 = messageObject2.getId();
                    nh.l6 l6Var = j8Var.f35260c0;
                    h hVar = j8Var.f35261d0;
                    orCreateStoryViewer.h = UserConfig.selectedAccount;
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Long.valueOf(l6Var.d));
                    orCreateStoryViewer.M0 = id2;
                    orCreateStoryViewer.F(context, storyItem, arrayList, 0, l6Var, null, hVar, true);
                } else {
                    int id3 = messageObject.getId();
                    int i10 = a2.f34781c;
                    org.telegram.ui.Components.yu0 yu0Var = (org.telegram.ui.Components.yu0) f1Var.f21045b;
                    int i11 = -1;
                    for (int i12 = 0; i12 < yu0Var.f31138q1[0].f27364a.size(); i12++) {
                        if (((MessageObject) yu0Var.f31138q1[0].f27364a.get(i12)).getId() == id3) {
                            i11 = i12;
                        }
                    }
                    org.telegram.ui.Components.qt0 W = yu0Var.W(0);
                    if (i11 >= 0 && W != null) {
                        W.f28245x.h1(i11, 0);
                    } else {
                        yu0Var.y0(0, id3, i10, true);
                    }
                    if (W != null) {
                        W.G = id3;
                        W.H = false;
                    }
                    j8Var.finishFragment();
                }
            }
            if (g8Var.f34474n != null) {
                if (j8Var.D) {
                    h8 a10 = a(motionEvent.getX(), motionEvent.getY());
                    if (a10 != null) {
                        ValueAnimator valueAnimator = j8Var.O;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            j8Var.O = null;
                        }
                        int i13 = j8Var.M;
                        if (i13 == 0 && j8Var.N == 0) {
                            int i14 = a10.h;
                            j8Var.N = i14;
                            j8Var.M = i14;
                        } else {
                            int i15 = a10.h;
                            if (i13 == i15 && j8Var.N == i15) {
                                j8Var.N = 0;
                                j8Var.M = 0;
                            } else if (i13 == i15) {
                                j8Var.M = j8Var.N;
                            } else {
                                int i16 = j8Var.N;
                                if (i16 == i15) {
                                    j8Var.N = i13;
                                } else if (i13 == i16) {
                                    if (i15 > i16) {
                                        j8Var.N = i15;
                                    } else {
                                        j8Var.M = i15;
                                    }
                                } else {
                                    j8Var.N = i15;
                                    j8Var.M = i15;
                                }
                            }
                        }
                        j8Var.t0();
                        j8Var.o0();
                        return false;
                    }
                } else {
                    h8 a11 = a(motionEvent.getX(), motionEvent.getY());
                    if (a11 != null && j8.W(j8Var) != null && j8.X(j8Var).getFragmentStack().size() >= 2) {
                        org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) j8.Z(j8Var).getFragmentStack().get(j8.Y(j8Var).getFragmentStack().size() - 2);
                        if (p2Var instanceof xn) {
                            j8Var.finishFragment();
                            ((xn) p2Var).G9(a11.h);
                            return false;
                        }
                    } else if (a11 != null && j8Var.K != null) {
                        j8Var.finishFragment();
                        j8Var.K.G9(a11.h);
                    }
                }
            }
        }
        return false;
    }
}
