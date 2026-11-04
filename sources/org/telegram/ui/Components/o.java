package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_aicompose;
public final class o implements View.OnClickListener {
    public final int f36665a;
    public final r f36666b;

    public o(r rVar, int i3) {
        this.f36665a = i3;
        this.f36666b = rVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f36665a) {
            case 0:
                this.f36666b.dismiss();
                return;
            default:
                r rVar = this.f36666b;
                TL_aicompose.AiComposeTone aiComposeTone = rVar.Q1;
                if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
                    int i3 = rVar.f37578a2 + 1;
                    rVar.f37578a2 = i3;
                    TL_aicompose.aiComposeToneExample[] aicomposetoneexampleArr = rVar.f37579b2;
                    if (i3 >= aicomposetoneexampleArr.length) {
                        rVar.f37578a2 = 0;
                    }
                    int i10 = rVar.f37578a2;
                    if (aicomposetoneexampleArr[i10] == null) {
                        TL_aicompose.getToneExample gettoneexample = new TL_aicompose.getToneExample();
                        gettoneexample.tone = TL_aicompose.InputAiComposeTone.from(aiComposeTone);
                        gettoneexample.num = i10;
                        ConnectionsManager.getInstance(rVar.f28583a).sendRequestTyped(gettoneexample, new c3.b(1), new p(rVar, i10, 0));
                    }
                    rVar.Z1.O(true);
                    return;
                }
                return;
        }
    }
}
