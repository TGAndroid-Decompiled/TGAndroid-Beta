package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_aicompose;
public final class o implements View.OnClickListener {
    public final int f36430a;
    public final r f36431b;

    public o(r rVar, int i7) {
        this.f36430a = i7;
        this.f36431b = rVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f36430a) {
            case 0:
                this.f36431b.dismiss();
                return;
            default:
                r rVar = this.f36431b;
                TL_aicompose.AiComposeTone aiComposeTone = rVar.S1;
                if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
                    int i7 = rVar.f37433c2 + 1;
                    rVar.f37433c2 = i7;
                    TL_aicompose.aiComposeToneExample[] aicomposetoneexampleArr = rVar.d2;
                    if (i7 >= aicomposetoneexampleArr.length) {
                        rVar.f37433c2 = 0;
                    }
                    int i10 = rVar.f37433c2;
                    if (aicomposetoneexampleArr[i10] == null) {
                        TL_aicompose.getToneExample gettoneexample = new TL_aicompose.getToneExample();
                        gettoneexample.tone = TL_aicompose.InputAiComposeTone.from(aiComposeTone);
                        gettoneexample.num = i10;
                        ConnectionsManager.getInstance(rVar.f28669a).sendRequestTyped(gettoneexample, new d3.b(1), new p(rVar, i10, 0));
                    }
                    rVar.f37432b2.O(true);
                    return;
                }
                return;
        }
    }
}
